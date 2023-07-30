package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface DRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 74 };

  final public static IAST RULES = List(
    IInit(D, SIZES),
    // D(Integrate(f_,x_),x_?NotListQ):=f
    ISetDelayed(D(Integrate(f_,x_),PatternTest(x_,NotListQ)),
      f),
    // D(Abs(f_),x_?NotListQ):=D(f,x)*x/Abs(x)/;x∈Reals
    ISetDelayed(D(Abs(f_),PatternTest(x_,NotListQ)),
      Condition(Times(D(f,x),x,Power(Abs(x),CN1)),Element(x,Reals))),
    // D(ExpIntegralE(g_,f_),x_?NotListQ):=-ExpIntegralE(-1+g,f)*D(f,x)/;FreeQ({g},x)
    ISetDelayed(D(ExpIntegralE(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(CN1,ExpIntegralE(Plus(CN1,g),f),D(f,x)),FreeQ(list(g),x))),
    // D(JacobiAmplitude(g_,f_),x_?NotListQ):=JacobiDN(f,g)*D(f,x)+(D(g,x)*(JacobiDN(f,g)*(f*(-1+g)+JacobiEpsilon(f,g))-g*JacobiCN(f,g)*JacobiSN(f,g)))/(2*(-1+g)*g)
    ISetDelayed(D(JacobiAmplitude(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(JacobiDN(f,g),D(f,x)),Times(Power(Times(C2,Plus(CN1,g),g),CN1),D(g,x),Plus(Times(JacobiDN(f,g),Plus(Times(f,Plus(CN1,g)),JacobiEpsilon(f,g))),Times(CN1,g,JacobiCN(f,g),JacobiSN(f,g)))))),
    // D(JacobiCD(g_,f_),x_?NotListQ):=(-1+g)*JacobiND(f,g)*JacobiSD(f,g)*D(f,x)+(D(g,x)*(f*(-1+g)+JacobiEpsilon(f,g))*JacobiND(f,g)*JacobiSD(f,g))/(2*g)
    ISetDelayed(D(JacobiCD(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(Plus(CN1,g),JacobiND(f,g),JacobiSD(f,g),D(f,x)),Times(Power(Times(C2,g),CN1),D(g,x),Plus(Times(f,Plus(CN1,g)),JacobiEpsilon(f,g)),JacobiND(f,g),JacobiSD(f,g)))),
    // D(JacobiCN(g_,f_),x_?NotListQ):=-JacobiDN(f,g)*JacobiSN(f,g)*D(f,x)+(D(g,x)*JacobiDN(f,g)*JacobiSN(f,g)*(f*(-1+g)+JacobiEpsilon(f,g)-g*JacobiCD(f,g)*JacobiSN(f,g)))/(2*(1-g)*g)
    ISetDelayed(D(JacobiCN(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(CN1,JacobiDN(f,g),JacobiSN(f,g),D(f,x)),Times(Power(Times(C2,Subtract(C1,g),g),CN1),D(g,x),JacobiDN(f,g),JacobiSN(f,g),Plus(Times(f,Plus(CN1,g)),JacobiEpsilon(f,g),Times(CN1,g,JacobiCD(f,g),JacobiSN(f,g)))))),
    // D(JacobiDC(g_,f_),x_?NotListQ):=(1-g)*JacobiNC(f,g)*JacobiSC(f,g)*D(f,x)+(D(g,x)*(f*(1-g)-JacobiEpsilon(f,g))*JacobiNC(f,g)*JacobiSC(f,g))/(2*g)
    ISetDelayed(D(JacobiDC(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(Subtract(C1,g),JacobiNC(f,g),JacobiSC(f,g),D(f,x)),Times(Power(Times(C2,g),CN1),D(g,x),Subtract(Times(f,Subtract(C1,g)),JacobiEpsilon(f,g)),JacobiNC(f,g),JacobiSC(f,g)))),
    // D(JacobiDN(g_,f_),x_?NotListQ):=-g*JacobiCN(f,g)*JacobiSN(f,g)*D(f,x)+(D(g,x)*JacobiCN(f,g)*(f*(-1+g)+JacobiEpsilon(f,g)-JacobiDN(f,g)*JacobiSC(f,g))*JacobiSN(f,g))/(2*(1-g))
    ISetDelayed(D(JacobiDN(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(CN1,g,JacobiCN(f,g),JacobiSN(f,g),D(f,x)),Times(Power(Times(C2,Subtract(C1,g)),CN1),D(g,x),JacobiCN(f,g),Plus(Times(f,Plus(CN1,g)),JacobiEpsilon(f,g),Times(CN1,JacobiDN(f,g),JacobiSC(f,g))),JacobiSN(f,g)))),
    // D(JacobiNC(g_,f_),x_?NotListQ):=JacobiDC(f,g)*JacobiSC(f,g)*D(f,x)+(D(g,x)*JacobiDC(f,g)*JacobiSC(f,g)*(f*(1-g)-JacobiEpsilon(f,g)+g*JacobiCD(f,g)*JacobiSN(f,g)))/(2*(1-g)*g)
    ISetDelayed(D(JacobiNC(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(JacobiDC(f,g),JacobiSC(f,g),D(f,x)),Times(Power(Times(C2,Subtract(C1,g),g),CN1),D(g,x),JacobiDC(f,g),JacobiSC(f,g),Plus(Times(f,Subtract(C1,g)),Negate(JacobiEpsilon(f,g)),Times(g,JacobiCD(f,g),JacobiSN(f,g)))))),
    // D(JacobiND(g_,f_),x_?NotListQ):=g*JacobiCD(f,g)*JacobiSD(f,g)*D(f,x)+(D(g,x)*JacobiCD(f,g)*(f*(1-g)-JacobiEpsilon(f,g)+JacobiDN(f,g)*JacobiSC(f,g))*JacobiSD(f,g))/(2*(1-g))
    ISetDelayed(D(JacobiND(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(g,JacobiCD(f,g),JacobiSD(f,g),D(f,x)),Times(Power(Times(C2,Subtract(C1,g)),CN1),D(g,x),JacobiCD(f,g),Plus(Times(f,Subtract(C1,g)),Negate(JacobiEpsilon(f,g)),Times(JacobiDN(f,g),JacobiSC(f,g))),JacobiSD(f,g)))),
    // D(JacobiSC(g_,f_),x_?NotListQ):=JacobiDC(f,g)*JacobiNC(f,g)*D(f,x)+(D(g,x)*JacobiDC(f,g)*JacobiNC(f,g)*(f*(1-g)-JacobiEpsilon(f,g)+g*JacobiCD(f,g)*JacobiSN(f,g)))/(2*(1-g)*g)
    ISetDelayed(D(JacobiSC(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(JacobiDC(f,g),JacobiNC(f,g),D(f,x)),Times(Power(Times(C2,Subtract(C1,g),g),CN1),D(g,x),JacobiDC(f,g),JacobiNC(f,g),Plus(Times(f,Subtract(C1,g)),Negate(JacobiEpsilon(f,g)),Times(g,JacobiCD(f,g),JacobiSN(f,g)))))),
    // D(JacobiSD(g_,f_),x_?NotListQ):=JacobiCD(f,g)*JacobiND(f,g)*D(f,x)+(D(g,x)*JacobiCD(f,g)*JacobiND(f,g)*(f*(1-g)-JacobiEpsilon(f,g)+g*JacobiDN(f,g)*JacobiSC(f,g)))/(2*(1-g)*g)
    ISetDelayed(D(JacobiSD(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(JacobiCD(f,g),JacobiND(f,g),D(f,x)),Times(Power(Times(C2,Subtract(C1,g),g),CN1),D(g,x),JacobiCD(f,g),JacobiND(f,g),Plus(Times(f,Subtract(C1,g)),Negate(JacobiEpsilon(f,g)),Times(g,JacobiDN(f,g),JacobiSC(f,g)))))),
    // D(JacobiSN(g_,f_),x_?NotListQ):=JacobiCN(f,g)*JacobiDN(f,g)*D(f,x)+(D(g,x)*JacobiCN(f,g)*JacobiDN(f,g)*(f*(1-g)-JacobiEpsilon(f,g)+g*JacobiCD(f,g)*JacobiSN(f,g)))/(2*(1-g)*g)
    ISetDelayed(D(JacobiSN(g_,f_),PatternTest(x_,NotListQ)),
      Plus(Times(JacobiCN(f,g),JacobiDN(f,g),D(f,x)),Times(Power(Times(C2,Subtract(C1,g),g),CN1),D(g,x),JacobiCN(f,g),JacobiDN(f,g),Plus(Times(f,Subtract(C1,g)),Negate(JacobiEpsilon(f,g)),Times(g,JacobiCD(f,g),JacobiSN(f,g)))))),
    // D(BernoulliB(g_,f_),x_?NotListQ):=BernoulliB(-1+g,f)*g*D(f,x)/;FreeQ({g},x)
    ISetDelayed(D(BernoulliB(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(BernoulliB(Plus(CN1,g),f),g,D(f,x)),FreeQ(list(g),x))),
    // D(ChebyshevT(g_,f_),x_?NotListQ):=ChebyshevU(-1+g,f)*g*D(f,x)/;FreeQ({g},x)
    ISetDelayed(D(ChebyshevT(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(ChebyshevU(Plus(CN1,g),f),g,D(f,x)),FreeQ(list(g),x))),
    // D(ChebyshevU(g_,f_),x_?NotListQ):=((ChebyshevU(-1+g,f)*(-1-g)+ChebyshevU(g,f)*f*g)*D(f,x))/(-1+f^2)/;FreeQ({g},x)
    ISetDelayed(D(ChebyshevU(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(Power(Plus(CN1,Sqr(f)),CN1),Plus(Times(ChebyshevU(Plus(CN1,g),f),Subtract(CN1,g)),Times(ChebyshevU(g,f),f,g)),D(f,x)),FreeQ(list(g),x))),
    // D(GegenbauerC(g_,f_),x_?NotListQ):=2*ChebyshevU(-1+g,f)*D(f,x)/;FreeQ({g},x)
    ISetDelayed(D(GegenbauerC(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(C2,ChebyshevU(Plus(CN1,g),f),D(f,x)),FreeQ(list(g),x))),
    // D(GegenbauerC(g_,h_,f_),x_?NotListQ):=2*GegenbauerC(-1+g,1+h,f)*h*D(f,x)/;FreeQ({g,h},x)
    ISetDelayed(D(GegenbauerC(g_,h_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(C2,GegenbauerC(Plus(CN1,g),Plus(C1,h),f),h,D(f,x)),FreeQ(list(g,h),x))),
    // D(LaguerreL(g_,f_),x_?NotListQ):=-LaguerreL(-1+g,1,f)*D(f,x)/;FreeQ({g},x)
    ISetDelayed(D(LaguerreL(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(CN1,LaguerreL(Plus(CN1,g),C1,f),D(f,x)),FreeQ(list(g),x))),
    // D(LaguerreL(g_,h_,f_),x_?NotListQ):=-LaguerreL(-1+g,1+h,f)*c/;FreeQ({g,h},x)
    ISetDelayed(D(LaguerreL(g_,h_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(CN1,LaguerreL(Plus(CN1,g),Plus(C1,h),f),c),FreeQ(list(g,h),x))),
    // D(LegendreP(g_,f_),x_?NotListQ):=(D(f,x)*(f*(-1-g)*LegendreP(g,f)+(1+g)*LegendreP(1+g,f)))/(-1+f^2)/;FreeQ({g},x)
    ISetDelayed(D(LegendreP(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(Power(Plus(CN1,Sqr(f)),CN1),D(f,x),Plus(Times(f,Subtract(CN1,g),LegendreP(g,f)),Times(Plus(C1,g),LegendreP(Plus(C1,g),f)))),FreeQ(list(g),x))),
    // D(LegendreP(g_,h_,f_),x_?NotListQ):=(D(f,x)*(f*(-1-g)*LegendreP(g,h,f)+(1+g-h)*LegendreP(1+g,h,f)))/(-1+f^2)/;FreeQ({g,h},x)
    ISetDelayed(D(LegendreP(g_,h_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(Power(Plus(CN1,Sqr(f)),CN1),D(f,x),Plus(Times(f,Subtract(CN1,g),LegendreP(g,h,f)),Times(Plus(C1,g,Negate(h)),LegendreP(Plus(C1,g),h,f)))),FreeQ(list(g,h),x))),
    // D(LegendreQ(g_,f_),x_?NotListQ):=(D(f,x)*(f*(-1-g)*LegendreQ(g,f)+(1+g)*LegendreQ(1+g,f)))/(-1+f^2)/;FreeQ({g},x)
    ISetDelayed(D(LegendreQ(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(Power(Plus(CN1,Sqr(f)),CN1),D(f,x),Plus(Times(f,Subtract(CN1,g),LegendreQ(g,f)),Times(Plus(C1,g),LegendreQ(Plus(C1,g),f)))),FreeQ(list(g),x))),
    // D(LegendreQ(g_,h_,f_),x_?NotListQ):=(D(f,x)*(f*(-1-g)*LegendreQ(g,h,f)+(1+g-h)*LegendreQ(1+g,h,f)))/(-1+f^2)/;FreeQ({g,h},x)
    ISetDelayed(D(LegendreQ(g_,h_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(Power(Plus(CN1,Sqr(f)),CN1),D(f,x),Plus(Times(f,Subtract(CN1,g),LegendreQ(g,h,f)),Times(Plus(C1,g,Negate(h)),LegendreQ(Plus(C1,g),h,f)))),FreeQ(list(g,h),x))),
    // D(PolyGamma(g_,f_),x_?NotListQ):=PolyGamma(1+g,f)*D(f,x)/;FreeQ({g},x)
    ISetDelayed(D(PolyGamma(g_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(PolyGamma(Plus(C1,g),f),D(f,x)),FreeQ(list(g),x))),
    // D(HurwitzZeta(f_,g_),x_?NotListQ):=-f*HurwitzZeta(1+f,g)*D(g,x)/;FreeQ({f},x)
    ISetDelayed(D(HurwitzZeta(f_,g_),PatternTest(x_,NotListQ)),
      Condition(Times(CN1,f,HurwitzZeta(Plus(C1,f),g),D(g,x)),FreeQ(list(f),x))),
    // D(Zeta(f_,g_),x_?NotListQ):=-f*Zeta(1+f,g)*D(g,x)/;FreeQ({f},x)
    ISetDelayed(D(Zeta(f_,g_),PatternTest(x_,NotListQ)),
      Condition(Times(CN1,f,Zeta(Plus(C1,f),g),D(g,x)),FreeQ(list(f),x))),
    // D(Hypergeometric0F1(a_,f_),x_?NotListQ):=(D(f,x)*Hypergeometric0F1(1+a,f))/a/;FreeQ(a,x)
    ISetDelayed(D(Hypergeometric0F1(a_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(Power(a,CN1),D(f,x),Hypergeometric0F1(Plus(C1,a),f)),FreeQ(a,x))),
    // D(Hypergeometric1F1(a_,b_,f_),x_?NotListQ):=(a*D(f,x)*Hypergeometric1F1(1+a,1+b,f))/b/;FreeQ({a,b},x)
    ISetDelayed(D(Hypergeometric1F1(a_,b_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(a,Power(b,CN1),D(f,x),Hypergeometric1F1(Plus(C1,a),Plus(C1,b),f)),FreeQ(list(a,b),x))),
    // D(Hypergeometric2F1(a_,b_,c_,f_),x_?NotListQ):=(a*b*D(f,x)*Hypergeometric2F1(1+a,1+b,1+c,f))/c/;FreeQ({a,b,c},x)
    ISetDelayed(D(Hypergeometric2F1(a_,b_,c_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(a,b,Power(c,CN1),D(f,x),Hypergeometric2F1(Plus(C1,a),Plus(C1,b),Plus(C1,c),f)),FreeQ(list(a,b,c),x))),
    // D(Hypergeometric2F1(a_,b_,c_,x_),{x_,n_}):=Hypergeometric2F1(a+n,b+n,c+n,x)*(Pochhammer(a,n)*Pochhammer(b,n))/Pochhammer(c,n)/;FreeQ({a,b,c,n},x)&&Negative(n)=!=True
    ISetDelayed(D(Hypergeometric2F1(a_,b_,c_,x_),list(x_,n_)),
      Condition(Times(Hypergeometric2F1(Plus(a,n),Plus(b,n),Plus(c,n),x),Pochhammer(a,n),Pochhammer(b,n),Power(Pochhammer(c,n),CN1)),And(FreeQ(List(a,b,c,n),x),UnsameQ(Negative(n),True)))),
    // D(Hypergeometric2F1Regularized(a_,b_,c_,f_),x_?NotListQ):=a*b*Hypergeometric2F1Regularized(1+a,1+b,1+c,f)*D(f,x)/;FreeQ({a,b,c},x)
    ISetDelayed(D(Hypergeometric2F1Regularized(a_,b_,c_,f_),PatternTest(x_,NotListQ)),
      Condition(Times(a,b,Hypergeometric2F1Regularized(Plus(C1,a),Plus(C1,b),Plus(C1,c),f),D(f,x)),FreeQ(list(a,b,c),x))),
    // D(HypergeometricU(f_,g_,h_),x_?NotListQ):=-f*HypergeometricU(1+f,1+g,h)*D(h,x)/;FreeQ({f,g},x)
    ISetDelayed(D(HypergeometricU(f_,g_,h_),PatternTest(x_,NotListQ)),
      Condition(Times(CN1,f,HypergeometricU(Plus(C1,f),Plus(C1,g),h),D(h,x)),FreeQ(list(f,g),x))),
    // D(WhittakerM(f_,g_,h_),x_?NotListQ):=((1/2-f/h)*WhittakerM(f,g,h)+((1/2+f+g)*WhittakerM(1+f,g,h))/h)*D(h,x)/;FreeQ({f,g},x)
    ISetDelayed(D(WhittakerM(f_,g_,h_),PatternTest(x_,NotListQ)),
      Condition(Times(Plus(Times(Plus(C1D2,Times(CN1,f,Power(h,CN1))),WhittakerM(f,g,h)),Times(Plus(C1D2,f,g),Power(h,CN1),WhittakerM(Plus(C1,f),g,h))),D(h,x)),FreeQ(list(f,g),x))),
    // D(WhittakerW(f_,g_,h_),x_?NotListQ):=((1/2-f/h)*WhittakerW(f,g,h)-WhittakerW(1+f,g,h)/h)*D(h,x)/;FreeQ({f,g},x)
    ISetDelayed(D(WhittakerW(f_,g_,h_),PatternTest(x_,NotListQ)),
      Condition(Times(Plus(Times(Plus(C1D2,Times(CN1,f,Power(h,CN1))),WhittakerW(f,g,h)),Times(CN1,Power(h,CN1),WhittakerW(Plus(C1,f),g,h))),D(h,x)),FreeQ(list(f,g),x))),
    // D(InverseFunction(f_)[x_],x_):=1/f'(InverseFunction(f)[x])/;FreeQ(f,x)
    ISetDelayed(D($(InverseFunction(f_),x_),x_),
      Condition(Power($($(Derivative(C1),f),$(InverseFunction(f),x)),CN1),FreeQ(f,x))),
    // D(ArcCos(x_),{x_,2}):=-x/(1-x^2)^(3/2)
    ISetDelayed(D(ArcCos(x_),list(x_,C2)),
      Times(CN1,x,Power(Subtract(C1,Sqr(x)),QQ(-3L,2L)))),
    // D(ArcCot(x_),{x_,2}):=(2*x)/(1+x^2)^2
    ISetDelayed(D(ArcCot(x_),list(x_,C2)),
      Times(C2,x,Power(Plus(C1,Sqr(x)),CN2))),
    // D(ArcSin(x_),{x_,2}):=x/(1-x^2)^(3/2)
    ISetDelayed(D(ArcSin(x_),list(x_,C2)),
      Times(x,Power(Subtract(C1,Sqr(x)),QQ(-3L,2L)))),
    // D(ArcTan(x_),{x_,2}):=((-1)*2*x)/(1+x^2)^2
    ISetDelayed(D(ArcTan(x_),list(x_,C2)),
      Times(CN1,C2,x,Power(Plus(C1,Sqr(x)),CN2))),
    // D(ArcCosh(x_),{x_,2}):=-x/((-1+x)^(3/2)*(1+x)^(3/2))
    ISetDelayed(D(ArcCosh(x_),list(x_,C2)),
      Times(CN1,x,Power(Times(Power(Plus(CN1,x),QQ(3L,2L)),Power(Plus(C1,x),QQ(3L,2L))),CN1))),
    // D(ArcCoth(x_),{x_,2}):=(2*x)/(1-x^2)^2
    ISetDelayed(D(ArcCoth(x_),list(x_,C2)),
      Times(C2,x,Power(Subtract(C1,Sqr(x)),CN2))),
    // D(ArcSinh(x_),{x_,2}):=-x/(1+x^2)^(3/2)
    ISetDelayed(D(ArcSinh(x_),list(x_,C2)),
      Times(CN1,x,Power(Plus(C1,Sqr(x)),QQ(-3L,2L)))),
    // D(ArcTanh(x_),{x_,2}):=(2*x)/(1-x^2)^2
    ISetDelayed(D(ArcTanh(x_),list(x_,C2)),
      Times(C2,x,Power(Subtract(C1,Sqr(x)),CN2))),
    // D(ArcCsc(x_),{x_,2}):=(-1+2*x^2)/(Sqrt(1-1/x^2)*x^3*(-1+x^2))
    ISetDelayed(D(ArcCsc(x_),list(x_,C2)),
      Times(Plus(CN1,Times(C2,Sqr(x))),Power(Times(Sqrt(Subtract(C1,Power(x,CN2))),Power(x,C3),Plus(CN1,Sqr(x))),CN1))),
    // D(ArcSec(x_),{x_,2}):=(1-2*x^2)/(Sqrt(1-1/x^2)*x^3*(-1+x^2))
    ISetDelayed(D(ArcSec(x_),list(x_,C2)),
      Times(Plus(C1,Times(CN2,Sqr(x))),Power(Times(Sqrt(Subtract(C1,Power(x,CN2))),Power(x,C3),Plus(CN1,Sqr(x))),CN1))),
    // D(Cos(x_),{x_,2}):=-Cos(x)
    ISetDelayed(D(Cos(x_),list(x_,C2)),
      Negate(Cos(x))),
    // D(Cot(x_),{x_,2}):=2*Cot(x)*Csc(x)^2
    ISetDelayed(D(Cot(x_),list(x_,C2)),
      Times(C2,Cot(x),Sqr(Csc(x)))),
    // D(Sin(x_),{x_,2}):=-Sin(x)
    ISetDelayed(D(Sin(x_),list(x_,C2)),
      Negate(Sin(x))),
    // D(Tan(x_),{x_,2}):=2*Sec(x)^2*Tan(x)
    ISetDelayed(D(Tan(x_),list(x_,C2)),
      Times(C2,Sqr(Sec(x)),Tan(x))),
    // D(Csc(x_),{x_,2}):=Csc(x)^3+Csc(x)*Cot(x)^2
    ISetDelayed(D(Csc(x_),list(x_,C2)),
      Plus(Power(Csc(x),C3),Times(Csc(x),Sqr(Cot(x))))),
    // D(Sec(x_),{x_,2}):=Sec(x)^3+Sec(x)*Tan(x)^2
    ISetDelayed(D(Sec(x_),list(x_,C2)),
      Plus(Power(Sec(x),C3),Times(Sec(x),Sqr(Tan(x))))),
    // D(x_^a_,{x_,n_}):=If(IntegerQ(n),Pochhammer(a-n+1,n)*x^(a-n),FactorialPower(a,n)*x^(a-n))/;((IntegerQ(n)&&n>=0)||SymbolQ(n))&&FreeQ(a,x)
    ISetDelayed(D(Power(x_,a_),list(x_,n_)),
      Condition(If(IntegerQ(n),Times(Pochhammer(Plus(a,Negate(n),C1),n),Power(x,Subtract(a,n))),Times(FactorialPower(a,n),Power(x,Subtract(a,n)))),And(Or(And(IntegerQ(n),GreaterEqual(n,C0)),SymbolQ(n)),FreeQ(a,x)))),
    // D(a_^x_,{x_,n_Integer}):=a^x*Log(a)^n/;((IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ))&&FreeQ(a,x)
    ISetDelayed(D(Power(a_,x_),list(x_,$p(n, Integer))),
      Condition(Times(Power(a,x),Power(Log(a),n)),And(Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))),FreeQ(a,x)))),
    // D(ArcCos(x_),{x_,n_Integer}):=KroneckerDelta(n)*ArcCos(x)-1/((-1)^(1-n)*(1-x^2)^(-1/2+n))*Sum((Pochhammer(1-n,k)*Pochhammer(1/2,k)*2^(1+2*k-n)*x^(1+2*k-n)*(-1+x^2)^(-1-k+n))/(2*k-n+1)!,{k,0,-1+n})/;(IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ)
    ISetDelayed(D(ArcCos(x_),list(x_,$p(n, Integer))),
      Condition(Plus(Times(KroneckerDelta(n),ArcCos(x)),Times(CN1,Power(CN1,Plus(CN1,n)),Power(Power(Subtract(C1,Sqr(x)),Plus(CN1D2,n)),CN1),Sum(Times(Power(Factorial(Plus(Times(C2,k),Negate(n),C1)),CN1),Pochhammer(Subtract(C1,n),k),Pochhammer(C1D2,k),Power(C2,Plus(C1,Times(C2,k),Negate(n))),Power(x,Plus(C1,Times(C2,k),Negate(n))),Power(Plus(CN1,Sqr(x)),Plus(CN1,Negate(k),n))),list(k,C0,Plus(CN1,n))))),Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))))),
    // D(ArcCot(x_),{x_,n_Integer}):=KroneckerDelta(n)*ArcCot(x)-Sum(((-1)^k*1/((-1-k+n)!/(2*x)^(1+2*k-n))*k!*Pochhammer(2*k-n+2,-2+2*(-k+n)))/(1+x^2)^(1+k),{k,0,-1+n})/;(IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ)
    ISetDelayed(D(ArcCot(x_),list(x_,$p(n, Integer))),
      Condition(Subtract(Times(KroneckerDelta(n),ArcCot(x)),Sum(Times(Power(CN1,k),Power(Times(Factorial(Plus(CN1,Negate(k),n)),Power(Times(C2,x),Plus(CN1,Times(CN2,k),n))),CN1),Factorial(k),Pochhammer(Plus(Times(C2,k),Negate(n),C2),Plus(CN2,Times(C2,Plus(Negate(k),n)))),Power(Plus(C1,Sqr(x)),Subtract(CN1,k))),list(k,C0,Plus(CN1,n)))),Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))))),
    // D(ArcSin(x_),{x_,n_Integer}):=KroneckerDelta(n)*ArcSin(x)+1/((-1)^(1-n)*(1-x^2)^(-1/2+n))*Sum((2^(1+2*k-n)*x^(1+2*k-n)*Pochhammer(1/2,k)*Pochhammer(1-n,k))/((-1+x^2)^(1+k-n)*(2*k-n+1)!),{k,0,-1+n})/;(IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ)
    ISetDelayed(D(ArcSin(x_),list(x_,$p(n, Integer))),
      Condition(Plus(Times(KroneckerDelta(n),ArcSin(x)),Times(Power(CN1,Plus(CN1,n)),Power(Power(Subtract(C1,Sqr(x)),Plus(CN1D2,n)),CN1),Sum(Times(Power(C2,Plus(C1,Times(C2,k),Negate(n))),Power(x,Plus(C1,Times(C2,k),Negate(n))),Power(Plus(CN1,Sqr(x)),Plus(CN1,Negate(k),n)),Power(Factorial(Plus(Times(C2,k),Negate(n),C1)),CN1),Pochhammer(C1D2,k),Pochhammer(Subtract(C1,n),k)),list(k,C0,Plus(CN1,n))))),Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))))),
    // D(ArcTan(x_),{x_,n_Integer}):=KroneckerDelta(n)*ArcTan(x)+Sum(((-1)^k*1/((-1-k+n)!/(2*x)^(1+2*k-n))*k!*Pochhammer(2*k-n+2,-2+2*(-k+n)))/(1+x^2)^(1+k),{k,0,-1+n})/;(IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ)
    ISetDelayed(D(ArcTan(x_),list(x_,$p(n, Integer))),
      Condition(Plus(Times(KroneckerDelta(n),ArcTan(x)),Sum(Times(Power(CN1,k),Power(Times(Factorial(Plus(CN1,Negate(k),n)),Power(Times(C2,x),Plus(CN1,Times(CN2,k),n))),CN1),Factorial(k),Pochhammer(Plus(Times(C2,k),Negate(n),C2),Plus(CN2,Times(C2,Plus(Negate(k),n)))),Power(Plus(C1,Sqr(x)),Subtract(CN1,k))),list(k,C0,Plus(CN1,n)))),Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))))),
    // D(Cot(x_),{x_,n_Integer}):=-Csc(x)^2*KroneckerDelta(-1+n)+Cot(x)*KroneckerDelta(n)-n*Sum((((-1)^j*Binomial(-1+n,k))/(k+1)*Binomial(2*k,j)*Sin(1/2*n*Pi+2*(-j+k)*x))/(Sin(x)^(2+2*k)*2^(2*k-n)*(-j+k)^(1-n)),{k,0,-1+n},{j,0,-1+k})/;(IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ)
    ISetDelayed(D(Cot(x_),list(x_,$p(n, Integer))),
      Condition(Plus(Times(CN1,Sqr(Csc(x)),KroneckerDelta(Plus(CN1,n))),Times(Cot(x),KroneckerDelta(n)),Times(CN1,n,Sum(Times(Power(CN1,j),Power(Plus(k,C1),CN1),Binomial(Plus(CN1,n),k),Power(Sin(x),Plus(CN2,Times(CN2,k))),Power(C2,Plus(Times(CN2,k),n)),Binomial(Times(C2,k),j),Power(Plus(Negate(j),k),Plus(CN1,n)),Sin(Plus(Times(C1D2,n,Pi),Times(C2,Plus(Negate(j),k),x)))),list(k,C0,Plus(CN1,n)),list(j,C0,Plus(CN1,k))))),Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))))),
    // D(Tan(x_),{x_,n_Integer}):=Tan(x)*KroneckerDelta(n)+Sec(x)^2*KroneckerDelta(-1+n)+n*Sum((((-1)^k*Binomial(-1+n,k))/(k+1)*Binomial(2*k,j)*Sin(1/2*n*Pi+2*(-j+k)*x))/(Cos(x)^(2+2*k)*2^(2*k-n)*(-j+k)^(1-n)),{k,0,-1+n},{j,0,-1+k})/;(IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ)
    ISetDelayed(D(Tan(x_),list(x_,$p(n, Integer))),
      Condition(Plus(Times(Tan(x),KroneckerDelta(n)),Times(Sqr(Sec(x)),KroneckerDelta(Plus(CN1,n))),Times(n,Sum(Times(Power(CN1,k),Power(Plus(k,C1),CN1),Binomial(Plus(CN1,n),k),Power(Cos(x),Plus(CN2,Times(CN2,k))),Power(C2,Plus(Times(CN2,k),n)),Binomial(Times(C2,k),j),Power(Plus(Negate(j),k),Plus(CN1,n)),Sin(Plus(Times(C1D2,n,Pi),Times(C2,Plus(Negate(j),k),x)))),list(k,C0,Plus(CN1,n)),list(j,C0,Plus(CN1,k))))),Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))))),
    // D(Log(x_),{x_,n_Integer}):=(-1+n)!/((-1)^(1-n)*x^n)/;(IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ)
    ISetDelayed(D(Log(x_),list(x_,$p(n, Integer))),
      Condition(Times(Power(CN1,Plus(CN1,n)),Power(Power(x,n),CN1),Factorial(Plus(CN1,n))),Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))))),
    // D(PolyGamma(0,x_),{x_,n_}):=PolyGamma(n,x)/;(IntegerQ(n)&&n>=0)||FreeQ(n,_?NumberQ)
    ISetDelayed(D(PolyGamma(C0,x_),list(x_,n_)),
      Condition(PolyGamma(n,x),Or(And(IntegerQ(n),GreaterEqual(n,C0)),FreeQ(n,PatternTest($b(),NumberQ))))),
    // D(ArcTan(f_,g_),x_?NotListQ):=With({d=(-g*D(f,x)+f*D(g,x))/(f^2+g^2)},If(PossibleZeroQ(d),0,d))
    ISetDelayed(D(ArcTan(f_,g_),PatternTest(x_,NotListQ)),
      With(list(Set(d,Times(Power(Plus(Sqr(f),Sqr(g)),CN1),Plus(Times(CN1,g,D(f,x)),Times(f,D(g,x)))))),If(PossibleZeroQ(d),C0,d))),
    // D(BesselJ(f_,g_),x_?NotListQ):=1/2*(BesselJ(-1+f,g)-BesselJ(1+f,g))*D(g,x)+D(f,x)*Derivative(1,0)[BesselJ][f,g]
    ISetDelayed(D(BesselJ(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(C1D2,Subtract(BesselJ(Plus(CN1,f),g),BesselJ(Plus(C1,f),g)),D(g,x)),Times(D(f,x),$($(Derivative(C1,C0),BesselJ),f,g)))),
    // D(BesselY(f_,g_),x_?NotListQ):=1/2*(BesselY(-1+f,g)-BesselY(1+f,g))*D(g,x)+D(f,x)*Derivative(1,0)[BesselY][f,g]
    ISetDelayed(D(BesselY(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(C1D2,Subtract(BesselY(Plus(CN1,f),g),BesselY(Plus(C1,f),g)),D(g,x)),Times(D(f,x),$($(Derivative(C1,C0),BesselY),f,g)))),
    // D(CarlsonRC(f_,g_),x_?NotListQ):=Piecewise({{(-CarlsonRC(f,g)+1/Sqrt(f))/(2*(f-g)),f!=g},{-1/(6*f^(3/2)),f==g&&(Im(g)!=0||Re(g)>0)}},ComplexInfinity)*D(f,x)+Piecewise({{(-Sqrt(f)/g+CarlsonRC(f,g))/(2*(f-g)),f!=g},{-1/(3*f^(3/2)),f==g&&(Im(g)!=0||Re(g)>0)}},ComplexInfinity)*D(g,x)
    ISetDelayed(D(CarlsonRC(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(Piecewise(list(list(Times(Plus(Negate(CarlsonRC(f,g)),Power(f,CN1D2)),Power(Times(C2,Subtract(f,g)),CN1)),Unequal(f,g)),list(Negate(Power(Times(C6,Power(f,QQ(3L,2L))),CN1)),And(Equal(f,g),Or(Unequal(Im(g),C0),Greater(Re(g),C0))))),CComplexInfinity),D(f,x)),Times(Piecewise(list(list(Times(Power(Times(C2,Subtract(f,g)),CN1),Plus(Times(CN1,Sqrt(f),Power(g,CN1)),CarlsonRC(f,g))),Unequal(f,g)),list(Negate(Power(Times(C3,Power(f,QQ(3L,2L))),CN1)),And(Equal(f,g),Or(Unequal(Im(g),C0),Greater(Re(g),C0))))),CComplexInfinity),D(g,x)))),
    // D(CarlsonRD(f_,g_,h_),x_?NotListQ):=-1/6*CarlsonRD(g,h,f)*D(f,x)-1/6*CarlsonRD(f,h,g)*D(g,x)-1/6*CarlsonRD(f,g,h)*D(h,x)
    ISetDelayed(D(CarlsonRD(f_,g_,h_),PatternTest(x_,NotListQ)),
      Plus(Times(QQ(-1L,6L),CarlsonRD(g,h,f),D(f,x)),Times(QQ(-1L,6L),CarlsonRD(f,h,g),D(g,x)),Times(QQ(-1L,6L),CarlsonRD(f,g,h),D(h,x)))),
    // D(CarlsonRF(f_,g_,h_),x_?NotListQ):=-1/6*CarlsonRD(g,h,f)*D(f,x)-1/6*CarlsonRD(f,h,g)*D(g,x)-1/6*CarlsonRD(f,g,h)*D(h,x)
    ISetDelayed(D(CarlsonRF(f_,g_,h_),PatternTest(x_,NotListQ)),
      Plus(Times(QQ(-1L,6L),CarlsonRD(g,h,f),D(f,x)),Times(QQ(-1L,6L),CarlsonRD(f,h,g),D(g,x)),Times(QQ(-1L,6L),CarlsonRD(f,g,h),D(h,x)))),
    // D(CarlsonRG(f_,g_,h_),x_?NotListQ):=1/12*(-f*CarlsonRD(g,h,f)+3*CarlsonRF(f,g,h))*D(f,x)+1/12*(-g*CarlsonRD(f,h,g)+3*CarlsonRF(f,g,h))*D(g,x)+1/12*(-h*CarlsonRD(f,g,h)+3*CarlsonRF(f,g,h))*D(h,x)
    ISetDelayed(D(CarlsonRG(f_,g_,h_),PatternTest(x_,NotListQ)),
      Plus(Times(QQ(1L,12L),Plus(Times(CN1,f,CarlsonRD(g,h,f)),Times(C3,CarlsonRF(f,g,h))),D(f,x)),Times(QQ(1L,12L),Plus(Times(CN1,g,CarlsonRD(f,h,g)),Times(C3,CarlsonRF(f,g,h))),D(g,x)),Times(QQ(1L,12L),Plus(Times(CN1,h,CarlsonRD(f,g,h)),Times(C3,CarlsonRF(f,g,h))),D(h,x)))),
    // D(PolyLog(f_,g_),x_?NotListQ):=(D(g,x)*PolyLog(-1+f,g))/g+D(f,x)*Derivative(1,0)[PolyLog][f,g]
    ISetDelayed(D(PolyLog(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(Power(g,CN1),D(g,x),PolyLog(Plus(CN1,f),g)),Times(D(f,x),$($(Derivative(C1,C0),PolyLog),f,g)))),
    // D(ProductLog(f_),x_?NotListQ):=(D(f,x)*ProductLog(f))/(f*(1+ProductLog(f)))
    ISetDelayed(D(ProductLog(f_),PatternTest(x_,NotListQ)),
      Times(D(f,x),ProductLog(f),Power(Times(f,Plus(C1,ProductLog(f))),CN1))),
    // D(ProductLog(f_,g_),x_?NotListQ):=ProductLog(f,g)*D(g,x)/(g*(1+ProductLog(f,g)))+D(f,x)*Derivative(1,0)[ProductLog][f,g]
    ISetDelayed(D(ProductLog(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(ProductLog(f,g),D(g,x),Power(Times(g,Plus(C1,ProductLog(f,g))),CN1)),Times(D(f,x),$($(Derivative(C1,C0),ProductLog),f,g)))),
    // D(JacobiAmplitude(f_,g_),x_?NotListQ):=JacobiDN(f,g)*D(f,x)+(D(g,x)*((EllipticE(JacobiAmplitude(f,g),g)+f*(-1+g))*JacobiDN(f,g)-g*JacobiCN(f,g)*JacobiSN(f,g)))/(2*(-1+g)*g)
    ISetDelayed(D(JacobiAmplitude(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(JacobiDN(f,g),D(f,x)),Times(Power(Times(C2,Plus(CN1,g),g),CN1),D(g,x),Plus(Times(Plus(EllipticE(JacobiAmplitude(f,g),g),Times(f,Plus(CN1,g))),JacobiDN(f,g)),Times(CN1,g,JacobiCN(f,g),JacobiSN(f,g)))))),
    // D(StruveH(f_,g_),x_?NotListQ):=1/2*(g^f/(2^f*Sqrt(Pi)*Gamma(3/2+f))+StruveH(-1+f,g)-StruveH(1+f,g))*D(g,x)+D(f,x)*Derivative(1,0)[StruveH][f,g]
    ISetDelayed(D(StruveH(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(C1D2,Plus(Times(Power(g,f),Power(Times(Power(C2,f),CSqrtPi,Gamma(Plus(QQ(3L,2L),f))),CN1)),StruveH(Plus(CN1,f),g),Negate(StruveH(Plus(C1,f),g))),D(g,x)),Times(D(f,x),$($(Derivative(C1,C0),StruveH),f,g)))),
    // D(StruveL(f_,g_),x_?NotListQ):=1/2*(g^f/(2^f*Sqrt(Pi)*Gamma(3/2+f))+StruveL(-1+f,g)+StruveL(1+f,g))*D(g,x)+D(f,x)*Derivative(1,0)[StruveL][f,g]
    ISetDelayed(D(StruveL(f_,g_),PatternTest(x_,NotListQ)),
      Plus(Times(C1D2,Plus(Times(Power(g,f),Power(Times(Power(C2,f),CSqrtPi,Gamma(Plus(QQ(3L,2L),f))),CN1)),StruveL(Plus(CN1,f),g),StruveL(Plus(C1,f),g)),D(g,x)),Times(D(f,x),$($(Derivative(C1,C0),StruveL),f,g))))
  );
}
