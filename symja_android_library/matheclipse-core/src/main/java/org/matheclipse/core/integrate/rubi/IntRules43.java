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
class IntRules43 {
  public static IAST RULES =
      List(
          IIntegrate(861,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Negate(Simp(Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                      Power(Plus(f, Times(g, x)), Plus(n, C1)),
                      Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)), Power(
                          Times(c, Plus(n, C1), Plus(Times(e, f), Times(d, g))), CN1)),
                      x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(a,
                              Sqr(e))),
                          C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), EqQ(Subtract(Subtract(m, n), C2),
                          C0)))),
          IIntegrate(862,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), m_),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Power(Plus(d, Times(e, x)), m),
                          Power(Plus(f, Times(g, x)), Plus(n, C1)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))),
                              p),
                          Power(Times(g, Plus(n, C1)), CN1)), x),
                      Dist(Times(c, m, Power(Times(e, g, Plus(n, C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(f, Times(g, x)), Plus(n, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Times(e, f), Times(d,
                          g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Plus(m,
                          p), C0),
                      GtQ(p, C0), LtQ(n, CN1), Not(And(IntegerQ(Plus(n,
                          p)), LeQ(Plus(n, p, C2),
                              C0)))))),
          IIntegrate(863,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), p), Power(Times(g, Plus(n, C1)),
                                  CN1)),
                          x),
                      Dist(Times(c, m, Power(Times(e, g, Plus(n, C1)), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)), Power(
                                  Plus(a, Times(c, Sqr(x))), Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)),
                      EqQ(Plus(m,
                          p), C0),
                      GtQ(p, C0), LtQ(n, CN1), Not(
                          And(IntegerQ(Plus(n, p)), LeQ(Plus(n, p, C2), C0)))))),
          IIntegrate(864,
              Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(a_DEFAULT,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                              Power(Times(g, Subtract(Subtract(m, n), C1)), CN1)), x)),
                      Dist(
                          Times(m, Subtract(Plus(Times(c, e, f), Times(c, d, g)), Times(b, e, g)),
                              Power(Times(Sqr(e), g, Subtract(Subtract(m, n), C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(f, Times(g, x)), n),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, n), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), GtQ(p, C0),
                      NeQ(Subtract(Subtract(m,
                          n), C1), C0),
                      Not(IGtQ(n, C0)), Not(And(IntegerQ(Plus(n, p)),
                          LtQ(Plus(n, p, C2), C0))),
                      RationalQ(n)))),
          IIntegrate(865,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(Negate(Simp(Times(Power(Plus(d, Times(e, x)), m),
                      Power(Plus(f, Times(g, x)), Plus(n, C1)), Power(Plus(a, Times(c, Sqr(x))), p),
                      Power(Times(g, Subtract(Subtract(m, n), C1)), CN1)), x)), Dist(
                          Times(c, m, Plus(Times(e, f), Times(d, g)),
                              Power(Times(Sqr(e), g, Subtract(Subtract(m, n), C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(f, Times(g, x)), n),
                                  Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, n), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)),
                      EqQ(Plus(m, p), C0), GtQ(p, C0), NeQ(Subtract(Subtract(m, n), C1), C0),
                      Not(IGtQ(n, C0)), Not(And(IntegerQ(Plus(n, p)),
                          LtQ(Plus(n, p, C2), C0))),
                      RationalQ(n)))),
          IIntegrate(866,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), n),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))),
                                  Plus(p, C1)),
                              Power(Times(c, Plus(p, C1)), CN1)),
                          x),
                      Dist(Times(e, g, n, Power(Times(c, Plus(p, C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(f, Times(g, x)), Subtract(n, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Times(e, f), Times(d,
                          g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0), Not(
                          IntegerQ(p)),
                      EqQ(Plus(m, p), C0), LtQ(p, CN1), GtQ(n, C0)))),
          IIntegrate(867,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), n),
                              Power(Plus(a, Times(c, Sqr(x))),
                                  Plus(p, C1)),
                              Power(Times(c, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(e, g, n, Power(Times(c, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(f, Times(g, x)), Subtract(n,
                                      C1)),
                                  Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(a,
                              Sqr(e))),
                          C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), LtQ(p, CN1), GtQ(n, C0)))),
          IIntegrate(868,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                      Power(Plus(f, Times(g, x)), Plus(n, C1)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                      Power(
                          Times(Plus(p, C1),
                              Subtract(Plus(Times(c, e, f), Times(c, d, g)), Times(b, e, g))),
                          CN1)),
                      x),
                      Dist(
                          Times(Sqr(e), g, Subtract(Subtract(m, n), C2),
                              Power(Times(Plus(p, C1),
                                  Subtract(Plus(Times(c, e, f), Times(c, d, g)), Times(b, e, g))),
                                  CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(f, Times(g, x)), n),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, n), x),
                      NeQ(Subtract(Times(e, f), Times(d,
                          g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), LtQ(p, CN1), RationalQ(n)))),
          IIntegrate(869,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Times(c, Plus(p, C1), Plus(Times(e, f), Times(d, g))), CN1)),
                          x),
                      Dist(
                          Times(Sqr(e), g, Subtract(Subtract(m, n), C2),
                              Power(Times(c, Plus(p, C1), Plus(Times(e, f), Times(d, g))), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(f, Times(g, x)), n),
                                  Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, n), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(a,
                              Sqr(e))),
                          C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), LtQ(p, CN1), RationalQ(n)))),
          IIntegrate(870,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(f, Times(g, x)), n),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                                  Power(Times(c, Subtract(Subtract(m, n), C1)), CN1)),
                              x)),
                      Dist(
                          Times(n, Subtract(Plus(Times(c, e, f), Times(c, d, g)), Times(b, e, g)),
                              Power(Times(c, e, Subtract(Subtract(m, n), C1)), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(f, Times(g, x)), Subtract(n, C1)), Power(
                                  Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), GtQ(n, C0),
                      NeQ(Subtract(Subtract(m, n), C1), C0),
                      Or(IntegerQ(Times(C2, p)), IntegerQ(n))))),
          IIntegrate(871,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(Negate(Simp(Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                      Power(Plus(f, Times(g, x)), n), Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                      Power(Times(c, Subtract(Subtract(m, n), C1)), CN1)), x)), Dist(
                          Times(n, Plus(Times(e, f), Times(d, g)),
                              Power(Times(e, Subtract(Subtract(m, n), C1)), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(f, Times(g, x)), Subtract(n, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), p)), x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a,
                          Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), GtQ(n, C0),
                      NeQ(Subtract(Subtract(m, n),
                          C1), C0),
                      Or(IntegerQ(Times(C2, p)), IntegerQ(n))))),
          IIntegrate(872,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(
                          a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Times(Plus(n, C1),
                                  Subtract(Plus(Times(c, e, f), Times(c, d, g)), Times(b, e, g))),
                                  CN1)),
                              x)),
                      Dist(
                          Times(c, e, Subtract(Subtract(m, n), C2),
                              Power(
                                  Times(Plus(n, C1),
                                      Subtract(Plus(Times(c, e, f), Times(c, d, g)),
                                          Times(b, e, g))),
                                  CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), m),
                                  Power(Plus(f, Times(g, x)), Plus(n, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Times(e, f), Times(d,
                          g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), LtQ(n, CN1), IntegerQ(Times(C2, p))))),
          IIntegrate(873,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(Simp(
                          Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Times(Plus(n, C1), Plus(Times(c, e, f), Times(c, d, g))), CN1)),
                          x)),
                      Dist(
                          Times(e, Subtract(Subtract(m, n), C2),
                              Power(Times(Plus(n, C1), Plus(Times(e, f), Times(d, g))), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), p)), x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(a,
                              Sqr(e))),
                          C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0), LtQ(n, CN1), IntegerQ(Times(C2, p))))),
          IIntegrate(874,
              Integrate(
                  Times(
                      Sqrt(Plus(d_, Times(e_DEFAULT,
                          x_))),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), CN1),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(Times(C2, Sqr(e)),
                      Subst(
                          Integrate(
                              Power(
                                  Plus(Times(c, Plus(Times(e, f), Times(d, g))),
                                      Times(CN1, b, e, g), Times(Sqr(e), g, Sqr(x))),
                                  CN1),
                              x),
                          x,
                          Times(Sqrt(Plus(a, Times(b, x), Times(c, Sqr(x)))),
                              Power(Plus(d, Times(e, x)), CN1D2))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Times(e, f), Times(d,
                          g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0)))),
          IIntegrate(875,
              Integrate(
                  Times(Sqrt(Plus(d_, Times(e_DEFAULT, x_))),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(Times(C2, Sqr(e)),
                      Subst(
                          Integrate(Power(Plus(Times(c, Plus(Times(e, f), Times(d, g))),
                              Times(Sqr(e), g, Sqr(x))), CN1), x),
                          x,
                          Times(Sqrt(Plus(a, Times(c, Sqr(x)))),
                              Power(Plus(d, Times(e, x)), CN1D2))),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
          IIntegrate(876,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Simp(Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                      Power(Plus(f, Times(g, x)), Plus(n, C1)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))),
                          Plus(p, C1)),
                      Power(Times(c, g, Plus(n, p, C2)), CN1)), x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Subtract(Plus(m, p), C1), C0),
                      EqQ(Subtract(Plus(Times(b, e, g, Plus(n, C1)), Times(c, e, f, Plus(p, C1))),
                          Times(c, d, g, Plus(Times(C2, n), p, C3))),
                          C0),
                      NeQ(Plus(n, p, C2), C0)))),
          IIntegrate(877,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                          Power(Plus(f, Times(g, x)), Plus(n, C1)),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(p,
                              C1)),
                          Power(Times(c, g, Plus(n, p, C2)), CN1)),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a,
                          Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Subtract(Plus(m, p),
                          C1), C0),
                      EqQ(Subtract(Times(e, f, Plus(p, C1)),
                          Times(d, g, Plus(Times(C2, n), p, C3))), C0),
                      NeQ(Plus(n, p, C2), C0)))),
          IIntegrate(878,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Sqr(e), Subtract(Times(e, f), Times(d, g)),
                              Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              Power(
                                  Times(
                                      g, Plus(n, C1),
                                      Subtract(Plus(Times(c, e, f), Times(c, d, g)),
                                          Times(b, e, g))),
                                  CN1)),
                          x),
                      Dist(Times(e,
                          Subtract(Plus(Times(b, e, g, Plus(n, C1)), Times(c, e, f, Plus(p, C1))),
                              Times(c, d, g, Plus(Times(C2, n), p, C3))),
                          Power(
                              Times(g, Plus(n, C1),
                                  Subtract(Plus(Times(c, e, f), Times(c, d, g)), Times(b, e, g))),
                              CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Subtract(Plus(m, p),
                          C1), C0),
                      LtQ(n, CN1), IntegerQ(Times(C2, p))))),
          IIntegrate(879,
              Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)), x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Sqr(e), Subtract(Times(e, f), Times(d, g)),
                              Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                              Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Times(c, g, Plus(n, C1), Plus(Times(e, f), Times(d, g))), CN1)),
                          x),
                      Dist(
                          Times(e,
                              Subtract(Times(e, f, Plus(p, C1)),
                                  Times(d, g, Plus(Times(C2, n), p, C3))),
                              Power(Times(g, Plus(n, C1), Plus(Times(e, f), Times(d, g))), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(f, Times(g, x)), Plus(n, C1)),
                                  Power(Plus(a, Times(c, Sqr(x))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a,
                          Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Subtract(Plus(m, p), C1), C0), LtQ(n,
                          CN1),
                      IntegerQ(Times(C2, p))))),
          IIntegrate(880,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                          Power(Plus(f, Times(g, x)), Plus(n, C1)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Times(c, g, Plus(n, p, C2)), CN1)), x),
                      Dist(Times(
                          Subtract(Plus(Times(b, e, g, Plus(n, C1)), Times(c, e, f, Plus(p, C1))),
                              Times(c, d, g, Plus(Times(C2, n), p, C3))),
                          Power(Times(c, g, Plus(n, p, C2)), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), n),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Subtract(Plus(m, p), C1), C0), Not(LtQ(n, CN1)),
                      IntegerQ(Times(C2, p))))));
}
