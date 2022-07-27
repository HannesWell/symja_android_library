package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface LerchPhiRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 6, 1 };

  final public static IAST RULES = List(
    IInit(LerchPhi, SIZES),
    // LerchPhi(-1,1,0)=-Log(2)
    ISet(LerchPhi(CN1,C1,C0),
      Negate(Log(C2))),
    // LerchPhi(-1,2,1/2)=4*Catalan
    ISet(LerchPhi(CN1,C2,C1D2),
      Times(C4,Catalan)),
    // LerchPhi(0,1,0)=0
    ISet(LerchPhi(C0,C1,C0),
      C0),
    // LerchPhi(1,1,0)=Infinity
    ISet(LerchPhi(C1,C1,C0),
      oo),
    // LerchPhi(1,2,1)=Pi^2/6
    ISet(LerchPhi(C1,C2,C1),
      Times(QQ(1L,6L),Sqr(Pi))),
    // LerchPhi(2,1,0)=-I*Pi
    ISet(LerchPhi(C2,C1,C0),
      Times(CNI,Pi)),
    // LerchPhi(1/2-I*1/2,2,1):=(1+I)*PolyLog(2,1/2-I/2)
    ISetDelayed(LerchPhi(CC(1L,2L,-1L,2L),C2,C1),
      Times(Plus(C1,CI),PolyLog(C2,Plus(C1D2,Times(CN1D2,CI))))),
    // LerchPhi(z_,s_,i_Integer):=Module({n=-i},z^n*(PolyLog(s,z)+Sum(1/(z^k*k^s),{k,1,n}))/;i<0)
    ISetDelayed(LerchPhi(z_,s_,$p(i, Integer)),
      Module(list(Set(n,Negate(i))),Condition(Times(Power(z,n),Plus(PolyLog(s,z),Sum(Power(Times(Power(z,k),Power(k,s)),CN1),list(k,C1,n)))),Less(i,C0)))),
    // LerchPhi(z_,s_,n_Integer):=(PolyLog(s,z)-Sum(z^k/k^s,{k,1,-1+n}))/z^n/;n>0
    ISetDelayed(LerchPhi(z_,s_,$p(n, Integer)),
      Condition(Times(Power(Power(z,n),CN1),Subtract(PolyLog(s,z),Sum(Times(Power(Power(k,s),CN1),Power(z,k)),list(k,C1,Plus(CN1,n))))),Greater(n,C0)))
  );
}