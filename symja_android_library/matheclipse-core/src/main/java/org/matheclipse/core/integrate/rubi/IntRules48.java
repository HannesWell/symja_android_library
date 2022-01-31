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
class IntRules48 {
  public static IAST RULES =
      List(
          IIntegrate(961,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)), n),
                              Power(Plus(a, Times(c, Sqr(x))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                      NeQ(Plus(Times(c, Sqr(
                          d)), Times(a,
                              Sqr(e))),
                          C0),
                      Or(IntegerQ(p), And(ILtQ(m, C0), ILtQ(n, C0))), Not(
                          Or(IGtQ(m, C0), IGtQ(n, C0)))))),
          IIntegrate(962,
              Integrate(
                  Times(Power(Times(g_DEFAULT, x_), n_DEFAULT),
                      Power(Plus(d_,
                          Times(e_DEFAULT, x_)), m_),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(Times(g, x), n), Power(Power(x, n), CN1)),
                      Integrate(
                          ExpandIntegrand(Times(Power(x, n), Power(Plus(a, Times(c, Sqr(x))), p)),
                              Power(
                                  Subtract(
                                      Times(d, Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                                      Times(e, x,
                                          Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1))),
                                  Negate(m)),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, g, n, p), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), ILtQ(m, C0),
                      Not(IntegerQ(p)), Not(IntegerQ(n))))),
          IIntegrate(963, Integrate(
              Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
              Condition(
                  Unintegrable(Times(Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)), n),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)), x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      Not(Or(IGtQ(m, C0), IGtQ(n, C0)))))),
          IIntegrate(964,
              Integrate(
                  Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), n_),
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)),
                              n),
                          Power(Plus(a, Times(c, Sqr(x))), p)),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g, m, n, p), x),
                      Not(Or(IGtQ(m, C0), IGtQ(n, C0)))))),
          IIntegrate(965,
              Integrate(
                  Times(
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                          u_)), m_DEFAULT),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, u_)), n_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, u_), Times(c_DEFAULT, Sqr(u_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Coefficient(u, x,
                          C1), CN1),
                      Subst(
                          Integrate(
                              Times(Power(
                                  Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)), n),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                              x),
                          x, u),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x), LinearQ(u, x), NeQ(u, x)))),
          IIntegrate(966,
              Integrate(Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, u_)), m_DEFAULT),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, u_)), n_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(u_))), p_DEFAULT)), x_Symbol),
              Condition(
                  Dist(Power(Coefficient(u, x, C1), CN1),
                      Subst(Integrate(Times(Power(Plus(d, Times(e, x)), m),
                          Power(Plus(f, Times(g, x)), n), Power(Plus(a, Times(c, Sqr(x))), p)), x),
                          x, u),
                      x),
                  And(FreeQ(List(a, c, d, e, f, g, m, n, p), x), LinearQ(u, x), NeQ(u, x)))),
          IIntegrate(967,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(Times(c, Power(f, CN1)), p),
                      Integrate(Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(p, q)), x), x),
                  And(FreeQ(List(a, b, c, d, e, f, p, q), x),
                      EqQ(Subtract(Times(c, d), Times(a, f)), C0),
                      EqQ(Subtract(Times(b, d), Times(a, e)), C0),
                      Or(IntegerQ(p), GtQ(Times(c, Power(f, CN1)), C0)),
                      Or(Not(IntegerQ(q)),
                          LessEqual(LeafCount(Plus(d, Times(e, x), Times(f, Sqr(x)))),
                              LeafCount(Plus(a, Times(b, x), Times(c, Sqr(x))))))))),
          IIntegrate(968,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, x_),
                          Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(a, IntPart(p)),
                          Power(Plus(a, Times(b, x), Times(c,
                              Sqr(x))), FracPart(
                                  p)),
                          Power(
                              Times(
                                  Power(d, IntPart(p)), Power(Plus(d, Times(e, x),
                                      Times(f, Sqr(x))), FracPart(p))),
                              CN1)),
                      Integrate(Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(p, q)), x), x),
                  And(FreeQ(List(a, b, c, d, e, f, p, q), x),
                      EqQ(Subtract(Times(c, d), Times(a, f)), C0),
                      EqQ(Subtract(Times(b, d), Times(a, e)), C0), Not(IntegerQ(p)), Not(IntegerQ(
                          q)),
                      Not(GtQ(Times(c, Power(f, CN1)), C0))))),
          IIntegrate(969,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, x_),
                          Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), FracPart(p)),
                          Power(
                              Times(Power(Times(C4, c), IntPart(p)),
                                  Power(Plus(b, Times(C2, c, x)), Times(C2, FracPart(p)))),
                              CN1)),
                      Integrate(
                          Times(Power(Plus(b, Times(C2, c, x)), Times(C2, p)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, p, q), x),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
          IIntegrate(970,
              Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
                  Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), q_DEFAULT)), x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), FracPart(p)),
                          Power(Times(Power(Times(C4, c), IntPart(p)),
                              Power(Plus(b, Times(C2, c, x)), Times(C2, FracPart(p)))), CN1)),
                      Integrate(Times(Power(Plus(b, Times(C2, c, x)), Times(C2, p)),
                          Power(Plus(d, Times(f, Sqr(x))), q)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, f, p, q), x),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
          IIntegrate(971,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Plus(b, Times(C2, c, x)),
                              Power(Plus(a, Times(b, x), Times(c,
                                  Sqr(x))), Plus(p,
                                      C1)),
                              Power(Plus(d, Times(e, x), Times(f,
                                  Sqr(x))), q),
                              Power(Times(Subtract(Sqr(b), Times(C4, a, c)), Plus(p, C1)), CN1)),
                          x),
                      Dist(Power(Times(Subtract(Sqr(b), Times(C4, a, c)), Plus(p,
                          C1)), CN1), Integrate(Times(
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)), Power(
                                  Plus(d, Times(e, x), Times(f, Sqr(x))), Subtract(q, C1)),
                              Simp(
                                  Plus(Times(C2, c, d, Plus(Times(C2, p), C3)), Times(b, e, q),
                                      Times(Plus(Times(C2, b, f, q),
                                          Times(C2, c, e, Plus(Times(C2, p), q, C3))), x),
                                      Times(C2, c, f, Plus(Times(C2, p), Times(C2, q), C3),
                                          Sqr(x))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Sqr(e),
                          Times(C4, d, f)), C0),
                      LtQ(p, CN1), GtQ(q, C0), Not(IGtQ(q, C0))))),
          IIntegrate(972,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT,
                          Sqr(x_))), p_),
                      Power(Plus(d_DEFAULT, Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(Subtract(
                  Simp(Times(Plus(b, Times(C2, c, x)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                      Power(Plus(d, Times(f, Sqr(x))), q),
                      Power(Times(Subtract(Sqr(b), Times(C4, a, c)), Plus(p, C1)), CN1)), x),
                  Dist(Power(Times(Subtract(Sqr(b), Times(C4, a, c)), Plus(p, C1)), CN1),
                      Integrate(Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Plus(d, Times(f, Sqr(x))), Subtract(q, C1)),
                          Simp(
                              Plus(Times(C2, c, d, Plus(Times(C2, p), C3)), Times(C2, b, f, q, x),
                                  Times(C2, c, f, Plus(Times(C2, p), Times(C2, q), C3), Sqr(x))),
                              x)),
                          x),
                      x)),
                  And(FreeQ(List(a, b, c, d, f), x), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), LtQ(p,
                          CN1),
                      GtQ(q, C0), Not(IGtQ(q, C0))))),
          IIntegrate(973,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(Times(C2, c, x, Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                      Power(Plus(d, Times(e, x), Times(f, Sqr(x))),
                          q),
                      Power(Times(CN4, a, c, Plus(p, C1)), CN1)), x), Dist(
                          Power(Times(CN4, a, c, Plus(p, C1)), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                                  Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Subtract(q, C1)),
                                  Simp(
                                      Plus(Times(C2, c, d, Plus(Times(C2, p), C3)),
                                          Times(C2, c, e, Plus(Times(C2, p), q, C3), x),
                                          Times(C2, c, f, Plus(Times(C2, p), Times(C2, q), C3),
                                              Sqr(x))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0),
                      LtQ(p, CN1), GtQ(q, C0), Not(IGtQ(q, C0))))),
          IIntegrate(974,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(
                          Plus(Times(C2, a, Sqr(c), e), Times(CN1, Sqr(b), c,
                              e), Times(Power(b, C3), f),
                              Times(b, c, Subtract(Times(c, d), Times(C3, a, f))), Times(c,
                                  Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)), Times(c,
                                      Plus(Times(b, e), Times(C2, a, f)))),
                                  x)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                          Power(
                              Times(Subtract(Sqr(b),
                                  Times(C4, a, c)),
                                  Subtract(Sqr(Subtract(Times(c, d), Times(a, f))),
                                      Times(Subtract(Times(b, d),
                                          Times(a, e)), Subtract(Times(c, e), Times(b, f)))),
                                  Plus(p, C1)),
                              CN1)),
                          x),
                      Dist(
                          Power(
                              Times(Subtract(Sqr(b), Times(C4, a, c)),
                                  Subtract(
                                      Sqr(Subtract(Times(c, d), Times(a, f))),
                                      Times(
                                          Subtract(Times(b, d), Times(a, e)),
                                          Subtract(Times(c, e), Times(b, f)))),
                                  Plus(p, C1)),
                              CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                                  Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q), Simp(Plus(
                                      Times(C2, c, Subtract(Sqr(Subtract(Times(c, d), Times(a, f))),
                                          Times(Subtract(Times(b, d), Times(a, e)), Subtract(
                                              Times(c, e), Times(b, f)))),
                                          Plus(p, C1)),
                                      Times(CN1,
                                          Subtract(
                                              Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)), Times(c,
                                                  Plus(Times(b, e), Times(C2, a, f)))),
                                          Subtract(Times(a, f, Plus(p, C1)),
                                              Times(c, d, Plus(p, C2)))),
                                      Times(CN1, e,
                                          Subtract(
                                              Subtract(Subtract(Times(Sqr(b), c, e), Times(C2, a,
                                                  Sqr(c), e)), Times(Power(b, C3), f)),
                                              Times(b, c, Subtract(Times(c, d), Times(C3, a, f)))),
                                          Plus(p, q, C2)),
                                      Times(
                                          Subtract(
                                              Times(C2, f, Plus(Times(C2, a, Sqr(c), e),
                                                  Times(CN1, Sqr(b), c, e), Times(Power(b, C3), f),
                                                  Times(b, c,
                                                      Subtract(Times(c, d), Times(C3, a, f)))),
                                                  Plus(p, q, C2)),
                                              Times(
                                                  Subtract(
                                                      Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                                      Times(c, Plus(Times(b, e), Times(C2, a, f)))),
                                                  Subtract(Times(b, f, Plus(p, C1)),
                                                      Times(c, e, Plus(Times(C2, p), q, C4))))),
                                          x),
                                      Times(c, f,
                                          Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                              Times(c, Plus(Times(b, e), Times(C2, a, f)))),
                                          Plus(Times(C2, p), Times(C2, q), C5), Sqr(x))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, q), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Sqr(e),
                          Times(C4, d, f)), C0),
                      LtQ(p, CN1), NeQ(
                          Subtract(Sqr(Subtract(Times(c, d), Times(a, f))),
                              Times(
                                  Subtract(Times(b, d), Times(a, e)), Subtract(Times(c, e),
                                      Times(b, f)))),
                          C0),
                      Not(And(Not(IntegerQ(p)), ILtQ(q, CN1))), Not(IGtQ(q, C0))))),
          IIntegrate(975,
              Integrate(
                  Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                      Times(c_DEFAULT, Sqr(x_))), p_), Power(
                          Plus(d_DEFAULT, Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Plus(Times(Power(b, C3), f),
                                  Times(b, c, Subtract(Times(c, d), Times(C3, a, f))),
                                  Times(c, Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                      Times(c, C2, a, f)), x)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Plus(d, Times(f, Sqr(
                                  x))), Plus(q,
                                      C1)),
                              Power(
                                  Times(Subtract(Sqr(b), Times(C4, a, c)),
                                      Plus(Times(Sqr(b), d, f),
                                          Sqr(Subtract(Times(c, d), Times(a, f)))),
                                      Plus(p, C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(Subtract(Sqr(b), Times(C4, a, c)),
                                  Plus(Times(Sqr(
                                      b), d, f), Sqr(Subtract(Times(c, d), Times(a, f)))),
                                  Plus(p, C1)),
                              CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                                  Power(Plus(d, Times(f, Sqr(x))), q), Simp(
                                      Plus(
                                          Times(C2, c,
                                              Plus(Times(Sqr(b), d, f), Sqr(Subtract(Times(c, d),
                                                  Times(a, f)))),
                                              Plus(p, C1)),
                                          Times(CN1,
                                              Subtract(
                                                  Plus(Times(C2, Sqr(c), d), Times(Sqr(b),
                                                      f)),
                                                  Times(c, C2, a, f)),
                                              Subtract(
                                                  Times(a, f, Plus(p, C1)),
                                                  Times(c, d, Plus(p, C2)))),
                                          Times(
                                              Subtract(
                                                  Times(
                                                      C2, f,
                                                      Plus(
                                                          Times(Power(b, C3), f),
                                                          Times(b, c,
                                                              Subtract(Times(c, d),
                                                                  Times(C3, a, f)))),
                                                      Plus(p, q, C2)),
                                                  Times(Subtract(
                                                      Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                                      Times(c, C2, a, f)), b, f, Plus(p, C1))),
                                              x),
                                          Times(c, f,
                                              Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                                  Times(c, C2, a, f)),
                                              Plus(Times(C2, p), Times(C2, q), C5), Sqr(x))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, f, q), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      LtQ(p, CN1),
                      NeQ(Plus(Times(Sqr(
                          b), d, f), Sqr(
                              Subtract(Times(c, d), Times(a, f)))),
                          C0),
                      Not(And(Not(IntegerQ(p)), ILtQ(q, CN1))), Not(IGtQ(q, C0))))),
          IIntegrate(976,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Plus(
                                  Times(C2, a, Sqr(
                                      c), e),
                                  Times(c, Subtract(Times(C2, Sqr(c), d), Times(c, C2, a, f)), x)),
                              Power(Plus(
                                  a, Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Plus(d, Times(e, x),
                                  Times(f, Sqr(x))), Plus(q, C1)),
                              Power(
                                  Times(CN4, a, c,
                                      Plus(Times(a, c, Sqr(e)),
                                          Sqr(Subtract(Times(c, d), Times(a, f)))),
                                      Plus(p, C1)),
                                  CN1)),
                          x),
                      Dist(Power(Times(CN4, a, c,
                          Plus(Times(a, c, Sqr(e)), Sqr(Subtract(Times(c, d), Times(a, f)))), Plus(
                              p, C1)),
                          CN1),
                          Integrate(Times(Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q),
                              Simp(Plus(
                                  Times(C2, c,
                                      Subtract(Sqr(Subtract(Times(c, d), Times(a, f))),
                                          Times(CN1, a, e, c, e)),
                                      Plus(p, C1)),
                                  Times(CN1, Subtract(Times(C2, Sqr(c), d), Times(c, C2, a, f)),
                                      Subtract(Times(a, f, Plus(p, C1)), Times(c, d, Plus(p, C2)))),
                                  Times(CN1, e, CN2, a, Sqr(c), e, Plus(p, q, C2)),
                                  Times(Subtract(Times(C2, f, C2, a, Sqr(c), e, Plus(p, q, C2)),
                                      Times(Subtract(Times(C2, Sqr(c), d), Times(c, C2, a, f)), CN1,
                                          c, e, Plus(Times(C2, p), q, C4))),
                                      x),
                                  Times(c, f, Subtract(Times(C2, Sqr(c), d), Times(c, C2, a, f)),
                                      Plus(Times(C2, p), Times(C2, q), C5), Sqr(x))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, q), x), NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0),
                      LtQ(p, CN1),
                      NeQ(Plus(Times(a, c, Sqr(e)), Sqr(Subtract(Times(c, d), Times(a, f)))), C0),
                      Not(And(Not(IntegerQ(p)), ILtQ(q, CN1))), Not(IGtQ(q, C0))))),
          IIntegrate(977,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                          Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Plus(Times(b, f, Plus(Times(C3, p), Times(C2, q))),
                          Times(CN1, c, e, Plus(Times(C2, p), q)), Times(C2, c, f, Plus(p, q), x)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                          Power(Times(C2, Sqr(f), Plus(p, q), Plus(Times(C2, p), Times(C2, q), C1)),
                              CN1)),
                          x),
                      Dist(
                          Power(Times(C2, Sqr(f), Plus(p, q), Plus(Times(C2, p), Times(C2, q), C1)),
                              CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C2)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q), Simp(Plus(
                                  Times(Subtract(Times(b, d), Times(a, e)), Subtract(Times(c, e),
                                      Times(b, f)), Subtract(C1, p), Plus(Times(C2, p), q)),
                                  Times(CN1, Plus(p, q),
                                      Subtract(Times(Sqr(b), d, f, Subtract(C1, p)), Times(a, Plus(
                                          Times(f, Subtract(Times(b, e), Times(C2, a, f)),
                                              Plus(Times(C2, p), Times(C2, q), C1)),
                                          Times(c,
                                              Subtract(Times(C2, d, f),
                                                  Times(Sqr(e), Plus(Times(C2, p), q)))))))),
                                  Times(
                                      Subtract(
                                          Times(C2, Subtract(Times(c, d), Times(a, f)),
                                              Subtract(Times(c, e), Times(b,
                                                  f)),
                                              Subtract(C1, p), Plus(Times(C2, p), q)),
                                          Times(Plus(p, q),
                                              Plus(
                                                  Times(
                                                      Subtract(Sqr(b), Times(C4, a,
                                                          c)),
                                                      e, f, Subtract(C1, p)),
                                                  Times(b, Plus(
                                                      Times(c, Subtract(Sqr(e), Times(C4, d, f)),
                                                          Plus(Times(C2, p), q)),
                                                      Times(f,
                                                          Plus(Times(C2, c, d), Times(CN1, b, e),
                                                              Times(C2, a, f)),
                                                          Plus(Times(C2, p), Times(C2, q),
                                                              C1))))))),
                                      x),
                                  Times(
                                      Plus(Times(
                                          Sqr(Subtract(Times(c, e), Times(b, f))), Subtract(C1, p),
                                          p),
                                          Times(c, Plus(p, q), Subtract(
                                              Times(f, Subtract(Times(b, e), Times(C2, a, f)),
                                                  Subtract(Plus(Times(C4, p), Times(C2, q)), C1)),
                                              Times(c,
                                                  Plus(Times(C2, d, f, Subtract(C1, Times(C2, p))),
                                                      Times(Sqr(e),
                                                          Subtract(Plus(Times(C3, p), q), C1))))))),
                                      Sqr(x))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, q), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0), GtQ(p, C1), NeQ(Plus(p, q), C0),
                      NeQ(Plus(Times(C2, p), Times(C2, q), C1), C0), Not(IGtQ(p,
                          C0)),
                      Not(IGtQ(q, C0))))),
          IIntegrate(978,
              Integrate(
                  Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                      Times(c_DEFAULT, Sqr(x_))), p_), Power(
                          Plus(d_DEFAULT, Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Plus(Times(b, Plus(Times(C3, p), Times(C2, q))),
                                  Times(C2, c, Plus(p, q), x)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                              Power(Plus(d, Times(f,
                                  Sqr(x))), Plus(q,
                                      C1)),
                              Power(Times(C2, f, Plus(p, q), Plus(Times(C2, p), Times(C2, q), C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(Times(C2, f, Plus(p, q),
                              Plus(Times(C2, p), Times(C2, q), C1)), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C2)),
                                  Power(Plus(d,
                                      Times(f, Sqr(x))), q),
                                  Simp(Plus(
                                      Times(Sqr(b), d, Subtract(p, C1), Plus(Times(C2, p), q)),
                                      Times(CN1, Plus(p, q),
                                          Subtract(Times(Sqr(b), d, Subtract(C1, p)),
                                              Times(C2, a,
                                                  Subtract(Times(c, d),
                                                      Times(a, f,
                                                          Plus(Times(C2, p), Times(C2, q), C1)))))),
                                      Times(
                                          CN1, Subtract(
                                              Times(C2, b, Subtract(Times(c, d), Times(a, f)),
                                                  Subtract(C1, p), Plus(Times(C2, p), q)),
                                              Times(C2, Plus(p, q), b,
                                                  Subtract(Times(C2, c, d,
                                                      Plus(Times(C2, p), q)),
                                                      Times(
                                                          Plus(Times(c, d), Times(a, f)),
                                                          Plus(Times(C2, p), Times(C2, q), C1))))),
                                          x),
                                      Times(Plus(Times(Sqr(b), f, p, Subtract(C1, p)),
                                          Times(C2, c, Plus(p, q),
                                              Subtract(Times(c, d, Subtract(Times(C2, p), C1)),
                                                  Times(a, f,
                                                      Subtract(Plus(Times(C4, p), Times(C2, q)),
                                                          C1))))),
                                          Sqr(x))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, f, q), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      GtQ(p, C1), NeQ(Plus(p, q), C0), NeQ(Plus(Times(C2, p), Times(C2, q), C1),
                          C0),
                      Not(IGtQ(p, C0)), Not(IGtQ(q, C0))))),
          IIntegrate(979,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(c,
                                  Subtract(Times(e, Plus(Times(C2,
                                      p), q)), Times(C2, f, Plus(p,
                                          q), x)),
                                  Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C1)),
                                  Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                                  Power(Times(C2, Sqr(f), Plus(p, q),
                                      Plus(Times(C2, p), Times(C2, q), C1)), CN1)),
                              x)),
                      Dist(Power(Times(C2, Sqr(f), Plus(p, q), Plus(Times(C2, p), Times(C2, q),
                          C1)), CN1), Integrate(Times(
                              Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C2)), Power(Plus(d,
                                  Times(e, x), Times(f, Sqr(x))), q),
                              Simp(Plus(
                                  Times(CN1, a, c, Sqr(e), Subtract(C1, p), Plus(Times(C2, p),
                                      q)),
                                  Times(a, Plus(p, q), Plus(Times(CN2, a, Sqr(f), Plus(Times(C2, p),
                                      Times(C2, q), C1)), Times(c,
                                          Subtract(Times(C2, d, f), Times(Sqr(e),
                                              Plus(Times(C2, p), q)))))),
                                  Times(Plus(
                                      Times(C2, Subtract(Times(c, d), Times(a, f)), c, e,
                                          Subtract(C1, p), Plus(Times(C2, p), q)),
                                      Times(C4, a, c, e, f, Subtract(C1, p), Plus(p, q))), x),
                                  Times(
                                      Subtract(Times(p, Sqr(c), Sqr(e), Subtract(C1, p)),
                                          Times(c, Plus(p, q), Plus(
                                              Times(C2, a, Sqr(f),
                                                  Subtract(Plus(Times(C4, p), Times(C2, q)), C1)),
                                              Times(c,
                                                  Plus(Times(C2, d, f, Subtract(C1, Times(C2, p))),
                                                      Times(Sqr(e),
                                                          Subtract(Plus(Times(C3, p), q), C1))))))),
                                      Sqr(x))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, q), x), NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0),
                      GtQ(p, C1), NeQ(Plus(p, q), C0),
                      NeQ(Plus(Times(C2, p), Times(C2, q), C1),
                          C0),
                      Not(IGtQ(p, C0)), Not(IGtQ(q, C0))))),
          IIntegrate(980,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT,
                          Sqr(x_))), CN1),
                      Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(q,
                      Plus(Times(Sqr(c), Sqr(d)), Times(CN1, b, c, d, e), Times(a, c, Sqr(e)),
                          Times(Sqr(b), d, f), Times(CN1, C2, a, c, d, f), Times(CN1, a, b, e,
                              f),
                          Times(Sqr(a), Sqr(f))))),
                      Condition(
                          Plus(
                              Dist(Power(q, CN1),
                                  Integrate(
                                      Times(
                                          Subtract(
                                              Subtract(Plus(Times(Sqr(c), d), Times(CN1, b, c, e),
                                                  Times(Sqr(b), f)), Times(a, c, f)),
                                              Times(Subtract(Times(Sqr(c), e), Times(b, c, f)), x)),
                                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)),
                                      x),
                                  x),
                              Dist(Power(q, CN1),
                                  Integrate(Times(
                                      Plus(Times(c, Sqr(e)), Times(CN1, c, d, f),
                                          Times(CN1, b, e, f), Times(a, Sqr(f)),
                                          Times(Subtract(Times(c, e, f), Times(b, Sqr(f))), x)),
                                      Power(Plus(d, Times(e, x), Times(f, Sqr(x))), CN1)), x),
                                  x)),
                          NeQ(q, C0))),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0)))));
}
