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
class IntRules42 {
  public static IAST RULES =
      List(
          IIntegrate(841,
              Integrate(
                  Times(
                      Power(Times(e_, x_), CN1D2), Plus(f_, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(x), Power(Times(e, x),
                          CN1D2)),
                      Integrate(
                          Times(
                              Plus(f, Times(g,
                                  x)),
                              Power(
                                  Times(Sqrt(x), Sqrt(
                                      Plus(a, Times(b, x), Times(c, Sqr(x))))),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, e, f,
                      g), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0)))),
          IIntegrate(842,
              Integrate(
                  Times(
                      Power(Times(e_, x_), CN1D2), Plus(f_, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(Times(Sqrt(x), Power(Times(e, x), CN1D2)),
                      Integrate(
                          Times(
                              Plus(f, Times(g, x)), Power(Times(Sqrt(x),
                                  Sqrt(Plus(a, Times(c, Sqr(x))))), CN1)),
                          x),
                      x),
                  FreeQ(List(a, c, e, f, g), x))),
          IIntegrate(843,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(g, Power(e, CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)), x),
                          x),
                      Dist(Times(Subtract(Times(e, f), Times(d, g)), Power(e, CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      Not(IGtQ(m, C0))))),
          IIntegrate(844,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(Dist(Times(g, Power(e, CN1)),
                      Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(Plus(a, Times(c, Sqr(x))), p)), x),
                      x),
                      Dist(Times(Subtract(Times(e, f), Times(d, g)), Power(e, CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), m),
                                  Power(Plus(a, Times(c, Sqr(x))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, p), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IGtQ(m, C0))))),
          IIntegrate(845,
              Integrate(
                  Times(Power(x_, m_DEFAULT), Power(Plus(f_, Times(g_DEFAULT, x_)), n_DEFAULT),
                      Plus(Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_)))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(
                          c, Power(x, Plus(m, C2)), Power(Plus(f, Times(g, x)),
                              Plus(n, C1)),
                          Power(Times(g, Plus(m, n, C3)), CN1)),
                      x),
                  And(FreeQ(List(b, c, f, g, m, n), x),
                      EqQ(Subtract(Times(c, f, Plus(m, C2)),
                          Times(b, g, Plus(m, n, C3))), C0),
                      NeQ(Plus(m, n, C3), C0)))),
          IIntegrate(846,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_)),
                  x_Symbol),
              Condition(Dist(Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), FracPart(p)),
                  Power(
                      Times(Power(c, IntPart(p)),
                          Power(Plus(Times(C1D2, b), Times(c, x)), Times(C2, FracPart(p)))),
                      CN1)),
                  Integrate(
                      Times(Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)), n),
                          Power(Plus(Times(C1D2, b), Times(c, x)), Times(C2, p))),
                      x),
                  x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n), x),
                      NeQ(Subtract(Times(e, f),
                          Times(d, g)), C0),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
          IIntegrate(847,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, p)),
                      Power(Plus(f, Times(g, x)), n), Power(
                          Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))), p)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      IntegerQ(p), Not(IGtQ(n, C0))))),
          IIntegrate(848,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Plus(d, Times(e, x)), Plus(m, p)), Power(Plus(f, Times(g, x)), n),
                          Power(Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))), p)),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g, m, n), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                      Or(IntegerQ(p), And(GtQ(a, C0), GtQ(d, C0), EqQ(Plus(m, p), C0)))))),
          IIntegrate(849,
              Integrate(
                  Times(Power(x_, n_DEFAULT), Power(Plus(d_, Times(e_DEFAULT, x_)), CN1),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(x, n), Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n, p), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)),
                      Or(Not(IntegerQ(n)), Not(IntegerQ(Times(C2, p))), IGtQ(n, C2),
                          And(GtQ(p, C0), NeQ(n, C2)))))),
          IIntegrate(850,
              Integrate(
                  Times(
                      Power(x_, n_DEFAULT), Power(Plus(d_,
                          Times(e_DEFAULT, x_)), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(x, n), Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))),
                          Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C1))),
                      x),
                  And(FreeQ(List(a, c, d, e, n, p), x),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(
                          p)),
                      Or(Not(IntegerQ(n)), Not(IntegerQ(Times(C2, p))), IGtQ(n, C2),
                          And(GtQ(p, C0), NeQ(n, C2)))))),
          IIntegrate(851,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(Times(Power(Plus(f, Times(g, x)), n),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(m, p)),
                      Power(Power(Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))), m),
                          CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0),
                      Not(IntegerQ(p)), ILtQ(m, C0), IntegerQ(n), Or(LtQ(n, C0), GtQ(p, C0))))),
          IIntegrate(852, Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
              Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
              Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)), x_Symbol), Condition(
                  Dist(Times(Power(d, Times(C2, m)), Power(Power(a, m), CN1)),
                      Integrate(Times(Power(Plus(f, Times(g, x)), n),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(m, p)), Power(
                              Power(Subtract(d, Times(e, x)), m), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)),
                      EqQ(f, C0), ILtQ(m, CN1), Not(And(IGtQ(n, C0), ILtQ(Plus(m,
                          n), C0), Not(
                              GtQ(p, C1))))))),
          IIntegrate(853,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(d, Times(C2, m)), Power(Power(a, m), CN1)),
                      Integrate(
                          Times(Power(Plus(f, Times(g, x)), n),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(m, p)),
                              Power(Power(Subtract(d, Times(e, x)), m), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(a,
                              Sqr(e))),
                          C0),
                      Not(IntegerQ(p)), ILtQ(m, C0), IntegerQ(n)))),
          IIntegrate(854,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), CN1),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(Subtract(Times(C2, c, d), Times(b, e)),
                                  Power(Plus(f, Times(g, x)), n),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p,
                                      C1)),
                                  Power(
                                      Times(
                                          e, p, Subtract(Sqr(b), Times(C4, a, c)), Plus(d,
                                              Times(e, x))),
                                      CN1)),
                              x)),
                      Dist(Power(Times(d, e, p, Subtract(Sqr(b), Times(C4, a, c))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(f, Times(g,
                                      x)), Subtract(n, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                                  Simp(Subtract(
                                      Subtract(
                                          Times(b,
                                              Subtract(Times(a, e, g, n),
                                                  Times(c, d, f, Plus(Times(C2, p), C1)))),
                                          Times(C2, a, c,
                                              Subtract(Times(d, g, n),
                                                  Times(e, f, Plus(Times(C2, p), C1))))),
                                      Times(c, g, Subtract(Times(b, d), Times(C2, a, e)),
                                          Plus(n, Times(C2, p), C1), x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Times(e, f), Times(d,
                          g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), IGtQ(n, C0), ILtQ(Plus(n, Times(C2, p)), C0)))),
          IIntegrate(855,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), CN1),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(d, Power(Plus(f, Times(g, x)), n),
                              Power(Plus(a, Times(c,
                                  Sqr(x))), Plus(p,
                                      C1)),
                              Power(Times(C2, a, e, p, Plus(d, Times(e, x))), CN1)),
                          x),
                      Dist(
                          Power(Times(C2, d, e,
                              p), CN1),
                          Integrate(
                              Times(Power(Plus(f, Times(g, x)), Subtract(n, C1)),
                                  Power(Plus(a, Times(c, Sqr(x))), p),
                                  Simp(
                                      Subtract(
                                          Subtract(Times(d, g, n),
                                              Times(e, f, Plus(Times(C2, p), C1))),
                                          Times(e, g, Plus(n, Times(C2, p), C1), x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)),
                      IGtQ(n, C0), ILtQ(Plus(n, Times(C2, p)), C0)))),
          IIntegrate(856,
              Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), CN1),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(a_DEFAULT,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(Plus(Simp(Times(Power(Plus(f, Times(g, x)), Plus(n, C1)),
                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                  Subtract(Subtract(Times(c, d), Times(b, e)), Times(c, e, x)),
                  Power(Times(p, Subtract(Times(C2, c, d), Times(b, e)),
                      Subtract(Times(e, f), Times(d, g))), CN1)),
                  x),
                  Dist(
                      Power(
                          Times(
                              p, Subtract(Times(C2, c, d), Times(b, e)),
                              Subtract(Times(e, f), Times(d, g))),
                          CN1),
                      Integrate(Times(Power(Plus(f, Times(g, x)), n),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                          Plus(Times(b, e, g, Plus(n, p, C1)),
                              Times(c, e, f, Plus(Times(C2, p), C1)),
                              Times(CN1, c, d, g, Plus(n, Times(C2, p), C1)),
                              Times(c, e, g, Plus(n, Times(C2, p), C2), x))),
                          x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Times(e, f), Times(d,
                          g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), ILtQ(n, C0), ILtQ(Plus(n, Times(C2, p)), C0),
                      Not(IGtQ(n, C0))))),
          IIntegrate(857,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), CN1),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(d, Power(Plus(f, Times(g, x)), Plus(n, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Times(C2, a, p, Subtract(Times(e, f), Times(d, g)),
                                  Plus(d, Times(e, x))), CN1)),
                          x),
                      Dist(Power(Times(p, C2, c, d, Subtract(Times(e, f), Times(d, g))), CN1),
                          Integrate(Times(Power(Plus(f, Times(g, x)), n),
                              Power(Plus(a, Times(c, Sqr(x))), p),
                              Plus(Times(c, e, f, Plus(Times(C2, p), C1)),
                                  Times(CN1, c, d, g, Plus(n, Times(C2, p), C1)),
                                  Times(c, e, g, Plus(n, Times(C2, p), C2), x))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)), ILtQ(n,
                          C0),
                      ILtQ(Plus(n, Times(C2, p)), C0), Not(IGtQ(n, C0))))),
          IIntegrate(858,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                          Power(Plus(f, Times(g, x)), n),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)), Power(
                              Times(c, Subtract(Subtract(m, n), C1)), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d,
                          g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a,
                          Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0),
                      EqQ(Subtract(Plus(Times(c, e, f), Times(c, d, g)), Times(b, e, g)), C0),
                      NeQ(Subtract(Subtract(m, n), C1), C0)))),
          IIntegrate(859,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(
                          Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), n),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)), Power(
                                  Times(c, Subtract(Subtract(m, n), C1)), CN1)),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)),
                      EqQ(Plus(m, p), C0), EqQ(Plus(Times(e, f), Times(d, g)),
                          C0),
                      NeQ(Subtract(Subtract(m, n), C1), C0)))),
          IIntegrate(860,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Negate(Simp(Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                      Power(Plus(f, Times(g, x)), Plus(n, C1)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                      Power(
                          Times(Plus(n, C1),
                              Subtract(Plus(Times(c, e, f), Times(c, d, g)), Times(b, e, g))),
                          CN1)),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p)), EqQ(Plus(m, p), C0),
                      EqQ(Subtract(Subtract(m, n), C2), C0)))));
}
