package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class HypergeometricPFQRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 11 };

  final public static IAST RULES = List(
    IInit(HypergeometricPFQ, SIZES),
    // HypergeometricPFQ({},{},z_):=E^z
    ISetDelayed(HypergeometricPFQ(List(),List(),z_),
      Exp(z)),
    // HypergeometricPFQ({a_},{},z_):=(1-z)^(-a)
    ISetDelayed(HypergeometricPFQ(list(a_),List(),z_),
      Power(Subtract(C1,z),Negate(a))),
    // HypergeometricPFQ({},{b_},z_):=z^(1/2-b/2)*BesselI(-1+b,2*Sqrt(z))*Gamma(b)
    ISetDelayed(HypergeometricPFQ(List(),list(b_),z_),
      Times(Power(z,Plus(C1D2,Times(CN1D2,b))),BesselI(Plus(CN1,b),Times(C2,Sqrt(z))),Gamma(b))),
    // HypergeometricPFQ({a_,b_},{c_,b_},z_):=HypergeometricPFQ({a},{c},z)
    ISetDelayed(HypergeometricPFQ(list(a_,b_),list(c_,b_),z_),
      HypergeometricPFQ(list(a),list(c),z)),
    // HypergeometricPFQ({1/2,b_},{3/2,c_},z_):=b/(-1+2*b)*(Sqrt(Pi/z)*Erfi(Sqrt(z))-(Gamma(b)-Gamma(b,-z))/(-z)^b)/;PossibleZeroQ(1+b-c)
    ISetDelayed(HypergeometricPFQ(list(C1D2,b_),list(QQ(3L,2L),c_),z_),
      Condition(Times(b,Power(Plus(CN1,Times(C2,b)),CN1),Plus(Times(Sqrt(Times(Pi,Power(z,CN1))),Erfi(Sqrt(z))),Times(CN1,Power(Power(Negate(z),b),CN1),Subtract(Gamma(b),Gamma(b,Negate(z)))))),PossibleZeroQ(Plus(C1,b,Negate(c))))),
    // HypergeometricPFQ({1,1},{2,2},z_):=-(EulerGamma+Gamma(0,-z)+Log(-z))/z
    ISetDelayed(HypergeometricPFQ(list(C1,C1),list(C2,C2),z_),
      Times(CN1,Power(z,CN1),Plus(EulerGamma,Gamma(C0,Negate(z)),Log(Negate(z))))),
    // HypergeometricPFQ({1/2},{3/2,3/2},z_):=SinhIntegral(2*Sqrt(z))/(2*Sqrt(z))
    ISetDelayed(HypergeometricPFQ(list(C1D2),list(QQ(3L,2L),QQ(3L,2L)),z_),
      Times(Power(Times(C2,Sqrt(z)),CN1),SinhIntegral(Times(C2,Sqrt(z))))),
    // HypergeometricPFQ({1,1},{2,2,3/2},z_):=(-EulerGamma+CoshIntegral(2*Sqrt(z))-Log(2*Sqrt(z)))/z
    ISetDelayed(HypergeometricPFQ(list(C1,C1),list(C2,C2,QQ(3L,2L)),z_),
      Times(Power(z,CN1),Plus(Negate(EulerGamma),CoshIntegral(Times(C2,Sqrt(z))),Negate(Log(Times(C2,Sqrt(z))))))),
    // HypergeometricPFQ({1,1,1},{2,2},z_):=PolyLog(2,z)/z
    ISetDelayed(HypergeometricPFQ(list(C1,C1,C1),list(C2,C2),z_),
      Times(Power(z,CN1),PolyLog(C2,z))),
    // HypergeometricPFQ({1},{1/2,c_},z_):=1+Sqrt(Pi)*z^(1/4*(3-2*c))*Gamma(c)*StruveL(1+1/2*(-3+2*c),2*Sqrt(z))
    ISetDelayed(HypergeometricPFQ(list(C1),list(C1D2,c_),z_),
      Plus(C1,Times(CSqrtPi,Power(z,Times(C1D4,Plus(C3,Times(CN2,c)))),Gamma(c),StruveL(Plus(C1,Times(C1D2,Plus(CN3,Times(C2,c)))),Times(C2,Sqrt(z)))))),
    // HypergeometricPFQ({1},{3/2,c_},z_):=1/2*Sqrt(Pi)*z^(1/4-c/2)*Gamma(c)*StruveL(-3/2+c,2*Sqrt(z))
    ISetDelayed(HypergeometricPFQ(list(C1),list(QQ(3L,2L),c_),z_),
      Times(C1D2,CSqrtPi,Power(z,Plus(C1D4,Times(CN1D2,c))),Gamma(c),StruveL(Plus(QQ(-3L,2L),c),Times(C2,Sqrt(z)))))
  );
}
