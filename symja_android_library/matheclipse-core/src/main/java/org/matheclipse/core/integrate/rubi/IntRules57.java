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
class IntRules57 {
  public static IAST RULES =
      List(
          IIntegrate(1141,
              Integrate(
                  Times(Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(a, IntPart(p)),
                          Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), FracPart(
                              p)),
                          Power(
                              Times(
                                  Power(
                                      Plus(C1,
                                          Times(C2, c, Sqr(x),
                                              Power(
                                                  Plus(b,
                                                      Rt(Subtract(Sqr(b), Times(C4, a, c)), C2)),
                                                  CN1))),
                                      FracPart(p)),
                                  Power(Plus(C1, Times(C2, c, Sqr(x),
                                      Power(Subtract(b, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2)),
                                          CN1))),
                                      FracPart(p))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(d,
                                  x), m),
                              Power(Plus(C1,
                                  Times(C2, c, Sqr(x),
                                      Power(Plus(b, Sqrt(Subtract(Sqr(b), Times(C4, a, c)))),
                                          CN1))),
                                  p),
                              Power(Plus(C1,
                                  Times(C2, c, Sqr(x),
                                      Power(Subtract(b, Sqrt(Subtract(Sqr(b), Times(C4, a, c)))),
                                          CN1))),
                                  p)),
                          x),
                      x),
                  FreeQ(List(a, b, c, d, m, p), x))),
          IIntegrate(1142,
              Integrate(
                  Times(Power(u_, m_DEFAULT),
                      Power(
                          Plus(
                              a_DEFAULT, Times(b_DEFAULT, Sqr(
                                  v_)),
                              Times(c_DEFAULT, Power(v_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(u, m), Power(Times(Coefficient(v, x, C1), Power(v, m)),
                          CN1)),
                      Subst(
                          Integrate(
                              Times(Power(x, m),
                                  Power(
                                      Plus(a, Times(b, Sqr(x)), Times(c,
                                          Power(x, Times(C2, C2)))),
                                      p)),
                              x),
                          x, v),
                      x),
                  And(FreeQ(List(a, b, c, m, p), x), LinearPairQ(u, v, x)))),
          IIntegrate(1143,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(
                          Plus(Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT,
                              Power(x_, C4))),
                          QQ(-3L, 4L))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(CN2, Subtract(Times(c, d), Times(b, e)),
                          Power(Plus(Times(b, Sqr(x)), Times(c, Power(x, C4))), C1D4),
                          Power(Times(b, c, x), CN1)), x),
                      Dist(Times(e, Power(c, CN1)),
                          Integrate(
                              Times(Power(Plus(Times(b, Sqr(x)), Times(c, Power(x, C4))), C1D4),
                                  Power(x, CN2)),
                              x),
                          x)),
                  FreeQ(List(b, c, d, e), x))),
          IIntegrate(1144,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(
                          e, Power(Plus(Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p,
                              C1)),
                          Power(Times(c, Plus(Times(C4, p), C3), x), CN1)),
                      x),
                  And(FreeQ(List(b, c, d, e, p), x), Not(IntegerQ(p)),
                      NeQ(Plus(Times(C4, p),
                          C3), C0),
                      EqQ(Subtract(Times(b, e, Plus(Times(C2, p), C1)),
                          Times(c, d, Plus(Times(C4, p), C3))), C0)))),
          IIntegrate(1145,
              Integrate(
                  Times(
                      Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(e,
                              Power(Plus(Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p,
                                  C1)),
                              Power(Times(c, Plus(Times(C4, p), C3), x), CN1)),
                          x),
                      Dist(
                          Times(
                              Subtract(Times(b, e, Plus(Times(C2, p), C1)), Times(c, d,
                                  Plus(Times(C4, p), C3))),
                              Power(Times(c, Plus(Times(C4, p), C3)), CN1)),
                          Integrate(Power(Plus(Times(b, Sqr(x)), Times(c, Power(x, C4))), p),
                              x),
                          x)),
                  And(FreeQ(List(b, c, d, e, p), x), Not(IntegerQ(p)),
                      NeQ(Plus(Times(C4, p),
                          C3), C0),
                      NeQ(Subtract(Times(b, e, Plus(Times(C2, p), C1)),
                          Times(c, d, Plus(Times(C4, p), C3))), C0)))),
          IIntegrate(1146,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(Plus(Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(Times(b, Sqr(x)), Times(c, Power(x, C4))), FracPart(p)),
                          Power(Times(Power(x, Times(C2, FracPart(p))),
                              Power(Plus(b, Times(c, Sqr(x))), FracPart(p))), CN1)),
                      Integrate(
                          Times(
                              Power(x, Times(C2, p)), Power(Plus(d, Times(e, Sqr(x))),
                                  q),
                              Power(Plus(b, Times(c, Sqr(x))), p)),
                          x),
                      x),
                  And(FreeQ(List(b, c, d, e, p, q), x), Not(IntegerQ(p))))),
          IIntegrate(1147,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p), Power(
                          Power(Plus(d, Times(e, Sqr(x))), Times(C2, p)), CN1)),
                      Integrate(Power(Plus(d, Times(e, Sqr(x))), Plus(q, Times(C2, p))), x), x),
                  And(FreeQ(List(a, b, c, d, e, p, q), x),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p)), EqQ(
                          Subtract(Times(C2, c, d), Times(b, e)), C0)))),
          IIntegrate(1148,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), FracPart(p)),
                          Power(Times(Power(c, IntPart(p)),
                              Power(Plus(Times(C1D2, b), Times(c, Sqr(x))),
                                  Times(C2, FracPart(p)))),
                              CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, Sqr(x))), q),
                              Power(Plus(Times(C1D2, b), Times(c, Sqr(x))), Times(C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, p,
                      q), x), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      Not(IntegerQ(p))))),
          IIntegrate(1149,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(Plus(d, Times(e, Sqr(x))), Plus(p,
                              q)),
                          Power(Plus(Times(a, Power(d, CN1)), Times(c, Sqr(x), Power(e, CN1))), p)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, q), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0),
                      IntegerQ(p)))),
          IIntegrate(1150,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT), Power(
                      Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(Plus(d, Times(e, Sqr(x))), Plus(p,
                              q)),
                          Power(Plus(Times(a, Power(d, CN1)), Times(c, Sqr(x), Power(e, CN1))), p)),
                      x),
                  And(FreeQ(List(a, c, d, e, q), x), EqQ(Plus(Times(c, Sqr(
                      d)), Times(a,
                          Sqr(e))),
                      C0), IntegerQ(p)))),
          IIntegrate(1151,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), FracPart(p)),
                          Power(Times(Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(Plus(Times(a, Power(d, CN1)), Times(c, Sqr(x), Power(e, CN1))),
                                  FracPart(p))),
                              CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, Sqr(x))), Plus(p, q)),
                              Power(Plus(Times(a, Power(d, CN1)), Times(c, Sqr(x), Power(e, CN1))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, p, q), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      EqQ(Plus(Times(c, Sqr(
                          d)), Times(CN1, b, d,
                              e),
                          Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p))))),
          IIntegrate(1152,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(a, Times(c, Power(x, C4))), FracPart(p)),
                          Power(Times(Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(Plus(Times(a, Power(d, CN1)), Times(c, Sqr(x), Power(e, CN1))),
                                  FracPart(p))),
                              CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, Sqr(x))), Plus(p, q)),
                              Power(
                                  Plus(Times(a, Power(d, CN1)),
                                      Times(c, Sqr(x), Power(e, CN1))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, p, q),
                      x), EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                      Not(IntegerQ(p))))),
          IIntegrate(1153,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Plus(d, Times(e, Sqr(x))), q), Power(
                              Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      IGtQ(p, C0), IGtQ(q, CN2)))),
          IIntegrate(1154,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT), Power(Plus(a_,
                          Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Plus(d, Times(e, Sqr(x))),
                                  q),
                              Power(Plus(a, Times(c, Power(x, C4))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)),
                      Times(a, Sqr(e))), C0), IGtQ(p,
                          C0),
                      IGtQ(q, CN2)))),
          IIntegrate(1155,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(a, p), x, Power(Plus(d, Times(e,
                                  Sqr(x))), Plus(q,
                                      C1)),
                              Power(d, CN1)),
                          x),
                      Dist(Power(d, CN1),
                          Integrate(
                              Times(Sqr(x), Power(Plus(d, Times(e, Sqr(x))), q),
                                  Subtract(Times(d, PolynomialQuotient(Subtract(
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p),
                                      Power(a, p)), Sqr(x), x)), Times(e, Power(a, p),
                                          Plus(Times(C2, q), C3)))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                      IGtQ(p, C0), ILtQ(Plus(q,
                          C1D2), C0),
                      LtQ(Plus(Times(C4, p), Times(C2, q), C1), C0)))),
          IIntegrate(1156,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(a, p), x, Power(Plus(d, Times(e,
                                  Sqr(x))), Plus(q,
                                      C1)),
                              Power(d, CN1)),
                          x),
                      Dist(Power(d, CN1),
                          Integrate(Times(Sqr(x), Power(Plus(d, Times(e, Sqr(x))), q),
                              Subtract(
                                  Times(d,
                                      PolynomialQuotient(
                                          Subtract(Power(Plus(a, Times(c, Power(x, C4))), p),
                                              Power(a, p)),
                                          Sqr(x), x)),
                                  Times(e, Power(a, p), Plus(Times(C2, q), C3)))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(
                      d)), Times(a,
                          Sqr(e))),
                      C0), IGtQ(p, C0), ILtQ(Plus(q, C1D2), C0),
                      LtQ(Plus(Times(C4, p), Times(C2, q), C1), C0)))),
          IIntegrate(1157,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("§qx"),
                          PolynomialQuotient(
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                  p),
                              Plus(d, Times(e, Sqr(x))), x)),
                          Set($s("R"),
                              Coeff(PolynomialRemainder(
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p),
                                  Plus(d, Times(e, Sqr(x))), x), x, C0))),
                      Plus(
                          Negate(Simp(
                              Times($s("R"), x, Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                                  Power(Times(C2, d, Plus(q, C1)), CN1)),
                              x)),
                          Dist(Power(Times(C2, d, Plus(q, C1)), CN1),
                              Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                                  ExpandToSum(Plus(Times(C2, d, Plus(q, C1), $s("§qx")),
                                      Times($s("R"), Plus(Times(C2, q), C3))), x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                          Times(a, Sqr(e))), C0),
                      IGtQ(p, C0), LtQ(q, CN1)))),
          IIntegrate(1158,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          Sqr(x_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set($s("§qx"),
                              PolynomialQuotient(Power(Plus(a, Times(c, Power(x, C4))), p),
                                  Plus(d, Times(e, Sqr(x))), x)),
                          Set($s("R"),
                              Coeff(
                                  PolynomialRemainder(Power(Plus(a, Times(c, Power(x, C4))), p),
                                      Plus(d, Times(e, Sqr(x))), x),
                                  x, C0))),
                      Plus(
                          Negate(
                              Simp(
                                  Times($s("R"), x, Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                                      Power(Times(C2, d, Plus(q, C1)), CN1)),
                                  x)),
                          Dist(Power(Times(C2, d, Plus(q, C1)), CN1),
                              Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), Plus(q, C1)),
                                  ExpandToSum(Plus(Times(C2, d, Plus(q, C1), $s("§qx")),
                                      Times($s("R"), Plus(Times(C2, q), C3))), x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                      IGtQ(p, C0), LtQ(q, CN1)))),
          IIntegrate(1159,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(c, p), Power(x, Subtract(Times(C4, p), C1)),
                              Power(Plus(d, Times(e,
                                  Sqr(x))), Plus(q,
                                      C1)),
                              Power(Times(e, Plus(Times(C4, p), Times(C2, q), C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(e,
                              Plus(Times(C4, p), Times(C2, q), C1)), CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, Sqr(x))), q),
                                  ExpandToSum(
                                      Subtract(
                                          Subtract(
                                              Times(e, Plus(Times(C4, p), Times(C2, q), C1),
                                                  Power(Plus(a, Times(b, Sqr(x)),
                                                      Times(c, Power(x, C4))), p)),
                                              Times(d, Power(c, p), Subtract(Times(C4, p), C1),
                                                  Power(x, Subtract(Times(C4, p), C2)))),
                                          Times(e, Power(c, p),
                                              Plus(Times(C4, p), Times(C2, q), C1),
                                              Power(x, Times(C4, p)))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, q), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          C0),
                      IGtQ(p, C0), Not(LtQ(q, CN1))))),
          IIntegrate(1160,
              Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)), x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(c, p), Power(x, Subtract(Times(C4, p), C1)),
                              Power(Plus(d, Times(e,
                                  Sqr(x))), Plus(q,
                                      C1)),
                              Power(Times(e, Plus(Times(C4, p), Times(C2, q), C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(e,
                              Plus(Times(C4, p), Times(C2, q), C1)), CN1),
                          Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), q),
                              ExpandToSum(Subtract(
                                  Subtract(
                                      Times(e, Plus(Times(C4, p), Times(C2, q), C1),
                                          Power(Plus(a, Times(c, Power(x, C4))), p)),
                                      Times(d, Power(c, p), Subtract(Times(C4, p), C1),
                                          Power(x, Subtract(Times(C4, p), C2)))),
                                  Times(e, Power(c, p), Plus(Times(C4, p), Times(C2, q), C1),
                                      Power(x, Times(C4, p)))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, q), x),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), IGtQ(p, C0),
                      Not(LtQ(q, CN1))))));
}
