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
class IntRules121 {
  public static IAST RULES =
      List(
          IIntegrate(2421,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(v_, n_DEFAULT))),
                                  b_DEFAULT)),
                          p_DEFAULT),
                      Power(u_, q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(ExpandToSum(u,
                              x), q),
                          Power(Plus(a, Times(b, Log(Times(c, Power(ExpandToSum(v, x), n))))), p)),
                      x),
                  And(FreeQ(List(a, b, c, n, p,
                      q), x), BinomialQ(u, x), LinearQ(v,
                          x),
                      Not(And(BinomialMatchQ(u, x), LinearMatchQ(v, x)))))),
          IIntegrate(2422,
              Integrate(
                  Times(Log(Times(f_DEFAULT, Power(x_, m_DEFAULT))),
                      Plus(a_DEFAULT,
                          Times(
                              Log(Times(c_DEFAULT,
                                  Power(Plus(d_, Times(e_DEFAULT, x_)), n_DEFAULT))),
                              b_DEFAULT))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(x, Subtract(m, Log(Times(f, Power(x, m)))),
                                  Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n)))))),
                              x)),
                      Negate(
                          Dist(Times(b, e, n),
                              Integrate(
                                  Times(
                                      x, Log(Times(f,
                                          Power(x, m))),
                                      Power(Plus(d, Times(e, x)), CN1)),
                                  x),
                              x)),
                      Dist(
                          Times(b, e, m, n), Integrate(Times(x, Power(Plus(d, Times(e, x)), CN1)),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f, m, n), x))),
          IIntegrate(2423,
              Integrate(
                  Times(
                      Log(Times(f_DEFAULT,
                          Power(x_, m_DEFAULT))),
                      Power(Plus(a_DEFAULT,
                          Times(
                              Log(Times(c_DEFAULT,
                                  Power(Plus(d_, Times(e_DEFAULT, x_)), n_DEFAULT))),
                              b_DEFAULT)),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(u,
                          IntHide(Power(
                              Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))), p),
                              x))),
                      Subtract(
                          Dist(Log(Times(f,
                              Power(x, m))), u, x),
                          Dist(m, Integrate(Dist(Power(x, CN1), u, x), x), x))),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), IGtQ(p, C1)))),
          IIntegrate(2424,
              Integrate(
                  Times(Log(Times(f_DEFAULT, Power(x_, m_DEFAULT))),
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Log(Times(c_DEFAULT,
                                      Power(Plus(d_, Times(e_DEFAULT, x_)), n_DEFAULT))),
                                  b_DEFAULT)),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Log(Times(f, Power(x, m))),
                          Power(Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                              p)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(2425,
              Integrate(
                  Times(
                      Log(Times(f_DEFAULT,
                          Power(x_, m_DEFAULT))),
                      Plus(a_DEFAULT,
                          Times(
                              Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                                  n_DEFAULT))),
                              b_DEFAULT)),
                      Power(x_, CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Sqr(Log(Times(f, Power(x, m)))),
                          Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))), Power(
                              Times(C2, m), CN1)),
                          x),
                      Dist(
                          Times(b, e, n, Power(Times(C2, m),
                              CN1)),
                          Integrate(
                              Times(
                                  Sqr(Log(
                                      Times(f, Power(x, m)))),
                                  Power(Plus(d, Times(e, x)), CN1)),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f, m, n), x))),
          IIntegrate(2426,
              Integrate(
                  Times(Log(Times(f_DEFAULT, Power(x_, m_DEFAULT))),
                      Plus(a_DEFAULT,
                          Times(
                              Log(Times(c_DEFAULT,
                                  Power(Plus(d_, Times(e_DEFAULT, x_)), n_DEFAULT))),
                              b_DEFAULT)),
                      Power(Times(g_DEFAULT, x_), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(Negate(Simp(Times(
                      Subtract(Times(m, Power(Times(g, x), Plus(q, C1)), Power(Plus(q, C1), CN1)),
                          Times(Power(Times(g, x), Plus(q, C1)), Log(Times(f, Power(x, m))))),
                      Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                      Power(Times(g, Plus(q, C1)), CN1)), x)), Negate(
                          Dist(Times(b, e, n, Power(Times(g, Plus(q, C1)), CN1)),
                              Integrate(
                                  Times(Power(Times(g, x), Plus(q, C1)), Log(Times(f, Power(x, m))),
                                      Power(Plus(d, Times(e, x)), CN1)),
                                  x),
                              x)),
                      Dist(
                          Times(b, e, m, n, Power(Times(g, Sqr(Plus(q, C1))),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Times(g, x), Plus(q,
                                      C1)),
                                  Power(Plus(d, Times(e, x)), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, q), x), NeQ(q, CN1)))),
          IIntegrate(2427,
              Integrate(
                  Times(
                      Log(Times(f_DEFAULT,
                          Power(x_, m_DEFAULT))),
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                                      n_DEFAULT))),
                                  b_DEFAULT)),
                          p_DEFAULT),
                      Power(x_, CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Sqr(Log(
                                  Times(f, Power(x, m)))),
                              Power(
                                  Plus(a, Times(b,
                                      Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                                  p),
                              Power(Times(C2, m), CN1)),
                          x),
                      Dist(
                          Times(b, e, n, p, Power(Times(C2, m),
                              CN1)),
                          Integrate(
                              Times(Sqr(Log(Times(f, Power(x, m)))),
                                  Power(
                                      Plus(
                                          a,
                                          Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                                      Subtract(p, C1)),
                                  Power(Plus(d, Times(e, x)), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), IGtQ(p, C0)))),
          IIntegrate(2428,
              Integrate(
                  Times(
                      Log(Times(f_DEFAULT,
                          Power(x_, m_DEFAULT))),
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                                      n_DEFAULT))),
                                  b_DEFAULT)),
                          p_),
                      Power(Times(g_DEFAULT, x_), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(u,
                              IntHide(
                                  Times(Power(Times(g, x), q),
                                      Power(
                                          Plus(a,
                                              Times(b,
                                                  Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                                          p)),
                                  x))),
                      Subtract(
                          Dist(Log(Times(f, Power(x, m))), u, x), Dist(m,
                              Integrate(Dist(Power(x, CN1), u, x), x), x))),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, q), x), IGtQ(p, C1), IGtQ(q, C0)))),
          IIntegrate(2429,
              Integrate(
                  Times(
                      Log(Times(f_DEFAULT,
                          Power(x_, m_DEFAULT))),
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                                      n_DEFAULT))),
                                  b_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(g_DEFAULT, x_), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(g, x), q), Log(Times(f,
                              Power(x, m))),
                          Power(Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                              p)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, g, m, n, p, q), x))),
          IIntegrate(2430,
              Integrate(
                  Times(Power(Plus(a_DEFAULT,
                      Times(Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)), n_DEFAULT))),
                          b_DEFAULT)),
                      p_DEFAULT),
                      Plus(f_DEFAULT,
                          Times(
                              Log(Times(
                                  h_DEFAULT,
                                  Power(Plus(i_DEFAULT, Times(j_DEFAULT, x_)), m_DEFAULT))),
                              g_DEFAULT))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x,
                              Power(
                                  Plus(a, Times(b,
                                      Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                                  p),
                              Plus(f, Times(g, Log(Times(h, Power(Plus(i, Times(j, x)), m)))))),
                          x),
                      Negate(
                          Dist(Times(g, j, m),
                              Integrate(
                                  Times(x,
                                      Power(
                                          Plus(a,
                                              Times(b, Log(Times(c,
                                                  Power(Plus(d, Times(e, x)), n))))),
                                          p),
                                      Power(Plus(i, Times(j, x)), CN1)),
                                  x),
                              x)),
                      Negate(
                          Dist(Times(b, e, n, p),
                              Integrate(
                                  Times(x,
                                      Power(
                                          Plus(a,
                                              Times(b,
                                                  Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                                          Subtract(p, C1)),
                                      Plus(f,
                                          Times(g, Log(Times(h, Power(Plus(i, Times(j, x)), m))))),
                                      Power(Plus(d, Times(e, x)), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, i, j, m, n), x), IGtQ(p, C0)))),
          IIntegrate(2431,
              Integrate(
                  Times(
                      Log(Times(f_DEFAULT,
                          Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), m_DEFAULT))),
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Log(Times(c_DEFAULT,
                                      Power(Plus(d_, Times(e_DEFAULT, x_)), n_DEFAULT))),
                                  b_DEFAULT)),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(e, CN1),
                      Subst(
                          Integrate(
                              Times(Log(Times(f, Power(Times(g, x, Power(d, CN1)), m))), Power(
                                  Plus(a, Times(b, Log(Times(c, Power(x, n))))), p)),
                              x),
                          x, Plus(d, Times(e, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n, p), x),
                      EqQ(Subtract(Times(e, f), Times(d, g)), C0)))),
          IIntegrate(2432,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                                  n_DEFAULT))), b_DEFAULT)),
                          p_DEFAULT),
                      Power(
                          Plus(f_DEFAULT,
                              Times(
                                  Log(Times(h_DEFAULT,
                                      Power(Plus(i_DEFAULT, Times(j_DEFAULT, x_)), m_DEFAULT))),
                                  g_DEFAULT)),
                          q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(a,
                              Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))), p),
                          Power(Plus(f, Times(g, Log(Times(h, Power(Plus(i, Times(j, x)), m))))),
                              q)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, g, h, i, j, m, n, p), x))),
          IIntegrate(2433,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                                      n_DEFAULT))),
                                  b_DEFAULT)),
                          p_DEFAULT),
                      Plus(f_DEFAULT, Times(
                          Log(Times(h_DEFAULT,
                              Power(Plus(i_DEFAULT, Times(j_DEFAULT, x_)), m_DEFAULT))),
                          g_DEFAULT)),
                      Power(Plus(k_DEFAULT, Times(l_DEFAULT, x_)), r_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(e, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Times(k, x, Power(d,
                                      CN1)), r),
                                  Power(Plus(a,
                                      Times(b, Log(Times(c, Power(x, n))))), p),
                                  Plus(f,
                                      Times(g,
                                          Log(Times(h,
                                              Power(Plus(Times(Subtract(Times(e, i), Times(d, j)),
                                                  Power(e, CN1)), Times(j, x, Power(e, CN1))),
                                                  m)))))),
                              x),
                          x, Plus(d, Times(e, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, i, j, k, l, n, p, r), x),
                      EqQ(Subtract(Times(e, k), Times(d, l)), C0)))),
          IIntegrate(2434, Integrate(Times(
              Plus(a_DEFAULT,
                  Times(Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                      n_DEFAULT))), b_DEFAULT)),
              Plus(f_DEFAULT,
                  Times(
                      Log(Times(h_DEFAULT,
                          Power(Plus(i_DEFAULT, Times(j_DEFAULT, x_)), m_DEFAULT))),
                      g_DEFAULT)),
              Power(x_, CN1)), x_Symbol),
              Condition(
                  Plus(Simp(
                      Times(Log(x), Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e,
                          x)), n))))), Plus(f,
                              Times(g, Log(Times(h, Power(Plus(i, Times(j, x)), m)))))),
                      x),
                      Negate(Dist(Times(e, g, m),
                          Integrate(Times(Log(x),
                              Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                              Power(Plus(d, Times(e, x)), CN1)), x),
                          x)),
                      Negate(Dist(Times(b, j, n), Integrate(Times(Log(x),
                          Plus(f, Times(g, Log(Times(h, Power(Plus(i, Times(j, x)), m))))),
                          Power(Plus(i, Times(j, x)), CN1)), x), x))),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, i, j, m,
                      n), x), EqQ(Subtract(Times(e, i), Times(d, j)),
                          C0)))),
          IIntegrate(2435,
              Integrate(Times(Log(Plus(a_, Times(b_DEFAULT, x_))),
                  Log(Plus(c_, Times(d_DEFAULT, x_))), Power(x_, CN1)), x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Log(Times(CN1, b, x, Power(a, CN1))), Log(Plus(a, Times(b, x))),
                              Log(Plus(c, Times(d, x)))),
                          x),
                      Simp(
                          Times(C1D2, C1,
                              Plus(Log(Times(CN1, b, x, Power(a, CN1))),
                                  Negate(
                                      Log(Times(CN1, Subtract(Times(b, c), Times(a, d)), x,
                                          Power(Times(a, Plus(c, Times(d, x))), CN1)))),
                                  Log(Times(Subtract(Times(b, c), Times(a, d)),
                                      Power(Times(b, Plus(c, Times(d, x))), CN1)))),
                              Sqr(Log(
                                  Times(a, Plus(c, Times(d, x)),
                                      Power(Times(c, Plus(a, Times(b, x))), CN1))))),
                          x),
                      Negate(
                          Simp(
                              Times(C1D2, C1,
                                  Subtract(
                                      Log(Times(CN1, b, x, Power(a, CN1))), Log(
                                          Times(CN1, d, x, Power(c, CN1)))),
                                  Sqr(Plus(
                                      Log(Plus(a,
                                          Times(b, x))),
                                      Log(Times(a, Plus(c, Times(d, x)),
                                          Power(Times(c, Plus(a, Times(b, x))), CN1)))))),
                              x)),
                      Simp(
                          Times(
                              Subtract(
                                  Log(Plus(c, Times(d, x))), Log(
                                      Times(
                                          a, Plus(c, Times(d, x)), Power(
                                              Times(c, Plus(a, Times(b, x))), CN1)))),
                              PolyLog(C2, Plus(C1, Times(b, x, Power(a, CN1))))),
                          x),
                      Simp(
                          Times(
                              Plus(Log(Plus(a, Times(b, x))),
                                  Log(Times(a, Plus(c, Times(d, x)),
                                      Power(Times(c, Plus(a, Times(b, x))), CN1)))),
                              PolyLog(C2, Plus(C1, Times(d, x, Power(c, CN1))))),
                          x),
                      Simp(
                          Times(
                              Log(Times(
                                  a, Plus(c, Times(d,
                                      x)),
                                  Power(Times(c, Plus(a, Times(b, x))), CN1))),
                              PolyLog(C2,
                                  Times(
                                      c, Plus(a, Times(b,
                                          x)),
                                      Power(Times(a, Plus(c, Times(d, x))), CN1)))),
                          x),
                      Negate(
                          Simp(Times(
                              Log(Times(a, Plus(c, Times(d, x)),
                                  Power(Times(c, Plus(a, Times(b, x))), CN1))),
                              PolyLog(C2,
                                  Times(d, Plus(a, Times(b, x)),
                                      Power(Times(b, Plus(c, Times(d, x))), CN1)))),
                              x)),
                      Negate(Simp(PolyLog(C3, Plus(C1, Times(b, x, Power(a, CN1)))), x)),
                      Negate(Simp(PolyLog(C3, Plus(C1, Times(d, x, Power(c, CN1)))), x)),
                      Simp(PolyLog(C3,
                          Times(c, Plus(a, Times(b, x)),
                              Power(Times(a, Plus(c, Times(d, x))), CN1))),
                          x),
                      Negate(
                          Simp(
                              PolyLog(C3,
                                  Times(d, Plus(a, Times(b, x)),
                                      Power(Times(b, Plus(c, Times(d, x))), CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(
              2436, Integrate(Times(Log(v_), Log(w_),
                  Power(x_, CN1)), x_Symbol),
              Condition(
                  Integrate(Times(Log(ExpandToSum(v, x)), Log(ExpandToSum(w, x)),
                      Power(x, CN1)), x),
                  And(LinearQ(List(v, w), x), Not(LinearMatchQ(List(v, w), x))))),
          IIntegrate(2437,
              Integrate(
                  Times(
                      Log(Times(c_DEFAULT,
                          Power(Plus(d_, Times(e_DEFAULT, x_)), n_DEFAULT))),
                      Log(Times(h_DEFAULT,
                          Power(Plus(i_DEFAULT, Times(j_DEFAULT, x_)), m_DEFAULT))),
                      Power(x_, CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(m,
                          Integrate(
                              Times(
                                  Log(Plus(i, Times(j,
                                      x))),
                                  Log(Times(c, Power(Plus(d, Times(e, x)), n))), Power(x, CN1)),
                              x),
                          x),
                      Dist(
                          Subtract(Times(m, Log(Plus(i, Times(j, x)))), Log(
                              Times(h, Power(Plus(i, Times(j, x)), m)))),
                          Integrate(
                              Times(Log(Times(c,
                                  Power(Plus(d, Times(e, x)), n))), Power(x,
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(c, d, e, h, i, j, m, n), x),
                      NeQ(Subtract(Times(e, i),
                          Times(d, j)), C0),
                      NeQ(Plus(i, Times(j, x)), Times(h, Power(Plus(i, Times(j, x)), m)))))),
          IIntegrate(2438,
              Integrate(
                  Times(
                      Plus(a_DEFAULT,
                          Times(
                              Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                                  n_DEFAULT))),
                              b_DEFAULT)),
                      Plus(
                          Times(
                              Log(Times(h_DEFAULT,
                                  Power(Plus(i_DEFAULT, Times(j_DEFAULT, x_)), m_DEFAULT))),
                              g_DEFAULT),
                          f_),
                      Power(x_, CN1)),
                  x_Symbol),
              Condition(
                  Plus(Dist(f,
                      Integrate(
                          Times(Plus(a, Times(b, Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                              Power(x, CN1)),
                          x),
                      x),
                      Dist(g,
                          Integrate(
                              Times(Log(Times(h, Power(Plus(i, Times(j, x)), m))),
                                  Plus(a, Times(b,
                                      Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                                  Power(x, CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, i, j, m, n), x),
                      NeQ(Subtract(Times(e, i), Times(d, j)), C0)))),
          IIntegrate(2439,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Log(Times(c_DEFAULT,
                                      Power(Plus(d_, Times(e_DEFAULT, x_)), n_DEFAULT))),
                                  b_DEFAULT)),
                          p_DEFAULT),
                      Plus(f_DEFAULT,
                          Times(
                              Log(Times(
                                  h_DEFAULT, Power(Plus(i_DEFAULT, Times(j_DEFAULT, x_)),
                                      m_DEFAULT))),
                              g_DEFAULT)),
                      Power(x_, r_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(x, Plus(r,
                                  C1)),
                              Power(
                                  Plus(a, Times(b,
                                      Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                                  p),
                              Plus(f, Times(g,
                                  Log(Times(h, Power(Plus(i, Times(j, x)), m))))),
                              Power(Plus(r, C1), CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(g, j, m, Power(Plus(r, C1),
                                  CN1)),
                              Integrate(
                                  Times(Power(x, Plus(r, C1)),
                                      Power(
                                          Plus(a,
                                              Times(b, Log(Times(c,
                                                  Power(Plus(d, Times(e, x)), n))))),
                                          p),
                                      Power(Plus(i, Times(j, x)), CN1)),
                                  x),
                              x)),
                      Negate(
                          Dist(Times(b, e, n, p, Power(Plus(r, C1), CN1)),
                              Integrate(
                                  Times(Power(x, Plus(r, C1)),
                                      Power(
                                          Plus(a,
                                              Times(b,
                                                  Log(Times(c, Power(Plus(d, Times(e, x)), n))))),
                                          Subtract(p, C1)),
                                      Plus(f, Times(g,
                                          Log(Times(h, Power(Plus(i, Times(j, x)), m))))),
                                      Power(Plus(d, Times(e, x)), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, i, j, m,
                      n), x), IGtQ(p,
                          C0),
                      IntegerQ(r), Or(EqQ(p, C1), GtQ(r, C0)), NeQ(r, CN1)))),
          IIntegrate(2440,
              Integrate(
                  Times(
                      Plus(a_DEFAULT,
                          Times(
                              Log(Times(c_DEFAULT, Power(Plus(d_, Times(e_DEFAULT, x_)),
                                  n_DEFAULT))),
                              b_DEFAULT)),
                      Plus(f_DEFAULT,
                          Times(
                              Log(Times(
                                  h_DEFAULT, Power(Plus(i_DEFAULT, Times(j_DEFAULT, x_)),
                                      m_DEFAULT))),
                              g_DEFAULT)),
                      Power(Plus(k_, Times(l_DEFAULT, x_)), r_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(l, CN1), Subst(
                      Integrate(
                          Times(Power(x, r),
                              Plus(a,
                                  Times(b,
                                      Log(Times(c,
                                          Power(
                                              Plus(Times(CN1, Subtract(Times(e, k), Times(d, l)),
                                                  Power(l, CN1)), Times(e, x, Power(l, CN1))),
                                              n))))),
                              Plus(f,
                                  Times(g, Log(Times(h,
                                      Power(Plus(Times(CN1, Subtract(Times(j, k), Times(i, l)),
                                          Power(l, CN1)), Times(j, x, Power(l, CN1))), m)))))),
                          x),
                      x, Plus(k, Times(l, x))), x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, i, j, k, l, m, n), x), IntegerQ(r)))));
}
