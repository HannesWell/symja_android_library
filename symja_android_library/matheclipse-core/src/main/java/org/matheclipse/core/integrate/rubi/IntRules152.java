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
class IntRules152 {
  public static IAST RULES =
      List(
          IIntegrate(3041,
              Integrate(
                  Times(
                      Power(
                          Plus(a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Plus(Times(a, ASymbol), Times(CN1, b, BSymbol), Times(a, CSymbol)),
                              Cos(Plus(e, Times(f,
                                  x))),
                              Power(Plus(a, Times(b, Sin(
                                  Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d,
                                  Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                              Power(
                                  Times(
                                      f, Subtract(Times(b, c), Times(a, d)), Plus(Times(C2, m),
                                          C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(b, Subtract(Times(b, c), Times(a, d)),
                                  Plus(Times(C2, m), C1)),
                              CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                  C1)), Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(Plus(
                                      Times(ASymbol,
                                          Subtract(Times(a, c, Plus(m,
                                              C1)), Times(b, d,
                                                  Plus(Times(C2, m), n, C2)))),
                                      Times(BSymbol,
                                          Plus(Times(b, c, m), Times(a, d, Plus(n, C1)))),
                                      Times(CN1, CSymbol,
                                          Plus(Times(a, c, m), Times(b, d, Plus(n, C1)))),
                                      Times(
                                          Plus(
                                              Times(
                                                  d, Subtract(Times(a, ASymbol), Times(b, BSymbol)),
                                                  Plus(m, n, C2)),
                                              Times(CSymbol,
                                                  Subtract(Times(b, c, Plus(Times(C2, m), C1)),
                                                      Times(a, d, Subtract(Subtract(m, n), C1))))),
                                          Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0), LtQ(m, Negate(C1D2))))),
          IIntegrate(3042,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_DEFAULT),
                      Plus(A_DEFAULT, Times(C_DEFAULT,
                          Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(a, Plus(ASymbol, CSymbol), Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                              Power(
                                  Times(
                                      f, Subtract(Times(b, c), Times(a, d)),
                                      Plus(Times(C2, m), C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(b, Subtract(Times(b, c), Times(a, d)),
                                  Plus(Times(C2, m), C1)),
                              CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(
                                      Plus(
                                          Times(ASymbol, Subtract(Times(a, c, Plus(m, C1)), Times(b,
                                              d, Plus(Times(C2, m), n, C2)))),
                                          Times(CN1, CSymbol,
                                              Plus(Times(a, c, m), Times(b, d, Plus(n, C1)))),
                                          Times(
                                              Plus(Times(a, ASymbol, d, Plus(m, n, C2)),
                                                  Times(CSymbol,
                                                      Subtract(Times(b, c, Plus(Times(C2, m), C1)),
                                                          Times(a, d,
                                                              Subtract(Subtract(m, n), C1))))),
                                              Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      LtQ(m, Negate(C1D2))))),
          IIntegrate(3043,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Plus(Times(Sqr(c), CSymbol), Times(CN1, BSymbol, c, d),
                                      Times(ASymbol, Sqr(d))),
                                  Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d,
                                      Sin(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(Times(d, f, Plus(n, C1), Subtract(Sqr(c), Sqr(d))), CN1)),
                              x)),
                      Dist(Power(Times(b, d, Plus(n, C1), Subtract(Sqr(c), Sqr(d))), CN1),
                          Integrate(Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                              Simp(
                                  Plus(
                                      Times(
                                          ASymbol, d,
                                          Plus(Times(a, d, m), Times(b, c, Plus(n, C1)))),
                                      Times(Subtract(Times(c, CSymbol), Times(BSymbol, d)), Plus(
                                          Times(a, c, m), Times(b, d, Plus(n, C1)))),
                                      Times(b, Subtract(
                                          Times(d, Subtract(Times(BSymbol, c), Times(ASymbol, d)),
                                              Plus(m, n, C2)),
                                          Times(CSymbol,
                                              Plus(Times(Sqr(c), Plus(m, C1)),
                                                  Times(Sqr(d), Plus(n, C1))))),
                                          Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)),
                          C0),
                      Not(LtQ(m, Negate(C1D2))), Or(LtQ(n, CN1), EqQ(Plus(m, n, C2), C0))))),
          IIntegrate(3044,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT,
                              Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Plus(Times(Sqr(c), CSymbol), Times(ASymbol, Sqr(d))),
                                  Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d,
                                      Sin(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(Times(d, f, Plus(n, C1), Subtract(Sqr(c), Sqr(d))), CN1)),
                              x)),
                      Dist(
                          Power(Times(b, d, Plus(n, C1),
                              Subtract(Sqr(c), Sqr(d))), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                                  Simp(Subtract(
                                      Plus(
                                          Times(ASymbol, d,
                                              Plus(Times(a, d, m), Times(b, c, Plus(n, C1)))),
                                          Times(c, CSymbol,
                                              Plus(Times(a, c, m), Times(b, d, Plus(n, C1))))),
                                      Times(b,
                                          Plus(Times(ASymbol, Sqr(d), Plus(m, n, C2)),
                                              Times(CSymbol,
                                                  Plus(Times(Sqr(c), Plus(m, C1)),
                                                      Times(Sqr(d), Plus(n, C1))))),
                                          Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, m), x), NeQ(
                      Subtract(Times(b, c), Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0), Not(LtQ(m, Negate(C1D2))), Or(LtQ(n, CN1),
                          EqQ(Plus(m, n, C2), C0))))),
          IIntegrate(3045,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(CSymbol, Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d,
                                      Sin(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(Times(d, f, Plus(m, n, C2)), CN1)),
                              x)),
                      Dist(Power(Times(b, d, Plus(m, n, C2)), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(Plus(Times(ASymbol, b, d, Plus(m, n, C2)),
                                      Times(CSymbol,
                                          Plus(Times(a, c, m), Times(b, d, Plus(n, C1)))),
                                      Times(
                                          Plus(
                                              Times(CSymbol,
                                                  Subtract(Times(a, d, m),
                                                      Times(b, c, Plus(m, C1)))),
                                              Times(b, BSymbol, d, Plus(m, n, C2))),
                                          Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(
                          d)), C0),
                      Not(LtQ(m, Negate(C1D2))), NeQ(Plus(m, n, C2), C0)))),
          IIntegrate(3046,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(CSymbol, Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d,
                                      Sin(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(Times(d, f, Plus(m, n, C2)), CN1)),
                              x)),
                      Dist(Power(Times(b, d, Plus(m, n, C2)), CN1),
                          Integrate(Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                              Simp(Plus(Times(ASymbol, b, d, Plus(m, n, C2)),
                                  Times(CSymbol, Plus(Times(a, c, m), Times(b, d, Plus(n, C1)))),
                                  Times(CSymbol, Subtract(Times(a, d, m), Times(b, c, Plus(m, C1))),
                                      Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, m, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(
                          d)), C0),
                      Not(LtQ(m, Negate(C1D2))), NeQ(Plus(m, n, C2), C0)))),
          IIntegrate(3047,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Plus(Times(Sqr(c), CSymbol), Times(CN1, BSymbol, c, d),
                                      Times(ASymbol, Sqr(d))),
                                  Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d,
                                      Sin(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(Times(d, f, Plus(n, C1), Subtract(Sqr(c), Sqr(d))), CN1)),
                              x)),
                      Dist(
                          Power(Times(d, Plus(n, C1),
                              Subtract(Sqr(c), Sqr(d))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                                  Simp(Plus(
                                      Times(ASymbol, d, Plus(Times(b, d, m), Times(a, c, Plus(
                                          n, C1)))),
                                      Times(
                                          Subtract(Times(c, CSymbol), Times(BSymbol, d)),
                                          Plus(Times(b, c, m), Times(a, d, Plus(n, C1)))),
                                      Times(CN1, Subtract(
                                          Times(
                                              d,
                                              Plus(
                                                  Times(ASymbol,
                                                      Subtract(Times(a, d, Plus(n, C2)),
                                                          Times(b, c, Plus(n, C1)))),
                                                  Times(BSymbol,
                                                      Subtract(Times(b, d, Plus(n, C1)),
                                                          Times(a, c, Plus(n, C2)))))),
                                          Times(CSymbol,
                                              Subtract(Times(b, c, d, Plus(n, C1)),
                                                  Times(a,
                                                      Plus(Sqr(c), Times(Sqr(d), Plus(n, C1))))))),
                                          Sin(Plus(e, Times(f, x)))),
                                      Times(b, Subtract(
                                          Times(d, Subtract(Times(BSymbol, c), Times(ASymbol, d)),
                                              Plus(m, n, C2)),
                                          Times(CSymbol,
                                              Plus(Times(Sqr(c), Plus(m, C1)),
                                                  Times(Sqr(d), Plus(n, C1))))),
                                          Sqr(Sin(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0), GtQ(m, C0), LtQ(n, CN1)))),
          IIntegrate(3048,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(Plus(c_DEFAULT,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_),
                      Plus(A_DEFAULT,
                          Times(C_DEFAULT,
                              Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(Times(Plus(Times(Sqr(c), CSymbol), Times(ASymbol, Sqr(d))),
                          Cos(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)), Power(
                              Times(d, f, Plus(n, C1), Subtract(Sqr(c), Sqr(d))), CN1)),
                          x)),
                      Dist(
                          Power(Times(d, Plus(n, C1),
                              Subtract(Sqr(c), Sqr(d))), CN1),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b,
                                          Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Plus(c, Times(d,
                                      Sin(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Simp(Subtract(
                                      Subtract(
                                          Plus(Times(ASymbol, d,
                                              Plus(Times(b, d, m), Times(a, c, Plus(n, C1)))),
                                              Times(c, CSymbol,
                                                  Plus(Times(b, c, m), Times(a, d, Plus(n, C1))))),
                                          Times(
                                              Subtract(
                                                  Times(ASymbol, d,
                                                      Subtract(Times(a, d, Plus(n, C2)),
                                                          Times(b, c, Plus(n, C1)))),
                                                  Times(CSymbol,
                                                      Subtract(Times(b, c, d, Plus(n, C1)),
                                                          Times(a,
                                                              Plus(Sqr(c),
                                                                  Times(Sqr(d), Plus(n, C1))))))),
                                              Sin(Plus(e, Times(f, x))))),
                                      Times(b,
                                          Plus(Times(ASymbol, Sqr(d), Plus(m, n, C2)),
                                              Times(CSymbol,
                                                  Plus(Times(Sqr(c), Plus(m, C1)),
                                                      Times(Sqr(d), Plus(n, C1))))),
                                          Sqr(Sin(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(
                          d)), C0),
                      GtQ(m, C0), LtQ(n, CN1)))),
          IIntegrate(3049,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(
                              b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(Plus(c_DEFAULT, Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(
                          f_DEFAULT, x_))))), n_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(CSymbol, Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                                  Power(Times(d, f, Plus(m, n, C2)), CN1)),
                              x)),
                      Dist(
                          Power(Times(d,
                              Plus(m, n, C2)), CN1),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b,
                                          Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(Plus(
                                      Times(a, ASymbol, d, Plus(m, n,
                                          C2)),
                                      Times(CSymbol,
                                          Plus(Times(b, c, m), Times(a, d, Plus(n, C1)))),
                                      Times(
                                          Subtract(
                                              Times(d, Plus(Times(ASymbol, b), Times(a, BSymbol)),
                                                  Plus(m, n, C2)),
                                              Times(CSymbol,
                                                  Subtract(
                                                      Times(a, c), Times(b, d, Plus(m, n, C1))))),
                                          Sin(Plus(e, Times(f, x)))),
                                      Times(
                                          Plus(
                                              Times(CSymbol,
                                                  Subtract(Times(a, d, m),
                                                      Times(b, c, Plus(m, C1)))),
                                              Times(b, BSymbol, d, Plus(m, n, C2))),
                                          Sqr(Sin(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      GtQ(m, C0), Not(And(IGtQ(n, C0), Or(
                          Not(IntegerQ(m)), And(EqQ(a, C0), NeQ(c, C0)))))))),
          IIntegrate(3050,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(C_DEFAULT,
                              Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(CSymbol, Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d,
                                      Sin(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(Times(d, f, Plus(m, n, C2)), CN1)),
                              x)),
                      Dist(
                          Power(Times(d,
                              Plus(m, n, C2)), CN1),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b,
                                          Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(Plus(
                                      Times(a, ASymbol, d, Plus(m, n, C2)),
                                      Times(CSymbol,
                                          Plus(Times(b, c, m), Times(a, d, Plus(n, C1)))),
                                      Times(
                                          Subtract(Times(ASymbol, b, d, Plus(m, n, C2)),
                                              Times(CSymbol,
                                                  Subtract(Times(a, c),
                                                      Times(b, d, Plus(m, n, C1))))),
                                          Sin(Plus(e, Times(f, x)))),
                                      Times(CSymbol,
                                          Subtract(Times(a, d, m), Times(b, c, Plus(m, C1))),
                                          Sqr(Sin(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      GtQ(m, C0), Not(And(IGtQ(n, C0),
                          Or(Not(IntegerQ(m)), And(EqQ(a, C0), NeQ(c, C0)))))))),
          IIntegrate(3051,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          CN1D2),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          QQ(-3L, 2L)),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(CSymbol, Power(Times(b, d),
                              CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Times(d, Sin(Plus(e, Times(f, x))))), Power(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(Power(b, CN1),
                          Integrate(
                              Times(
                                  Plus(Times(ASymbol, b),
                                      Times(Subtract(Times(b, BSymbol), Times(a, CSymbol)),
                                          Sin(Plus(e, Times(f, x))))),
                                  Power(
                                      Times(
                                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                              QQ(3L, 2L)),
                                          Sqrt(Times(d, Sin(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol,
                      CSymbol), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(3052,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          CN1D2),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          QQ(-3L, 2L)),
                      Plus(A_DEFAULT,
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(CSymbol, Power(Times(b, d),
                              CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Times(d, Sin(
                                      Plus(e, Times(f, x))))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(Power(b, CN1),
                          Integrate(
                              Times(
                                  Subtract(
                                      Times(ASymbol, b),
                                      Times(a, CSymbol, Sin(Plus(e, Times(f, x))))),
                                  Power(Times(Power(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x))))), QQ(3L, 2L)), Sqrt(Times(d,
                                          Sin(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3053,
              Integrate(
                  Times(
                      Power(Plus(
                          a_DEFAULT, Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_))))),
                          QQ(-3L, 2L)),
                      Power(Plus(
                          c_DEFAULT, Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT, Sqr($($s("§sin"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(CSymbol, Power(b, CN2)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), Power(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(Power(b, CN2),
                          Integrate(
                              Times(
                                  Plus(Times(ASymbol, Sqr(b)), Times(CN1, Sqr(a), CSymbol),
                                      Times(b, Subtract(Times(b, BSymbol), Times(C2, a, CSymbol)),
                                          Sin(Plus(e, Times(f, x))))),
                                  Power(
                                      Times(
                                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                              QQ(3L, 2L)),
                                          Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), NeQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3054,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          QQ(-3L, 2L)),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Plus(A_DEFAULT,
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(CSymbol, Power(b,
                              CN2)),
                          Integrate(Times(
                              Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(Power(b, CN2),
                          Integrate(
                              Times(
                                  Subtract(Subtract(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                                      Times(C2, a, b, CSymbol, Sin(Plus(e, Times(f, x))))),
                                  Power(
                                      Times(
                                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                              QQ(3L, 2L)),
                                          Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3055,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT, Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT,
                              Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(
                              Plus(
                                  Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol),
                                  Times(Sqr(a), CSymbol)),
                              Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                              Power(Times(
                                  f, Plus(m, C1), Subtract(Times(b, c), Times(a, d)),
                                  Subtract(Sqr(a), Sqr(b))), CN1)),
                              x)),
                      Dist(Power(Times(
                          Plus(m, C1), Subtract(Times(b, c), Times(a, d)),
                          Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n), Simp(Subtract(
                                  Subtract(
                                      Plus(
                                          Times(Plus(m, C1), Subtract(Times(b, c), Times(a, d)),
                                              Plus(Times(a, ASymbol), Times(CN1, b, BSymbol),
                                                  Times(a, CSymbol))),
                                          Times(d,
                                              Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b,
                                                  BSymbol), Times(Sqr(a), CSymbol)),
                                              Plus(m, n, C2))),
                                      Times(
                                          Plus(
                                              Times(c,
                                                  Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b,
                                                      BSymbol), Times(Sqr(a), CSymbol))),
                                              Times(Plus(m, C1), Subtract(Times(b, c), Times(a, d)),
                                                  Plus(Times(ASymbol, b), Times(CN1, a, BSymbol),
                                                      Times(b, CSymbol)))),
                                          Sin(Plus(e, Times(f, x))))),
                                  Times(d,
                                      Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol),
                                          Times(Sqr(a), CSymbol)),
                                      Plus(m, n, C3), Sqr(Sin(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0), LtQ(m, CN1),
                      Or(And(EqQ(a, C0), IntegerQ(m), Not(IntegerQ(n))),
                          Not(And(IntegerQ(Times(C2, n)), LtQ(n, CN1),
                              Or(And(IntegerQ(n), Not(IntegerQ(m))), EqQ(a, C0)))))))),
          IIntegrate(3056,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_),
                      Plus(A_DEFAULT,
                          Times(C_DEFAULT,
                              Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                                  Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                                  Power(
                                      Times(f, Plus(m, C1), Subtract(Times(b, c), Times(a, d)),
                                          Subtract(Sqr(a), Sqr(b))),
                                      CN1)),
                              x)),
                      Dist(
                          Power(
                              Times(
                                  Plus(m, C1), Subtract(Times(b, c), Times(a, d)), Subtract(Sqr(a),
                                      Sqr(b))),
                              CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(Subtract(
                                      Subtract(
                                          Plus(
                                              Times(a, Plus(m, C1),
                                                  Subtract(Times(b, c), Times(a, d)),
                                                  Plus(ASymbol, CSymbol)),
                                              Times(d,
                                                  Plus(Times(ASymbol, Sqr(b)),
                                                      Times(Sqr(a), CSymbol)),
                                                  Plus(m, n, C2))),
                                          Times(
                                              Plus(
                                                  Times(c,
                                                      Plus(Times(ASymbol, Sqr(b)),
                                                          Times(Sqr(a), CSymbol))),
                                                  Times(b, Plus(m, C1),
                                                      Subtract(Times(b, c), Times(a, d)),
                                                      Plus(ASymbol, CSymbol))),
                                              Sin(Plus(e, Times(f, x))))),
                                      Times(d, Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                                          Plus(m, n, C3), Sqr(Sin(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      LtQ(m, CN1),
                      Or(And(EqQ(a, C0), IntegerQ(m), Not(IntegerQ(n))),
                          Not(And(
                              IntegerQ(Times(C2, n)), LtQ(n, CN1), Or(
                                  And(IntegerQ(n), Not(IntegerQ(m))), EqQ(a, C0)))))))),
          IIntegrate(3057,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(
                              C_DEFAULT,
                              Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(CSymbol, x, Power(Times(b, d), CN1)), x),
                      Dist(
                          Times(
                              Plus(
                                  Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol),
                                  Times(Sqr(a), CSymbol)),
                              Power(Times(b, Subtract(Times(b, c), Times(a, d))), CN1)),
                          Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1),
                              x),
                          x),
                      Negate(Dist(
                          Times(
                              Plus(Times(Sqr(c), CSymbol), Times(CN1, BSymbol, c, d),
                                  Times(ASymbol, Sqr(d))),
                              Power(Times(d, Subtract(Times(b, c), Times(a, d))), CN1)),
                          Integrate(Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1), x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), NeQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3058,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT, Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(CSymbol, x,
                          Power(Times(b, d), CN1)), x),
                      Dist(
                          Times(
                              Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a),
                                  CSymbol)),
                              Power(Times(b, Subtract(Times(b, c), Times(a, d))), CN1)),
                          Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1),
                              x),
                          x),
                      Negate(Dist(
                          Times(Plus(Times(Sqr(c), CSymbol), Times(ASymbol, Sqr(d))),
                              Power(Times(d, Subtract(Times(b, c), Times(a, d))), CN1)),
                          Integrate(Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1), x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3059,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(Plus(c_DEFAULT, Times(
                          d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))), CN1),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(CSymbol, Power(Times(b, d), CN1)), Integrate(
                          Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), x), x),
                      Dist(
                          Power(Times(b,
                              d), CN1),
                          Integrate(
                              Times(
                                  Simp(
                                      Plus(Times(a, c, CSymbol), Times(CN1, ASymbol, b, d),
                                          Times(
                                              Plus(Times(b, c, CSymbol), Times(CN1, b, BSymbol, d),
                                                  Times(a, CSymbol, d)),
                                              Sin(Plus(e, Times(f, x))))),
                                      x),
                                  Power(
                                      Times(
                                          Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                          Plus(c, Times(d, Sin(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol),
                      x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3060,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(CSymbol, Power(Times(b, d),
                              CN1)),
                          Integrate(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), x), x),
                      Dist(Power(Times(b, d), CN1),
                          Integrate(Times(
                              Simp(Plus(Times(a, c, CSymbol), Times(CN1, ASymbol, b, d),
                                  Times(Plus(Times(b, c, CSymbol), Times(a, CSymbol, d)),
                                      Sin(Plus(e, Times(f, x))))),
                                  x),
                              Power(Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Plus(c, Times(d, Sin(Plus(e, Times(f, x)))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0)))));
}
