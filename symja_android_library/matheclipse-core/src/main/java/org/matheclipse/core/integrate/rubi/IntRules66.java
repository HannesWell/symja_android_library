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
class IntRules66 {
  public static IAST RULES =
      List(
          IIntegrate(1321,
              Integrate(
                  Times(
                      Power(x_, C4), Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(Power(e, CN2),
                              Integrate(
                                  Times(Subtract(d, Times(e, Sqr(x))),
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                          CN1D2)),
                                  x),
                              x)),
                      Dist(
                          Times(Sqr(d), Power(e,
                              CN2)),
                          Integrate(
                              Power(
                                  Times(Plus(d, Times(e, Sqr(x))),
                                      Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                  CN1),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      PosQ(Times(c,
                          Power(a, CN1))),
                      EqQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
          IIntegrate(1322,
              Integrate(
                  Times(
                      Power(x_, C4), Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Dist(Power(e, CN2), Integrate(Times(Subtract(d, Times(e, Sqr(x))),
                          Power(Plus(a, Times(c, Power(x, C4))), CN1D2)), x), x)),
                      Dist(Times(Sqr(d), Power(e, CN2)),
                          Integrate(Power(Times(Plus(d, Times(e, Sqr(x))),
                              Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1), x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), PosQ(Times(c, Power(a, CN1))),
                      EqQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
          IIntegrate(1323,
              Integrate(Times(Power(x_, C4), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1),
                  Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                      CN1D2)),
                  x_Symbol),
              Condition(
                  With(List(Set(q,
                      Rt(Times(c, Power(a, CN1)), C2))),
                      Condition(
                          Plus(
                              Negate(
                                  Dist(Power(Times(e, q), CN1),
                                      Integrate(
                                          Times(Subtract(C1, Times(q, Sqr(x))),
                                              Power(
                                                  Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                                  CN1D2)),
                                          x),
                                      x)),
                              Dist(Times(Sqr(d), Power(Times(e, Subtract(e, Times(d, q))), CN1)),
                                  Integrate(Times(Plus(C1, Times(q, Sqr(x))),
                                      Power(Times(Plus(d, Times(e, Sqr(x))),
                                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                          CN1)),
                                      x),
                                  x)),
                          EqQ(Subtract(Times(C2, c, d), Times(a, e, q)), C0))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      PosQ(Times(c, Power(a, CN1))),
                      NeQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
          IIntegrate(1324,
              Integrate(Times(Power(x_, C4), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)), x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Times(c, Power(a, CN1)), C2))),
                      Condition(
                          Plus(
                              Negate(
                                  Dist(Power(Times(e, q), CN1),
                                      Integrate(
                                          Times(
                                              Subtract(C1, Times(q, Sqr(x))), Power(Plus(a,
                                                  Times(c, Power(x, C4))), CN1D2)),
                                          x),
                                      x)),
                              Dist(Times(Sqr(d), Power(Times(e, Subtract(e, Times(d, q))), CN1)),
                                  Integrate(Times(Plus(C1, Times(q, Sqr(x))),
                                      Power(Times(Plus(d, Times(e, Sqr(x))),
                                          Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1)),
                                      x),
                                  x)),
                          EqQ(Subtract(Times(C2, c, d), Times(a, e, q)), C0))),
                  And(FreeQ(List(a, c, d, e), x), PosQ(Times(c, Power(a, CN1))),
                      NeQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
          IIntegrate(1325,
              Integrate(
                  Times(
                      Power(x_, C4), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(c, Power(a, CN1)), C2))),
                      Plus(
                          Negate(
                              Dist(
                                  Times(
                                      Subtract(Times(C2, c, d), Times(a, e, q)), Power(
                                          Times(c, e, Subtract(e, Times(d, q))), CN1)),
                                  Integrate(
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                          CN1D2),
                                      x),
                                  x)),
                          Negate(
                              Dist(Power(Times(e, q), CN1),
                                  Integrate(
                                      Times(Subtract(C1, Times(q, Sqr(x))),
                                          Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                              CN1D2)),
                                      x),
                                  x)),
                          Dist(Times(Sqr(d), Power(Times(e, Subtract(e, Times(d, q))), CN1)),
                              Integrate(
                                  Times(Plus(C1, Times(q, Sqr(x))),
                                      Power(Times(Plus(d, Times(e, Sqr(x))),
                                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                          CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      PosQ(Times(c,
                          Power(a, CN1))),
                      NeQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
          IIntegrate(1326,
              Integrate(Times(
                  Power(x_, C4), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)), x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(c, Power(a, CN1)), C2))),
                      Plus(
                          Negate(Dist(
                              Times(Subtract(Times(C2, c, d), Times(a, e, q)), Power(Times(c, e,
                                  Subtract(e, Times(d, q))),
                                  CN1)),
                              Integrate(Power(Plus(a, Times(c, Power(x, C4))), CN1D2), x), x)),
                          Negate(
                              Dist(
                                  Power(Times(e,
                                      q), CN1),
                                  Integrate(
                                      Times(
                                          Subtract(C1, Times(q,
                                              Sqr(x))),
                                          Power(Plus(a, Times(c, Power(x, C4))), CN1D2)),
                                      x),
                                  x)),
                          Dist(Times(Sqr(d), Power(Times(e, Subtract(e, Times(d, q))), CN1)),
                              Integrate(
                                  Times(Plus(C1, Times(q, Sqr(x))),
                                      Power(Times(Plus(d, Times(e, Sqr(x))),
                                          Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, c, d, e), x), PosQ(Times(c,
                      Power(a, CN1))), NeQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0)))),
          IIntegrate(1327,
              Integrate(
                  Times(
                      Power(x_, m_), Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_,
                          C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(x, Subtract(m, C5)),
                              Sqrt(Plus(a, Times(b, Sqr(x)),
                                  Times(c, Power(x, C4)))),
                              Power(Times(c, e, Subtract(m, C3)), CN1)),
                          x),
                      Dist(Power(Times(c, e, Subtract(m, C3)), CN1),
                          Integrate(
                              Times(Power(x, Subtract(m, C6)),
                                  Simp(Plus(Times(a, d, Subtract(m, C5)),
                                      Times(Plus(Times(a, e, Subtract(m, C5)),
                                          Times(b, d, Subtract(m, C4))), Sqr(x)),
                                      Times(
                                          Plus(Times(b, e, Subtract(m, C4)),
                                              Times(c, d, Subtract(m, C3))),
                                          Power(x, C4))),
                                      x),
                                  Power(Times(Plus(d, Times(e, Sqr(x))),
                                      Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      IGtQ(Times(C1D2, m), C2)))),
          IIntegrate(1328,
              Integrate(
                  Times(
                      Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(Subtract(Simp(
                  Times(Power(x, Subtract(m, C5)), Sqrt(Plus(a, Times(c, Power(x, C4)))),
                      Power(Times(c, e, Subtract(m, C3)), CN1)),
                  x),
                  Dist(Power(Times(c, e, Subtract(m, C3)), CN1), Integrate(Times(
                      Power(x, Subtract(m, C6)),
                      Simp(Plus(Times(a, d, Subtract(m, C5)), Times(a, e, Subtract(m, C5), Sqr(x)),
                          Times(c, d, Subtract(m, C3), Power(x, C4))), x),
                      Power(Times(Plus(d, Times(e, Sqr(x))), Sqrt(Plus(a, Times(c, Power(x, C4))))),
                          CN1)),
                      x), x)),
                  And(FreeQ(List(a, c, d, e), x), IGtQ(Times(C1D2, m), C2)))),
          IIntegrate(1329,
              Integrate(
                  Times(
                      Power(x_, m_), Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Power(x, Plus(m, C1)),
                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4)))), Power(
                              Times(a, d, Plus(m, C1)), CN1)),
                          x),
                      Dist(Power(Times(a, d, Plus(m, C1)), CN1),
                          Integrate(Times(Power(x, Plus(m, C2)),
                              Simp(Plus(Times(a, e, Plus(m, C1)), Times(b, d, Plus(m, C2)),
                                  Times(Plus(Times(b, e, Plus(m, C2)), Times(c, d, Plus(m, C3))),
                                      Sqr(x)),
                                  Times(c, e, Plus(m, C3), Power(x, C4))), x),
                              Power(
                                  Times(
                                      Plus(d, Times(e, Sqr(x))), Sqrt(Plus(a, Times(b, Sqr(x)),
                                          Times(c, Power(x, C4))))),
                                  CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), ILtQ(Times(C1D2, m),
                          C0)))),
          IIntegrate(1330,
              Integrate(
                  Times(
                      Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Power(x, Plus(m, C1)), Sqrt(Plus(a,
                                  Times(c, Power(x, C4)))),
                              Power(Times(a, d, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(a, d,
                              Plus(m, C1)), CN1),
                          Integrate(
                              Times(Power(x, Plus(m, C2)),
                                  Simp(
                                      Plus(Times(a, e, Plus(m, C1)),
                                          Times(c, d, Plus(m, C3), Sqr(x)),
                                          Times(c, e, Plus(m, C3), Power(x, C4))),
                                      x),
                                  Power(
                                      Times(
                                          Plus(d, Times(e, Sqr(x))), Sqrt(Plus(a,
                                              Times(c, Power(x, C4))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), ILtQ(Times(C1D2, m), C0)))),
          IIntegrate(1331,
              Integrate(
                  Times(
                      Power(x_, m_), Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1D2),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(x, C3), Sqrt(Plus(e, Times(d, Power(x, CN2)))),
                          Sqrt(Plus(c, Times(b, Power(x, CN2)),
                              Times(a, Power(x, CN4)))),
                          Power(
                              Times(Sqrt(Plus(d, Times(e, Sqr(x)))), Sqrt(Plus(a, Times(b, Sqr(x)),
                                  Times(c, Power(x, C4))))),
                              CN1)),
                      Integrate(
                          Times(Power(x, Subtract(m, C3)),
                              Power(Times(Sqrt(Plus(e, Times(d, Power(x, CN2)))),
                                  Sqrt(Plus(c, Times(b, Power(x, CN2)), Times(a, Power(x, CN4))))),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d,
                      e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IntegerQ(Times(C1D2, m))))),
          IIntegrate(1332,
              Integrate(
                  Times(
                      Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), CN1D2),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(x, C3), Sqrt(Plus(e, Times(d, Power(x, CN2)))),
                          Sqrt(Plus(c, Times(a, Power(x, CN4)))),
                          Power(
                              Times(Sqrt(Plus(d, Times(e, Sqr(x)))),
                                  Sqrt(Plus(a, Times(c, Power(x, C4))))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(x, Subtract(m,
                                  C3)),
                              Power(
                                  Times(
                                      Sqrt(Plus(e, Times(d, Power(x, CN2)))), Sqrt(
                                          Plus(c, Times(a, Power(x, CN4))))),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e), x), IntegerQ(Times(C1D2, m))))),
          IIntegrate(1333,
              Integrate(
                  Times(
                      Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(f,
                              Coeff(
                                  PolynomialRemainder(Times(Power(x, m), Power(Plus(d, Times(e, Sqr(
                                      x))), q)), Plus(a, Times(b, Sqr(x)), Times(c, Power(x,
                                          C4))),
                                      x),
                                  x, C0)),
                          Set(g, Coeff(
                              PolynomialRemainder(Times(Power(x, m), Power(Plus(d, Times(
                                  e, Sqr(x))), q)),
                                  Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), x),
                              x, C2))),
                      Plus(
                          Simp(Times(x,
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p, C1)),
                              Subtract(
                                  Subtract(Times(a, b, g),
                                      Times(f, Subtract(Sqr(b), Times(C2, a, c)))),
                                  Times(c, Subtract(Times(b, f), Times(C2, a, g)), Sqr(x))),
                              Power(Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))),
                                  CN1)),
                              x),
                          Dist(
                              Power(
                                  Times(C2, a, Plus(p, C1),
                                      Subtract(Sqr(b), Times(C4, a, c))),
                                  CN1),
                              Integrate(
                                  Times(
                                      Power(
                                          Plus(a, Times(b, Sqr(
                                              x)), Times(c,
                                                  Power(x, C4))),
                                          Plus(p, C1)),
                                      Simp(
                                          ExpandToSum(Plus(
                                              Times(C2, a, Plus(p, C1),
                                                  Subtract(Sqr(b), Times(C4, a, c)),
                                                  PolynomialQuotient(
                                                      Times(Power(x, m),
                                                          Power(Plus(d, Times(e, Sqr(x))), q)),
                                                      Plus(a, Times(b, Sqr(x)),
                                                          Times(c, Power(x, C4))),
                                                      x)),
                                              Times(Sqr(b), f, Plus(Times(C2, p), C3)),
                                              Times(CN1, C2, a, c, f, Plus(Times(C4, p), C5)),
                                              Times(CN1, a, b, g),
                                              Times(c, Plus(Times(C4, p), C7),
                                                  Subtract(Times(b, f), Times(C2, a, g)), Sqr(x))),
                                              x),
                                          x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      LtQ(p, CN1), IGtQ(q, C1), IGtQ(Times(C1D2, m), C0)))),
          IIntegrate(1334,
              Integrate(
                  Times(Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(f,
                              Coeff(
                                  PolynomialRemainder(
                                      Times(Power(x, m), Power(Plus(d, Times(e, Sqr(x))),
                                          q)),
                                      Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), x),
                                  x, C0)),
                          Set(g,
                              Coeff(
                                  PolynomialRemainder(
                                      Times(Power(x, m), Power(Plus(d, Times(e, Sqr(x))),
                                          q)),
                                      Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), x),
                                  x, C2))),
                      Plus(
                          Simp(
                              Times(x,
                                  Power(
                                      Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      Plus(p, C1)),
                                  Subtract(Subtract(Times(a, b, g),
                                      Times(f, Subtract(Sqr(b), Times(C2, a, c)))),
                                      Times(c, Subtract(Times(b, f), Times(C2, a, g)), Sqr(x))),
                                  Power(
                                      Times(C2, a, Plus(p, C1),
                                          Subtract(Sqr(b), Times(C4, a, c))),
                                      CN1)),
                              x),
                          Dist(
                              Power(
                                  Times(C2, a, Plus(p, C1),
                                      Subtract(Sqr(b), Times(C4, a, c))),
                                  CN1),
                              Integrate(
                                  Times(Power(x, m),
                                      Power(
                                          Plus(a, Times(b, Sqr(
                                              x)), Times(c,
                                                  Power(x, C4))),
                                          Plus(p, C1)),
                                      Simp(
                                          ExpandToSum(
                                              Plus(
                                                  Times(C2, a, Plus(p, C1),
                                                      Subtract(Sqr(b), Times(C4, a,
                                                          c)),
                                                      PolynomialQuotient(
                                                          Times(Power(x, m),
                                                              Power(Plus(d, Times(e, Sqr(x))), q)),
                                                          Plus(a, Times(b, Sqr(x)),
                                                              Times(c, Power(x, C4))),
                                                          x),
                                                      Power(Power(x, m), CN1)),
                                                  Times(Subtract(
                                                      Subtract(
                                                          Times(Sqr(b), f, Plus(Times(C2, p), C3)),
                                                          Times(C2, a, c, f,
                                                              Plus(Times(C4, p), C5))),
                                                      Times(a, b, g)), Power(Power(x, m), CN1)),
                                                  Times(c, Plus(Times(C4, p), C7),
                                                      Subtract(Times(b, f), Times(C2, a, g)),
                                                      Power(x, Subtract(C2, m)))),
                                              x),
                                          x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      LtQ(p, CN1), IGtQ(q, C1), ILtQ(Times(C1D2, m), C0)))),
          IIntegrate(1335,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), q),
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, p, q), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      Or(IGtQ(p, C0), IGtQ(q, C0), IntegersQ(m, q))))),
          IIntegrate(1336,
              Integrate(Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                  Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT), Power(
                      Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(Times(Power(Times(f, x), m),
                          Power(Plus(d, Times(e, Sqr(x))),
                              q),
                          Power(Plus(a, Times(c, Power(x, C4))), p)), x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, p,
                      q), x), Or(IGtQ(p, C0), IGtQ(q, C0),
                          IntegersQ(m, q))))),
          IIntegrate(1337,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(f,
                          x), m), Power(Power(x, m),
                              CN1)),
                      Integrate(
                          ExpandIntegrand(
                              Times(Power(x, m), Power(Plus(a, Times(c, Power(x, C4))), p)),
                              Power(
                                  Subtract(
                                      Times(d,
                                          Power(Subtract(Sqr(d), Times(Sqr(e), Power(x, C4))),
                                              CN1)),
                                      Times(e, Sqr(x),
                                          Power(Subtract(Sqr(d), Times(Sqr(e), Power(x, C4))),
                                              CN1))),
                                  Negate(q)),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, p), x), Not(IntegerQ(p)), ILtQ(q, C0)))),
          IIntegrate(1338,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), q),
                          Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, p, q), x))),
          IIntegrate(1339,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), q_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(f, x), m), Power(Plus(d,
                              Times(e, Sqr(x))), q),
                          Power(Plus(a, Times(c, Power(x, C4))), p)),
                      x),
                  FreeQ(List(a, c, d, e, f, m, p, q), x))),
          IIntegrate(1340,
              Integrate(Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                  Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT), x_Symbol),
              Condition(
                  Integrate(Times(Power(x, Times(C2, n, p)),
                      Power(Plus(c, Times(b, Power(Power(x, n), CN1)),
                          Times(a, Power(Power(x, Times(C2, n)), CN1))), p)),
                      x),
                  And(FreeQ(List(a, b, c), x), EqQ($s("n2"), Times(C2, n)), LtQ(n, C0),
                      IntegerQ(p)))));
}
