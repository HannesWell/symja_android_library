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
class IntRules41 {
  public static IAST RULES =
      List(
          IIntegrate(821,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(c, Sqr(
                                  x))), Plus(p, C1)),
                              Subtract(Times(a, g), Times(c, f,
                                  x)),
                              Power(Times(C2, a, c, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(C2, a, c,
                              Plus(p, C1)), CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(a, Times(c,
                                      Sqr(x))), Plus(p,
                                          C1)),
                                  Simp(Subtract(
                                      Subtract(Times(a, e, g, m),
                                          Times(c, d, f, Plus(Times(C2, p), C3))),
                                      Times(c, e, f, Plus(m, Times(C2, p), C3), x)), x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g),
                      x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), LtQ(p, CN1),
                      GtQ(m, C0), Or(IntegerQ(m), IntegerQ(p),
                          IntegersQ(Times(C2, m), Times(C2, p)))))),
          IIntegrate(822,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Plus(
                              Times(f,
                                  Plus(Times(b, c, d), Times(CN1, Sqr(b), e), Times(C2, a, c, e))),
                              Times(CN1, a, g, Subtract(Times(C2, c, d), Times(b, e))),
                              Times(c,
                                  Subtract(Times(f, Subtract(Times(C2, c, d), Times(b, e))), Times(
                                      g, Subtract(Times(b, d), Times(C2, a, e)))),
                                  x)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                          Power(
                              Times(Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c)),
                                  Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))),
                              CN1)),
                          x),
                      Dist(
                          Power(
                              Times(
                                  Plus(p, C1), Subtract(Sqr(b), Times(C4, a,
                                      c)),
                                  Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))),
                              CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), m),
                                  Power(Plus(a, Times(b, x), Times(c,
                                      Sqr(x))), Plus(p,
                                          C1)),
                                  Simp(Plus(
                                      Times(f, Subtract(
                                          Subtract(
                                              Plus(
                                                  Times(b, c, d, e,
                                                      Plus(Times(C2, p), Negate(m), C2)),
                                                  Times(Sqr(b), Sqr(e), Plus(p, m, C2))),
                                              Times(C2, Sqr(c), Sqr(d), Plus(Times(C2, p), C3))),
                                          Times(C2, a, c, Sqr(e), Plus(m, Times(C2, p), C3)))),
                                      Times(CN1, g,
                                          Subtract(
                                              Times(a, e,
                                                  Plus(Times(b, e), Times(CN1, C2, c, d, m),
                                                      Times(b, e, m))),
                                              Times(b, d,
                                                  Subtract(Plus(Times(C3, c, d), Times(CN1, b, e),
                                                      Times(C2, c, d, p)), Times(b, e, p))))),
                                      Times(c, e,
                                          Subtract(Times(g, Subtract(Times(b, d), Times(C2, a, e))),
                                              Times(f, Subtract(Times(C2, c, d), Times(b, e)))),
                                          Plus(m, Times(C2, p), C4), x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      NeQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      LtQ(p, CN1), Or(IntegerQ(m), IntegerQ(p), IntegersQ(Times(C2, m), Times(C2,
                          p)))))),
          IIntegrate(823,
              Integrate(Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                  Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)), x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Plus(d,
                                      Times(e, x)), Plus(m, C1)),
                                  Plus(Times(f, a, c, e), Times(CN1, a, g, c, d),
                                      Times(c, Plus(Times(c, d, f), Times(a, e, g)), x)),
                                  Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                                  Power(
                                      Times(C2, a, c, Plus(p, C1),
                                          Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                                      CN1)),
                              x)),
                      Dist(
                          Power(
                              Times(C2, a, c, Plus(p, C1),
                                  Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                              CN1),
                          Integrate(Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Simp(Plus(
                                  Times(f,
                                      Plus(Times(Sqr(c), Sqr(d), Plus(Times(C2, p), C3)),
                                          Times(a, c, Sqr(e), Plus(m, Times(C2, p), C3)))),
                                  Times(CN1, a, c, d, e, g, m),
                                  Times(c, e, Plus(Times(c, d, f), Times(a, e, g)),
                                      Plus(m, Times(C2, p), C4), x)),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), LtQ(p, CN1), Or(IntegerQ(
                          m), IntegerQ(p), IntegersQ(Times(C2, m), Times(C2, p)))))),
          IIntegrate(824,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(g, Power(Plus(d, Times(e, x)), m), Power(Times(c, m), CN1)), x),
                      Dist(Power(c, CN1), Integrate(
                          Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Simp(Plus(Times(c, d, f), Times(CN1, a, e, g),
                                  Times(Plus(Times(g, c, d), Times(CN1, b, e, g), Times(c, e, f)),
                                      x)),
                                  x),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0),
                      FractionQ(m), GtQ(m, C0)))),
          IIntegrate(825,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(g, Power(Plus(d, Times(e, x)), m),
                          Power(Times(c, m), CN1)), x),
                      Dist(Power(c, CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Simp(
                                      Plus(Times(c, d, f), Times(CN1, a, e, g),
                                          Times(Plus(Times(g, c, d), Times(c, e, f)), x)),
                                      x),
                                  Power(Plus(a, Times(c, Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), FractionQ(m), GtQ(m,
                          C0)))),
          IIntegrate(826,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          x_)), CN1D2),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          CN1)),
                  x_Symbol),
              Condition(Dist(C2, Subst(Integrate(Times(
                  Plus(Times(e, f), Times(CN1, d, g), Times(g, Sqr(x))),
                  Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)),
                      Times(CN1, Subtract(Times(C2, c, d), Times(b, e)), Sqr(x)), Times(c,
                          Power(x, C4))),
                      CN1)),
                  x), x, Sqrt(Plus(d, Times(e, x)))), x), And(
                      FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0)))),
          IIntegrate(827,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), CN1D2),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Dist(C2,
                      Subst(
                          Integrate(
                              Times(Plus(Times(e, f), Times(CN1, d, g), Times(g, Sqr(x))),
                                  Power(
                                      Plus(Times(c, Sqr(d)), Times(a, Sqr(e)), Times(CN1, C2, c, d,
                                          Sqr(x)), Times(c, Power(x, C4))),
                                      CN1)),
                              x),
                          x, Sqrt(Plus(d, Times(e, x)))),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
          IIntegrate(828,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Subtract(Times(e, f), Times(d, g)),
                          Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(
                              Times(Plus(m, C1),
                                  Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))),
                              CN1)),
                          x),
                      Dist(
                          Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                              Times(a, Sqr(e))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(d, Times(e, x)), Plus(m,
                                      C1)),
                                  Simp(Subtract(
                                      Plus(Times(c, d, f), Times(CN1, f, b, e), Times(a, e, g)),
                                      Times(c, Subtract(Times(e, f), Times(d, g)), x)), x),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      FractionQ(m), LtQ(m, CN1)))),
          IIntegrate(829,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Subtract(Times(e, f), Times(d, g)),
                              Power(Plus(d, Times(e,
                                  x)), Plus(m,
                                      C1)),
                              Power(Times(Plus(m, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                                  CN1)),
                          x),
                      Dist(Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Simp(
                                  Subtract(Plus(Times(c, d, f), Times(a, e, g)),
                                      Times(c, Subtract(Times(e, f), Times(d, g)), x)),
                                  x),
                              Power(Plus(a, Times(c, Sqr(x))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), FractionQ(m), LtQ(m,
                          CN1)))),
          IIntegrate(830,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Power(Plus(d,
                              Times(e, x)), m),
                          Times(Plus(f, Times(g, x)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0),
                      Not(RationalQ(m))))),
          IIntegrate(831,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Power(Plus(d, Times(e, x)), m), Times(Plus(f, Times(g, x)),
                              Power(Plus(a, Times(c, Sqr(x))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g),
                      x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                      Not(RationalQ(m))))),
          IIntegrate(832,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(
                          Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                              Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(g, Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)), Power(
                                  Times(c, Plus(m, Times(C2, p), C2)), CN1)),
                          x),
                      Dist(Power(Times(c, Plus(m, Times(C2, p), C2)), CN1),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                              Simp(
                                  Plus(Times(m, Subtract(Times(c, d, f), Times(a, e, g))), Times(d,
                                      Subtract(Times(C2, c, f), Times(b, g)), Plus(p, C1)),
                                      Times(
                                          Plus(
                                              Times(m,
                                                  Subtract(Plus(Times(c, e, f), Times(c, d, g)),
                                                      Times(b, e, g))),
                                              Times(e, Plus(p, C1),
                                                  Subtract(Times(C2, c, f), Times(b, g)))),
                                          x)),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, p), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      GtQ(m, C0), NeQ(Plus(m, Times(C2,
                          p), C2), C0),
                      Or(IntegerQ(m), IntegerQ(p), IntegersQ(Times(C2, m), Times(C2, p))), Not(And(
                          IGtQ(m, C0), EqQ(f, C0)))))),
          IIntegrate(833,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(g, Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(c,
                                  Sqr(x))), Plus(p,
                                      C1)),
                              Power(Times(c, Plus(m, Times(C2, p), C2)), CN1)),
                          x),
                      Dist(Power(Times(c, Plus(m, Times(C2, p), C2)), CN1), Integrate(Times(
                          Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                          Power(Plus(a, Times(c, Sqr(x))), p),
                          Simp(Plus(Times(c, d, f, Plus(m, Times(C2, p), C2)),
                              Times(CN1, a, e, g, m),
                              Times(c, Plus(Times(e, f, Plus(m, Times(C2, p), C2)), Times(d, g, m)),
                                  x)),
                              x)),
                          x), x)),
                  And(FreeQ(List(a, c, d, e, f, g, p), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), GtQ(m, C0),
                      NeQ(Plus(m, Times(C2, p), C2), C0),
                      Or(IntegerQ(m), IntegerQ(p), IntegersQ(Times(C2, m),
                          Times(C2, p))),
                      Not(And(IGtQ(m, C0), EqQ(f, C0)))))),
          IIntegrate(834,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      Power(
                          Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                              Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Subtract(Times(e, f), Times(d, g)),
                              Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p,
                                  C1)),
                              Power(Times(Plus(m, C1),
                                  Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))),
                                  CN1)),
                          x),
                      Dist(Power(
                          Times(
                              Plus(m, C1), Plus(Times(c, Sqr(
                                  d)), Times(CN1, b, d, e), Times(a,
                                      Sqr(e)))),
                          CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                                  Simp(Subtract(
                                      Plus(
                                          Times(Plus(Times(c, d, f), Times(CN1, f, b, e),
                                              Times(a, e, g)), Plus(m, C1)),
                                          Times(b, Subtract(Times(d, g), Times(e, f)),
                                              Plus(p, C1))),
                                      Times(c, Subtract(Times(e, f), Times(d, g)),
                                          Plus(m, Times(C2, p), C3), x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, p), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      LtQ(m, CN1), Or(IntegerQ(m), IntegerQ(p),
                          IntegersQ(Times(C2, m), Times(C2, p)))))),
          IIntegrate(835,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Subtract(Times(e, f), Times(d, g)),
                          Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)), Power(Times(Plus(m, C1),
                              Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1)),
                          x),
                      Dist(
                          Power(Times(Plus(m, C1),
                              Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(a, Times(c, Sqr(x))), p),
                                  Simp(
                                      Subtract(
                                          Times(Plus(Times(c, d, f), Times(a, e, g)), Plus(m, C1)),
                                          Times(c, Subtract(Times(e, f), Times(d, g)),
                                              Plus(m, Times(C2, p), C3), x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, p), x),
                      NeQ(Plus(Times(c, Sqr(d)),
                          Times(a, Sqr(e))), C0),
                      LtQ(m, CN1), Or(IntegerQ(m), IntegerQ(p),
                          IntegersQ(Times(C2, m), Times(C2, p)))))),
          IIntegrate(836,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(
                          Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                              Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Subtract(Times(e, f), Times(d, g)),
                              Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Power(Plus(a, Times(b, x), Times(c,
                                  Sqr(x))), Plus(p,
                                      C1)),
                              Power(
                                  Times(Plus(m, C1),
                                      Plus(Times(c, Sqr(
                                          d)), Times(CN1, b, d,
                                              e),
                                          Times(a, Sqr(e)))),
                                  CN1)),
                          x),
                      Dist(Power(
                          Times(
                              Plus(m, C1), Plus(Times(c, Sqr(
                                  d)), Times(CN1, b, d, e), Times(a,
                                      Sqr(e)))),
                          CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                                  Simp(Subtract(
                                      Plus(
                                          Times(Plus(Times(c, d, f), Times(CN1, f, b, e),
                                              Times(a, e, g)), Plus(m, C1)),
                                          Times(b, Subtract(Times(d, g), Times(e, f)),
                                              Plus(p, C1))),
                                      Times(c, Subtract(Times(e, f), Times(d, g)),
                                          Plus(m, Times(C2, p), C3), x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      ILtQ(Simplify(Plus(m, Times(C2, p), C3)), C0), NeQ(m, CN1)))),
          IIntegrate(837,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(Plus(
                  Simp(
                      Times(Subtract(Times(e, f),
                          Times(d, g)), Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Times(Plus(m, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1)),
                      x),
                  Dist(Power(Times(Plus(m, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1),
                      Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(Plus(a, Times(c, Sqr(x))), p),
                          Simp(Subtract(Times(Plus(Times(c, d, f), Times(a, e, g)), Plus(m, C1)),
                              Times(c, Subtract(Times(e, f), Times(d, g)),
                                  Plus(m, Times(C2, p), C3), x)),
                              x)),
                          x),
                      x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, p), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a,
                          Sqr(e))), C0),
                      ILtQ(Simplify(Plus(m, Times(C2, p), C3)), C0), NeQ(m, CN1)))),
          IIntegrate(838, Integrate(Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), CN1),
              Plus(f_, Times(g_DEFAULT, x_)), Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                  Times(c_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
              Condition(
                  Dist(Times(C4, f, Subtract(a, d), Power(Subtract(Times(b, d), Times(a, e)), CN1)),
                      Subst(Integrate(Power(Subtract(Times(C4, Subtract(a, d)), Sqr(x)), CN1), x),
                          x,
                          Times(Plus(Times(C2, Subtract(a, d)), Times(Subtract(b, e), x)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1D2))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      EqQ(Subtract(Times(C4, c, Subtract(a, d)),
                          Sqr(Subtract(b, e))), C0),
                      EqQ(Subtract(Times(e, f, Subtract(b, e)),
                          Times(C2, g, Subtract(Times(b, d), Times(a, e)))), C0),
                      NeQ(Subtract(Times(b, d), Times(a, e)), C0)))),
          IIntegrate(839,
              Integrate(
                  Times(
                      Power(x_, CN1D2), Plus(f_, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(C2,
                      Subst(
                          Integrate(
                              Times(Plus(f, Times(g, Sqr(x))), Power(Plus(a, Times(b, Sqr(x)),
                                  Times(c, Power(x, C4))), CN1D2)),
                              x),
                          x, Sqrt(x)),
                      x),
                  And(FreeQ(List(a, b, c, f, g), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(840,
              Integrate(Times(Power(x_, CN1D2), Plus(f_, Times(g_DEFAULT, x_)),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1D2)), x_Symbol),
              Condition(
                  Dist(C2,
                      Subst(Integrate(Times(Plus(f, Times(g, Sqr(x))),
                          Power(Plus(a, Times(c, Power(x, C4))), CN1D2)), x), x, Sqrt(x)),
                      x),
                  FreeQ(List(a, c, f, g), x))));
}
