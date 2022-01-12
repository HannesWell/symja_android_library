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
class IntRules124 { 
  public static IAST RULES = List( 
IIntegrate(2481,Integrate(Times(Power(Log(Times(f_DEFAULT,Power(x_,q_DEFAULT))),m_DEFAULT),Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),p_DEFAULT))),b_DEFAULT)),Power(x_,CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Log(Times(f,Power(x,q))),Plus(m,C1)),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,Power(x,n))),p))))),Power(Times(q,Plus(m,C1)),CN1)),x),Dist(Times(b,e,n,p,Power(Times(q,Plus(m,C1)),CN1)),Integrate(Times(Power(x,Subtract(n,C1)),Power(Log(Times(f,Power(x,q))),Plus(m,C1)),Power(Plus(d,Times(e,Power(x,n))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q),x),NeQ(m,CN1)))),
IIntegrate(2482,Integrate(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),p_DEFAULT))),b_DEFAULT)),Power($(F_,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(F(Times(f,x)),m),x))),Subtract(Dist(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,Power(x,n))),p))))),u,x),Dist(Times(b,e,n,p),Integrate(SimplifyIntegrand(Times(u,Power(x,Subtract(n,C1)),Power(Plus(d,Times(e,Power(x,n))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,p),x),MemberQ(List(ArcSin,ArcCos,ArcSinh,ArcCosh),FSymbol),IGtQ(m,C0),IGtQ(n,C1)))),
IIntegrate(2483,Integrate(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_))),p_DEFAULT))),b_DEFAULT)),q_DEFAULT),x_Symbol),
    Condition(Dist(Power(g,CN1),Subst(Integrate(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,Power(x,n))),p))))),q),x),x,Plus(f,Times(g,x))),x),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),IGtQ(q,C0),Or(EqQ(q,C1),IntegerQ(n))))),
IIntegrate(2484,Integrate(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_))),p_DEFAULT))),b_DEFAULT)),q_DEFAULT),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,Power(Plus(f,Times(g,x)),n))),p))))),q),x),FreeQ(List(a,b,c,d,e,f,g,n,p,q),x))),
IIntegrate(2485,Integrate(Times(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Integrate(Times(u,Power(Log(Times(e,Power(Times(Power(b,p),f,Power(Plus(c,Times(d,x)),Plus(p,q)),Power(Power(d,p),CN1)),r))),s)),x),And(FreeQ(List(a,b,c,d,e,f,p,q,r,s),x),EqQ(Subtract(Times(b,c),Times(a,d)),C0),IntegerQ(p)))),
IIntegrate(2486,Integrate(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(b,CN1)),x),Dist(Times(q,r,s,Subtract(Times(b,c),Times(a,d)),Power(b,CN1)),Integrate(Times(Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Subtract(s,C1)),Power(Plus(c,Times(d,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,p,q,r,s),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(p,q),C0),IGtQ(s,C0)))),
IIntegrate(2487,Integrate(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(b,CN1)),x),Dist(Times(q,r,s,Subtract(Times(b,c),Times(a,d)),Power(b,CN1)),Integrate(Times(Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Subtract(s,C1)),Power(Plus(c,Times(d,x)),CN1)),x),x),Negate(Dist(Times(r,s,Plus(p,q)),Integrate(Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Subtract(s,C1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,p,q,r,s),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(p,q),C0),IGtQ(s,C0),LtQ(s,C4)))),
IIntegrate(2488,Integrate(Times(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_DEFAULT),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Log(Times(CN1,Subtract(Times(b,c),Times(a,d)),Power(Times(d,Plus(a,Times(b,x))),CN1))),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(h,CN1)),x)),Dist(Times(p,r,s,Subtract(Times(b,c),Times(a,d)),Power(h,CN1)),Integrate(Times(Log(Times(CN1,Subtract(Times(b,c),Times(a,d)),Power(Times(d,Plus(a,Times(b,x))),CN1))),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Subtract(s,C1)),Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q,r,s),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(p,q),C0),EqQ(Subtract(Times(b,g),Times(a,h)),C0),IGtQ(s,C0)))),
IIntegrate(2489,Integrate(Times(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(d,Power(h,CN1)),Integrate(Times(Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(Plus(c,Times(d,x)),CN1)),x),x),Dist(Times(Subtract(Times(d,g),Times(c,h)),Power(h,CN1)),Integrate(Times(Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(Times(Plus(c,Times(d,x)),Plus(g,Times(h,x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q,r,s),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(p,q),C0),NeQ(Subtract(Times(b,g),Times(a,h)),C0),NeQ(Subtract(Times(d,g),Times(c,h)),C0),IGtQ(s,C1)))),
IIntegrate(2490,Integrate(Times(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_DEFAULT),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN2)),x_Symbol),
    Condition(Subtract(Simp(Times(Plus(a,Times(b,x)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(Times(Subtract(Times(b,g),Times(a,h)),Plus(g,Times(h,x))),CN1)),x),Dist(Times(p,r,s,Subtract(Times(b,c),Times(a,d)),Power(Subtract(Times(b,g),Times(a,h)),CN1)),Integrate(Times(Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Subtract(s,C1)),Power(Times(Plus(c,Times(d,x)),Plus(g,Times(h,x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q,r,s),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(p,q),C0),NeQ(Subtract(Times(b,g),Times(a,h)),C0),IGtQ(s,C0)))),
IIntegrate(2491,Integrate(Times(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN3)),x_Symbol),
    Condition(Subtract(Dist(Times(d,Power(Subtract(Times(d,g),Times(c,h)),CN1)),Integrate(Times(Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(Plus(g,Times(h,x)),CN2)),x),x),Dist(Times(h,Power(Subtract(Times(d,g),Times(c,h)),CN1)),Integrate(Times(Plus(c,Times(d,x)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(Plus(g,Times(h,x)),CN3)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q,r,s),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(p,q),C0),EqQ(Subtract(Times(b,g),Times(a,h)),C0),NeQ(Subtract(Times(d,g),Times(c,h)),C0),IGtQ(s,C0)))),
IIntegrate(2492,Integrate(Times(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_DEFAULT),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(Times(h,Plus(m,C1)),CN1)),x),Dist(Times(p,r,s,Subtract(Times(b,c),Times(a,d)),Power(Times(h,Plus(m,C1)),CN1)),Integrate(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Subtract(s,C1)),Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,m,p,q,r,s),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(p,q),C0),IGtQ(s,C0),NeQ(m,CN1)))),
IIntegrate(2493,Integrate(Times(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),CN1),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN2)),x_Symbol),
    Condition(Simp(Times(b,Plus(c,Times(d,x)),Power(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r)),Power(Times(p,r),CN1)),ExpIntegralEi(Times(CN1,Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Power(Times(p,r),CN1))),Power(Times(h,p,r,Subtract(Times(b,c),Times(a,d)),Plus(g,Times(h,x))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q,r),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(p,q),C0),EqQ(Subtract(Times(b,g),Times(a,h)),C0)))),
IIntegrate(2494,Integrate(Times(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Log(Plus(g,Times(h,x))),Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Power(h,CN1)),x),Negate(Dist(Times(b,p,r,Power(h,CN1)),Integrate(Times(Log(Plus(g,Times(h,x))),Power(Plus(a,Times(b,x)),CN1)),x),x)),Negate(Dist(Times(d,q,r,Power(h,CN1)),Integrate(Times(Log(Plus(g,Times(h,x))),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q,r),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0)))),
IIntegrate(2495,Integrate(Times(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Power(Times(h,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,p,r,Power(Times(h,Plus(m,C1)),CN1)),Integrate(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(Plus(a,Times(b,x)),CN1)),x),x)),Negate(Dist(Times(d,q,r,Power(Times(h,Plus(m,C1)),CN1)),Integrate(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h,m,p,q,r),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(m,CN1)))),
IIntegrate(2496,Integrate(Times(Sqr(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Integrate(Times(Sqr(Plus(Log(Power(Plus(a,Times(b,x)),Times(p,r))),Log(Power(Plus(c,Times(d,x)),Times(q,r))))),Power(Plus(g,Times(h,x)),CN1)),x),Simp(Times(Subtract(Subtract(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Log(Power(Plus(a,Times(b,x)),Times(p,r)))),Log(Power(Plus(c,Times(d,x)),Times(q,r)))),Plus(Times(C2,Integrate(Times(Log(Power(Plus(c,Times(d,x)),Times(q,r))),Power(Plus(g,Times(h,x)),CN1)),x)),Integrate(Times(Plus(Log(Power(Plus(a,Times(b,x)),Times(p,r))),Negate(Log(Power(Plus(c,Times(d,x)),Times(q,r)))),Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r)))),Power(Plus(g,Times(h,x)),CN1)),x))),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q,r),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Subtract(Times(b,g),Times(a,h)),C0)))),
IIntegrate(2497,Integrate(Times(Sqr(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Log(Plus(g,Times(h,x))),Sqr(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r)))),Power(h,CN1)),x),Negate(Dist(Times(C2,b,p,r,Power(h,CN1)),Integrate(Times(Log(Plus(g,Times(h,x))),Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Power(Plus(a,Times(b,x)),CN1)),x),x)),Negate(Dist(Times(C2,d,q,r,Power(h,CN1)),Integrate(Times(Log(Plus(g,Times(h,x))),Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h,p,q,r),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0)))),
IIntegrate(2498,Integrate(Times(Power(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),s_),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),s),Power(Times(h,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,p,r,s,Power(Times(h,Plus(m,C1)),CN1)),Integrate(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Subtract(s,C1)),Power(Plus(a,Times(b,x)),CN1)),x),x)),Negate(Dist(Times(d,q,r,s,Power(Times(h,Plus(m,C1)),CN1)),Integrate(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Subtract(s,C1)),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h,m,p,q,r,s),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),IGtQ(s,C0),NeQ(m,CN1)))),
IIntegrate(2499,Integrate(Times(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),Power(Plus(s_DEFAULT,Times(Log(Times(i_DEFAULT,Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),n_DEFAULT))),t_DEFAULT)),m_DEFAULT),Power(Plus(j_DEFAULT,Times(k_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(s,Times(t,Log(Times(i,Power(Plus(g,Times(h,x)),n))))),Plus(m,C1)),Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Power(Times(k,n,t,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,p,r,Power(Times(k,n,t,Plus(m,C1)),CN1)),Integrate(Times(Power(Plus(s,Times(t,Log(Times(i,Power(Plus(g,Times(h,x)),n))))),Plus(m,C1)),Power(Plus(a,Times(b,x)),CN1)),x),x)),Negate(Dist(Times(d,q,r,Power(Times(k,n,t,Plus(m,C1)),CN1)),Integrate(Times(Power(Plus(s,Times(t,Log(Times(i,Power(Plus(g,Times(h,x)),n))))),Plus(m,C1)),Power(Plus(c,Times(d,x)),CN1)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h,i,j,k,s,t,m,n,p,q,r),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Subtract(Times(h,j),Times(g,k)),C0),IGtQ(m,C0)))),
IIntegrate(2500,Integrate(Times(Log(Times(e_DEFAULT,Power(Times(f_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),q_DEFAULT)),r_DEFAULT))),Plus(s_DEFAULT,Times(Log(Times(i_DEFAULT,Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),n_DEFAULT))),t_DEFAULT)),Power(Plus(j_DEFAULT,Times(k_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Plus(Dist(Subtract(Subtract(Log(Times(e,Power(Times(f,Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),r))),Log(Power(Plus(a,Times(b,x)),Times(p,r)))),Log(Power(Plus(c,Times(d,x)),Times(q,r)))),Integrate(Times(Plus(s,Times(t,Log(Times(i,Power(Plus(g,Times(h,x)),n))))),Power(Plus(j,Times(k,x)),CN1)),x),x),Integrate(Times(Log(Power(Plus(a,Times(b,x)),Times(p,r))),Plus(s,Times(t,Log(Times(i,Power(Plus(g,Times(h,x)),n))))),Power(Plus(j,Times(k,x)),CN1)),x),Integrate(Times(Log(Power(Plus(c,Times(d,x)),Times(q,r))),Plus(s,Times(t,Log(Times(i,Power(Plus(g,Times(h,x)),n))))),Power(Plus(j,Times(k,x)),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f,g,h,i,j,k,s,t,n,p,q,r),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0))))
  );
}
