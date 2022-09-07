package org.matheclipse.core.builtin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.ASTElementLimitExceeded;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.eval.util.IAssumptions;
import org.matheclipse.core.eval.util.OptionArgs;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.S;
import org.matheclipse.core.expression.data.SparseArrayExpr;
import org.matheclipse.core.generic.Predicates;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IASTMutable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.ISparseArray;
import org.matheclipse.core.interfaces.ISymbol;
import it.unimi.dsi.fastutil.ints.IntList;

public class TensorFunctions {
  /**
   * See <a href="https://pangin.pro/posts/computation-in-static-initializer">Beware of computation
   * in static initializer</a>
   */
  private static class Initializer {

    private static void init() {
      S.ArrayReshape.setEvaluator(new ArrayReshape());
      S.Ordering.setEvaluator(new Ordering());
      S.HodgeDual.setEvaluator(new HodgeDual());
      S.KroneckerProduct.setEvaluator(new KroneckerProduct());
      S.LeviCivitaTensor.setEvaluator(new LeviCivitaTensor());
      S.ListConvolve.setEvaluator(new ListConvolve());
      S.ListCorrelate.setEvaluator(new ListCorrelate());
      S.TensorDimensions.setEvaluator(new TensorDimensions());
      S.TensorProduct.setEvaluator(new TensorProduct());
      S.TensorRank.setEvaluator(new TensorRank());
      S.TensorSymmetry.setEvaluator(new TensorSymmetry());
    }
  }

  /**
   *
   *
   * <pre>
   * ArrayReshape(list - of - values, list - of - dimension)
   * </pre>
   *
   * <blockquote>
   *
   * <p>
   * returns the <code>list-of-values</code> elements reshaped as nested list with dimensions
   * according to the <code>list-of-dimension</code>.
   *
   * </blockquote>
   *
   * <pre>
   * ArrayReshape(list - of - values, list - of - dimension, expr)
   * </pre>
   *
   * <blockquote>
   *
   * <p>
   * Use <code>expr</code> to fill up elements, if there are too little elements in the <code>
   * list-of-values</code>.
   *
   * </blockquote>
   *
   * <h3>Examples</h3>
   *
   * <p>
   * A list of non-negative integers is expected at position 2. The optional third argument
   * <code>x</code> is used to fill up the structure:
   *
   * <pre>
   * &gt;&gt; ArrayReshape({a, b, c, d, e, f}, {2, 3, 3, 2}, x)
   * {{{{a,b},{c,d},{e,f}},{{x,x},{x,x},{x,x}},{{x,x},{x,x},{x,x}}},{{{x,x},{x,x},{x,x}},{{x,x},{x,x},{x,x}},{{x,x},{x,x},{x,x}}}}
   * </pre>
   *
   * <p>
   * Ignore unnecessary elements
   *
   * <pre>
   * &gt;&gt; ArrayReshape(Range(1000), {3, 2, 2})
   * {{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}}}
   * </pre>
   */
  private static final class ArrayReshape extends AbstractEvaluator {
    static class Reshaper {
      final IAST list;
      final int[] dimension;
      final IExpr padding;
      int listPosition;

      public Reshaper(IAST list, int[] dimension, IExpr padding) {
        this.list = list;
        this.dimension = dimension;
        this.padding = padding;
        listPosition = 1;
      }

      /**
       * @param dimensionIndex the dimension[dimensionIndex] which should be used on this recursion
       *        level.
       * @return
       */
      public IAST recursiveCall(int dimensionIndex) {
        int dim = dimension[dimensionIndex];
        if (dimension.length == dimensionIndex + 1) {
          return F.mapRange(0, dim, i -> {
            if (list.size() <= listPosition) {
              return padding;
            }
            return list.get(listPosition++);
          });
        } else {
          return F.mapRange(0, dim, i -> recursiveCall(dimensionIndex + 1));
        }
      }
    }

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      IExpr arg1 = ast.arg1();
      if (!arg1.isList()) {
        // TODO "native" implementation for SparseArray
        arg1 = arg1.normal(false);
      }

      if (arg1.isList() && ast.arg2().isList()) {
        IAST list = (IAST) arg1;
        IAST dims = (IAST) ast.arg2();
        if (dims.size() == 1) {
          if (list.isEmpty()) {
            return F.C0;
          }
          if (list.size() > 1) {
            return list.arg1();
          }
        }
        int[] dimension = Validate.checkListOfInts(ast, dims, 1, Integer.MAX_VALUE, engine);
        if (dimension == null) {
          return F.NIL;
        }
        final IExpr padding = ast.isAST3() ? ast.arg3() : F.C0;
        return new Reshaper(list, dimension, padding).recursiveCall(0);
      }
      return F.NIL;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_2_3;
    }
  }

  private static class HodgeDual extends AbstractEvaluator {

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      IExpr tensor = ast.arg1();
      if (tensor.isList()) {
        final IntList dims = LinearAlgebra.dimensions((IAST) tensor);
        final int dimsSize = dims.size();
        if (dimsSize > 0) {
          IInteger d = F.ZZ(dims.getInt(dimsSize - 1));
          int rank = S.TensorRank.of(engine, tensor).toIntDefault();
          if (rank == 1) {

            // TODO implement for more cases
            IExpr dotProduct = engine.evaluate(F.Dot(tensor, F.LeviCivitaTensor(d)));

            // IExpr nested = engine.evaluate(F.Nest(S.Total, dotProduct, rank));
            return dotProduct; // F.Divide(dotProduct, F.Factorial(rank));
          }
        }
      }
      return F.NIL;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_1_1;
    }
  }

  private static class KroneckerProduct extends TensorProduct {

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      int argSize = ast.argSize();
      // expectedArgSize() is >= 2
      if (ast.arg1().isList() && ast.arg2().isList()) {
        try {
          IAST tensor1 = (IAST) ast.arg1();
          IntList dim1 = LinearAlgebra.dimensions(tensor1, S.List, Integer.MAX_VALUE, true);
          if (dim1.size() > 0) {
            for (int i = 2; i < ast.size(); i++) {
              IAST tensor2 = (IAST) ast.get(i);
              IntList dim2 = LinearAlgebra.dimensions(tensor2, S.List, Integer.MAX_VALUE, true);
              if (dim1.size() == dim2.size()) {
                IExpr temp = tensorProduct(tensor1, tensor2, dim1.size(), engine);
                if (temp.isList()) {
                  int r = 2;
                  if (dim2.size() > r) {
                    r = dim2.size();
                  }
                  tensor1 = (IAST) S.ArrayFlatten.of(engine, temp, F.ZZ(r)).normal(false);
                  if (tensor1.isList()) {
                    dim1 = LinearAlgebra.dimensions(tensor1, S.List);
                    if (dim1.size() > 0) {
                      if (i < argSize) {
                        if (ast.get(i + 1).isList()) {
                          continue;
                        }
                      } else {
                        return tensor1;
                      }
                    }
                  }
                  IASTAppendable result = F.ast(S.KroneckerProduct);
                  result.append(temp);
                  result.appendAll(ast, i + 1, ast.size());
                  return result;
                }
              }
              if (i == 2) {
                return F.NIL;
              }

              IASTAppendable result = F.ast(S.KroneckerProduct);
              result.append(tensor1);
              result.appendAll(ast, i, ast.size());
              return result;
            }
            return tensor1;
          }
        } catch (IllegalArgumentException iae) {
          // print message: Nonrectangular tensor encountered
          return IOFunctions.printMessage(ast.topHead(), "rect", F.list(ast), engine);
        }
      }
      return F.NIL;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_2_INFINITY;
    }

  }

  private static class LeviCivitaTensor extends AbstractEvaluator {

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      IExpr arg1 = ast.arg1();
      int n = arg1.toIntDefault();
      if (n <= 0) {
        if (!arg1.isInteger()) {
          return F.NIL;
        }
        // Positive machine-sized integer expected at position `2` in `1`.
        return IOFunctions.printMessage(ast.topHead(), "intpm", F.list(ast, F.C1), engine);
      }

      double value = n;
      double max = Math.pow(value, value);
      if (Double.isNaN(max) || Double.isInfinite(max)) {
        ASTElementLimitExceeded.throwIt(Config.MAX_AST_SIZE);
      }
      if (Config.MAX_AST_SIZE < max) {
        ASTElementLimitExceeded.throwIt((int) max);
      }

      IAST nCopies = F.constantArray(F.ZZ(n), n);
      // TODO improve performance by directly transforming to sparse array
      IExpr leviCivitaNormalForm =
          S.Array.of(engine, F.Function(F.Signature(F.list(F.SlotSequence(1)))), nCopies);
      if (leviCivitaNormalForm.isList()) {
        return SparseArrayExpr.newDenseList((IAST) leviCivitaNormalForm, F.C0);
      }
      return leviCivitaNormalForm;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_1_1;
    }
  }

  /**
   *
   *
   * <pre>
   * ListConvolve(kernel - list, tensor - list)
   * </pre>
   *
   * <blockquote>
   *
   * <p>
   * create the convolution of the <code>kernel-list</code> with <code>tensor-list</code>.
   *
   * </blockquote>
   *
   * <h3>Examples</h3>
   *
   * <pre>
   * &gt;&gt; ListConvolve({x, y}, {a, b, c, d, e, f})
   * {b*x+a*y,c*x+b*y,d*x+c*y,e*x+d*y,f*x+e*y}
   * </pre>
   */
  private static class ListConvolve extends AbstractEvaluator {
    /**
     * See: <a href=
     * "https://github.com/idsc-frazzoli/tensor/blob/master/src/main/java/ch/ethz/idsc/tensor/alg/ListConvolve.java">tensor/alg/ListConvolve.java</a>
     */
    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      if (ast.isAST2()) {
        if (ast.arg1().isAST() && ast.arg2().isAST()) {
          IAST kernel = (IAST) ast.arg1();
          IAST tensor = (IAST) ast.arg2();
          IntList kernelDims = LinearAlgebra.dimensions(kernel);
          IntList tensorDims = LinearAlgebra.dimensions(tensor);
          if (kernelDims.size() > 0 && kernelDims.size() == tensorDims.size()) {
            int kernelSize = kernel.size();
            int tensorSize = tensor.size();
            if (kernelSize <= tensorSize) {
              IAST reversed = nestedReverseRecursive(kernel, kernelDims, 0);
              IASTAppendable resultList = F.ListAlloc();
              return ListCorrelate.listCorrelate(reversed, tensor, S.Plus, S.Times);
            }
          }
        }

      }
      return F.NIL;
    }

    /**
     * Reverse <code>kernel</code> on all &quot;nested&quot; levels.
     * 
     * @param kernel
     * @param rootKernelDimensions the dimension of the root-kernel
     * @param dimensionLevel the current level of the <code>rootKernelDimensions</code>
     * @return
     */
    private static IAST nestedReverseRecursive(IAST kernel, IntList rootKernelDimensions,
        int dimensionLevel) {
      if (dimensionLevel == rootKernelDimensions.size() - 1) {
        // stop recursion
        return ListFunctions.reverse(kernel);
      }
      final int levelSize = rootKernelDimensions.getInt(dimensionLevel);
      IASTAppendable reversedList = F.ListAlloc(levelSize);
      for (int i = levelSize; i >= 1; i--) {
        IAST reversed =
            nestedReverseRecursive((IAST) kernel.get(i).normal(false), rootKernelDimensions,
                dimensionLevel + 1);
        // append in reversed order
        reversedList.append(reversed);
      }
      return reversedList;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_2_2;
    }
  }

  /**
   *
   *
   * <pre>
   * ListCorrelate(kernel - list, tensor - list)
   * </pre>
   *
   * <blockquote>
   *
   * <p>
   * create the correlation of the <code>kernel-list</code> with <code>tensor-list</code>.
   *
   * </blockquote>
   *
   * <h3>Examples</h3>
   *
   * <pre>
   * &gt;&gt; ListCorrelate({x, y}, {a, b, c, d, e, f})
   * {a*x+b*y,b*x+c*y,c*x+d*y,d*x+e*y,e*x+f*y}
   * </pre>
   */
  private static class ListCorrelate extends AbstractEvaluator {
    /**
     * See: <a href=
     * "https://github.com/idsc-frazzoli/tensor/blob/master/src/main/java/ch/ethz/idsc/tensor/alg/ListCorrelate.java">tensor/alg/ListCorrelate.java</a>
     *
     * @return correlation of kernel with tensor
     */
    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      if (ast.isAST2()) {
        if (ast.arg1().isAST() && ast.arg2().isAST()) {
          IAST kernel = (IAST) ast.arg1();
          IAST tensor = (IAST) ast.arg2();
          IntList kernelDims = LinearAlgebra.dimensions(kernel);
          IntList tensorDims = LinearAlgebra.dimensions(tensor);
          if (kernelDims.size() > 0 && kernelDims.size() == tensorDims.size()) {

            return listCorrelate(kernel, tensor, S.Plus, S.Times);
          }
        }

      }
      return F.NIL;
    }

    public static IExpr listCorrelate(IAST kernel, IAST tensor, final ISymbol plusFunction,
        final ISymbol timesFunction) {
      int kernelSize = kernel.size();
      int tensorSize = tensor.size();
      if (kernelSize <= tensorSize) {
        IASTAppendable result = F.ListAlloc();
        IntList kernelDimension = LinearAlgebra.dimensions(kernel);
        IntList tensorDimension = LinearAlgebra.dimensions(tensor);
        final int kernelDimensionSize = kernelDimension.size();
        if (kernelDimensionSize <= tensorDimension.size()) {
          if (kernelDimensionSize == 1) {
            int diff1 = tensorDimension.getInt(0) - kernelDimension.getInt(0) + 1;
            for (int i = 0; i < diff1; i++) {
              IASTAppendable subList = F.ast(plusFunction, kernelDimension.size());
              for (int j = 1; j < kernelSize; j++) {
                subList.append(F.binaryAST2(timesFunction, kernel.get(j), tensor.get(i + j)));
              }
              result.append(subList);
            }
            return result;
          } else if (kernelDimensionSize == 2) {
            int diff1 = tensorDimension.getInt(0) - kernelDimension.getInt(0) + 1;
            int diff2 = tensorDimension.getInt(1) - kernelDimension.getInt(1) + 1;
            for (int k = 1; k <= diff1; k++) {
              IASTAppendable list = F.ListAlloc(kernelDimension.size());

              for (int i = 1; i <= diff2; i++) {
                IASTAppendable subList = F.ast(plusFunction, kernelDimension.size());

                for (int j = 1; j <= kernelDimension.getInt(0); j++) {
                  IAST subKernelRow = (IAST) kernel.get(j);
                  IAST subTensorRow = (IAST) tensor.get(k + j - 1);
                  for (int j2 = 1; j2 <= kernelDimension.getInt(1); j2++) {
                    IExpr kernelElem = subKernelRow.get(j2);
                    IExpr tensorElem = subTensorRow.get(j2 + i - 1);
                    subList.append(F.binaryAST2(timesFunction, kernelElem, tensorElem));
                  }
                }
                list.append(subList);
              }
              result.append(list);
            }
            return result;
          }
        }
      }
      return F.NIL;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_2_2;
    }

  }

  /**
   *
   *
   * <pre>
   * Ordering(list)
   * </pre>
   *
   * <blockquote>
   *
   * <p>
   * calculate the permutation list of the elements in the sorted <code>list</code>.
   *
   * </blockquote>
   *
   * <pre>
   * Ordering(list, n)
   * </pre>
   *
   * <blockquote>
   *
   * <p>
   * calculate the first <code>n</code> indexes of the permutation list of the elements in the
   * sorted <code>list</code>.
   *
   * </blockquote>
   *
   * <pre>
   * Ordering(list, -n)
   * </pre>
   *
   * <blockquote>
   *
   * <p>
   * calculate the last <code>n</code> indexes of the permutation list of the elements in the sorted
   * <code>list</code>.
   *
   * </blockquote>
   *
   * <pre>
   * Ordering(list, n, head)
   * </pre>
   *
   * <blockquote>
   *
   * <p>
   * calculate the first <code>n</code> indexes of the permutation list of the elements in the
   * sorted <code>list</code> using comparator operation <code>head</code>.
   *
   * </blockquote>
   *
   * <h3>Examples</h3>
   *
   * <pre>
   * &gt;&gt; Ordering({1,3,4,2,5,9,6})
   * {1,4,2,3,5,7,6}
   *
   * &gt;&gt; Ordering({1,3,4,2,5,9,6}, All, Greater)
   * {6,7,5,3,2,4,1}
   * </pre>
   */
  private static class Ordering extends AbstractEvaluator {

    /**
     * See <a href="https://stackoverflow.com/a/4859279/24819">Get the indices of an array after
     * sorting?</a>
     */
    private static class ArrayIndexComparator implements Comparator<Integer> {
      protected final IAST ast;

      public ArrayIndexComparator(IAST ast) {
        this.ast = ast;
      }

      public Integer[] createIndexArray() {
        int size = ast.size();
        Integer[] indexes = new Integer[size - 1];
        for (int i = 1; i < size; i++) {
          indexes[i - 1] = i;
        }
        return indexes;
      }

      @Override
      public int compare(Integer index1, Integer index2) {
        return ast.get(index1).compareTo(ast.get(index2));
      }
    }

    private static class PredicateComparator extends ArrayIndexComparator {
      final Comparator<IExpr> comparator;

      public PredicateComparator(IAST ast, Comparator<IExpr> comparator) {
        super(ast);
        this.comparator = comparator;
      }

      @Override
      public int compare(Integer index1, Integer index2) {
        return comparator.compare(ast.get(index1), ast.get(index2));
      }
    }

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      if (ast.arg1().isAST()) {
        IAST list = (IAST) ast.arg1();
        ArrayIndexComparator comparator;
        if (ast.size() >= 4) {
          // use the 3rd argument as a head for the comparator operation:
          comparator = new PredicateComparator(list, new Predicates.IsBinaryFalse(ast.arg3()));
        } else {
          // use the default IExpr#compareTo() method
          comparator = new ArrayIndexComparator(list);
        }
        Integer[] indexes = comparator.createIndexArray();
        Arrays.sort(indexes, comparator);
        int n = indexes.length;
        if (ast.size() >= 3) {
          IExpr arg2 = ast.arg2();
          if (arg2.equals(S.All)) {
          } else if (arg2.isReal()) {
            ISignedNumber sn = (ISignedNumber) arg2;
            n = sn.toIntDefault();
          }
        }
        if (n == Integer.MIN_VALUE) {
          return F.NIL;
        }
        return F.tensorList(n, indexes);
      }
      return F.NIL;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_1_3;
    }

    @Override
    public void setUp(final ISymbol newSymbol) {}
  }

  private static class TensorDimensions extends AbstractEvaluator {

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      IExpr arg1 = ast.arg1();
      if (arg1.isList() || arg1.isSparseArray()) {
        // same as Dimensions for List structures
        return F.Dimensions(arg1);
      }
      IAssumptions oldAssumptions = engine.getAssumptions();
      OptionArgs options = null;
      if (ast.size() > 2) {
        options = new OptionArgs(ast.topHead(), ast, ast.argSize(), engine);
      }
      IExpr assumptionExpr = OptionArgs.determineAssumptions(ast, 2, options);
      try {
        Map<IExpr, IAST> tensorProperties = tensorProperties(oldAssumptions, assumptionExpr);
        if (tensorProperties != null) {

          if (arg1.isASTSizeGE(S.Dot, 3)) {
            return dotDimensions(ast, tensorProperties, engine);
          }

          IAST tensorArg1 = tensorProperties.get(arg1);
          if (tensorArg1 != null) {
            if (tensorArg1.isAST(S.Vectors)) {
              return F.list(tensorArg1.arg1());
            }
            return tensorArg1.arg1();
          }
        }
      } finally {
        engine.setAssumptions(oldAssumptions);
      }
      return F.NIL;
    }

    /**
     * Determine the dimensions of <code>TensorDimensions(Dot(...))</code> if possible.
     *
     * @param tensorDimensions is of the form <code>TensorDimensions(Dot(...))</code>
     * @param tensorAssumptions
     * @param engine
     * @return
     */
    private static IExpr dotDimensions(final IAST tensorDimensions,
        Map<IExpr, IAST> tensorAssumptions, EvalEngine engine) {
      IAST dotAST = (IAST) tensorDimensions.arg1();
      IExpr lastArg = dotAST.arg1();

      IAST property1 = tensorAssumptions.get(lastArg);
      if (property1 != null) {
        if (property1.isAST(S.Matrices)) {
          IASTMutable dims =
              F.binaryAST2(S.List, property1.arg1().first(), property1.arg1().second());
          for (int i = 2; i < dotAST.size(); i++) {
            IExpr tempArg = dotAST.get(i);
            IAST property = tensorAssumptions.get(tempArg);
            if (property == null) {
              return F.NIL;
            }
            if (property.isAST(S.Matrices)) {
              IAST iDims = (IAST) property.arg1();
              if (!dims.second().equals(iDims.first())) {
                // Dot contraction of `1` and `2` is invalid because dimensions `3` and `4`
                // are incompatible.
                return IOFunctions.printMessage(tensorDimensions.topHead(), "dotdim",
                    F.List(lastArg, tempArg, dims.second(), iDims.first()), engine);
              }
              dims.set(2, iDims.second());
              lastArg = tempArg;
            } else {
              return F.NIL;
            }
          }
          return dims;
        }
      }
      return F.NIL;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_1_1;
    }

    @Override
    public void setUp(final ISymbol newSymbol) {
      setOptions(newSymbol, F.list(F.Rule(S.Assumptions, S.$Assumptions)));
    }
  }

  private static class TensorSymmetry extends AbstractEvaluator {

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      IAssumptions oldAssumptions = engine.getAssumptions();
      OptionArgs options = null;
      IExpr sameTest = S.SameQ;
      if (ast.size() > 2) {
        options = new OptionArgs(ast.topHead(), ast, ast.argSize(), engine);
        IExpr option = options.getOption(S.SameTest);
        if (option.isPresent()) {
          sameTest = option;
        }
      }
      IExpr assumptionExpr = OptionArgs.determineAssumptions(ast, 2, options);

      IExpr arg1 = ast.arg1().normal(false);
      if (arg1.isAST()) {
        IAST tensor = (IAST) arg1;
        final IntList dims = LinearAlgebra.dimensions(tensor, tensor.head());
        final int dimsSize = dims.size();
        if (dimsSize > 0) {
          if (dimsSize == 2 && dims.getInt(0) == dims.getInt(1)) {
            // square matrix
            int rowColumnSize = dims.getInt(0) + 1;
            if (rowColumnSize == 2) {
              if (tensor.getPart(1, 1).isZero()) {
                return F.ZeroSymmetric(F.CEmptyList);
              }
              return F.Symmetric(F.list(F.C1, F.C2));
            }
            return tensorSymmetrySquareMatrix(tensor, rowColumnSize, sameTest, engine);
          }
        }
      }

      try {

        Map<IExpr, IAST> tensorProperties = tensorProperties(oldAssumptions, assumptionExpr);
        if (tensorProperties != null) {
          IAST tensorArg1 = tensorProperties.get(arg1);
          if (tensorArg1 != null) {
            if (tensorArg1.isAST(S.Vectors)) {
              return F.CEmptyList;
            }
            if (tensorArg1.isAST(S.Arrays, 3) //
                || tensorArg1.isAST(S.Matrices, 3)) {
              if (tensorArg1.last().isAST()) {
                IAST arg3 = (IAST) tensorArg1.last();
                if (arg3.isAST(S.Symmetric, 2) //
                    || arg3.isAST(S.AntiSymmetric, 2) || arg3.isAST(S.ZeroSymmetric, 2)) {
                  return arg3;
                }
              }
            }
          }
        }

      } finally {
        engine.setAssumptions(oldAssumptions);
      }
      return F.NIL;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_1_2;
    }

    /**
     * @param squareMatrix
     * @param rowColumnSize the row and column size of the square matrix
     * @param engine the evaluation engine
     * @return
     */
    private static IExpr tensorSymmetrySquareMatrix(IAST squareMatrix, int rowColumnSize,
        IExpr sameTest, EvalEngine engine) {
      IExpr temp = isZeroSymmetricSquareMatrix(squareMatrix, rowColumnSize);
      if (temp.isPresent()) {
        return temp;
      }
      boolean isAntiSymmetric = true;
      boolean isSymmetric = true;
      for (int i = 1; i < rowColumnSize; i++) {
        if (isSymmetric) {
          if (sameTest == S.SameQ) {
            for (int j = i + 1; j < rowColumnSize; j++) {
              if (!squareMatrix.getPart(i, j).equals(squareMatrix.getPart(j, i))) {
                isSymmetric = false;
                break;
              }
            }
          } else {

            for (int j = i + 1; j < rowColumnSize; j++) {
              if (!engine.evalTrue(sameTest, squareMatrix.getPart(i, j),
                  squareMatrix.getPart(j, i))) {
                isSymmetric = false;
                break;
              }
            }
          }
        }
        if (isSymmetric) {
          isAntiSymmetric = false;
        } else if (isAntiSymmetric) {
          if (sameTest == S.SameQ) {
            for (int j = i + 1; j < rowColumnSize; j++) {
              temp = squareMatrix.getPart(j, i).negate();
              if (!squareMatrix.getPart(i, j).equals(temp)) {
                isAntiSymmetric = false;
                break;
              }
            }
          } else
            for (int j = i + 1; j < rowColumnSize; j++) {
              temp = squareMatrix.getPart(j, i).negate();
              if (!engine.evalTrue(sameTest, squareMatrix.getPart(i, j), temp)) {
                isAntiSymmetric = false;
                break;
              }
            }
        }

        if (!isAntiSymmetric && !isSymmetric) {
          return F.CEmptyList;
        }
      }
      if (isSymmetric) {
        return F.Symmetric(F.list(F.C1, F.C2));
      }
      if (isAntiSymmetric) {
        return F.AntiSymmetric(F.list(F.C1, F.C2));
      }
      return F.CEmptyList;
    }

    /**
     * @param squareMatrix
     * @param rowColumnSize the row and column size of the square matrix
     * @return
     */
    private static IExpr isZeroSymmetricSquareMatrix(IAST squareMatrix, int rowColumnSize) {
      boolean isZero = true;
      for (int i = 1; i < rowColumnSize; i++) {
        for (int j = 1; j < rowColumnSize; j++) {
          if (!squareMatrix.getPart(i, j).isZero()) {
            isZero = false;
            break;
          }
        }
        if (!isZero) {
          break;
        }
      }
      if (isZero) {
        return F.ZeroSymmetric(F.List());
      }
      return F.NIL;
    }

    @Override
    public void setUp(final ISymbol newSymbol) {
      setOptions(newSymbol, F.list(F.Rule(S.Assumptions, S.$Assumptions), //
          F.Rule(S.SameTest, S.Automatic)));
    }
  }

  private static class TensorProduct extends AbstractEvaluator {

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      int argSize = ast.argSize();
      if (argSize == 0) {
        return F.C0;
      } else if (argSize == 1) {
        return ast.arg1();
      }
      if (ast.arg1().isList() && ast.arg2().isList()) {
        IAST tensor1 = (IAST) ast.arg1();
        IntList dim1 = LinearAlgebra.dimensions(tensor1, S.List);
        if (dim1.size() > 0) {
          for (int i = 2; i < ast.size(); i++) {
            IAST tensor2 = (IAST) ast.get(i);
            IntList dim2 = LinearAlgebra.dimensions(tensor2, S.List);
            if (dim2.size() > 0) {
              IExpr temp = tensorProduct(tensor1, tensor2, dim1.size(), engine);
              if (temp.isPresent()) {
                if (temp.isList()) {
                  tensor1 = (IAST) temp;
                  dim1 = LinearAlgebra.dimensions(tensor1, S.List);
                  if (dim1.size() > 0) {
                    if (i < argSize) {
                      if (ast.get(i + 1).isList()) {
                        continue;
                      }
                    } else {
                      return tensor1;
                    }
                  }
                }
                IASTAppendable result = F.ast(S.TensorProduct);
                result.append(temp);
                result.appendAll(ast, i + 1, ast.size());
                return result;
              }
            }
            if (i == 2) {
              return F.NIL;
            }

            IASTAppendable result = F.ast(S.TensorProduct);
            result.append(tensor1);
            result.appendAll(ast, i, ast.size());
            return result;
          }
          return tensor1;
        }
      }
      return F.NIL;
    }

    /**
     * Evaluate expression: <code>Map((#1 * tensor2)&, tensor1, {tensor1Depth}) </code>, to get the
     * tensor product.
     *
     * @param tensor1 the first tensor
     * @param tensor2 the second tensor
     * @param tensor1Depth depth of the first tensor
     * @param engine
     * @return
     */
    protected static IExpr tensorProduct(final IAST tensor1, final IAST tensor2, int tensor1Depth,
        EvalEngine engine) {
      return engine
          .evaluate(F.Map(F.Function(F.Times(F.Slot1, tensor2)), tensor1, F.List(tensor1Depth)));
    }

    @Override
    public void setUp(final ISymbol newSymbol) {
      newSymbol.setAttributes(ISymbol.FLAT | ISymbol.ONEIDENTITY);
    }
  }

  private static class TensorRank extends AbstractEvaluator {

    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      IExpr arg1 = ast.arg1();
      if (arg1.isList()) {
        IAST list = (IAST) arg1;
        IntList intList = LinearAlgebra.dimensions((IAST) arg1, list.head());
        return F.ZZ(intList.size());
      } else if (arg1.isNumber()) {
        return F.C0;
      } else if (arg1.isNumericFunction()) {
        if (engine.evalN(arg1).isNumber()) {
          return F.C0;
        }
      } else if (arg1.isSparseArray()) {
        return F.ZZ(((ISparseArray) arg1).getDimension().length);
      }

      IAssumptions oldAssumptions = engine.getAssumptions();
      OptionArgs options = null;
      if (ast.size() > 2) {
        options = new OptionArgs(ast.topHead(), ast, ast.argSize(), engine);
      }
      IExpr assumptionExpr = OptionArgs.determineAssumptions(ast, 2, options);
      try {

        Map<IExpr, IAST> tensorProperties = tensorProperties(oldAssumptions, assumptionExpr);
        if (tensorProperties != null) {
          IAST tensorArg1 = tensorProperties.get(arg1);
          if (tensorArg1 != null) {
            if (tensorArg1.isAST(S.Vectors)) {
              return F.C1;
            }
            if (tensorArg1.isAST(S.Matrices)) {
              return F.C2;
            }
            if (tensorArg1.isAST(S.Arrays)) {
              int size = tensorArg1.arg1().argSize();
              return F.ZZ(size);
            }
          }
        }

      } finally {
        engine.setAssumptions(oldAssumptions);
      }
      return F.NIL;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_1_2;
    }

    @Override
    public void setUp(final ISymbol newSymbol) {
      setOptions(newSymbol, //
          F.list(F.Rule(S.Assumptions, S.$Assumptions)));
    }
  }

  private static Map<IExpr, IAST> tensorProperties(IAssumptions oldAssumptions,
      IExpr assumptionExpr) {
    if (assumptionExpr.isPresent() && assumptionExpr.isAST()) {
      IAssumptions assumptions =
          org.matheclipse.core.eval.util.Assumptions.getInstance(assumptionExpr);
      if (assumptions != null) {
        return assumptions.getTensorsMap();
      }
    } else {
      if (oldAssumptions != null) {
        return oldAssumptions.getTensorsMap();
      }
    }
    return null;
  }

  public static void initialize() {
    Initializer.init();
  }

  private TensorFunctions() {}
}
