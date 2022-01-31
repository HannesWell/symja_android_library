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
class IntRules27 {
  public static IAST RULES =
      List(
          IIntegrate(541,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(c_, Times(d_DEFAULT,
                          Sqr(x_))), QQ(-3L,
                              2L)),
                      Sqrt(Plus(e_, Times(f_DEFAULT, Sqr(x_))))),
                  x_Symbol),
              Condition(Subtract(Dist(Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                  Integrate(Times(Sqrt(Plus(e, Times(f, Sqr(x)))),
                      Power(Times(Plus(a, Times(b, Sqr(x))), Sqrt(Plus(c, Times(d, Sqr(x))))),
                          CN1)),
                      x),
                  x),
                  Dist(Times(d, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                      Integrate(Times(Sqrt(Plus(e, Times(f, Sqr(x)))),
                          Power(Plus(c, Times(d, Sqr(x))), QQ(-3L, 2L))), x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), PosQ(Times(d,
                      Power(c, CN1))), PosQ(
                          Times(f, Power(e, CN1)))))),
          IIntegrate(542,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(
                          x_))), CN1),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), QQ(-3L,
                          2L)),
                      Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), QQ(3L, 2L))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(
                              Subtract(Times(b, e), Times(a, f)),
                              Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(
                              Times(Sqrt(Plus(e, Times(f, Sqr(x)))),
                                  Power(Times(Plus(a, Times(b, Sqr(x))),
                                      Sqrt(Plus(c, Times(d, Sqr(x))))), CN1)),
                              x),
                          x),
                      Dist(
                          Times(
                              Subtract(Times(d, e), Times(c, f)), Power(
                                  Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(e, Times(f, Sqr(
                                      x)))),
                                  Power(Plus(c, Times(d, Sqr(x))), QQ(-3L, 2L))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), PosQ(Times(d,
                      Power(c, CN1))), PosQ(
                          Times(f, Power(e, CN1)))))),
          IIntegrate(543,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(c_, Times(d_DEFAULT,
                          Sqr(x_))), QQ(3L,
                              2L)),
                      Sqrt(Plus(e_, Times(f_DEFAULT, Sqr(x_))))),
                  x_Symbol),
              Condition(
                  Plus(Dist(Times(Sqr(Subtract(Times(b, c), Times(a, d))), Power(b, CN2)),
                      Integrate(Times(Sqrt(Plus(e, Times(f, Sqr(x)))),
                          Power(Times(Plus(a, Times(b, Sqr(x))), Sqrt(Plus(c, Times(d, Sqr(x))))),
                              CN1)),
                          x),
                      x),
                      Dist(Times(d, Power(b, CN2)),
                          Integrate(
                              Times(Plus(Times(C2, b, c), Times(CN1, a, d), Times(b, d, Sqr(x))),
                                  Sqrt(Plus(e, Times(f, Sqr(x)))),
                                  Power(Plus(c, Times(d, Sqr(x))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), PosQ(Times(d,
                      Power(c, CN1))), PosQ(
                          Times(f, Power(e, CN1)))))),
          IIntegrate(544,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), q_), Power(
                          Plus(e_, Times(f_DEFAULT, Sqr(x_))), r_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(
                              b, Subtract(Times(b, e), Times(a, f)), Power(
                                  Subtract(Times(b, c), Times(a, d)), CN2)),
                          Integrate(
                              Times(Power(Plus(c, Times(d, Sqr(x))), Plus(q, C2)),
                                  Power(Plus(e, Times(f, Sqr(x))), Subtract(r, C1)),
                                  Power(Plus(a, Times(b, Sqr(x))), CN1)),
                              x),
                          x),
                      Dist(Power(Subtract(Times(b, c), Times(a, d)), CN2),
                          Integrate(Times(Power(Plus(c, Times(d, Sqr(x))), q),
                              Power(Plus(e, Times(f, Sqr(x))), Subtract(r, C1)),
                              Plus(Times(C2, b, c, d, e), Times(CN1, a, Sqr(d), e),
                                  Times(CN1, b, Sqr(c), f), Times(Sqr(d),
                                      Subtract(Times(b, e), Times(a, f)), Sqr(x)))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), LtQ(q, CN1), GtQ(r, C1)))),
          IIntegrate(545,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT,
                          Sqr(x_))), CN1),
                      Power(Plus(c_,
                          Times(d_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), r_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(d, Power(b, CN1)),
                          Integrate(
                              Times(Power(Plus(c, Times(d, Sqr(x))), Subtract(q, C1)),
                                  Power(Plus(e, Times(f, Sqr(x))), r)),
                              x),
                          x),
                      Dist(
                          Times(Subtract(Times(b, c), Times(a,
                              d)), Power(b,
                                  CN1)),
                          Integrate(Times(Power(Plus(c, Times(d, Sqr(x))), Subtract(q, C1)),
                              Power(Plus(e, Times(f, Sqr(x))), r), Power(Plus(a, Times(b, Sqr(x))),
                                  CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, r), x), GtQ(q, C1)))),
          IIntegrate(546,
              Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1),
                  Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), q_),
                  Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), r_)), x_Symbol),
              Condition(Subtract(
                  Dist(Times(Sqr(b), Power(Subtract(Times(b, c), Times(a, d)), CN2)),
                      Integrate(Times(Power(Plus(c, Times(d, Sqr(x))), Plus(q, C2)),
                          Power(Plus(e, Times(f, Sqr(x))), r),
                          Power(Plus(a, Times(b, Sqr(x))), CN1)), x),
                      x),
                  Dist(Times(d, Power(Subtract(Times(b, c), Times(a, d)), CN2)),
                      Integrate(
                          Times(Power(Plus(c, Times(d, Sqr(x))), q),
                              Power(Plus(e, Times(f, Sqr(x))), r),
                              Plus(Times(C2, b, c), Times(CN1, a, d), Times(b, d, Sqr(x)))),
                          x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f, r), x), LtQ(q, CN1)))),
          IIntegrate(547,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1),
                      Power(Plus(c_,
                          Times(d_DEFAULT, Sqr(x_))), q_),
                      Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), r_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Dist(Times(d, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Times(Power(Plus(c, Times(d, Sqr(x))), q),
                              Power(Plus(e, Times(f, Sqr(x))), r)), x),
                          x)),
                      Dist(Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Times(Power(Plus(c, Times(d, Sqr(x))), Plus(q, C1)),
                              Power(Plus(e, Times(f, Sqr(x))), r),
                              Power(Plus(a, Times(b, Sqr(x))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, r), x), LeQ(q, CN1)))),
          IIntegrate(548,
              Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN2),
                  Sqrt(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                  Sqrt(Plus(e_, Times(f_DEFAULT, Sqr(x_))))), x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              x, Sqrt(Plus(c, Times(d, Sqr(x)))), Sqrt(Plus(e,
                                  Times(f, Sqr(x)))),
                              Power(Times(C2, a, Plus(a, Times(b, Sqr(x)))), CN1)),
                          x),
                      Dist(
                          Times(d, f, Power(Times(C2, a, Sqr(b)),
                              CN1)),
                          Integrate(
                              Times(Subtract(a, Times(b, Sqr(x))),
                                  Power(
                                      Times(Sqrt(Plus(c, Times(d, Sqr(x)))),
                                          Sqrt(Plus(e, Times(f, Sqr(x))))),
                                      CN1)),
                              x),
                          x),
                      Dist(
                          Times(Subtract(Times(Sqr(b), c, e), Times(Sqr(a), d, f)),
                              Power(Times(C2, a, Sqr(b)), CN1)),
                          Integrate(Power(Times(Plus(a, Times(b, Sqr(x))),
                              Sqrt(Plus(c, Times(d, Sqr(x)))), Sqrt(Plus(e, Times(f, Sqr(x))))),
                              CN1), x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f), x))),
          IIntegrate(549,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN2),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1D2),
                      Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Sqr(b), x, Sqrt(Plus(c, Times(d,
                                  Sqr(x)))),
                              Sqrt(Plus(e,
                                  Times(f, Sqr(x)))),
                              Power(
                                  Times(C2, a, Subtract(Times(b, c), Times(a, d)),
                                      Subtract(Times(b, e), Times(a,
                                          f)),
                                      Plus(a, Times(b, Sqr(x)))),
                                  CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(d, f,
                                  Power(
                                      Times(C2, a, Subtract(Times(b, c), Times(a, d)),
                                          Subtract(Times(b, e), Times(a, f))),
                                      CN1)),
                              Integrate(Times(Plus(a, Times(b, Sqr(x))),
                                  Power(Times(Sqrt(Plus(c, Times(d, Sqr(x)))),
                                      Sqrt(Plus(e, Times(f, Sqr(x))))), CN1)),
                                  x),
                              x)),
                      Dist(
                          Times(
                              Subtract(Plus(Times(Sqr(b), c, e), Times(C3, Sqr(a), d, f)),
                                  Times(C2, a, b, Plus(Times(d, e), Times(c, f)))),
                              Power(Times(C2, a, Subtract(Times(b, c), Times(a, d)),
                                  Subtract(Times(b, e), Times(a, f))), CN1)),
                          Integrate(Power(
                              Times(Plus(a, Times(b, Sqr(x))), Sqrt(Plus(c, Times(d, Sqr(x)))),
                                  Sqrt(Plus(e, Times(f, Sqr(x))))),
                              CN1), x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f), x))),
          IIntegrate(550,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_), Power(
                          Plus(e_, Times(f_DEFAULT, Power(x_, n_))), r_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(d, Power(b, CN1)),
                          Integrate(Times(Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                              Power(Plus(e, Times(f, Power(x, n))), r)), x),
                          x),
                      Dist(Times(Subtract(Times(b, c), Times(a, d)), Power(b, CN1)),
                          Integrate(Times(Power(Plus(a, Times(b, Power(x, n))), p),
                              Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                              Power(Plus(e, Times(f, Power(x, n))), r)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n, r), x), ILtQ(p, C0), GtQ(q, C0)))),
          IIntegrate(551,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_,
                          n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_,
                          n_))), q_),
                      Power(Plus(e_, Times(f_DEFAULT, Power(x_, n_))), r_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), Plus(q, C1)),
                                  Power(Plus(e, Times(f, Power(x, n))), r)),
                              x),
                          x),
                      Dist(
                          Times(d, Power(Subtract(Times(b, c), Times(a, d)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b,
                                      Power(x, n))), Plus(p,
                                          C1)),
                                  Power(Plus(c,
                                      Times(d, Power(x, n))), q),
                                  Power(Plus(e, Times(f, Power(x, n))), r)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n, q), x), ILtQ(p, C0), LeQ(q, CN1)))),
          IIntegrate(552,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(
                          x_))), CN1D2),
                      Power(Plus(c_,
                          Times(d_DEFAULT, Sqr(x_))), CN1D2),
                      Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(Plus(c,
                              Times(d, Sqr(x)))),
                          Sqrt(
                              Times(
                                  a, Plus(e, Times(f, Sqr(
                                      x))),
                                  Power(Times(e, Plus(a, Times(b, Sqr(x)))), CN1))),
                          Power(
                              Times(c, Sqrt(Plus(e, Times(f, Sqr(x)))),
                                  Sqrt(
                                      Times(a, Plus(c, Times(d,
                                          Sqr(x))), Power(Times(c, Plus(a, Times(b, Sqr(x)))),
                                              CN1)))),
                              CN1)),
                      Subst(
                          Integrate(
                              Power(
                                  Times(
                                      Sqrt(Subtract(C1,
                                          Times(Subtract(Times(b, c), Times(a, d)), Sqr(x),
                                              Power(c, CN1)))),
                                      Sqrt(Subtract(C1,
                                          Times(Subtract(Times(b, e), Times(a, f)), Sqr(x),
                                              Power(e, CN1))))),
                                  CN1),
                              x),
                          x, Times(x, Power(Plus(a, Times(b, Sqr(x))), CN1D2))),
                      x),
                  FreeQ(List(a, b, c, d, e, f), x))),
          IIntegrate(553,
              Integrate(
                  Times(Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)))),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1D2),
                      Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(a, Sqrt(Plus(c, Times(d, Sqr(x)))),
                          Sqrt(Times(a, Plus(e, Times(f, Sqr(x))),
                              Power(Times(e, Plus(a, Times(b, Sqr(x)))), CN1))),
                          Power(
                              Times(
                                  c, Sqrt(Plus(e, Times(f, Sqr(x)))), Sqrt(Times(a,
                                      Plus(c, Times(d, Sqr(x))), Power(Times(c,
                                          Plus(a, Times(b, Sqr(x)))), CN1)))),
                              CN1)),
                      Subst(
                          Integrate(
                              Power(Times(Subtract(C1, Times(b, Sqr(x))),
                                  Sqrt(Subtract(C1,
                                      Times(Subtract(Times(b, c), Times(a, d)), Sqr(x),
                                          Power(c, CN1)))),
                                  Sqrt(
                                      Subtract(C1,
                                          Times(Subtract(Times(b, e), Times(a, f)), Sqr(x),
                                              Power(e, CN1))))),
                                  CN1),
                              x),
                          x, Times(x, Power(Plus(a, Times(b, Sqr(x))), CN1D2))),
                      x),
                  FreeQ(List(a, b, c, d, e, f), x))),
          IIntegrate(554,
              Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), QQ(-3L, 2L)),
                  Sqrt(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                  Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), CN1D2)), x_Symbol),
              Condition(Dist(
                  Times(Sqrt(Plus(c, Times(d, Sqr(x)))),
                      Sqrt(Times(a, Plus(e, Times(f, Sqr(x))),
                          Power(Times(e, Plus(a, Times(b, Sqr(x)))), CN1))),
                      Power(Times(a, Sqrt(Plus(e, Times(f, Sqr(x)))),
                          Sqrt(Times(a, Plus(c, Times(d, Sqr(x))),
                              Power(Times(c, Plus(a, Times(b, Sqr(x)))), CN1)))),
                          CN1)),
                  Subst(Integrate(Times(
                      Sqrt(Subtract(C1,
                          Times(Subtract(Times(b, c), Times(a, d)), Sqr(x), Power(c, CN1)))),
                      Power(
                          Subtract(C1,
                              Times(Subtract(Times(b, e), Times(a, f)), Sqr(x), Power(e, CN1))),
                          CN1D2)),
                      x), x, Times(x, Power(Plus(a, Times(b, Sqr(x))), CN1D2))),
                  x), FreeQ(List(a, b, c, d, e, f), x))),
          IIntegrate(555,
              Integrate(
                  Times(Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)))),
                      Sqrt(Plus(c_,
                          Times(d_DEFAULT, Sqr(x_)))),
                      Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(Simp(
                      Times(
                          d, x, Sqrt(Plus(a, Times(b, Sqr(
                              x)))),
                          Sqrt(Plus(e,
                              Times(f, Sqr(x)))),
                          Power(Times(C2, f, Sqrt(Plus(c, Times(d, Sqr(x))))), CN1)),
                      x),
                      Negate(Dist(
                          Times(c, Subtract(Times(d, e), Times(c, f)), Power(Times(C2, f), CN1)),
                          Integrate(Times(Sqrt(Plus(a, Times(b, Sqr(x)))),
                              Power(Times(Power(Plus(c, Times(d, Sqr(x))), QQ(3L, 2L)),
                                  Sqrt(Plus(e, Times(f, Sqr(x))))), CN1)),
                              x),
                          x)),
                      Dist(
                          Times(
                              b, c, Subtract(Times(d, e), Times(c, f)), Power(Times(C2, d, f),
                                  CN1)),
                          Integrate(
                              Power(
                                  Times(Sqrt(Plus(a, Times(b, Sqr(x)))),
                                      Sqrt(Plus(c,
                                          Times(d, Sqr(x)))),
                                      Sqrt(Plus(e, Times(f, Sqr(x))))),
                                  CN1),
                              x),
                          x),
                      Negate(Dist(
                          Times(Subtract(Subtract(Times(b, d, e), Times(b, c, f)), Times(a, d, f)),
                              Power(Times(C2, d, f), CN1)),
                          Integrate(Times(Sqrt(Plus(c, Times(d, Sqr(x)))),
                              Power(Times(Sqrt(Plus(a, Times(b, Sqr(x)))),
                                  Sqrt(Plus(e, Times(f, Sqr(x))))), CN1)),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f), x),
                      PosQ(Times(Subtract(Times(d, e), Times(c, f)), Power(c, CN1)))))),
          IIntegrate(556,
              Integrate(Times(Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)))),
                  Sqrt(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                  Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), CN1D2)), x_Symbol),
              Condition(Plus(Simp(Times(x, Sqrt(Plus(a, Times(b, Sqr(x)))),
                  Sqrt(Plus(c, Times(d, Sqr(x)))), Power(Times(C2, Sqrt(Plus(e, Times(f, Sqr(x))))),
                      CN1)),
                  x),
                  Dist(Times(e, Subtract(Times(b, e), Times(a, f)), Power(Times(C2, f), CN1)),
                      Integrate(
                          Times(Sqrt(Plus(c, Times(d, Sqr(x)))),
                              Power(Times(Sqrt(Plus(a, Times(b, Sqr(x)))),
                                  Power(Plus(e, Times(f, Sqr(x))), QQ(3L, 2L))), CN1)),
                          x),
                      x),
                  Dist(
                      Times(
                          Subtract(Times(b, e), Times(a, f)), Subtract(Times(d, e),
                              Times(C2, c, f)),
                          Power(Times(C2, Sqr(f)), CN1)),
                      Integrate(
                          Power(
                              Times(Sqrt(Plus(a, Times(b, Sqr(x)))), Sqrt(Plus(c,
                                  Times(d, Sqr(x)))), Sqrt(
                                      Plus(e, Times(f, Sqr(x))))),
                              CN1),
                          x),
                      x),
                  Negate(
                      Dist(
                          Times(Subtract(Subtract(Times(b, d, e), Times(b, c, f)), Times(a, d, f)),
                              Power(Times(C2, Sqr(f)), CN1)),
                          Integrate(
                              Times(Sqrt(Plus(e, Times(f, Sqr(x)))),
                                  Power(Times(Sqrt(Plus(a, Times(b, Sqr(x)))),
                                      Sqrt(Plus(c, Times(d, Sqr(x))))), CN1)),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), NegQ(
                          Times(Subtract(Times(d, e), Times(c, f)), Power(c, CN1)))))),
          IIntegrate(557,
              Integrate(
                  Times(Sqrt(Plus(a_, Times(b_DEFAULT, Sqr(x_)))),
                      Sqrt(Plus(c_,
                          Times(d_DEFAULT, Sqr(x_)))),
                      Power(Plus(e_, Times(f_DEFAULT, Sqr(x_))), QQ(-3L, 2L))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(b, Power(f,
                              CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(c,
                                      Times(d, Sqr(x)))),
                                  Power(
                                      Times(
                                          Sqrt(Plus(a, Times(b, Sqr(x)))), Sqrt(
                                              Plus(e, Times(f, Sqr(x))))),
                                      CN1)),
                              x),
                          x),
                      Dist(
                          Times(Subtract(Times(b, e), Times(a, f)), Power(f,
                              CN1)),
                          Integrate(
                              Times(Sqrt(Plus(c, Times(d, Sqr(x)))),
                                  Power(Times(Sqrt(Plus(a, Times(b, Sqr(x)))),
                                      Power(Plus(e, Times(f, Sqr(x))), QQ(3L, 2L))), CN1)),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f), x))),
          IIntegrate(558,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_),
                      Power(Plus(e_, Times(f_DEFAULT, Power(x_, n_))), r_)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(u,
                              ExpandIntegrand(Times(Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), q), Power(
                                      Plus(e, Times(f, Power(x, n))), r)),
                                  x))),
                      Condition(Integrate(u, x), SumQ(u))),
                  And(FreeQ(List(a, b, c, d, e, f, p, q, r), x), IGtQ(n, C0)))),
          IIntegrate(559,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_), Power(
                          Plus(e_, Times(f_DEFAULT, Power(x_, n_))), r_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Subst(
                          Integrate(
                              Times(Power(Plus(a, Times(b, Power(Power(x, n), CN1))), p),
                                  Power(Plus(c, Times(d, Power(Power(x, n), CN1))), q),
                                  Power(Plus(e, Times(f, Power(Power(x, n), CN1))), r), Power(x,
                                      CN2)),
                              x),
                          x, Power(x, CN1))),
                  And(FreeQ(List(a, b, c, d, e, f, p, q, r), x), ILtQ(n, C0)))),
          IIntegrate(560,
              Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT),
                  Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_DEFAULT),
                  Power(Plus(e_, Times(f_DEFAULT, Power(x_, n_))), r_DEFAULT)), x_Symbol),
              Condition(
                  Unintegrable(Times(Power(Plus(a, Times(b, Power(x, n))), p),
                      Power(Plus(c, Times(d, Power(x, n))), q),
                      Power(Plus(e, Times(f, Power(x, n))), r)), x),
                  FreeQ(List(a, b, c, d, e, f, n, p, q, r), x))));
}
