package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class HypergeometricURules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 2 };

  final public static IAST RULES = List(
    IInit(HypergeometricU, SIZES),
    // HypergeometricU(1,m_,z_):=E^z*z^(1-m)*Gamma(-1+m,z)
    ISetDelayed(HypergeometricU(C1,m_,z_),
      Times(Exp(z),Power(z,Subtract(C1,m)),Gamma(Plus(CN1,m),z))),
    // HypergeometricU(1/2,1,z_):=(E^(z/2)*BesselK(0,z/2))/Sqrt(Pi)
    ISetDelayed(HypergeometricU(C1D2,C1,z_),
      Times(Exp(Times(C1D2,z)),Power(Pi,CN1D2),BesselK(C0,Times(C1D2,z))))
  );
}
