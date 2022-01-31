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
class IntRules293 {
  public static IAST RULES = List(IIntegrate(5861, Integrate(Times(
      Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)),
          n_DEFAULT),
      u_DEFAULT), x_Symbol),
      Condition(
          Unintegrable(Times(u,
              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), n)), x),
          FreeQ(List(a, b, c, n), x))),
      IIntegrate(5862,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      n_DEFAULT),
                  u_DEFAULT),
              x_Symbol),
          Condition(
              Unintegrable(Times(u, Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                  x),
              FreeQ(List(a, b, c, n), x))),
      IIntegrate(5863,
          Integrate(
              Power(Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, x_))), b_DEFAULT)),
                  n_DEFAULT),
              x_Symbol),
          Condition(
              Dist(Power(d, CN1),
                  Subst(Integrate(Power(Plus(a, Times(b, ArcSinh(x))), n), x), x,
                      Plus(c, Times(d, x))),
                  x),
              FreeQ(List(a, b, c, d, n), x))),
      IIntegrate(5864,
          Integrate(
              Power(
                  Plus(a_DEFAULT, Times(ArcCosh(Plus(c_, Times(d_DEFAULT, x_))),
                      b_DEFAULT)),
                  n_DEFAULT),
              x_Symbol),
          Condition(
              Dist(Power(d, CN1),
                  Subst(
                      Integrate(Power(Plus(a, Times(b, ArcCosh(x))),
                          n), x),
                      x, Plus(c, Times(d, x))),
                  x),
              FreeQ(List(a, b, c, d, n), x))),
      IIntegrate(5865,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, x_))),
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
                              Power(Plus(a, Times(b, ArcSinh(x))), n)),
                          x),
                      x, Plus(c, Times(d, x))),
                  x),
              FreeQ(List(a, b, c, d, e, f, m, n), x))),
      IIntegrate(5866,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCosh(Plus(c_, Times(d_DEFAULT, x_))),
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
                                  Plus(
                                      Times(Subtract(Times(d, e), Times(c, f)),
                                          Power(d, CN1)),
                                      Times(f, x, Power(d, CN1))),
                                  m),
                              Power(Plus(a, Times(b, ArcCosh(x))), n)),
                          x),
                      x, Plus(c, Times(d, x))),
                  x),
              FreeQ(List(a, b, c, d, e, f, m, n), x))),
      IIntegrate(5867,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT,
                      Times(ArcSinh(Plus(c_, Times(d_DEFAULT, x_))), b_DEFAULT)), n_DEFAULT),
                  Power(Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Dist(Power(d, CN1),
                  Subst(
                      Integrate(
                          Times(
                              Power(Plus(Times(CSymbol, Power(d, CN2)),
                                  Times(CSymbol, Sqr(x), Power(d, CN2))), p),
                              Power(Plus(a, Times(b, ArcSinh(x))), n)),
                          x),
                      x, Plus(c, Times(d, x))),
                  x),
              And(FreeQ(List(a, b, c, d, ASymbol, BSymbol, CSymbol, n, p), x),
                  EqQ(Subtract(Times(BSymbol, Plus(C1, Sqr(c))),
                      Times(C2, ASymbol, c, d)), C0),
                  EqQ(Subtract(Times(C2, c, CSymbol), Times(BSymbol, d)), C0)))),
      IIntegrate(5868,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT,
                      Times(ArcCosh(Plus(c_, Times(d_DEFAULT, x_))), b_DEFAULT)), n_DEFAULT),
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
                              Power(Plus(a, Times(b, ArcCosh(x))), n)),
                          x),
                      x, Plus(c, Times(d, x))),
                  x),
              And(FreeQ(List(a, b, c, d, ASymbol, BSymbol, CSymbol, n, p), x),
                  EqQ(Plus(Times(BSymbol, Subtract(C1, Sqr(c))),
                      Times(C2, ASymbol, c, d)), C0),
                  EqQ(Subtract(Times(C2, c, CSymbol), Times(BSymbol, d)), C0)))),
      IIntegrate(5869,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, x_))),
                          b_DEFAULT)),
                      n_DEFAULT),
                  Power(Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_)), m_DEFAULT),
                  Power(Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Dist(Power(d, CN1),
                  Subst(
                      Integrate(Times(
                          Power(Plus(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)),
                              Times(f, x, Power(d, CN1))), m),
                          Power(
                              Plus(Times(CSymbol, Power(d, CN2)),
                                  Times(CSymbol, Sqr(x), Power(d, CN2))),
                              p),
                          Power(Plus(a, Times(b, ArcSinh(x))), n)), x),
                      x, Plus(c, Times(d, x))),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n, p), x),
                  EqQ(Subtract(Times(BSymbol, Plus(C1, Sqr(c))),
                      Times(C2, ASymbol, c, d)), C0),
                  EqQ(Subtract(Times(C2, c, CSymbol), Times(BSymbol, d)), C0)))),
      IIntegrate(5870,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCosh(Plus(c_, Times(d_DEFAULT, x_))),
                          b_DEFAULT)),
                      n_DEFAULT),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                  Power(Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Dist(Power(d, CN1),
                  Subst(
                      Integrate(
                          Times(
                              Power(Plus(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)),
                                  Times(f, x, Power(d, CN1))), m),
                              Power(Plus(Times(CN1, CSymbol, Power(d, CN2)),
                                  Times(CSymbol, Sqr(x), Power(d, CN2))), p),
                              Power(Plus(a, Times(b, ArcCosh(x))), n)),
                          x),
                      x, Plus(c, Times(d, x))),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n, p), x),
                  EqQ(Plus(Times(BSymbol, Subtract(C1, Sqr(c))), Times(C2, ASymbol, c, d)), C0),
                  EqQ(Subtract(Times(C2, c, CSymbol), Times(BSymbol, d)), C0)))),
      IIntegrate(5871,
          Integrate(
              Sqrt(Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT))),
              x_Symbol),
          Condition(
              Plus(
                  Simp(Times(x,
                      Sqrt(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))))), x),
                  Negate(
                      Simp(
                          Times(Sqrt(Pi), x,
                              Subtract(
                                  Cosh(Times(a,
                                      Power(Times(C2, b), CN1))),
                                  Times(c, Sinh(Times(a, Power(Times(C2, b), CN1))))),
                              FresnelC(Times(Sqrt(Times(CN1, c, Power(Times(Pi, b), CN1))), Sqrt(
                                  Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                              Power(Times(Sqrt(Times(CN1, c, Power(b, CN1))), Plus(Cosh(Times(C1D2,
                                  ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                  Times(c, Sinh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                                  CN1)),
                          x)),
                  Simp(
                      Times(Sqrt(Pi), x,
                          Plus(
                              Cosh(Times(a,
                                  Power(Times(C2, b), CN1))),
                              Times(c, Sinh(Times(a, Power(Times(C2, b), CN1))))),
                          FresnelS(Times(Sqrt(Times(CN1, c, Power(Times(Pi, b), CN1))), Sqrt(
                              Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                          Power(
                              Times(
                                  Sqrt(Times(CN1, c, Power(b, CN1))),
                                  Plus(
                                      Cosh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                      Times(
                                          c,
                                          Sinh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                              CN1)),
                      x)),
              And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), CN1)))),
      IIntegrate(5872,
          Integrate(
              Power(
                  Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                      b_DEFAULT)),
                  n_),
              x_Symbol),
          Condition(
              Plus(
                  Simp(Times(x,
                      Power(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))), n)), x),
                  Dist(
                      Times(C4, Sqr(b), n, Subtract(n,
                          C1)),
                      Integrate(
                          Power(
                              Plus(a, Times(b,
                                  ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                              Subtract(n, C2)),
                          x),
                      x),
                  Negate(
                      Simp(
                          Times(C2, b, n,
                              Sqrt(Plus(Times(C2, c, d, Sqr(x)), Times(Sqr(d), Power(x, C4)))),
                              Power(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                  Subtract(n, C1)),
                              Power(Times(d, x), CN1)),
                          x))),
              And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), CN1), GtQ(n, C1)))),
      IIntegrate(5873,
          Integrate(
              Power(
                  Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                      b_DEFAULT)),
                  CN1),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(x,
                          Subtract(
                              Times(c, Cosh(
                                  Times(a, Power(Times(C2, b), CN1)))),
                              Sinh(Times(a, Power(Times(C2, b), CN1)))),
                          CoshIntegral(
                              Times(
                                  Plus(a, Times(b,
                                      ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                  Power(Times(C2, b), CN1))),
                          Power(
                              Times(C2, b,
                                  Plus(
                                      Cosh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                      Times(
                                          c,
                                          Sinh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                              CN1)),
                      x),
                  Simp(
                      Times(x,
                          Subtract(Cosh(Times(a, Power(Times(C2, b), CN1))),
                              Times(c, Sinh(Times(a, Power(Times(C2, b), CN1))))),
                          SinhIntegral(
                              Times(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                  Power(Times(C2, b), CN1))),
                          Power(
                              Times(C2, b,
                                  Plus(Cosh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                      Times(c, Sinh(Times(C1D2, ArcSinh(Plus(c,
                                          Times(d, Sqr(x))))))))),
                              CN1)),
                      x)),
              And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), CN1)))),
      IIntegrate(5874,
          Integrate(
              Power(Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                  CN1D2),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Plus(c, C1), Sqrt(CPiHalf), x,
                          Subtract(
                              Cosh(Times(a, Power(Times(C2, b), CN1))), Sinh(
                                  Times(a, Power(Times(C2, b), CN1)))),
                          Erfi(
                              Times(Sqrt(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x))))))),
                                  Power(Times(C2, b), CN1D2))),
                          Power(
                              Times(C2, Sqrt(b),
                                  Plus(
                                      Cosh(Times(C1D2,
                                          ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                      Times(
                                          c, Sinh(Times(C1D2, ArcSinh(
                                              Plus(c, Times(d, Sqr(x))))))))),
                              CN1)),
                      x),
                  Simp(
                      Times(Subtract(c, C1), Sqrt(CPiHalf), x,
                          Plus(
                              Cosh(Times(a,
                                  Power(Times(C2, b), CN1))),
                              Sinh(Times(a, Power(Times(C2, b), CN1)))),
                          Erf(Times(Sqrt(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x))))))),
                              Power(Times(C2, b), CN1D2))),
                          Power(
                              Times(C2, Sqrt(b),
                                  Plus(Cosh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                      Times(c, Sinh(Times(C1D2, ArcSinh(
                                          Plus(c, Times(d, Sqr(x))))))))),
                              CN1)),
                      x)),
              And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), CN1)))),
      IIntegrate(5875,
          Integrate(
              Power(
                  Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                      b_DEFAULT)),
                  QQ(-3L, 2L)),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(
                          Times(
                              Sqrt(Plus(Times(C2, c, d, Sqr(
                                  x)), Times(Sqr(d),
                                      Power(x, C4)))),
                              Power(
                                  Times(
                                      b, d, x,
                                      Sqrt(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))))),
                                  CN1)),
                          x)),
                  Negate(
                      Simp(
                          Times(Power(Times(CN1, c, Power(b, CN1)), QQ(3L, 2L)), Sqrt(Pi), x,
                              Subtract(Cosh(Times(a, Power(Times(C2, b), CN1))),
                                  Times(c, Sinh(Times(a, Power(Times(C2, b), CN1))))),
                              FresnelC(Times(Sqrt(Times(CN1, c, Power(Times(Pi, b), CN1))),
                                  Sqrt(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                              Power(
                                  Plus(Cosh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                      Times(c,
                                          Sinh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))))),
                                  CN1)),
                          x)),
                  Simp(
                      Times(Power(Times(CN1, c, Power(b, CN1)), QQ(3L, 2L)), Sqrt(Pi), x,
                          Plus(
                              Cosh(Times(a, Power(Times(C2, b), CN1))),
                              Times(c, Sinh(Times(a, Power(Times(C2, b), CN1))))),
                          FresnelS(
                              Times(Sqrt(Times(CN1, c, Power(Times(Pi, b), CN1))), Sqrt(
                                  Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                          Power(
                              Plus(Cosh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                  Times(c, Sinh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))))),
                              CN1)),
                      x)),
              And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), CN1)))),
      IIntegrate(5876,
          Integrate(
              Power(
                  Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                      b_DEFAULT)),
                  CN2),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(
                          Times(Sqrt(Plus(Times(C2, c, d, Sqr(x)), Times(Sqr(d), Power(x, C4)))),
                              Power(
                                  Times(
                                      C2, b, d, x, Plus(a, Times(b,
                                          ArcSinh(Plus(c, Times(d, Sqr(x))))))),
                                  CN1)),
                          x)),
                  Simp(
                      Times(x,
                          Subtract(
                              Cosh(Times(a,
                                  Power(Times(C2, b), CN1))),
                              Times(c, Sinh(Times(a, Power(Times(C2, b), CN1))))),
                          CoshIntegral(
                              Times(
                                  Plus(a, Times(b,
                                      ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                  Power(Times(C2, b), CN1))),
                          Power(
                              Times(C4, Sqr(b),
                                  Plus(
                                      Cosh(Times(C1D2,
                                          ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                      Times(c, Sinh(Times(C1D2,
                                          ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                              CN1)),
                      x),
                  Simp(
                      Times(x,
                          Subtract(Times(c, Cosh(Times(a, Power(Times(C2, b), CN1)))), Sinh(
                              Times(a, Power(Times(C2, b), CN1)))),
                          SinhIntegral(Times(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                              Power(Times(C2, b), CN1))),
                          Power(
                              Times(
                                  C4, Sqr(b),
                                  Plus(
                                      Cosh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                                      Times(
                                          c,
                                          Sinh(Times(C1D2, ArcSinh(Plus(c, Times(d, Sqr(x))))))))),
                              CN1)),
                      x)),
              And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), CN1)))),
      IIntegrate(5877,
          Integrate(
              Power(Plus(a_DEFAULT, Times(ArcSinh(Plus(c_, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT)),
                  n_),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(
                          Times(x,
                              Power(
                                  Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))), Plus(n,
                                      C2)),
                              Power(Times(C4, Sqr(b), Plus(n, C1), Plus(n, C2)), CN1)),
                          x)),
                  Dist(Power(Times(C4, Sqr(b), Plus(n, C1), Plus(n, C2)), CN1),
                      Integrate(
                          Power(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                              Plus(n, C2)),
                          x),
                      x),
                  Simp(
                      Times(
                          Sqrt(Plus(Times(C2, c, d, Sqr(
                              x)), Times(Sqr(d),
                                  Power(x, C4)))),
                          Power(Plus(a, Times(b, ArcSinh(Plus(c, Times(d, Sqr(x)))))),
                              Plus(n, C1)),
                          Power(Times(C2, b, d, Plus(n, C1), x), CN1)),
                      x)),
              And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), CN1), LtQ(n, CN1), NeQ(n, CN2)))),
      IIntegrate(5878,
          Integrate(
              Sqrt(Plus(a_DEFAULT, Times(ArcCosh(Plus(C1, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT))),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(C2, Sqrt(Plus(a, Times(b, ArcCosh(Plus(C1, Times(d, Sqr(x))))))),
                          Sqr(Sinh(Times(C1D2, ArcCosh(Plus(C1, Times(d, Sqr(x))))))), Power(
                              Times(d, x), CN1)),
                      x),
                  Simp(
                      Times(Sqrt(b), Sqrt(CPiHalf),
                          Plus(
                              Cosh(Times(a, Power(Times(C2, b), CN1))), Sinh(Times(a,
                                  Power(Times(C2, b), CN1)))),
                          Sinh(Times(C1D2,
                              ArcCosh(Plus(C1, Times(d, Sqr(x)))))),
                          Erf(Times(Power(Times(C2, b), CN1D2),
                              Sqrt(Plus(a, Times(b, ArcCosh(Plus(C1, Times(d, Sqr(x))))))))),
                          Power(Times(d, x), CN1)),
                      x),
                  Negate(
                      Simp(
                          Times(Sqrt(b), Sqrt(CPiHalf),
                              Subtract(Cosh(Times(a, Power(Times(C2, b), CN1))),
                                  Sinh(Times(a, Power(Times(C2, b), CN1)))),
                              Sinh(Times(C1D2, ArcCosh(Plus(C1, Times(d, Sqr(x)))))),
                              Erfi(
                                  Times(Power(Times(C2, b), CN1D2),
                                      Sqrt(Plus(a,
                                          Times(b, ArcCosh(Plus(C1, Times(d, Sqr(x))))))))),
                              Power(Times(d, x), CN1)),
                          x))),
              FreeQ(List(a, b, d), x))),
      IIntegrate(5879,
          Integrate(
              Sqrt(
                  Plus(a_DEFAULT, Times(ArcCosh(Plus(CN1, Times(d_DEFAULT, Sqr(x_)))), b_DEFAULT))),
              x_Symbol),
          Condition(
              Plus(
                  Simp(Times(C2, Sqrt(Plus(a, Times(b, ArcCosh(Plus(CN1, Times(d, Sqr(x))))))),
                      Sqr(Cosh(Times(C1D2, ArcCosh(Plus(CN1, Times(d, Sqr(x))))))), Power(
                          Times(d, x), CN1)),
                      x),
                  Negate(
                      Simp(
                          Times(Sqrt(b), Sqrt(CPiHalf),
                              Plus(
                                  Cosh(Times(a, Power(Times(C2, b), CN1))), Sinh(Times(a,
                                      Power(Times(C2, b), CN1)))),
                              Cosh(Times(C1D2,
                                  ArcCosh(Plus(CN1, Times(d, Sqr(x)))))),
                              Erf(Times(Power(Times(C2, b), CN1D2),
                                  Sqrt(Plus(a, Times(b, ArcCosh(Plus(CN1, Times(d, Sqr(x))))))))),
                              Power(Times(d, x), CN1)),
                          x)),
                  Negate(
                      Simp(
                          Times(Sqrt(b), Sqrt(CPiHalf),
                              Subtract(
                                  Cosh(Times(a, Power(Times(C2, b), CN1))),
                                  Sinh(Times(a, Power(Times(C2, b), CN1)))),
                              Cosh(Times(C1D2, ArcCosh(Plus(CN1, Times(d, Sqr(x)))))),
                              Erfi(
                                  Times(Power(Times(C2, b), CN1D2),
                                      Sqrt(Plus(a,
                                          Times(b, ArcCosh(Plus(CN1, Times(d, Sqr(x))))))))),
                              Power(Times(d, x), CN1)),
                          x))),
              FreeQ(List(a, b, d), x))),
      IIntegrate(5880,
          Integrate(
              Power(
                  Plus(a_DEFAULT, Times(ArcCosh(Plus(c_, Times(d_DEFAULT, Sqr(x_)))),
                      b_DEFAULT)),
                  n_),
              x_Symbol),
          Condition(
              Plus(
                  Simp(Times(x,
                      Power(Plus(a, Times(b, ArcCosh(Plus(c, Times(d, Sqr(x)))))), n)), x),
                  Dist(
                      Times(C4, Sqr(b), n, Subtract(n,
                          C1)),
                      Integrate(Power(Plus(a, Times(b, ArcCosh(Plus(c, Times(d, Sqr(x)))))),
                          Subtract(n, C2)), x),
                      x),
                  Negate(Simp(Times(C2, b, n,
                      Plus(Times(C2, c, d, Sqr(x)), Times(Sqr(d), Power(x, C4))),
                      Power(Plus(a, Times(b, ArcCosh(Plus(c, Times(d, Sqr(x)))))), Subtract(n, C1)),
                      Power(Times(d, x, Sqrt(Plus(CN1, c, Times(d, Sqr(x)))),
                          Sqrt(Plus(C1, c, Times(d, Sqr(x))))), CN1)),
                      x))),
              And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(c), C1), GtQ(n, C1)))));
}
