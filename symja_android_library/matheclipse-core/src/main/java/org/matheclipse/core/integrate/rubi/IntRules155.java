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
class IntRules155 {
  public static IAST RULES =
      List(
          IIntegrate(3101,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), CN1),
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                              Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1), Integrate(Cot(Plus(c, Times(d, x))),
                          x), x),
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(
                                  Subtract(
                                      Times(b, Cos(Plus(c, Times(d, x)))),
                                      Times(a, Sin(Plus(c, Times(d, x))))),
                                  Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                      Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3102,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), CN1),
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                              Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Power(b, CN1), Integrate(Tan(Plus(c, Times(d, x))),
                          x), x),
                      Dist(Power(b, CN1),
                          Integrate(
                              Times(
                                  Subtract(Times(b, Cos(Plus(c, Times(d, x)))),
                                      Times(a, Sin(Plus(c, Times(d, x))))),
                                  Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                      Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3103,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_),
                      Power(
                          Plus(Times(
                              $($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(Sin(Plus(c, Times(d, x))), Plus(m,
                                  C1)),
                              Power(Times(a, d, Plus(m, C1)), CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(b, Power(a,
                                  CN2)),
                              Integrate(Power(Sin(Plus(c, Times(d, x))), Plus(m, C1)), x), x)),
                      Dist(
                          Times(Plus(Sqr(a), Sqr(b)), Power(a,
                              CN2)),
                          Integrate(
                              Times(Power(Sin(Plus(c, Times(d, x))), Plus(m, C2)),
                                  Power(
                                      Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                          Times(b, Sin(Plus(c, Times(d, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a), Sqr(b)), C0), LtQ(m, CN1)))),
          IIntegrate(3104,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_),
                      Power(
                          Plus(
                              Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                                  a_DEFAULT),
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Cos(Plus(c, Times(d, x))), Plus(m, C1)), Power(
                                      Times(b, d, Plus(m, C1)), CN1)),
                              x)),
                      Negate(
                          Dist(
                              Times(a, Power(b,
                                  CN2)),
                              Integrate(Power(Cos(Plus(c, Times(d, x))), Plus(m, C1)), x), x)),
                      Dist(Times(Plus(Sqr(a), Sqr(b)), Power(b, CN2)),
                          Integrate(
                              Times(Power(Cos(Plus(c, Times(d, x))), Plus(m, C2)),
                                  Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                      Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a), Sqr(b)), C0), LtQ(m, CN1)))),
          IIntegrate(3105,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_),
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                              Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(Plus(Dist(Times(Plus(Sqr(a), Sqr(b)), Power(a, CN2)),
                  Integrate(Times(Power(Sin(Plus(c, Times(d, x))), Plus(m, C2)),
                      Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                          Times(b, Sin(Plus(c, Times(d, x))))), n)),
                      x),
                  x),
                  Dist(Power(a, CN2),
                      Integrate(
                          Times(Power(Sin(Plus(c, Times(d, x))), m),
                              Power(
                                  Plus(Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                      Sin(Plus(c, Times(d, x))))),
                                  Plus(n, C2))),
                          x),
                      x),
                  Negate(
                      Dist(Times(C2, b, Power(a, CN2)),
                          Integrate(
                              Times(Power(Sin(Plus(c, Times(d, x))), Plus(m, C1)),
                                  Power(
                                      Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                          Times(b, Sin(Plus(c, Times(d, x))))),
                                      Plus(n, C1))),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a), Sqr(b)), C0), LtQ(n, CN1),
                      LtQ(m, CN1)))),
          IIntegrate(3106,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_),
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                              Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(Plus(Sqr(a), Sqr(
                              b)), Power(b,
                                  CN2)),
                          Integrate(
                              Times(
                                  Power(Cos(Plus(c, Times(d, x))), Plus(m,
                                      C2)),
                                  Power(
                                      Plus(
                                          Times(a, Cos(
                                              Plus(c, Times(d, x)))),
                                          Times(b, Sin(Plus(c, Times(d, x))))),
                                      n)),
                              x),
                          x),
                      Dist(Power(b, CN2),
                          Integrate(
                              Times(Power(Cos(Plus(c, Times(d, x))), m),
                                  Power(
                                      Plus(
                                          Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                              Sin(Plus(c, Times(d, x))))),
                                      Plus(n, C2))),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(C2, a, Power(b,
                                  CN2)),
                              Integrate(
                                  Times(Power(Cos(Plus(c, Times(d, x))), Plus(m, C1)),
                                      Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                          Sin(Plus(c, Times(d, x))))), Plus(n,
                                              C1))),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a),
                      Sqr(b)), C0), LtQ(n,
                          CN1),
                      LtQ(m, CN1)))),
          IIntegrate(3107,
              Integrate(
                  Times(
                      Power($($s("§cos"), Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), m_DEFAULT),
                      Power($($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(
                              Power($($s("§cos"), Plus(c,
                                  Times(d, x))), m),
                              Power($($s("§sin"), Plus(c, Times(d, x))), n),
                              Power(
                                  Plus(Times(a, $($s("§cos"), Plus(c, Times(d, x)))),
                                      Times(b, $($s("§sin"), Plus(c, Times(d, x))))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n), x), IGtQ(p, C0)))),
          IIntegrate(3108,
              Integrate(
                  Times(Power($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_DEFAULT),
                      Power($($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                              Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_))))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(a, p), Power(b,
                          p)),
                      Integrate(
                          Times(Power(Cos(Plus(c, Times(d, x))), m),
                              Power(Sin(Plus(c, Times(d, x))), n),
                              Power(
                                  Power(
                                      Plus(Times(b, Cos(Plus(c, Times(d, x)))),
                                          Times(a, Sin(Plus(c, Times(d, x))))),
                                      p),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n), x), EqQ(Plus(Sqr(a),
                      Sqr(b)), C0), ILtQ(p,
                          C0)))),
          IIntegrate(3109,
              Integrate(
                  Times(
                      Power($($s("§cos"), Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), m_DEFAULT),
                      Power($($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_))), n_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                                  a_DEFAULT),
                              Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(b, Power(Plus(Sqr(a), Sqr(b)), CN1)),
                          Integrate(
                              Times(Power(Cos(Plus(c, Times(d, x))), m),
                                  Power(Sin(Plus(c, Times(d, x))), Subtract(n, C1))),
                              x),
                          x),
                      Dist(
                          Times(a, Power(Plus(Sqr(a), Sqr(b)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Cos(Plus(c, Times(d, x))), Subtract(m, C1)), Power(
                                      Sin(Plus(c, Times(d, x))), n)),
                              x),
                          x),
                      Negate(
                          Dist(Times(a, b, Power(Plus(Sqr(a), Sqr(b)), CN1)),
                              Integrate(Times(Power(Cos(Plus(c, Times(d, x))), Subtract(m, C1)),
                                  Power(Sin(Plus(c, Times(d, x))), Subtract(n, C1)),
                                  Power(
                                      Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                          Times(b, Sin(Plus(c, Times(d, x))))),
                                      CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a),
                      Sqr(b)), C0), IGtQ(m,
                          C0),
                      IGtQ(n, C0)))),
          IIntegrate(3110,
              Integrate(
                  Times(
                      Power($($s("§cos"), Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), m_DEFAULT),
                      Power($($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_))), a_DEFAULT),
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(Times(Power($($s("§cos"), Plus(c, Times(d, x))), m),
                          Power($($s("§sin"), Plus(c, Times(d, x))), n),
                          Power(
                              Plus(Times(a, $($s("§cos"), Plus(c, Times(d, x)))),
                                  Times(b, $($s("§sin"), Plus(c, Times(d, x))))),
                              CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n), x), IntegersQ(m, n)))),
          IIntegrate(3111,
              Integrate(
                  Times(
                      Power($($s("§cos"), Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), m_DEFAULT),
                      Power($($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT,
                                  x_))), a_DEFAULT),
                              Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT,
                                  Times(d_DEFAULT, x_))))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(b, Power(Plus(Sqr(a), Sqr(b)),
                              CN1)),
                          Integrate(
                              Times(Power(Cos(Plus(c, Times(d, x))), m),
                                  Power(Sin(Plus(c,
                                      Times(d, x))), Subtract(n,
                                          C1)),
                                  Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                      Times(b, Sin(Plus(c, Times(d, x))))), Plus(p, C1))),
                              x),
                          x),
                      Dist(
                          Times(a, Power(Plus(Sqr(a), Sqr(b)),
                              CN1)),
                          Integrate(
                              Times(Power(Cos(Plus(c, Times(d, x))), Subtract(m, C1)),
                                  Power(Sin(Plus(c, Times(d, x))), n),
                                  Power(
                                      Plus(
                                          Times(a, Cos(Plus(c, Times(d, x)))), Times(b,
                                              Sin(Plus(c, Times(d, x))))),
                                      Plus(p, C1))),
                              x),
                          x),
                      Negate(Dist(Times(a, b, Power(Plus(Sqr(a), Sqr(b)), CN1)),
                          Integrate(Times(Power(Cos(Plus(c, Times(d, x))), Subtract(m, C1)),
                              Power(Sin(Plus(c, Times(d, x))), Subtract(n, C1)),
                              Power(Plus(Times(a, Cos(Plus(c, Times(d, x)))),
                                  Times(b, Sin(Plus(c, Times(d, x))))), p)),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Plus(Sqr(a),
                      Sqr(b)), C0), IGtQ(m,
                          C0),
                      IGtQ(n, C0), ILtQ(p, C0)))),
          IIntegrate(3112,
              Integrate(
                  Sqrt(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(CN2,
                          Subtract(Times(c, Cos(Plus(d, Times(e, x)))), Times(b,
                              Sin(Plus(d, Times(e, x))))),
                          Power(
                              Times(e,
                                  Sqrt(
                                      Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                          Times(c, Sin(Plus(d, Times(e, x))))))),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d,
                      e), x), EqQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)),
                          C0)))),
          IIntegrate(3113,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT,
                              x_))), b_DEFAULT),
                          a_,
                          Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Subtract(
                                      Times(c, Cos(Plus(d, Times(e, x)))),
                                      Times(b, Sin(Plus(d, Times(e, x))))),
                                  Power(
                                      Plus(a, Times(b, Cos(Plus(d, Times(e, x)))), Times(c,
                                          Sin(Plus(d, Times(e, x))))),
                                      Subtract(n, C1)),
                                  Power(Times(e, n), CN1)),
                              x)),
                      Dist(
                          Times(a, Subtract(Times(C2, n), C1), Power(n,
                              CN1)),
                          Integrate(
                              Power(
                                  Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                      Times(c, Sin(Plus(d, Times(e, x))))),
                                  Subtract(n, C1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)),
                      C0), GtQ(n, C0)))),
          IIntegrate(3114,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      CN1),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(
                          Times(Subtract(c, Times(a, Sin(Plus(d, Times(e, x))))),
                              Power(
                                  Times(c, e,
                                      Subtract(Times(c, Cos(Plus(d, Times(e, x)))),
                                          Times(b, Sin(Plus(d, Times(e, x)))))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d,
                      e), x), EqQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)),
                          C0)))),
          IIntegrate(3115,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT,
                              Times(e_DEFAULT, x_))))),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Integrate(
                      Power(
                          Plus(a,
                              Times(
                                  Sqrt(Plus(Sqr(b), Sqr(
                                      c))),
                                  Cos(Subtract(Plus(d, Times(e, x)), ArcTan(b, c))))),
                          CN1D2),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)),
                      C0)))),
          IIntegrate(3116,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_,
                          Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Subtract(
                                  Times(c, Cos(Plus(d, Times(e, x)))), Times(b,
                                      Sin(Plus(d, Times(e, x))))),
                              Power(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x))))), n),
                              Power(Times(a, e, Plus(Times(C2, n), C1)), CN1)),
                          x),
                      Dist(Times(Plus(n, C1), Power(Times(a, Plus(Times(C2, n), C1)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                              Times(c, Sin(Plus(d, Times(e, x))))), Plus(n, C1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)),
                      C0), LtQ(n, CN1)))),
          IIntegrate(3117,
              Integrate(
                  Sqrt(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(b, Power(Times(c, e),
                          CN1)),
                      Subst(Integrate(Times(Sqrt(Plus(a, x)), Power(x, CN1)), x), x,
                          Plus(
                              Times(b, Cos(Plus(d, Times(e, x)))), Times(c,
                                  Sin(Plus(d, Times(e, x)))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(Sqr(b), Sqr(c)), C0)))),
          IIntegrate(3118,
              Integrate(
                  Sqrt(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Integrate(
                      Sqrt(Plus(a,
                          Times(Sqrt(Plus(Sqr(b), Sqr(c))),
                              Cos(Subtract(Plus(d, Times(e, x)), ArcTan(b, c)))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Plus(Sqr(b),
                      Sqr(c)), C0), GtQ(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))),
                          C0)))),
          IIntegrate(3119,
              Integrate(
                  Sqrt(
                      Plus(
                          Times($($s("§cos"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(
                              Plus(
                                  a, Times(b, Cos(Plus(d, Times(e, x)))), Times(c,
                                      Sin(Plus(d, Times(e, x)))))),
                          Power(Times(
                              Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x))))),
                              Power(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), CN1)), CN1D2)),
                      Integrate(
                          Sqrt(
                              Plus(Times(a, Power(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), CN1)),
                                  Times(Sqrt(Plus(Sqr(b), Sqr(c))),
                                      Cos(Subtract(Plus(d, Times(e, x)), ArcTan(b, c))), Power(
                                          Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), CN1)))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Subtract(Subtract(Sqr(a),
                          Sqr(b)), Sqr(c)), C0),
                      NeQ(Plus(Sqr(b), Sqr(c)),
                          C0),
                      Not(GtQ(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), C0))))),
          IIntegrate(3120,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_,
                          Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Subtract(
                                      Times(c, Cos(Plus(d, Times(e, x)))), Times(b,
                                          Sin(Plus(d, Times(e, x))))),
                                  Power(
                                      Plus(
                                          a, Times(b, Cos(
                                              Plus(d, Times(e, x)))),
                                          Times(c, Sin(Plus(d, Times(e, x))))),
                                      Subtract(n, C1)),
                                  Power(Times(e, n), CN1)),
                              x)),
                      Dist(Power(n, CN1), Integrate(Times(
                          Simp(Plus(Times(n, Sqr(a)), Times(Subtract(n, C1), Plus(Sqr(b), Sqr(c))),
                              Times(a, b, Subtract(Times(C2, n), C1), Cos(Plus(d, Times(e, x)))),
                              Times(a, c, Subtract(Times(C2, n), C1), Sin(Plus(d, Times(e, x))))),
                              x),
                          Power(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                              Times(c, Sin(Plus(d, Times(e, x))))), Subtract(n, C2))),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)), C0), GtQ(n, C1)))));
}
