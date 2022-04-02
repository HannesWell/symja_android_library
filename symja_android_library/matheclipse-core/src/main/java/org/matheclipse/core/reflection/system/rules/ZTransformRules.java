package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface ZTransformRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 1 };

  final public static IAST RULES = List(
    IInit(ZTransform, SIZES),
    // ZTransform(a_^n_,n_?NotListQ,z_?NotListQ):=z/(-a+z)/;FreeQ(a,n)&&FreeQ(a,z)
    ISetDelayed(ZTransform(Power(a_,n_),PatternTest(n_,NotListQ),PatternTest(z_,NotListQ)),
      Condition(Times(z,Power(Plus(Negate(a),z),CN1)),And(FreeQ(a,n),FreeQ(a,z))))
  );
}
