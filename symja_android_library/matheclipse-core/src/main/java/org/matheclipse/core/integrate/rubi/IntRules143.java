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
class IntRules143 {
  public static IAST RULES =
      List(
          IIntegrate(2861,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(c_DEFAULT,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Times(g, Cos(Plus(e,
                                      Times(f, x)))), Plus(p, C1)),
                                  Power(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x))))), m),
                                  Plus(d,
                                      Times(c, Sin(Plus(e, Times(f, x))))),
                                  Power(Times(f, g, Plus(p, C1)), CN1)),
                              x)),
                      Dist(Power(Times(Sqr(g), Plus(p, C1)), CN1),
                          Integrate(Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C2)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m, C1)),
                              Simp(Plus(Times(a, c, Plus(p, C2)), Times(b, d, m),
                                  Times(b, c, Plus(m, p, C2), Sin(Plus(e, Times(f, x))))), x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      GtQ(m, C0), LtQ(p, CN1), IntegerQ(Times(C2,
                          m)),
                      Not(And(EqQ(m, C1), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                          SimplerQ(Plus(c, Times(d, x)), Plus(a, Times(b, x)))))))),
          IIntegrate(2862,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(d, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C1)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                  m),
                              Power(Times(f, g, Plus(m, p, C1)), CN1)), x)),
                      Dist(Power(Plus(m, p, C1), CN1),
                          Integrate(Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m, C1)),
                              Simp(Plus(Times(a, c, Plus(m, p, C1)), Times(b, d, m),
                                  Times(Plus(Times(a, d, m), Times(b, c, Plus(m, p, C1))),
                                      Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, p), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      GtQ(m, C0), Not(LtQ(p, CN1)), IntegerQ(Times(C2, m)), Not(And(EqQ(m, C1),
                          NeQ(Subtract(Sqr(c), Sqr(d)), C0), SimplerQ(Plus(c, Times(d, x)),
                              Plus(a, Times(b, x)))))))),
          IIntegrate(2863,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(g, Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C1)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                  C1)),
                              Plus(Times(b, c, Plus(m, p, C1)), Times(CN1, a, d, p),
                                  Times(b, d, Plus(m, C1), Sin(Plus(e, Times(f, x))))),
                              Power(Times(Sqr(b), f, Plus(m, C1), Plus(m, p, C1)), CN1)),
                          x),
                      Dist(
                          Times(Sqr(g), Subtract(p, C1),
                              Power(Times(Sqr(b), Plus(m, C1), Plus(m, p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Simp(Plus(Times(b, d, Plus(m, C1)),
                                      Times(Subtract(Times(b, c, Plus(m, p, C1)), Times(a, d, p)),
                                          Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(m,
                      CN1), GtQ(p, C1), NeQ(Plus(m, p, C1), C0),
                      IntegerQ(Times(C2, m))))),
          IIntegrate(2864,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          c_DEFAULT,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Subtract(Times(b, c), Times(a, d)),
                                  Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p,
                                      C1)),
                                  Power(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x))))), Plus(m,
                                          C1)),
                                  Power(Times(f, g, Subtract(Sqr(a), Sqr(b)), Plus(m, C1)), CN1)),
                              x)),
                      Dist(Power(Times(Subtract(Sqr(a), Sqr(b)), Plus(m, C1)), CN1),
                          Integrate(Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Simp(Subtract(Times(Subtract(Times(a, c), Times(b, d)), Plus(m, C1)),
                                  Times(Subtract(Times(b, c), Times(a, d)), Plus(m, p, C2),
                                      Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, p), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      LtQ(m, CN1), IntegerQ(Times(C2, m))))),
          IIntegrate(2865,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(c_DEFAULT,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(g, Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C1)),
                          Power(Plus(a, Times(b, Sin(Plus(e,
                              Times(f, x))))), Plus(m, C1)),
                          Plus(Times(b, c, Plus(m, p, C1)), Times(CN1, a, d, p), Times(b, d,
                              Plus(m, p), Sin(Plus(e, Times(f, x))))),
                          Power(Times(Sqr(b), f, Plus(m, p), Plus(m, p, C1)), CN1)), x),
                      Dist(
                          Times(
                              Sqr(g), Subtract(p, C1), Power(
                                  Times(Sqr(b), Plus(m, p), Plus(m, p, C1)), CN1)),
                          Integrate(Times(
                              Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C2)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Simp(Plus(Times(b, Plus(Times(a, d, m), Times(b, c, Plus(m, p, C1)))),
                                  Times(
                                      Subtract(Times(a, b, c, Plus(m, p, C1)),
                                          Times(d,
                                              Subtract(Times(Sqr(a), p),
                                                  Times(Sqr(b), Plus(m, p))))),
                                      Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      GtQ(p, C1), NeQ(Plus(m, p), C0), NeQ(Plus(m, p, C1), C0),
                      IntegerQ(Times(C2, m))))),
          IIntegrate(2866,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(c_DEFAULT,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C1)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                  C1)),
                              Subtract(Subtract(Times(b, c), Times(a, d)),
                                  Times(
                                      Subtract(Times(a, c),
                                          Times(b, d)),
                                      Sin(Plus(e, Times(f, x))))),
                              Power(Times(f, g, Subtract(Sqr(a), Sqr(b)), Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(Sqr(g), Subtract(Sqr(a), Sqr(
                              b)), Plus(p,
                                  C1)),
                              CN1),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Simp(
                                      Plus(
                                          Times(c,
                                              Subtract(Times(Sqr(a), Plus(p, C2)),
                                                  Times(Sqr(b), Plus(m, p, C2)))),
                                          Times(a, b, d, m),
                                          Times(b, Subtract(Times(a, c), Times(b, d)),
                                              Plus(m, p, C3), Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      LtQ(p, CN1), IntegerQ(Times(C2, m))))),
          IIntegrate(2867,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(d, Power(b,
                              CN1)),
                          Integrate(Power(Times(g, Cos(Plus(e, Times(f, x)))), p), x), x),
                      Dist(Times(Subtract(Times(b, c), Times(a, d)), Power(b, CN1)),
                          Integrate(Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2868,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(c_, Times(d_DEFAULT, $($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          c, g, Power(Times(g, Cos(
                              Plus(e, Times(f, x)))), Subtract(p,
                                  C1)),
                          Power(Times(f,
                              Power(Plus(C1, Sin(Plus(e, Times(f, x)))),
                                  Times(C1D2, Subtract(p, C1))),
                              Power(Subtract(C1, Sin(Plus(e, Times(f, x)))),
                                  Times(C1D2, Subtract(p, C1)))),
                              CN1)),
                      Subst(
                          Integrate(Times(
                              Power(Plus(C1, Times(d, x, Power(c, CN1))), Times(C1D2, Plus(p, C1))),
                              Power(Subtract(C1, Times(d, x, Power(c, CN1))), Times(C1D2,
                                  Subtract(p, C1))),
                              Power(Plus(a, Times(b, x)), m)), x),
                          x, Sin(Plus(e, Times(f, x)))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, p), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), EqQ(Subtract(Sqr(c), Sqr(d)),
                          C0)))),
          IIntegrate(2869,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_),
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(a, Times(C2,
                          m)),
                      Integrate(
                          Times(
                              Power(Times(d,
                                  Sin(Plus(e, Times(f, x)))), n),
                              Power(Power(Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, n), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegersQ(m, p), EqQ(Plus(Times(C2, m), p), C0)))),
          IIntegrate(2870,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Sqr($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Times(g, Cos(
                                      Plus(e, Times(f, x)))), Plus(p,
                                          C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(C2, b, f, g, Plus(m, C1)), CN1)),
                              x)),
                      Dist(Times(a, Power(Times(C2, Sqr(g)), CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), EqQ(Subtract(m, p),
                          C0)))),
          IIntegrate(2871,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)))),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C1)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                  m),
                              Power(Times(a, f, g, m), CN1)),
                          x),
                      Dist(Power(g, CN2),
                          Integrate(
                              Times(
                                  Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p,
                                      C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      EqQ(Plus(m, p, C1), C0)))),
          IIntegrate(2872,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_),
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_),
                      Power(Plus(a_, Times(b_DEFAULT,
                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))), m_)),
                  x_Symbol),
              Condition(
                  Dist(Power(Power(a, p), CN1),
                      Integrate(
                          ExpandTrig(Times(Power(Times(d, $($s("§sin"), Plus(e, Times(f, x)))), n),
                              Power(Subtract(a, Times(b, $($s("§sin"), Plus(e, Times(f, x))))),
                                  Times(C1D2, p)),
                              Power(Plus(a, Times(b, $($s("§sin"), Plus(e, Times(f, x))))),
                                  Plus(m, Times(C1D2, p)))),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegersQ(m, n, Times(C1D2,
                          p)),
                      Or(And(GtQ(m, C0), GtQ(p, C0), LtQ(Subtract(Negate(m), p), n, CN1)), And(
                          GtQ(m, C2), LtQ(p, C0), GtQ(Plus(m, Times(C1D2, p)), C0)))))),
          IIntegrate(2873,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Power(Times(g,
                              $($s("§cos"), Plus(e, Times(f, x)))), p),
                          Times(
                              Power(Times(d, $($s("§sin"), Plus(e, Times(f, x)))), n), Power(Plus(a,
                                  Times(b, $($s("§sin"), Plus(e, Times(f, x))))), m)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, g, n, p), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), IGtQ(m,
                          C0)))),
          IIntegrate(2874,
              Integrate(
                  Times(
                      Sqr($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(Power(b, CN2),
                      Integrate(
                          Times(Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                              Power(Plus(a, Times(b,
                                  Sin(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                              Subtract(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, m, n), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), Or(ILtQ(m, C0),
                          Not(IGtQ(n, C0)))))),
          IIntegrate(2875,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(Times(d_DEFAULT,
                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(a, Power(g,
                          CN1)), Times(C2,
                              m)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(Times(C2, m), p)),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                              Power(Power(Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, g, n, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      ILtQ(m, C0)))),
          IIntegrate(2876,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(a, Power(g, CN1)), Times(C2,
                          m)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(Times(C2, m), p)),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                              Power(Power(Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, g, n), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegerQ(m), RationalQ(p), Or(
                          EqQ(Plus(Times(C2, m), p), C0), And(GtQ(Plus(Times(C2, m), p), C0),
                              LtQ(p, CN1)))))),
          IIntegrate(2877,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(Times(b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C1)),
                      Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                          m),
                      Power(Times(a, f, g, Plus(Times(C2, m), p, C1)), CN1)), x), Dist(
                          Power(Times(Sqr(a), Plus(Times(C2, m), p, C1)), CN1),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Subtract(Times(a, m),
                                      Times(b, Plus(Times(C2, m), p, C1),
                                          Sin(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g, p), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LeQ(m,
                          Negate(C1D2)),
                      NeQ(Plus(Times(C2, m), p, C1), C0)))),
          IIntegrate(2878,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Sqr($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Times(g, Cos(
                                      Plus(e, Times(f, x)))), Plus(p,
                                          C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(b, f, g, Plus(m, p, C2)), CN1)),
                              x)),
                      Dist(Power(Times(b, Plus(m, p, C2)), CN1),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Subtract(Times(b, Plus(m, C1)), Times(a, Plus(p, C1),
                                      Sin(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), NeQ(Plus(m, p, C2),
                          C0)))),
          IIntegrate(2879,
              Integrate(
                  Times(Sqr($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Power(Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(Power(b, CN2),
                      Integrate(
                          Times(Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                              Power(Plus(a, Times(b,
                                  Sin(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                              Subtract(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, m, n), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), IntegersQ(Times(C2, m),
                          Times(C2, n))))),
          IIntegrate(2880,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), C4),
                      Power(Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)))), n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(CN2, Power(Times(a, b, d),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Times(d, Sin(Plus(e, Times(f, x)))), Plus(n,
                                      C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C2))),
                              x),
                          x),
                      Dist(Power(a, CN2),
                          Integrate(Times(Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C2)),
                              Plus(C1, Sqr(Sin(Plus(e, Times(f, x)))))), x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, n), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      LtQ(m, CN1)))));
}
