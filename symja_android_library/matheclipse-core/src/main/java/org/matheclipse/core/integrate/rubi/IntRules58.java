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
class IntRules58 {
  public static IAST RULES =
      List(
          IIntegrate(1161,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(q,
                              Rt(Subtract(Times(C2, d, Power(e, CN1)), Times(b, Power(c, CN1))),
                                  C2))),
                      Plus(
                          Dist(Times(e, Power(Times(C2, c), CN1)),
                              Integrate(
                                  Power(Simp(Plus(Times(d, Power(e, CN1)), Times(q, x), Sqr(x)), x),
                                      CN1),
                                  x),
                              x),
                          Dist(Times(e, Power(Times(C2, c), CN1)),
                              Integrate(
                                  Power(
                                      Simp(Plus(Times(d, Power(e, CN1)), Times(CN1, q, x), Sqr(x)),
                                          x),
                                      CN1),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Subtract(Times(c, Sqr(d)),
                          Times(a, Sqr(e))), C0),
                      Or(GtQ(Subtract(Times(C2, d, Power(e,
                          CN1)), Times(b,
                              Power(c, CN1))),
                          C0),
                          And(Not(
                              LtQ(Subtract(Times(C2, d, Power(e,
                                  CN1)), Times(b,
                                      Power(c, CN1))),
                                  C0)),
                              EqQ(Subtract(d, Times(e, Rt(Times(a, Power(c, CN1)), C2))), C0)))))),
          IIntegrate(1162,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(With(List(Set(q, Rt(Times(C2, d, Power(e, CN1)), C2))),
                  Plus(
                      Dist(Times(e, Power(Times(C2, c), CN1)),
                          Integrate(Power(
                              Simp(Plus(Times(d, Power(e, CN1)), Times(q, x), Sqr(x)), x), CN1), x),
                          x),
                      Dist(Times(e, Power(Times(C2, c), CN1)),
                          Integrate(Power(
                              Simp(Plus(Times(d, Power(e, CN1)), Times(CN1, q, x), Sqr(x)), x),
                              CN1), x),
                          x))),
                  And(FreeQ(List(a, c, d, e), x),
                      EqQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), PosQ(Times(d, e))))),
          IIntegrate(1163,
              Integrate(Times(Plus(d_, Times(e_DEFAULT, Sqr(x_))), Power(Plus(
                  a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                  CN1)), x_Symbol),
              Condition(With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                  Plus(
                      Dist(
                          Plus(Times(C1D2, e),
                              Times(Subtract(Times(C2, c, d), Times(b, e)),
                                  Power(Times(C2, q), CN1))),
                          Integrate(
                              Power(Plus(Times(C1D2, b), Times(CN1, C1D2, q), Times(c, Sqr(x))),
                                  CN1),
                              x),
                          x),
                      Dist(
                          Subtract(Times(C1D2, e),
                              Times(Subtract(Times(C2, c, d), Times(b, e)),
                                  Power(Times(C2, q), CN1))),
                          Integrate(
                              Power(Plus(Times(C1D2, b), Times(C1D2, q), Times(c, Sqr(x))), CN1),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Subtract(Times(c, Sqr(d)),
                          Times(a, Sqr(e))), C0),
                      GtQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(1164,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(q,
                              Rt(Subtract(Times(CN2, d, Power(e, CN1)), Times(b, Power(c, CN1))),
                                  C2))),
                      Plus(
                          Dist(
                              Times(e, Power(Times(C2, c, q),
                                  CN1)),
                              Integrate(
                                  Times(
                                      Subtract(q, Times(C2,
                                          x)),
                                      Power(
                                          Simp(
                                              Subtract(
                                                  Plus(Times(d, Power(e, CN1)), Times(q,
                                                      x)),
                                                  Sqr(x)),
                                              x),
                                          CN1)),
                                  x),
                              x),
                          Dist(Times(e, Power(Times(C2, c, q), CN1)),
                              Integrate(Times(Plus(q, Times(C2, x)),
                                  Power(
                                      Simp(Subtract(Subtract(Times(d, Power(e, CN1)), Times(q, x)),
                                          Sqr(x)), x),
                                      CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Subtract(Times(c, Sqr(d)),
                          Times(a, Sqr(e))), C0),
                      Not(GtQ(Subtract(Sqr(b), Times(C4, a, c)), C0))))),
          IIntegrate(1165,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(CN2, d, Power(e, CN1)), C2))),
                      Plus(
                          Dist(
                              Times(e, Power(Times(C2, c, q),
                                  CN1)),
                              Integrate(
                                  Times(
                                      Subtract(q, Times(C2,
                                          x)),
                                      Power(
                                          Simp(
                                              Subtract(
                                                  Plus(Times(d, Power(e, CN1)), Times(q, x)), Sqr(
                                                      x)),
                                              x),
                                          CN1)),
                                  x),
                              x),
                          Dist(Times(e, Power(Times(C2, c, q), CN1)),
                              Integrate(Times(Plus(q, Times(C2, x)), Power(Simp(
                                  Subtract(Subtract(Times(d, Power(e, CN1)), Times(q, x)), Sqr(x)),
                                  x), CN1)), x),
                              x))),
                  And(FreeQ(List(a, c, d,
                      e), x), EqQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0),
                      NegQ(Times(d, e))))),
          IIntegrate(1166,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1)),
                  x_Symbol),
              Condition(With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))), Plus(Dist(
                  Plus(Times(C1D2, e),
                      Times(Subtract(Times(C2, c, d), Times(b, e)), Power(Times(C2, q), CN1))),
                  Integrate(Power(Plus(Times(C1D2, b), Times(CN1, C1D2, q), Times(c, Sqr(x))), CN1),
                      x),
                  x),
                  Dist(
                      Subtract(Times(C1D2, e),
                          Times(Subtract(Times(C2, c, d), Times(b, e)), Power(Times(C2, q), CN1))),
                      Integrate(Power(Plus(Times(C1D2, b), Times(C1D2, q), Times(c, Sqr(x))), CN1),
                          x),
                      x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Subtract(Times(c, Sqr(d)),
                          Times(a, Sqr(e))), C0),
                      PosQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(1167,
              Integrate(Times(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1)), x_Symbol),
              Condition(
                  With(
                      List(Set(q, Rt(Times(CN1, a, c), C2))), Plus(
                          Dist(
                              Plus(Times(C1D2, e), Times(c, d, Power(Times(C2, q), CN1))),
                              Integrate(Power(Plus(Negate(q), Times(c, Sqr(x))), CN1), x), x),
                          Dist(Subtract(Times(C1D2, e), Times(c, d, Power(Times(C2, q), CN1))),
                              Integrate(Power(Plus(q, Times(c, Sqr(x))), CN1), x), x))),
                  And(FreeQ(List(a, c, d, e), x),
                      NeQ(Subtract(Times(c, Sqr(
                          d)), Times(a,
                              Sqr(e))),
                          C0),
                      PosQ(Times(CN1, a, c))))),
          IIntegrate(1168,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(a, c), C2))),
                      Plus(
                          Dist(
                              Times(Plus(Times(d, q), Times(a,
                                  e)), Power(Times(C2, a, c),
                                      CN1)),
                              Integrate(Times(Plus(q, Times(c, Sqr(x))),
                                  Power(Plus(a, Times(c, Power(x, C4))), CN1)), x),
                              x),
                          Dist(
                              Times(Subtract(Times(d, q), Times(a, e)),
                                  Power(Times(C2, a, c), CN1)),
                              Integrate(
                                  Times(Subtract(q, Times(c, Sqr(x))),
                                      Power(Plus(a, Times(c, Power(x, C4))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                      NeQ(Subtract(Times(c, Sqr(d)),
                          Times(a, Sqr(e))), C0),
                      NegQ(Times(CN1, a, c))))),
          IIntegrate(1169,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(a, Power(c, CN1)), C2))),
                      With(
                          List(Set(r,
                              Rt(Subtract(Times(C2, q), Times(b, Power(c, CN1))), C2))),
                          Plus(
                              Dist(
                                  Power(Times(C2, c, q, r), CN1),
                                  Integrate(Times(
                                      Subtract(Times(d, r), Times(Subtract(d, Times(e, q)), x)),
                                      Power(Plus(q, Times(CN1, r, x), Sqr(x)), CN1)), x),
                                  x),
                              Dist(Power(Times(C2, c, q, r), CN1),
                                  Integrate(
                                      Times(Plus(Times(d, r), Times(Subtract(d, Times(e, q)), x)),
                                          Power(Plus(q, Times(r, x), Sqr(x)), CN1)),
                                      x),
                                  x)))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      NegQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(1170,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Plus(d, Times(e, Sqr(x))), q), Power(Plus(a, Times(b, Sqr(x)),
                                  Times(c, Power(x, C4))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0),
                      IntegerQ(q)))),
          IIntegrate(1171,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_), Power(
                          Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Plus(d,
                                  Times(e, Sqr(x))), q),
                              Power(Plus(a, Times(c, Power(x, C4))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d,
                      e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0),
                      IntegerQ(q)))),
          IIntegrate(1172,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_), Power(
                      Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(Sqr(e),
                          Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                              CN1)),
                          Integrate(Power(Plus(d, Times(e, Sqr(x))), q), x), x),
                      Dist(
                          Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                                  Subtract(Subtract(Times(c, d), Times(b, e)), Times(c, e, Sqr(x))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0),
                      Not(IntegerQ(q)), LtQ(q, CN1)))),
          IIntegrate(1173,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_), Power(
                          Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(Sqr(e), Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                          Integrate(Power(Plus(d, Times(e, Sqr(x))), q), x), x),
                      Dist(Times(c, Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                              Subtract(d, Times(e, Sqr(x))), Power(Plus(a, Times(c, Power(x, C4))),
                                  CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d,
                      e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0),
                      Not(IntegerQ(q)), LtQ(q, CN1)))),
          IIntegrate(1174,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(r, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Subtract(
                          Dist(Times(C2, c, Power(r, CN1)),
                              Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), q),
                                  Power(Plus(b, Negate(r), Times(C2, c, Sqr(x))), CN1)), x),
                              x),
                          Dist(Times(C2, c, Power(r, CN1)),
                              Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), q),
                                  Power(Plus(b, r, Times(C2, c, Sqr(x))), CN1)), x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, q), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      Not(IntegerQ(q))))),
          IIntegrate(1175,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(r, Rt(Times(CN1, a, c), C2))),
                      Subtract(
                          Negate(Dist(Times(c, Power(Times(C2, r), CN1)),
                              Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), q),
                                  Power(Subtract(r, Times(c, Sqr(x))), CN1)), x),
                              x)),
                          Dist(Times(c, Power(Times(C2, r), CN1)),
                              Integrate(
                                  Times(Power(Plus(d, Times(e, Sqr(x))), q),
                                      Power(Plus(r, Times(c, Sqr(x))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, c, d, e,
                      q), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0),
                      Not(IntegerQ(q))))),
          IIntegrate(1176,
              Integrate(
                  Times(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x,
                              Plus(
                                  Times(C2, b, e, p), Times(c, d, Plus(Times(C4, p), C3)),
                                  Times(c, e, Plus(Times(C4, p), C1), Sqr(x))),
                              Power(Plus(a, Times(b, Sqr(x)),
                                  Times(c, Power(x, C4))), p),
                              Power(Times(c, Plus(Times(C4, p), C1), Plus(Times(C4, p), C3)), CN1)),
                          x),
                      Dist(
                          Times(
                              C2, p, Power(Times(c, Plus(Times(C4, p), C1), Plus(Times(C4, p), C3)),
                                  CN1)),
                          Integrate(Times(
                              Simp(
                                  Plus(Times(C2, a, c, d, Plus(Times(C4, p), C3)),
                                      Times(CN1, a, b, e),
                                      Times(Subtract(
                                          Plus(Times(C2, a, c, e, Plus(Times(C4, p), C1)),
                                              Times(b, c, d, Plus(Times(C4, p), C3))),
                                          Times(Sqr(b), e, Plus(Times(C2, p), C1))), Sqr(x))),
                                  x),
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                  Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0), GtQ(p,
                          C0),
                      FractionQ(p), IntegerQ(Times(C2, p))))),
          IIntegrate(1177,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x,
                              Plus(
                                  Times(d, Plus(Times(C4, p), C3)), Times(e, Plus(Times(C4, p), C1),
                                      Sqr(x))),
                              Power(Plus(a, Times(c,
                                  Power(x, C4))), p),
                              Power(Times(Plus(Times(C4, p), C1), Plus(Times(C4, p), C3)), CN1)),
                          x),
                      Dist(
                          Times(C2, p,
                              Power(Times(Plus(Times(C4, p), C1), Plus(Times(C4, p), C3)), CN1)),
                          Integrate(
                              Times(
                                  Simp(Plus(Times(C2, a, d, Plus(Times(C4, p), C3)),
                                      Times(C2, a, e, Plus(Times(C4, p), C1), Sqr(x))), x),
                                  Power(Plus(a, Times(c, Power(x, C4))), Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)),
                      Times(a, Sqr(e))), C0), GtQ(p,
                          C0),
                      FractionQ(p), IntegerQ(Times(C2, p))))),
          IIntegrate(1178,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT,
                          Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x,
                              Subtract(
                                  Subtract(Times(a, b, e),
                                      Times(d, Subtract(Sqr(b), Times(C2, a, c)))),
                                  Times(c, Subtract(Times(b, d), Times(C2, a, e)), Sqr(x))),
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p, C1)),
                              Power(Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))),
                                  CN1)),
                          x),
                      Dist(Power(Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1),
                          Integrate(
                              Times(
                                  Simp(
                                      Plus(Times(Plus(Times(C2, p), C3), d, Sqr(b)),
                                          Times(CN1, a, b, e),
                                          Times(CN1, C2, a, c, d, Plus(Times(C4, p), C5)),
                                          Times(Plus(Times(C4, p), C7),
                                              Subtract(Times(d, b), Times(C2, a, e)), c, Sqr(x))),
                                      x),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0), LtQ(p,
                          CN1),
                      IntegerQ(Times(C2, p))))),
          IIntegrate(1179,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(Times(x, Plus(d, Times(e, Sqr(x))),
                          Power(Plus(a, Times(c, Power(x, C4))), Plus(p, C1)),
                          Power(Times(C4, a, Plus(p, C1)), CN1)), x)),
                      Dist(
                          Power(Times(C4, a, Plus(p, C1)), CN1), Integrate(
                              Times(
                                  Simp(Plus(Times(d, Plus(Times(C4, p), C5)),
                                      Times(e, Plus(Times(C4, p), C7), Sqr(x))), x),
                                  Power(Plus(a, Times(c, Power(x, C4))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)),
                      Times(a, Sqr(e))), C0), LtQ(p,
                          CN1),
                      IntegerQ(Times(C2, p))))),
          IIntegrate(1180,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Dist(Times(C2, Sqrt(Negate(c))), Integrate(Times(Plus(d, Times(e, Sqr(x))),
                          Power(Times(Sqrt(Plus(b, q, Times(C2, c, Sqr(x)))),
                              Sqrt(Subtract(Plus(Negate(b), q), Times(C2, c, Sqr(x))))), CN1)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      LtQ(c, C0)))));
}
