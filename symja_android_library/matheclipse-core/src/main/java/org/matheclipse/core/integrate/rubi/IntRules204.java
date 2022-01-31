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
class IntRules204 {
  public static IAST RULES =
      List(
          IIntegrate(4081,
              Integrate(
                  Times(
                      $($s("§csc"), Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_))),
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
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                                  Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x))))), Plus(m,
                                          C1)),
                                  Power(Times(b, f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                              x)),
                      Dist(
                          Power(Times(b, Plus(m, C1), Subtract(Sqr(a), Sqr(
                              b))), CN1),
                          Integrate(
                              Times(Csc(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Simp(Subtract(Times(a, b, Plus(ASymbol, CSymbol), Plus(m, C1)),
                                      Times(
                                          Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol),
                                              Times(b, Plus(Times(ASymbol, b), Times(b, CSymbol)),
                                                  Plus(m, C1))),
                                          Csc(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol,
                      CSymbol), x), LtQ(m,
                          CN1),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4082,
              Integrate(
                  Times(
                      $($s("§csc"), Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_))),
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
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CSymbol, Cot(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(Times(b, f, Plus(m, C2)), CN1)),
                              x)),
                      Dist(Power(Times(b, Plus(m, C2)), CN1), Integrate(Times(
                          Csc(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                          Simp(Plus(Times(b, ASymbol, Plus(m, C2)), Times(b, CSymbol, Plus(m, C1)),
                              Times(Subtract(Times(b, BSymbol, Plus(m, C2)), Times(a, CSymbol)),
                                  Csc(Plus(e, Times(f, x))))),
                              x)),
                          x), x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol, CSymbol, m), x), Not(LtQ(m, CN1))))),
          IIntegrate(4083,
              Integrate(
                  Times(
                      $($s("§csc"), Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_))),
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
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CSymbol, Cot(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(Times(b, f, Plus(m, C2)), CN1)),
                              x)),
                      Dist(
                          Power(Times(b,
                              Plus(m, C2)), CN1),
                          Integrate(
                              Times(Csc(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m), Simp(
                                      Subtract(
                                          Plus(Times(b, ASymbol, Plus(m, C2)),
                                              Times(b, CSymbol, Plus(m, C1))),
                                          Times(a, CSymbol, Csc(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, CSymbol, m), x), Not(LtQ(m, CN1))))),
          IIntegrate(4084,
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
                          n_),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_), m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(
                                  Plus(
                                      Times(a, ASymbol), Times(CN1, b, BSymbol), Times(a, CSymbol)),
                                  Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(d,
                                      Csc(Plus(e, Times(f, x)))), n),
                                  Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                              x)),
                      Dist(
                          Power(Times(a, b,
                              Plus(Times(C2, m), C1)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x))))), Plus(m,
                                          C1)),
                                  Power(Times(d,
                                      Csc(Plus(e, Times(f, x)))), n),
                                  Simp(Subtract(
                                      Subtract(Subtract(Times(a, BSymbol, n), Times(b, CSymbol, n)),
                                          Times(ASymbol, b, Plus(Times(C2, m), n, C1))),
                                      Times(
                                          Subtract(Times(b, BSymbol, Plus(m, n, C1)),
                                              Times(a,
                                                  Subtract(Times(ASymbol, Plus(m, n, C1)),
                                                      Times(CSymbol, Subtract(m, n))))),
                                          Csc(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol, n), x),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(m, Negate(C1D2))))),
          IIntegrate(4085,
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
                      Negate(
                          Simp(
                              Times(a, Plus(ASymbol, CSymbol), Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                                  Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                              x)),
                      Dist(
                          Power(Times(a, b,
                              Plus(Times(C2, m), C1)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                                  Simp(
                                      Subtract(
                                          Plus(Times(b, CSymbol, n),
                                              Times(ASymbol, b, Plus(Times(C2, m), n, C1))),
                                          Times(a,
                                              Subtract(Times(ASymbol, Plus(m, n, C1)),
                                                  Times(CSymbol, Subtract(m, n))),
                                              Csc(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, n), x),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(m, Negate(C1D2))))),
          IIntegrate(4086,
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
              Condition(Subtract(
                  Simp(
                      Times(ASymbol, Cot(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), n), Power(Times(f, n), CN1)),
                      x),
                  Dist(
                      Power(Times(b, d,
                          n), CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                              Simp(Subtract(Subtract(Times(a, ASymbol, m), Times(b, BSymbol, n)),
                                  Times(b, Plus(Times(ASymbol, Plus(m, n, C1)), Times(CSymbol, n)),
                                      Csc(Plus(e, Times(f, x))))),
                                  x)),
                          x),
                      x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol, m), x),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      Not(LtQ(m,
                          Negate(C1D2))),
                      Or(LtQ(n, Negate(C1D2)), EqQ(Plus(m, n, C1), C0))))),
          IIntegrate(4087,
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
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(Subtract(
                  Simp(
                      Times(ASymbol, Cot(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), n), Power(Times(f, n), CN1)),
                      x),
                  Dist(
                      Power(Times(b, d,
                          n), CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                              Simp(Subtract(Times(a, ASymbol, m),
                                  Times(b, Plus(Times(ASymbol, Plus(m, n, C1)), Times(CSymbol, n)),
                                      Csc(Plus(e, Times(f, x))))),
                                  x)),
                          x),
                      x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, m), x),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), Not(LtQ(m,
                          Negate(C1D2))),
                      Or(LtQ(n, Negate(C1D2)), EqQ(Plus(m, n, C1), C0))))),
          IIntegrate(4088,
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
                              Times(CSymbol, Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(d,
                                      Csc(Plus(e, Times(f, x)))), n),
                                  Power(Times(f, Plus(m, n, C1)), CN1)),
                              x)),
                      Dist(Power(Times(b, Plus(m, n, C1)), CN1), Integrate(Times(
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                          Simp(Plus(Times(ASymbol, b, Plus(m, n, C1)), Times(b, CSymbol, n),
                              Times(Plus(Times(a, CSymbol, m), Times(b, BSymbol, Plus(m, n, C1))),
                                  Csc(Plus(e, Times(f, x))))),
                              x)),
                          x), x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol, m, n), x),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), Not(LtQ(m, Negate(
                          C1D2))),
                      Not(LtQ(n, Negate(C1D2))), NeQ(Plus(m, n, C1), C0)))),
          IIntegrate(4089,
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
                          n_),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(CSymbol, Cot(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(f, Plus(m, n, C1)), CN1)), x)),
                      Dist(Power(Times(b, Plus(m, n, C1)), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                                  Simp(Plus(Times(ASymbol, b, Plus(m, n, C1)), Times(b, CSymbol, n),
                                      Times(a, CSymbol, m, Csc(Plus(e, Times(f, x))))), x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, m, n), x),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), Not(LtQ(m, Negate(
                          C1D2))),
                      Not(LtQ(n, Negate(C1D2))), NeQ(Plus(m, n, C1), C0)))),
          IIntegrate(4090,
              Integrate(
                  Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Plus(A_DEFAULT,
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(a,
                              Plus(
                                  Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol), Times(Sqr(a),
                                      CSymbol)),
                              Cot(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m,
                                  C1)),
                              Power(Times(Sqr(b), f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                          x),
                      Dist(
                          Power(Times(Sqr(b), Plus(m, C1),
                              Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(
                              Times(
                                  Csc(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Simp(
                                      Subtract(
                                          Plus(
                                              Times(b, Plus(m, C1),
                                                  Plus(
                                                      Times(CN1, a,
                                                          Subtract(Times(
                                                              b, BSymbol),
                                                              Times(a, CSymbol))),
                                                      Times(ASymbol, Sqr(b)))),
                                              Times(
                                                  Subtract(
                                                      Times(b, BSymbol,
                                                          Plus(Sqr(a), Times(Sqr(b), Plus(m, C1)))),
                                                      Times(a, Plus(
                                                          Times(ASymbol, Sqr(b), Plus(m, C2)),
                                                          Times(CSymbol,
                                                              Plus(Sqr(a),
                                                                  Times(Sqr(b), Plus(m, C1))))))),
                                                  Csc(Plus(e, Times(f, x))))),
                                          Times(b, CSymbol, Plus(m, C1), Subtract(Sqr(a), Sqr(b)),
                                              Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol, CSymbol), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m,
                          CN1)))),
          IIntegrate(4091,
              Integrate(
                  Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(a, Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                          Cot(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b,
                              Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                          Power(Times(Sqr(b), f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)), x),
                      Dist(Power(Times(Sqr(b), Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(
                              Times(Csc(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Simp(Subtract(
                                      Subtract(
                                          Times(b, Plus(m, C1),
                                              Plus(Times(Sqr(a), CSymbol), Times(ASymbol, Sqr(b)))),
                                          Times(a,
                                              Plus(Times(ASymbol, Sqr(b), Plus(m, C2)),
                                                  Times(CSymbol,
                                                      Plus(Sqr(a), Times(Sqr(b), Plus(m, C1))))),
                                              Csc(Plus(e, Times(f, x))))),
                                      Times(b, CSymbol, Plus(m, C1), Subtract(Sqr(a), Sqr(b)),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, CSymbol), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m,
                          CN1)))),
          IIntegrate(4092,
              Integrate(
                  Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Plus(A_DEFAULT,
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CSymbol, Csc(Plus(e, Times(f, x))), Cot(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(Times(b, f, Plus(m, C3)), CN1)),
                              x)),
                      Dist(Power(Times(b, Plus(m, C3)), CN1),
                          Integrate(
                              Times(Csc(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m), Simp(
                                      Subtract(
                                          Plus(Times(a, CSymbol),
                                              Times(b,
                                                  Plus(Times(CSymbol, Plus(m, C2)),
                                                      Times(ASymbol, Plus(m, C3))),
                                                  Csc(Plus(e, Times(f, x))))),
                                          Times(
                                              Subtract(Times(C2, a, CSymbol),
                                                  Times(b, BSymbol, Plus(m, C3))),
                                              Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol, CSymbol,
                      m), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      Not(LtQ(m, CN1))))),
          IIntegrate(4093,
              Integrate(
                  Times(
                      Sqr($($s("§csc"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Plus(A_DEFAULT,
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_), m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CSymbol, Csc(Plus(e, Times(f,
                                      x))),
                                  Cot(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(b, f, Plus(m, C3)), CN1)),
                              x)),
                      Dist(
                          Power(Times(b,
                              Plus(m, C3)), CN1),
                          Integrate(
                              Times(Csc(Plus(e, Times(f, x))),
                                  Power(Plus(a,
                                      Times(b, Csc(Plus(e, Times(f, x))))), m),
                                  Simp(Subtract(Plus(Times(a, CSymbol), Times(b,
                                      Plus(Times(CSymbol, Plus(m, C2)),
                                          Times(ASymbol, Plus(m, C3))),
                                      Csc(Plus(e, Times(f, x))))), Times(C2, a, CSymbol,
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, CSymbol, m), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), Not(LtQ(m, CN1))))),
          IIntegrate(4094,
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
                  Subtract(
                      Simp(
                          Times(ASymbol, Cot(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b,
                                  Csc(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), n), Power(Times(f, n),
                                  CN1)),
                          x),
                      Dist(
                          Power(Times(d,
                              n), CN1),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b, Csc(
                                          Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                                  Simp(Subtract(
                                      Subtract(Subtract(Times(ASymbol, b, m), Times(a, BSymbol, n)),
                                          Times(
                                              Plus(Times(b, BSymbol, n),
                                                  Times(a,
                                                      Plus(Times(CSymbol, n),
                                                          Times(ASymbol, Plus(n, C1))))),
                                              Csc(Plus(e, Times(f, x))))),
                                      Times(b,
                                          Plus(Times(CSymbol, n), Times(ASymbol, Plus(m, n, C1))),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), GtQ(m,
                          C0),
                      LeQ(n, CN1)))),
          IIntegrate(4095,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
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
                  Subtract(
                      Simp(Times(ASymbol, Cot(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m), Power(Times(d,
                              Csc(Plus(e, Times(f, x)))), n),
                          Power(Times(f, n), CN1)), x),
                      Dist(
                          Power(Times(d,
                              n), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Subtract(m, C1)),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                              Simp(Subtract(
                                  Subtract(Times(ASymbol, b, m),
                                      Times(a, Plus(Times(CSymbol, n), Times(ASymbol, Plus(n, C1))),
                                          Csc(Plus(e, Times(f, x))))),
                                  Times(b, Plus(Times(CSymbol, n), Times(ASymbol, Plus(m, n, C1))),
                                      Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), GtQ(m,
                          C0),
                      LeQ(n, CN1)))),
          IIntegrate(4096,
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
                              Times(CSymbol, Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(d,
                                      Csc(Plus(e, Times(f, x)))), n),
                                  Power(Times(f, Plus(m, n, C1)), CN1)),
                              x)),
                      Dist(
                          Power(Plus(m, n,
                              C1), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Subtract(m,
                                      C1)),
                                  Power(Times(d,
                                      Csc(Plus(e, Times(f, x)))), n),
                                  Simp(
                                      Plus(Times(a, ASymbol, Plus(m, n, C1)), Times(a, CSymbol, n),
                                          Times(
                                              Plus(
                                                  Times(Plus(Times(ASymbol, b), Times(a, BSymbol)),
                                                      Plus(m, n, C1)),
                                                  Times(b, CSymbol, Plus(m, n))),
                                              Csc(Plus(e, Times(f, x)))),
                                          Times(
                                              Plus(
                                                  Times(b, BSymbol, Plus(m, n, C1)),
                                                  Times(a, CSymbol, m)),
                                              Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol, n), x), NeQ(
                      Subtract(Sqr(a), Sqr(b)), C0), GtQ(m, C0), Not(LeQ(n, CN1))))),
          IIntegrate(4097,
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
                      Negate(
                          Simp(
                              Times(CSymbol, Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(d,
                                      Csc(Plus(e, Times(f, x)))), n),
                                  Power(Times(f, Plus(m, n, C1)), CN1)),
                              x)),
                      Dist(Power(Plus(m, n, C1), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                                  Simp(
                                      Plus(Times(a, ASymbol, Plus(m, n, C1)), Times(a, CSymbol, n),
                                          Times(b,
                                              Plus(Times(ASymbol, Plus(m, n, C1)),
                                                  Times(CSymbol, Plus(m, n))),
                                              Csc(Plus(e, Times(f, x)))),
                                          Times(a, CSymbol, m, Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, n), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), GtQ(m,
                          C0),
                      Not(LeQ(n, CN1))))),
          IIntegrate(4098,
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
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(d,
                                  Plus(Times(ASymbol, Sqr(
                                      b)), Times(CN1, a, b, BSymbol), Times(Sqr(a),
                                          CSymbol)),
                                  Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(
                                      Plus(e, Times(f, x)))), Subtract(n, C1)),
                                  Power(Times(b, f, Subtract(Sqr(a), Sqr(b)), Plus(m, C1)), CN1)),
                              x)),
                      Dist(
                          Times(d, Power(Times(b, Subtract(Sqr(a), Sqr(
                              b)), Plus(m,
                                  C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(
                                      Plus(e, Times(f, x)))), Subtract(n,
                                          C1)),
                                  Simp(Subtract(
                                      Plus(Times(ASymbol, Sqr(b), Subtract(n, C1)),
                                          Times(CN1, a,
                                              Subtract(Times(b,
                                                  BSymbol), Times(a, CSymbol)),
                                              Subtract(n, C1)),
                                          Times(b,
                                              Plus(
                                                  Times(a, ASymbol), Times(CN1, b, BSymbol),
                                                  Times(a, CSymbol)),
                                              Plus(m, C1), Csc(Plus(e, Times(f, x))))),
                                      Times(
                                          Plus(
                                              Times(b,
                                                  Subtract(Times(ASymbol, b), Times(a, BSymbol)),
                                                  Plus(m, n, C1)),
                                              Times(CSymbol,
                                                  Plus(Times(Sqr(a), n),
                                                      Times(Sqr(b), Plus(m, C1))))),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m,
                          CN1),
                      GtQ(n, C0)))),
          IIntegrate(4099,
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
                          n_),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_), m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(d, Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                              Cot(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n,
                                  C1)),
                              Power(Times(b, f, Subtract(Sqr(a), Sqr(b)), Plus(m, C1)), CN1)),
                              x)),
                      Dist(Times(d, Power(Times(b, Subtract(Sqr(a), Sqr(b)), Plus(m, C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(
                                      Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C1)),
                                  Simp(Subtract(
                                      Plus(Times(ASymbol, Sqr(b), Subtract(n, C1)),
                                          Times(Sqr(a), CSymbol, Subtract(n, C1)),
                                          Times(a, b, Plus(ASymbol, CSymbol), Plus(m, C1),
                                              Csc(Plus(e, Times(f, x))))),
                                      Times(
                                          Plus(Times(ASymbol, Sqr(b), Plus(m, n, C1)),
                                              Times(CSymbol,
                                                  Plus(Times(Sqr(a), n),
                                                      Times(Sqr(b), Plus(m, C1))))),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m,
                          CN1),
                      GtQ(n, C0)))),
          IIntegrate(4100,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_)))), C_DEFAULT)),
                      Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          n_),
                      Power(Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          b_DEFAULT), a_), m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Plus(
                                  Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol), Times(Sqr(a),
                                      CSymbol)),
                              Cot(Plus(e, Times(f, x))), Power(
                                  Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(d, Csc(
                                  Plus(e, Times(f, x)))), n),
                              Power(Times(a, f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                          x),
                      Dist(Power(Times(a, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                              Simp(Plus(
                                  Times(a,
                                      Plus(Times(a, ASymbol), Times(CN1, b, BSymbol),
                                          Times(a, CSymbol)),
                                      Plus(m, C1)),
                                  Times(CN1,
                                      Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol),
                                          Times(Sqr(a), CSymbol)),
                                      Plus(m, n, C1)),
                                  Times(CN1, a,
                                      Plus(Times(ASymbol, b), Times(CN1, a, BSymbol),
                                          Times(b, CSymbol)),
                                      Plus(m, C1), Csc(Plus(e, Times(f, x)))),
                                  Times(
                                      Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol),
                                          Times(Sqr(a), CSymbol)),
                                      Plus(m, n, C2), Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol, n), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(m, CN1),
                      Not(And(ILtQ(Plus(m, C1D2), C0), ILtQ(n, C0)))))));
}
