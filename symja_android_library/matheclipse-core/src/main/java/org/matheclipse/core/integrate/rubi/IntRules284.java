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
class IntRules284 { 
  public static IAST RULES = List( 
IIntegrate(5681,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),CN1)),x),Negate(Dist(Times(b,c,n,Power(Negate(d),p),Power(Plus(Times(C2,p),C1),CN1)),Integrate(Times(x,Power(Plus(CN1,Times(c,x)),Subtract(p,C1D2)),Power(Plus(C1,Times(c,x)),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1))),x),x)),Dist(Times(C2,d,p,Power(Plus(Times(C2,p),C1),CN1)),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),Subtract(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),GtQ(p,C0),IntegerQ(p)))),
IIntegrate(5682,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,x,Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),Dist(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(C2,Sqrt(Plus(C1,Times(Sqr(c),Sqr(x))))),CN1)),Integrate(Times(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(b,c,n,Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(C2,Sqrt(Plus(C1,Times(Sqr(c),Sqr(x))))),CN1)),Integrate(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Subtract(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(n,C0)))),
IIntegrate(5683,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Sqrt(Plus($p("d1"),Times($p("e1",true),x_))),Sqrt(Plus($p("d2"),Times($p("e2",true),x_)))),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,x,Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),Negate(Dist(Times(Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Times(C2,Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),CN1)),Integrate(Times(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),CN1)),x),x)),Negate(Dist(Times(b,c,n,Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Times(C2,Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),CN1)),Integrate(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0)))),
IIntegrate(5684,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),CN1)),x),Dist(Times(C2,d,p,Power(Plus(Times(C2,p),C1),CN1)),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),Subtract(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(Plus(Times(C2,p),C1),Power(Plus(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),CN1)),Integrate(Times(x,Power(Plus(C1,Times(Sqr(c),Sqr(x))),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Subtract(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(n,C0),GtQ(p,C0)))),
IIntegrate(5685,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),CN1)),x),Dist(Times(C2,$s("d1"),$s("d2"),p,Power(Plus(Times(C2,p),C1),CN1)),Integrate(Times(Power(Plus($s("d1"),Times($s("e1"),x)),Subtract(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Subtract(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(Times(CN1,$s("d1"),$s("d2")),Subtract(p,C1D2)),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Times(Plus(Times(C2,p),C1),Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),CN1)),Integrate(Times(x,Power(Plus(CN1,Times(Sqr(c),Sqr(x))),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0),GtQ(p,C0),IntegerQ(Subtract(p,C1D2))))),
IIntegrate(5686,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),CN1)),x),Dist(Times(C2,$s("d1"),$s("d2"),p,Power(Plus(Times(C2,p),C1),CN1)),Integrate(Times(Power(Plus($s("d1"),Times($s("e1"),x)),Subtract(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Subtract(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(Times(CN1,$s("d1"),$s("d2")),IntPart(p)),Power(Plus($s("d1"),Times($s("e1"),x)),FracPart(p)),Power(Plus($s("d2"),Times($s("e2"),x)),FracPart(p)),Power(Times(Plus(Times(C2,p),C1),Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),CN1)),Integrate(Times(x,Power(Plus(CN1,Times(c,x)),Subtract(p,C1D2)),Power(Plus(C1,Times(c,x)),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0),GtQ(p,C0)))),
IIntegrate(5687,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Subtract(Simp(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x),Dist(Times(b,c,n,Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),Integrate(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Subtract(n,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(n,C0)))),
IIntegrate(5688,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),QQ(-3L,2L)),Power(Plus($p("d2"),Times($p("e2",true),x_)),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times($s("d1"),$s("d2"),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),CN1)),x),Dist(Times(b,c,n,Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Times($s("d1"),$s("d2"),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),CN1)),Integrate(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1)),Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0)))),
IIntegrate(5689,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,d,Plus(p,C1)),CN1)),x)),Negate(Dist(Times(b,c,n,Power(Negate(d),p),Power(Times(C2,Plus(p,C1)),CN1)),Integrate(Times(x,Power(Plus(C1,Times(c,x)),Plus(p,C1D2)),Power(Plus(CN1,Times(c,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1))),x),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(p,CN1),IntegerQ(p)))),
IIntegrate(5690,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Times(C2,d,Plus(p,C1)),CN1)),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(C2,Plus(p,C1),Power(Plus(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),CN1)),Integrate(Times(x,Power(Plus(C1,Times(Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Subtract(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(n,C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L))))),
IIntegrate(5691,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,$s("d1"),$s("d2"),Plus(p,C1)),CN1)),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,$s("d1"),$s("d2"),Plus(p,C1)),CN1)),Integrate(Times(Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(Times(CN1,$s("d1"),$s("d2")),Plus(p,C1D2)),Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Times(C2,Plus(p,C1),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),CN1)),Integrate(Times(x,Power(Plus(CN1,Times(Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L)),IntegerQ(Plus(p,C1D2))))),
IIntegrate(5692,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,$s("d1"),$s("d2"),Plus(p,C1)),CN1)),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,$s("d1"),$s("d2"),Plus(p,C1)),CN1)),Integrate(Times(Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(Times(CN1,$s("d1"),$s("d2")),IntPart(p)),Power(Plus($s("d1"),Times($s("e1"),x)),FracPart(p)),Power(Plus($s("d2"),Times($s("e2"),x)),FracPart(p)),Power(Times(C2,Plus(p,C1),Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),CN1)),Integrate(Times(x,Power(Plus(C1,Times(c,x)),Plus(p,C1D2)),Power(Plus(CN1,Times(c,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L))))),
IIntegrate(5693,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Dist(Power(Times(c,d),CN1),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),n),Sech(x)),x),x,ArcSinh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(n,C0)))),
IIntegrate(5694,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Negate(Dist(Power(Times(c,d),CN1),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),n),Csch(x)),x),x,ArcCosh(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(n,C0)))),
IIntegrate(5695,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Negate(d),p),Power(Plus(CN1,Times(c,x)),Plus(p,C1D2)),Power(Plus(C1,Times(c,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),CN1)),x),Dist(Times(c,Power(Negate(d),p),Plus(Times(C2,p),C1),Power(Times(b,Plus(n,C1)),CN1)),Integrate(Times(x,Power(Plus(CN1,Times(c,x)),Subtract(p,C1D2)),Power(Plus(C1,Times(c,x)),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1),IntegerQ(p)))),
IIntegrate(5696,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),CN1)),x),Dist(Times(c,Plus(Times(C2,p),C1),Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,Plus(n,C1),Power(Plus(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),CN1)),Integrate(Times(x,Power(Plus(C1,Times(Sqr(c),Sqr(x))),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),LtQ(n,CN1)))),
IIntegrate(5697,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),CN1)),x),Dist(Times(c,Plus(Times(C2,p),C1),Power(Times(CN1,$s("d1"),$s("d2")),Subtract(p,C1D2)),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Times(b,Plus(n,C1),Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),CN1)),Integrate(Times(x,Power(Plus(CN1,Times(Sqr(c),Sqr(x))),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),p),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),LtQ(n,CN1),IntegerQ(Subtract(p,C1D2))))),
IIntegrate(5698,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),CN1)),x),Dist(Times(c,Plus(Times(C2,p),C1),Power(Times(CN1,$s("d1"),$s("d2")),IntPart(p)),Power(Plus($s("d1"),Times($s("e1"),x)),FracPart(p)),Power(Plus($s("d2"),Times($s("e2"),x)),FracPart(p)),Power(Times(b,Plus(n,C1),Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),CN1)),Integrate(Times(x,Power(Plus(C1,Times(c,x)),Subtract(p,C1D2)),Power(Plus(CN1,Times(c,x)),Subtract(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),p),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),LtQ(n,CN1)))),
IIntegrate(5699,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,p),Power(c,CN1)),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),n),Power(Cosh(x),Plus(Times(C2,p),C1))),x),x,ArcSinh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(e,Times(Sqr(c),d)),IGtQ(Times(C2,p),C0),Or(IntegerQ(p),GtQ(d,C0))))),
IIntegrate(5700,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Negate(d),p),Power(c,CN1)),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),n),Power(Sinh(x),Plus(Times(C2,p),C1))),x),x,ArcCosh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0))))
  );
}
