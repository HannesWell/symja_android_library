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
class IntRules20 {
  public static IAST RULES =
      List(
          IIntegrate(401,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), QQ(-3L, 4L)), Power(
                          Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Dist(Times(Sqrt(Times(CN1, b, Sqr(x), Power(a, CN1))), Power(Times(C2, x), CN1)),
                      Subst(
                          Integrate(
                              Power(Times(Sqrt(Times(CN1, b, x, Power(a, CN1))),
                                  Power(Plus(a, Times(b, x)), QQ(3L, 4L)), Plus(c, Times(d, x))),
                                  CN1),
                              x),
                          x, Sqr(x)),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(402,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Sqr(x_))), p_DEFAULT),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(b, Power(d, CN1)),
                          Integrate(Power(Plus(a, Times(b, Sqr(x))), Subtract(p, C1)), x), x),
                      Dist(Times(Subtract(Times(b, c), Times(a, d)), Power(d, CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sqr(x))), Subtract(p, C1)),
                                  Power(Plus(c, Times(d, Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), GtQ(p,
                          C0),
                      Or(EqQ(p, C1D2), EqQ(Denominator(p), C4))))),
          IIntegrate(403,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)), Integrate(
                              Power(Plus(a, Times(b, Sqr(x))), p), x),
                          x),
                      Dist(
                          Times(d, Power(Subtract(Times(b, c), Times(a, d)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sqr(x))), Plus(p, C1)), Power(
                                      Plus(c, Times(d, Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      LtQ(p, CN1), EqQ(Denominator(
                          p), C4),
                      Or(EqQ(p, QQ(-5L, 4L)), EqQ(p, QQ(-7L, 4L)))))),
          IIntegrate(404,
              Integrate(
                  Times(Sqrt(Plus(a_, Times(b_DEFAULT, Power(x_, C4)))),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Dist(Times(a, Power(c, CN1)),
                      Subst(
                          Integrate(Power(Subtract(C1, Times(C4, a, b, Power(x, C4))),
                              CN1), x),
                          x, Times(x, Power(Plus(a, Times(b, Power(x, C4))), CN1D2))),
                      x),
                  And(FreeQ(List(a, b, c,
                      d), x), EqQ(Plus(Times(b, c), Times(a, d)),
                          C0),
                      PosQ(Times(a, b))))),
          IIntegrate(405,
              Integrate(
                  Times(
                      Sqrt(Plus(a_, Times(b_DEFAULT,
                          Power(x_, C4)))),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(CN1, a, b), C4))),
                      Plus(
                          Simp(
                              Times(a,
                                  ArcTan(
                                      Times(
                                          q, x, Plus(a, Times(Sqr(q),
                                              Sqr(x))),
                                          Power(Times(a, Sqrt(Plus(a, Times(b, Power(x, C4))))),
                                              CN1))),
                                  Power(Times(C2, c, q), CN1)),
                              x),
                          Simp(
                              Times(a,
                                  ArcTanh(Times(q, x, Subtract(a, Times(Sqr(q), Sqr(x))),
                                      Power(Times(a, Sqrt(Plus(a, Times(b, Power(x, C4))))), CN1))),
                                  Power(Times(C2, c, q), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c,
                      d), x), EqQ(Plus(Times(b, c), Times(a, d)),
                          C0),
                      NegQ(Times(a, b))))),
          IIntegrate(406,
              Integrate(
                  Times(
                      Sqrt(Plus(a_, Times(b_DEFAULT,
                          Power(x_, C4)))),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(b, Power(d,
                              CN1)),
                          Integrate(Power(Plus(a, Times(b, Power(x, C4))), CN1D2), x), x),
                      Dist(
                          Times(Subtract(Times(b, c), Times(a, d)), Power(d,
                              CN1)),
                          Integrate(
                              Power(Times(Sqrt(Plus(a, Times(b, Power(x, C4)))),
                                  Plus(c, Times(d, Power(x, C4)))), CN1),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(407,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT,
                          Power(x_, C4))), C1D4),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(Plus(a, Times(b, Power(x, C4)))), Sqrt(
                              Times(a, Power(Plus(a, Times(b, Power(x, C4))), CN1)))),
                      Subst(
                          Integrate(
                              Power(Times(Sqrt(Subtract(C1, Times(b, Power(x, C4)))),
                                  Subtract(c, Times(Subtract(Times(b, c), Times(a, d)),
                                      Power(x, C4)))),
                                  CN1),
                              x),
                          x, Times(x, Power(Plus(a, Times(b, Power(x, C4))), CN1D4))),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(408,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT,
                          Power(x_, C4))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(b, Power(d, CN1)), Integrate(
                              Power(Plus(a, Times(b, Power(x, C4))), Subtract(p, C1)), x),
                          x),
                      Dist(Times(Subtract(Times(b, c), Times(a, d)), Power(d, CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Power(x, C4))), Subtract(p,
                                      C1)),
                                  Power(Plus(c, Times(d, Power(x, C4))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), Or(EqQ(p, QQ(3L, 4L)),
                          EqQ(p, QQ(5L, 4L)))))),
          IIntegrate(409,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT,
                          Power(x_, C4))), CN1D2),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Power(Times(C2,
                              c), CN1),
                          Integrate(
                              Power(
                                  Times(
                                      Sqrt(Plus(a,
                                          Times(b, Power(x, C4)))),
                                      Subtract(C1,
                                          Times(Rt(Times(CN1, d, Power(c, CN1)), C2), Sqr(x)))),
                                  CN1),
                              x),
                          x),
                      Dist(Power(Times(C2, c), CN1),
                          Integrate(
                              Power(
                                  Times(Sqrt(Plus(a, Times(b, Power(x, C4)))),
                                      Plus(C1,
                                          Times(Rt(Times(CN1, d, Power(c, CN1)), C2), Sqr(x)))),
                                  CN1),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(410,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C4))), QQ(-3L,
                          4L)),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, C4))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(b, Power(Subtract(Times(b, c), Times(a, d)),
                              CN1)),
                          Integrate(Power(Plus(a, Times(b, Power(x, C4))), QQ(-3L, 4L)), x), x),
                      Dist(
                          Times(d, Power(Subtract(Times(b, c), Times(a, d)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a,
                                      Times(b, Power(x, C4))), C1D4),
                                  Power(Plus(c, Times(d, Power(x, C4))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(411,
              Integrate(
                  Times(
                      Sqrt(Plus(a_,
                          Times(b_DEFAULT, Sqr(x_)))),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), QQ(-3L, 2L))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(
                          Sqrt(Plus(a,
                              Times(b, Sqr(x)))),
                          EllipticE(
                              ArcTan(Times(Rt(Times(d, Power(c, CN1)), C2),
                                  x)),
                              Subtract(C1, Times(b, c, Power(Times(a, d), CN1)))),
                          Power(
                              Times(c, Rt(Times(d, Power(c, CN1)), C2),
                                  Sqrt(Plus(c, Times(d, Sqr(x)))),
                                  Sqrt(Times(c, Plus(a, Times(b, Sqr(x))),
                                      Power(Times(a, Plus(c, Times(d, Sqr(x)))), CN1)))),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d), x), PosQ(Times(b,
                      Power(a, CN1))), PosQ(
                          Times(d, Power(c, CN1)))))),
          IIntegrate(412,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(x, Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c,
                                      Times(d, Power(x, n))), q),
                                  Power(Times(a, n, Plus(p, C1)), CN1)),
                              x)),
                      Dist(Power(Times(a, n, Plus(p, C1)), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                                  Simp(Plus(Times(c, Plus(Times(n, Plus(p, C1)), C1)),
                                      Times(d, Plus(Times(n, Plus(p, q, C1)), C1), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, n), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), LtQ(p,
                          CN1),
                      LtQ(C0, q, C1), IntBinomialQ(a, b, c, d, n, p, q, x)))),
          IIntegrate(413,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Subtract(Times(a, d), Times(c, b)), x,
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)), Power(
                                  Times(a, b, n, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(a, b, n,
                              Plus(p, C1)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Power(x,
                                      n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d,
                                      Power(x, n))), Subtract(q,
                                          C2)),
                                  Simp(Plus(
                                      Times(c,
                                          Subtract(Times(a, d),
                                              Times(c, b, Plus(Times(n, Plus(p, C1)), C1)))),
                                      Times(d,
                                          Subtract(Times(a, d, Plus(Times(n, Subtract(q, C1)), C1)),
                                              Times(b, c, Plus(Times(n, Plus(p, q)), C1))),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, n), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      LtQ(p, CN1), GtQ(q, C1), IntBinomialQ(a, b, c, d, n, p, q, x)))),
          IIntegrate(414,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(b, x, Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Plus(q,
                                      C1)),
                                  Power(
                                      Times(a, n, Plus(p, C1),
                                          Subtract(Times(b, c), Times(a, d))),
                                      CN1)),
                              x)),
                      Dist(
                          Power(Times(a, n, Plus(p, C1),
                              Subtract(Times(b, c), Times(a, d))), CN1),
                          Integrate(Times(Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), q),
                              Simp(
                                  Plus(Times(b, c),
                                      Times(n, Plus(p, C1), Subtract(Times(b, c), Times(a, d))),
                                      Times(d, b, Plus(Times(n, Plus(p, q, C2)), C1), Power(x, n))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, n, q), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      LtQ(p, CN1), Not(And(Not(IntegerQ(p)), IntegerQ(q),
                          LtQ(q, CN1))),
                      IntBinomialQ(a, b, c, d, n, p, q, x)))),
          IIntegrate(415,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Plus(a, Times(b, Power(x, n))), p),
                              Power(Plus(c, Times(d, Power(x, n))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), IntegersQ(p, q), GtQ(Plus(p, q), C0)))),
          IIntegrate(416,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              d, x, Power(Plus(a, Times(b, Power(x,
                                  n))), Plus(p, C1)),
                              Power(
                                  Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                              Power(Times(b, Plus(Times(n, Plus(p, q)), C1)), CN1)),
                          x),
                      Dist(Power(Times(b, Plus(Times(n, Plus(p, q)), C1)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Power(x,
                                      n))), p),
                                  Power(Plus(c, Times(d,
                                      Power(x, n))), Subtract(q,
                                          C2)),
                                  Simp(
                                      Plus(
                                          Times(c,
                                              Subtract(Times(b, c, Plus(Times(n, Plus(p, q)), C1)),
                                                  Times(a, d))),
                                          Times(d,
                                              Subtract(
                                                  Times(b, c, Plus(
                                                      Times(n, Subtract(Plus(p, Times(C2, q)), C1)),
                                                      C1)),
                                                  Times(a, d, Plus(Times(n, Subtract(q, C1)), C1))),
                                              Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, n, p), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      GtQ(q, C1), NeQ(Plus(Times(n,
                          Plus(p, q)), C1), C0),
                      Not(IGtQ(p, C1)), IntBinomialQ(a, b, c, d, n, p, q, x)))),
          IIntegrate(417,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(x, Power(Plus(a, Times(b, Power(x, n))), p),
                          Power(Plus(c, Times(d, Power(x, n))),
                              q),
                          Power(Plus(Times(n, Plus(p, q)), C1), CN1)), x),
                      Dist(
                          Times(n, Power(Plus(Times(n, Plus(p, q)), C1),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Power(x,
                                      n))), Subtract(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                                  Simp(Plus(Times(a, c, Plus(p, q)),
                                      Times(Plus(Times(q, Subtract(Times(b, c), Times(a, d))),
                                          Times(a, d, Plus(p, q))), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, n), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), GtQ(q,
                          C0),
                      GtQ(p, C0), IntBinomialQ(a, b, c, d, n, p, q, x)))),
          IIntegrate(418,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1D2), Power(
                          Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(Sqrt(Plus(a, Times(b, Sqr(x)))),
                          EllipticF(
                              ArcTan(Times(Rt(Times(d, Power(c, CN1)), C2), x)), Subtract(C1,
                                  Times(b, c, Power(Times(a, d), CN1)))),
                          Power(Times(a, Rt(Times(d, Power(c, CN1)), C2),
                              Sqrt(Plus(c, Times(d, Sqr(x)))), Sqrt(Times(c,
                                  Plus(a, Times(b, Sqr(x))), Power(
                                      Times(a, Plus(c, Times(d, Sqr(x)))), CN1)))),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d), x), PosQ(Times(d, Power(c, CN1))),
                      PosQ(Times(b, Power(a,
                          CN1))),
                      Not(SimplerSqrtQ(Times(b, Power(a, CN1)), Times(d, Power(c, CN1))))))),
          IIntegrate(419,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1D2),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(C1,
                          EllipticF(
                              ArcSin(Times(Rt(Times(CN1, d, Power(c, CN1)), C2), x)),
                              Times(b, c, Power(Times(a, d), CN1))),
                          Power(Times(Sqrt(a), Sqrt(c), Rt(Times(CN1, d, Power(c, CN1)), C2)),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NegQ(Times(d, Power(c, CN1))), GtQ(c, C0),
                      GtQ(a, C0), Not(
                          And(NegQ(Times(b, Power(a, CN1))),
                              SimplerSqrtQ(Times(CN1, b, Power(a,
                                  CN1)), Times(CN1, d,
                                      Power(c, CN1)))))))),
          IIntegrate(420,
              Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1D2),
                  Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1D2)), x_Symbol),
              Condition(
                  Negate(Simp(Times(
                      EllipticF(ArcCos(Times(Rt(Times(CN1, d, Power(c, CN1)), C2), x)),
                          Times(b, c, Power(Subtract(Times(b, c), Times(a, d)), CN1))),
                      Power(Times(Sqrt(c), Rt(Times(CN1, d, Power(c, CN1)), C2),
                          Sqrt(Subtract(a, Times(b, c, Power(d, CN1))))), CN1)),
                      x)),
                  And(FreeQ(List(a, b, c, d), x), NegQ(Times(d, Power(c, CN1))), GtQ(c, C0),
                      GtQ(Subtract(a, Times(b, c, Power(d, CN1))), C0)))));
}
