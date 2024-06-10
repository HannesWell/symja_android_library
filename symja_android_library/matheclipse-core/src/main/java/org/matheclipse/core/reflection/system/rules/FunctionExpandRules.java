package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class FunctionExpandRules {
  final public static IAST RULES = List(
    // Abs(x_^n_Integer):=(Im(x)^2+Re(x)^2)^(n/2)/;EvenQ(n)
    SetDelayed(Abs(Power(x_,$p(n, Integer))),
      Condition(Power(Plus(Sqr(Im(x)),Sqr(Re(x))),Times(C1D2,n)),EvenQ(n))),
    // ArcCos(1/x_):=ArcSec(x)
    SetDelayed(ArcCos(Power(x_,CN1)),
      ArcSec(x)),
    // ArcSec(1/x_):=ArcCos(x)
    SetDelayed(ArcSec(Power(x_,CN1)),
      ArcCos(x)),
    // ArcCot(Sqrt(x_^2)):=(Sqrt(x^2)*ArcCot(x))/x
    SetDelayed(ArcCot(Sqrt(Sqr(x_))),
      Times(Power(x,CN1),Sqrt(Sqr(x)),ArcCot(x))),
    // ArcCot(1/x_):=ArcTan(x)
    SetDelayed(ArcCot(Power(x_,CN1)),
      ArcTan(x)),
    // ArcTan(Sqrt(x_^2)):=(Sqrt(x^2)*ArcTan(x))/x
    SetDelayed(ArcTan(Sqrt(Sqr(x_))),
      Times(Power(x,CN1),Sqrt(Sqr(x)),ArcTan(x))),
    // ArcTan(1/x_):=ArcCot(x)
    SetDelayed(ArcTan(Power(x_,CN1)),
      ArcCot(x)),
    // ArcCsc(Sqrt(x_^2)):=(Sqrt(x^2)*ArcCsc(x))/x
    SetDelayed(ArcCsc(Sqrt(Sqr(x_))),
      Times(Power(x,CN1),Sqrt(Sqr(x)),ArcCsc(x))),
    // ArcCsc(1/x_):=ArcSin(x)
    SetDelayed(ArcCsc(Power(x_,CN1)),
      ArcSin(x)),
    // ArcSin(Sqrt(x_^2)):=(Sqrt(x^2)*ArcSin(x))/x
    SetDelayed(ArcSin(Sqrt(Sqr(x_))),
      Times(Power(x,CN1),Sqrt(Sqr(x)),ArcSin(x))),
    // ArcSin(1/x_):=ArcCsc(x)
    SetDelayed(ArcSin(Power(x_,CN1)),
      ArcCsc(x)),
    // Cos(n_Integer*ArcSin(z_)):=ChebyshevT(n,Sqrt(1-z^2))/;n>0
    SetDelayed(Cos(Times(ArcSin(z_),$p(n, Integer))),
      Condition(ChebyshevT(n,Sqrt(Subtract(C1,Sqr(z)))),Greater(n,C0))),
    // CosIntegral(Sqrt(z_^n_)):=CosIntegral(z^(n/2))-Log(z^(n/2))+Log(z^n)/2
    SetDelayed(CosIntegral(Sqrt(Power(z_,n_))),
      Plus(CosIntegral(Power(z,Times(C1D2,n))),Negate(Log(Power(z,Times(C1D2,n)))),Times(C1D2,Log(Power(z,n))))),
    // CoshIntegral(Sqrt(z_^n_)):=CoshIntegral(z^(n/2))-Log(z^(n/2))+Log(z^n)/2
    SetDelayed(CoshIntegral(Sqrt(Power(z_,n_))),
      Plus(CoshIntegral(Power(z,Times(C1D2,n))),Negate(Log(Power(z,Times(C1D2,n)))),Times(C1D2,Log(Power(z,n))))),
    // Erf(Sqrt(a_^b_)):=(Sqrt(a^b)*Erf(a^(b/2)))/a^(b/2)
    SetDelayed(Erf(Sqrt(Power(a_,b_))),
      Times(Power(Power(a,Times(C1D2,b)),CN1),Sqrt(Power(a,b)),Erf(Power(a,Times(C1D2,b))))),
    // Erf(1/Sqrt(a_^b_)):=(a^(b/2)*Erf(a^((-1)*1/2*b)))/Sqrt(a^b)
    SetDelayed(Erf(Power(Power(a_,b_),CN1D2)),
      Times(Power(a,Times(C1D2,b)),Power(Power(a,b),CN1D2),Erf(Power(a,Times(CN1,C1D2,b))))),
    // Erfc(a_^b_):=1-Erf(a^b)
    SetDelayed(Erfc(Power(a_,b_)),
      Subtract(C1,Erf(Power(a,b)))),
    // Erfi(Sqrt(a_^b_)):=(Sqrt(a^b)*Erfi(a^(b/2)))/a^(b/2)
    SetDelayed(Erfi(Sqrt(Power(a_,b_))),
      Times(Power(Power(a,Times(C1D2,b)),CN1),Sqrt(Power(a,b)),Erfi(Power(a,Times(C1D2,b))))),
    // Erfi(1/Sqrt(a_^b_)):=(a^(b/2)*Erfi(a^((-1)*1/2*b)))/Sqrt(a^b)
    SetDelayed(Erfi(Power(Power(a_,b_),CN1D2)),
      Times(Power(a,Times(C1D2,b)),Power(Power(a,b),CN1D2),Erfi(Power(a,Times(CN1,C1D2,b))))),
    // ExpIntegralEi(Log(z_)):=LogIntegral(z)
    SetDelayed(ExpIntegralEi(Log(z_)),
      LogIntegral(z)),
    // FactorialPower(x_,n_Integer,-1):=Product(x+k,{k,0,-1+n})/;n>0
    SetDelayed(FactorialPower(x_,$p(n, Integer),CN1),
      Condition(Product(Plus(x,k),list(k,C0,Plus(CN1,n))),Greater(n,C0))),
    // FactorialPower(x_,n_,-1):=(x^n*Gamma(1-x))/((-x)^n*Gamma(1-n-x))
    SetDelayed(FactorialPower(x_,n_,CN1),
      Times(Power(x,n),Gamma(Subtract(C1,x)),Power(Times(Power(Negate(x),n),Gamma(Plus(C1,Negate(n),Negate(x)))),CN1))),
    // FactorialPower(x_,n_Integer):=Product(-k+x,{k,0,-1+n})/;n>0
    SetDelayed(FactorialPower(x_,$p(n, Integer)),
      Condition(Product(Plus(Negate(k),x),list(k,C0,Plus(CN1,n))),Greater(n,C0))),
    // FactorialPower(x_,n_):=Gamma(1+x)/Gamma(1-n+x)
    SetDelayed(FactorialPower(x_,n_),
      Times(Gamma(Plus(C1,x)),Power(Gamma(Plus(C1,Negate(n),x)),CN1))),
    // FactorialPower(x_,n_,h_):=(x^n*Gamma(1+x/h))/((x/h)^n*Gamma(1-n+x/h))/;h=!=0
    SetDelayed(FactorialPower(x_,n_,h_),
      Condition(Times(Power(x,n),Gamma(Plus(C1,Times(Power(h,CN1),x))),Power(Times(Power(Times(Power(h,CN1),x),n),Gamma(Plus(C1,Negate(n),Times(Power(h,CN1),x)))),CN1)),UnsameQ(h,C0))),
    // (Gamma(a_.Integer+z_)*x_.)/Gamma(b_.Integer+z_):=If(b<a,x*Product(z+i,{i,b,-1+a}),x/Product(z+i,{i,a,-1+b}))
    SetDelayed(Times(Gamma(Plus($p(a, Integer,true),z_)),Power(Gamma(Plus($p(b, Integer,true),z_)),CN1),x_DEFAULT),
      If(Less(b,a),Times(x,Product(Plus(z,i),list(i,b,Plus(CN1,a)))),Times(x,Power(Product(Plus(z,i),list(i,a,Plus(CN1,b))),CN1)))),
    // Gamma(-1,z_):=1/(E^z*z)+ExpIntegralEi(-z)+1/2*(Log(-1/z)-Log(-z))+Log(z)
    SetDelayed(Gamma(CN1,z_),
      Plus(Power(Times(Exp(z),z),CN1),ExpIntegralEi(Negate(z)),Times(C1D2,Subtract(Log(Negate(Power(z,CN1))),Log(Negate(z)))),Log(z))),
    // Gamma(-1/2,z_):=2/(E^z*Sqrt(z))-2*Sqrt(Pi)*(1-Erf(Sqrt(z)))
    SetDelayed(Gamma(CN1D2,z_),
      Plus(Times(C2,Power(Times(Exp(z),Sqrt(z)),CN1)),Times(CN2,CSqrtPi,Subtract(C1,Erf(Sqrt(z)))))),
    // Gamma(0,z_):=-ExpIntegralEi(-z)+1/2*(-Log(-1/z)+Log(-z))-Log(z)
    SetDelayed(Gamma(C0,z_),
      Plus(Negate(ExpIntegralEi(Negate(z))),Times(C1D2,Plus(Negate(Log(Negate(Power(z,CN1)))),Log(Negate(z)))),Negate(Log(z)))),
    // Gamma(1/2,z_):=Sqrt(Pi)*(1-Erf(Sqrt(z)))
    SetDelayed(Gamma(C1D2,z_),
      Times(CSqrtPi,Subtract(C1,Erf(Sqrt(z))))),
    // GammaRegularized(a_,z_):=Gamma(a,z)/Gamma(a)
    SetDelayed(GammaRegularized(a_,z_),
      Times(Power(Gamma(a),CN1),Gamma(a,z))),
    // GammaRegularized(a_,y_,z_):=Gamma(a,y)/Gamma(a)-Gamma(a,z)/Gamma(a)
    SetDelayed(GammaRegularized(a_,y_,z_),
      Plus(Times(Power(Gamma(a),CN1),Gamma(a,y)),Times(CN1,Power(Gamma(a),CN1),Gamma(a,z)))),
    // Gudermannian(z_):=Piecewise({{1/2*(Pi-4*ArcCot(E^z)),Re(z)>0||(Re(z)==0&&Im(z)>=0)}},1/2*(-Pi+4*ArcTan(E^z)))
    SetDelayed(Gudermannian(z_),
      Piecewise(list(list(Times(C1D2,Plus(Pi,Times(CN4,ArcCot(Exp(z))))),Or(Greater(Re(z),C0),And(Equal(Re(z),C0),GreaterEqual(Im(z),C0))))),Times(C1D2,Plus(CNPi,Times(C4,ArcTan(Exp(z))))))),
    // HarmonicNumber(n_):=EulerGamma+PolyGamma(0,1+n)
    SetDelayed(HarmonicNumber(n_),
      Plus(EulerGamma,PolyGamma(C0,Plus(C1,n)))),
    // HarmonicNumber(z_,n_):=-HurwitzZeta(n,1+z)+Zeta(n)
    SetDelayed(HarmonicNumber(z_,n_),
      Plus(Negate(HurwitzZeta(n,Plus(C1,z))),Zeta(n))),
    // Haversine(z_):=1/2*(1-Cos(z))
    SetDelayed(Haversine(z_),
      Times(C1D2,Subtract(C1,Cos(z)))),
    // HurwitzZeta(n_Integer,a_):=(-1)^n/(-1+n)!*PolyGamma(-1+n,a)/;n>1
    SetDelayed(HurwitzZeta($p(n, Integer),a_),
      Condition(Times(Power(CN1,n),Power(Factorial(Plus(CN1,n)),CN1),PolyGamma(Plus(CN1,n),a)),Greater(n,C1))),
    // HypergeometricPFQ({1/2},{1,1},z_):=BesselI(0,Sqrt(z))^2
    SetDelayed(HypergeometricPFQ(list(C1D2),list(C1,C1),z_),
      Sqr(BesselI(C0,Sqrt(z)))),
    // HypergeometricPFQ({},{a_},z_):=z^(1/2-a/2)*BesselI(-1+a,2*Sqrt(z))*Gamma(a)
    SetDelayed(HypergeometricPFQ(List(),list(a_),z_),
      Times(Power(z,Plus(C1D2,Times(CN1D2,a))),BesselI(Plus(CN1,a),Times(C2,Sqrt(z))),Gamma(a))),
    // HypergeometricPFQ({a_},{b_},z_):=Hypergeometric1F1(a,b,z)
    SetDelayed(HypergeometricPFQ(list(a_),list(b_),z_),
      Hypergeometric1F1(a,b,z)),
    // HypergeometricPFQ({a_,b_},{c_},z_):=Hypergeometric2F1(a,b,c,z)
    SetDelayed(HypergeometricPFQ(list(a_,b_),list(c_),z_),
      Hypergeometric2F1(a,b,c,z)),
    // Hypergeometric0F1(a_,z_):=z^(1/2-a/2)*BesselI(-1+a,2*Sqrt(z))*Gamma(a)
    SetDelayed(Hypergeometric0F1(a_,z_),
      Times(Power(z,Plus(C1D2,Times(CN1D2,a))),BesselI(Plus(CN1,a),Times(C2,Sqrt(z))),Gamma(a))),
    // Hypergeometric1F1(a_,1,z_):=LaguerreL(-a,z)
    SetDelayed(Hypergeometric1F1(a_,C1,z_),
      LaguerreL(Negate(a),z)),
    // Hypergeometric2F1(2,b_,c_,-1/2):=1/3*(3-b)/;5/2-b/2==Expand(c)
    SetDelayed(Hypergeometric2F1(C2,b_,c_,CN1D2),
      Condition(Times(C1D3,Subtract(C3,b)),Equal(Plus(QQ(5L,2L),Times(CN1D2,b)),Expand(c)))),
    // Hypergeometric2F1(a_,a_+1/2,c_,z_):=(1+Sqrt(1-z))^(1-2*a)/(2^(1-2*a)*Sqrt(1-z))/;2*a==c
    SetDelayed(Hypergeometric2F1(a_,Plus(C1D2,a_),c_,z_),
      Condition(Times(Power(C2,Plus(CN1,Times(C2,a))),Power(Plus(C1,Sqrt(Subtract(C1,z))),Plus(C1,Times(CN2,a))),Power(Subtract(C1,z),CN1D2)),Equal(Times(C2,a),c))),
    // Hypergeometric2F1(a_,b_,b_+n_Integer,z_):=Sum((z^k*Pochhammer(n,k)*Pochhammer(-a+b+n,k))/(Pochhammer(b+n,k)*k!),{k,0,-n})/(1-z)^(a-n)/;n<0
    SetDelayed(Hypergeometric2F1(a_,b_,Plus(b_,$p(n, Integer)),z_),
      Condition(Times(Power(Subtract(C1,z),Plus(Negate(a),n)),Sum(Times(Power(z,k),Power(Times(Pochhammer(Plus(b,n),k),Factorial(k)),CN1),Pochhammer(n,k),Pochhammer(Plus(Negate(a),b,n),k)),list(k,C0,Negate(n)))),Less(n,C0))),
    // Hypergeometric2F1Regularized(a_,b_,c_,z_):=Hypergeometric2F1(a,b,c,z)/Gamma(c)
    SetDelayed(Hypergeometric2F1Regularized(a_,b_,c_,z_),
      Times(Power(Gamma(c),CN1),Hypergeometric2F1(a,b,c,z))),
    // InverseGudermannian(z_):=Log(Tan(Pi/4+z/2))
    SetDelayed(InverseGudermannian(z_),
      Log(Tan(Plus(CPiQuarter,Times(C1D2,z))))),
    // InverseHaversine(z_):=2*ArcSin(Sqrt(z))
    SetDelayed(InverseHaversine(z_),
      Times(C2,ArcSin(Sqrt(z)))),
    // JacobiP(n_,a_,b_,1):=Gamma(1+a+n)/(Gamma(1+a)*Gamma(1+n))
    SetDelayed(JacobiP(n_,a_,b_,C1),
      Times(Power(Times(Gamma(Plus(C1,a)),Gamma(Plus(C1,n))),CN1),Gamma(Plus(C1,a,n)))),
    // JacobiCD(f_,g_):=JacobiCN(f,g)/JacobiDN(f,g)
    SetDelayed(JacobiCD(f_,g_),
      Times(JacobiCN(f,g),Power(JacobiDN(f,g),CN1))),
    // JacobiDC(f_,g_):=JacobiDN(f,g)/JacobiCN(f,g)
    SetDelayed(JacobiDC(f_,g_),
      Times(Power(JacobiCN(f,g),CN1),JacobiDN(f,g))),
    // JacobiNC(f_,g_):=1/JacobiCN(f,g)
    SetDelayed(JacobiNC(f_,g_),
      Power(JacobiCN(f,g),CN1)),
    // JacobiND(f_,g_):=1/JacobiDN(f,g)
    SetDelayed(JacobiND(f_,g_),
      Power(JacobiDN(f,g),CN1)),
    // JacobiSC(f_,g_):=JacobiSN(f,g)/JacobiCN(f,g)
    SetDelayed(JacobiSC(f_,g_),
      Times(Power(JacobiCN(f,g),CN1),JacobiSN(f,g))),
    // JacobiSD(f_,g_):=JacobiSN(f,g)/JacobiDN(f,g)
    SetDelayed(JacobiSD(f_,g_),
      Times(Power(JacobiDN(f,g),CN1),JacobiSN(f,g))),
    // LegendreQ(l_,m_,x_):=(-Pi*Csc(m*Pi)*Gamma(1+l+m)*LegendreP(l,-m,x))/(2*Gamma(1+l-m))+1/2*Pi*Cot(m*Pi)*LegendreP(l,m,x)
    SetDelayed(LegendreQ(l_,m_,x_),
      Plus(Times(CN1,Pi,Csc(Times(m,Pi)),Power(Times(C2,Gamma(Plus(C1,l,Negate(m)))),CN1),Gamma(Plus(C1,l,m)),LegendreP(l,Negate(m),x)),Times(C1D2,Pi,Cot(Times(m,Pi)),LegendreP(l,m,x)))),
    // Log(1/2*(1+I*Sqrt(3)))=I*Pi/3
    Set(Log(Times(C1D2,Plus(C1,Times(CI,CSqrt3)))),
      Times(CC(0L,1L,1L,3L),Pi)),
    // Log(ProductLog(x_))=x
    Set(Log(ProductLog(x_)),
      x),
    // Log(x_^a_)=a*Log(x)/;x>0&&a∈Reals
    Set(Log(Power(x_,a_)),
      Condition(Times(a,Log(x)),And(Greater(x,C0),Element(a,Reals)))),
    // LogisticSigmoid(x_):=1/(1+E^(-x))
    SetDelayed(LogisticSigmoid(x_),
      Power(Plus(C1,Exp(Negate(x))),CN1)),
    // LogGamma(x_):=Log(Gamma(x))/;x>0
    SetDelayed(LogGamma(x_),
      Condition(Log(Gamma(x)),Greater(x,C0))),
    // PolyGamma(1,1/4)=8*Catalan+Pi^2
    Set(PolyGamma(C1,C1D4),
      Plus(Times(C8,Catalan),Sqr(Pi))),
    // PolyGamma(1,3/4)=-8*Catalan+Pi^2
    Set(PolyGamma(C1,QQ(3L,4L)),
      Plus(Times(CN8,Catalan),Sqr(Pi))),
    // PolyGamma(2,1)=-2*Zeta(3)
    Set(PolyGamma(C2,C1),
      Times(CN2,Zeta(C3))),
    // PolyGamma(2,1/2)=-14*Zeta(3)
    Set(PolyGamma(C2,C1D2),
      Times(ZZ(-14L),Zeta(C3))),
    // PolyGamma(2,1/4)=-2*Pi^3-56*Zeta(3)
    Set(PolyGamma(C2,C1D4),
      Plus(Times(CN2,Power(Pi,C3)),Times(ZZ(-56L),Zeta(C3)))),
    // PolyGamma(2,3/4)=2*Pi^3-56*Zeta(3)
    Set(PolyGamma(C2,QQ(3L,4L)),
      Plus(Times(C2,Power(Pi,C3)),Times(ZZ(-56L),Zeta(C3)))),
    // PolyGamma(2,1/6)=-4*Sqrt(3)*Pi^3-182*Zeta(3)
    Set(PolyGamma(C2,QQ(1L,6L)),
      Plus(Times(CN4,CSqrt3,Power(Pi,C3)),Times(ZZ(-182L),Zeta(C3)))),
    // PolyGamma(2,5/6)=4*Sqrt(3)*Pi^3-182*Zeta(3)
    Set(PolyGamma(C2,QQ(5L,6L)),
      Plus(Times(C4,CSqrt3,Power(Pi,C3)),Times(ZZ(-182L),Zeta(C3)))),
    // PolyGamma(-2,1/2)=1/24*5*Log(2)+1/2*3*Log(Glaisher)+Log(Pi)/4
    Set(PolyGamma(CN2,C1D2),
      Plus(Times(QQ(5L,24L),Log(C2)),Times(QQ(3L,2L),Log(Glaisher)),Times(C1D4,Log(Pi)))),
    // PolyGamma(-2,1/4)=Catalan/(4*Pi)+1/8*9*Log(Glaisher)+1/8*(Log(2)+Log(Pi))
    Set(PolyGamma(CN2,C1D4),
      Plus(Times(C1D4,Catalan,Power(Pi,CN1)),Times(QQ(9L,8L),Log(Glaisher)),Times(QQ(1L,8L),Plus(Log(C2),Log(Pi))))),
    // PolyGamma(-2,1)=1/2*(Log(2)+Log(Pi))
    Set(PolyGamma(CN2,C1),
      Times(C1D2,Plus(Log(C2),Log(Pi)))),
    // PolyGamma(-2,2)=-1+Log(2)+Log(Pi)
    Set(PolyGamma(CN2,C2),
      Plus(CN1,Log(C2),Log(Pi))),
    // PolyGamma(-3,1/2)=Log(Glaisher)/2+1/16*(Log(2)+Log(Pi))+(7*Zeta(3))/(32*Pi^2)
    Set(PolyGamma(CN3,C1D2),
      Plus(Times(C1D2,Log(Glaisher)),Times(QQ(1L,16L),Plus(Log(C2),Log(Pi))),Times(QQ(7L,32L),Power(Pi,CN2),Zeta(C3)))),
    // PolyGamma(-3,1)=Log(Glaisher)+1/4*(Log(2)+Log(Pi))
    Set(PolyGamma(CN3,C1),
      Plus(Log(Glaisher),Times(C1D4,Plus(Log(C2),Log(Pi))))),
    // PolyGamma(-3,2)=-3/4+Log(2)+2*Log(Glaisher)+Log(Pi)
    Set(PolyGamma(CN3,C2),
      Plus(QQ(-3L,4L),Log(C2),Times(C2,Log(Glaisher)),Log(Pi))),
    // PolyGamma(n_Integer,1/2):=(-1)^(n+1)*n!*(-1+2^(n+1))*Zeta(n+1)/;n>0
    SetDelayed(PolyGamma($p(n, Integer),C1D2),
      Condition(Times(Power(CN1,Plus(n,C1)),Factorial(n),Plus(CN1,Power(C2,Plus(n,C1))),Zeta(Plus(n,C1))),Greater(n,C0))),
    // PolyLog(2,1/2*(3-Sqrt(5)))=Pi^2/15-ArcCsch(2)^2
    Set(PolyLog(C2,Times(C1D2,Subtract(C3,CSqrt5))),
      Subtract(Times(QQ(1L,15L),Sqr(Pi)),Sqr(ArcCsch(C2)))),
    // PolyLog(2,1/2*(-1+Sqrt(5)))=Pi^2/10-ArcCsch(2)^2
    Set(PolyLog(C2,Times(C1D2,Plus(CN1,CSqrt5))),
      Subtract(Times(QQ(1L,10L),Sqr(Pi)),Sqr(ArcCsch(C2)))),
    // PolyLog(2,1/2*(1-Sqrt(5)))=(-1)*1/10*Pi^2+ArcCsch(2)^2+1/2*(Pi^2/15-ArcCsch(2)^2)
    Set(PolyLog(C2,Times(C1D2,Subtract(C1,CSqrt5))),
      Plus(Times(QQ(-1L,10L),Sqr(Pi)),Times(C1D2,Subtract(Times(QQ(1L,15L),Sqr(Pi)),Sqr(ArcCsch(C2)))),Sqr(ArcCsch(C2)))),
    // PolyLog(2,1/2*(-1-Sqrt(5)))=(-1)*1/10*Pi^2-ArcCsch(2)^2
    Set(PolyLog(C2,Times(C1D2,Subtract(CN1,CSqrt5))),
      Subtract(Times(QQ(-1L,10L),Sqr(Pi)),Sqr(ArcCsch(C2)))),
    // Abs(x_)^y_Integer:=x^y/;EvenQ(y)&&x∈Reals
    SetDelayed(Power(Abs(x_),$p(y, Integer)),
      Condition(Power(x,y),And(EvenQ(y),Element(x,Reals)))),
    // I^x_:=E^Distribute(1/2*I*Pi*x)
    SetDelayed(Power(CI,x_),
      Exp(Distribute(Times(C1D2,CI,Pi,x)))),
    // ProductLog(x_*Log(x_)):=Log(x)/;x>1/E
    SetDelayed(ProductLog(Times(Log(x_),x_)),
      Condition(Log(x),Greater(x,Exp(CN1)))),
    // E^ProductLog(x_):=x/ProductLog(x)
    SetDelayed(Exp(ProductLog(x_)),
      Times(x,Power(ProductLog(x),CN1))),
    // Sin(n_Integer*ArcSin(z_)):=z*ChebyshevU(-1+n,Sqrt(1-z^2))/;n>0
    SetDelayed(Sin(Times(ArcSin(z_),$p(n, Integer))),
      Condition(Times(z,ChebyshevU(Plus(CN1,n),Sqrt(Subtract(C1,Sqr(z))))),Greater(n,C0))),
    // Sin(n_Integer*ArcTan(z_)):=Sum((-1)^k*Binomial(n,2*k+1)*z^(2*k+1),{k,0,Floor(1/2*(-1+n))})/(1+z^2)^(n/2)/;n>0
    SetDelayed(Sin(Times(ArcTan(z_),$p(n, Integer))),
      Condition(Times(Power(Power(Plus(C1,Sqr(z)),Times(C1D2,n)),CN1),Sum(Times(Power(CN1,k),Binomial(n,Plus(Times(C2,k),C1)),Power(z,Plus(Times(C2,k),C1))),list(k,C0,Floor(Times(C1D2,Plus(CN1,n)))))),Greater(n,C0))),
    // Sinc(z_):=Sin(z)/z/;z!=0
    SetDelayed(Sinc(z_),
      Condition(Times(Power(z,CN1),Sin(z)),Unequal(z,C0))),
    // SinIntegral(Sqrt(z_^n_)):=(Sqrt(z^n)*SinIntegral(z^(n/2)))/z^(n/2)
    SetDelayed(SinIntegral(Sqrt(Power(z_,n_))),
      Times(Power(Power(z,Times(C1D2,n)),CN1),Sqrt(Power(z,n)),SinIntegral(Power(z,Times(C1D2,n))))),
    // SinhIntegral(Sqrt(z_^n_)):=(Sqrt(z^n)*SinhIntegral(z^(n/2)))/z^(n/2)
    SetDelayed(SinhIntegral(Sqrt(Power(z_,n_))),
      Times(Power(Power(z,Times(C1D2,n)),CN1),Sqrt(Power(z,n)),SinhIntegral(Power(z,Times(C1D2,n))))),
    // SphericalHarmonicY(l_,0,t_,p_):=(Sqrt(1+2*l)*LegendreP(l,Cos(t)))/(2*Sqrt(Pi))
    SetDelayed(SphericalHarmonicY(l_,C0,t_,p_),
      Times(Sqrt(Plus(C1,Times(C2,l))),Power(Times(C2,CSqrtPi),CN1),LegendreP(l,Cos(t)))),
    // SphericalHarmonicY(l_,1,t_,p_):=(-E^(I*p)*l*(1+l)*Sqrt(1+2*l)*Sqrt(Gamma(l))*Hypergeometric2F1(1-l,2+l,2,Sin(t/2)^2)*Sin(t))/(4*Sqrt(Pi)*Sqrt(Gamma(2+l)))
    SetDelayed(SphericalHarmonicY(l_,C1,t_,p_),
      Times(CN1,Exp(Times(CI,p)),l,Plus(C1,l),Sqrt(Plus(C1,Times(C2,l))),Sqrt(Gamma(l)),Power(Times(C4,CSqrtPi,Sqrt(Gamma(Plus(C2,l)))),CN1),Hypergeometric2F1(Subtract(C1,l),Plus(C2,l),C2,Sqr(Sin(Times(C1D2,t)))),Sin(t))),
    // SphericalHarmonicY(l_,m_,t_,p_):=(E^(I*m*p)*Sqrt(1+2*l)*Sqrt(Gamma(1+l-m))*Hypergeometric2F1(-l,1+l,1-m,Sin(t/2)^2)*Sin(t)^m)/((1-Cos(t))^m*2*Sqrt(Pi)*Gamma(1-m)*Sqrt(Gamma(1+l+m)))
    SetDelayed(SphericalHarmonicY(l_,m_,t_,p_),
      Times(Exp(Times(CI,m,p)),Sqrt(Plus(C1,Times(C2,l))),Sqrt(Gamma(Plus(C1,l,Negate(m)))),Power(Times(Power(Subtract(C1,Cos(t)),m),C2,CSqrtPi,Gamma(Subtract(C1,m)),Sqrt(Gamma(Plus(C1,l,m)))),CN1),Hypergeometric2F1(Negate(l),Plus(C1,l),Subtract(C1,m),Sqr(Sin(Times(C1D2,t)))),Power(Sin(t),m))),
    // WeberE(a_,b_):=(2*b*Cos(1/2*a*Pi)^2*HypergeometricPFQ({1},{3/2-a/2,3/2+a/2},(-1)*1/4*b^2))/((-1+a)*(1+a)*Pi)+(2*HypergeometricPFQ({1},{1-a/2,1+a/2},(-1)*1/4*b^2)*Sin(1/2*a*Pi)^2)/(a*Pi)
    SetDelayed(WeberE(a_,b_),
      Plus(Times(C2,b,Power(Times(Plus(CN1,a),Plus(C1,a),Pi),CN1),Sqr(Cos(Times(C1D2,a,Pi))),HypergeometricPFQ(list(C1),list(Plus(QQ(3L,2L),Times(CN1D2,a)),Plus(QQ(3L,2L),Times(C1D2,a))),Times(CN1,C1D4,Sqr(b)))),Times(C2,Power(Times(a,Pi),CN1),HypergeometricPFQ(list(C1),list(Plus(C1,Times(CN1D2,a)),Plus(C1,Times(C1D2,a))),Times(CN1,C1D4,Sqr(b))),Sqr(Sin(Times(C1D2,a,Pi)))))),
    // WeberE(a_,b_,c_):=(-c*Cos(1/2*a*Pi)*Gamma(2+b)*HypergeometricPFQ({1+b/2,3/2+b/2},{3/2,3/2-a/2+b/2,3/2+a/2+b/2},(-1)*1/4*c^2))/(2*Gamma(3/2-a/2+b/2)*Gamma(3/2+a/2+b/2))+(Gamma(1+b)*HypergeometricPFQ({1/2+b/2,1+b/2},{1/2,1-a/2+b/2,1+a/2+b/2},(-1)*1/4*c^2)*Sin(1/2*a*Pi))/(Gamma(1-a/2+b/2)*Gamma(1+a/2+b/2))
    SetDelayed(WeberE(a_,b_,c_),
      Plus(Times(CN1,c,Cos(Times(C1D2,a,Pi)),Power(Times(C2,Gamma(Plus(QQ(3L,2L),Times(CN1D2,a),Times(C1D2,b))),Gamma(Plus(QQ(3L,2L),Times(C1D2,a),Times(C1D2,b)))),CN1),Gamma(Plus(C2,b)),HypergeometricPFQ(list(Plus(C1,Times(C1D2,b)),Plus(QQ(3L,2L),Times(C1D2,b))),list(QQ(3L,2L),Plus(QQ(3L,2L),Times(CN1D2,a),Times(C1D2,b)),Plus(QQ(3L,2L),Times(C1D2,a),Times(C1D2,b))),Times(CN1,C1D4,Sqr(c)))),Times(Power(Times(Gamma(Plus(C1,Times(CN1D2,a),Times(C1D2,b))),Gamma(Plus(C1,Times(C1D2,a),Times(C1D2,b)))),CN1),Gamma(Plus(C1,b)),HypergeometricPFQ(list(Plus(C1D2,Times(C1D2,b)),Plus(C1,Times(C1D2,b))),list(C1D2,Plus(C1,Times(CN1D2,a),Times(C1D2,b)),Plus(C1,Times(C1D2,a),Times(C1D2,b))),Times(CN1,C1D4,Sqr(c))),Sin(Times(C1D2,a,Pi))))),
    // WhittakerM(k_,m_,z_):=(z^(1/2+m)*Hypergeometric1F1(1/2-k+m,1+2*m,z))/E^(z/2)
    SetDelayed(WhittakerM(k_,m_,z_),
      Times(Power(Exp(Times(C1D2,z)),CN1),Power(z,Plus(C1D2,m)),Hypergeometric1F1(Plus(C1D2,Negate(k),m),Plus(C1,Times(C2,m)),z))),
    // WhittakerW(k_,m_,z_):=(z^(1/2+m)*HypergeometricU(1/2-k+m,1+2*m,z))/E^(z/2)
    SetDelayed(WhittakerW(k_,m_,z_),
      Times(Power(Exp(Times(C1D2,z)),CN1),Power(z,Plus(C1D2,m)),HypergeometricU(Plus(C1D2,Negate(k),m),Plus(C1,Times(C2,m)),z))),
    // Zeta(n_Integer,x_):=PolyGamma(-1+n,x)/((-1)^n*(-1+n)!)/;EvenQ(n)&&n>1
    SetDelayed(Zeta($p(n, Integer),x_),
      Condition(Times(Power(Times(Power(CN1,n),Factorial(Plus(CN1,n))),CN1),PolyGamma(Plus(CN1,n),x)),And(EvenQ(n),Greater(n,C1)))),
    // Zeta'(m_Integer):=With({n=-m/2},1/2*(-1)^n*(2*n)!/(2*Pi)^(2*n)*Zeta(2*n+1)/;EvenQ(m)&&m<-1)
    SetDelayed($($(Derivative(C1),Zeta),$p(m, Integer)),
      With(list(Set(n,Times(CN1D2,m))),Condition(Times(C1D2,Power(CN1,n),Power(Power(C2Pi,Times(C2,n)),CN1),Factorial(Times(C2,n)),Zeta(Plus(Times(C2,n),C1))),And(EvenQ(m),Less(m,CN1))))),
    // Zeta'(2):=1/6*Pi^2*(EulerGamma+Log(2)-12*Log(Glaisher)+Log(Pi))
    SetDelayed($($(Derivative(C1),Zeta),C2),
      Times(QQ(1L,6L),Sqr(Pi),Plus(EulerGamma,Log(C2),Times(ZZ(-12L),Log(Glaisher)),Log(Pi))))
  );
}
