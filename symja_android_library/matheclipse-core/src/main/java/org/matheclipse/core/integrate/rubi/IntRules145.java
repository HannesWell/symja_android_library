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
class IntRules145 {
  public static IAST RULES = List(
      IIntegrate(2901,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(
                      Times(Sqr(g), Power(b,
                          CN2)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C2)),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                              Subtract(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                          x),
                      x),
                  Dist(Times(Sqr(g), Subtract(Sqr(a), Sqr(b)), Power(b, CN2)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C2)),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                  IntegersQ(Times(C2, n), Times(C2, p)), GtQ(p, C1)))),
      IIntegrate(2902,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Plus(
                  Dist(
                      Times(a, Sqr(d), Power(Subtract(Sqr(a), Sqr(b)),
                          CN1)),
                      Integrate(
                          Times(
                              Power(Times(g, Cos(Plus(e, Times(f, x)))), p), Power(Times(d,
                                  Sin(Plus(e, Times(f, x)))), Subtract(n, C2))),
                          x),
                      x),
                  Negate(
                      Dist(
                          Times(b, d, Power(Subtract(Sqr(a), Sqr(b)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Times(g, Cos(Plus(e, Times(f, x)))), p), Power(Times(d, Sin(
                                      Plus(e, Times(f, x)))), Subtract(n,
                                          C1))),
                              x),
                          x)),
                  Negate(Dist(
                      Times(Sqr(a), Sqr(d), Power(Times(Sqr(g), Subtract(Sqr(a), Sqr(b))), CN1)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C2)),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), Subtract(n, C2)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      x))),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(
                  b)), C0), IntegersQ(Times(C2,
                      n), Times(C2, p)),
                  LtQ(p, CN1), GtQ(n, C1)))),
      IIntegrate(2903,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Dist(
                          Times(d, Power(Subtract(Sqr(a), Sqr(b)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                                  Power(Times(d, Sin(Plus(e, Times(f, x)))), Subtract(n,
                                      C1)),
                                  Subtract(b, Times(a, Sin(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  Dist(Times(a, b, d, Power(Times(Sqr(g), Subtract(Sqr(a), Sqr(b))), CN1)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C2)),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), Subtract(n, C1)), Power(
                                  Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a),
                  Sqr(b)), C0), IntegersQ(Times(C2, n),
                      Times(C2, p)),
                  LtQ(p, CN1), GtQ(n, C0)))),
      IIntegrate(2904,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(
                      Power(Subtract(Sqr(a),
                          Sqr(b)), CN1),
                      Integrate(
                          Times(
                              Power(Times(g, Cos(
                                  Plus(e, Times(f, x)))), p),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), n),
                              Subtract(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                          x),
                      x),
                  Dist(
                      Times(Sqr(b), Power(Times(Sqr(g), Subtract(Sqr(a), Sqr(b))),
                          CN1)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C2)),
                              Power(Times(d, Sin(
                                  Plus(e, Times(f, x)))), n),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                  IntegersQ(Times(C2, n), Times(C2, p)), LtQ(p, CN1)))),
      IIntegrate(2905,
          Integrate(
              Times(
                  Sqrt(Times($($s("§cos"),
                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT)),
                  Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1D2),
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Dist(Times(CN4, CSqrt2, g, Power(f, CN1)),
                  Subst(
                      Integrate(
                          Times(Sqr(x),
                              Power(
                                  Times(
                                      Plus(Times(Plus(a, b), Sqr(g)),
                                          Times(Subtract(a, b), Power(x, C4))),
                                      Sqrt(Subtract(C1, Times(Power(x, C4), Power(g, CN2))))),
                                  CN1)),
                          x),
                      x,
                      Times(
                          Sqrt(Times(g, Cos(Plus(e, Times(f, x))))), Power(
                              Plus(C1, Sin(Plus(e, Times(f, x)))), CN1D2))),
                  x),
              And(FreeQ(List(a, b, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
      IIntegrate(2906,
          Integrate(
              Times(
                  Sqrt(Times($($s("§cos"),
                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT)),
                  Power(Times(d_,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), CN1D2),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Sqrt(Sin(Plus(e, Times(f, x)))), Power(Times(d, Sin(Plus(e, Times(f, x)))),
                          CN1D2)),
                  Integrate(
                      Times(Sqrt(Times(g, Cos(Plus(e, Times(f, x))))),
                          Power(
                              Times(
                                  Sqrt(Sin(Plus(e, Times(f, x)))), Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x)))))),
                              CN1)),
                      x),
                  x),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
      IIntegrate(2907,
          Integrate(
              Times(
                  Power($($s("§cos"), Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_))), CN1D2),
                  Sqrt(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              With(
                  List(Set(q,
                      Rt(Plus(Negate(Sqr(a)), Sqr(b)), C2))),
                  Subtract(
                      Dist(
                          Times(C2, CSqrt2, d, Plus(b, q), Power(Times(f, q),
                              CN1)),
                          Subst(
                              Integrate(
                                  Power(
                                      Times(Plus(Times(d, Plus(b, q)), Times(a, Sqr(x))),
                                          Sqrt(Subtract(C1, Times(Power(x, C4), Power(d, CN2))))),
                                      CN1),
                                  x),
                              x,
                              Times(
                                  Sqrt(Times(d,
                                      Sin(Plus(e, Times(f, x))))),
                                  Power(Plus(C1, Cos(Plus(e, Times(f, x)))), CN1D2))),
                          x),
                      Dist(Times(C2, CSqrt2, d, Subtract(b, q), Power(Times(f, q), CN1)),
                          Subst(
                              Integrate(
                                  Power(
                                      Times(Plus(Times(d, Subtract(b, q)), Times(a, Sqr(x))),
                                          Sqrt(Subtract(C1, Times(Power(x, C4), Power(d, CN2))))),
                                      CN1),
                                  x),
                              x,
                              Times(Sqrt(Times(d, Sin(Plus(e, Times(f, x))))),
                                  Power(Plus(C1, Cos(Plus(e, Times(f, x)))), CN1D2))),
                          x))),
              And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
      IIntegrate(2908,
          Integrate(
              Times(
                  Power(
                      Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          g_DEFAULT),
                      CN1D2),
                  Sqrt(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Sqrt(Cos(
                          Plus(e, Times(f, x)))),
                      Power(Times(g, Cos(Plus(e, Times(f, x)))), CN1D2)),
                  Integrate(
                      Times(
                          Sqrt(Times(d,
                              Sin(Plus(e, Times(f, x))))),
                          Power(
                              Times(
                                  Sqrt(Cos(
                                      Plus(e, Times(f, x)))),
                                  Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                              CN1)),
                      x),
                  x),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
      IIntegrate(2909,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(
                      Times(d, Power(b,
                          CN1)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), Subtract(n, C1))),
                          x),
                      x),
                  Dist(Times(a, d, Power(b, CN1)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), Subtract(n,
                                  C1)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a),
                  Sqr(b)), C0), IntegersQ(Times(C2, n),
                      Times(C2, p)),
                  LtQ(CN1, p, C1), GtQ(n, C0)))),
      IIntegrate(2910,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      CN1)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(Power(a, CN1),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), n)),
                          x),
                      x),
                  Dist(Times(b, Power(Times(a, d), CN1)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), Plus(n,
                                  C1)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                  IntegersQ(Times(C2, n), Times(C2, p)), LtQ(CN1, p, C1), LtQ(n, C0)))),
      IIntegrate(2911,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Sqr(Plus(a_, Times(b_DEFAULT, $($s("§sin"),
                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
              x_Symbol),
          Condition(Plus(
              Dist(Times(C2, a, b, Power(d, CN1)),
                  Integrate(
                      Times(
                          Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                          Power(Times(d, Sin(Plus(e, Times(f, x)))), Plus(n, C1))),
                      x),
                  x),
              Integrate(Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                  Power(Times(d, Sin(Plus(e, Times(f, x)))), n), Plus(Sqr(a),
                      Times(Sqr(b), Sqr(Sin(Plus(e, Times(f, x))))))),
                  x)),
              And(FreeQ(List(a, b, d, e, f, g, n, p), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
      IIntegrate(2912,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_)),
              x_Symbol),
          Condition(Integrate(ExpandTrig(Power(Times(g, $($s("§cos"), Plus(e, Times(f, x)))), p),
              Times(Power(Times(d, $($s("§sin"), Plus(e, Times(f, x)))), n),
                  Power(Plus(a, Times(b, $($s("§sin"), Plus(e, Times(f, x))))), m)),
              x), x), And(
                  FreeQ(List(a, b, d, e, f, g, n,
                      p), x),
                  NeQ(Subtract(Sqr(a), Sqr(b)), C0), IntegerQ(m), Or(GtQ(m, C0), IntegerQ(n))))),
      IIntegrate(2913,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT), p_),
                  Power(Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))), n_),
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_)),
              x_Symbol),
          Condition(
              Plus(
                  Dist(
                      Times(Sqr(g), Power(a,
                          CN1)),
                      Integrate(
                          Times(
                              Power(Times(g, Cos(
                                  Plus(e, Times(f, x)))), Subtract(p,
                                      C2)),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))),
                                  n),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1))),
                          x),
                      x),
                  Negate(
                      Dist(
                          Times(b, Sqr(g), Power(Times(Sqr(a), d),
                              CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C2)),
                                  Power(Times(d, Sin(Plus(e, Times(f, x)))), Plus(n,
                                      C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1))),
                              x),
                          x)),
                  Negate(Dist(
                      Times(Sqr(g), Subtract(Sqr(a), Sqr(b)), Power(Times(Sqr(a), Sqr(d)), CN1)),
                      Integrate(
                          Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C2)),
                              Power(Times(d, Sin(Plus(e, Times(f, x)))), Plus(n, C2)), Power(
                                  Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m)),
                          x),
                      x))),
              And(FreeQ(List(a, b, d, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                  IntegersQ(m, Times(C2, n), Times(C2, p)), LtQ(m, C0), GtQ(p, C1), Or(LeQ(n, CN2),
                      And(EqQ(m, CN1), EqQ(n, QQ(-3L, 2L)), EqQ(p, QQ(3L, 2L))))))),
      IIntegrate(2914,
          Integrate(
              Times(Power($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_),
                  Power(
                      Plus(c_,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      n_)),
              x_Symbol),
          Condition(
              Dist(
                  Power(a, Times(C2,
                      m)),
                  Integrate(
                      Times(Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n), Power(Power(
                          Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))), m), CN1)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                  IntegersQ(m, p), EqQ(Plus(Times(C2, m), p), C0)))),
      IIntegrate(2915,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(
                      Plus(a_, Times(b_DEFAULT,
                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_),
                  Power(
                      Plus(
                          c_, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      n_)),
              x_Symbol),
          Condition(
              Dist(
                  Power(Times(a, Power(g, CN1)), Times(C2,
                      m)),
                  Integrate(
                      Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(Times(C2, m), p)),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n), Power(Power(
                              Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              CN1)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, g, n), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                  IntegerQ(m), Or(
                      EqQ(Plus(Times(C2, m), p), C0), And(GtQ(Plus(Times(C2, m), p), C0),
                          LtQ(p, CN1)))))),
      IIntegrate(2916,
          Integrate(
              Times(
                  Sqr($($s("§cos"),
                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_),
                  Power(
                      Plus(c_,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      n_)),
              x_Symbol),
          Condition(
              Dist(Power(b, CN2),
                  Integrate(
                      Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n), Subtract(a,
                              Times(b, Sin(Plus(e, Times(f, x)))))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, m, n), x), EqQ(Subtract(Sqr(a),
                  Sqr(b)), C0), IntegersQ(Times(C2, m),
                      Times(C2, n))))),
      IIntegrate(2917,
          Integrate(
              Times(
                  Power($($s("§cos"),
                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_),
                  Power(
                      Plus(
                          c_, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      n_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(Power(a, m), Cos(Plus(e, Times(f, x))),
                      Power(Times(f, Sqrt(Plus(C1, Sin(Plus(e, Times(f, x))))),
                          Sqrt(Subtract(C1, Sin(Plus(e, Times(f, x)))))), CN1)),
                  Subst(
                      Integrate(
                          Times(
                              Power(Plus(C1, Times(b, x, Power(a, CN1))),
                                  Plus(m, Times(C1D2, Subtract(p, C1)))),
                              Power(Subtract(C1, Times(b, x, Power(a, CN1))),
                                  Times(C1D2, Subtract(p, C1))),
                              Power(Plus(c, Times(d, x)), n)),
                          x),
                      x, Sin(Plus(e, Times(f, x)))),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                  IntegerQ(Times(C1D2, p)), IntegerQ(m)))),
      IIntegrate(2918,
          Integrate(
              Times(
                  Power($($s("§cos"),
                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_),
                  Power(
                      Plus(
                          c_, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      n_)),
              x_Symbol),
          Condition(Dist(
              Times(Cos(Plus(e, Times(f, x))), Power(Times(
                  Power(a, Subtract(p, C2)), f, Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                  Sqrt(Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))))), CN1)),
              Subst(
                  Integrate(
                      Times(Power(Plus(a, Times(b, x)), Subtract(Plus(m, Times(C1D2, p)), C1D2)),
                          Power(Subtract(a, Times(b, x)), Subtract(Times(C1D2, p), C1D2)), Power(
                              Plus(c, Times(d, x)), n)),
                      x),
                  x, Sin(Plus(e, Times(f, x)))),
              x),
              And(FreeQ(List(a, b, c, d, e, f, m,
                  n), x), EqQ(Subtract(Sqr(a), Sqr(b)),
                      C0),
                  IntegerQ(Times(C1D2, p)), Not(IntegerQ(m))))),
      IIntegrate(2919,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT), p_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_),
                  Power(
                      Plus(
                          c_, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      n_)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandTrig(
                      Power(Times(g,
                          $($s("§cos"), Plus(e, Times(f, x)))), p),
                      Times(Power(Plus(a, Times(b, $($s("§sin"), Plus(e, Times(f, x))))), m), Power(
                          Plus(c, Times(d, $($s("§sin"), Plus(e, Times(f, x))))), n)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, g, n, p), x), EqQ(Subtract(Sqr(a),
                  Sqr(b)), C0), IGtQ(m,
                      C0),
                  Or(IntegerQ(p), IGtQ(n, C0))))),
      IIntegrate(2920,
          Integrate(
              Times(
                  Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                      g_DEFAULT), p_),
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_),
                  Power(
                      Plus(c_,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      n_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(a, m), g, Power(Times(g, Cos(
                          Plus(e, Times(f, x)))), Subtract(p,
                              C1)),
                      Power(Times(f,
                          Power(Plus(C1, Sin(Plus(e, Times(f, x)))), Times(C1D2, Subtract(p, C1))),
                          Power(Subtract(C1, Sin(Plus(e, Times(f, x)))),
                              Times(C1D2, Subtract(p, C1)))),
                          CN1)),
                  Subst(Integrate(Times(
                      Power(Plus(C1, Times(b, x, Power(a, CN1))),
                          Plus(m, Times(C1D2, Subtract(p, C1)))),
                      Power(Subtract(C1, Times(b, x, Power(a, CN1))), Times(C1D2, Subtract(p, C1))),
                      Power(Plus(c, Times(d, x)), n)), x), x, Sin(Plus(e, Times(f, x)))),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, n, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                  IntegerQ(m)))));
}
