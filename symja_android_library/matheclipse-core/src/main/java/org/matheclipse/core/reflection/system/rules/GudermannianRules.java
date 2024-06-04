package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class GudermannianRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 7, 0 };

  final public static IAST RULES = List(
    IInit(Gudermannian, SIZES),
    // Gudermannian(Undefined)=Undefined
    ISet(Gudermannian(Undefined),
      Undefined, true),
    // Gudermannian(0)=0
    ISet(Gudermannian(C0),
      C0, true),
    // Gudermannian(I*2*Pi)=0
    ISet(Gudermannian(Times(CC(0L,1L,2L,1L),Pi)),
      C0, true),
    // Gudermannian(I*3/2*Pi)=-I*Infinity
    ISet(Gudermannian(Times(CC(0L,1L,3L,2L),Pi)),
      DirectedInfinity(CNI), true),
    // Gudermannian(Infinity)=Pi/2
    ISet(Gudermannian(oo),
      CPiHalf, true),
    // Gudermannian(-Infinity)=(-1)*1/2*Pi
    ISet(Gudermannian(Noo),
      CNPiHalf, true),
    // Gudermannian(ComplexInfinity)=Indeterminate
    ISet(Gudermannian(CComplexInfinity),
      Indeterminate, true)
  );
}
