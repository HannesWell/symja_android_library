package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class LimitRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 67, 23 };

  final public static IAST RULES = List(
    IInit(Limit, SIZES),
    // Limit((Sqrt(2*Pi))^(1/x_)*(Sin(x_)/x_!)^(1/x_)*x_,x_Symbol->Infinity):=E
    ISetDelayed(Limit(Times(Power(Sqrt(C2Pi),Power(x_,CN1)),Power(Times(Power(Factorial(x_),CN1),Sin(x_)),Power(x_,CN1)),x_),Rule(x_Symbol,oo)),
      E),
    // Limit(x_/(x_!)^(1/x_),x_Symbol->Infinity):=E
    ISetDelayed(Limit(Times(Power(Factorial(x_),Negate(Power(x_,CN1))),x_),Rule(x_Symbol,oo)),
      E),
    // Limit(x_^(b_.+a_.*x_^n_.),x_Symbol->0):=With({r=ConditionalExpression(1,a∈Reals&&b>0&&n>0)},r/;r=!=Undefined)
    ISetDelayed(Limit(Power(x_,Plus(b_DEFAULT,Times(a_DEFAULT,Power(x_,n_DEFAULT)))),Rule(x_Symbol,C0)),
      With(list(Set(r,ConditionalExpression(C1,And(Element(a,Reals),Greater(b,C0),Greater(n,C0))))),Condition(r,UnsameQ(r,Undefined)))),
    // Limit(x_^(b_.+a_.*x_^n_.),x_Symbol->0):=With({r=ConditionalExpression(0,b∈Reals&&a>0&&n<0&&Cos(-n*Pi)>0&&Sin(-n*Pi)>0)},r/;r=!=Undefined)
    ISetDelayed(Limit(Power(x_,Plus(b_DEFAULT,Times(a_DEFAULT,Power(x_,n_DEFAULT)))),Rule(x_Symbol,C0)),
      With(list(Set(r,ConditionalExpression(C0,And(Element(b,Reals),Greater(a,C0),Less(n,C0),Greater(Cos(Times(CN1,n,Pi)),C0),Greater(Sin(Times(CN1,n,Pi)),C0))))),Condition(r,UnsameQ(r,Undefined)))),
    // Limit(x_^(b_.+a_.*x_^n_.),x_Symbol->Infinity):=With({r=ConditionalExpression(Infinity,b∈Reals&&a>0&&n>0)},r/;r=!=Undefined)
    ISetDelayed(Limit(Power(x_,Plus(b_DEFAULT,Times(a_DEFAULT,Power(x_,n_DEFAULT)))),Rule(x_Symbol,oo)),
      With(list(Set(r,ConditionalExpression(oo,And(Element(b,Reals),Greater(a,C0),Greater(n,C0))))),Condition(r,UnsameQ(r,Undefined)))),
    // Limit(x_^(a_.*x_^n_.),x_Symbol->Infinity):=With({r=ConditionalExpression(1,a∈Reals&&n<0)},r/;r=!=Undefined)
    ISetDelayed(Limit(Power(x_,Times(a_DEFAULT,Power(x_,n_DEFAULT))),Rule(x_Symbol,oo)),
      With(list(Set(r,ConditionalExpression(C1,And(Element(a,Reals),Less(n,C0))))),Condition(r,UnsameQ(r,Undefined)))),
    // Limit(x_^p_,x_Symbol->Infinity):=If(p<0,0,Infinity,ConditionalExpression(Infinity,p>0))
    ISetDelayed(Limit(Power(x_,p_),Rule(x_Symbol,oo)),
      If(Less(p,C0),C0,oo,ConditionalExpression(oo,Greater(p,C0)))),
    // Limit(m_?NumberQ^x_,x_Symbol->Infinity):=If(m>1,Infinity,If(m==1,1,0))/;Positive(m)
    ISetDelayed(Limit(Power(PatternTest(m_,NumberQ),x_),Rule(x_Symbol,oo)),
      Condition(If(Greater(m,C1),oo,If(Equal(m,C1),C1,C0)),Positive(m))),
    // Limit(m_?NumberQ^(-x_),x_Symbol->Infinity):=0/;m>1
    ISetDelayed(Limit(Power(PatternTest(m_,NumberQ),Negate(x_)),Rule(x_Symbol,oo)),
      Condition(C0,Greater(m,C1))),
    // Limit(E^x_,x_Symbol->Infinity):=Infinity
    ISetDelayed(Limit(Exp(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(E^x_,x_Symbol->-Infinity):=0
    ISetDelayed(Limit(Exp(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(Log(x_),x_Symbol->0)=-Infinity
    ISet(Limit(Log(x_),Rule(x_Symbol,C0)),
      Noo),
    // Limit(Log(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(Log(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(Log(x_),x_Symbol->-Infinity)=Infinity
    ISet(Limit(Log(x_),Rule(x_Symbol,Noo)),
      oo),
    // Limit((1+1/x_)^x_,x_Symbol->Infinity)=E
    ISet(Limit(Power(Plus(C1,Power(x_,CN1)),x_),Rule(x_Symbol,oo)),
      E),
    // Limit((1+a_./x_)^(b_.*x_),x_Symbol->-Infinity)=E^(a*b)/;FreeQ({a,b},x)
    ISet(Limit(Power(Plus(C1,Times(a_DEFAULT,Power(x_,CN1))),Times(b_DEFAULT,x_)),Rule(x_Symbol,Noo)),
      Condition(Exp(Times(a,b)),FreeQ(list(a,b),x))),
    // Limit((1+a_./x_)^(b_.*x_),x_Symbol->Infinity)=E^(a*b)/;FreeQ({a,b},x)
    ISet(Limit(Power(Plus(C1,Times(a_DEFAULT,Power(x_,CN1))),Times(b_DEFAULT,x_)),Rule(x_Symbol,oo)),
      Condition(Exp(Times(a,b)),FreeQ(list(a,b),x))),
    // Limit((1+x_)^(1/x_),x_Symbol->0)=E
    ISet(Limit(Power(Plus(C1,x_),Power(x_,CN1)),Rule(x_Symbol,C0)),
      E),
    // Limit(((a_.+x_)/(b_.+x_))^(c_.+x_),x_Symbol->-Infinity)=E^(a-b)/;FreeQ({a,b,c},x)
    ISet(Limit(Power(Times(Plus(a_DEFAULT,x_),Power(Plus(b_DEFAULT,x_),CN1)),Plus(c_DEFAULT,x_)),Rule(x_Symbol,Noo)),
      Condition(Exp(Subtract(a,b)),FreeQ(list(a,b,c),x))),
    // Limit(((a_.+x_)/(b_.+x_))^(c_.+x_),x_Symbol->Infinity)=E^(a-b)/;FreeQ({a,b,c},x)
    ISet(Limit(Power(Times(Plus(a_DEFAULT,x_),Power(Plus(b_DEFAULT,x_),CN1)),Plus(c_DEFAULT,x_)),Rule(x_Symbol,oo)),
      Condition(Exp(Subtract(a,b)),FreeQ(list(a,b,c),x))),
    // Limit(HarmonicNumber(y_Symbol,s_Integer),x_Symbol->Infinity):=With({v=s/2},((-1)^(v+1)*(2*Pi)^(2*v)*BernoulliB(2*v))/(2*(2*v)!))/;EvenQ(s)&&Positive(s)
    ISetDelayed(Limit(HarmonicNumber(y_Symbol,$p(s, Integer)),Rule(x_Symbol,oo)),
      Condition(With(list(Set(v,Times(C1D2,s))),Times(Power(CN1,Plus(v,C1)),Power(C2Pi,Times(C2,v)),BernoulliB(Times(C2,v)),Power(Times(C2,Factorial(Times(C2,v))),CN1))),And(EvenQ(s),Positive(s)))),
    // Limit(Tan(x_),x_Symbol->Pi/2):=Indeterminate
    ISetDelayed(Limit(Tan(x_),Rule(x_Symbol,CPiHalf)),
      Indeterminate),
    // Limit(Cot(x_),x_Symbol->0):=Indeterminate
    ISetDelayed(Limit(Cot(x_),Rule(x_Symbol,C0)),
      Indeterminate),
    // Limit(ArcCos(x_),x_Symbol->Infinity)=I*Infinity
    ISet(Limit(ArcCos(x_),Rule(x_Symbol,oo)),
      DirectedInfinity(CI)),
    // Limit(ArcCos(x_),x_Symbol->-Infinity)=-I*Infinity
    ISet(Limit(ArcCos(x_),Rule(x_Symbol,Noo)),
      DirectedInfinity(CNI)),
    // Limit(ArcCot(x_),x_Symbol->Infinity)=0
    ISet(Limit(ArcCot(x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(ArcCot(x_),x_Symbol->-Infinity)=0
    ISet(Limit(ArcCot(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(ArcCsc(x_),x_Symbol->Infinity)=0
    ISet(Limit(ArcCsc(x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(ArcCsc(x_),x_Symbol->-Infinity)=0
    ISet(Limit(ArcCsc(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(ArcSec(x_),x_Symbol->Infinity)=Pi/2
    ISet(Limit(ArcSec(x_),Rule(x_Symbol,oo)),
      CPiHalf),
    // Limit(ArcSec(x_),x_Symbol->-Infinity)=Pi/2
    ISet(Limit(ArcSec(x_),Rule(x_Symbol,Noo)),
      CPiHalf),
    // Limit(ArcSin(x_),x_Symbol->Infinity)=-I*Infinity
    ISet(Limit(ArcSin(x_),Rule(x_Symbol,oo)),
      DirectedInfinity(CNI)),
    // Limit(ArcSin(x_),x_Symbol->-Infinity)=I*Infinity
    ISet(Limit(ArcSin(x_),Rule(x_Symbol,Noo)),
      DirectedInfinity(CI)),
    // Limit(ArcTan(x_),x_Symbol->Infinity)=Pi/2
    ISet(Limit(ArcTan(x_),Rule(x_Symbol,oo)),
      CPiHalf),
    // Limit(ArcTan(x_),x_Symbol->-Infinity)=(-1)*1/2*Pi
    ISet(Limit(ArcTan(x_),Rule(x_Symbol,Noo)),
      CNPiHalf),
    // Limit(ArcCosh(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(ArcCosh(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(ArcCosh(x_),x_Symbol->-Infinity)=Infinity
    ISet(Limit(ArcCosh(x_),Rule(x_Symbol,Noo)),
      oo),
    // Limit(ArcCoth(x_),x_Symbol->Infinity)=0
    ISet(Limit(ArcCoth(x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(ArcCoth(x_),x_Symbol->-Infinity)=0
    ISet(Limit(ArcCoth(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(ArcCsch(x_),x_Symbol->Infinity)=0
    ISet(Limit(ArcCsch(x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(ArcCsch(x_),x_Symbol->-Infinity)=0
    ISet(Limit(ArcCsch(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(ArcSech(x_),x_Symbol->Infinity)=I*Pi/2
    ISet(Limit(ArcSech(x_),Rule(x_Symbol,oo)),
      Times(CC(0L,1L,1L,2L),Pi)),
    // Limit(ArcSech(x_),x_Symbol->-Infinity)=I*Pi/2
    ISet(Limit(ArcSech(x_),Rule(x_Symbol,Noo)),
      Times(CC(0L,1L,1L,2L),Pi)),
    // Limit(ArcSinh(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(ArcSinh(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(ArcSinh(x_),x_Symbol->-Infinity)=-Infinity
    ISet(Limit(ArcSinh(x_),Rule(x_Symbol,Noo)),
      Noo),
    // Limit(ArcTanh(x_),x_Symbol->Infinity)=-I*Pi/2
    ISet(Limit(ArcTanh(x_),Rule(x_Symbol,oo)),
      Times(CC(0L,1L,-1L,2L),Pi)),
    // Limit(ArcTanh(x_),x_Symbol->-Infinity)=I*Pi/2
    ISet(Limit(ArcTanh(x_),Rule(x_Symbol,Noo)),
      Times(CC(0L,1L,1L,2L),Pi)),
    // Limit(AiryAi(x_),x_Symbol->Infinity)=0
    ISet(Limit(AiryAi(x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(AiryAi(x_),x_Symbol->-Infinity)=0
    ISet(Limit(AiryAi(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(AiryAiPrime(x_),x_Symbol->Infinity)=0
    ISet(Limit(AiryAiPrime(x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(AiryBi(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(AiryBi(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(AiryBi(x_),x_Symbol->-Infinity)=0
    ISet(Limit(AiryBi(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(AiryBiPrime(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(AiryBiPrime(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(AiryBiPrime(x_),x_Symbol->-Infinity)=0
    ISet(Limit(AiryBiPrime(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(BesselJ(n_,x_),x_Symbol->Infinity)=0/;FreeQ(n,x)
    ISet(Limit(BesselJ(n_,x_),Rule(x_Symbol,oo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(BesselJ(n_,x_),x_Symbol->-Infinity)=0/;FreeQ(n,x)
    ISet(Limit(BesselJ(n_,x_),Rule(x_Symbol,Noo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(BesselI(n_,x_),x_Symbol->Infinity)=Infinity/;FreeQ(n,x)
    ISet(Limit(BesselI(n_,x_),Rule(x_Symbol,oo)),
      Condition(oo,FreeQ(n,x))),
    // Limit(BesselY(n_,x_),x_Symbol->Infinity)=0/;FreeQ(n,x)
    ISet(Limit(BesselY(n_,x_),Rule(x_Symbol,oo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(BesselY(n_,x_),x_Symbol->-Infinity)=0/;FreeQ(n,x)
    ISet(Limit(BesselY(n_,x_),Rule(x_Symbol,Noo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(BesselK(n_,x_),x_Symbol->Infinity)=0/;FreeQ(n,x)
    ISet(Limit(BesselK(n_,x_),Rule(x_Symbol,oo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(SphericalBesselJ(n_,x_),x_Symbol->Infinity)=0/;FreeQ(n,x)
    ISet(Limit(SphericalBesselJ(n_,x_),Rule(x_Symbol,oo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(SphericalBesselJ(n_,x_),x_Symbol->-Infinity)=0/;FreeQ(n,x)
    ISet(Limit(SphericalBesselJ(n_,x_),Rule(x_Symbol,Noo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(SphericalBesselY(n_,x_),x_Symbol->Infinity)=0/;FreeQ(n,x)
    ISet(Limit(SphericalBesselY(n_,x_),Rule(x_Symbol,oo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(SphericalBesselY(n_,x_),x_Symbol->-Infinity)=0/;FreeQ(n,x)
    ISet(Limit(SphericalBesselY(n_,x_),Rule(x_Symbol,Noo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(SphericalHankelH1(n_,x_),x_Symbol->Infinity)=0/;FreeQ(n,x)
    ISet(Limit(SphericalHankelH1(n_,x_),Rule(x_Symbol,oo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(SphericalHankelH2(n_,x_),x_Symbol->Infinity)=0/;FreeQ(n,x)
    ISet(Limit(SphericalHankelH2(n_,x_),Rule(x_Symbol,oo)),
      Condition(C0,FreeQ(n,x))),
    // Limit(StruveH(n_,x_),x_Symbol->Infinity):=ConditionalExpression(Infinity,1<n<5/2)/;FreeQ(n,x)
    ISetDelayed(Limit(StruveH(n_,x_),Rule(x_Symbol,oo)),
      Condition(ConditionalExpression(oo,Less(C1,n,QQ(5L,2L))),FreeQ(n,x))),
    // Limit(StruveH(n_,x_),x_Symbol->-Infinity):=ConditionalExpression(0,n∈Integers&&n<1/2)/;FreeQ(n,x)
    ISetDelayed(Limit(StruveH(n_,x_),Rule(x_Symbol,Noo)),
      Condition(ConditionalExpression(C0,And(Element(n,Integers),Less(n,C1D2))),FreeQ(n,x))),
    // Limit(Cosh(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(Cosh(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(Cosh(x_),x_Symbol->-Infinity)=Infinity
    ISet(Limit(Cosh(x_),Rule(x_Symbol,Noo)),
      oo),
    // Limit(Coth(x_),x_Symbol->Infinity)=1
    ISet(Limit(Coth(x_),Rule(x_Symbol,oo)),
      C1),
    // Limit(Coth(x_),x_Symbol->-Infinity)=-1
    ISet(Limit(Coth(x_),Rule(x_Symbol,Noo)),
      CN1),
    // Limit(Csch(x_),x_Symbol->Infinity)=0
    ISet(Limit(Csch(x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(Csch(x_),x_Symbol->-Infinity)=0
    ISet(Limit(Csch(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(Sech(x_),x_Symbol->Infinity)=0
    ISet(Limit(Sech(x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(Sech(x_),x_Symbol->-Infinity)=0
    ISet(Limit(Sech(x_),Rule(x_Symbol,Noo)),
      C0),
    // Limit(Sinh(x_),x_Symbol->Infinity)=Infinity
    ISet(Limit(Sinh(x_),Rule(x_Symbol,oo)),
      oo),
    // Limit(Sinh(x_),x_Symbol->-Infinity)=-Infinity
    ISet(Limit(Sinh(x_),Rule(x_Symbol,Noo)),
      Noo),
    // Limit(Tanh(x_),x_Symbol->Infinity)=1
    ISet(Limit(Tanh(x_),Rule(x_Symbol,oo)),
      C1),
    // Limit(Tanh(x_),x_Symbol->-Infinity)=-1
    ISet(Limit(Tanh(x_),Rule(x_Symbol,Noo)),
      CN1),
    // Limit(Gamma(x_),x_Symbol->0,Direction->1)=-Infinity
    ISet(Limit(Gamma(x_),Rule(x_Symbol,C0),Rule(Direction,C1)),
      Noo),
    // Limit(Gamma(x_),x_Symbol->0,Direction->-1)=Infinity
    ISet(Limit(Gamma(x_),Rule(x_Symbol,C0),Rule(Direction,CN1)),
      oo),
    // Limit(Gamma(z_,x_),x_Symbol->Infinity)=0
    ISet(Limit(Gamma(z_,x_),Rule(x_Symbol,oo)),
      C0),
    // Limit(Gamma(z_,x_),x_Symbol->0):=Gamma(z)
    ISetDelayed(Limit(Gamma(z_,x_),Rule(x_Symbol,C0)),
      Gamma(z)),
    // Limit(x_/Abs(x_),x_Symbol->0,Direction->1):=-1
    ISetDelayed(Limit(Times(Power(Abs(x_),CN1),x_),Rule(x_Symbol,C0),Rule(Direction,C1)),
      CN1),
    // Limit(x_/Abs(x_),x_Symbol->0,Direction->-1):=1
    ISetDelayed(Limit(Times(Power(Abs(x_),CN1),x_),Rule(x_Symbol,C0),Rule(Direction,CN1)),
      C1),
    // Limit(Tan(x_),x_Symbol->Pi/2,Direction->1):=Infinity
    ISetDelayed(Limit(Tan(x_),Rule(x_Symbol,CPiHalf),Rule(Direction,C1)),
      oo),
    // Limit(Tan(x_),x_Symbol->Pi/2,Direction->-1):=-Infinity
    ISetDelayed(Limit(Tan(x_),Rule(x_Symbol,CPiHalf),Rule(Direction,CN1)),
      Negate(oo)),
    // Limit(Cot(x_),x_Symbol->0,Direction->1):=-Infinity
    ISetDelayed(Limit(Cot(x_),Rule(x_Symbol,C0),Rule(Direction,C1)),
      Negate(oo)),
    // Limit(Cot(x_),x_Symbol->0,Direction->-1):=Infinity
    ISetDelayed(Limit(Cot(x_),Rule(x_Symbol,C0),Rule(Direction,CN1)),
      oo)
  );
}
