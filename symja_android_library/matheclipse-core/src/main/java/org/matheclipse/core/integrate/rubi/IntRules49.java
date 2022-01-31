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
class IntRules49 {
  public static IAST RULES =
      List(
          IIntegrate(981,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(q,
                      Plus(Times(Sqr(c), Sqr(d)), Times(Sqr(b), d, f), Times(CN1, C2, a, c, d, f),
                          Times(Sqr(a), Sqr(f))))),
                      Condition(
                          Subtract(Dist(Power(q, CN1),
                              Integrate(
                                  Times(
                                      Plus(Times(Sqr(c), d), Times(Sqr(b), f), Times(CN1, a, c, f),
                                          Times(b, c, f, x)),
                                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)),
                                  x),
                              x),
                              Dist(Power(q, CN1),
                                  Integrate(
                                      Times(
                                          Plus(Times(c, d, f), Times(CN1, a, Sqr(f)),
                                              Times(b, Sqr(f), x)),
                                          Power(Plus(d, Times(f, Sqr(x))), CN1)),
                                      x),
                                  x)),
                          NeQ(q, C0))),
                  And(FreeQ(List(a, b, c, d, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(982,
              Integrate(Times(
                  Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(Times(CN2, e),
                      Subst(
                          Integrate(Power(Subtract(Times(e, Subtract(Times(b, e), Times(C4, a, f))),
                              Times(Subtract(Times(b, d), Times(a, e)), Sqr(x))), CN1), x),
                          x,
                          Times(Plus(e, Times(C2, f, x)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), CN1D2))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0),
                      EqQ(Subtract(Times(c, e), Times(b, f)), C0)))),
          IIntegrate(983,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, x_),
                          Times(c_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Subtract(
                          Dist(
                              Times(C2, c, Power(q, CN1)), Integrate(
                                  Power(Times(Plus(b, Negate(q), Times(C2, c, x)),
                                      Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))), CN1),
                                  x),
                              x),
                          Dist(
                              Times(C2, c, Power(q,
                                  CN1)),
                              Integrate(
                                  Power(
                                      Times(Plus(b, q, Times(C2, c, x)), Sqrt(Plus(d, Times(e, x),
                                          Times(f, Sqr(x))))),
                                      CN1),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Sqr(e), Times(C4, d,
                          f)), C0),
                      NeQ(Subtract(Times(c, e),
                          Times(b, f)), C0),
                      PosQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(984,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(c_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(C1D2,
                          Integrate(Power(Times(Subtract(a, Times(Rt(Times(CN1, a, c), C2), x)),
                              Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))), CN1), x),
                          x),
                      Dist(C1D2,
                          Integrate(Power(Times(Plus(a, Times(Rt(Times(CN1, a, c), C2), x)),
                              Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))), CN1), x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0),
                      PosQ(Times(CN1, a, c))))),
          IIntegrate(985,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Subtract(Dist(Times(C2, c, Power(q, CN1)),
                          Integrate(Power(Times(Plus(b, Negate(q), Times(C2, c, x)),
                              Sqrt(Plus(d, Times(f, Sqr(x))))), CN1), x),
                          x),
                          Dist(Times(C2, c, Power(q, CN1)),
                              Integrate(Power(Times(Plus(b, q, Times(C2, c, x)),
                                  Sqrt(Plus(d, Times(f, Sqr(x))))), CN1), x),
                              x))),
                  And(FreeQ(List(a, b, c, d, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      PosQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(986,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_),
                          Times(c_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(q,
                              Rt(Subtract(Sqr(Subtract(Times(c, d), Times(a, f))),
                                  Times(Subtract(Times(b, d), Times(a, e)),
                                      Subtract(Times(c, e), Times(b, f)))),
                                  C2))),
                      Subtract(
                          Dist(
                              Power(Times(C2,
                                  q), CN1),
                              Integrate(
                                  Times(
                                      Plus(
                                          Times(c, d), Times(CN1, a, f), q, Times(
                                              Subtract(Times(c, e), Times(b, f)), x)),
                                      Power(Times(Plus(a, Times(b, x), Times(c, Sqr(x))), Sqrt(Plus(
                                          d, Times(e, x), Times(f, Sqr(x))))), CN1)),
                                  x),
                              x),
                          Dist(Power(Times(C2, q), CN1),
                              Integrate(Times(
                                  Plus(Times(c, d), Times(CN1, a, f), Negate(q),
                                      Times(Subtract(Times(c, e), Times(b, f)), x)),
                                  Power(Times(Plus(a, Times(b, x), Times(c, Sqr(x))),
                                      Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Sqr(e), Times(C4, d,
                          f)), C0),
                      NeQ(Subtract(Times(c, e),
                          Times(b, f)), C0),
                      NegQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(987,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(c_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(q,
                              Rt(Plus(Sqr(Subtract(Times(c, d), Times(a, f))), Times(a, c, Sqr(e))),
                                  C2))),
                      Subtract(
                          Dist(
                              Power(Times(C2,
                                  q), CN1),
                              Integrate(
                                  Times(Plus(Times(c, d), Times(CN1, a, f), q, Times(c, e, x)),
                                      Power(
                                          Times(Plus(a, Times(c, Sqr(x))), Sqrt(Plus(d, Times(e, x),
                                              Times(f, Sqr(x))))),
                                          CN1)),
                                  x),
                              x),
                          Dist(
                              Power(Times(C2, q), CN1),
                              Integrate(Times(
                                  Plus(Times(c, d), Times(CN1, a, f), Negate(q), Times(c, e, x)),
                                  Power(Times(Plus(a, Times(c, Sqr(x))),
                                      Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, c, d, e, f), x), NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0),
                      NegQ(Times(CN1, a, c))))),
          IIntegrate(988,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT,
                          Sqr(x_))), CN1),
                      Power(Plus(d_DEFAULT, Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(q,
                              Rt(Plus(Sqr(Subtract(Times(c, d),
                                  Times(a, f))), Times(Sqr(b), d,
                                      f)),
                                  C2))),
                      Subtract(
                          Dist(
                              Power(Times(C2,
                                  q), CN1),
                              Integrate(
                                  Times(
                                      Plus(Times(c, d), Times(CN1, a, f), q, Times(CN1, b, f,
                                          x)),
                                      Power(
                                          Times(
                                              Plus(a, Times(b, x), Times(c, Sqr(x))), Sqrt(
                                                  Plus(d, Times(f, Sqr(x))))),
                                          CN1)),
                                  x),
                              x),
                          Dist(Power(Times(C2, q), CN1), Integrate(Times(
                              Plus(Times(c, d), Times(CN1, a, f), Negate(q), Times(CN1, b, f, x)),
                              Power(Times(Plus(a, Times(b, x), Times(c, Sqr(x))),
                                  Sqrt(Plus(d, Times(f, Sqr(x))))), CN1)),
                              x), x))),
                  And(FreeQ(List(a, b, c, d,
                      f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      NegQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(989,
              Integrate(
                  Times(
                      Sqrt(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_)))),
                      Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(c, Power(f, CN1)), Integrate(
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1D2), x),
                          x),
                      Dist(Power(f, CN1),
                          Integrate(
                              Times(
                                  Plus(Times(c, d), Times(CN1, a,
                                      f), Times(Subtract(Times(c, e), Times(b, f)), x)),
                                  Power(
                                      Times(Sqrt(Plus(a, Times(b, x), Times(c, Sqr(x)))), Plus(d,
                                          Times(e, x), Times(f, Sqr(x)))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), NeQ(Subtract(Sqr(e), Times(C4, d, f)),
                          C0)))),
          IIntegrate(990,
              Integrate(
                  Times(
                      Sqrt(Plus(a_, Times(b_DEFAULT, x_),
                          Times(c_DEFAULT, Sqr(x_)))),
                      Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(c, Power(f, CN1)), Integrate(
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1D2), x),
                          x),
                      Dist(Power(f, CN1),
                          Integrate(
                              Times(
                                  Subtract(Subtract(Times(c, d), Times(a, f)), Times(b, f,
                                      x)),
                                  Power(
                                      Times(
                                          Sqrt(Plus(a, Times(b, x), Times(c, Sqr(x)))), Plus(d,
                                              Times(f, Sqr(x)))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(991,
              Integrate(
                  Times(Sqrt(Plus(a_, Times(c_DEFAULT, Sqr(x_)))), Power(Plus(d_,
                      Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(c, Power(f, CN1)), Integrate(
                              Power(Plus(a, Times(c, Sqr(x))), CN1D2), x),
                          x),
                      Dist(Power(f, CN1),
                          Integrate(Times(Plus(Times(c, d), Times(CN1, a, f), Times(c, e, x)),
                              Power(Times(Sqrt(Plus(a, Times(c, Sqr(x)))),
                                  Plus(d, Times(e, x), Times(f, Sqr(x)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0)))),
          IIntegrate(992,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT,
                          Sqr(x_))), CN1D2),
                      Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(r,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Dist(
                          Times(Sqrt(Plus(b, r, Times(C2, c, x))),
                              Sqrt(Plus(Times(C2, a), Times(Plus(b, r), x))),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1D2)),
                          Integrate(Power(Times(Sqrt(Plus(b, r, Times(C2, c, x))),
                              Sqrt(Plus(Times(C2, a), Times(Plus(b, r), x))),
                              Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))), CN1), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0)))),
          IIntegrate(993,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, x_),
                          Times(c_DEFAULT, Sqr(x_))), CN1D2),
                      Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(r,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Dist(
                          Times(Sqrt(Plus(b, r, Times(C2, c, x))),
                              Sqrt(Plus(Times(C2, a), Times(Plus(b, r), x))),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1D2)),
                          Integrate(Power(Times(Sqrt(Plus(b, r, Times(C2, c, x))),
                              Sqrt(Plus(Times(C2, a), Times(Plus(b, r), x))),
                              Sqrt(Plus(d, Times(f, Sqr(x))))), CN1), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, f), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(994,
              Integrate(
                  Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))),
                              p),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, p, q), x), Not(IGtQ(p, C0)), Not(IGtQ(q, C0))))),
          IIntegrate(995,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_), Power(Plus(d_DEFAULT,
                          Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))),
                          q_)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(a,
                              Times(c, Sqr(x))), p),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q)),
                      x),
                  And(FreeQ(List(a, c, d, e, f, p, q), x), Not(IGtQ(p, C0)), Not(IGtQ(q, C0))))),
          IIntegrate(996,
              Integrate(Times(
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, u_), Times(c_DEFAULT, Sqr(u_))),
                      p_DEFAULT),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, u_), Times(f_DEFAULT, Sqr(u_))),
                      q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(Coefficient(u, x, C1), CN1),
                      Subst(
                          Integrate(
                              Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                                  Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q)),
                              x),
                          x, u),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, p, q), x), LinearQ(u, x), NeQ(u, x)))),
          IIntegrate(997,
              Integrate(Times(Power(Plus(a_DEFAULT, Times(c_DEFAULT, Sqr(u_))), p_DEFAULT),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, u_), Times(f_DEFAULT, Sqr(u_))),
                      q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(Coefficient(u, x, C1), CN1),
                      Subst(Integrate(Times(Power(Plus(a, Times(c, Sqr(x))), p),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q)), x), x, u),
                      x),
                  And(FreeQ(List(a, c, d, e, f, p, q), x), LinearQ(u, x), NeQ(u, x)))),
          IIntegrate(998,
              Integrate(Times(Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), m_DEFAULT),
                  Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
                  Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)), x_Symbol),
              Condition(Dist(Power(Times(c, Power(f, CN1)), p),
                  Integrate(Times(Power(Plus(g, Times(h, x)), m),
                      Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(p, q))), x),
                  x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, p, q), x),
                      EqQ(Subtract(Times(c, d), Times(a, f)), C0),
                      EqQ(Subtract(Times(b, d), Times(a, e)), C0),
                      Or(IntegerQ(p), GtQ(Times(c, Power(f, CN1)), C0)),
                      Or(Not(IntegerQ(q)),
                          LessEqual(LeafCount(Plus(d, Times(e, x), Times(f, Sqr(x)))),
                              LeafCount(Plus(a, Times(b, x), Times(c, Sqr(x))))))))),
          IIntegrate(999,
              Integrate(Times(Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), m_DEFAULT),
                  Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_), Power(Plus(
                      d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))),
                      q_)),
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
                      Integrate(
                          Times(Power(Plus(g, Times(h, x)), m),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(p, q))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, p, q), x),
                      EqQ(Subtract(Times(c, d), Times(a, f)), C0),
                      EqQ(Subtract(Times(b, d), Times(a, e)), C0), Not(IntegerQ(p)), Not(
                          IntegerQ(q)),
                      Not(GtQ(Times(c, Power(f, CN1)), C0))))),
          IIntegrate(1000,
              Integrate(
                  Times(Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
                      Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), FracPart(p)),
                          Power(Times(Power(Times(C4, c), IntPart(p)),
                              Power(Plus(b, Times(C2, c, x)), Times(C2, FracPart(p)))), CN1)),
                      Integrate(Times(Power(Plus(g, Times(h, x)), m),
                          Power(Plus(b, Times(C2, c, x)), Times(C2, p)),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, p, q), x),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))));
}
