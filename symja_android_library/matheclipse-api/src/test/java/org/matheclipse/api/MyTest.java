package org.matheclipse.api;

import java.util.ArrayList;
import java.util.List;
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
    method2();
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
    IAST toSolve = F.Solve(F.Equal(F.Plus(symVar1, symVar2), F.ZZ(43)), symVar1);

    EvalEngine engine = new EvalEngine(true);
    IExpr evaluate = Solve.of(toSolve, false, engine);
    System.out.println(eval);


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

  }

  private static IExpr getVariableValueFromEngine(EvalEngine engine, int variableIndex) {
    // FIXME: get the value from the engine
    Context context = engine.getContext();
    ContextPath contextPath = engine.getContextPath();
    return null;
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
