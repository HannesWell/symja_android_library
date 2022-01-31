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
class IntRules205 {
  public static IAST RULES =
      List(
          IIntegrate(4101,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Plus(Times(ASymbol, Sqr(b)), Times(Sqr(
                                  a), CSymbol)),
                              Cot(Plus(e, Times(f, x))), Power(Plus(a, Times(b, Csc(Plus(e, Times(f,
                                  x))))), Plus(m, C1)),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), n), Power(Times(a, f,
                                  Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                          x),
                      Dist(
                          Power(Times(a, Plus(m, C1),
                              Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                                  Simp(Plus(Times(Sqr(a), Plus(ASymbol, CSymbol), Plus(m, C1)),
                                      Times(CN1,
                                          Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                                          Plus(m, n, C1)),
                                      Times(CN1, a, b, Plus(ASymbol, CSymbol), Plus(m, C1),
                                          Csc(Plus(e, Times(f, x)))),
                                      Times(Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                                          Plus(m, n, C2), Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, n), x),
                      NeQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      LtQ(m, CN1), Not(And(ILtQ(Plus(m, C1D2), C0), ILtQ(n, C0)))))),
          IIntegrate(4102,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_), m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CSymbol, d, Cot(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n,
                                      C1)),
                                  Power(Times(b, f, Plus(m, n, C1)), CN1)),
                              x)),
                      Dist(Times(d, Power(Times(b, Plus(m, n, C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m), Power(
                                      Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C1)),
                                  Simp(Plus(Times(a, CSymbol, Subtract(n, C1)),
                                      Times(
                                          Plus(Times(ASymbol, b, Plus(m, n, C1)),
                                              Times(b, CSymbol, Plus(m, n))),
                                          Csc(Plus(e, Times(f, x)))),
                                      Times(
                                          Subtract(Times(b, BSymbol, Plus(m, n, C1)),
                                              Times(a, CSymbol, n)),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol,
                      m), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      GtQ(n, C0)))),
          IIntegrate(4103,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_), m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CSymbol, d, Cot(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(
                                      Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(
                                      Plus(e, Times(f, x)))), Subtract(n,
                                          C1)),
                                  Power(Times(b, f, Plus(m, n, C1)), CN1)),
                              x)),
                      Dist(
                          Times(d, Power(Times(b, Plus(m, n, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n,
                                      C1)),
                                  Simp(Subtract(Plus(Times(a, CSymbol, Subtract(n, C1)),
                                      Times(
                                          Plus(Times(ASymbol, b, Plus(m, n, C1)),
                                              Times(b, CSymbol, Plus(m, n))),
                                          Csc(Plus(e, Times(f, x))))),
                                      Times(a, CSymbol, n, Sqr(Csc(Plus(e, Times(f, x)))))), x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, m), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), GtQ(n, C0)))),
          IIntegrate(4104,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(ASymbol, Cot(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f,
                                  x))))), Plus(m, C1)),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(a, f, n), CN1)),
                          x),
                      Dist(Power(Times(a, d, n), CN1), Integrate(Times(
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                          Simp(Plus(Times(a, BSymbol, n), Times(CN1, ASymbol, b, Plus(m, n, C1)),
                              Times(a, Plus(ASymbol, Times(ASymbol, n), Times(CSymbol, n)),
                                  Csc(Plus(e, Times(f, x)))),
                              Times(ASymbol, b, Plus(m, n, C2), Sqr(Csc(Plus(e, Times(f, x)))))),
                              x)),
                          x), x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol, m), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), LeQ(n, CN1)))),
          IIntegrate(4105,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          d_DEFAULT), n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(ASymbol, Cot(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                          Power(Times(a, f, n), CN1)), x),
                      Dist(
                          Power(Times(a, d,
                              n), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                                  Simp(Plus(Times(CN1, ASymbol, b, Plus(m, n, C1)),
                                      Times(a, Plus(ASymbol, Times(ASymbol, n), Times(CSymbol, n)),
                                          Csc(Plus(e, Times(f, x)))),
                                      Times(ASymbol, b, Plus(m, n, C2),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, m), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), LeQ(n, CN1)))),
          IIntegrate(4106,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          CN1D2),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(
                              Plus(
                                  Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol), Times(Sqr(a),
                                      CSymbol)),
                              Power(Times(Sqr(a), Sqr(d)), CN1)),
                          Integrate(
                              Times(
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), QQ(3L, 2L)),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x),
                      Dist(Power(a, CN2),
                          Integrate(
                              Times(Subtract(Times(a, ASymbol),
                                  Times(Subtract(Times(ASymbol, b),
                                      Times(a, BSymbol)), Csc(Plus(e, Times(f, x))))),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4107,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          CN1D2),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(
                              Plus(Times(ASymbol, Sqr(
                                  b)), Times(Sqr(a),
                                      CSymbol)),
                              Power(Times(Sqr(a), Sqr(d)), CN1)),
                          Integrate(
                              Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), QQ(3L, 2L)), Power(
                                  Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x),
                      Dist(Power(a, CN2),
                          Integrate(Times(
                              Subtract(Times(a, ASymbol),
                                  Times(ASymbol, b, Csc(Plus(e, Times(f, x))))),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), CN1D2)), x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4108,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          CN1D2),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(CSymbol, Power(d,
                              CN2)),
                          Integrate(
                              Times(
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), QQ(3L,
                                      2L)),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Integrate(
                          Times(Plus(ASymbol, Times(BSymbol, Csc(Plus(e, Times(f, x))))),
                              Power(Times(Sqrt(Times(d, Csc(Plus(e, Times(f, x))))),
                                  Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))))), CN1)),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4109,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          CN1D2),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(CSymbol, Power(d,
                              CN2)),
                          Integrate(
                              Times(
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), QQ(3L,
                                      2L)),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(ASymbol,
                          Integrate(
                              Power(
                                  Times(Sqrt(Times(d, Csc(Plus(e, Times(f, x))))),
                                      Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))))),
                                  CN1),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol,
                      CSymbol), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(4110,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          n_DEFAULT),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                          Power(Plus(a,
                              Times(b, Csc(Plus(e, Times(f, x))))), m),
                          Plus(ASymbol, Times(BSymbol, Csc(Plus(e, Times(f, x)))),
                              Times(CSymbol, Sqr(Csc(Plus(e, Times(f, x))))))),
                      x),
                  FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol, m, n), x))),
          IIntegrate(4111,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_DEFAULT),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                          Power(Plus(a,
                              Times(b, Csc(Plus(e, Times(f, x))))), m),
                          Plus(ASymbol, Times(CSymbol, Sqr(Csc(Plus(e, Times(f, x))))))),
                      x),
                  FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, m, n), x))),
          IIntegrate(4112,
              Integrate(
                  Times(
                      Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          d_DEFAULT), n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT,
                              Sqr($($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(Power(d, Plus(m, C2)),
                      Integrate(
                          Times(Power(Plus(b, Times(a, Cos(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Cos(Plus(e, Times(f, x)))),
                                  Subtract(Subtract(n, m), C2)),
                              Plus(CSymbol, Times(BSymbol, Cos(Plus(e, Times(f, x)))),
                                  Times(ASymbol, Sqr(Cos(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol,
                      n), x), Not(
                          IntegerQ(n)),
                      IntegerQ(m)))),
          IIntegrate(4113,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT),
                      Power(Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, Plus(m, C2)),
                      Integrate(
                          Times(Power(Plus(b, Times(a, Sin(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), Subtract(
                                  Subtract(n, m), C2)),
                              Plus(
                                  CSymbol, Times(BSymbol, Sin(Plus(e, Times(f, x)))), Times(ASymbol,
                                      Sqr(Sin(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol, n), x), Not(IntegerQ(n)),
                      IntegerQ(m)))),
          IIntegrate(4114,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(C_DEFAULT, Sqr($($s("§sec"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(d, Plus(m,
                          C2)),
                      Integrate(
                          Times(
                              Power(Plus(b,
                                  Times(a, Cos(Plus(e, Times(f, x))))), m),
                              Power(
                                  Times(d, Cos(
                                      Plus(e, Times(f, x)))),
                                  Subtract(Subtract(n, m), C2)),
                              Plus(CSymbol, Times(ASymbol, Sqr(Cos(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol,
                      n), x), Not(
                          IntegerQ(n)),
                      IntegerQ(m)))),
          IIntegrate(4115,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT),
                      Power(Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(d, Plus(m,
                          C2)),
                      Integrate(
                          Times(
                              Power(Plus(b,
                                  Times(a, Sin(Plus(e, Times(f, x))))), m),
                              Power(
                                  Times(d, Sin(Plus(e, Times(f, x)))), Subtract(Subtract(n,
                                      m), C2)),
                              Plus(CSymbol, Times(ASymbol, Sqr(Sin(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, n), x), Not(IntegerQ(n)),
                      IntegerQ(m)))),
          IIntegrate(4116,
              Integrate(
                  Times(
                      Power(
                          Times(c_DEFAULT,
                              Power(
                                  Times(
                                      d_DEFAULT,
                                      $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                  p_)),
                          n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(
                              C_DEFAULT, Sqr($($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(Dist(
                  Times(Power(c, IntPart(n)),
                      Power(Times(c, Power(Times(d, Sec(Plus(e, Times(f, x)))), p)), FracPart(n)),
                      Power(Power(Times(d, Sec(Plus(e, Times(f, x)))), Times(p, FracPart(n))),
                          CN1)),
                  Integrate(Times(Power(Plus(a, Times(b, Sec(Plus(e, Times(f, x))))), m),
                      Power(Times(d, Sec(Plus(e, Times(f, x)))), Times(n, p)),
                      Plus(ASymbol, Times(BSymbol, Sec(Plus(e, Times(f, x)))),
                          Times(CSymbol, Sqr(Sec(Plus(e, Times(f, x))))))),
                      x),
                  x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n,
                      p), x), Not(
                          IntegerQ(n))))),
          IIntegrate(4117,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Times(c_DEFAULT,
                          Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT), p_)),
                          n_),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(c, IntPart(
                              n)),
                          Power(Times(c, Power(Times(d, Csc(Plus(e, Times(f, x)))), p)),
                              FracPart(n)),
                          Power(Power(
                              Times(d, Csc(Plus(e, Times(f, x)))), Times(p, FracPart(n))), CN1)),
                      Integrate(
                          Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Times(n, p)), Plus(ASymbol,
                                  Times(BSymbol, Csc(Plus(e, Times(f, x)))), Times(CSymbol,
                                      Sqr(Csc(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n, p), x),
                      Not(IntegerQ(n))))),
          IIntegrate(4118,
              Integrate(
                  Times(
                      Power(
                          Times(c_DEFAULT,
                              Power(Times(d_DEFAULT,
                                  $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                  p_)),
                          n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT, Sqr($($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(c, IntPart(
                              n)),
                          Power(Times(c, Power(Times(d, Sec(Plus(e, Times(f, x)))), p)),
                              FracPart(n)),
                          Power(
                              Power(Times(d, Sec(Plus(e, Times(f, x)))),
                                  Times(p, FracPart(n))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b, Sec(
                                  Plus(e, Times(f, x))))), m),
                              Power(Times(d, Sec(Plus(e, Times(f, x)))), Times(n, p)), Plus(ASymbol,
                                  Times(CSymbol, Sqr(Sec(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, m, n,
                      p), x), Not(
                          IntegerQ(n))))),
          IIntegrate(4119,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times(c_DEFAULT,
                              Power(
                                  Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                      d_DEFAULT),
                                  p_)),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(c, IntPart(
                              n)),
                          Power(Times(c, Power(Times(d, Csc(Plus(e, Times(f, x)))), p)),
                              FracPart(n)),
                          Power(
                              Power(Times(d, Csc(Plus(e, Times(f, x)))),
                                  Times(p, FracPart(n))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b, Csc(
                                  Plus(e, Times(f, x))))), m),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Times(n,
                                  p)),
                              Plus(ASymbol, Times(CSymbol, Sqr(Csc(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, m, n,
                      p), x), Not(
                          IntegerQ(n))))),
          IIntegrate(4120,
              Integrate(
                  Times(u_DEFAULT,
                      Power(
                          Plus(a_,
                              Times(
                                  b_DEFAULT,
                                  Sqr($($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(Power(b, p),
                      Integrate(
                          ActivateTrig(
                              Times(u, Power($($s("§tan"), Plus(e, Times(f, x))), Times(C2, p)))),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, p), x), EqQ(Plus(a, b), C0), IntegerQ(p)))));
}
