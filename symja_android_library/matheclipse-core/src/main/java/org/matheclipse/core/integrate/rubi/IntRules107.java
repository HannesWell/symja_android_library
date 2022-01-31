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
class IntRules107 {
  public static IAST RULES =
      List(
          IIntegrate(2141,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT,
                          x_)), CN1),
                      Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(
                              Times(Subtract(Times(C6, a, Power(d, C4), e),
                                  Times(c, f, Subtract(Times(b, Power(c, C3)),
                                      Times(ZZ(22L), a, Power(d, C3))))),
                                  Power(
                                      Times(c, d,
                                          Subtract(Times(b, Power(c, C3)), Times(ZZ(28L), a,
                                              Power(d, C3)))),
                                      CN1)),
                              Integrate(Power(Plus(a, Times(b, Power(x, C3))), CN1D2), x), x)),
                      Dist(
                          Times(
                              Subtract(Times(d, e), Times(c,
                                  f)),
                              Power(Times(c, d,
                                  Subtract(Times(b, Power(c, C3)),
                                      Times(ZZ(28L), a, Power(d, C3)))),
                                  CN1)),
                          Integrate(Times(
                              Plus(
                                  Times(c,
                                      Subtract(Times(b, Power(c, C3)),
                                          Times(ZZ(22L), a, Power(d, C3)))),
                                  Times(C6, a, Power(d, C4), x)),
                              Power(Times(Plus(c, Times(d, x)),
                                  Sqrt(Plus(a, Times(b, Power(x, C3))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(d, e), Times(c, f)), C0),
                      EqQ(Subtract(
                          Subtract(Times(Sqr(b), Power(c, C6)),
                              Times(ZZ(20L), a, b, Power(c, C3), Power(d, C3))),
                          Times(C8, Sqr(a), Power(d, C6))), C0),
                      NeQ(Subtract(
                          Times(C6, a, Power(d,
                              C4), e),
                          Times(
                              c, f, Subtract(Times(b, Power(c,
                                  C3)), Times(ZZ(22L), a,
                                      Power(d, C3))))),
                          C0)))),
          IIntegrate(2142,
              Integrate(Times(Power(Plus(c_, Times(d_DEFAULT, x_)), CN1),
                  Plus(e_, Times(f_DEFAULT, x_)), Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))),
                      CN1D2)),
                  x_Symbol),
              Condition(With(List(Set(q, Simplify(Times(Plus(C1, CSqrt3), f, Power(e, CN1))))),
                  Dist(
                      Times(C4, Power(C3, C1D4), Sqrt(Subtract(C2, CSqrt3)), f,
                          Plus(C1, Times(q,
                              x)),
                          Sqrt(
                              Times(
                                  Plus(C1, Times(CN1, q, x), Times(Sqr(q),
                                      Sqr(x))),
                                  Power(Plus(C1, CSqrt3, Times(q, x)), CN2))),
                          Power(Times(q, Sqrt(Plus(a, Times(b, Power(x, C3)))),
                              Sqrt(Times(Plus(C1, Times(q, x)),
                                  Power(Plus(C1, CSqrt3, Times(q, x)), CN2)))),
                              CN1)),
                      Subst(
                          Integrate(
                              Power(
                                  Times(
                                      Plus(Times(Subtract(C1, CSqrt3), d), Times(CN1, c, q),
                                          Times(Subtract(Times(Plus(C1, CSqrt3), d), Times(c, q)),
                                              x)),
                                      Sqrt(Subtract(C1, Sqr(x))),
                                      Sqrt(Plus(C7, Times(CN1, C4, CSqrt3), Sqr(x)))),
                                  CN1),
                              x),
                          x,
                          Times(Subtract(Plus(CN1, CSqrt3), Times(q, x)),
                              Power(Plus(C1, CSqrt3, Times(q, x)), CN1))),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(d, e), Times(c, f)), C0),
                      EqQ(Subtract(Times(b, Power(e, C3)),
                          Times(C2, Plus(C5, Times(C3, CSqrt3)), a, Power(f, C3))), C0),
                      NeQ(Subtract(Times(b, Power(c, C3)),
                          Times(C2, Subtract(C5, Times(C3, CSqrt3)), a, Power(d, C3))),
                          C0)))),
          IIntegrate(2143,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT,
                          x_)), CN1),
                      Plus(e_, Times(f_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Simplify(Times(Plus(CN1, CSqrt3), f, Power(e, CN1))))),
                      Dist(
                          Times(C4, Power(C3, C1D4), Sqrt(Plus(C2, CSqrt3)), f,
                              Subtract(C1, Times(q,
                                  x)),
                              Sqrt(Times(Plus(C1, Times(q, x), Times(Sqr(q), Sqr(x))),
                                  Power(Subtract(Subtract(C1, CSqrt3), Times(q, x)), CN2))),
                              Power(
                                  Times(q, Sqrt(Plus(a, Times(b, Power(x, C3)))),
                                      Sqrt(Times(CN1, Subtract(C1, Times(q, x)),
                                          Power(Subtract(Subtract(C1, CSqrt3), Times(q, x)),
                                              CN2)))),
                                  CN1)),
                          Subst(
                              Integrate(
                                  Power(Times(
                                      Plus(Times(Plus(C1, CSqrt3), d), Times(c, q),
                                          Times(Plus(Times(Subtract(C1, CSqrt3), d), Times(c, q)),
                                              x)),
                                      Sqrt(Subtract(C1, Sqr(x))),
                                      Sqrt(Plus(C7, Times(C4, CSqrt3), Sqr(x)))), CN1),
                                  x),
                              x,
                              Times(Subtract(Plus(C1, CSqrt3), Times(q, x)),
                                  Power(Plus(CN1, CSqrt3, Times(q, x)), CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(d, e),
                      Times(c, f)), C0), EqQ(
                          Subtract(
                              Times(b, Power(e,
                                  C3)),
                              Times(C2, Subtract(C5, Times(C3, CSqrt3)), a, Power(f, C3))),
                          C0),
                      NeQ(Subtract(Times(b, Power(c, C3)), Times(C2, Plus(C5, Times(C3, CSqrt3)), a,
                          Power(d, C3))), C0)))),
          IIntegrate(2144,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT,
                          x_)), CN1),
                      Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(b, Power(a, CN1)), C3))),
                      Plus(
                          Dist(
                              Times(
                                  Subtract(Times(Plus(C1,
                                      CSqrt3), f), Times(e,
                                          q)),
                                  Power(Subtract(Times(Plus(C1, CSqrt3), d), Times(c, q)), CN1)),
                              Integrate(Power(Plus(a, Times(b, Power(x, C3))), CN1D2), x), x),
                          Dist(
                              Times(Subtract(Times(d, e), Times(c, f)),
                                  Power(Subtract(Times(Plus(C1, CSqrt3), d), Times(c, q)), CN1)),
                              Integrate(
                                  Times(Plus(C1, CSqrt3, Times(q, x)),
                                      Power(Times(Plus(c, Times(d, x)),
                                          Sqrt(Plus(a, Times(b, Power(x, C3))))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(d, e), Times(c, f)), C0),
                      NeQ(Subtract(
                          Subtract(
                              Times(Sqr(b), Power(c, C6)), Times(ZZ(20L), a, b, Power(c, C3),
                                  Power(d, C3))),
                          Times(C8, Sqr(a), Power(d, C6))), C0),
                      NeQ(Subtract(
                          Subtract(Times(Sqr(b), Power(e, C6)),
                              Times(ZZ(20L), a, b, Power(e, C3), Power(f, C3))),
                          Times(C8, Sqr(a), Power(f, C6))), C0)))),
          IIntegrate(2145,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT, x_), Times(e_DEFAULT,
                          Sqr(x_))), CN1),
                      Plus(f_, Times(g_DEFAULT, x_), Times(h_DEFAULT, Sqr(x_))), Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D2)),
                  x_Symbol),
              Condition(Dist(Times(CN2, g, h), Subst(
                  Integrate(Power(
                      Subtract(Times(C2, e, h),
                          Times(Subtract(Times(b, d, f), Times(C2, a, e, h)), Sqr(x))),
                      CN1), x),
                  x,
                  Times(
                      Plus(C1, Times(C2, h, x, Power(g, CN1))), Power(
                          Plus(a, Times(b, Power(x, C3))), CN1D2))),
                  x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h), x),
                      NeQ(Subtract(Times(b, d, f), Times(C2, a, e, h)), C0),
                      EqQ(Subtract(Times(b, Power(g, C3)), Times(C8, a, Power(h, C3))), C0),
                      EqQ(Plus(Sqr(g),
                          Times(C2, f, h)), C0),
                      EqQ(Subtract(Plus(Times(b, d, f), Times(b, c,
                          g)), Times(C4, a, e,
                              h)),
                          C0)))),
          IIntegrate(2146,
              Integrate(Times(Power(Plus(c_, Times(e_DEFAULT, Sqr(x_))), CN1),
                  Plus(f_, Times(g_DEFAULT, x_), Times(h_DEFAULT, Sqr(x_))),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D2)), x_Symbol),
              Condition(
                  Negate(
                      Dist(Times(g, Power(e, CN1)),
                          Subst(Integrate(Power(Plus(C1, Times(a, Sqr(x))), CN1), x), x,
                              Times(Plus(C1, Times(C2, h, x, Power(g, CN1))),
                                  Power(Plus(a, Times(b, Power(x, C3))), CN1D2))),
                          x)),
                  And(FreeQ(List(a, b, c, e, f, g, h), x),
                      EqQ(Subtract(Times(b, Power(g, C3)), Times(C8, a, Power(h,
                          C3))), C0),
                      EqQ(Plus(Sqr(g), Times(C2, f, h)),
                          C0),
                      EqQ(Subtract(Times(b, c, g), Times(C4, a, e, h)), C0)))),
          IIntegrate(2147,
              Integrate(
                  Times(
                      Power(Plus(c_,
                          Times(d_DEFAULT, x_)), CN1),
                      Sqrt(Plus(a_, Times(b_DEFAULT, Power(x_, C3))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(b, Power(d, CN1)),
                          Integrate(Times(Sqr(x), Power(Plus(a, Times(b, Power(x, C3))), CN1D2)),
                              x),
                          x),
                      Dist(
                          Times(b, c, Power(d,
                              CN3)),
                          Integrate(
                              Times(
                                  Subtract(c, Times(d,
                                      x)),
                                  Power(Plus(a, Times(b, Power(x, C3))), CN1D2)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(Subtract(Times(b, Power(c, C3)), Times(a, Power(d, C3))),
                                  Power(d, CN3)),
                              Integrate(Power(Times(Plus(c, Times(d, x)),
                                  Sqrt(Plus(a, Times(b, Power(x, C3))))), CN1), x),
                              x))),
                  FreeQ(List(a, b, c, d), x))),
          IIntegrate(2148,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT,
                          x_)), CN1),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D3)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              CSqrt3,
                              ArcTan(Times(
                                  Subtract(C1, Times(Power(C2, C1D3), Rt(b, C3),
                                      Subtract(c, Times(d, x)),
                                      Power(Times(d, Power(Plus(a, Times(b, Power(x, C3))), C1D3)),
                                          CN1))),
                                  C1DSqrt3)),
                              Power(Times(Power(C2, QQ(4L, 3L)), Rt(b, C3), c), CN1)),
                          x),
                      Simp(
                          Times(
                              Log(Times(Sqr(Plus(c,
                                  Times(d, x))), Subtract(c,
                                      Times(d, x)))),
                              Power(Times(Power(C2, QQ(7L, 3L)), Rt(b, C3), c), CN1)),
                          x),
                      Negate(Simp(Times(C3,
                          Log(Plus(Times(Rt(b, C3), Subtract(c, Times(d, x))),
                              Times(Power(C2, QQ(2L, 3L)), d,
                                  Power(Plus(a, Times(b, Power(x, C3))), C1D3)))),
                          Power(Times(Power(C2, QQ(7L, 3L)), Rt(b, C3), c), CN1)), x))),
                  And(FreeQ(List(a, b, c,
                      d), x), EqQ(Plus(Times(b, Power(c, C3)), Times(a, Power(d, C3))),
                          C0)))),
          IIntegrate(2149,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT,
                          x_)), CN1),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D3)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Power(Times(C2, c), CN1),
                          Integrate(Power(Plus(a, Times(b, Power(x, C3))), CN1D3), x), x),
                      Dist(Power(Times(C2, c), CN1),
                          Integrate(Times(Subtract(c, Times(d, x)),
                              Power(Times(Plus(c, Times(d, x)),
                                  Power(Plus(a, Times(b, Power(x, C3))), C1D3)), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Subtract(Times(C2, b, Power(c, C3)),
                      Times(a, Power(d, C3))), C0)))),
          IIntegrate(2150,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT, x_)), CN1), Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D3)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Power(
                          Times(Plus(c, Times(d, x)),
                              Power(Plus(a, Times(b, Power(x, C3))), C1D3)),
                          CN1),
                      x),
                  FreeQ(List(a, b, c, d), x))),
          IIntegrate(2151,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT,
                          x_)), CN1),
                      Plus(e_, Times(f_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D3)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              CSqrt3, f,
                              ArcTan(Times(Plus(C1,
                                  Times(C2, Rt(b, C3), Plus(Times(C2, c), Times(d, x)),
                                      Power(Times(d, Power(Plus(a, Times(b, Power(x, C3))), C1D3)),
                                          CN1))),
                                  C1DSqrt3)),
                              Power(Times(Rt(b, C3), d), CN1)),
                          x),
                      Simp(Times(f, Log(Plus(c, Times(d, x))),
                          Power(Times(Rt(b, C3), d), CN1)), x),
                      Negate(
                          Simp(Times(C3, f,
                              Log(Subtract(Times(Rt(b, C3), Plus(Times(C2, c), Times(d, x))),
                                  Times(d, Power(Plus(a, Times(b, Power(x, C3))), C1D3)))),
                              Power(Times(C2, Rt(b, C3), d), CN1)), x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(d, e), Times(c,
                      f)), C0), EqQ(Subtract(Times(C2, b, Power(c, C3)), Times(a, Power(d, C3))),
                          C0)))),
          IIntegrate(2152,
              Integrate(
                  Times(
                      Power(Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_)), CN1),
                      Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C3))), CN1D3)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(f, Power(d, CN1)), Integrate(
                              Power(Plus(a, Times(b, Power(x, C3))), CN1D3), x),
                          x),
                      Dist(
                          Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)), Integrate(
                              Power(Times(Plus(c, Times(d, x)),
                                  Power(Plus(a, Times(b, Power(x, C3))), C1D3)), CN1),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f), x))),
          IIntegrate(2153,
              Integrate(
                  Times(
                      Power(Plus(c_, Times(d_DEFAULT,
                          Power(x_, n_DEFAULT))), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, $p("nn", true)))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Power(Plus(a,
                              Times(b, Power(x, $s("nn")))), p),
                          Power(
                              Subtract(
                                  Times(c,
                                      Power(Subtract(Sqr(c), Times(Sqr(d), Power(x, Times(C2, n)))),
                                          CN1)),
                                  Times(d, Power(x, n),
                                      Power(Subtract(Sqr(c), Times(Sqr(d), Power(x, Times(C2, n)))),
                                          CN1))),
                              Negate(q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, n, $s("nn"), p), x), Not(IntegerQ(
                      p)), ILtQ(q,
                          C0),
                      IGtQ(Log(C2, Times($s("nn"), Power(n, CN1))), C0)))),
          IIntegrate(2154,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(c_, Times(d_DEFAULT,
                          Power(x_, n_DEFAULT))), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, $p("nn", true)))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(e,
                          x), m), Power(Power(x, m),
                              CN1)),
                      Integrate(
                          ExpandIntegrand(
                              Times(Power(x, m), Power(Plus(a, Times(b, Power(x, $s("nn")))), p)),
                              Power(
                                  Subtract(
                                      Times(c,
                                          Power(Subtract(Sqr(c),
                                              Times(Sqr(d), Power(x, Times(C2, n)))), CN1)),
                                      Times(d, Power(x, n),
                                          Power(
                                              Subtract(Sqr(c),
                                                  Times(Sqr(d), Power(x, Times(C2, n)))),
                                              CN1))),
                                  Negate(q)),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, $s("nn"), p), x), Not(IntegerQ(p)),
                      ILtQ(q, C0), IGtQ(Log(C2, Times($s("nn"), Power(n, CN1))), C0)))),
          IIntegrate(2155,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              c_, Times(d_DEFAULT, Power(x_, n_)),
                              Times(e_DEFAULT, Sqrt(Plus(a_, Times(b_DEFAULT, Power(x_, n_)))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Dist(Power(n, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(x, Subtract(Times(Plus(m, C1), Power(n, CN1)),
                                      C1)),
                                  Power(
                                      Plus(c, Times(d, x), Times(e,
                                          Sqrt(Plus(a, Times(b, x))))),
                                      CN1)),
                              x),
                          x, Power(x, n)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n), x),
                      EqQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      IntegerQ(Times(Plus(m, C1), Power(n, CN1)))))),
          IIntegrate(2156,
              Integrate(
                  Times(u_DEFAULT,
                      Power(
                          Plus(
                              c_, Times(d_DEFAULT, Power(x_, n_)),
                              Times(e_DEFAULT, Sqrt(Plus(a_, Times(b_DEFAULT, Power(x_, n_)))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(c,
                          Integrate(
                              Times(u,
                                  Power(
                                      Plus(Sqr(c), Times(CN1, a, Sqr(e)),
                                          Times(c, d, Power(x, n))),
                                      CN1)),
                              x),
                          x),
                      Dist(Times(a, e), Integrate(Times(u,
                          Power(Times(Plus(Sqr(c), Times(CN1, a, Sqr(e)), Times(c, d, Power(x, n))),
                              Sqrt(Plus(a, Times(b, Power(x, n))))), CN1)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, n), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(
              2157, Integrate(Power(u_,
                  m_DEFAULT), x_Symbol),
              Condition(
                  With(
                      List(Set(c, Simplify(D(u, x)))), Dist(Power(c, CN1),
                          Subst(Integrate(Power(x, m), x), x, u), x)),
                  And(FreeQ(m, x), PiecewiseLinearQ(u, x)))),
          IIntegrate(
              2158, Integrate(Times(Power(u_, CN1),
                  v_), x_Symbol),
              Condition(
                  With(
                      List(Set(a, Simplify(
                          D(u, x))), Set(b,
                              Simplify(D(v, x)))),
                      Condition(
                          Subtract(Simp(Times(b, x, Power(a, CN1)), x),
                              Dist(
                                  Times(Subtract(Times(b, u), Times(a, v)), Power(a,
                                      CN1)),
                                  Integrate(Power(u, CN1), x), x)),
                          NeQ(Subtract(Times(b, u), Times(a, v)), C0))),
                  PiecewiseLinearQ(u, v, x))),
          IIntegrate(
              2159, Integrate(Times(Power(u_, CN1),
                  Power(v_, n_)), x_Symbol),
              Condition(
                  With(
                      List(Set(a, Simplify(
                          D(u, x))), Set(b,
                              Simplify(D(v, x)))),
                      Condition(Subtract(Simp(Times(Power(v, n), Power(Times(a, n), CN1)), x),
                          Dist(
                              Times(Subtract(Times(b, u), Times(a, v)), Power(a, CN1)), Integrate(
                                  Times(Power(v, Subtract(n, C1)), Power(u, CN1)), x),
                              x)),
                          NeQ(Subtract(Times(b, u), Times(a, v)), C0))),
                  And(PiecewiseLinearQ(u, v, x), GtQ(n, C0), NeQ(n, C1)))),
          IIntegrate(2160, Integrate(Times(Power(u_, CN1), Power(v_, CN1)), x_Symbol),
              Condition(With(List(Set(a, Simplify(D(u, x))), Set(b, Simplify(D(v, x)))),
                  Condition(
                      Subtract(
                          Dist(Times(b, Power(Subtract(Times(b, u), Times(a, v)), CN1)),
                              Integrate(Power(v, CN1), x), x),
                          Dist(Times(a, Power(Subtract(Times(b, u), Times(a, v)), CN1)),
                              Integrate(Power(u, CN1), x), x)),
                      NeQ(Subtract(Times(b, u), Times(a, v)), C0))),
                  PiecewiseLinearQ(u, v, x))));
}
