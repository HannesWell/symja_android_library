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
class IntRules241 {
  public static IAST RULES =
      List(
          IIntegrate(4821,
              Integrate(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCos(Plus(CN1, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT)),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(C2, Sqrt(Times(Pi, Power(b, CN1))),
                              Sin(Times(a, Power(Times(C2, b), CN1))),
                              Cos(Times(C1D2, ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                              FresnelC(Times(Sqrt(Power(Times(Pi, b), CN1)),
                                  Sqrt(Plus(a, Times(b, ArcCos(Plus(CN1, Times(d, Sqr(x))))))))),
                              Power(Times(d, x), CN1)),
                          x),
                      Simp(Times(C2, Sqrt(Times(Pi, Power(b, CN1))),
                          Cos(Times(a, Power(Times(C2, b), CN1))),
                          Cos(Times(C1D2,
                              ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                          FresnelS(Times(Sqrt(Power(Times(Pi, b), CN1)),
                              Sqrt(Plus(a, Times(b, ArcCos(Plus(CN1, Times(d, Sqr(x))))))))),
                          Power(Times(d, x), CN1)), x)),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4822,
              Integrate(Power(
                  Plus(a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                  QQ(-3L, 2L)), x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Sqrt(
                                      Subtract(Times(CN2, c, d, Sqr(x)),
                                          Times(Sqr(d), Power(x, C4)))),
                                  Power(
                                      Times(b, d, x,
                                          Sqrt(Plus(a,
                                              Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))))),
                                      CN1)),
                              x)),
                      Negate(
                          Simp(
                              Times(
                                  Power(Times(c, Power(b,
                                      CN1)), QQ(3L,
                                          2L)),
                                  Sqrt(Pi), x,
                                  Plus(Cos(
                                      Times(a, Power(Times(C2, b), CN1))),
                                      Times(c, Sin(Times(a, Power(Times(C2, b), CN1))))),
                                  FresnelC(Times(Sqrt(Times(c, Power(Times(Pi, b), CN1))),
                                      Sqrt(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                                  Power(
                                      Subtract(Cos(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                          Times(
                                              c,
                                              Sin(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))))),
                                      CN1)),
                              x)),
                      Simp(
                          Times(
                              Power(Times(c, Power(b, CN1)), QQ(3L,
                                  2L)),
                              Sqrt(Pi), x,
                              Subtract(
                                  Cos(Times(a,
                                      Power(Times(C2, b), CN1))),
                                  Times(c, Sin(Times(a, Power(Times(C2, b), CN1))))),
                              FresnelS(Times(Sqrt(Times(c, Power(Times(Pi, b), CN1))),
                                  Sqrt(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                              Power(
                                  Subtract(Cos(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                      Times(c,
                                          Sin(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1)))),
          IIntegrate(4823,
              Integrate(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCos(Plus(C1, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT)),
                      QQ(-3L, 2L)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Sqrt(Subtract(Times(CN2, d, Sqr(x)), Times(Sqr(d), Power(x, C4)))),
                          Power(
                              Times(b, d, x,
                                  Sqrt(Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x)))))))),
                              CN1)),
                          x),
                      Negate(
                          Simp(
                              Times(C2, Power(Power(b, CN1), QQ(3L, 2L)), Sqrt(Pi),
                                  Sin(Times(a, Power(Times(C2, b), CN1))),
                                  Sin(Times(C1D2, ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                                  FresnelC(Times(Sqrt(Power(Times(Pi, b), CN1)),
                                      Sqrt(Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x))))))))),
                                  Power(Times(d, x), CN1)),
                              x)),
                      Simp(
                          Times(C2, Power(Power(b, CN1), QQ(3L, 2L)), Sqrt(Pi),
                              Cos(Times(a, Power(Times(C2, b), CN1))),
                              Sin(Times(C1D2,
                                  ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                              FresnelS(
                                  Times(
                                      Sqrt(Power(Times(Pi, b),
                                          CN1)),
                                      Sqrt(Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x))))))))),
                              Power(Times(d, x), CN1)),
                          x)),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4824,
              Integrate(
                  Power(
                      Plus(
                          a_DEFAULT, Times(ArcCos(Plus(CN1, Times(d_DEFAULT, Sqr(x_)))),
                              b_DEFAULT)),
                      QQ(-3L, 2L)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Sqrt(Subtract(Times(C2, d, Sqr(x)), Times(Sqr(d), Power(x, C4)))),
                              Power(
                                  Times(b, d, x,
                                      Sqrt(Plus(a, Times(b, ArcCos(Plus(CN1, Times(d, Sqr(x)))))))),
                                  CN1)),
                          x),
                      Negate(
                          Simp(
                              Times(C2, Power(Power(b, CN1), QQ(3L, 2L)), Sqrt(Pi),
                                  Cos(Times(a, Power(Times(C2, b), CN1))),
                                  Cos(Times(C1D2,
                                      ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                                  FresnelC(
                                      Times(Sqrt(Power(Times(Pi, b), CN1)),
                                          Sqrt(
                                              Plus(a, Times(b,
                                                  ArcCos(Plus(CN1, Times(d, Sqr(x))))))))),
                                  Power(Times(d, x), CN1)),
                              x)),
                      Negate(
                          Simp(
                              Times(C2, Power(Power(b, CN1), QQ(3L, 2L)), Sqrt(Pi),
                                  Sin(Times(a, Power(Times(C2, b), CN1))),
                                  Cos(Times(C1D2, ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                                  FresnelS(
                                      Times(Sqrt(Power(Times(Pi, b), CN1)),
                                          Sqrt(Plus(a, Times(b,
                                              ArcCos(Plus(CN1, Times(d, Sqr(x))))))))),
                                  Power(Times(d, x), CN1)),
                              x))),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4825,
              Integrate(
                  Power(Plus(
                      a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                      CN2),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Sqrt(
                                      Subtract(Times(CN2, c, d, Sqr(
                                          x)), Times(Sqr(d),
                                              Power(x, C4)))),
                                  Power(
                                      Times(C2, b, d, x, Plus(a, Times(b,
                                          ArcSin(Plus(c, Times(d, Sqr(x))))))),
                                      CN1)),
                              x)),
                      Negate(
                          Simp(
                              Times(x,
                                  Plus(
                                      Cos(Times(a, Power(Times(C2, b),
                                          CN1))),
                                      Times(c, Sin(Times(a, Power(Times(C2, b), CN1))))),
                                  CosIntegral(
                                      Times(c, Power(Times(C2, b), CN1),
                                          Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))))),
                                  Power(
                                      Times(C4, Sqr(b),
                                          Subtract(
                                              Cos(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                              Times(c,
                                                  Sin(Times(C1D2,
                                                      ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                                      CN1)),
                              x)),
                      Simp(Times(x,
                          Subtract(
                              Cos(Times(a, Power(Times(C2, b), CN1))), Times(c,
                                  Sin(Times(a, Power(Times(C2, b), CN1))))),
                          SinIntegral(Times(c, Power(Times(C2, b), CN1),
                              Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))))),
                          Power(
                              Times(C4, Sqr(b),
                                  Subtract(Cos(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                      Times(c, Sin(Times(C1D2, ArcSin(
                                          Plus(c, Times(d, Sqr(x))))))))),
                              CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1)))),
          IIntegrate(4826,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(ArcCos(Plus(C1, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                      CN2),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Sqrt(Subtract(Times(CN2, d, Sqr(x)),
                                  Times(Sqr(d), Power(x, C4)))),
                              Power(
                                  Times(C2, b, d, x, Plus(a, Times(b,
                                      ArcCos(Plus(C1, Times(d, Sqr(x))))))),
                                  CN1)),
                          x),
                      Simp(
                          Times(
                              x, Sin(Times(a,
                                  Power(Times(C2, b), CN1))),
                              CosIntegral(
                                  Times(
                                      Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x)))))), Power(
                                          Times(C2, b), CN1))),
                              Power(Times(C2, CSqrt2, Sqr(b), Sqrt(Times(CN1, d, Sqr(x)))), CN1)),
                          x),
                      Negate(Simp(Times(x, Cos(Times(a, Power(Times(C2, b), CN1))),
                          SinIntegral(Times(Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                              Power(Times(C2, b), CN1))),
                          Power(Times(C2, CSqrt2, Sqr(b), Sqrt(Times(CN1, d, Sqr(x)))), CN1)),
                          x))),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4827, Integrate(Power(
              Plus(a_DEFAULT, Times(ArcCos(Plus(CN1, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)), CN2),
              x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Sqrt(Subtract(Times(C2, d, Sqr(
                                  x)), Times(Sqr(d),
                                      Power(x, C4)))),
                              Power(
                                  Times(
                                      C2, b, d, x, Plus(a, Times(b,
                                          ArcCos(Plus(CN1, Times(d, Sqr(x))))))),
                                  CN1)),
                          x),
                      Negate(
                          Simp(
                              Times(x, Cos(Times(a, Power(Times(C2, b), CN1))),
                                  CosIntegral(
                                      Times(Plus(a, Times(b, ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                                          Power(Times(C2, b), CN1))),
                                  Power(Times(C2, CSqrt2, Sqr(b), Sqrt(Times(d, Sqr(x)))), CN1)),
                              x)),
                      Negate(
                          Simp(
                              Times(x, Sin(Times(a, Power(Times(C2, b), CN1))),
                                  SinIntegral(
                                      Times(Plus(a, Times(b, ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                                          Power(Times(C2, b), CN1))),
                                  Power(Times(C2, CSqrt2, Sqr(b), Sqrt(Times(d, Sqr(x)))), CN1)),
                              x))),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4828,
              Integrate(
                  Power(
                      Plus(a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT)),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x,
                              Power(
                                  Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))), Plus(n,
                                      C2)),
                              Power(Times(C4, Sqr(b), Plus(n, C1), Plus(n, C2)), CN1)),
                          x),
                      Negate(
                          Dist(Power(Times(C4, Sqr(b), Plus(n, C1), Plus(n, C2)), CN1),
                              Integrate(
                                  Power(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                      Plus(n, C2)),
                                  x),
                              x)),
                      Simp(
                          Times(
                              Sqrt(Subtract(Times(CN2, c, d, Sqr(x)), Times(Sqr(d), Power(x, C4)))),
                              Power(
                                  Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))), Plus(n,
                                      C1)),
                              Power(Times(C2, b, d, Plus(n, C1), x), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1), LtQ(n, CN1), NeQ(n, CN2)))),
          IIntegrate(4829,
              Integrate(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCos(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT)),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x,
                              Power(
                                  Plus(a, Times(b, ArcCos(Plus(c, Times(d, Sqr(x)))))), Plus(n,
                                      C2)),
                              Power(Times(C4, Sqr(b), Plus(n, C1), Plus(n, C2)), CN1)),
                          x),
                      Negate(
                          Dist(
                              Power(Times(C4, Sqr(b), Plus(n, C1),
                                  Plus(n, C2)), CN1),
                              Integrate(
                                  Power(
                                      Plus(a, Times(b, ArcCos(Plus(c, Times(d, Sqr(x)))))), Plus(n,
                                          C2)),
                                  x),
                              x)),
                      Negate(
                          Simp(
                              Times(
                                  Sqrt(Subtract(Times(CN2, c, d, Sqr(x)),
                                      Times(Sqr(d), Power(x, C4)))),
                                  Power(Plus(a, Times(b, ArcCos(Plus(c, Times(d, Sqr(x)))))),
                                      Plus(n, C1)),
                                  Power(Times(C2, b, d, Plus(n, C1), x), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1), LtQ(n, CN1), NeQ(n, CN2)))),
          IIntegrate(4830,
              Integrate(Times(Power(ArcSin(Times(a_DEFAULT, Power(x_, p_))), n_DEFAULT),
                  Power(x_, CN1)), x_Symbol),
              Condition(Dist(Power(p, CN1),
                  Subst(Integrate(Times(Power(x, n), Cot(x)), x), x,
                      ArcSin(Times(a, Power(x, p)))),
                  x), And(FreeQ(List(a, p), x), IGtQ(n, C0)))),
          IIntegrate(4831,
              Integrate(
                  Times(Power(ArcCos(
                      Times(a_DEFAULT, Power(x_, p_))), n_DEFAULT), Power(x_,
                          CN1)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(Power(p, CN1),
                          Subst(
                              Integrate(Times(Power(x, n), Tan(x)),
                                  x),
                              x, ArcCos(Times(a, Power(x, p)))),
                          x)),
                  And(FreeQ(List(a, p), x), IGtQ(n, C0)))),
          IIntegrate(4832,
              Integrate(
                  Times(
                      Power(
                          ArcSin(Times(c_DEFAULT,
                              Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(x_, n_DEFAULT))), CN1))),
                          m_DEFAULT),
                      u_DEFAULT),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(u,
                          Power(
                              ArcCsc(
                                  Plus(Times(a, Power(c, CN1)),
                                      Times(b, Power(x, n), Power(c, CN1)))),
                              m)),
                      x),
                  FreeQ(List(a, b, c, n, m), x))),
          IIntegrate(4833,
              Integrate(
                  Times(
                      Power(
                          ArcCos(
                              Times(c_DEFAULT,
                                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(x_, n_DEFAULT))),
                                      CN1))),
                          m_DEFAULT),
                      u_DEFAULT),
                  x_Symbol),
              Condition(Integrate(Times(u,
                  Power(ArcSec(Plus(Times(a, Power(c, CN1)), Times(b, Power(x, n), Power(c, CN1)))),
                      m)),
                  x), FreeQ(List(a, b, c, n, m), x))),
          IIntegrate(4834,
              Integrate(
                  Times(
                      Power(ArcSin(
                          Sqrt(Plus(C1, Times(b_DEFAULT, Sqr(x_))))), n_DEFAULT),
                      Power(Plus(C1, Times(b_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Times(CN1, b,
                          Sqr(x))), Power(Times(b, x),
                              CN1)),
                      Subst(
                          Integrate(Times(Power(ArcSin(x), n),
                              Power(Subtract(C1, Sqr(x)), CN1D2)), x),
                          x, Sqrt(Plus(C1, Times(b, Sqr(x))))),
                      x),
                  FreeQ(List(b, n), x))),
          IIntegrate(4835,
              Integrate(
                  Times(
                      Power(ArcCos(
                          Sqrt(Plus(C1, Times(b_DEFAULT, Sqr(x_))))), n_DEFAULT),
                      Power(Plus(C1, Times(b_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Times(CN1, b,
                          Sqr(x))), Power(Times(b, x),
                              CN1)),
                      Subst(
                          Integrate(Times(Power(ArcCos(x), n), Power(Subtract(C1, Sqr(x)), CN1D2)),
                              x),
                          x, Sqrt(Plus(C1, Times(b, Sqr(x))))),
                      x),
                  FreeQ(List(b, n), x))),
          IIntegrate(4836,
              Integrate(
                  Times(u_DEFAULT,
                      Power(f_,
                          Times(
                              Power(ArcSin(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                                  n_DEFAULT),
                              c_DEFAULT))),
                  x_Symbol),
              Condition(
                  Dist(Power(b, CN1),
                      Subst(
                          Integrate(Times(ReplaceAll(u,
                              Rule(x,
                                  Plus(Times(CN1, a, Power(b, CN1)),
                                      Times(Sin(x), Power(b, CN1))))),
                              Power(f, Times(c, Power(x, n))), Cos(x)), x),
                          x, ArcSin(Plus(a, Times(b, x)))),
                      x),
                  And(FreeQ(List(a, b, c, f), x), IGtQ(n, C0)))),
          IIntegrate(4837,
              Integrate(
                  Times(u_DEFAULT,
                      Power(f_,
                          Times(
                              Power(ArcCos(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                                  n_DEFAULT),
                              c_DEFAULT))),
                  x_Symbol),
              Condition(
                  Negate(Dist(Power(b, CN1),
                      Subst(
                          Integrate(Times(
                              ReplaceAll(u,
                                  Rule(x,
                                      Plus(Times(CN1, a, Power(b, CN1)),
                                          Times(Cos(x), Power(b, CN1))))),
                              Power(f, Times(c, Power(x, n))), Sin(x)), x),
                          x, ArcCos(Plus(a, Times(b, x)))),
                      x)),
                  And(FreeQ(List(a, b, c, f), x), IGtQ(n, C0)))),
          IIntegrate(4838,
              Integrate(ArcSin(Plus(Times(a_DEFAULT, Sqr(x_)), Times(b_DEFAULT,
                  Sqrt(Plus(c_, Times(d_DEFAULT, Sqr(x_))))))), x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(x,
                              ArcSin(
                                  Plus(Times(a, Sqr(
                                      x)), Times(b,
                                          Sqrt(Plus(c, Times(d, Sqr(x)))))))),
                          x),
                      Dist(
                          Times(x,
                              Sqrt(
                                  Plus(
                                      Times(Sqr(b), d), Times(Sqr(a), Sqr(x)), Times(C2, a, b,
                                          Sqrt(Plus(c, Times(d, Sqr(x))))))),
                              Power(
                                  Times(CN1, Sqr(x),
                                      Plus(Times(Sqr(b), d), Times(Sqr(a), Sqr(x)), Times(C2, a, b,
                                          Sqrt(Plus(c, Times(d, Sqr(x))))))),
                                  CN1D2)),
                          Integrate(Times(x,
                              Plus(Times(b, d), Times(C2, a, Sqrt(Plus(c, Times(d, Sqr(x)))))),
                              Power(
                                  Times(Sqrt(Plus(c, Times(d, Sqr(x)))),
                                      Sqrt(Plus(Times(Sqr(b), d), Times(Sqr(a), Sqr(x)),
                                          Times(C2, a, b, Sqrt(Plus(c, Times(d, Sqr(x)))))))),
                                  CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Times(Sqr(b), c), C1)))),
          IIntegrate(4839,
              Integrate(
                  ArcCos(
                      Plus(
                          Times(a_DEFAULT, Sqr(x_)), Times(b_DEFAULT,
                              Sqrt(Plus(c_, Times(d_DEFAULT, Sqr(x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x,
                              ArcCos(
                                  Plus(Times(a, Sqr(x)), Times(
                                      b, Sqrt(Plus(c, Times(d, Sqr(x)))))))),
                          x),
                      Dist(
                          Times(x,
                              Sqrt(
                                  Plus(Times(Sqr(b), d), Times(Sqr(a), Sqr(x)), Times(C2, a, b,
                                      Sqrt(Plus(c, Times(d, Sqr(x))))))),
                              Power(
                                  Times(CN1, Sqr(x),
                                      Plus(Times(Sqr(b), d), Times(Sqr(a), Sqr(x)),
                                          Times(C2, a, b, Sqrt(Plus(c, Times(d, Sqr(x))))))),
                                  CN1D2)),
                          Integrate(
                              Times(x,
                                  Plus(Times(b, d), Times(C2, a, Sqrt(Plus(c, Times(d, Sqr(x)))))),
                                  Power(
                                      Times(Sqrt(Plus(c, Times(d, Sqr(x)))),
                                          Sqrt(Plus(Times(Sqr(b), d), Times(Sqr(a), Sqr(x)),
                                              Times(C2, a, b, Sqrt(Plus(c, Times(d, Sqr(x)))))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Times(Sqr(b), c), C1)))),
          IIntegrate(4840, Integrate(ArcSin(u_), x_Symbol),
              Condition(
                  Subtract(Simp(Times(x, ArcSin(u)), x),
                      Integrate(SimplifyIntegrand(
                          Times(x, D(u, x), Power(Subtract(C1, Sqr(u)), CN1D2)), x), x)),
                  And(InverseFunctionFreeQ(u, x), Not(FunctionOfExponentialQ(u, x))))));
}
