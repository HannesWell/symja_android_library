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
class IntRules148 {
  public static IAST RULES =
      List(
          IIntegrate(2961,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(g,
                              Csc(Plus(e, Times(f, x)))), p),
                          Power(Times(g, Sin(Plus(e, Times(f, x)))), p)),
                      Integrate(
                          Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d,
                                  Sin(Plus(e, Times(f, x))))), n),
                              Power(Power(Times(g, Sin(Plus(e, Times(f, x)))), p), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      Not(IntegerQ(p)), Not(And(IntegerQ(m), IntegerQ(n)))))),
          IIntegrate(2962,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(g, m),
                      Integrate(
                          Times(Power(Times(g, Csc(Plus(e, Times(f, x)))), Subtract(p, m)),
                              Power(Plus(b, Times(a, Csc(Plus(e, Times(f, x))))), m), Power(Plus(c,
                                  Times(d, Csc(Plus(e, Times(f, x))))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, n, p), x), IntegerQ(m)))),
          IIntegrate(2963,
              Integrate(
                  Times(Power($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_DEFAULT),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          c_), n_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Power(Plus(d,
                              Times(c, Sin(Plus(e, Times(f, x))))), n),
                          Power(Power(Sin(Plus(e, Times(f, x))), Plus(n, p)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f,
                      m), x), Not(
                          IntegerQ(m)),
                      IntegerQ(n), IntegerQ(p)))),
          IIntegrate(2964,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Sin(
                              Plus(e, Times(f, x))), p),
                          Power(Times(g, Csc(Plus(e, Times(f, x)))), p)),
                      Integrate(
                          Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(d, Times(c,
                                  Sin(Plus(e, Times(f, x))))), n),
                              Power(Power(Sin(Plus(e, Times(f, x))), Plus(n, p)), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m,
                      p), x), Not(
                          IntegerQ(m)),
                      IntegerQ(n), Not(IntegerQ(p))))),
          IIntegrate(2965,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Power(Times(g, Csc(Plus(e, Times(f, x)))), m), Power(Power(
                              Plus(b, Times(a, Csc(Plus(e, Times(f, x))))), m), CN1)),
                      Integrate(
                          Times(Power(Times(g, Csc(Plus(e, Times(f, x)))), Subtract(p, m)),
                              Power(Plus(b, Times(a,
                                  Csc(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x), Not(IntegerQ(m)),
                      Not(IntegerQ(n))))),
          IIntegrate(2966,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(A_DEFAULT, Times(B_DEFAULT, $($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(Power($($s("§sin"), Plus(e, Times(f, x))), n),
                              Power(Plus(a,
                                  Times(b, $($s("§sin"), Plus(e, Times(f, x))))), m),
                              Plus(ASymbol, Times(BSymbol, $($s("§sin"), Plus(e, Times(f, x)))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, ASymbol, BSymbol), x),
                      EqQ(Plus(Times(ASymbol, b), Times(a,
                          BSymbol)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), IntegerQ(m), IntegerQ(n)))),
          IIntegrate(2967,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(a, m), Power(c, m)),
                      Integrate(Times(Power(Cos(Plus(e, Times(f, x))), Times(C2, m)),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Subtract(n, m)), Plus(
                              ASymbol, Times(BSymbol, Sin(Plus(e, Times(f, x)))))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, n), x),
                      EqQ(Plus(Times(b, c), Times(a, d)), C0), EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      IntegerQ(m),
                      Not(And(IntegerQ(n), Or(And(LtQ(m, C0), GtQ(n, C0)), LtQ(C0, n, m),
                          LtQ(m, n, C0))))))),
          IIntegrate(2968,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Plus(c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(Plus(a,
                              Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Plus(Times(ASymbol, c),
                              Times(
                                  Plus(Times(BSymbol, c),
                                      Times(ASymbol, d)),
                                  Sin(Plus(e, Times(f, x)))),
                              Times(BSymbol, d, Sqr(Sin(Plus(e, Times(f, x))))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, m), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(2969,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Plus(
                          A_DEFAULT, Times(B_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(
                              Plus(Times(ASymbol, b), Times(a,
                                  BSymbol)),
                              Power(Times(C2, a, b), CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(
                          Times(
                              Plus(Times(BSymbol, c), Times(ASymbol,
                                  d)),
                              Power(Times(C2, c, d), CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x)))))), Power(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol),
                      x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2970,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(
                          Times(BSymbol, Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))),
                                  n),
                              Power(Times(f, Plus(m, n, C1)), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, m, n), x),
                      EqQ(Plus(Times(b, c), Times(a,
                          d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), EqQ(
                          Plus(Times(ASymbol, b, Plus(m, n, C1)),
                              Times(a, BSymbol, Subtract(m, n))),
                          C0),
                      NeQ(m, Negate(C1D2))))),
          IIntegrate(2971,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Plus(
                          A_DEFAULT, Times(B_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(
                              c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(BSymbol, Power(d,
                              CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1))),
                              x),
                          x),
                      Dist(Times(Subtract(Times(BSymbol, c), Times(ASymbol, d)), Power(d, CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, n),
                      x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2972,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(A_DEFAULT, Times(B_DEFAULT,
                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Subtract(Times(ASymbol, b), Times(a, BSymbol)),
                              Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))), n),
                              Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Plus(Times(a, BSymbol, Subtract(m, n)),
                                  Times(ASymbol, b, Plus(m, n, C1))),
                              Power(Times(a, b, Plus(Times(C2, m), C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, m, n), x),
                      EqQ(Plus(Times(b, c), Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      Or(LtQ(m, Negate(C1D2)), And(ILtQ(Plus(m, n), C0), Not(SumSimplerQ(n, C1)))),
                      NeQ(Plus(Times(C2, m), C1), C0)))),
          IIntegrate(2973,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Plus(
                          A_DEFAULT, Times(B_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(BSymbol, Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Power(Times(f, Plus(m, n, C1)), CN1)),
                              x)),
                      Dist(
                          Times(Subtract(Times(BSymbol, c, Subtract(m, n)), Times(ASymbol, d,
                              Plus(m, n, C1))), Power(Times(d, Plus(m, n, C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, m, n), x),
                      EqQ(Plus(Times(b, c), Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      Not(LtQ(m, Negate(C1D2))), NeQ(Plus(m, n, C1), C0)))),
          IIntegrate(2974,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(Subtract(Times(BSymbol, c), Times(ASymbol, d)),
                          Cos(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n,
                              C1)),
                          Power(Times(f, Plus(n, C1), Subtract(Sqr(c), Sqr(d))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, m, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      EqQ(Plus(m, n, C2), C0),
                      EqQ(Subtract(Times(ASymbol, Plus(Times(a, d, m), Times(b, c, Plus(n, C1)))),
                          Times(BSymbol, Plus(Times(a, c, m), Times(b, d, Plus(n, C1))))),
                          C0)))),
          IIntegrate(2975,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          A_DEFAULT, Times(B_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(Sqr(b), Subtract(Times(BSymbol, c), Times(ASymbol, d)),
                                  Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                                  Power(Times(d, f, Plus(n, C1), Plus(Times(b, c), Times(a, d))),
                                      CN1)),
                              x)),
                      Dist(
                          Times(b,
                              Power(Times(d, Plus(n, C1), Plus(Times(b, c), Times(a, d))), CN1)),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m,
                                  C1)),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                              Simp(
                                  Subtract(
                                      Subtract(Times(a, ASymbol, d, Subtract(Subtract(m, n), C2)),
                                          Times(BSymbol,
                                              Plus(Times(a, c, Subtract(m, C1)),
                                                  Times(b, d, Plus(n, C1))))),
                                      Times(
                                          Subtract(Times(ASymbol, b, d, Plus(m, n, C1)),
                                              Times(BSymbol,
                                                  Subtract(Times(b, c, m),
                                                      Times(a, d, Plus(n, C1))))),
                                          Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(
                          d)), C0),
                      GtQ(m, C1D2), LtQ(n, CN1), IntegerQ(Times(C2,
                          m)),
                      Or(IntegerQ(Times(C2, n)), EqQ(c, C0))))),
          IIntegrate(2976,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          A_DEFAULT, Times(B_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  b, BSymbol, Cos(Plus(e,
                                      Times(f, x))),
                                  Power(
                                      Plus(a, Times(b,
                                          Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                                  Power(Times(d, f, Plus(m, n, C1)), CN1)),
                              x)),
                      Dist(
                          Power(Times(d, Plus(m, n, C1)), CN1), Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b, Sin(Plus(e, Times(f,
                                          x))))),
                                      Subtract(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(Plus(Times(a, ASymbol, d, Plus(m, n, C1)),
                                      Times(BSymbol,
                                          Plus(Times(a, c, Subtract(m, C1)),
                                              Times(b, d, Plus(n, C1)))),
                                      Times(
                                          Subtract(Times(ASymbol, b, d, Plus(m, n, C1)),
                                              Times(BSymbol,
                                                  Subtract(Times(b, c, m),
                                                      Times(a, d, Plus(Times(C2, m), n))))),
                                          Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      GtQ(m, C1D2), Not(LtQ(n, CN1)), IntegerQ(Times(C2, m)),
                      Or(IntegerQ(Times(C2, n)), EqQ(c, C0))))),
          IIntegrate(2977,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(A_DEFAULT,
                          Times(B_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Subtract(Times(ASymbol, b), Times(a, BSymbol)),
                              Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b,
                                  Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))), n),
                              Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(a, b,
                              Plus(Times(C2, m), C1)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x))))), Plus(m,
                                          C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))),
                                      Subtract(n, C1)),
                                  Simp(
                                      Subtract(
                                          Subtract(
                                              Times(ASymbol,
                                                  Subtract(Times(a, d, n),
                                                      Times(b, c, Plus(m, C1)))),
                                              Times(BSymbol, Plus(Times(a, c, m), Times(b, d, n)))),
                                          Times(d,
                                              Plus(Times(a, BSymbol, Subtract(m, n)),
                                                  Times(ASymbol, b, Plus(m, n, C1))),
                                              Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      LtQ(m, Negate(C1D2)), GtQ(n, C0), IntegerQ(Times(C2, m)), Or(
                          IntegerQ(Times(C2, n)), EqQ(c, C0))))),
          IIntegrate(2978,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(A_DEFAULT, Times(B_DEFAULT,
                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(b, Subtract(Times(ASymbol, b), Times(a, BSymbol)),
                              Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d,
                                  Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                              Power(
                                  Times(
                                      a, f, Plus(Times(C2,
                                          m), C1),
                                      Subtract(Times(b, c), Times(a, d))),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(a, Plus(Times(C2, m), C1),
                                  Subtract(Times(b, c), Times(a, d))),
                              CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(
                                      Plus(
                                          Times(BSymbol,
                                              Plus(Times(a, c, m), Times(b, d, Plus(n, C1)))),
                                          Times(ASymbol,
                                              Subtract(Times(b, c, Plus(m, C1)),
                                                  Times(a, d, Plus(Times(C2, m), n, C2)))),
                                          Times(
                                              d, Subtract(Times(ASymbol, b),
                                                  Times(a, BSymbol)),
                                              Plus(m, n, C2), Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      LtQ(m, Negate(C1D2)), Not(GtQ(n, C0)), IntegerQ(Times(C2, m)), Or(
                          IntegerQ(Times(C2, n)), EqQ(c, C0))))),
          IIntegrate(2979,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Plus(
                          A_DEFAULT, Times(B_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(CN2, b, BSymbol, Cos(Plus(e, Times(f, x))),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                          Power(
                              Times(d, f, Plus(Times(C2, n), C3),
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))))),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      EqQ(Subtract(Times(ASymbol, b, d, Plus(Times(C2, n), C3)),
                          Times(BSymbol, Subtract(Times(b, c), Times(C2, a, d, Plus(n, C1))))),
                          C0)))),
          IIntegrate(2980,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Plus(
                          A_DEFAULT, Times(B_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(Negate(
                      Simp(
                          Times(Sqr(b), Subtract(Times(BSymbol, c), Times(ASymbol, d)),
                              Cos(Plus(e, Times(f, x))),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                              Power(
                                  Times(d, f, Plus(n, C1), Plus(Times(b,
                                      c), Times(a, d)),
                                      Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))))),
                                  CN1)),
                          x)),
                      Dist(
                          Times(
                              Subtract(
                                  Times(ASymbol, b, d, Plus(Times(C2, n),
                                      C3)),
                                  Times(BSymbol,
                                      Subtract(Times(b, c), Times(C2, a, d, Plus(n, C1))))),
                              Power(Times(C2, d, Plus(n, C1), Plus(Times(b, c), Times(a, d))),
                                  CN1)),
                          Integrate(
                              Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      LtQ(n, CN1)))));
}
