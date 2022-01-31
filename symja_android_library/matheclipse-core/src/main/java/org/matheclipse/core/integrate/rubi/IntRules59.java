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
class IntRules59 {
  public static IAST RULES =
      List(
          IIntegrate(1181,
              Integrate(Times(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)), x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Times(CN1, a, c), C2))),
                      Dist(Sqrt(Negate(c)),
                          Integrate(
                              Times(Plus(d, Times(e, Sqr(x))),
                                  Power(Times(Sqrt(Plus(q, Times(c, Sqr(x)))),
                                      Sqrt(Subtract(q, Times(c, Sqr(x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), GtQ(a, C0), LtQ(c, C0)))),
          IIntegrate(1182,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(c, Power(a, CN1)), C4))),
                      Condition(
                          Plus(
                              Negate(
                                  Simp(Times(d, x,
                                      Sqrt(Plus(a, Times(b, Sqr(x)), Times(c,
                                          Power(x, C4)))),
                                      Power(Times(a, Plus(C1, Times(Sqr(q), Sqr(x)))), CN1)),
                                      x)),
                              Simp(Times(d, Plus(C1, Times(Sqr(q), Sqr(x))),
                                  Sqrt(Times(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      Power(Times(a, Sqr(Plus(C1, Times(Sqr(q), Sqr(x))))), CN1))),
                                  EllipticE(Times(C2, ArcTan(Times(q, x))),
                                      Subtract(C1D2, Times(b, Sqr(q), Power(Times(C4, c), CN1)))),
                                  Power(
                                      Times(q,
                                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                      CN1)),
                                  x)),
                          EqQ(Plus(e, Times(d, Sqr(q))), C0))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b), Times(C4, a, c)),
                      C0), GtQ(Times(c, Power(a, CN1)), C0),
                      LtQ(Times(b, Power(a, CN1)), C0)))),
          IIntegrate(1183,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Times(c, Power(a, CN1)), C2))),
                      Condition(
                          Subtract(
                              Dist(Times(Plus(e, Times(d, q)), Power(q, CN1)),
                                  Integrate(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      CN1D2), x),
                                  x),
                              Dist(Times(e, Power(q, CN1)),
                                  Integrate(Times(Subtract(C1, Times(q, Sqr(x))),
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                          CN1D2)),
                                      x),
                                  x)),
                          NeQ(Plus(e, Times(d, q)), C0))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), GtQ(Times(c, Power(a, CN1)),
                          C0),
                      LtQ(Times(b, Power(a, CN1)), C0)))),
          IIntegrate(1184,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Condition(
                          Subtract(
                              Simp(
                                  Times(
                                      e, x, Plus(b, q, Times(C2, c,
                                          Sqr(x))),
                                      Power(
                                          Times(C2, c,
                                              Sqrt(
                                                  Plus(
                                                      a, Times(b, Sqr(x)),
                                                      Times(c, Power(x, C4))))),
                                          CN1)),
                                  x),
                              Simp(
                                  Times(e, q,
                                      Sqrt(
                                          Times(
                                              Plus(Times(C2, a), Times(Subtract(b, q),
                                                  Sqr(x))),
                                              Power(Plus(Times(C2, a), Times(Plus(b, q), Sqr(x))),
                                                  CN1))),
                                      Sqrt(
                                          Times(
                                              Plus(Times(C2, a), Times(Plus(b, q), Sqr(x))), Power(
                                                  q, CN1))),
                                      EllipticE(ArcSin(Times(x,
                                          Power(Times(Plus(Times(C2, a), Times(Plus(b, q), Sqr(x))),
                                              Power(Times(C2, q), CN1)), CN1D2))),
                                          Times(Plus(b, q), Power(Times(C2, q), CN1))),
                                      Power(
                                          Times(C2, c,
                                              Sqrt(Plus(a, Times(b, Sqr(x)),
                                                  Times(c, Power(x, C4)))),
                                              Sqrt(
                                                  Times(a,
                                                      Power(Plus(Times(C2, a),
                                                          Times(Plus(b, q), Sqr(x))), CN1)))),
                                          CN1)),
                                  x)),
                          EqQ(Subtract(Times(C2, c, d), Times(e, Subtract(b, q))), C0))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), LtQ(a,
                          C0),
                      GtQ(c, C0)))),
          IIntegrate(1185,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT, Sqr(x_))), Power(
                          Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(CN1, a, c), C2))),
                      Condition(
                          Subtract(
                              Simp(
                                  Times(e, x, Plus(q, Times(c, Sqr(x))), Power(Times(c,
                                      Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1)),
                                  x),
                              Simp(Times(CSqrt2, e, q, Sqrt(Plus(Negate(a), Times(q, Sqr(x)))),
                                  Sqrt(Times(Plus(a, Times(q, Sqr(x))), Power(q, CN1))),
                                  EllipticE(ArcSin(Times(x,
                                      Power(Times(Plus(a, Times(q, Sqr(x))),
                                          Power(Times(C2, q), CN1)), CN1D2))),
                                      C1D2),
                                  Power(
                                      Times(Sqrt(Negate(a)), c,
                                          Sqrt(Plus(a, Times(c, Power(x, C4))))),
                                      CN1)),
                                  x)),
                          And(EqQ(Plus(Times(c, d), Times(e, q)), C0), IntegerQ(q)))),
                  And(FreeQ(List(a, c, d, e), x), LtQ(a, C0), GtQ(c, C0)))),
          IIntegrate(1186,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(CN1, a, c), C2))),
                      Condition(
                          Subtract(
                              Simp(Times(e, x, Plus(q,
                                  Times(c, Sqr(x))),
                                  Power(Times(c, Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1)), x),
                              Simp(
                                  Times(CSqrt2, e, q, Sqrt(
                                      Times(
                                          Subtract(a, Times(q,
                                              Sqr(x))),
                                          Power(Plus(a, Times(q, Sqr(x))), CN1))),
                                      Sqrt(Times(Plus(a, Times(q, Sqr(x))),
                                          Power(q, CN1))),
                                      EllipticE(ArcSin(Times(x,
                                          Power(Times(Plus(a, Times(q, Sqr(x))),
                                              Power(Times(C2, q), CN1)), CN1D2))),
                                          C1D2),
                                      Power(
                                          Times(c, Sqrt(Plus(a, Times(c, Power(x, C4)))),
                                              Sqrt(
                                                  Times(a, Power(Plus(a, Times(q, Sqr(x))), CN1)))),
                                          CN1)),
                                  x)),
                          EqQ(Plus(Times(c, d), Times(e, q)), C0))),
                  And(FreeQ(List(a, c, d, e), x), LtQ(a, C0), GtQ(c, C0)))),
          IIntegrate(1187,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Condition(Plus(Dist(
                          Times(Subtract(Times(C2, c, d), Times(e, Subtract(b, q))),
                              Power(Times(C2, c), CN1)),
                          Integrate(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2),
                              x),
                          x),
                          Dist(Times(e, Power(Times(C2, c), CN1)),
                              Integrate(Times(Plus(b, Negate(q), Times(C2, c, Sqr(x))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2)),
                                  x),
                              x)),
                          NeQ(Subtract(Times(C2, c, d), Times(e, Subtract(b, q))), C0))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), LtQ(a,
                          C0),
                      GtQ(c, C0)))),
          IIntegrate(1188,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(CN1, a, c), C2))),
                      Condition(
                          Subtract(
                              Dist(Times(Plus(Times(c, d), Times(e, q)), Power(c, CN1)),
                                  Integrate(Power(Plus(a, Times(c, Power(x, C4))), CN1D2), x), x),
                              Dist(Times(e, Power(c, CN1)),
                                  Integrate(
                                      Times(Subtract(q, Times(c, Sqr(x))),
                                          Power(Plus(a, Times(c, Power(x, C4))), CN1D2)),
                                      x),
                                  x)),
                          NeQ(Plus(Times(c, d), Times(e, q)), C0))),
                  And(FreeQ(List(a, c, d, e), x), LtQ(a, C0), GtQ(c, C0)))),
          IIntegrate(1189,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Condition(
                          Plus(
                              Dist(d,
                                  Integrate(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      CN1D2), x),
                                  x),
                              Dist(e,
                                  Integrate(Times(Sqr(x),
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                          CN1D2)),
                                      x),
                                  x)),
                          Or(PosQ(Times(Plus(b, q),
                              Power(a, CN1))), PosQ(
                                  Times(Subtract(b, q), Power(a, CN1)))))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(1190,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(Dist(d, Integrate(Power(Plus(a, Times(c, Power(x, C4))), CN1D2), x), x),
                      Dist(e,
                          Integrate(Times(Sqr(x), Power(Plus(a, Times(c, Power(x, C4))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), GtQ(Times(CN1, a, c), C0)))),
          IIntegrate(1191,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Condition(
                          Negate(Simp(Times(a, e,
                              Rt(Times(CN1, Plus(b, q), Power(Times(C2, a), CN1)), C2),
                              Sqrt(Plus(C1, Times(Plus(b, q), Sqr(x), Power(Times(C2, a), CN1)))),
                              Sqrt(Plus(C1,
                                  Times(Subtract(b, q), Sqr(x), Power(Times(C2, a), CN1)))),
                              EllipticE(
                                  ArcSin(Times(
                                      Rt(Times(CN1, Plus(b, q), Power(Times(C2, a), CN1)), C2), x)),
                                  Times(Subtract(b, q), Power(Plus(b, q), CN1))),
                              Power(
                                  Times(c, Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                  CN1)),
                              x)),
                          And(NegQ(Times(Plus(b, q), Power(a, CN1))),
                              EqQ(Subtract(Times(C2, c, d), Times(e, Plus(b, q))), C0),
                              Not(SimplerSqrtQ(Times(CN1, Subtract(b, q), Power(Times(C2, a), CN1)),
                                  Times(CN1, Plus(b, q), Power(Times(C2, a), CN1))))))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(1192,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Condition(Plus(Dist(
                          Times(Subtract(Times(C2, c, d), Times(e, Plus(b, q))),
                              Power(Times(C2, c), CN1)),
                          Integrate(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2),
                              x),
                          x),
                          Dist(Times(e, Power(Times(C2, c), CN1)),
                              Integrate(Times(Plus(b, q, Times(C2, c, Sqr(x))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2)),
                                  x),
                              x)),
                          And(NegQ(Times(Plus(b, q), Power(a, CN1))),
                              NeQ(Subtract(Times(C2, c, d), Times(e, Plus(b, q))), C0),
                              Not(SimplerSqrtQ(Times(CN1, Subtract(b, q), Power(Times(C2, a), CN1)),
                                  Times(CN1, Plus(b, q), Power(Times(C2, a), CN1))))))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(1193,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Condition(Negate(Simp(Times(a, e,
                          Rt(Times(CN1, Subtract(b, q), Power(Times(C2, a), CN1)), C2),
                          Sqrt(Plus(C1, Times(Subtract(b, q), Sqr(x), Power(Times(C2, a), CN1)))),
                          Sqrt(Plus(C1, Times(Plus(b, q), Sqr(x), Power(Times(C2, a), CN1)))),
                          EllipticE(ArcSin(Times(
                              Rt(Times(CN1, Subtract(b, q), Power(Times(C2, a), CN1)), C2), x)),
                              Times(Plus(b, q), Power(Subtract(b, q), CN1))),
                          Power(Times(c, Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                              CN1)),
                          x)), And(
                              NegQ(Times(Subtract(b, q), Power(a,
                                  CN1))),
                              EqQ(Subtract(Times(C2, c, d), Times(e, Subtract(b, q))), C0)))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(1194,
              Integrate(
                  Times(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                  Condition(
                      Plus(Dist(
                          Times(Subtract(Times(C2, c, d), Times(e, Subtract(b, q))),
                              Power(Times(C2, c), CN1)),
                          Integrate(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2),
                              x),
                          x),
                          Dist(Times(e, Power(Times(C2, c), CN1)),
                              Integrate(Times(Plus(b, Negate(q), Times(C2, c, Sqr(x))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2)),
                                  x),
                              x)),
                      And(NegQ(Times(Subtract(b, q), Power(a, CN1))),
                          NeQ(Subtract(Times(C2, c, d), Times(e, Subtract(b, q))), C0)))),
                  And(FreeQ(List(a, b, c, d, e), x), GtQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(1195,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(c, Power(a, CN1)), C4))),
                      Condition(
                          Plus(
                              Negate(
                                  Simp(Times(d, x,
                                      Sqrt(Plus(a, Times(b, Sqr(x)), Times(c,
                                          Power(x, C4)))),
                                      Power(Times(a, Plus(C1, Times(Sqr(q), Sqr(x)))), CN1)),
                                      x)),
                              Simp(Times(d, Plus(C1, Times(Sqr(q), Sqr(x))),
                                  Sqrt(Times(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      Power(Times(a, Sqr(Plus(C1, Times(Sqr(q), Sqr(x))))), CN1))),
                                  EllipticE(Times(C2, ArcTan(Times(q, x))),
                                      Subtract(C1D2, Times(b, Sqr(q), Power(Times(C4, c), CN1)))),
                                  Power(
                                      Times(q,
                                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                      CN1)),
                                  x)),
                          EqQ(Plus(e, Times(d, Sqr(q))), C0))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      PosQ(Times(c, Power(a, CN1)))))),
          IIntegrate(1196,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(c, Power(a, CN1)), C4))),
                      Condition(
                          Plus(
                              Negate(
                                  Simp(
                                      Times(
                                          d, x, Sqrt(Plus(a, Times(c, Power(x, C4)))), Power(Times(
                                              a, Plus(C1, Times(Sqr(q), Sqr(x)))), CN1)),
                                      x)),
                              Simp(Times(d, Plus(C1, Times(Sqr(q), Sqr(x))),
                                  Sqrt(Times(Plus(a, Times(c, Power(x, C4))),
                                      Power(Times(a, Sqr(Plus(C1, Times(Sqr(q), Sqr(x))))), CN1))),
                                  EllipticE(Times(C2, ArcTan(Times(q, x))), C1D2), Power(Times(q,
                                      Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1)),
                                  x)),
                          EqQ(Plus(e, Times(d, Sqr(q))), C0))),
                  And(FreeQ(List(a, c, d, e), x), PosQ(Times(c, Power(a, CN1)))))),
          IIntegrate(1197,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(c, Power(a, CN1)), C2))),
                      Condition(
                          Subtract(
                              Dist(Times(Plus(e, Times(d, q)), Power(q, CN1)),
                                  Integrate(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      CN1D2), x),
                                  x),
                              Dist(Times(e, Power(q, CN1)),
                                  Integrate(Times(Subtract(C1, Times(q, Sqr(x))),
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                          CN1D2)),
                                      x),
                                  x)),
                          NeQ(Plus(e, Times(d, q)), C0))),
                  And(FreeQ(List(a, b, c, d,
                      e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      PosQ(Times(c, Power(a, CN1)))))),
          IIntegrate(1198,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(c, Power(a, CN1)), C2))),
                      Condition(Subtract(
                          Dist(Times(Plus(e, Times(d, q)), Power(q, CN1)),
                              Integrate(Power(Plus(a, Times(c, Power(x, C4))), CN1D2), x), x),
                          Dist(Times(e, Power(q, CN1)),
                              Integrate(Times(Subtract(C1, Times(q, Sqr(x))),
                                  Power(Plus(a, Times(c, Power(x, C4))), CN1D2)), x),
                              x)),
                          NeQ(Plus(e, Times(d, q)), C0))),
                  And(FreeQ(List(a, c, d, e), x), PosQ(Times(c, Power(a, CN1)))))),
          IIntegrate(1199,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(d, Power(a,
                          CN1D2)),
                      Integrate(
                          Times(
                              Sqrt(Plus(C1, Times(e, Sqr(x), Power(d, CN1)))), Power(Subtract(C1,
                                  Times(e, Sqr(x), Power(d, CN1))), CN1D2)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e), x), NegQ(Times(c, Power(a,
                      CN1))), EqQ(Plus(Times(c, Sqr(d)),
                          Times(a, Sqr(e))), C0),
                      GtQ(a, C0)))),
          IIntegrate(1200,
              Integrate(Times(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)), x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Plus(C1, Times(c, Power(x, C4), Power(a, CN1)))),
                          Power(Plus(a, Times(c, Power(x, C4))), CN1D2)),
                      Integrate(Times(Plus(d, Times(e, Sqr(x))),
                          Power(Plus(C1, Times(c, Power(x, C4), Power(a, CN1))), CN1D2)), x),
                      x),
                  And(FreeQ(List(a, c, d, e), x), NegQ(Times(c, Power(a, CN1))),
                      EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(GtQ(a, C0))))));
}
