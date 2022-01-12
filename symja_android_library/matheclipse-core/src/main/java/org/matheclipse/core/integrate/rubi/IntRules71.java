package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules71 { 
  public static IAST RULES = List( 
IIntegrate(1421,Integrate(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Times(CN2,d,Power(e,CN1)),Times(b,Power(c,CN1))),C2))),Plus(Dist(Times(e,Power(Times(C2,c,q),CN1)),Integrate(Times(Subtract(q,Times(C2,Power(x,Times(C1D2,n)))),Power(Simp(Subtract(Plus(Times(d,Power(e,CN1)),Times(q,Power(x,Times(C1D2,n)))),Power(x,n)),x),CN1)),x),x),Dist(Times(e,Power(Times(C2,c,q),CN1)),Integrate(Times(Plus(q,Times(C2,Power(x,Times(C1D2,n)))),Power(Simp(Subtract(Subtract(Times(d,Power(e,CN1)),Times(q,Power(x,Times(C1D2,n)))),Power(x,n)),x),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Subtract(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(Times(C1D2,n),C0),Not(GtQ(Subtract(Sqr(b),Times(C4,a,c)),C0))))),
IIntegrate(1422,Integrate(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Plus(Dist(Plus(Times(C1D2,e),Times(Subtract(Times(C2,c,d),Times(b,e)),Power(Times(C2,q),CN1))),Integrate(Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,Power(x,n))),CN1),x),x),Dist(Subtract(Times(C1D2,e),Times(Subtract(Times(C2,c,d),Times(b,e)),Power(Times(C2,q),CN1))),Integrate(Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,Power(x,n))),CN1),x),x))),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Or(PosQ(Subtract(Sqr(b),Times(C4,a,c))),Not(IGtQ(Times(C1D2,n),C0)))))),
IIntegrate(1423,Integrate(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(a,Power(c,CN1)),C2))),With(List(Set(r,Rt(Subtract(Times(C2,q),Times(b,Power(c,CN1))),C2))),Plus(Dist(Power(Times(C2,c,q,r),CN1),Integrate(Times(Subtract(Times(d,r),Times(Subtract(d,Times(e,q)),Power(x,Times(C1D2,n)))),Power(Plus(q,Times(CN1,r,Power(x,Times(C1D2,n))),Power(x,n)),CN1)),x),x),Dist(Power(Times(C2,c,q,r),CN1),Integrate(Times(Plus(Times(d,r),Times(Subtract(d,Times(e,q)),Power(x,Times(C1D2,n)))),Power(Plus(q,Times(r,Power(x,Times(C1D2,n))),Power(x,n)),CN1)),x),x)))),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IGtQ(Times(C1D2,n),C0),NegQ(Subtract(Sqr(b),Times(C4,a,c)))))),
IIntegrate(1424,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(q)))),
IIntegrate(1425,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),CN1)),x),x),And(FreeQ(List(a,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(q)))),
IIntegrate(1426,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(e),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),CN1)),Integrate(Power(Plus(d,Times(e,Power(x,n))),q),x),x),Dist(Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),CN1),Integrate(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Subtract(Subtract(Times(c,d),Times(b,e)),Times(c,e,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(q)),LtQ(q,CN1)))),
IIntegrate(1427,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(e),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),CN1)),Integrate(Power(Plus(d,Times(e,Power(x,n))),q),x),x),Dist(Times(c,Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),CN1)),Integrate(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Subtract(d,Times(e,Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),CN1)),x),x)),And(FreeQ(List(a,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(q)),LtQ(q,CN1)))),
IIntegrate(1428,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(With(List(Set(r,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(C2,c,Power(r,CN1)),Integrate(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(b,Negate(r),Times(C2,c,Power(x,n))),CN1)),x),x),Dist(Times(C2,c,Power(r,CN1)),Integrate(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(b,r,Times(C2,c,Power(x,n))),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,n,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(q))))),
IIntegrate(1429,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(With(List(Set(r,Rt(Times(CN1,a,c),C2))),Subtract(Negate(Dist(Times(c,Power(Times(C2,r),CN1)),Integrate(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Subtract(r,Times(c,Power(x,n))),CN1)),x),x)),Dist(Times(c,Power(Times(C2,r),CN1)),Integrate(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(r,Times(c,Power(x,n))),CN1)),x),x))),And(FreeQ(List(a,c,d,e,n,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(q))))),
IIntegrate(1430,Integrate(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Plus(Times(d,Sqr(b)),Times(CN1,a,b,e),Times(CN1,C2,a,c,d),Times(Subtract(Times(b,d),Times(C2,a,e)),c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1),Integrate(Times(Simp(Plus(Times(Plus(Times(n,p),n,C1),d,Sqr(b)),Times(CN1,a,b,e),Times(CN1,C2,a,c,d,Plus(Times(C2,n,p),Times(C2,n),C1)),Times(Plus(Times(C2,n,p),Times(C3,n),C1),Subtract(Times(d,b),Times(C2,a,e)),c,Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(p,CN1)))),
IIntegrate(1431,Integrate(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Plus(d,Times(e,Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(C2,a,n,Plus(p,C1)),CN1)),x)),Dist(Power(Times(C2,a,n,Plus(p,C1)),CN1),Integrate(Times(Plus(Times(d,Plus(Times(C2,n,p),Times(C2,n),C1)),Times(e,Plus(Times(C2,n,p),Times(C3,n),C1),Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),ILtQ(p,CN1)))),
IIntegrate(1432,Integrate(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times(Plus(d,Times(e,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(1433,Integrate(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times(Plus(d,Times(e,Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,c,d,e,n),x),EqQ($s("n2"),Times(C2,n))))),
IIntegrate(1434,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,p),Power(x,Plus(Times(C2,n,p),Negate(n),C1)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Power(Times(e,Plus(Times(C2,n,p),Times(n,q),C1)),CN1)),x),Integrate(Times(Power(Plus(d,Times(e,Power(x,n))),q),ExpandToSum(Subtract(Subtract(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Times(Power(c,p),Power(x,Times(C2,n,p)))),Times(d,Power(c,p),Plus(Times(C2,n,p),Negate(n),C1),Power(x,Subtract(Times(C2,n,p),n)),Power(Times(e,Plus(Times(C2,n,p),Times(n,q),C1)),CN1))),x)),x)),And(FreeQ(List(a,b,c,d,e,n,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(p,C0),NeQ(Plus(Times(C2,n,p),Times(n,q),C1),C0),IGtQ(n,C0),Not(IGtQ(q,C0))))),
IIntegrate(1435,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,p),Power(x,Plus(Times(C2,n,p),Negate(n),C1)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Power(Times(e,Plus(Times(C2,n,p),Times(n,q),C1)),CN1)),x),Integrate(Times(Power(Plus(d,Times(e,Power(x,n))),q),ExpandToSum(Subtract(Subtract(Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p),Times(Power(c,p),Power(x,Times(C2,n,p)))),Times(d,Power(c,p),Plus(Times(C2,n,p),Negate(n),C1),Power(x,Subtract(Times(C2,n,p),n)),Power(Times(e,Plus(Times(C2,n,p),Times(n,q),C1)),CN1))),x)),x)),And(FreeQ(List(a,c,d,e,n,q),x),EqQ($s("n2"),Times(C2,n)),IGtQ(p,C0),NeQ(Plus(Times(C2,n,p),Times(n,q),C1),C0),IGtQ(n,C0),Not(IGtQ(q,C0))))),
IIntegrate(1436,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,n,p,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Or(And(IntegersQ(p,q),Not(IntegerQ(n))),IGtQ(p,C0),And(IGtQ(q,C0),Not(IntegerQ(n))))))),
IIntegrate(1437,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,c,d,e,n,p,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Or(And(IntegersQ(p,q),Not(IntegerQ(n))),IGtQ(p,C0),And(IGtQ(q,C0),Not(IntegerQ(n))))))),
IIntegrate(1438,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p),Power(Subtract(Times(d,Power(Subtract(Sqr(d),Times(Sqr(e),Power(x,Times(C2,n)))),CN1)),Times(e,Power(x,n),Power(Subtract(Sqr(d),Times(Sqr(e),Power(x,Times(C2,n)))),CN1))),Negate(q)),x),x),And(FreeQ(List(a,c,d,e,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),ILtQ(q,C0)))),
IIntegrate(1439,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,d,e,n,p,q),x),EqQ($s("n2"),Times(C2,n))))),
IIntegrate(1440,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,c,d,e,n,p,q),x),EqQ($s("n2"),Times(C2,n)))))
  );
}
