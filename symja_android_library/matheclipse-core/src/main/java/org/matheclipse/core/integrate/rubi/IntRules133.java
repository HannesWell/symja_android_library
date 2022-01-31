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
class IntRules133 {
  public static IAST RULES =
      List(
          IIntegrate(2661,
              Integrate(
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(C2,
                          EllipticF(
                              Times(C1D2, C1, Plus(c, Times(CN1, C1D2, Pi),
                                  Times(d, x))),
                              Times(C2, b, Power(Plus(a, b), CN1))),
                          Power(Times(d, Sqrt(Plus(a, b))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      GtQ(Plus(a, b), C0)))),
          IIntegrate(2662,
              Integrate(
                  Power(
                      Plus(
                          a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(C2,
                          EllipticF(
                              Times(C1D2, C1, Plus(c, CPiHalf, Times(d, x))), Times(CN2, b,
                                  Power(Subtract(a, b), CN1))),
                          Power(Times(d, Sqrt(Subtract(a, b))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), GtQ(Subtract(a, b),
                          C0)))),
          IIntegrate(2663,
              Integrate(
                  Power(
                      Plus(
                          a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(Times(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))),
                              Power(Plus(a, b), CN1))),
                          Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1D2)),
                      Integrate(
                          Power(
                              Plus(Times(a, Power(Plus(a, b), CN1)),
                                  Times(b, Sin(Plus(c, Times(d, x))), Power(Plus(a, b), CN1))),
                              CN1D2),
                          x),
                      x),
                  And(FreeQ(List(a, b, c,
                      d), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      Not(GtQ(Plus(a, b), C0))))),
          IIntegrate(2664,
              Integrate(
                  Power(
                      Plus(
                          a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  b, Cos(Plus(c,
                                      Times(d, x))),
                                  Power(Plus(a, Times(b,
                                      Sin(Plus(c, Times(d, x))))), Plus(n,
                                          C1)),
                                  Power(Times(d, Plus(n, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                              x)),
                      Dist(
                          Power(Times(Plus(n, C1),
                              Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), Plus(n, C1)),
                                  Simp(
                                      Subtract(
                                          Times(a, Plus(n, C1)), Times(b, Plus(n, C2),
                                              Sin(Plus(c, Times(d, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(n,
                          CN1),
                      IntegerQ(Times(C2, n))))),
          IIntegrate(2665,
              Integrate(
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Cos(Plus(c,
                              Times(d, x))),
                          Power(
                              Times(
                                  d, Sqrt(Plus(C1, Sin(Plus(c, Times(d, x))))), Sqrt(
                                      Subtract(C1, Sin(Plus(c, Times(d, x)))))),
                              CN1)),
                      Subst(
                          Integrate(
                              Times(Power(Plus(a, Times(b, x)), n),
                                  Power(Times(Sqrt(Plus(C1, x)), Sqrt(Subtract(C1, x))), CN1)),
                              x),
                          x, Sin(Plus(c, Times(d, x)))),
                      x),
                  And(FreeQ(List(a, b, c, d, n), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      Not(IntegerQ(Times(C2, n)))))),
          IIntegrate(2666,
              Integrate(Power(Plus(a_,
                  Times(
                      $($s("§cos"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT, $($s("§sin"),
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                  n_), x_Symbol),
              Condition(
                  Integrate(
                      Power(Plus(a, Times(C1D2, b, Sin(Plus(Times(C2, c), Times(C2, d, x))))),
                          n),
                      x),
                  FreeQ(List(a, b, c, d, n), x))),
          IIntegrate(2667,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(Times(Power(b, p), f), CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(a, x), Plus(m, Times(C1D2, Subtract(p, C1)))), Power(
                                      Subtract(a, x), Times(C1D2, Subtract(p, C1)))),
                              x),
                          x, Times(b, Sin(Plus(e, Times(f, x))))),
                      x),
                  And(FreeQ(List(a, b, e, f, m), x), IntegerQ(Times(C1D2, Subtract(p, C1))),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      Or(GeQ(p, CN1), Not(IntegerQ(Plus(m, C1D2))))))),
          IIntegrate(2668,
              Integrate(
                  Times(Power($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(b, p),
                          f), CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(a,
                                      x), m),
                                  Power(Subtract(Sqr(b), Sqr(x)), Times(C1D2, Subtract(p, C1)))),
                              x),
                          x, Times(b, Sin(Plus(e, Times(f, x))))),
                      x),
                  And(FreeQ(List(a, b, e, f, m), x), IntegerQ(Times(C1D2,
                      Subtract(p, C1))), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(2669,
              Integrate(
                  Times(
                      Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C1)),
                                  Power(Times(f, g, Plus(p, C1)), CN1)),
                              x)),
                      Dist(a, Integrate(Power(Times(g, Cos(Plus(e, Times(f, x)))), p), x), x)),
                  And(FreeQ(List(a, b, e, f, g, p), x),
                      Or(IntegerQ(Times(C2, p)), NeQ(Subtract(Sqr(a), Sqr(b)), C0))))),
          IIntegrate(2670,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(a, Power(g,
                          CN1)), Times(C2,
                              m)),
                      Integrate(
                          Times(
                              Power(Times(g, Cos(
                                  Plus(e, Times(f, x)))), Plus(Times(C2, m),
                                      p)),
                              Power(Power(Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, g), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0), IntegerQ(m),
                      LtQ(p, CN1), GeQ(Plus(Times(C2, m), p), C0)))),
          IIntegrate(2671, Integrate(Times(
              Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT), p_),
              Power(
                  Plus(a_, Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                  m_)),
              x_Symbol),
              Condition(
                  Simp(
                      Times(b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C1)),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                              m),
                          Power(Times(a, f, g, m), CN1)),
                      x),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), EqQ(Simplify(Plus(m, p, C1)),
                          C0),
                      Not(ILtQ(p, C0))))),
          IIntegrate(2672,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              b, Power(Times(g, Cos(
                                  Plus(e, Times(f, x)))), Plus(p, C1)),
                              Power(Plus(a, Times(b,
                                  Sin(Plus(e, Times(f, x))))), m),
                              Power(Times(a, f, g, Simplify(Plus(Times(C2, m), p, C1))), CN1)),
                          x),
                      Dist(
                          Times(
                              Simplify(Plus(m, p, C1)),
                              Power(Times(a, Simplify(Plus(Times(C2, m), p, C1))), CN1)),
                          Integrate(
                              Times(
                                  Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      ILtQ(Simplify(Plus(m, p,
                          C1)), C0),
                      NeQ(Plus(Times(C2, m), p, C1), C0), Not(IGtQ(m, C0))))),
          IIntegrate(2673,
              Integrate(
                  Times(
                      Power(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C1)),
                          Power(Plus(a, Times(b,
                              Sin(Plus(e, Times(f, x))))), Subtract(m,
                                  C1)),
                          Power(Times(f, g, Subtract(m, C1)), CN1)),
                      x),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      EqQ(Subtract(Plus(Times(C2, m), p), C1), C0), NeQ(m, C1)))),
          IIntegrate(2674,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p,
                                      C1)),
                                  Power(
                                      Plus(a, Times(b,
                                          Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Times(f, g, Plus(m, p)), CN1)),
                              x)),
                      Dist(Times(a, Subtract(Plus(Times(C2, m), p), C1), Power(Plus(m, p), CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IGtQ(Simplify(Times(C1D2, Subtract(Plus(Times(C2, m), p), C1))),
                          C0),
                      NeQ(Plus(m, p), C0)))),
          IIntegrate(2675,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(Times(b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C1)),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                              m),
                          Power(Times(a, f, g, Plus(p, C1)), CN1)), x)),
                      Dist(Times(a, Plus(m, p, C1), Power(Times(Sqr(g), Plus(p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p, C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g), x), EqQ(Subtract(Sqr(a), Sqr(
                      b)), C0), GtQ(m, C0), LeQ(p, Times(CN2,
                          m)),
                      IntegersQ(Plus(m, C1D2), Times(C2, p))))),
          IIntegrate(2676,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              CN2, b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p,
                                  C1)),
                              Power(Plus(a, Times(b,
                                  Sin(Plus(e, Times(f, x))))), Subtract(m,
                                      C1)),
                              Power(Times(f, g, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Sqr(b), Subtract(Plus(Times(C2, m),
                                  p), C1),
                              Power(Times(Sqr(g), Plus(p, C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p,
                                      C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C2))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), GtQ(m,
                          C1),
                      LtQ(p, CN1), IntegersQ(Times(C2, m), Times(C2, p))))),
          IIntegrate(2677,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          CN1D2),
                      Sqrt(Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(
                              a, Sqrt(Plus(C1, Cos(
                                  Plus(e, Times(f, x))))),
                              Sqrt(Plus(a,
                                  Times(b, Sin(Plus(e, Times(f, x)))))),
                              Power(
                                  Plus(
                                      a, Times(a, Cos(
                                          Plus(e, Times(f, x)))),
                                      Times(b, Sin(Plus(e, Times(f, x))))),
                                  CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(C1, Cos(
                                      Plus(e, Times(f, x))))),
                                  Power(Times(g, Cos(Plus(e, Times(f, x)))), CN1D2)),
                              x),
                          x),
                      Dist(
                          Times(
                              b, Sqrt(Plus(C1, Cos(
                                  Plus(e, Times(f, x))))),
                              Sqrt(Plus(a,
                                  Times(b, Sin(Plus(e, Times(f, x)))))),
                              Power(
                                  Plus(a, Times(a, Cos(Plus(e, Times(f, x)))),
                                      Times(b, Sin(Plus(e, Times(f, x))))),
                                  CN1)),
                          Integrate(
                              Times(
                                  Sin(Plus(e, Times(f, x))),
                                  Power(
                                      Times(Sqrt(
                                          Times(g, Cos(Plus(e, Times(f, x))))),
                                          Sqrt(Plus(C1, Cos(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2678,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  b, Power(Times(g, Cos(Plus(e, Times(f, x)))), Plus(p,
                                      C1)),
                                  Power(
                                      Plus(a, Times(b,
                                          Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Times(f, g, Plus(m, p)), CN1)),
                              x)),
                      Dist(Times(a, Subtract(Plus(Times(C2, m), p), C1), Power(Plus(m, p), CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a), Sqr(
                      b)), C0), GtQ(m, C0), NeQ(Plus(m,
                          p), C0),
                      IntegersQ(Times(C2, m), Times(C2, p))))),
          IIntegrate(2679,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              g, Power(Times(g, Cos(
                                  Plus(e, Times(f, x)))), Subtract(p,
                                      C1)),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(b, f, Plus(m, p)), CN1)),
                          x),
                      Dist(Times(Sqr(g), Subtract(p, C1), Power(Times(a, Plus(m, p)), CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(m, CN1),
                      GtQ(p, C1), Or(
                          GtQ(m, CN2), EqQ(Plus(Times(C2, m), p, C1), C0), And(EqQ(m, CN2),
                              IntegerQ(p))),
                      NeQ(Plus(m, p), C0), IntegersQ(Times(C2, m), Times(C2, p))))),
          IIntegrate(2680,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(
                                  e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              C2, g, Power(Times(g, Cos(
                                  Plus(e, Times(f, x)))), Subtract(p,
                                      C1)),
                              Power(Plus(a, Times(b,
                                  Sin(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                              Power(Times(b, f, Plus(Times(C2, m), p, C1)), CN1)),
                          x),
                      Dist(
                          Times(Sqr(g), Subtract(p, C1),
                              Power(Times(Sqr(b), Plus(Times(C2, m), p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C2))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0), LeQ(m, CN2),
                      GtQ(p, C1), NeQ(Plus(Times(C2, m), p, C1), C0), Not(ILtQ(Plus(m, p, C1), C0)),
                      IntegersQ(Times(C2, m), Times(C2, p))))));
}
