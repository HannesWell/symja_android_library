package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules14 { 
  public static IAST RULES = List( 
IIntegrate(281,Integrate(Times(Sqr(x_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),QQ(-5L,4L))),x_Symbol),
    Condition(Dist(Times(x,Power(Plus(C1,Times(a,Power(Times(b,Power(x,C4)),CN1))),C1D4),Power(Times(b,Power(Plus(a,Times(b,Power(x,C4))),C1D4)),CN1)),Integrate(Power(Times(Power(x,C3),Power(Plus(C1,Times(a,Power(Times(b,Power(x,C4)),CN1))),QQ(5L,4L))),CN1),x),x),And(FreeQ(List(a,b),x),PosQ(Times(b,Power(a,CN1)))))),
IIntegrate(282,Integrate(Times(Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),QQ(-5L,4L))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(x,Subtract(m,C3)),Power(Times(b,Subtract(m,C4),Power(Plus(a,Times(b,Power(x,C4))),C1D4)),CN1)),x),Dist(Times(a,Subtract(m,C3),Power(Times(b,Subtract(m,C4)),CN1)),Integrate(Times(Power(x,Subtract(m,C4)),Power(Plus(a,Times(b,Power(x,C4))),QQ(-5L,4L))),x),x)),And(FreeQ(List(a,b),x),PosQ(Times(b,Power(a,CN1))),IGtQ(Times(C1D4,Subtract(m,C2)),C0)))),
IIntegrate(283,Integrate(Times(Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),QQ(-5L,4L))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(x,Plus(m,C1)),Power(Times(a,Plus(m,C1),Power(Plus(a,Times(b,Power(x,C4))),C1D4)),CN1)),x),Dist(Times(b,m,Power(Times(a,Plus(m,C1)),CN1)),Integrate(Times(Power(x,Plus(m,C4)),Power(Plus(a,Times(b,Power(x,C4))),QQ(-5L,4L))),x),x)),And(FreeQ(List(a,b),x),PosQ(Times(b,Power(a,CN1))),ILtQ(Times(C1D4,Subtract(m,C2)),C0)))),
IIntegrate(284,Integrate(Times(Sqrt(Times(c_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(-5L,4L))),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(c,x)),Power(Plus(C1,Times(a,Power(Times(b,Sqr(x)),CN1))),C1D4),Power(Times(b,Power(Plus(a,Times(b,Sqr(x))),C1D4)),CN1)),Integrate(Power(Times(Sqr(x),Power(Plus(C1,Times(a,Power(Times(b,Sqr(x)),CN1))),QQ(5L,4L))),CN1),x),x),And(FreeQ(List(a,b,c),x),PosQ(Times(b,Power(a,CN1)))))),
IIntegrate(285,Integrate(Times(Power(Times(c_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(-5L,4L))),x_Symbol),
    Condition(Subtract(Simp(Times(C2,c,Power(Times(c,x),Subtract(m,C1)),Power(Times(b,Subtract(Times(C2,m),C3),Power(Plus(a,Times(b,Sqr(x))),C1D4)),CN1)),x),Dist(Times(C2,a,Sqr(c),Subtract(m,C1),Power(Times(b,Subtract(Times(C2,m),C3)),CN1)),Integrate(Times(Power(Times(c,x),Subtract(m,C2)),Power(Plus(a,Times(b,Sqr(x))),QQ(-5L,4L))),x),x)),And(FreeQ(List(a,b,c),x),PosQ(Times(b,Power(a,CN1))),IntegerQ(Times(C2,m)),GtQ(m,QQ(3L,2L))))),
IIntegrate(286,Integrate(Times(Power(Times(c_DEFAULT,x_),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),QQ(-5L,4L))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(c,x),Plus(m,C1)),Power(Times(a,c,Plus(m,C1),Power(Plus(a,Times(b,Sqr(x))),C1D4)),CN1)),x),Dist(Times(b,Plus(Times(C2,m),C1),Power(Times(C2,a,Sqr(c),Plus(m,C1)),CN1)),Integrate(Times(Power(Times(c,x),Plus(m,C2)),Power(Plus(a,Times(b,Sqr(x))),QQ(-5L,4L))),x),x)),And(FreeQ(List(a,b,c),x),PosQ(Times(b,Power(a,CN1))),IntegerQ(Times(C2,m)),LtQ(m,CN1)))),
IIntegrate(287,Integrate(Times(Sqr(x_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),QQ(-5L,4L))),x_Symbol),
    Condition(Subtract(Negate(Simp(Power(Times(b,x,Power(Plus(a,Times(b,Power(x,C4))),C1D4)),CN1),x)),Dist(Power(b,CN1),Integrate(Power(Times(Sqr(x),Power(Plus(a,Times(b,Power(x,C4))),C1D4)),CN1),x),x)),And(FreeQ(List(a,b),x),NegQ(Times(b,Power(a,CN1)))))),
IIntegrate(288,Integrate(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(c,Subtract(n,C1)),Power(Times(c,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),x),Dist(Times(Power(c,n),Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,C1)),CN1)),Integrate(Times(Power(Times(c,x),Subtract(m,n)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c),x),IGtQ(n,C0),LtQ(p,CN1),GtQ(Plus(m,C1),n),Not(ILtQ(Times(Plus(m,Times(n,Plus(p,C1)),C1),Power(n,CN1)),C0)),IntBinomialQ(a,b,c,n,m,p,x)))),
IIntegrate(289,Integrate(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,n_))),p_),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,n_))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(c,Subtract(Times(C2,n),C1)),Power(Times(c,x),Plus(m,Times(CN1,C2,n),C1)),Power(Plus($s("a1"),Times($s("b1"),Power(x,n))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,n))),Plus(p,C1)),Power(Times(C2,$s("b1"),$s("b2"),n,Plus(p,C1)),CN1)),x),Dist(Times(Power(c,Times(C2,n)),Plus(m,Times(CN1,C2,n),C1),Power(Times(C2,$s("b1"),$s("b2"),n,Plus(p,C1)),CN1)),Integrate(Times(Power(Times(c,x),Subtract(m,Times(C2,n))),Power(Plus($s("a1"),Times($s("b1"),Power(x,n))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c),x),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),IGtQ(Times(C2,n),C0),LtQ(p,CN1),Greater(Plus(m,C1),Times(C2,n)),Not(ILtQ(Times(Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(Times(C2,n),CN1)),C0)),IntBinomialQ(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2")),c,Times(C2,n),m,p,x)))),
IIntegrate(290,Integrate(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(c,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,c,n,Plus(p,C1)),CN1)),x)),Dist(Times(Plus(m,Times(n,Plus(p,C1)),C1),Power(Times(a,n,Plus(p,C1)),CN1)),Integrate(Times(Power(Times(c,x),m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,m),x),IGtQ(n,C0),LtQ(p,CN1),IntBinomialQ(a,b,c,n,m,p,x)))),
IIntegrate(291,Integrate(Times(Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus($p("a1"),Times($p("b1",true),Power(x_,n_))),p_),Power(Plus($p("a2"),Times($p("b2",true),Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(c,x),Plus(m,C1)),Power(Plus($s("a1"),Times($s("b1"),Power(x,n))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,n))),Plus(p,C1)),Power(Times(C2,$s("a1"),$s("a2"),c,n,Plus(p,C1)),CN1)),x)),Dist(Times(Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(Times(C2,$s("a1"),$s("a2"),n,Plus(p,C1)),CN1)),Integrate(Times(Power(Times(c,x),m),Power(Plus($s("a1"),Times($s("b1"),Power(x,n))),Plus(p,C1)),Power(Plus($s("a2"),Times($s("b2"),Power(x,n))),Plus(p,C1))),x),x)),And(FreeQ(List($s("a1"),$s("b1"),$s("a2"),$s("b2"),c,m),x),EqQ(Plus(Times($s("a2"),$s("b1")),Times($s("a1"),$s("b2"))),C0),IGtQ(Times(C2,n),C0),LtQ(p,CN1),IntBinomialQ(Times($s("a1"),$s("a2")),Times($s("b1"),$s("b2")),c,Times(C2,n),m,p,x)))),
IIntegrate(292,Integrate(Times(x_,Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1)),x_Symbol),
    Condition(Plus(Negate(Dist(Power(Times(C3,Rt(a,C3),Rt(b,C3)),CN1),Integrate(Power(Plus(Rt(a,C3),Times(Rt(b,C3),x)),CN1),x),x)),Dist(Power(Times(C3,Rt(a,C3),Rt(b,C3)),CN1),Integrate(Times(Plus(Rt(a,C3),Times(Rt(b,C3),x)),Power(Plus(Sqr(Rt(a,C3)),Times(CN1,Rt(a,C3),Rt(b,C3),x),Times(Sqr(Rt(b,C3)),Sqr(x))),CN1)),x),x)),FreeQ(List(a,b),x))),
IIntegrate(293,Integrate(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(a,Power(b,CN1)),n))),Set(s,Denominator(Rt(Times(a,Power(b,CN1)),n))),k,u),Simp(CompoundExpression(Set(u,Integrate(Times(Subtract(Times(r,Cos(Times(Subtract(Times(C2,k),C1),m,Pi,Power(n,CN1)))),Times(s,Cos(Times(Subtract(Times(C2,k),C1),Plus(m,C1),Pi,Power(n,CN1))),x)),Power(Plus(Sqr(r),Times(CN1,C2,r,s,Cos(Times(Subtract(Times(C2,k),C1),Pi,Power(n,CN1))),x),Times(Sqr(s),Sqr(x))),CN1)),x)),Plus(Times(CN1,Power(Negate(r),Plus(m,C1)),Integrate(Power(Plus(r,Times(s,x)),CN1),x),Power(Times(a,n,Power(s,m)),CN1)),Dist(Times(C2,Power(r,Plus(m,C1)),Power(Times(a,n,Power(s,m)),CN1)),Sum(u,List(k,C1,Times(C1D2,Subtract(n,C1)))),x))),x)),And(FreeQ(List(a,b),x),IGtQ(Times(C1D2,Subtract(n,C1)),C0),IGtQ(m,C0),LtQ(m,Subtract(n,C1)),PosQ(Times(a,Power(b,CN1)))))),
IIntegrate(294,Integrate(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,CN1)),n))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,CN1)),n))),k,u),Simp(CompoundExpression(Set(u,Integrate(Times(Plus(Times(r,Cos(Times(Subtract(Times(C2,k),C1),m,Pi,Power(n,CN1)))),Times(s,Cos(Times(Subtract(Times(C2,k),C1),Plus(m,C1),Pi,Power(n,CN1))),x)),Power(Plus(Sqr(r),Times(C2,r,s,Cos(Times(Subtract(Times(C2,k),C1),Pi,Power(n,CN1))),x),Times(Sqr(s),Sqr(x))),CN1)),x)),Subtract(Times(Power(r,Plus(m,C1)),Integrate(Power(Subtract(r,Times(s,x)),CN1),x),Power(Times(a,n,Power(s,m)),CN1)),Dist(Times(C2,Power(Negate(r),Plus(m,C1)),Power(Times(a,n,Power(s,m)),CN1)),Sum(u,List(k,C1,Times(C1D2,Subtract(n,C1)))),x))),x)),And(FreeQ(List(a,b),x),IGtQ(Times(C1D2,Subtract(n,C1)),C0),IGtQ(m,C0),LtQ(m,Subtract(n,C1)),NegQ(Times(a,Power(b,CN1)))))),
IIntegrate(295,Integrate(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(a,Power(b,CN1)),n))),Set(s,Denominator(Rt(Times(a,Power(b,CN1)),n))),k,u),Simp(CompoundExpression(Set(u,Plus(Integrate(Times(Subtract(Times(r,Cos(Times(Subtract(Times(C2,k),C1),m,Pi,Power(n,CN1)))),Times(s,Cos(Times(Subtract(Times(C2,k),C1),Plus(m,C1),Pi,Power(n,CN1))),x)),Power(Plus(Sqr(r),Times(CN1,C2,r,s,Cos(Times(Subtract(Times(C2,k),C1),Pi,Power(n,CN1))),x),Times(Sqr(s),Sqr(x))),CN1)),x),Integrate(Times(Plus(Times(r,Cos(Times(Subtract(Times(C2,k),C1),m,Pi,Power(n,CN1)))),Times(s,Cos(Times(Subtract(Times(C2,k),C1),Plus(m,C1),Pi,Power(n,CN1))),x)),Power(Plus(Sqr(r),Times(C2,r,s,Cos(Times(Subtract(Times(C2,k),C1),Pi,Power(n,CN1))),x),Times(Sqr(s),Sqr(x))),CN1)),x))),Plus(Times(C2,Power(CN1,Times(C1D2,m)),Power(r,Plus(m,C2)),Integrate(Power(Plus(Sqr(r),Times(Sqr(s),Sqr(x))),CN1),x),Power(Times(a,n,Power(s,m)),CN1)),Dist(Times(C2,Power(r,Plus(m,C1)),Power(Times(a,n,Power(s,m)),CN1)),Sum(u,List(k,C1,Times(C1D4,Subtract(n,C2)))),x))),x)),And(FreeQ(List(a,b),x),IGtQ(Times(C1D4,Subtract(n,C2)),C0),IGtQ(m,C0),LtQ(m,Subtract(n,C1)),PosQ(Times(a,Power(b,CN1)))))),
IIntegrate(296,Integrate(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,CN1)),n))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,CN1)),n))),k,u),Simp(CompoundExpression(Set(u,Plus(Integrate(Times(Subtract(Times(r,Cos(Times(C2,k,m,Pi,Power(n,CN1)))),Times(s,Cos(Times(C2,k,Plus(m,C1),Pi,Power(n,CN1))),x)),Power(Plus(Sqr(r),Times(CN1,C2,r,s,Cos(Times(C2,k,Pi,Power(n,CN1))),x),Times(Sqr(s),Sqr(x))),CN1)),x),Integrate(Times(Plus(Times(r,Cos(Times(C2,k,m,Pi,Power(n,CN1)))),Times(s,Cos(Times(C2,k,Plus(m,C1),Pi,Power(n,CN1))),x)),Power(Plus(Sqr(r),Times(C2,r,s,Cos(Times(C2,k,Pi,Power(n,CN1))),x),Times(Sqr(s),Sqr(x))),CN1)),x))),Plus(Times(C2,Power(r,Plus(m,C2)),Integrate(Power(Subtract(Sqr(r),Times(Sqr(s),Sqr(x))),CN1),x),Power(Times(a,n,Power(s,m)),CN1)),Dist(Times(C2,Power(r,Plus(m,C1)),Power(Times(a,n,Power(s,m)),CN1)),Sum(u,List(k,C1,Times(C1D4,Subtract(n,C2)))),x))),x)),And(FreeQ(List(a,b),x),IGtQ(Times(C1D4,Subtract(n,C2)),C0),IGtQ(m,C0),LtQ(m,Subtract(n,C1)),NegQ(Times(a,Power(b,CN1)))))),
IIntegrate(297,Integrate(Times(Sqr(x_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),CN1)),x_Symbol),
    Condition(With(List(Set(r,Numerator(Rt(Times(a,Power(b,CN1)),C2))),Set(s,Denominator(Rt(Times(a,Power(b,CN1)),C2)))),Subtract(Dist(Power(Times(C2,s),CN1),Integrate(Times(Plus(r,Times(s,Sqr(x))),Power(Plus(a,Times(b,Power(x,C4))),CN1)),x),x),Dist(Power(Times(C2,s),CN1),Integrate(Times(Subtract(r,Times(s,Sqr(x))),Power(Plus(a,Times(b,Power(x,C4))),CN1)),x),x))),And(FreeQ(List(a,b),x),Or(GtQ(Times(a,Power(b,CN1)),C0),And(PosQ(Times(a,Power(b,CN1))),AtomQ(SplitProduct($rubi("SumBaseQ"),a)),AtomQ(SplitProduct($rubi("SumBaseQ"),b))))))),
IIntegrate(298,Integrate(Times(Sqr(x_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),CN1)),x_Symbol),
    Condition(With(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,CN1)),C2))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,CN1)),C2)))),Subtract(Dist(Times(s,Power(Times(C2,b),CN1)),Integrate(Power(Plus(r,Times(s,Sqr(x))),CN1),x),x),Dist(Times(s,Power(Times(C2,b),CN1)),Integrate(Power(Subtract(r,Times(s,Sqr(x))),CN1),x),x))),And(FreeQ(List(a,b),x),Not(GtQ(Times(a,Power(b,CN1)),C0))))),
IIntegrate(299,Integrate(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(With(List(Set(r,Numerator(Rt(Times(a,Power(b,CN1)),C4))),Set(s,Denominator(Rt(Times(a,Power(b,CN1)),C4)))),Subtract(Dist(Times(Power(s,C3),Power(Times(C2,CSqrt2,b,r),CN1)),Integrate(Times(Power(x,Subtract(m,Times(C1D4,n))),Power(Plus(Sqr(r),Times(CN1,CSqrt2,r,s,Power(x,Times(C1D4,n))),Times(Sqr(s),Power(x,Times(C1D2,n)))),CN1)),x),x),Dist(Times(Power(s,C3),Power(Times(C2,CSqrt2,b,r),CN1)),Integrate(Times(Power(x,Subtract(m,Times(C1D4,n))),Power(Plus(Sqr(r),Times(CSqrt2,r,s,Power(x,Times(C1D4,n))),Times(Sqr(s),Power(x,Times(C1D2,n)))),CN1)),x),x))),And(FreeQ(List(a,b),x),IGtQ(Times(C1D4,n),C0),IGtQ(m,C0),LtQ(m,Subtract(n,C1)),GtQ(Times(a,Power(b,CN1)),C0)))),
IIntegrate(300,Integrate(Times(Power(x_,m_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(With(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,CN1)),C2))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,CN1)),C2)))),Plus(Dist(Times(r,Power(Times(C2,a),CN1)),Integrate(Times(Power(x,m),Power(Plus(r,Times(s,Power(x,Times(C1D2,n)))),CN1)),x),x),Dist(Times(r,Power(Times(C2,a),CN1)),Integrate(Times(Power(x,m),Power(Subtract(r,Times(s,Power(x,Times(C1D2,n)))),CN1)),x),x))),And(FreeQ(List(a,b),x),IGtQ(Times(C1D4,n),C0),IGtQ(m,C0),LtQ(m,Times(C1D2,n)),Not(GtQ(Times(a,Power(b,CN1)),C0)))))
  );
}
