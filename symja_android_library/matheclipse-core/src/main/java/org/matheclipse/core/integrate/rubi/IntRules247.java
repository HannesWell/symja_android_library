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
class IntRules247 {
  public static IAST RULES =
      List(
          IIntegrate(4941,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), p_),
                      Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                          q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(b, p, Power(Times(f, x), m),
                                  Power(Plus(d, Times(e,
                                      Sqr(x))), Plus(q,
                                          C1)),
                                  Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Subtract(p,
                                      C1)),
                                  Power(Times(c, d, Sqr(m)), CN1)),
                              x)),
                      Dist(
                          Times(Sqr(f), Subtract(m, C1), Power(Times(Sqr(c), d, m),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C2)),
                                  Power(Plus(d, Times(e, Sqr(x))), Plus(q,
                                      C1)),
                                  Power(Plus(a, Times(b, ArcCot(Times(c, x)))), p)),
                              x),
                          x),
                      Negate(
                          Dist(Times(Sqr(b), p, Subtract(p, C1), Power(m, CN2)),
                              Integrate(
                                  Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), q),
                                      Power(Plus(a, Times(b, ArcCot(Times(c, x)))),
                                          Subtract(p, C2))),
                                  x),
                              x)),
                      Negate(
                          Simp(Times(f, Power(Times(f, x), Subtract(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                              Power(Plus(a, Times(b, ArcCot(Times(c, x)))),
                                  p),
                              Power(Times(Sqr(c), d, m), CN1)), x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(
                      c), d)), EqQ(Plus(m, Times(C2, q),
                          C2), C0),
                      LtQ(q, CN1), GtQ(p, C1)))),
          IIntegrate(4942,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), p_),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                              Power(Plus(a, Times(b, ArcTan(Times(c, x)))),
                                  Plus(p, C1)),
                              Power(Times(b, c, d, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(f, m, Power(Times(b, c, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C1)),
                                  Power(Plus(d, Times(e, Sqr(x))), q),
                                  Power(Plus(a, Times(b, ArcTan(Times(c, x)))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, q), x), EqQ(e, Times(Sqr(c), d)),
                      EqQ(Plus(m, Times(C2, q), C2), C0), LtQ(p, CN1)))),
          IIntegrate(4943,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), p_),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                                  Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Plus(p, C1)),
                                  Power(Times(b, c, d, Plus(p, C1)), CN1)),
                              x)),
                      Dist(
                          Times(f, m, Power(Times(b, c, Plus(p, C1)),
                              CN1)),
                          Integrate(Times(Power(Times(f, x), Subtract(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), q),
                              Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Plus(p, C1))), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, q), x), EqQ(e, Times(Sqr(c), d)),
                      EqQ(Plus(m, Times(C2, q), C2), C0), LtQ(p, CN1)))),
          IIntegrate(4944,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                              Power(Plus(a, Times(b, ArcTan(Times(c, x)))),
                                  p),
                              Power(Times(d, f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, c, p, Power(Times(f, Plus(m, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(d, Times(e, Sqr(x))), q),
                                  Power(Plus(a, Times(b, ArcTan(Times(c, x)))), Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, q), x), EqQ(e, Times(Sqr(c), d)),
                      EqQ(Plus(m, Times(C2, q), C3), C0), GtQ(p, C0), NeQ(m, CN1)))),
          IIntegrate(4945,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(Power(Times(f, x), Plus(m, C1)),
                      Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                      Power(Plus(a, Times(b, ArcCot(Times(c, x)))),
                          p),
                      Power(Times(d, f, Plus(m, C1)), CN1)), x), Dist(
                          Times(b, c, p, Power(Times(f, Plus(m, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(d, Times(e, Sqr(x))), q),
                                  Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, q), x), EqQ(e, Times(Sqr(
                      c), d)), EqQ(Plus(m, Times(C2, q),
                          C3), C0),
                      GtQ(p, C0), NeQ(m, CN1)))),
          IIntegrate(4946, Integrate(
              Times(
                  Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)), Power(
                      Times(f_DEFAULT, x_), m_),
                  Sqrt(Plus(d_, Times(e_DEFAULT, Sqr(x_))))),
              x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)), Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Plus(a, Times(b, ArcTan(Times(c, x)))), Power(Times(f, Plus(m, C2)),
                                  CN1)),
                          x),
                      Dist(Times(d, Power(Plus(m, C2), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m), Plus(a, Times(b, ArcTan(Times(c, x)))),
                                  Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                              x),
                          x),
                      Negate(
                          Dist(Times(b, c, d, Power(Times(f, Plus(m, C2)), CN1)),
                              Integrate(Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(d, Times(e, Sqr(x))), CN1D2)), x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c), d)), NeQ(m, CN2)))),
          IIntegrate(4947, Integrate(
              Times(
                  Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT)), Power(
                      Times(f_DEFAULT, x_), m_),
                  Sqrt(Plus(d_, Times(e_DEFAULT, Sqr(x_))))),
              x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Power(Times(f, x), Plus(m, C1)), Sqrt(Plus(d, Times(e, Sqr(x)))),
                          Plus(a, Times(b, ArcCot(Times(c, x)))),
                          Power(Times(f, Plus(m, C2)), CN1)), x),
                      Dist(Times(d, Power(Plus(m, C2), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m), Plus(a, Times(b, ArcCot(Times(c, x)))),
                                  Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                              x),
                          x),
                      Dist(
                          Times(b, c, d, Power(Times(f, Plus(m, C2)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c), d)), NeQ(m, CN2)))),
          IIntegrate(4948,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)), p_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                          q_)),
                  x_Symbol),
              Condition(Integrate(ExpandIntegrand(Times(Power(Times(f, x), m), Power(Plus(d, Times(
                  e, Sqr(x))), q), Power(Plus(a, Times(b, ArcTan(Times(c, x)))), p)), x), x), And(
                      FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c),
                          d)),
                      IGtQ(p, C0), IGtQ(q, C1), Or(EqQ(p, C1), IntegerQ(m))))),
          IIntegrate(4949,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                          q_)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(Times(Power(Times(f, x), m),
                      Power(Plus(d, Times(e, Sqr(x))),
                          q),
                      Power(Plus(a, Times(b, ArcCot(Times(c, x)))), p)), x), x),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c),
                      d)), IGtQ(p,
                          C0),
                      IGtQ(q, C1), Or(EqQ(p, C1), IntegerQ(m))))),
          IIntegrate(4950,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(Dist(d,
                      Integrate(Times(Power(Times(f, x), m),
                          Power(Plus(d, Times(e, Sqr(x))), Subtract(q, C1)),
                          Power(Plus(a, Times(b, ArcTan(Times(c, x)))), p)), x),
                      x),
                      Dist(Times(Sqr(c), d, Power(f, CN2)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C2)),
                                  Power(Plus(d, Times(e, Sqr(x))), Subtract(q, C1)), Power(
                                      Plus(a, Times(b, ArcTan(Times(c, x)))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c), d)), GtQ(q, C0),
                      IGtQ(p, C0), Or(RationalQ(m), And(EqQ(p, C1), IntegerQ(q)))))),
          IIntegrate(4951,
              Integrate(Times(
                  Power(Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT)), p_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                      q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(Dist(d,
                      Integrate(Times(Power(Times(f, x), m),
                          Power(Plus(d, Times(e, Sqr(x))), Subtract(q, C1)),
                          Power(Plus(a, Times(b, ArcCot(Times(c, x)))), p)), x),
                      x),
                      Dist(Times(Sqr(c), d, Power(f, CN2)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C2)),
                                  Power(Plus(d, Times(e, Sqr(x))), Subtract(q, C1)), Power(
                                      Plus(a, Times(b, ArcCot(Times(c, x)))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c),
                      d)), GtQ(q, C0), IGtQ(p,
                          C0),
                      Or(RationalQ(m), And(EqQ(p, C1), IntegerQ(q)))))),
          IIntegrate(4952,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(f, Power(Times(f, x), Subtract(m, C1)),
                              Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Power(Plus(a,
                                  Times(b, ArcTan(Times(c, x)))), p),
                              Power(Times(Sqr(c), d, m), CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(b, f, p, Power(Times(c, m),
                                  CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), Subtract(m, C1)),
                                      Power(Plus(a, Times(b,
                                          ArcTan(Times(c, x)))), Subtract(p,
                                              C1)),
                                      Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                                  x),
                              x)),
                      Negate(
                          Dist(
                              Times(Sqr(f), Subtract(m, C1), Power(Times(Sqr(c), m),
                                  CN1)),
                              Integrate(Times(Power(Times(f, x), Subtract(m, C2)),
                                  Power(Plus(a, Times(b, ArcTan(Times(c, x)))),
                                      p),
                                  Power(Plus(d, Times(e, Sqr(x))), CN1D2)), x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(e, Times(Sqr(c), d)), GtQ(p, C0),
                      GtQ(m, C1)))),
          IIntegrate(4953,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(f, Power(Times(f, x), Subtract(m, C1)),
                              Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Power(Plus(a, Times(b, ArcCot(Times(c, x)))),
                                  p),
                              Power(Times(Sqr(c), d, m), CN1)),
                          x),
                      Dist(
                          Times(b, f, p, Power(Times(c, m),
                              CN1)),
                          Integrate(Times(Power(Times(f, x), Subtract(m, C1)),
                              Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Subtract(p, C1)), Power(
                                  Plus(d, Times(e, Sqr(x))), CN1D2)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(Sqr(f), Subtract(m, C1), Power(Times(Sqr(c), m),
                                  CN1)),
                              Integrate(Times(Power(Times(f, x), Subtract(m, C2)),
                                  Power(Plus(a, Times(b, ArcCot(Times(c, x)))), p),
                                  Power(Plus(d, Times(e, Sqr(x))), CN1D2)), x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(e, Times(Sqr(c),
                      d)), GtQ(p,
                          C0),
                      GtQ(m, C1)))),
          IIntegrate(4954,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(CN2, Plus(a, Times(b, ArcTan(Times(c, x)))),
                          ArcTanh(Times(Sqrt(Plus(C1, Times(CI, c, x))),
                              Power(Subtract(C1, Times(CI, c, x)), CN1D2))),
                          Power(d, CN1D2)), x),
                      Simp(Times(CI, b,
                          PolyLog(C2,
                              Times(CN1, Sqrt(Plus(C1, Times(CI, c, x))),
                                  Power(Subtract(C1, Times(CI, c, x)), CN1D2))),
                          Power(d, CN1D2)), x),
                      Negate(Simp(Times(CI, b,
                          PolyLog(C2,
                              Times(Sqrt(Plus(C1, Times(CI, c, x))),
                                  Power(Subtract(C1, Times(CI, c, x)), CN1D2))),
                          Power(d, CN1D2)), x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(e, Times(Sqr(c), d)), GtQ(d, C0)))),
          IIntegrate(4955,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT)), Power(x_,
                          CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(CN2, Plus(a, Times(b, ArcCot(Times(c, x)))),
                              ArcTanh(
                                  Times(Sqrt(Plus(C1, Times(CI, c, x))),
                                      Power(Subtract(C1, Times(CI, c, x)), CN1D2))),
                              Power(d, CN1D2)),
                          x),
                      Negate(
                          Simp(
                              Times(CI, b,
                                  PolyLog(C2,
                                      Times(CN1, Sqrt(Plus(C1, Times(CI, c, x))),
                                          Power(Subtract(C1, Times(CI, c, x)), CN1D2))),
                                  Power(d, CN1D2)),
                              x)),
                      Simp(
                          Times(CI, b,
                              PolyLog(C2,
                                  Times(
                                      Sqrt(Plus(C1, Times(CI, c, x))), Power(
                                          Subtract(C1, Times(CI, c, x)), CN1D2))),
                              Power(d, CN1D2)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(e, Times(Sqr(c), d)), GtQ(d, C0)))),
          IIntegrate(4956,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), p_),
                      Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1D2),
                      Subst(
                          Integrate(Times(Power(Plus(a, Times(b, x)), p), Csc(x)),
                              x),
                          x, ArcTan(Times(c, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(e, Times(Sqr(c), d)), IGtQ(p, C0),
                      GtQ(d, C0)))),
          IIntegrate(4957,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), p_),
                      Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(
                              c, x, Sqrt(Plus(C1,
                                  Power(Times(Sqr(c), Sqr(x)), CN1))),
                              Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                          Subst(Integrate(Times(Power(Plus(a, Times(b, x)), p), Sec(x)), x), x,
                              ArcCot(Times(c, x))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(e, Times(Sqr(c), d)), IGtQ(p, C0),
                      GtQ(d, C0)))),
          IIntegrate(4958,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), p_DEFAULT),
                      Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(Plus(C1,
                              Times(Sqr(c), Sqr(x)))),
                          Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                      Integrate(
                          Times(Power(Plus(a, Times(b, ArcTan(Times(c, x)))), p), Power(
                              Times(x, Sqrt(Plus(C1, Times(Sqr(c), Sqr(x))))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(e, Times(Sqr(c),
                      d)), IGtQ(p,
                          C0),
                      Not(GtQ(d, C0))))),
          IIntegrate(4959,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          p_DEFAULT),
                      Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(Plus(C1,
                              Times(Sqr(c), Sqr(x)))),
                          Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b,
                                  ArcCot(Times(c, x)))), p),
                              Power(Times(x, Sqrt(Plus(C1, Times(Sqr(c), Sqr(x))))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(e, Times(Sqr(c),
                      d)), IGtQ(p,
                          C0),
                      Not(GtQ(d, C0))))),
          IIntegrate(4960,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          p_DEFAULT),
                      Power(x_, CN2), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(Negate(Simp(Times(Sqrt(Plus(d, Times(e, Sqr(x)))),
                      Power(Plus(a, Times(b, ArcTan(Times(c, x)))), p), Power(Times(d, x), CN1)),
                      x)),
                      Dist(Times(b, c, p),
                          Integrate(
                              Times(Power(Plus(a, Times(b, ArcTan(Times(c, x)))), Subtract(p, C1)),
                                  Power(Times(x, Sqrt(Plus(d, Times(e, Sqr(x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(e, Times(Sqr(c), d)), GtQ(p, C0)))));
}
