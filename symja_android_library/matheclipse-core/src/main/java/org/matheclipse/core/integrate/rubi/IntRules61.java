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
class IntRules61 {
  public static IAST RULES =
      List(
          IIntegrate(1221,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                              Times(a, Sqr(e))), CN1),
                          Integrate(
                              Times(
                                  Subtract(Subtract(Times(c, d), Times(b,
                                      e)), Times(c, e,
                                          Sqr(x))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                              x),
                          x),
                      Dist(
                          Times(Sqr(e),
                              Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                  Plus(p, C1)), Power(Plus(d, Times(e, Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      ILtQ(Plus(p, C1D2), C0)))),
          IIntegrate(1222,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Plus(Dist(Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1),
                      Integrate(Times(Subtract(Times(c, d), Times(c, e, Sqr(x))),
                          Power(Plus(a, Times(c, Power(x, C4))), p)), x),
                      x),
                      Dist(Times(Sqr(e), Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(c, Power(x, C4))), Plus(p, C1)),
                                  Power(Plus(d, Times(e, Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                      ILtQ(Plus(p, C1D2), C0)))),
          IIntegrate(1223,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(Plus(Negate(Simp(
                  Times(Sqr(e), x, Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)), Sqrt(Plus(a,
                      Times(b, Sqr(x)), Times(c, Power(x, C4)))), Power(
                          Times(C2, d, Plus(q, C1),
                              Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))),
                          CN1)),
                  x)), Dist(
                      Power(Times(C2, d, Plus(q, C1), Plus(Times(c,
                          Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))), CN1),
                      Integrate(
                          Times(Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                              Simp(Plus(Times(a, Sqr(e), Plus(Times(C2, q), C3)),
                                  Times(C2, d, Subtract(Times(c, d), Times(b, e)), Plus(q, C1)),
                                  Times(CN1, C2, e,
                                      Subtract(Times(c, d, Plus(q, C1)),
                                          Times(b, e, Plus(q, C2))),
                                      Sqr(x)),
                                  Times(c, Sqr(e), Plus(Times(C2, q), C5), Power(x, C4))), x),
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2)),
                          x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), ILtQ(q,
                          CN1)))),
          IIntegrate(1224,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(Times(Sqr(e), x, Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                          Sqrt(Plus(a, Times(c, Power(x, C4)))),
                          Power(Times(C2, d, Plus(q, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                              CN1)),
                          x)),
                      Dist(
                          Power(
                              Times(C2, d, Plus(q, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                              CN1),
                          Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                              Simp(Plus(Times(a, Sqr(e), Plus(Times(C2, q), C3)),
                                  Times(C2, c, Sqr(d), Plus(q, C1)),
                                  Times(CN1, C2, e, c, d, Plus(q, C1), Sqr(x)),
                                  Times(c, Sqr(e), Plus(Times(C2, q), C5), Power(x, C4))), x),
                              Power(Plus(a, Times(c, Power(x, C4))), CN1D2)), x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), ILtQ(q, CN1)))),
          IIntegrate(1225,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN2),
                      Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))))),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Times(e, Power(d, CN1)), C2))),
                      Simp(
                          Times(c, Plus(d, Times(e, Sqr(x))),
                              Sqrt(Times(Sqr(e), Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                  Power(Times(c, Sqr(Plus(d, Times(e, Sqr(x))))), CN1))),
                              EllipticE(Times(C2, ArcTan(Times(q, x))),
                                  Times(Subtract(Times(C2, c, d), Times(b, e)),
                                      Power(Times(C4, c, d), CN1))),
                              Power(
                                  Times(C2, d, Sqr(e), q,
                                      Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      EqQ(Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0),
                      PosQ(Times(e, Power(d, CN1)))))),
          IIntegrate(1226,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN2),
                      Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              x, Sqrt(Plus(a, Times(b, Sqr(x)),
                                  Times(c, Power(x, C4)))),
                              Power(Times(C2, d, Plus(d, Times(e, Sqr(x)))), CN1)),
                          x),
                      Dist(
                          Times(c, Power(Times(C2, d, Sqr(e)),
                              CN1)),
                          Integrate(
                              Times(
                                  Subtract(d, Times(e,
                                      Sqr(x))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(
                                  Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))),
                                  Power(Times(C2, d, Sqr(e)), CN1)),
                              Integrate(
                                  Power(
                                      Times(Plus(d, Times(e, Sqr(x))),
                                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                      CN1),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a,
                      c)), C0), NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0)))),
          IIntegrate(1227,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN2),
                      Sqrt(Plus(a_, Times(c_DEFAULT, Power(x_, C4))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              x, Sqrt(Plus(a, Times(c, Power(x, C4)))), Power(
                                  Times(C2, d, Plus(d, Times(e, Sqr(x)))), CN1)),
                          x),
                      Dist(
                          Times(c, Power(Times(C2, d, Sqr(e)),
                              CN1)),
                          Integrate(
                              Times(
                                  Subtract(d, Times(e,
                                      Sqr(x))),
                                  Power(Plus(a, Times(c, Power(x, C4))), CN1D2)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(
                                  Subtract(Times(c, Sqr(d)), Times(a, Sqr(e))),
                                  Power(Times(C2, d, Sqr(e)), CN1)),
                              Integrate(Power(Times(Plus(d, Times(e, Sqr(x))),
                                  Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1), x),
                              x))),
                  And(FreeQ(List(a, c, d,
                      e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0)))),
          IIntegrate(1228,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(Module(List($s("aa"), $s("bb"), $s("cc")),
                  Integrate(
                      ReplaceAll(
                          ExpandIntegrand(
                              Power(Plus($s("aa"), Times($s("bb"), Sqr(x)),
                                  Times($s("cc"), Power(x, C4))), CN1D2),
                              Times(Power(Plus(d, Times(e, Sqr(x))), q),
                                  Power(Plus($s("aa"), Times($s("bb"), Sqr(x)),
                                      Times($s("cc"), Power(x, C4))), Plus(p, C1D2))),
                              x),
                          List(Rule($s("aa"), a), Rule($s("bb"), b), Rule($s("cc"), c))),
                      x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0),
                      ILtQ(q, C0), IntegerQ(Plus(p, C1D2))))),
          IIntegrate(1229,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_), Power(
                          Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Module(List($s("aa"), $s("cc")),
                      Integrate(
                          ReplaceAll(
                              ExpandIntegrand(
                                  Power(Plus($s("aa"), Times($s("cc"), Power(x, C4))), CN1D2),
                                  Times(Power(Plus(d, Times(e, Sqr(x))), q),
                                      Power(Plus($s("aa"), Times($s("cc"), Power(x, C4))),
                                          Plus(p, C1D2))),
                                  x),
                              List(Rule($s("aa"), a), Rule($s("cc"), c))),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(
                      d)), Times(a,
                          Sqr(e))),
                      C0), ILtQ(q, C0), IntegerQ(Plus(p, C1D2))))),
          IIntegrate(1230,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Simp(Times(C1,
                      EllipticF(Times(C2, ArcSin(Times(Rt(Times(CN1, e, Power(d, CN1)), C2), x))),
                          Times(b, d, Power(Times(C4, a, e), CN1))),
                      Power(Times(C2, Sqrt(a), Sqrt(d), Rt(Times(CN1, e, Power(d, CN1)), C2)),
                          CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Subtract(Times(c, d), Times(b, e)), C0),
                      GtQ(a, C0), GtQ(d, C0)))),
          IIntegrate(1231,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1D2),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(Times(Sqrt(Times(Plus(d, Times(e, Sqr(x))), Power(d, CN1))),
                      Sqrt(Times(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), Power(a, CN1))),
                      Power(
                          Times(Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                          CN1)),
                      Integrate(
                          Power(Times(Sqrt(Plus(C1, Times(e, Sqr(x), Power(d, CN1)))),
                              Sqrt(Plus(C1, Times(b, Sqr(x), Power(a, CN1)),
                                  Times(c, Power(x, C4), Power(a, CN1))))),
                              CN1),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d,
                      e), x), EqQ(Subtract(Times(c, d), Times(b, e)),
                          C0),
                      Not(And(GtQ(a, C0), GtQ(d, C0)))))),
          IIntegrate(1232,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1D2),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(x, C3), Sqrt(Plus(e, Times(d, Power(x, CN2)))),
                          Sqrt(Plus(c, Times(b, Power(x, CN2)), Times(a, Power(x, CN4)))),
                          Power(
                              Times(Sqrt(Plus(d, Times(e, Sqr(x)))),
                                  Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                              CN1)),
                      Integrate(
                          Power(
                              Times(Power(x, C3), Sqrt(Plus(e, Times(d, Power(x, CN2)))),
                                  Sqrt(Plus(c, Times(b, Power(x, CN2)), Times(a, Power(x, CN4))))),
                              CN1),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a,
                      c)), C0), NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0)))),
          IIntegrate(1233,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2), Power(
                          Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
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
                          Power(
                              Times(
                                  Power(x, C3), Sqrt(Plus(e,
                                      Times(d, Power(x, CN2)))),
                                  Sqrt(Plus(c, Times(a, Power(x, CN4))))),
                              CN1),
                          x),
                      x),
                  And(FreeQ(List(a, c, d,
                      e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0)))),
          IIntegrate(1234,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1D2),
                      Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(Sqrt(a),
                          EllipticE(
                              Times(C2, ArcSin(
                                  Times(Rt(Times(CN1, e, Power(d, CN1)), C2), x))),
                              Times(b, d, Power(Times(C4, a, e), CN1))),
                          Power(Times(C2, Sqrt(d), Rt(Times(CN1, e, Power(d, CN1)), C2)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Subtract(Times(c, d),
                      Times(b, e)), C0), GtQ(a,
                          C0),
                      GtQ(d, C0)))),
          IIntegrate(1235,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1D2),
                      Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))))),
                  x_Symbol),
              Condition(
                  Dist(Times(Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4)))),
                      Sqrt(Times(Plus(d, Times(e, Sqr(x))), Power(d, CN1))),
                      Power(Times(Sqrt(Plus(d, Times(e, Sqr(x)))),
                          Sqrt(Times(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                              Power(a, CN1)))),
                          CN1)),
                      Integrate(
                          Times(
                              Sqrt(Plus(C1, Times(b, Sqr(x), Power(a, CN1)),
                                  Times(c, Power(x, C4), Power(a, CN1)))),
                              Power(Plus(C1, Times(e, Sqr(x), Power(d, CN1))), CN1D2)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d,
                      e), x), EqQ(Subtract(Times(c, d), Times(b, e)),
                          C0),
                      Not(And(GtQ(a, C0), GtQ(d, C0)))))),
          IIntegrate(1236,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1D2),
                      Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Plus(e, Times(d, Power(x, CN2)))),
                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4)))),
                          Power(
                              Times(x, Sqrt(Plus(d, Times(e, Sqr(x)))),
                                  Sqrt(Plus(c, Times(b, Power(x, CN2)), Times(a, Power(x, CN4))))),
                              CN1)),
                      Integrate(
                          Times(
                              x, Sqrt(Plus(c, Times(b, Power(x,
                                  CN2)), Times(a,
                                      Power(x, CN4)))),
                              Power(Plus(e, Times(d, Power(x, CN2))), CN1D2)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a,
                      c)), C0), NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0)))),
          IIntegrate(1237,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), CN1D2),
                      Sqrt(Plus(a_, Times(c_DEFAULT, Power(x_, C4))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Plus(e, Times(d, Power(x, CN2)))),
                          Sqrt(Plus(a, Times(c, Power(x, C4)))),
                          Power(Times(x, Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Sqrt(Plus(c, Times(a, Power(x, CN4))))), CN1)),
                      Integrate(
                          Times(x, Sqrt(Plus(c, Times(a, Power(x, CN4)))),
                              Power(Plus(e, Times(d, Power(x, CN2))), CN1D2)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d,
                      e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0)))),
          IIntegrate(1238,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Plus(d, Times(e, Sqr(x))), q), Power(Plus(a, Times(b, Sqr(x)),
                                  Times(c, Power(x, C4))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, p, q), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Or(And(IntegerQ(p), IntegerQ(q)),
                          IGtQ(p, C0), IGtQ(q, C0))))),
          IIntegrate(1239,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Plus(d, Times(e, Sqr(x))), q),
                              Power(Plus(a, Times(c, Power(x, C4))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, p,
                      q), x), Or(And(IntegerQ(p), IntegerQ(q)),
                          IGtQ(p, C0))))),
          IIntegrate(1240,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(Power(Plus(a, Times(c, Power(x, C4))), p), Power(
                      Subtract(Times(d, Power(Subtract(Sqr(d), Times(Sqr(e), Power(x, C4))), CN1)),
                          Times(e, Sqr(x),
                              Power(Subtract(Sqr(d), Times(Sqr(e), Power(x, C4))), CN1))),
                      Negate(q)), x), x),
                  And(FreeQ(List(a, c, d, e, p), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)),
                      ILtQ(q, C0)))));
}
