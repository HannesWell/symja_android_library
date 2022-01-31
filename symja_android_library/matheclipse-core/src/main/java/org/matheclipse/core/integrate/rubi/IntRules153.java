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
class IntRules153 {
  public static IAST RULES =
      List(
          IIntegrate(3061,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CSymbol, Cos(Plus(e, Times(f,
                                      x))),
                                  Sqrt(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x)))))),
                                  Power(
                                      Times(d, f,
                                          Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))))),
                                      CN1)),
                              x)),
                      Dist(
                          Power(Times(C2,
                              d), CN1),
                          Integrate(
                              Times(C1,
                                  Simp(Plus(Times(C2, a, ASymbol, d),
                                      Times(CN1, CSymbol, Subtract(Times(b, c), Times(a, d))),
                                      Times(CN1, C2,
                                          Subtract(Times(a, c, CSymbol), Times(d,
                                              Plus(Times(ASymbol, b), Times(a, BSymbol)))),
                                          Sin(Plus(e, Times(f, x)))),
                                      Times(
                                          Subtract(Times(C2, b, BSymbol, d),
                                              Times(CSymbol, Plus(Times(b, c), Times(a, d)))),
                                          Sqr(Sin(Plus(e, Times(f, x)))))),
                                      x),
                                  Power(Times(
                                      Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                          QQ(3L, 2L)),
                                      Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3062,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(Plus(c_, Times(d_DEFAULT,
                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))), CN1D2),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(CSymbol, Cos(
                                  Plus(e, Times(f, x))),
                                  Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x)))))),
                                  Power(
                                      Times(d, f,
                                          Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))))),
                                      CN1)),
                              x)),
                      Dist(Power(Times(C2, d), CN1),
                          Integrate(
                              Times(C1,
                                  Simp(
                                      Subtract(
                                          Subtract(
                                              Subtract(Times(C2, a, ASymbol, d),
                                                  Times(CSymbol,
                                                      Subtract(Times(b, c), Times(a, d)))),
                                              Times(C2,
                                                  Subtract(Times(a, c, CSymbol),
                                                      Times(ASymbol, b, d)),
                                                  Sin(Plus(e, Times(f, x))))),
                                          Times(CSymbol, Plus(Times(b, c), Times(a, d)),
                                              Sqr(Sin(Plus(e, Times(f, x)))))),
                                      x),
                                  Power(Times(
                                      Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), QQ(3L,
                                          2L)),
                                      Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)),
                          C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3063,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_)))),
                          n_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(Subtract(Times(b, BSymbol), Times(a,
                              CSymbol)), Power(b,
                                  CN2)),
                          Integrate(Power(Times(d, Sin(Plus(e, Times(f, x)))), n), x), x),
                      Dist(
                          Times(
                              Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol),
                                  Times(Sqr(a), CSymbol)),
                              Power(b, CN2)),
                          Integrate(
                              Times(
                                  Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x),
                      Dist(Times(CSymbol, Power(Times(b, d), CN1)), Integrate(Power(Times(d,
                          Sin(Plus(e, Times(f, x)))), Plus(n, C1)), x), x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol,
                      n), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(3064,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(
                              Times(a, CSymbol, Power(b,
                                  CN2)),
                              Integrate(Power(Times(d, Sin(Plus(e, Times(f, x)))), n), x), x)),
                      Dist(
                          Times(Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                              Power(b, CN2)),
                          Integrate(
                              Times(Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x),
                      Dist(Times(CSymbol, Power(Times(b, d), CN1)),
                          Integrate(Power(Times(d, Sin(Plus(e, Times(f, x)))), Plus(n, C1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, n), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3065,
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
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT, Sqr($($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Power(Plus(c,
                              Times(d, Sin(Plus(e, Times(f, x))))), n),
                          Plus(
                              ASymbol, Times(BSymbol, Sin(
                                  Plus(e, Times(f, x)))),
                              Times(CSymbol, Sqr(Sin(Plus(e, Times(f, x))))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3066,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT,
                              Sqr($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Power(Plus(c,
                              Times(d, Sin(Plus(e, Times(f, x))))), n),
                          Plus(ASymbol, Times(CSymbol, Sqr(Sin(Plus(e, Times(f, x))))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, m, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3067,
              Integrate(
                  Times(
                      Power(
                          Times(
                              b_DEFAULT,
                              Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_)),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(
                              C_DEFAULT, Sqr($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(b, Power(Sin(Plus(e, Times(f, x))), p)), m), Power(
                          Power(Times(b, Sin(Plus(e, Times(f, x)))), Times(m, p)), CN1)),
                      Integrate(
                          Times(Power(Times(b, Sin(Plus(e, Times(f, x)))), Times(m, p)),
                              Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))), n),
                              Plus(
                                  ASymbol, Times(BSymbol, Sin(Plus(e, Times(f, x)))), Times(CSymbol,
                                      Sqr(Sin(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n,
                      p), x), Not(
                          IntegerQ(m))))),
          IIntegrate(3068,
              Integrate(
                  Times(
                      Power(
                          Times(
                              Power($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  p_),
                              b_DEFAULT),
                          m_),
                      Plus(A_DEFAULT,
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(c_DEFAULT,
                              Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT)),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(b, Power(Cos(Plus(e, Times(f, x))), p)), m),
                          Power(Power(Times(b, Cos(Plus(e, Times(f, x)))), Times(m, p)), CN1)),
                      Integrate(
                          Times(Power(Times(b, Cos(Plus(e, Times(f, x)))), Times(m, p)),
                              Power(Plus(c, Times(d, Cos(Plus(e, Times(f, x))))), n), Plus(ASymbol,
                                  Times(BSymbol, Cos(Plus(e, Times(f, x)))), Times(CSymbol,
                                      Sqr(Cos(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(b, c, d, e, f, ASymbol, BSymbol, CSymbol, m, n,
                      p), x), Not(
                          IntegerQ(m))))),
          IIntegrate(3069,
              Integrate(
                  Times(
                      Power(
                          Times(
                              b_DEFAULT, Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  p_)),
                          m_),
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
                  Dist(
                      Times(
                          Power(Times(b, Power(Sin(Plus(e, Times(f, x))), p)), m), Power(Power(
                              Times(b, Sin(Plus(e, Times(f, x)))), Times(m, p)), CN1)),
                      Integrate(
                          Times(
                              Power(Times(b, Sin(Plus(e,
                                  Times(f, x)))), Times(m, p)),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n), Plus(ASymbol,
                                  Times(CSymbol, Sqr(Sin(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(b, c, d, e, f, ASymbol, CSymbol, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(3070,
              Integrate(
                  Times(
                      Power(
                          Times(Power($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_),
                              b_DEFAULT),
                          m_),
                      Plus(A_DEFAULT,
                          Times(
                              Sqr($($s("§cos"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(c_DEFAULT,
                              Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT)),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(b, Power(Cos(Plus(e, Times(f, x))), p)), m), Power(Power(
                              Times(b, Cos(Plus(e, Times(f, x)))), Times(m, p)), CN1)),
                      Integrate(
                          Times(Power(Times(b, Cos(Plus(e, Times(f, x)))), Times(m, p)),
                              Power(Plus(c, Times(d, Cos(Plus(e, Times(f, x))))), n), Plus(ASymbol,
                                  Times(CSymbol, Sqr(Cos(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(b, c, d, e, f, ASymbol, CSymbol, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(3071,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(a,
                          Power(
                              Plus(
                                  Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                      Sin(Plus(c, Times(d, x))))),
                              n),
                          Power(Times(b, d, n), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, n), x), EqQ(Plus(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3072,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(Power(d, CN1),
                          Subst(
                              Integrate(
                                  Power(Subtract(Plus(Sqr(a), Sqr(b)), Sqr(x)),
                                      Times(C1D2, Subtract(n, C1))),
                                  x),
                              x,
                              Subtract(Times(b, Cos(Plus(c, Times(d, x)))),
                                  Times(a, Sin(Plus(c, Times(d, x)))))),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a),
                      Sqr(b)), C0), IGtQ(Times(C1D2, Subtract(n, C1)),
                          C0)))),
          IIntegrate(3073,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), a_DEFAULT), Times(b_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Subtract(Times(b, Cos(Plus(c, Times(d, x)))), Times(a,
                                      Sin(Plus(c, Times(d, x))))),
                                  Power(
                                      Plus(
                                          Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                              Sin(Plus(c, Times(d, x))))),
                                      Subtract(n, C1)),
                                  Power(Times(d, n), CN1)),
                              x)),
                      Dist(
                          Times(Subtract(n, C1), Plus(Sqr(a), Sqr(b)), Power(n,
                              CN1)),
                          Integrate(
                              Power(
                                  Plus(
                                      Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                          Sin(Plus(c, Times(d, x))))),
                                  Subtract(n, C2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a),
                      Sqr(b)), C0), Not(
                          IntegerQ(Times(C1D2, Subtract(n, C1)))),
                      GtQ(n, C1)))),
          IIntegrate(3074,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                          a_DEFAULT),
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      CN1),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(Power(d, CN1),
                          Subst(Integrate(Power(Subtract(Plus(Sqr(a), Sqr(b)), Sqr(x)), CN1), x), x,
                              Subtract(
                                  Times(b, Cos(Plus(c, Times(d, x)))), Times(a,
                                      Sin(Plus(c, Times(d, x)))))),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3075,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      CN2),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(
                          Sin(Plus(c,
                              Times(d, x))),
                          Power(
                              Times(a, d,
                                  Plus(
                                      Times(a, Cos(
                                          Plus(c, Times(d, x)))),
                                      Times(b, Sin(Plus(c, Times(d, x)))))),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3076,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT,
                              x_))), a_DEFAULT),
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Subtract(
                                  Times(b, Cos(Plus(c, Times(d, x)))), Times(a,
                                      Sin(Plus(c, Times(d, x))))),
                              Power(
                                  Plus(
                                      Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                          Sin(Plus(c, Times(d, x))))),
                                  Plus(n, C1)),
                              Power(Times(d, Plus(n, C1), Plus(Sqr(a), Sqr(b))), CN1)),
                          x),
                      Dist(
                          Times(Plus(n, C2), Power(Times(Plus(n, C1), Plus(Sqr(a), Sqr(b))),
                              CN1)),
                          Integrate(
                              Power(
                                  Plus(
                                      Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                          Sin(Plus(c, Times(d, x))))),
                                  Plus(n, C2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a), Sqr(b)), C0), LtQ(n, CN1),
                      NeQ(n, CN2)))),
          IIntegrate(3077,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Plus(Sqr(a), Sqr(
                          b)), Times(C1D2, n)),
                      Integrate(Power(Cos(Subtract(Plus(c, Times(d, x)), ArcTan(a, b))), n), x), x),
                  And(FreeQ(List(a, b, c, d, n), x), Not(Or(GeQ(n, C1), LeQ(n, CN1))),
                      GtQ(Plus(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3078,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT,
                              x_))), a_DEFAULT),
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                              Times(b, Sin(Plus(c, Times(d, x))))), n),
                          Power(
                              Power(Times(
                                  Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                      Times(b, Sin(Plus(c, Times(d, x))))),
                                  Power(Plus(Sqr(a), Sqr(b)), CN1D2)), n),
                              CN1)),
                      Integrate(Power(Cos(Subtract(Plus(c, Times(d, x)), ArcTan(a, b))), n), x), x),
                  And(FreeQ(List(a, b, c, d, n), x), Not(Or(GeQ(n, C1), LeQ(n, CN1))), Not(Or(
                      GtQ(Plus(Sqr(a), Sqr(b)), C0), EqQ(Plus(Sqr(a), Sqr(b)), C0)))))),
          IIntegrate(3079,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_),
                      Power(
                          Plus(
                              Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                                  a_DEFAULT),
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(a,
                                  Power(
                                      Plus(
                                          Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                              Sin(Plus(c, Times(d, x))))),
                                      Subtract(n, C1)),
                                  Power(Times(d, Subtract(n, C1),
                                      Power(Sin(Plus(c, Times(d, x))), Subtract(n, C1))), CN1)),
                              x)),
                      Dist(Times(C2, b),
                          Integrate(
                              Times(
                                  Power(Plus(
                                      Times(a, Cos(Plus(c, Times(d, x)))),
                                      Times(b, Sin(Plus(c, Times(d, x))))), Subtract(n, C1)),
                                  Power(Power(Sin(Plus(c, Times(d, x))), Subtract(n, C1)), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Plus(m, n), C0), EqQ(Plus(Sqr(a),
                      Sqr(b)), C0), GtQ(n,
                          C1)))),
          IIntegrate(3080,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_),
                      Power(Plus(
                          Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(b,
                              Power(
                                  Plus(
                                      Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                          Sin(Plus(c, Times(d, x))))),
                                  Subtract(n, C1)),
                              Power(Times(d, Subtract(n, C1),
                                  Power(Cos(Plus(c, Times(d, x))), Subtract(n, C1))), CN1)),
                          x),
                      Dist(
                          Times(C2, a),
                          Integrate(Times(
                              Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                  Times(b, Sin(Plus(c, Times(d, x))))), Subtract(n, C1)),
                              Power(Power(Cos(Plus(c, Times(d, x))), Subtract(n, C1)), CN1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Plus(m, n), C0),
                      EqQ(Plus(Sqr(a), Sqr(b)), C0), GtQ(n, C1)))));
}
