package org.matheclipse.api;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.eval.interfaces.ICoreFunctionEvaluator;
import org.matheclipse.core.eval.interfaces.ISymbolEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IBuiltInSymbol;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

public class MyTest {

  public static void main(String[] args) {
    method1();


    method2();
  }

  private static void method1() {
    ISymbol var1 = F.$s("var1");
    ISymbol predefinedSymbol = F.predefinedSymbol("variable");

    // IBuiltInSymbol sym = null;
    // sym.setEvaluator(null);

    IExpr var2 = F.localFunction("IILS_VAR3", new ICoreFunctionEvaluator() {
      @Override
      public void setUp(ISymbol newSymbol) {
        // TODO Auto-generated method stub
        System.out.println("setUp");
      }

      public IExpr evaluate(ISymbol symbol, EvalEngine engine) {
        // TODO Auto-generated method stub
        System.out.println("evaluate");
        return null;
      }

      public IExpr numericEval(ISymbol symbol, EvalEngine engine) {
        // TODO Auto-generated method stub
        System.out.println("numericEval");
        return null;
      }

      public IExpr apfloatEval(ISymbol symbol, EvalEngine engine) {
        // TODO Auto-generated method stub
        System.out.println("apfloatEval");
        return null;
      }

      @Override
      public IExpr evaluate(IAST ast, EvalEngine engine) {
        // TODO Auto-generated method stub
        return null;
      }
    });;
    IAST ast = F.Solve(F.Equal(F.Plus(var1, var2), F.ZZ(43L)), var1);
    ExprEvaluator exprEvaluator = new ExprEvaluator();
    exprEvaluator.defineVariable("AVar", 43.0);
    IExpr eval = exprEvaluator.eval(ast);
    System.out.println(eval);
  }

  private static void method2() {
    ExprEvaluator evaluator = new ExprEvaluator();
    IExpr parse = evaluator.parse("Solve(var1-1==43,var1)");
    IAST eval = (IAST) evaluator.eval(parse);
    System.out.println(parse);
    System.out.println(eval);
    System.out.println(toSourceCode(parse));

    toSourceCode(parse);
    IAST list = F.List(F.List(F.Rule(F.$s("var1"), F.ZZ(43L))));

    IExpr symjify = F.symjify(43L, false);

    ISymbol $s = F.$s("IILS_VAR1");
    ISymbol predefinedSymbol = F.predefinedSymbol("IILS_VAR2");
    IBuiltInSymbol localFunction = F.localFunction("IILS_VAR3", new ISymbolEvaluator() {
      @Override
      public void setUp(ISymbol newSymbol) {
        // TODO Auto-generated method stub
        System.out.println("setUp");
      }
      @Override
      public IExpr evaluate(ISymbol symbol, EvalEngine engine) {
        // TODO Auto-generated method stub
        System.out.println("evaluate");
        return null;
      }
      @Override
      public IExpr numericEval(ISymbol symbol, EvalEngine engine) {
        // TODO Auto-generated method stub
        System.out.println("numericEval");
        return null;
      }
      @Override
      public IExpr apfloatEval(ISymbol symbol, EvalEngine engine) {
        // TODO Auto-generated method stub
        System.out.println("apfloatEval");
        return null;
      }
    });
    ISymbol initFinalHiddenSymbol = F.initFinalHiddenSymbol("IILS_VAR4");


    // FIXME: or define a rule or define an association?
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
