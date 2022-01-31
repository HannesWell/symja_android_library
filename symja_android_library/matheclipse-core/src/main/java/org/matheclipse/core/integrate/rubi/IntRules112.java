package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi - rule-based
 * integrator</a>.
 *
 */
class IntRules112 {
  public static IAST RULES = List(
      IIntegrate(2241,
          Integrate(
              Times(
                  Power(F_, Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                      Times(c_DEFAULT, Sqr(x_)))),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                          Power(FSymbol, Plus(a, Times(b, x), Times(c, Sqr(x)))), Power(
                              Times(C2, c, Log(FSymbol)), CN1)),
                      x),
                  Negate(Dist(
                      Times(Subtract(Times(b, e), Times(C2, c, d)), Power(Times(C2, c), CN1)),
                      Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                          Power(FSymbol, Plus(a, Times(b, x), Times(c, Sqr(x))))), x),
                      x)),
                  Negate(
                      Dist(Times(Subtract(m, C1), Sqr(e), Power(Times(C2, c, Log(FSymbol)), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                              Power(FSymbol, Plus(a, Times(b, x), Times(c, Sqr(x))))), x),
                          x))),
              And(FreeQ(List(FSymbol, a, b, c, d, e), x),
                  NeQ(Subtract(Times(b, e), Times(C2, c, d)), C0), GtQ(m, C1)))),
      IIntegrate(2242,
          Integrate(
              Times(
                  Power(F_, Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_)))),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(FSymbol, Plus(a, Times(b, x),
                              Times(c, Sqr(x)))),
                          Power(Times(e, Plus(m, C1)), CN1)),
                      x),
                  Negate(Dist(Times(C2, c, Log(FSymbol), Power(Times(Sqr(e), Plus(m, C1)), CN1)),
                      Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C2)),
                          Power(FSymbol, Plus(a, Times(b, x), Times(c, Sqr(x))))), x),
                      x)),
                  Negate(Dist(
                      Times(Subtract(Times(b, e), Times(C2, c, d)), Log(FSymbol),
                          Power(Times(Sqr(e), Plus(m, C1)), CN1)),
                      Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(FSymbol, Plus(a, Times(b, x), Times(c, Sqr(x))))), x),
                      x))),
              And(FreeQ(List(FSymbol, a, b, c, d, e), x),
                  NeQ(Subtract(Times(b, e), Times(C2, c, d)), C0), LtQ(m, CN1)))),
      IIntegrate(2243,
          Integrate(
              Times(Power(F_, Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_)))),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_DEFAULT)),
              x_Symbol),
          Condition(
              Unintegrable(
                  Times(Power(FSymbol, Plus(a, Times(b, x), Times(c, Sqr(x)))),
                      Power(Plus(d, Times(e, x)), m)),
                  x),
              FreeQ(List(FSymbol, a, b, c, d, e, m), x))),
      IIntegrate(
          2244, Integrate(Times(Power(F_, v_),
              Power(u_, m_DEFAULT)), x_Symbol),
          Condition(
              Integrate(Times(Power(ExpandToSum(u, x), m),
                  Power(FSymbol, ExpandToSum(v, x))), x),
              And(FreeQ(List(FSymbol,
                  m), x), LinearQ(u, x), QuadraticQ(v,
                      x),
                  Not(And(LinearMatchQ(u, x), QuadraticMatchQ(v, x)))))),
      IIntegrate(2245,
          Integrate(
              Times(Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(F_, v_))), p_),
                  Power(x_, m_DEFAULT)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(u,
                          IntHide(Times(Power(FSymbol, Times(e, Plus(c, Times(d, x)))),
                              Power(Plus(a, Times(b, Power(FSymbol, v))), p)), x))),
                  Subtract(Dist(Power(x, m), u, x),
                      Dist(m, Integrate(Times(Power(x, Subtract(m, C1)), u), x), x))),
              And(FreeQ(List(FSymbol, a, b, c, d, e), x), EqQ(v, Times(C2, e,
                  Plus(c, Times(d, x)))), GtQ(m,
                      C0),
                  ILtQ(p, C0)))),
      IIntegrate(2246,
          Integrate(
              Times(
                  Power(
                      Power(F_, Times(e_DEFAULT,
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                      n_DEFAULT),
                  Power(Plus(a_,
                      Times(b_DEFAULT,
                          Power(Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                              n_DEFAULT))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Dist(Power(Times(d, e, n, Log(FSymbol)), CN1),
                  Subst(
                      Integrate(Power(Plus(a, Times(b, x)), p), x), x, Power(
                          Power(FSymbol, Times(e, Plus(c, Times(d, x)))), n)),
                  x),
              FreeQ(List(FSymbol, a, b, c, d, e, n, p), x))),
      IIntegrate(2247,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT,
                              Power(
                                  Power(F_,
                                      Times(e_DEFAULT, Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                                  n_DEFAULT))),
                      p_DEFAULT),
                  Power(
                      Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)))),
                      m_DEFAULT)),
              x_Symbol),
          Condition(
              Dist(
                  Times(Power(Power(GSymbol, Times(h, Plus(f, Times(g, x)))), m),
                      Power(Power(Power(FSymbol, Times(e, Plus(c, Times(d, x)))), n), CN1)),
                  Integrate(
                      Times(Power(Power(FSymbol, Times(e, Plus(c, Times(d, x)))), n),
                          Power(
                              Plus(a,
                                  Times(b,
                                      Power(Power(FSymbol, Times(e, Plus(c, Times(d, x)))), n))),
                              p)),
                      x),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, a, b, c, d, e, f, g, h, m, n, p), x),
                  EqQ(Times(d, e, n, Log(FSymbol)), Times(g, h, m, Log(GSymbol)))))),
      IIntegrate(2248,
          Integrate(
              Times(
                  Power(Plus(a_,
                      Times(b_DEFAULT, Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_)))))),
                      p_DEFAULT),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT, Times(g_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(m,
                          FullSimplify(Times(g, h, Log(GSymbol),
                              Power(Times(d, e, Log(FSymbol)), CN1))))),
                  Condition(
                      Dist(
                          Times(Denominator(m),
                              Power(GSymbol, Subtract(Times(f, h), Times(c, g, h, Power(d, CN1)))),
                              Power(Times(d, e, Log(FSymbol)), CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(x, Subtract(Numerator(m), C1)),
                                      Power(Plus(a, Times(b, Power(x, Denominator(m)))), p)),
                                  x),
                              x, Power(FSymbol,
                                  Times(e, Plus(c, Times(d, x)), Power(Denominator(m), CN1)))),
                          x),
                      Or(LeQ(m, CN1), GeQ(m, C1)))),
              FreeQ(List(FSymbol, GSymbol, a, b, c, d, e, f, g, h, p), x))),
      IIntegrate(2249,
          Integrate(
              Times(
                  Power(Plus(a_,
                      Times(b_DEFAULT, Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_)))))),
                      p_DEFAULT),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT, Times(g_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              With(List(Set(m,
                  FullSimplify(Times(d, e, Log(FSymbol), Power(Times(g, h, Log(GSymbol)), CN1))))),
                  Condition(
                      Dist(Times(Denominator(m), Power(Times(g, h, Log(GSymbol)), CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(x, Subtract(Denominator(m), C1)),
                                      Power(Plus(a, Times(b,
                                          Power(FSymbol,
                                              Subtract(Times(c, e), Times(d, e, f, Power(g, CN1)))),
                                          Power(x, Numerator(m)))), p)),
                                  x),
                              x,
                              Power(
                                  GSymbol, Times(h, Plus(f, Times(g, x)),
                                      Power(Denominator(m), CN1)))),
                          x),
                      Or(LtQ(m, CN1), GtQ(m, C1)))),
              FreeQ(List(FSymbol, GSymbol, a, b, c, d, e, f, g, h, p), x))),
      IIntegrate(2250,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT, Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT,
                              Times(d_DEFAULT, x_)))))),
                      p_DEFAULT),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT, Times(g_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              Integrate(
                  Expand(
                      Times(Power(GSymbol, Times(h, Plus(f, Times(g, x)))),
                          Power(Plus(a, Times(b, Power(FSymbol, Times(e, Plus(c, Times(d, x)))))),
                              p)),
                      x),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, a, b, c, d, e, f, g, h), x), IGtQ(p, C0)))),
      IIntegrate(2251,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(
                              b_DEFAULT, Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_)))))),
                      p_),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT, Times(g_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              Simp(
                  Times(
                      Power(a, p), Power(GSymbol, Times(h,
                          Plus(f, Times(g, x)))),
                      Hypergeometric2F1(Negate(p),
                          Times(g, h, Log(GSymbol), Power(Times(d, e, Log(FSymbol)),
                              CN1)),
                          Plus(Times(g, h, Log(GSymbol),
                              Power(Times(d, e, Log(FSymbol)), CN1)), C1),
                          Simplify(
                              Times(
                                  CN1, b, Power(FSymbol, Times(e,
                                      Plus(c, Times(d, x)))),
                                  Power(a, CN1)))),
                      Power(Times(g, h, Log(GSymbol)), CN1)),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, a, b, c, d, e, f, g, h, p), x),
                  Or(ILtQ(p, C0), GtQ(a, C0))))),
      IIntegrate(2252,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(
                              b_DEFAULT, Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_)))))),
                      p_),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT, Times(g_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(Plus(a,
                          Times(b, Power(FSymbol, Times(e, Plus(c, Times(d, x)))))), p),
                      Power(
                          Power(Plus(C1,
                              Times(b, Power(a, CN1),
                                  Power(FSymbol, Times(e, Plus(c, Times(d, x)))))),
                              p),
                          CN1)),
                  Integrate(
                      Times(
                          Power(GSymbol, Times(h,
                              Plus(f, Times(g, x)))),
                          Power(
                              Plus(C1,
                                  Times(
                                      b, Power(FSymbol, Times(e, Plus(c, Times(d, x)))), Power(a,
                                          CN1))),
                              p)),
                      x),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, a, b, c, d, e, f, g, h,
                  p), x), Not(
                      Or(ILtQ(p, C0), GtQ(a, C0)))))),
      IIntegrate(2253,
          Integrate(
              Times(
                  Power(Plus(a_,
                      Times(b_DEFAULT, Power(F_, Times(e_DEFAULT, v_)))), p_),
                  Power(G_, Times(h_DEFAULT, u_))),
              x_Symbol),
          Condition(
              Integrate(
                  Times(Power(GSymbol, Times(h, ExpandToSum(u, x))), Power(
                      Plus(a, Times(b, Power(FSymbol, Times(e, ExpandToSum(v, x))))), p)),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, a, b, e, h,
                  p), x), LinearQ(List(u, v),
                      x),
                  Not(LinearMatchQ(List(u, v), x))))),
      IIntegrate(2254,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(F_, u_))), p_DEFAULT),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT, Power(F_, v_))), q_DEFAULT), Power(
                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(w,
                          ExpandIntegrand(
                              Power(Plus(e,
                                  Times(f, x)), m),
                              Times(
                                  Power(Plus(a, Times(b,
                                      Power(FSymbol, u))), p),
                                  Power(Plus(c, Times(d, Power(FSymbol, v))), q)),
                              x))),
                  Condition(Integrate(w, x), SumQ(w))),
              And(FreeQ(List(FSymbol, a, b, c, d, e, f, m), x), IntegersQ(p, q), LinearQ(List(u, v),
                  x), RationalQ(Simplify(Times(u, Power(v, CN1))))))),
      IIntegrate(2255,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(
                              b_DEFAULT, Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_)))))),
                      p_DEFAULT),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)))),
                  Power($p("H"), Times(t_DEFAULT, Plus(r_DEFAULT, Times(s_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(m,
                          FullSimplify(
                              Times(Plus(Times(g, h, Log(
                                  GSymbol)), Times(s, t, Log($s("H")))),
                                  Power(Times(d, e, Log(FSymbol)), CN1))))),
                  Condition(
                      Dist(
                          Times(Denominator(m),
                              Power(GSymbol, Subtract(Times(f, h), Times(c, g, h, Power(d, CN1)))),
                              Power($s("H"), Subtract(Times(r, t), Times(c, s, t, Power(d, CN1)))),
                              Power(Times(d, e, Log(FSymbol)), CN1)),
                          Subst(
                              Integrate(Times(Power(x, Subtract(Numerator(m), C1)),
                                  Power(Plus(a, Times(b, Power(x, Denominator(m)))), p)), x),
                              x,
                              Power(
                                  FSymbol, Times(e, Plus(c, Times(d, x)),
                                      Power(Denominator(m), CN1)))),
                          x),
                      RationalQ(m))),
              FreeQ(List(FSymbol, GSymbol, $s("H"), a, b, c, d, e, f, g, h, r, s, t, p), x))),
      IIntegrate(2256,
          Integrate(
              Times(
                  Power(Plus(a_,
                      Times(b_DEFAULT, Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_)))))),
                      p_DEFAULT),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)))),
                  Power($p("H"), Times(t_DEFAULT, Plus(r_DEFAULT, Times(s_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              Dist(Power(GSymbol, Times(Subtract(f, Times(c, g, Power(d, CN1))), h)),
                  Integrate(
                      Times(Power($s("H"), Times(t, Plus(r, Times(s, x)))),
                          Power(
                              Plus(b,
                                  Times(a,
                                      Power(Power(FSymbol, Times(e, Plus(c, Times(d, x)))), CN1))),
                              p)),
                      x),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, $s("H"), a, b, c, d, e, f, g, h, r, s, t), x),
                  EqQ(Plus(Times(d, e, p, Log(FSymbol)),
                      Times(g, h, Log(GSymbol))), C0),
                  IntegerQ(p)))),
      IIntegrate(2257,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT, Power(F_, Times(e_DEFAULT, Plus(c_DEFAULT,
                              Times(d_DEFAULT, x_)))))),
                      p_DEFAULT),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)))),
                  Power($p("H"), Times(t_DEFAULT, Plus(r_DEFAULT, Times(s_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              Integrate(
                  Expand(
                      Times(Power(GSymbol, Times(h, Plus(f, Times(g, x)))),
                          Power($s("H"), Times(t,
                              Plus(r, Times(s, x)))),
                          Power(
                              Plus(a, Times(b, Power(FSymbol,
                                  Times(e, Plus(c, Times(d, x)))))),
                              p)),
                      x),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, $s("H"), a, b, c, d, e, f, g, h, r, s, t), x),
                  IGtQ(p, C0)))),
      IIntegrate(2258,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(
                              b_DEFAULT, Power(F_, Times(e_DEFAULT,
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_)))))),
                      p_),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)))),
                  Power($p("H"), Times(t_DEFAULT, Plus(r_DEFAULT, Times(s_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              Simp(
                  Times(Power(a, p), Power(GSymbol, Times(h, Plus(f, Times(g, x)))),
                      Power($s("H"), Times(t, Plus(r, Times(s, x)))),
                      Hypergeometric2F1(Negate(p),
                          Times(Plus(Times(g, h, Log(GSymbol)), Times(s, t, Log($s("H")))),
                              Power(Times(d, e, Log(FSymbol)), CN1)),
                          Plus(Times(Plus(Times(g, h, Log(GSymbol)), Times(s, t, Log($s("H")))),
                              Power(Times(d, e, Log(FSymbol)), CN1)), C1),
                          Simplify(
                              Times(CN1, b, Power(FSymbol, Times(e, Plus(c, Times(d, x)))),
                                  Power(a, CN1)))),
                      Power(Plus(Times(g, h, Log(GSymbol)), Times(s, t, Log($s("H")))), CN1)),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, $s("H"), a, b, c, d, e, f, g, h, r, s, t), x),
                  ILtQ(p, C0)))),
      IIntegrate(2259,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT, Power(F_, Times(e_DEFAULT,
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))))),
                      p_),
                  Power(G_, Times(h_DEFAULT, Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)))),
                  Power($p("H"), Times(t_DEFAULT, Plus(r_DEFAULT, Times(s_DEFAULT, x_))))),
              x_Symbol),
          Condition(
              Simp(
                  Times(
                      Power(GSymbol, Times(h, Plus(f,
                          Times(g, x)))),
                      Power($s("H"), Times(t, Plus(r, Times(s, x)))),
                      Power(Plus(a, Times(b,
                          Power(FSymbol, Times(e, Plus(c, Times(d, x)))))), p),
                      Hypergeometric2F1(Negate(p),
                          Times(
                              Plus(Times(g, h, Log(GSymbol)), Times(s, t,
                                  Log($s("H")))),
                              Power(Times(d, e, Log(FSymbol)), CN1)),
                          Plus(
                              Times(
                                  Plus(Times(g, h, Log(GSymbol)), Times(s, t, Log($s("H")))), Power(
                                      Times(d, e, Log(FSymbol)), CN1)),
                              C1),
                          Simplify(
                              Times(
                                  CN1, b, Power(FSymbol, Times(e,
                                      Plus(c, Times(d, x)))),
                                  Power(a, CN1)))),
                      Power(
                          Times(
                              Plus(Times(g, h, Log(
                                  GSymbol)), Times(s, t,
                                      Log($s("H")))),
                              Power(Times(
                                  Plus(a, Times(b, Power(FSymbol, Times(e, Plus(c, Times(d, x)))))),
                                  Power(a, CN1)), p)),
                          CN1)),
                  x),
              And(FreeQ(List(FSymbol, GSymbol, $s("H"), a, b, c, d, e, f, g, h, r, s, t,
                  p), x), Not(
                      IntegerQ(p))))),
      IIntegrate(2260,
          Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, Power(F_, Times(e_DEFAULT, v_)))), p_),
              Power(G_, Times(h_DEFAULT, u_)), Power($p("H"), Times(t_DEFAULT, w_))), x_Symbol),
          Condition(
              Integrate(Times(Power(GSymbol, Times(h, ExpandToSum(u, x))),
                  Power($s("H"), Times(t, ExpandToSum(w, x))),
                  Power(Plus(a, Times(b, Power(FSymbol, Times(e, ExpandToSum(v, x))))), p)), x),
              And(FreeQ(List(FSymbol, GSymbol, $s("H"), a, b, e, h, t, p), x),
                  LinearQ(List(u, v, w), x), Not(LinearMatchQ(List(u, v, w), x))))));
}
