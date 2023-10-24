package org.matheclipse.core.system;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.interfaces.ISymbol;

/** Tests for SparseArray functions */
public class ConstantPhysicsTest extends ExprEvaluatorTestCase {

  public ConstantPhysicsTest(String name) {
    super(name);
  }

  public void testAvogadroConstant() {
    // Moles^(-1)
    check("AvogadroConstant", //
        "602214076000000000000000[mol^-1]");
  }

  public void testBohrRadius() {
    // Nanometers
    check("BohrRadius", //
        "0.0529177[nm]");
  }

  public void testUniverseAge() {
    // Years
    check("UniverseAge", //
        "1.3787*10^10[yr]");
  }


  /** The JUnit setup method */
  @Override
  protected void setUp() {
    Config.BUILTIN_PROTECTED = ISymbol.PROTECTED;
    super.setUp();
    Config.SHORTEN_STRING_LENGTH = 1024;
    Config.MAX_AST_SIZE = 1000000;
    // // dummy eval
    // try {
    // fScriptEngine.eval("");
    // } catch (ScriptException e) {
    // }
    EvalEngine engine = EvalEngine.get();// (EvalEngine) fScriptEngine.get("EVAL_ENGINE");
    engine.setIterationLimit(50000);
    engine.setRecursionLimit(256);
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
    Config.SHORTEN_STRING_LENGTH = 80;
  }
}
