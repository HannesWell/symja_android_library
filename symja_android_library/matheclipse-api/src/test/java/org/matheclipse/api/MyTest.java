package org.matheclipse.api;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.eval.interfaces.AbstractSymbolEvaluator;
import org.matheclipse.core.eval.interfaces.ICoreFunctionEvaluator;
import org.matheclipse.core.expression.BuiltInDummy;
import org.matheclipse.core.expression.Context;
import org.matheclipse.core.expression.ContextPath;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IBuiltInSymbol;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.INumber;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.reflection.system.Solve;

public class MyTest {

  public static void main(String[] args) {

    IAST equation = F.Equal(F.Plus(F.Power(F.$s("var1"), 2), F.$s("var2"), F.C10), F.ZZ(43L));

    ISymbol variable = F.$s("var1");
    ISymbol givenVariable = F.$s("var2");

    List<IAST> constraints = List.of(equation);
    List<ISymbol> toSolveVariables = List.of(variable);
    Map<ISymbol, Double> givenVariables = Map.of(givenVariable, 20.0); // from modelö

    Collection<Map<String, Double>> solutions =
        solveConstraintSystem(constraints, toSolveVariables, givenVariables);

    System.out.println(solutions);
    // Further process solution, set it to model
  }

  private static Collection<Map<String, Double>> solveConstraintSystem(List<IAST> constraints,
      List<ISymbol> solvedVariables, Map<ISymbol, Double> givenVariableValues) {

    IAST contraintsList = F.List(constraints.toArray(IExpr[]::new));
    IAST variablesList = F.List(solvedVariables.toArray(IExpr[]::new));

    IAST toSolve2 = F.Solve(contraintsList, variablesList);

    EvalEngine evalEngine = new EvalEngine();

    IExpr evaluate;
    EvalEngine.set(evalEngine);
    try {
      givenVariableValues.forEach((s, v) -> assignValue(s, F.symjify(v), evalEngine));
      evaluate = evalEngine.evaluateNIL(toSolve2);
      // Solve.of(toSolve2, false, evalEngine);
    } finally {
      EvalEngine.remove();
    }
    if (evaluate.isPresent()) {
      if (evaluate.isListOfLists()) {
        List<Map<String, Double>> solutions = new ArrayList<>();
        for (IExpr solutionSet : (IAST) evaluate) {
          Map<String, Double> ssolutionValues = new HashMap<>();
          for (IExpr solution : (IAST) solutionSet) {
            if (!solution.isRule()) {
              throw new IllegalStateException("Unexpected solution: " + solution);
            }
            ISymbol symbol = (ISymbol) solution.first();
            Double value = solution.second().evalDouble();
            ssolutionValues.put(symbol.getSymbolName(), value);
          }
          solutions.add(ssolutionValues);
        }
        return solutions;
      }
    }
    return null;
  }

  private static void assignValue(ISymbol variable, IExpr value, EvalEngine evalEngine) {
    Context globalContext = evalEngine.getContextPath().getGlobalContext();
    ISymbol engineLocalSubstitution = new BuiltInDummy("engineLocalVariableSubstitue");
    globalContext.put(variable.getSymbolName(), engineLocalSubstitution);
    engineLocalSubstitution.assignValue(value);
  }

  private static void method3() {
    ISymbol var1 = F.$s("var1");
    ISymbol var2 = F.$s("var2");

    IAST equation = F.Equal(F.Plus(F.Power(F.$s("var1"), 2), F.$s("var2"), F.C10), F.ZZ(43L));


    IAST toSolve2 = F.Solve(equation, F.$s("var1"));

    EvalEngine evalEngine = new EvalEngine();

    assignValue(var2, F.ZZ(44), evalEngine);
    IExpr evaluate;
    EvalEngine.set(evalEngine);
    try {
      evaluate = evalEngine.evaluateNIL(toSolve2);
      // Solve.of(toSolve2, false, evalEngine);
    } finally {
      EvalEngine.remove();
    }
    System.out.println(evaluate);
  }

  private static void method2() {
    ExprEvaluator evaluator = new ExprEvaluator();
    IExpr parse = evaluator.parse("Solve(var1-1==43,var1)");
    IAST eval = (IAST) evaluator.eval(parse);
    System.out.println(parse);
    System.out.println(eval);
    System.out.println(toSourceCode(parse));

    toSourceCode(parse);
    IExpr symjify = F.symjify(43L, false);

    ISymbol $s = F.$s("IILS_VAR1");
    ISymbol predefinedSymbol = F.predefinedSymbol("IILS_VAR2");
    ISymbol initFinalHiddenSymbol = F.initFinalHiddenSymbol("IILS_VAR4");
    IBuiltInSymbol variableSymbol = createVariableSymbol();

    IASTAppendable var1 = F.ast(new IExpr[] {F.ZZ(0)}, variableSymbol);
    IASTAppendable var2 = F.ast(new IExpr[] {F.ZZ(1)}, variableSymbol);

    IBuiltInSymbol symVar1 = getIndexedVariableSymbol(0);
    IBuiltInSymbol symVar2 = getIndexedVariableSymbol(1);

    // ISymbol var = F.$s("var");
    IAST toSolve = F.Solve(F.Equal(F.Plus(symVar1, symVar2, F.ZZ(10)), F.ZZ(43)), symVar1);

    List<IExpr> variableValues = List.of(F.NIL, F.ZZ(44));
    EvalEngine engine = new DC43EvalEngine(variableValues);

    // IExpr value = ComplexSym.valueOf(10, 1, 1, 1);
    // new ExprEvaluator().defineVariable("", value);
    // F.symbol(symVar1.getSymbolName(), engine);

    IExpr evaluate = engine.evaluate(toSolve);
    System.out.println(evaluate);
    IExpr solved = Solve.of(toSolve, false, engine);
    System.out.println(solved);


    // IExpr evaluate7 = engine.evaluate("x=43");
    // IExpr evaluate8 = engine.evaluate("solve(x+y==3,y)");

    // FIXME: or define a rule or define an association?
  }


  private static IBuiltInSymbol createVariableSymbol() {
    IBuiltInSymbol variableSymbol = new BuiltInDummy("DC43_VARIABLE") {
      private static final long serialVersionUID = 1469892886767889068L;

      @Override
      public boolean isConstantAttribute() {
        // TODO Auto-generated method stub
        return super.isConstantAttribute();
      }

      @Override
      public boolean isRealConstant() {
        // TODO Auto-generated method stub
        return super.isRealConstant();
      }

      @Override
      public IExpr assignedValue() {
        // TODO Auto-generated method stub
        return super.assignedValue();
      }

      @Override
      public boolean hasAssignedSymbolValue() {
        // TODO Auto-generated method stub
        return super.hasAssignedSymbolValue();
      }
    };
    variableSymbol.setEvaluator(new ICoreFunctionEvaluator() {
      @Override
      public IExpr evaluate(IAST ast, EvalEngine engine) {
        if (!ast.isAST(variableSymbol)) {
          throw new IllegalArgumentException("AST is not a variable: " + ast);
        }
        int variableIndex = ast.arg1().toIntDefault(-1);
        return getVariableValueFromEngine(engine, variableIndex);
      }

      @Override
      public void setUp(ISymbol newSymbol) {
        System.out.println("setUp");
      }
    });
    return variableSymbol;
  }

  private static final List<IBuiltInSymbol> VARIABLE_SYMBOLS = new ArrayList<>();

  private static IBuiltInSymbol getIndexedVariableSymbol(int index) {
    if (index < VARIABLE_SYMBOLS.size()) {
      return VARIABLE_SYMBOLS.get(index);
    }
    synchronized (VARIABLE_SYMBOLS) {
      while (!(index < VARIABLE_SYMBOLS.size())) {
        VARIABLE_SYMBOLS.add(createIndexedVariableSymbol(index));
      }
    }
    return VARIABLE_SYMBOLS.get(index);
  }

  private static IBuiltInSymbol createIndexedVariableSymbol(int index) {
    IBuiltInSymbol variableSymbol = new BuiltInDummy("DC43_VARIABLE_" + index) {
      private static final long serialVersionUID = 2989771900007082123L;

      @Override
      public boolean isConstantAttribute() {
        // TODO Auto-generated method stub
        return super.isConstantAttribute();
      }

      @Override
      public boolean isRealConstant() {
        // TODO Auto-generated method stub
        return super.isRealConstant();
      }

      @Override
      public boolean isVariable() {
        // TODO Auto-generated method stub
        return super.isVariable();
      }

      @Override
      public IExpr evaluate(EvalEngine engine) {
        return getVariableValueFromEngine(engine, index);
      }
    };
    variableSymbol.setEvaluator(new AbstractSymbolEvaluator() {
      @Override
      public void setUp(ISymbol newSymbol) {
        // TODO Auto-generated method stub
      }

      @Override
      public IExpr numericEval(ISymbol symbol, EvalEngine engine) {
        return evaluate(symbol, engine); // TODO: report this FIX to Symja
      }

      @Override
      public IExpr evaluate(ISymbol symbol, EvalEngine engine) {
        if (symbol != (variableSymbol)) {
          throw new IllegalArgumentException("AST is not a variable: " + symbol);
        }
        return getVariableValueFromEngine(engine, index);
      }
    });
    return variableSymbol;
  }

  private static void setVariableValueToEngien(EvalEngine engine, int variableIndex,
      INumber value) {
    // IQuantity.of(null, null);
    Context context = engine.getContext();
    ContextPath contextPath = engine.getContextPath();
    Context globalContext = contextPath.getGlobalContext();
    // contextPath.add(globalContext);
    contextPath.getContextMap();
  }

  private static class DC43EvalEngine extends EvalEngine {
    private static final long serialVersionUID = -1004393902844204516L;
    private final List<IExpr> variableValues;

    public DC43EvalEngine(List<IExpr> variableValues) {
      super("", 0, new PrintStream(OutputStream.nullOutputStream()), true);
      this.variableValues = variableValues;
    }

    public IExpr getVariableValue(int index) {
      IExpr value = variableValues.get(index);
      return value != null ? value : F.NIL;
    }

  }

  private static IExpr getVariableValueFromEngine(EvalEngine engine, int variableIndex) {
    if (engine instanceof DC43EvalEngine) {
      return ((DC43EvalEngine) engine).getVariableValue(variableIndex);
    } else {
      throw new IllegalArgumentException("Unsupported engine");
    }

    // // FIXME: get the value from the engine
    // Context context = engine.getContext();
    // ContextPath contextPath = engine.getContextPath();
    // Context globalContext = contextPath.getGlobalContext();
    // Context context2 = engine.getContext();
    // boolean global = context2.isGlobal();
    // boolean system = context2.isSystem();
    // return null;
  }

  private static String toSourceCode(IExpr parse) {
    boolean symbolsAsFactoryMethod = true;
    boolean usePrefix = true;
    boolean useOperators = false;
    boolean noSymbolPrefix = false;
    String internalJavaString2 = parse.internalJavaString(symbolsAsFactoryMethod, 1, useOperators,
        usePrefix, noSymbolPrefix, x -> {
          return null;
        });
    return internalJavaString2;
  }

}
