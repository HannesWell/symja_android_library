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
class IntRules240 {
  public static IAST RULES =
      List(
          IIntegrate(4801,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      u_DEFAULT),
                  x_Symbol),
              Condition(
                  Unintegrable(Times(u, Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n)),
                      x),
                  FreeQ(List(a, b, c, n), x))),
          IIntegrate(4802,
              Integrate(
                  Times(Power(Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      n_DEFAULT), u_DEFAULT),
                  x_Symbol),
              Condition(
                  Unintegrable(Times(u, Power(Plus(a, Times(b, ArcCos(Times(c, x)))), n)),
                      x),
                  FreeQ(List(a, b, c, n), x))),
          IIntegrate(4803,
              Integrate(
                  Power(Plus(a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, x_))), b_DEFAULT)),
                      n_DEFAULT),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Subst(Integrate(Power(Plus(a, Times(b, ArcSin(x))), n), x), x,
                          Plus(c, Times(d, x))),
                      x),
                  FreeQ(List(a, b, c, d, n), x))),
          IIntegrate(4804,
              Integrate(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCos(Plus(c_, Times(d_DEFAULT, x_))),
                          b_DEFAULT)),
                      n_DEFAULT),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Subst(
                          Integrate(Power(Plus(a, Times(b, ArcCos(x))), n), x), x, Plus(c,
                              Times(d, x))),
                      x),
                  FreeQ(List(a, b, c, d, n), x))),
          IIntegrate(4805,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, x_))),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(
                                      Plus(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)),
                                          Times(f, x, Power(d, CN1))),
                                      m),
                                  Power(Plus(a, Times(b, ArcSin(x))), n)),
                              x),
                          x, Plus(c, Times(d, x))),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n), x))),
          IIntegrate(4806,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Plus(c_, Times(d_DEFAULT, x_))),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(
                                      Plus(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)),
                                          Times(f, x, Power(d, CN1))),
                                      m),
                                  Power(Plus(a, Times(b, ArcCos(x))), n)),
                              x),
                          x, Plus(c, Times(d, x))),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n), x))),
          IIntegrate(4807,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, x_))),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(
                          Plus(A_DEFAULT, Times(B_DEFAULT, x_),
                              Times(C_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(Times(CN1, CSymbol, Power(d, CN2)),
                                      Times(CSymbol, Sqr(x), Power(d, CN2))), p),
                                  Power(Plus(a, Times(b, ArcSin(x))), n)),
                              x),
                          x, Plus(c, Times(d, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, ASymbol, BSymbol, CSymbol, n, p), x),
                      EqQ(Plus(Times(BSymbol, Subtract(C1, Sqr(c))), Times(C2, ASymbol, c,
                          d)), C0),
                      EqQ(Subtract(Times(C2, c, CSymbol), Times(BSymbol, d)), C0)))),
          IIntegrate(4808,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Plus(c_, Times(d_DEFAULT, x_))),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(Times(CN1, CSymbol, Power(d, CN2)),
                                      Times(CSymbol, Sqr(x), Power(d, CN2))), p),
                                  Power(Plus(a, Times(b, ArcCos(x))), n)),
                              x),
                          x, Plus(c, Times(d, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, ASymbol, BSymbol, CSymbol, n, p), x),
                      EqQ(Plus(Times(BSymbol, Subtract(C1, Sqr(c))), Times(C2, ASymbol, c,
                          d)), C0),
                      EqQ(Subtract(Times(C2, c, CSymbol), Times(BSymbol, d)), C0)))),
          IIntegrate(4809,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, x_))),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(A_DEFAULT, Times(B_DEFAULT, x_),
                              Times(C_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Subst(Integrate(Times(
                          Power(Plus(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)),
                              Times(f, x, Power(d, CN1))), m),
                          Power(
                              Plus(Times(CN1, CSymbol, Power(d, CN2)),
                                  Times(CSymbol, Sqr(x), Power(d, CN2))),
                              p),
                          Power(Plus(a, Times(b, ArcSin(x))), n)), x), x, Plus(c,
                              Times(d, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n, p), x),
                      EqQ(Plus(Times(BSymbol, Subtract(C1, Sqr(c))), Times(C2, ASymbol, c,
                          d)), C0),
                      EqQ(Subtract(Times(C2, c, CSymbol), Times(BSymbol, d)), C0)))),
          IIntegrate(4810,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Plus(c_, Times(d_DEFAULT, x_))),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(A_DEFAULT, Times(B_DEFAULT, x_),
                              Times(C_DEFAULT, Sqr(x_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Subst(Integrate(Times(
                          Power(Plus(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)),
                              Times(f, x, Power(d, CN1))), m),
                          Power(Plus(Times(CN1, CSymbol, Power(d, CN2)),
                              Times(CSymbol, Sqr(x), Power(d, CN2))), p),
                          Power(Plus(a, Times(b, ArcCos(x))), n)), x), x, Plus(c, Times(d, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n, p), x),
                      EqQ(Plus(Times(BSymbol, Subtract(C1, Sqr(c))), Times(C2, ASymbol, c, d)), C0),
                      EqQ(Subtract(Times(C2, c, CSymbol), Times(BSymbol, d)), C0)))),
          IIntegrate(4811, Integrate(
              Sqrt(Plus(a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT))),
              x_Symbol),
              Condition(Plus(
                  Simp(Times(x, Sqrt(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))))), x),
                  Negate(
                      Simp(
                          Times(Sqrt(Pi), x,
                              Plus(
                                  Cos(Times(a,
                                      Power(Times(C2, b), CN1))),
                                  Times(c, Sin(Times(a, Power(Times(C2, b), CN1))))),
                              FresnelC(
                                  Times(
                                      Sqrt(Times(c,
                                          Power(Times(Pi, b), CN1))),
                                      Sqrt(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                              Power(
                                  Times(
                                      Sqrt(Times(c,
                                          Power(b, CN1))),
                                      Subtract(
                                          Cos(Times(C1D2,
                                              ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                          Times(
                                              c, Sin(
                                                  Times(C1D2, ArcSin(Plus(c,
                                                      Times(d, Sqr(x))))))))),
                                  CN1)),
                          x)),
                  Simp(
                      Times(Sqrt(Pi), x,
                          Subtract(
                              Cos(Times(a,
                                  Power(Times(C2, b), CN1))),
                              Times(c, Sin(Times(a, Power(Times(C2, b), CN1))))),
                          FresnelS(Times(Sqrt(Times(c, Power(Times(Pi, b), CN1))),
                              Sqrt(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                          Power(
                              Times(Sqrt(Times(c, Power(b, CN1))),
                                  Subtract(Cos(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                      Times(c,
                                          Sin(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                              CN1)),
                      x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1)))),
          IIntegrate(4812,
              Integrate(
                  Sqrt(
                      Plus(a_DEFAULT, Times(ArcCos(Plus(C1, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              CN2, Sqrt(Plus(a, Times(b,
                                  ArcCos(Plus(C1, Times(d, Sqr(x))))))),
                              Sqr(Sin(Times(C1D2, ArcCos(Plus(C1, Times(d, Sqr(x))))))),
                              Power(Times(d, x), CN1)),
                          x),
                      Negate(Simp(Times(C2, Sqrt(Pi), Sin(Times(a, Power(Times(C2, b), CN1))),
                          Sin(Times(C1D2, ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                          FresnelC(Times(Sqrt(Power(Times(Pi, b), CN1)),
                              Sqrt(Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x))))))))),
                          Power(Times(Sqrt(Power(b, CN1)), d, x), CN1)), x)),
                      Simp(Times(C2, Sqrt(Pi), Cos(Times(a, Power(Times(C2, b), CN1))),
                          Sin(Times(C1D2, ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                          FresnelS(Times(Sqrt(Power(Times(Pi, b), CN1)),
                              Sqrt(Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x))))))))),
                          Power(Times(Sqrt(Power(b, CN1)), d, x), CN1)), x)),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4813,
              Integrate(
                  Sqrt(
                      Plus(a_DEFAULT, Times(ArcCos(Plus(CN1, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(C2, Sqrt(Plus(a, Times(b, ArcCos(Plus(CN1, Times(d, Sqr(x))))))),
                              Sqr(Cos(
                                  Times(C1D2, ArcCos(Plus(CN1, Times(d, Sqr(x))))))),
                              Power(Times(d, x), CN1)),
                          x),
                      Negate(
                          Simp(
                              Times(
                                  C2, Sqrt(Pi), Cos(Times(a, Power(Times(C2, b),
                                      CN1))),
                                  Cos(Times(C1D2,
                                      ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                                  FresnelC(
                                      Times(Sqrt(Power(Times(Pi, b), CN1)),
                                          Sqrt(
                                              Plus(
                                                  a, Times(b, ArcCos(Plus(CN1,
                                                      Times(d, Sqr(x))))))))),
                                  Power(Times(Sqrt(Power(b, CN1)), d, x), CN1)),
                              x)),
                      Negate(
                          Simp(
                              Times(C2, Sqrt(Pi), Sin(Times(a, Power(Times(C2, b), CN1))),
                                  Cos(Times(C1D2, ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                                  FresnelS(
                                      Times(Sqrt(Power(Times(Pi, b), CN1)),
                                          Sqrt(Plus(a, Times(b,
                                              ArcCos(Plus(CN1, Times(d, Sqr(x))))))))),
                                  Power(Times(Sqrt(Power(b, CN1)), d, x), CN1)),
                              x))),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4814,
              Integrate(
                  Power(
                      Plus(a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT)),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x, Power(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                              n)),
                          x),
                      Negate(Dist(Times(C4, Sqr(b), n, Subtract(n, C1)),
                          Integrate(Power(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                              Subtract(n, C2)), x),
                          x)),
                      Simp(
                          Times(C2, b, n,
                              Sqrt(Subtract(Times(CN2, c, d, Sqr(x)), Times(Sqr(d), Power(x, C4)))),
                              Power(
                                  Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))), Subtract(n,
                                      C1)),
                              Power(Times(d, x), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1), GtQ(n, C1)))),
          IIntegrate(4815,
              Integrate(
                  Power(Plus(
                      a_DEFAULT, Times(ArcCos(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x, Power(Plus(a, Times(b, ArcCos(Plus(c, Times(d, Sqr(x)))))),
                              n)),
                          x),
                      Negate(
                          Dist(
                              Times(C4, Sqr(b), n, Subtract(n,
                                  C1)),
                              Integrate(Power(Plus(a, Times(b, ArcCos(Plus(c, Times(d, Sqr(x)))))),
                                  Subtract(n, C2)), x),
                              x)),
                      Negate(
                          Simp(
                              Times(C2, b, n,
                                  Sqrt(
                                      Subtract(Times(CN2, c, d, Sqr(x)),
                                          Times(Sqr(d), Power(x, C4)))),
                                  Power(
                                      Plus(a, Times(b,
                                          ArcCos(Plus(c, Times(d, Sqr(x)))))),
                                      Subtract(n, C1)),
                                  Power(Times(d, x), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1), GtQ(n, C1)))),
          IIntegrate(4816,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(ArcSin(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                      CN1),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(x,
                                  Subtract(
                                      Times(c, Cos(
                                          Times(a, Power(Times(C2, b), CN1)))),
                                      Sin(Times(a, Power(Times(C2, b), CN1)))),
                                  CosIntegral(
                                      Times(c, Power(Times(C2, b), CN1), Plus(a,
                                          Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))))),
                                  Power(Times(C2, b, Subtract(
                                      Cos(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                      Times(c, Sin(Times(C1D2,
                                          ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                                      CN1)),
                              x)),
                      Simp(
                          Times(x,
                              Plus(Times(c, Cos(
                                  Times(a, Power(Times(C2, b), CN1)))), Sin(
                                      Times(a, Power(Times(C2, b), CN1)))),
                              SinIntegral(Times(c, Power(Times(C2, b), CN1),
                                  Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x)))))))),
                              Power(
                                  Times(C2, b,
                                      Subtract(Cos(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                          Times(c,
                                              Sin(Times(C1D2, ArcSin(
                                                  Plus(c, Times(d, Sqr(x))))))))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1)))),
          IIntegrate(4817,
              Integrate(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCos(Plus(C1, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT)),
                      CN1),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x, Cos(Times(a, Power(Times(C2, b), CN1))),
                              CosIntegral(
                                  Times(
                                      Plus(a, Times(b,
                                          ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                                      Power(Times(C2, b), CN1))),
                              Power(Times(CSqrt2, b, Sqrt(Times(CN1, d, Sqr(x)))), CN1)),
                          x),
                      Simp(
                          Times(x, Sin(Times(a, Power(Times(C2, b), CN1))),
                              SinIntegral(
                                  Times(
                                      Plus(a, Times(b,
                                          ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                                      Power(Times(C2, b), CN1))),
                              Power(Times(CSqrt2, b, Sqrt(Times(CN1, d, Sqr(x)))), CN1)),
                          x)),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4818,
              Integrate(
                  Power(
                      Plus(
                          a_DEFAULT,
                          Times(ArcCos(Plus(CN1, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                      CN1),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(x, Sin(Times(a, Power(Times(C2, b), CN1))),
                              CosIntegral(
                                  Times(
                                      Plus(a, Times(b,
                                          ArcCos(Plus(CN1, Times(d, Sqr(x)))))),
                                      Power(Times(C2, b), CN1))),
                              Power(Times(CSqrt2, b, Sqrt(Times(d, Sqr(x)))), CN1)),
                          x),
                      Simp(
                          Times(x, Cos(Times(a, Power(Times(C2, b), CN1))),
                              SinIntegral(
                                  Times(
                                      Plus(a, Times(b, ArcCos(Plus(CN1, Times(d, Sqr(x)))))), Power(
                                          Times(C2, b), CN1))),
                              Power(Times(CSqrt2, b, Sqrt(Times(d, Sqr(x)))), CN1)),
                          x)),
                  FreeQ(List(a, b, d), x))),
          IIntegrate(4819,
              Integrate(
                  Power(Plus(
                      a_DEFAULT, Times(ArcSin(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(Sqrt(Pi), x,
                                  Subtract(
                                      Cos(Times(a,
                                          Power(Times(C2, b), CN1))),
                                      Times(c, Sin(Times(a, Power(Times(C2, b), CN1))))),
                                  FresnelC(
                                      Times(C1,
                                          Sqrt(Plus(a,
                                              Times(b, ArcSin(Plus(c, Times(d, Sqr(x))))))),
                                          Power(Times(Sqrt(Times(b, c)), Sqrt(Pi)), CN1))),
                                  Power(Times(Sqrt(Times(b, c)), Subtract(Cos(Times(C1D2, ArcSin(
                                      Plus(c, Times(d, Sqr(x)))))), Times(c,
                                          Sin(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                                      CN1)),
                              x)),
                      Simp(
                          Times(Sqrt(Pi), x,
                              Plus(
                                  Cos(Times(a,
                                      Power(Times(C2, b), CN1))),
                                  Times(c, Sin(Times(a, Power(Times(C2, b), CN1))))),
                              FresnelS(Times(Power(Times(Sqrt(Times(b, c)), Sqrt(Pi)), CN1),
                                  Sqrt(Plus(a, Times(b, ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                              Power(
                                  Times(Sqrt(Times(b, c)),
                                      Subtract(Cos(Times(C1D2, ArcSin(Plus(c, Times(d, Sqr(x)))))),
                                          Times(c,
                                              Sin(Times(C1D2,
                                                  ArcSin(Plus(c, Times(d, Sqr(x))))))))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1)))),
          IIntegrate(4820,
              Integrate(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCos(Plus(C1, Times(d_DEFAULT, Sqr(x_)))),
                          b_DEFAULT)),
                      CN1D2),
                  x_Symbol),
              Condition(Subtract(
                  Simp(Times(CN2, Sqrt(Times(Pi, Power(b, CN1))),
                      Cos(Times(a, Power(Times(C2, b), CN1))),
                      Sin(Times(C1D2, ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                      FresnelC(Times(Sqrt(Power(Times(Pi, b), CN1)),
                          Sqrt(Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x))))))))),
                      Power(Times(d, x), CN1)), x),
                  Simp(Times(C2, Sqrt(Times(Pi, Power(b, CN1))),
                      Sin(Times(a, Power(Times(C2, b), CN1))),
                      Sin(Times(C1D2, ArcCos(Plus(C1, Times(d, Sqr(x)))))),
                      FresnelS(Times(Sqrt(Power(Times(Pi, b), CN1)),
                          Sqrt(Plus(a, Times(b, ArcCos(Plus(C1, Times(d, Sqr(x))))))))),
                      Power(Times(d, x), CN1)), x)),
                  FreeQ(List(a, b, d), x))));
}
