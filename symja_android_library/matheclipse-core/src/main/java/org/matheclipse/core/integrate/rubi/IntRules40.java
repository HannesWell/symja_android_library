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
class IntRules40 {
  public static IAST RULES =
      List(
          IIntegrate(801,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(Integrate(ExpandIntegrand(Times(Power(Plus(d, Times(e, x)), m),
                  Plus(f, Times(g, x)), Power(Plus(a, Times(c, Sqr(x))), CN1)), x), x), And(
                      FreeQ(List(a, c, d, e, f, g), x), NeQ(
                          Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                      IntegerQ(m)))),
          IIntegrate(802,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      Power(
                          Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                              Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(
                          Times(Subtract(Times(e, f), Times(d, g)),
                              Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Times(C2, Plus(p, C1),
                                  Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      EqQ(Simplify(Plus(m, Times(C2, p), C3)), C0), EqQ(
                          Subtract(
                              Times(b, Plus(Times(e, f), Times(d, g))), Times(C2,
                                  Plus(Times(c, d, f), Times(a, e, g)))),
                          C0)))),
          IIntegrate(803,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(
                          Times(Subtract(Times(e, f), Times(d, g)),
                              Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Power(
                                  Times(C2, Plus(p, C1),
                                      Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, p), x),
                      NeQ(Plus(Times(c, Sqr(
                          d)), Times(a,
                              Sqr(e))),
                          C0),
                      EqQ(Simplify(Plus(m, Times(C2, p), C3)), C0),
                      EqQ(Plus(Times(c, d, f), Times(a, e, g)), C0)))),
          IIntegrate(804,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              Plus(Times(b, f), Times(CN1, C2, a, g),
                                  Times(Subtract(Times(C2, c, f), Times(b, g)), x)),
                              Power(Times(Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          x),
                      Dist(
                          Times(m,
                              Subtract(
                                  Times(b, Plus(Times(e, f), Times(d, g))),
                                  Times(C2, Plus(Times(c, d, f), Times(a, e, g)))),
                              Power(Times(Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      EqQ(Simplify(Plus(m, Times(C2, p), C3)), C0), LtQ(p, CN1)))),
          IIntegrate(805,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Subtract(Times(a, g), Times(c, f, x)),
                              Power(Times(C2, a, c, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(m, Plus(Times(c, d, f),
                              Times(a, e, g)), Power(Times(C2, a, c, Plus(p, C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a,
                          Sqr(e))), C0),
                      EqQ(Simplify(Plus(m, Times(C2, p), C3)), C0), LtQ(p, CN1)))),
          IIntegrate(806,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(Subtract(Negate(Simp(
                  Times(Subtract(Times(e, f), Times(d, g)),
                      Power(Plus(d, Times(e, x)), Plus(m, C1)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                      Power(Times(C2, Plus(p, C1),
                          Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))), CN1)),
                  x)),
                  Dist(Times(
                      Subtract(Times(b, Plus(Times(e, f), Times(d, g))),
                          Times(C2, Plus(Times(c, d, f), Times(a, e, g)))),
                      Power(
                          Times(C2, Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))),
                          CN1)),
                      Integrate(
                          Times(
                              Power(Plus(d, Times(e, x)), Plus(m, C1)), Power(
                                  Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                          x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      EqQ(Simplify(Plus(m, Times(C2, p), C3)), C0)))),
          IIntegrate(807,
              Integrate(Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                  Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
                  x_Symbol),
              Condition(Plus(Negate(Simp(
                  Times(Subtract(Times(e, f), Times(d, g)), Power(Plus(d, Times(e, x)),
                      Plus(m, C1)), Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                      Power(Times(C2, Plus(p, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1)),
                  x)), Dist(
                      Times(Plus(Times(c, d, f), Times(a, e, g)), Power(
                          Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), p)),
                          x),
                      x)),
                  And(FreeQ(List(a, c, d, e, f, g, m, p), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0),
                      EqQ(Simplify(Plus(m, Times(C2, p), C3)), C0)))),
          IIntegrate(808,
              Integrate(
                  Times(
                      Power(Times(e_DEFAULT, x_), m_), Plus(f_, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(f,
                          Integrate(Times(Power(Times(e, x), m),
                              Power(Plus(a, Times(c, Sqr(x))), p)), x),
                          x),
                      Dist(Times(g, Power(e, CN1)),
                          Integrate(
                              Times(Power(Times(e, x), Plus(m, C1)),
                                  Power(Plus(a, Times(c, Sqr(x))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, e, f, g, p), x), Not(RationalQ(m)), Not(IGtQ(p, C0))))),
          IIntegrate(809,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(d, Times(e, x)), FracPart(p)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), FracPart(p)),
                          Power(Power(Plus(Times(a, d), Times(c, e, Power(x, C3))), FracPart(p)),
                              CN1)),
                      Integrate(Times(Plus(f, Times(g, x)),
                          Power(Plus(Times(a, d), Times(c, e, Power(x, C3))), p)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x), EqQ(m, p),
                      EqQ(Plus(Times(b, d), Times(a, e)), C0),
                      EqQ(Plus(Times(c, d), Times(b, e)), C0)))),
          IIntegrate(810,
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
                  Subtract(
                      Negate(
                          Simp(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p), Subtract(
                                      Subtract(
                                          Times(Subtract(Times(d, g), Times(e, f, Plus(m, C2))),
                                              Plus(
                                                  Times(c, Sqr(d)), Times(CN1, b, d, e),
                                                  Times(a, Sqr(e)))),
                                          Times(d, p, Subtract(Times(C2, c, d), Times(b, e)),
                                              Subtract(Times(e, f), Times(d, g)))),
                                      Times(e,
                                          Plus(
                                              Times(g, Plus(m, C1),
                                                  Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                                                      Times(a, Sqr(e)))),
                                              Times(p, Subtract(Times(C2, c, d), Times(b, e)),
                                                  Subtract(Times(e, f), Times(d, g)))),
                                          x)),
                                  Power(
                                      Times(Sqr(e), Plus(m, C1), Plus(m, C2),
                                          Plus(
                                              Times(c, Sqr(d)), Times(CN1, b, d, e),
                                              Times(a, Sqr(e)))),
                                      CN1)),
                              x)),
                      Dist(
                          Times(p,
                              Power(
                                  Times(Sqr(e), Plus(m, C1), Plus(m, C2),
                                      Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                                          Times(a, Sqr(e)))),
                                  CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C2)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                              Simp(
                                  Subtract(
                                      Plus(
                                          Times(C2, a, c, e, Subtract(Times(e, f), Times(d, g)),
                                              Plus(m, C2)),
                                          Times(Sqr(b), e,
                                              Subtract(Times(d, g, Plus(p, C1)),
                                                  Times(e, f, Plus(m, p, C2)))),
                                          Times(b, Subtract(Times(a, Sqr(e), g, Plus(m, C1)),
                                              Times(c, d,
                                                  Subtract(Times(d, g, Plus(Times(C2, p), C1)),
                                                      Times(e, f, Plus(m, Times(C2, p), C2))))))),
                                      Times(c, Subtract(
                                          Times(C2, c, d,
                                              Subtract(Times(d, g, Plus(Times(C2, p), C1)),
                                                  Times(e, f, Plus(m, Times(C2, p), C2)))),
                                          Times(e,
                                              Subtract(Times(C2, a, e, g, Plus(m, C1)), Times(b,
                                                  Plus(Times(d, g, Subtract(m, Times(C2, p))),
                                                      Times(e, f, Plus(m, Times(C2, p), C2))))))),
                                          x)),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      GtQ(p, C0), LtQ(m, CN2), LtQ(Plus(m,
                          Times(C2, p)), C0),
                      Not(ILtQ(Plus(m, Times(C2, p), C3), C0))))),
          IIntegrate(811,
              Integrate(Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                  Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)), x_Symbol),
              Condition(
                  Subtract(
                      Negate(Simp(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(Plus(a, Times(c, Sqr(x))), p), Subtract(Subtract(
                              Times(Subtract(Times(d, g), Times(
                                  e, f, Plus(m, C2))), Plus(Times(c, Sqr(d)),
                                      Times(a, Sqr(e)))),
                              Times(C2, c, Sqr(d), p, Subtract(Times(e, f), Times(d, g)))),
                              Times(e,
                                  Plus(
                                      Times(g, Plus(m, C1),
                                          Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                                      Times(C2, c, d, p, Subtract(Times(e, f), Times(d, g)))),
                                  x)),
                          Power(Times(Sqr(e), Plus(m, C1), Plus(m, C2),
                              Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1)),
                          x)),
                      Dist(
                          Times(p,
                              Power(Times(Sqr(e), Plus(m, C1), Plus(m, C2),
                                  Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C2)),
                                  Power(Plus(a, Times(c,
                                      Sqr(x))), Subtract(p,
                                          C1)),
                                  Simp(Subtract(
                                      Times(C2, a, c, e, Subtract(Times(e, f), Times(d, g)),
                                          Plus(m, C2)),
                                      Times(c,
                                          Subtract(
                                              Times(C2, c, d,
                                                  Subtract(Times(d, g, Plus(Times(C2, p), C1)),
                                                      Times(e, f, Plus(m, Times(C2, p), C2)))),
                                              Times(C2, a, Sqr(e), g, Plus(m, C1))),
                                          x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), GtQ(p, C0), LtQ(m,
                          CN2),
                      LtQ(Plus(m, Times(C2, p)), C0), Not(ILtQ(Plus(m, Times(C2, p), C3), C0))))),
          IIntegrate(812,
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
                          Times(
                              Power(Plus(d, Times(e,
                                  x)), Plus(m,
                                      C1)),
                              Plus(Times(e, f, Plus(m, Times(C2, p), C2)),
                                  Times(CN1, d, g, Plus(Times(C2,
                                      p), C1)),
                                  Times(e, g, Plus(m, C1), x)),
                              Power(Plus(a, Times(b, x), Times(c,
                                  Sqr(x))), p),
                              Power(Times(Sqr(e), Plus(m, C1), Plus(m, Times(C2, p), C2)), CN1)),
                          x),
                      Dist(
                          Times(p,
                              Power(Times(Sqr(e), Plus(m, C1), Plus(m, Times(C2, p), C2)), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                                  Simp(
                                      Plus(
                                          Times(g,
                                              Plus(Times(b, d), Times(C2, a, e), Times(C2, a, e, m),
                                                  Times(C2, b, d, p))),
                                          Times(CN1, f, b, e, Plus(m, Times(C2, p), C2)), Times(
                                              Subtract(
                                                  Times(g,
                                                      Plus(Times(C2, c, d), Times(b, e),
                                                          Times(b, e, m), Times(C4, c, d, p))),
                                                  Times(C2, c, e, f, Plus(m, Times(C2, p), C2))),
                                              x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      RationalQ(p), Greater(p, C0),
                      Or(LtQ(m, CN1), EqQ(p, C1), And(IntegerQ(p), Not(RationalQ(m)))), NeQ(m, CN1),
                      Not(ILtQ(Plus(m, Times(C2, p), C1), C0)), Or(IntegerQ(m), IntegerQ(p),
                          IntegersQ(Times(C2, m), Times(C2, p)))))),
          IIntegrate(813,
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
                      Simp(
                          Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Plus(Times(e, f, Plus(m, Times(C2, p), C2)),
                                  Times(CN1, d, g, Plus(Times(C2, p), C1)), Times(e, g, Plus(m, C1),
                                      x)),
                              Power(Plus(a, Times(c,
                                  Sqr(x))), p),
                              Power(Times(Sqr(e), Plus(m, C1), Plus(m, Times(C2, p), C2)), CN1)),
                          x),
                      Dist(
                          Times(p,
                              Power(Times(Sqr(e), Plus(m, C1), Plus(m, Times(C2, p), C2)), CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                                  Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C1)),
                                  Simp(
                                      Plus(Times(g, Plus(Times(C2, a, e), Times(C2, a, e, m))),
                                          Times(
                                              Subtract(
                                                  Times(g,
                                                      Plus(Times(C2, c, d), Times(C4, c, d, p))),
                                                  Times(C2, c, e, f, Plus(m, Times(C2, p), C2))),
                                              x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), RationalQ(p),
                      Greater(p, C0),
                      Or(LtQ(m, CN1), EqQ(p, C1), And(IntegerQ(p), Not(RationalQ(m)))), NeQ(m, CN1),
                      Not(ILtQ(Plus(m, Times(C2, p), C1), C0)), Or(IntegerQ(m), IntegerQ(p),
                          IntegersQ(Times(C2, m), Times(C2, p)))))),
          IIntegrate(814,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Power(Plus(d, Times(e,
                                  x)), Plus(m,
                                      C1)),
                              Plus(
                                  Times(c, e, f, Plus(m, Times(C2, p),
                                      C2)),
                                  Times(CN1, g,
                                      Subtract(Plus(Times(c, d), Times(C2, c, d, p)),
                                          Times(b, e, p))),
                                  Times(g, c, e, Plus(m, Times(C2, p), C1), x)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                              Power(
                                  Times(c, Sqr(e), Plus(m, Times(C2, p), C1),
                                      Plus(m, Times(C2, p), C2)),
                                  CN1)),
                          x),
                      Dist(
                          Times(p,
                              Power(
                                  Times(
                                      c, Sqr(e), Plus(m, Times(C2, p), C1), Plus(m, Times(C2, p),
                                          C2)),
                                  CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), m),
                                  Power(Plus(a, Times(b, x), Times(c,
                                      Sqr(x))), Subtract(p,
                                          C1)),
                                  Simp(Plus(Times(
                                      c, e, f, Subtract(Times(b, d), Times(C2, a,
                                          e)),
                                      Plus(m, Times(C2, p), C2)),
                                      Times(g,
                                          Plus(
                                              Times(a, e,
                                                  Plus(Times(b, e), Times(CN1, C2, c, d, m),
                                                      Times(b, e, m))),
                                              Times(b, d,
                                                  Subtract(Subtract(Times(b, e, p), Times(c, d)),
                                                      Times(C2, c, d, p))))),
                                      Times(Plus(
                                          Times(c, e, f, Subtract(Times(C2, c, d), Times(b, e)),
                                              Plus(m, Times(C2, p), C2)),
                                          Times(g,
                                              Subtract(
                                                  Subtract(Times(Sqr(b), Sqr(e), Plus(p, m, C1)),
                                                      Times(C2, Sqr(c), Sqr(d),
                                                          Plus(C1, Times(C2, p)))),
                                                  Times(c, e,
                                                      Plus(Times(b, d, Subtract(m, Times(C2, p))),
                                                          Times(C2, a, e,
                                                              Plus(m, Times(C2, p), C1))))))),
                                          x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      GtQ(p, C0), Or(IntegerQ(p), Not(RationalQ(m)), And(GeQ(m, CN1), LtQ(m, C0))),
                      Not(ILtQ(Plus(m, Times(C2, p)), C0)), Or(IntegerQ(m), IntegerQ(p),
                          IntegersQ(Times(C2, m), Times(C2, p)))))),
          IIntegrate(815,
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
                      Simp(
                          Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                              Plus(Times(c, e, f, Plus(m, Times(C2, p), C2)), Times(CN1, g, c, d,
                                  Plus(Times(C2, p), C1)),
                                  Times(g, c, e, Plus(m, Times(C2, p), C1), x)),
                              Power(Plus(a, Times(c, Sqr(x))), p),
                              Power(
                                  Times(c, Sqr(e), Plus(m, Times(C2, p), C1),
                                      Plus(m, Times(C2, p), C2)),
                                  CN1)),
                          x),
                      Dist(
                          Times(C2, p,
                              Power(
                                  Times(
                                      c, Sqr(e), Plus(m, Times(C2, p), C1), Plus(m, Times(C2, p),
                                          C2)),
                                  CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C1)),
                              Simp(Subtract(
                                  Plus(Times(f, a, c, Sqr(e), Plus(m, Times(C2, p), C2)),
                                      Times(a, c, d, e, g, m)),
                                  Times(
                                      Subtract(Times(Sqr(c), f, d, e, Plus(m, Times(C2, p), C2)),
                                          Times(g,
                                              Plus(Times(Sqr(c), Sqr(d), Plus(Times(C2, p), C1)),
                                                  Times(a, c, Sqr(e), Plus(m, Times(C2, p), C1))))),
                                      x)),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g, m), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), GtQ(p, C0),
                      Or(IntegerQ(p), Not(RationalQ(m)), And(GeQ(m, CN1), LtQ(m,
                          C0))),
                      Not(ILtQ(Plus(m, Times(C2, p)), C0)), Or(IntegerQ(m), IntegerQ(p),
                          IntegersQ(Times(C2, m), Times(C2, p)))))),
          IIntegrate(816,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT, x_)), m_), Plus(f_, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                          ExpandIntegrand(Times(Power(Plus(d, Times(e, x)), m),
                              Plus(f, Times(g, x))), x)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      ILtQ(p, CN1), IGtQ(m, C0), RationalQ(a, b, c, d, e, f, g)))),
          IIntegrate(817,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_), Plus(f_, Times(g_DEFAULT,
                      x_)), Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Plus(a, Times(c, Sqr(x))), p),
                          ExpandIntegrand(Times(Power(Plus(d, Times(e, x)), m),
                              Plus(f, Times(g, x))), x)),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g), x),
                      NeQ(Plus(Times(c, Sqr(d)),
                          Times(a, Sqr(e))), C0),
                      ILtQ(p, CN1), IGtQ(m, C0), RationalQ(a, c, d, e, f, g)))),
          IIntegrate(818,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT,
                          x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(Simp(
                          Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              Subtract(
                                  Subtract(Times(C2, a, c, Plus(Times(e, f), Times(d, g))),
                                      Times(b, Plus(Times(c, d, f), Times(a, e, g)))),
                                  Times(Subtract(Plus(Times(C2, Sqr(c), d, f), Times(Sqr(b), e, g)),
                                      Times(c,
                                          Plus(Times(b, e, f), Times(b, d, g),
                                              Times(C2, a, e, g)))),
                                      x)),
                              Power(Times(c, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          x)),
                      Dist(
                          Power(Times(c, Plus(p, C1), Subtract(Sqr(b),
                              Times(C4, a, c))),
                              CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                                  Power(Plus(a, Times(b, x), Times(c,
                                      Sqr(x))), Plus(p,
                                          C1)),
                                  Simp(
                                      Plus(
                                          Times(C2, Sqr(c), Sqr(d), f, Plus(Times(C2, p),
                                              C3)),
                                          Times(b, e, g,
                                              Plus(
                                                  Times(a, e, Subtract(m, C1)), Times(b, d,
                                                      Plus(p, C2)))),
                                          Times(CN1, c, Plus(
                                              Times(C2, a, e,
                                                  Plus(Times(e, f, Subtract(m, C1)),
                                                      Times(d, g, m))),
                                              Times(b, d,
                                                  Subtract(Times(d, g, Plus(Times(C2, p), C3)),
                                                      Times(e, f,
                                                          Subtract(Subtract(m, Times(C2, p)),
                                                              C4)))))),
                                          Times(e, Subtract(
                                              Plus(Times(Sqr(b), e, g, Plus(m, p, C1)), Times(C2,
                                                  Sqr(c), d, f, Plus(m, Times(C2, p), C2))),
                                              Times(c,
                                                  Plus(Times(C2, a, e, g, m),
                                                      Times(b, Plus(Times(e, f), Times(d, g)),
                                                          Plus(m, Times(C2, p), C2))))),
                                              x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      LtQ(p, CN1), GtQ(m, C1), Or(
                          And(EqQ(m, C2), EqQ(p, CN3), RationalQ(a, b, c, d, e, f,
                              g)),
                          Not(ILtQ(Plus(m, Times(C2, p), C3), C0)))))),
          IIntegrate(819,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)), Power(
                          Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Subtract(
                                  Times(a, Plus(Times(e, f), Times(d, g))), Times(Subtract(Times(c,
                                      d, f), Times(a, e, g)), x)),
                              Power(Times(C2, a, c, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(C2, a, c,
                              Plus(p, C1)), CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                                  Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)), Simp(
                                      Plus(
                                          Times(a, e,
                                              Plus(Times(e, f, Subtract(m, C1)), Times(d, g, m))),
                                          Times(CN1, c, Sqr(d), f, Plus(Times(C2, p), C3)),
                                          Times(e,
                                              Subtract(Times(a, e, g, m),
                                                  Times(c, d, f, Plus(m, Times(C2, p), C2))),
                                              x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, g), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), LtQ(p, CN1), GtQ(m, C1),
                      Or(EqQ(d, C0), And(EqQ(m, C2), EqQ(p, CN3), RationalQ(a, c, d, e, f, g)),
                          Not(ILtQ(Plus(m, Times(C2, p), C3), C0)))))),
          IIntegrate(820,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(Power(Plus(
                      d, Times(e, x)),
                      m), Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                      Plus(
                          Times(f, b), Times(CN1, C2, a, g), Times(Subtract(Times(C2, c, f),
                              Times(b, g)),
                              x)),
                      Power(Times(Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)), x), Dist(
                          Power(Times(Plus(p, C1), Subtract(Sqr(b), Times(C4, a,
                              c))), CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p,
                                      C1)),
                                  Simp(Subtract(
                                      Subtract(
                                          Times(g,
                                              Plus(Times(C2, a, e, m),
                                                  Times(b, d, Plus(Times(C2, p), C3)))),
                                          Times(f,
                                              Plus(Times(b, e, m),
                                                  Times(C2, c, d, Plus(Times(C2, p), C3))))),
                                      Times(e, Subtract(Times(C2, c, f), Times(b, g)),
                                          Plus(m, Times(C2, p), C3), x)),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      LtQ(p, CN1), GtQ(m, C0),
                      Or(IntegerQ(m), IntegerQ(p), IntegersQ(Times(C2, m), Times(C2, p)))))));
}
