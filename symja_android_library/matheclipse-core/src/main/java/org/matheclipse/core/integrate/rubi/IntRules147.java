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
class IntRules147 {
  public static IAST RULES =
      List(
          IIntegrate(2941,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(Subtract(
                  Dist(Power(c, CN1),
                      Integrate(Power(Times(Sin(Plus(e, Times(f, x))),
                          Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))))), CN1), x),
                      x),
                  Dist(Times(d, Power(c, CN1)),
                      Integrate(Power(Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                          Plus(c, Times(d, Sin(Plus(e, Times(f, x)))))), CN1), x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2942,
              Integrate(
                  Times(Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Sqrt(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Dist(Times(d, Power(c, CN1)),
                          Integrate(Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1D2)), x),
                          x)),
                      Dist(Power(c, CN1),
                          Integrate(
                              Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x)))))), Power(
                                      Sin(Plus(e, Times(f, x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a,
                      d)), C0), EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      EqQ(Plus(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(2943,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(CN2, a, Power(f,
                          CN1)),
                      Subst(Integrate(Power(Subtract(C1, Times(a, c, Sqr(x))), CN1), x), x,
                          Times(Cos(Plus(e, Times(f, x))),
                              Power(
                                  Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                      Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                                  CN1))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      NeQ(Plus(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(2944,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Sqrt(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(Subtract(Times(b, c), Times(a,
                              d)), Power(c,
                                  CN1)),
                          Integrate(
                              Power(
                                  Times(
                                      Sqrt(Plus(a, Times(b, Sin(
                                          Plus(e, Times(f, x)))))),
                                      Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                                  CN1),
                              x),
                          x),
                      Dist(Times(a, Power(c, CN1)),
                          Integrate(Times(Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x)))))),
                              Power(Times(Sin(Plus(e, Times(f, x))),
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a,
                      d)), C0), NeQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      EqQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2945,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Sqrt(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(Simp(
                  Times(
                      CN2, Plus(a, Times(b,
                          Sin(Plus(e, Times(f, x))))),
                      Sqrt(
                          Times(CN1, Subtract(Times(b, c), Times(a, d)),
                              Subtract(C1, Sin(
                                  Plus(e, Times(f, x)))),
                              Power(
                                  Times(Plus(c, d),
                                      Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  CN1))),
                      Sqrt(
                          Times(Subtract(Times(b, c), Times(a, d)),
                              Plus(C1, Sin(
                                  Plus(e, Times(f, x)))),
                              Power(Times(Subtract(c, d),
                                  Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), CN1))),
                      EllipticPi(Times(a, Plus(c, d), Power(Times(c, Plus(a, b)), CN1)),
                          ArcSin(Times(Rt(Times(Plus(a, b), Power(Plus(c, d), CN1)), C2),
                              Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x)))))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1D2))),
                          Times(Subtract(a, b), Plus(c, d),
                              Power(Times(Plus(a, b), Subtract(c, d)), CN1))),
                      Power(Times(c, f, Rt(Times(Plus(a, b), Power(Plus(c, d), CN1)), C2),
                          Cos(Plus(e, Times(f, x)))), CN1)),
                  x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                      C0), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2946,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Cos(Plus(e, Times(f, x))),
                          Power(
                              Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                              CN1)),
                      Integrate(
                          Power(Times(Cos(Plus(e,
                              Times(f, x))), Sin(
                                  Plus(e, Times(f, x)))),
                              CN1),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      EqQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2947,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(
                              Times(b, Power(a,
                                  CN1)),
                              Integrate(
                                  Power(
                                      Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                          Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                                      CN1),
                                  x),
                              x)),
                      Dist(Power(a, CN1),
                          Integrate(Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                              Power(Times(Sin(Plus(e, Times(f, x))),
                                  Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), Or(NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                          NeQ(Subtract(Sqr(c), Sqr(d)), C0))))),
          IIntegrate(2948,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Sqrt(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Sqrt(Plus(c_, Times(d_DEFAULT, $($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                          Sqrt(Plus(c,
                              Times(d, Sin(Plus(e, Times(f, x)))))),
                          Power(Cos(Plus(e, Times(f, x))), CN1)),
                      Integrate(Cot(Plus(e, Times(f, x))), x), x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      EqQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2949,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Sqrt(
                          Plus(c_,
                              Times(
                                  d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                      Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(d,
                          Integrate(
                              Times(
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), Power(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(c,
                          Integrate(Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                              Power(
                                  Times(Sin(Plus(e, Times(f, x))),
                                      Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                                  CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), Or(NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                          NeQ(Subtract(Sqr(c), Sqr(d)), C0))))),
          IIntegrate(2950,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_),
                      Power(
                          Plus(a_,
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
                  Dist(Times(Power(a, n), Power(c, n)),
                      Integrate(
                          Times(Power(Tan(Plus(e, Times(f, x))), p),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m, n))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      EqQ(Plus(p, Times(C2, n)), C0), IntegerQ(n)))),
          IIntegrate(2951,
              Integrate(
                  Times(
                      Power(
                          Times(g_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Subtract(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                          Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), Power(
                              Times(f, Cos(Plus(e, Times(f, x)))), CN1)),
                      Subst(
                          Integrate(
                              Times(Power(Times(g, x), p),
                                  Power(Plus(a, Times(b, x)), Subtract(m, C1D2)),
                                  Power(Plus(c, Times(d, x)), n), Power(Subtract(a, Times(b, x)),
                                      CN1D2)),
                              x),
                          x, Sin(Plus(e, Times(f, x)))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)),
                          C0),
                      IntegerQ(Subtract(m, C1D2))))),
          IIntegrate(2952,
              Integrate(
                  Times(
                      Power(
                          Times(g_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(Power(Times(g, $($s("§sin"), Plus(e, Times(f, x)))), p),
                              Power(Plus(a, Times(b, $($s("§sin"), Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, $($s("§sin"), Plus(e, Times(f, x))))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, n, p), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      Or(IntegersQ(m, n), IntegersQ(m, p), IntegersQ(n, p)), NeQ(p, C2)))),
          IIntegrate(2953,
              Integrate(
                  Times(
                      Power(
                          Times(g_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_),
                      Power(
                          Plus(a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(g, Sin(
                              Plus(e, Times(f, x)))), p),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), Power(Plus(c,
                              Times(d, Sin(Plus(e, Times(f, x))))), n)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x), NeQ(p, C2)))),
          IIntegrate(2954,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT)),
                          m_DEFAULT),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT), c_),
                          n_DEFAULT),
                      Power(Times(g_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(g, Plus(m,
                          n)),
                      Integrate(
                          Times(
                              Power(Times(g, Sin(Plus(e, Times(f, x)))),
                                  Subtract(Subtract(p, m), n)),
                              Power(Plus(b, Times(a,
                                  Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(d, Times(c, Sin(Plus(e, Times(f, x))))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, p), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      Not(IntegerQ(p)), IntegerQ(m), IntegerQ(n)))),
          IIntegrate(2955,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT)),
                          m_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_DEFAULT),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(g,
                              Csc(Plus(e, Times(f, x)))), p),
                          Power(Times(g, Sin(Plus(e, Times(f, x)))), p)),
                      Integrate(
                          Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n), Power(
                                  Power(Times(g, Csc(Plus(e, Times(f, x)))), p), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      Not(IntegerQ(p)), Not(And(IntegerQ(m), IntegerQ(n)))))),
          IIntegrate(2956,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_DEFAULT),
                      Power(Times(g_DEFAULT,
                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), p_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(g, n),
                      Integrate(
                          Times(Power(Times(g, Sin(Plus(e, Times(f, x)))), Subtract(p, n)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), Power(Plus(d,
                                  Times(c, Sin(Plus(e, Times(f, x))))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, p), x), IntegerQ(n)))),
          IIntegrate(2957,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_),
                      Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(Plus(b, Times(a,
                              Csc(Plus(e, Times(f, x))))), m),
                          Power(Plus(c,
                              Times(d, Csc(Plus(e, Times(f, x))))), n),
                          Power(Power(Csc(Plus(e, Times(f, x))), Plus(m, p)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f,
                      n), x), Not(
                          IntegerQ(n)),
                      IntegerQ(m), IntegerQ(p)))),
          IIntegrate(2958,
              Integrate(
                  Times(Power(
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          c_),
                      n_),
                      Power(
                          Times(g_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Csc(Plus(e, Times(f, x))), p),
                          Power(Times(g, Sin(Plus(e, Times(f, x)))), p)),
                      Integrate(
                          Times(Power(Plus(b, Times(a, Csc(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n),
                              Power(Power(Csc(Plus(e, Times(f, x))), Plus(m, p)), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, n,
                      p), x), Not(
                          IntegerQ(n)),
                      IntegerQ(m), Not(IntegerQ(p))))),
          IIntegrate(2959,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(Times(g, Sin(Plus(e, Times(f, x)))), n),
                      Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n), Power(
                          Power(Plus(d, Times(c, Sin(Plus(e, Times(f, x))))), n), CN1)),
                      Integrate(
                          Times(Power(Times(g, Sin(Plus(e, Times(f, x)))), Subtract(p, n)),
                              Power(Plus(a, Times(b,
                                  Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(d, Times(c, Sin(Plus(e, Times(f, x))))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x), Not(IntegerQ(n)),
                      Not(IntegerQ(m))))),
          IIntegrate(2960,
              Integrate(
                  Times(
                      Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          g_DEFAULT), p_DEFAULT),
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
                  Dist(Power(g, Plus(m, n)),
                      Integrate(Times(
                          Power(Times(g, Csc(Plus(e, Times(f, x)))), Subtract(Subtract(p, m), n)),
                          Power(Plus(b, Times(a, Csc(Plus(e, Times(f, x))))), m),
                          Power(Plus(d, Times(c, Csc(Plus(e, Times(f, x))))), n)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, p), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), Not(IntegerQ(p)), IntegerQ(m),
                      IntegerQ(n)))));
}
