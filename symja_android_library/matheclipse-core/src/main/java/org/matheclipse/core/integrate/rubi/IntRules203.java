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
class IntRules203 {
  public static IAST RULES =
      List(
          IIntegrate(4061,
              Integrate(
                  Times(
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
                  Plus(
                      Simp(
                          Times(
                              Plus(Times(ASymbol, Sqr(b)), Times(Sqr(
                                  a), CSymbol)),
                              Cot(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))),
                                  Plus(m, C1)),
                              Power(Times(a, f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                          x),
                      Dist(Power(Times(a, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Simp(
                                  Plus(Times(ASymbol, Subtract(Sqr(a), Sqr(b)), Plus(m, C1)),
                                      Times(CN1, a, b, Plus(ASymbol, CSymbol), Plus(m, C1),
                                          Csc(Plus(e, Times(f, x)))),
                                      Times(Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)),
                                          Plus(m, C2), Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, CSymbol), x), NeQ(Subtract(Sqr(a), Sqr(
                      b)), C0), IntegerQ(Times(C2,
                          m)),
                      LtQ(m, CN1)))),
          IIntegrate(4062,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Plus(Times($(
                          $s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT), a_), m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Power(b, CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a,
                                      Times(b, Csc(Plus(e, Times(f, x))))), m),
                                  Plus(Times(ASymbol, b),
                                      Times(Subtract(Times(b, BSymbol), Times(a, CSymbol)),
                                          Csc(Plus(e, Times(f, x)))))),
                              x),
                          x),
                      Dist(
                          Times(CSymbol, Power(b,
                              CN1)),
                          Integrate(
                              Times(Csc(Plus(e, Times(f, x))), Power(Plus(a,
                                  Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol, CSymbol, m), x),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), Not(IntegerQ(Times(C2, m)))))),
          IIntegrate(4063,
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
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Power(b, CN1), Integrate(
                          Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                              Subtract(Times(ASymbol, b),
                                  Times(a, CSymbol, Csc(Plus(e, Times(f, x)))))),
                          x), x),
                      Dist(Times(CSymbol, Power(b, CN1)),
                          Integrate(
                              Times(Csc(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, CSymbol,
                      m), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      Not(IntegerQ(Times(C2, m)))))),
          IIntegrate(4064,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT),
                          m_),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(C_DEFAULT, Sqr($($s("§sec"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(Sqr(b),
                      Integrate(
                          Times(
                              Power(Times(b,
                                  Cos(Plus(e, Times(f, x)))), Subtract(m, C2)),
                              Plus(
                                  CSymbol, Times(BSymbol, Cos(
                                      Plus(e, Times(f, x)))),
                                  Times(ASymbol, Sqr(Cos(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(b, e, f, ASymbol, BSymbol, CSymbol, m), x), Not(IntegerQ(m))))),
          IIntegrate(4065,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(Sqr(b),
                      Integrate(
                          Times(
                              Power(Times(b,
                                  Sin(Plus(e, Times(f, x)))), Subtract(m, C2)),
                              Plus(
                                  CSymbol, Times(BSymbol, Sin(
                                      Plus(e, Times(f, x)))),
                                  Times(ASymbol, Sqr(Sin(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(b, e, f, ASymbol, BSymbol, CSymbol, m), x), Not(IntegerQ(m))))),
          IIntegrate(4066,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          m_),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT, Sqr($($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(Sqr(b),
                      Integrate(
                          Times(
                              Power(Times(b, Cos(Plus(e, Times(f, x)))), Subtract(m,
                                  C2)),
                              Plus(CSymbol, Times(ASymbol, Sqr(Cos(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(b, e, f, ASymbol, CSymbol, m), x), Not(IntegerQ(m))))),
          IIntegrate(4067,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(Sqr(b),
                      Integrate(
                          Times(
                              Power(Times(b, Sin(Plus(e, Times(f, x)))), Subtract(m,
                                  C2)),
                              Plus(CSymbol, Times(ASymbol, Sqr(Sin(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(b, e, f, ASymbol, CSymbol, m), x), Not(IntegerQ(m))))),
          IIntegrate(4068,
              Integrate(
                  Times(
                      Power(
                          Times(a_DEFAULT,
                              Power(
                                  Times(
                                      b_DEFAULT, $($s("§sec"),
                                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                  p_)),
                          m_),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          Times(
                              C_DEFAULT, Sqr($($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(a, IntPart(m)),
                          Power(Times(a, Power(Times(b, Sec(Plus(e, Times(f, x)))), p)),
                              FracPart(m)),
                          Power(Power(Times(b, Sec(Plus(e, Times(f, x)))), Times(p, FracPart(m))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(b,
                                  Sec(Plus(e, Times(f, x)))), Times(m, p)),
                              Plus(
                                  ASymbol, Times(BSymbol, Sec(
                                      Plus(e, Times(f, x)))),
                                  Times(CSymbol, Sqr(Sec(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol, CSymbol, m,
                      p), x), Not(
                          IntegerQ(m))))),
          IIntegrate(4069,
              Integrate(
                  Times(
                      Power(
                          Times(a_DEFAULT,
                              Power(
                                  Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                      b_DEFAULT),
                                  p_)),
                          m_),
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(a, IntPart(m)),
                          Power(Times(a, Power(Times(b, Csc(Plus(e, Times(f, x)))), p)),
                              FracPart(m)),
                          Power(Power(Times(b, Csc(Plus(e, Times(f, x)))), Times(p, FracPart(m))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(b,
                                  Csc(Plus(e, Times(f, x)))), Times(m, p)),
                              Plus(
                                  ASymbol, Times(BSymbol, Csc(Plus(e, Times(f, x)))), Times(CSymbol,
                                      Sqr(Csc(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol, CSymbol, m,
                      p), x), Not(
                          IntegerQ(m))))),
          IIntegrate(4070,
              Integrate(
                  Times(
                      Power(
                          Times(a_DEFAULT,
                              Power(
                                  Times(b_DEFAULT, $($s("§sec"), Plus(e_DEFAULT,
                                      Times(f_DEFAULT, x_)))),
                                  p_)),
                          m_),
                      Plus(A_DEFAULT,
                          Times(
                              C_DEFAULT, Sqr($($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(a, IntPart(m)),
                          Power(Times(a, Power(Times(b, Sec(Plus(e, Times(f, x)))), p)),
                              FracPart(m)),
                          Power(Power(Times(b, Sec(Plus(e, Times(f, x)))), Times(p, FracPart(m))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(b, Sec(Plus(e, Times(f, x)))), Times(m,
                                  p)),
                              Plus(ASymbol, Times(CSymbol, Sqr(Sec(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, ASymbol, CSymbol, m, p), x), Not(IntegerQ(m))))),
          IIntegrate(4071,
              Integrate(
                  Times(
                      Power(
                          Times(a_DEFAULT,
                              Power(
                                  Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                      b_DEFAULT),
                                  p_)),
                          m_),
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(a, IntPart(
                              m)),
                          Power(Times(a, Power(Times(b, Csc(Plus(e, Times(f, x)))), p)),
                              FracPart(m)),
                          Power(Power(Times(b, Csc(Plus(e, Times(f, x)))), Times(p, FracPart(m))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(b, Csc(Plus(e, Times(f, x)))), Times(m, p)),
                              Plus(ASymbol, Times(CSymbol, Sqr(Csc(Plus(e, Times(f, x))))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, ASymbol, CSymbol, m, p), x), Not(IntegerQ(m))))),
          IIntegrate(4072,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT)),
                          m_DEFAULT),
                      Plus(A_DEFAULT,
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Plus(c_DEFAULT,
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT)),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(b, CN2),
                      Integrate(
                          Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n),
                              Plus(Times(b, BSymbol), Times(CN1, a, CSymbol),
                                  Times(b, CSymbol, Csc(Plus(e, Times(f, x)))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, m,
                      n), x), EqQ(
                          Plus(
                              Times(ASymbol, Sqr(
                                  b)),
                              Times(CN1, a, b, BSymbol), Times(Sqr(a), CSymbol)),
                          C0)))),
          IIntegrate(4073,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT)),
                          m_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(c_DEFAULT,
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT)),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(CSymbol, Power(b,
                              CN2)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n), Subtract(
                                      a, Times(b, Csc(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, m, n), x),
                      EqQ(Plus(Times(ASymbol, Sqr(b)), Times(Sqr(a), CSymbol)), C0)))),
          IIntegrate(4074,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          n_),
                      Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT),
                          a_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(ASymbol, a, Cot(Plus(e, Times(f, x))),
                              Power(Times(d,
                                  Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(f, n), CN1)),
                          x),
                      Dist(
                          Power(Times(d,
                              n), CN1),
                          Integrate(
                              Times(
                                  Power(Times(d,
                                      Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                                  Simp(
                                      Plus(Times(n, Plus(Times(BSymbol, a), Times(ASymbol, b))),
                                          Times(
                                              Plus(
                                                  Times(n,
                                                      Plus(Times(a, CSymbol), Times(BSymbol, b))),
                                                  Times(ASymbol, a, Plus(n, C1))),
                                              Csc(Plus(e, Times(f, x)))),
                                          Times(b, CSymbol, n, Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol), x), LtQ(n, CN1)))),
          IIntegrate(4075,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT),
                          a_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(ASymbol, a, Cot(Plus(e, Times(f, x))),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), n), Power(Times(f, n), CN1)),
                          x),
                      Dist(
                          Power(Times(d,
                              n), CN1),
                          Integrate(Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                              Simp(Plus(Times(ASymbol, b, n),
                                  Times(a, Plus(Times(CSymbol, n), Times(ASymbol, Plus(n, C1))),
                                      Csc(Plus(e, Times(f, x)))),
                                  Times(b, CSymbol, n, Sqr(Csc(Plus(e, Times(f, x)))))), x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol), x), LtQ(n, CN1)))),
          IIntegrate(4076,
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
                          n_DEFAULT),
                      Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT),
                          a_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(b, CSymbol, Csc(Plus(e, Times(f, x))),
                                  Cot(Plus(e, Times(f, x))),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))),
                                      n),
                                  Power(Times(f, Plus(n, C2)), CN1)),
                              x)),
                      Dist(
                          Power(Plus(n,
                              C2), CN1),
                          Integrate(
                              Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                                  Simp(Plus(
                                      Times(ASymbol, a, Plus(n, C2)),
                                      Times(
                                          Plus(Times(BSymbol, a, Plus(n, C2)),
                                              Times(b,
                                                  Plus(Times(CSymbol, Plus(n, C1)),
                                                      Times(ASymbol, Plus(n, C2))))),
                                          Csc(Plus(e, Times(f, x)))),
                                      Times(Plus(Times(a, CSymbol), Times(BSymbol, b)), Plus(n, C2),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, BSymbol, CSymbol,
                      n), x), Not(
                          LtQ(n, CN1))))),
          IIntegrate(4077,
              Integrate(
                  Times(
                      Plus(A_DEFAULT,
                          Times(
                              Sqr($($s("§csc"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          n_DEFAULT),
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_))), b_DEFAULT), a_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(
                          Times(b, CSymbol, Csc(Plus(e, Times(f, x))), Cot(Plus(e, Times(f, x))),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(f, Plus(n, C2)), CN1)),
                          x)),
                      Dist(Power(Plus(n, C2), CN1),
                          Integrate(
                              Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), n), Simp(Plus(
                                  Times(ASymbol, a, Plus(n, C2)),
                                  Times(b,
                                      Plus(Times(CSymbol, Plus(n, C1)),
                                          Times(ASymbol, Plus(n, C2))),
                                      Csc(Plus(e, Times(f, x)))),
                                  Times(a, CSymbol, Plus(n, C2), Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, ASymbol, CSymbol, n), x), Not(LtQ(n, CN1))))),
          IIntegrate(4078,
              Integrate(
                  Times(
                      $($s("§csc"), Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_))),
                      Plus(A_DEFAULT, Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(
                          Plus(Times($(
                              $s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(
                                  Plus(Times(a, ASymbol), Times(
                                      CN1, b, BSymbol),
                                      Times(a, CSymbol)),
                                  Cot(Plus(e, Times(f, x))), Csc(Plus(e, Times(f,
                                      x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                                  Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                              x)),
                      Dist(Power(Times(a, b, Plus(Times(C2, m), C1)), CN1),
                          Integrate(Times(Csc(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Simp(
                                  Subtract(
                                      Subtract(Subtract(Times(a, BSymbol), Times(b, CSymbol)),
                                          Times(C2, ASymbol, b, Plus(m, C1))),
                                      Times(Subtract(Times(b, BSymbol, Plus(m, C2)),
                                          Times(a,
                                              Subtract(Times(ASymbol, Plus(m, C2)),
                                                  Times(CSymbol, Subtract(m, C1))))),
                                          Csc(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol,
                      CSymbol), x), LtQ(m,
                          CN1),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4079,
              Integrate(
                  Times(
                      $($s("§csc"), Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_))),
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
                      Negate(
                          Simp(Times(Plus(ASymbol, CSymbol), Cot(Plus(e, Times(f, x))),
                              Csc(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))),
                                  m),
                              Power(Times(f, Plus(Times(C2, m), C1)), CN1)), x)),
                      Dist(
                          Power(Times(a, b,
                              Plus(Times(C2, m), C1)), CN1),
                          Integrate(
                              Times(
                                  Csc(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Simp(Plus(Times(CN1, b, CSymbol),
                                      Times(CN1, C2, ASymbol, b, Plus(m, C1)),
                                      Times(a,
                                          Subtract(Times(ASymbol, Plus(m, C2)),
                                              Times(CSymbol, Subtract(m, C1))),
                                          Csc(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol,
                      CSymbol), x), LtQ(m,
                          CN1),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4080,
              Integrate(
                  Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      Plus(A_DEFAULT, Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          B_DEFAULT),
                          Times(Sqr($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                              C_DEFAULT)),
                      Power(Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          b_DEFAULT), a_), m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol), Times(
                                      Sqr(a), CSymbol)),
                                  Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x))))), Plus(m,
                                          C1)),
                                  Power(Times(b, f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                              x)),
                      Dist(Power(Times(b, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(Times(Csc(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Simp(Subtract(
                                  Times(b,
                                      Plus(Times(a, ASymbol), Times(CN1, b, BSymbol),
                                          Times(a, CSymbol)),
                                      Plus(m, C1)),
                                  Times(
                                      Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol),
                                          Times(Sqr(a), CSymbol),
                                          Times(b,
                                              Plus(Times(ASymbol, b), Times(CN1, a, BSymbol),
                                                  Times(b, CSymbol)),
                                              Plus(m, C1))),
                                      Csc(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol, CSymbol), x), LtQ(m, CN1),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))));
}
