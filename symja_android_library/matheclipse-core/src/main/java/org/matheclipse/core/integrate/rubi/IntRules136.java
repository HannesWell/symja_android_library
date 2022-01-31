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
class IntRules136 {
  public static IAST RULES =
      List(
          IIntegrate(2721,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(f, CN1),
                      Subst(
                          Integrate(
                              Times(Power(x, p), Power(Plus(a, x), m),
                                  Power(Power(Subtract(Sqr(b), Sqr(x)), Times(C1D2, Plus(p, C1))),
                                      CN1)),
                              x),
                          x, Times(b, Sin(Plus(e, Times(f, x))))),
                      x),
                  And(FreeQ(List(a, b, e, f,
                      m), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      IntegerQ(Times(C1D2, Plus(p, C1)))))),
          IIntegrate(2722,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(
                          Times(g_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(Power(Times(g, Tan(Plus(e, Times(f, x)))), p),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), x),
                      x),
                  And(FreeQ(List(a, b, e, f, g, p), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), IGtQ(m,
                          C0)))),
          IIntegrate(2723,
              Integrate(
                  Times(Power(
                      Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      m_), Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN2)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Subtract(C1, Sqr(Sin(Plus(e, Times(f, x))))),
                          Power(Sin(Plus(e, Times(f, x))), CN2)),
                      x),
                  And(FreeQ(List(a, b, e, f, m), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2724, Integrate(Times(Power(
              Plus(a_, Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))), m_),
              Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN4)), x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Cos(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(C3, a, f, Power(Sin(Plus(e, Times(f, x))), C3)),
                                      CN1)),
                              x)),
                      Negate(
                          Dist(
                              Power(Times(C3, Sqr(a), b, Plus(m, C1)), CN1), Integrate(
                                  Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                      C1)), Simp(
                                          Subtract(
                                              Plus(Times(C6, Sqr(a)),
                                                  Times(CN1, Sqr(b), Subtract(m, C1), Subtract(m,
                                                      C2)),
                                                  Times(a, b, Plus(m, C1),
                                                      Sin(Plus(e, Times(f, x))))),
                                              Times(
                                                  Subtract(Times(C3, Sqr(a)),
                                                      Times(Sqr(b), m, Subtract(m, C2))),
                                                  Sqr(Sin(Plus(e, Times(f, x)))))),
                                          x),
                                      Power(Sin(Plus(e, Times(f, x))), CN3)),
                                  x),
                              x)),
                      Negate(
                          Simp(
                              Times(Plus(Times(C3, Sqr(a)), Times(Sqr(b), Subtract(m, C2))),
                                  Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(
                                      Times(C3, Sqr(a), b, f, Plus(m, C1),
                                          Sqr(Sin(Plus(e, Times(f, x))))),
                                      CN1)),
                              x))),
                  And(FreeQ(List(a, b, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(m, CN1),
                      IntegerQ(Times(C2, m))))),
          IIntegrate(2725,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN4)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Cos(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(Times(C3, a, f, Power(Sin(Plus(e, Times(f, x))), C3)),
                                      CN1)),
                              x)),
                      Negate(
                          Dist(Power(Times(C6, Sqr(a)), CN1),
                              Integrate(
                                  Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                      Simp(
                                          Subtract(
                                              Plus(Times(C8, Sqr(a)),
                                                  Times(CN1, Sqr(b), Subtract(m, C1),
                                                      Subtract(m, C2)),
                                                  Times(a, b, m, Sin(Plus(e, Times(f, x))))),
                                              Times(
                                                  Subtract(Times(C6, Sqr(a)),
                                                      Times(Sqr(b), m, Subtract(m, C2))),
                                                  Sqr(Sin(Plus(e, Times(f, x)))))),
                                          x),
                                      Power(Sin(Plus(e, Times(f, x))), CN2)),
                                  x),
                              x)),
                      Negate(Simp(
                          Times(b, Subtract(m, C2), Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(C6, Sqr(a), f, Sqr(Sin(Plus(e, Times(f, x))))), CN1)),
                          x))),
                  And(FreeQ(List(a, b, e, f, m), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      Not(LtQ(m, CN1)), IntegerQ(Times(C2, m))))),
          IIntegrate(2726,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN6)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Cos(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(Times(C5, a, f, Power(Sin(Plus(e, Times(f, x))), C5)),
                                      CN1)),
                              x)),
                      Dist(Power(Times(ZZ(20L), Sqr(a), Sqr(b), m, Subtract(m, C1)), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Simp(Subtract(
                                      Plus(
                                          Times(ZZ(60L), Power(a, C4)),
                                          Times(CN1, ZZ(44L), Sqr(a), Sqr(b), Subtract(m, C1), m),
                                          Times(Power(b, C4), m, Subtract(m, C1), Subtract(m, C3),
                                              Subtract(m, C4)),
                                          Times(
                                              a, b, m,
                                              Subtract(
                                                  Times(ZZ(20L), Sqr(a)),
                                                  Times(Sqr(b), m, Subtract(m, C1))),
                                              Sin(Plus(e, Times(f, x))))),
                                      Times(Subtract(
                                          Plus(Times(ZZ(40L), Power(a, C4)),
                                              Times(Power(b, C4), m, Subtract(m, C1),
                                                  Subtract(m, C2), Subtract(m, C4))),
                                          Times(ZZ(20L), Sqr(a), Sqr(b), Subtract(m, C1),
                                              Plus(Times(C2, m), C1))),
                                          Sqr(Sin(Plus(e, Times(f, x)))))),
                                      x),
                                  Power(Sin(Plus(e, Times(f, x))), CN4)),
                              x),
                          x),
                      Simp(
                          Times(Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                  C1)),
                              Power(Times(b, f, m, Sqr(Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      Simp(
                          Times(a, Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                  C1)),
                              Power(
                                  Times(
                                      Sqr(b), f, m, Subtract(m, C1), Power(
                                          Sin(Plus(e, Times(f, x))), C3)),
                                  CN1)),
                          x),
                      Negate(
                          Simp(Times(b, Subtract(m, C4), Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(ZZ(20L), Sqr(a), f, Power(Sin(Plus(e, Times(f, x))), C4)),
                                  CN1)),
                              x))),
                  And(FreeQ(List(a, b, e, f, m), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), NeQ(m,
                          C1),
                      IntegerQ(Times(C2, m))))),
          IIntegrate(2727,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Times(g_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(a, Power(Subtract(Sqr(a), Sqr(b)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Times(g,
                                      Tan(Plus(e, Times(f, x)))), p),
                                  Power(Sin(Plus(e, Times(f, x))), CN2)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(b, g, Power(Subtract(Sqr(a), Sqr(b)),
                                  CN1)),
                              Integrate(
                                  Times(
                                      Power(Times(g, Tan(
                                          Plus(e, Times(f, x)))), Subtract(p,
                                              C1)),
                                      Power(Cos(Plus(e, Times(f, x))), CN1)),
                                  x),
                              x)),
                      Negate(
                          Dist(Times(Sqr(a), Sqr(g), Power(Subtract(Sqr(a), Sqr(b)), CN1)),
                              Integrate(
                                  Times(Power(Times(g, Tan(Plus(e, Times(f, x)))), Subtract(p, C2)),
                                      Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, e, f,
                      g), x), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      IntegersQ(Times(C2, p)), GtQ(p, C1)))),
          IIntegrate(2728,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(Times(g_DEFAULT, $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Times(g, Tan(Plus(e, Times(f, x)))), p),
                                  Power(Cos(Plus(e, Times(f, x))), CN2)),
                              x),
                          x),
                      Negate(
                          Dist(Times(b, Power(Times(Sqr(a), g), CN1)),
                              Integrate(
                                  Times(
                                      Power(Times(g, Tan(Plus(e, Times(f, x)))), Plus(p,
                                          C1)),
                                      Power(Cos(Plus(e, Times(f, x))), CN1)),
                                  x),
                              x)),
                      Negate(
                          Dist(
                              Times(Subtract(Sqr(a), Sqr(b)), Power(Times(Sqr(a), Sqr(g)),
                                  CN1)),
                              Integrate(
                                  Times(Power(Times(g, Tan(Plus(e, Times(f, x)))), Plus(p, C2)),
                                      Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(
                      b)), C0), IntegersQ(Times(C2,
                          p)),
                      LtQ(p, CN1)))),
          IIntegrate(2729,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Sqrt(Times(g_DEFAULT, $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Cos(Plus(e, Times(f, x)))),
                          Sqrt(Times(g,
                              Tan(Plus(e, Times(f, x))))),
                          Power(Sin(Plus(e, Times(f, x))), CN1D2)),
                      Integrate(
                          Times(Sqrt(Sin(Plus(e, Times(f, x)))),
                              Power(
                                  Times(
                                      Sqrt(Cos(Plus(e, Times(f, x)))), Plus(a,
                                          Times(b, Sin(Plus(e, Times(f, x)))))),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2730,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(Times(g_, $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqrt(Sin(Plus(e, Times(f, x)))),
                          Power(
                              Times(Sqrt(Cos(Plus(e, Times(f, x)))),
                                  Sqrt(Times(g, Tan(Plus(e, Times(f, x)))))),
                              CN1)),
                      Integrate(
                          Times(Sqrt(Cos(Plus(e, Times(f, x)))),
                              Power(
                                  Times(
                                      Sqrt(Sin(Plus(e, Times(f, x)))), Plus(a,
                                          Times(b, Sin(Plus(e, Times(f, x)))))),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2731,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Sin(Plus(e, Times(f, x))), p),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(
                                  Power(Subtract(C1, Sqr(Sin(Plus(e, Times(f, x))))),
                                      Times(C1D2, p)),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), IntegersQ(m,
                          Times(C1D2, p))))),
          IIntegrate(2732,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(Times(g_DEFAULT, $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), Power(Times(g,
                              Tan(Plus(e, Times(f, x)))),
                              p)),
                      x),
                  FreeQ(List(a, b, e, f, g, m, p), x))),
          IIntegrate(2733,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cot"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT,
                                  x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(g, Times(C2, IntPart(p))),
                      Power(Times(g, Cot(Plus(e, Times(f, x)))), FracPart(p)),
                      Power(Times(g, Tan(Plus(e, Times(f, x)))), FracPart(p))),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Power(Times(g, Tan(Plus(e, Times(f, x)))), p), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), Not(IntegerQ(p))))),
          IIntegrate(2734,
              Integrate(Times(
                  Plus(a_, Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                  Plus(c_DEFAULT, Times(d_DEFAULT,
                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(C1D2, Plus(Times(C2, a, c), Times(b, d)), x), x),
                      Negate(
                          Simp(
                              Times(Plus(Times(b, c), Times(a, d)), Cos(Plus(e, Times(f, x))),
                                  Power(f, CN1)),
                              x)),
                      Negate(
                          Simp(
                              Times(
                                  b, d, Cos(Plus(e, Times(f, x))), Sin(Plus(e, Times(f, x))), Power(
                                      Times(C2, f), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                          C0)))),
          IIntegrate(2735,
              Integrate(
                  Times(
                      Plus(
                          a_DEFAULT, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(Times(b, x, Power(d, CN1)), x),
                      Dist(Times(Subtract(Times(b, c), Times(a, d)), Power(d, CN1)),
                          Integrate(Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                          C0)))),
          IIntegrate(2736,
              Integrate(
                  Times(
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
                  Dist(
                      Times(Power(a, m), Power(c,
                          m)),
                      Integrate(
                          Times(
                              Power(Cos(Plus(e, Times(f, x))), Times(C2, m)), Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))),
                                  Subtract(n, m))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      IntegerQ(m),
                      Not(And(IntegerQ(n), Or(And(LtQ(m, C0), GtQ(n, C0)), LtQ(C0, n, m),
                          LtQ(m, n, C0))))))),
          IIntegrate(2737,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          a, c, Cos(Plus(e,
                              Times(f, x))),
                          Power(
                              Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), Sqrt(
                                  Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))),
                              CN1)),
                      Integrate(
                          Times(
                              Cos(Plus(e,
                                  Times(f, x))),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c),
                      Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(2738,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(CN2, b, Cos(Plus(e, Times(f, x))),
                          Power(Plus(c,
                              Times(d, Sin(Plus(e, Times(f, x))))), n),
                          Power(
                              Times(
                                  f, Plus(Times(C2, n), C1), Sqrt(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x))))))),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(n, Negate(C1D2))))),
          IIntegrate(2739,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_,
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
                  Subtract(
                      Simp(
                          Times(
                              CN2, b, Cos(Plus(e,
                                  Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m, C1)),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))),
                                  n),
                              Power(Times(f, Plus(Times(C2, n), C1)), CN1)),
                          x),
                      Dist(
                          Times(b, Subtract(Times(C2, m), C1),
                              Power(Times(d, Plus(Times(C2, n), C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c), Times(a, d)),
                      C0), EqQ(Subtract(Sqr(a), Sqr(b)), C0), IGtQ(Subtract(m, C1D2), C0),
                      LtQ(n, CN1), Not(And(ILtQ(Plus(m,
                          n), C0), GtQ(Plus(Times(C2, m), n, C1),
                              C0)))))),
          IIntegrate(2740,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(Plus(c_,
                          Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(
                          Times(
                              b, Cos(Plus(e, Times(f,
                                  x))),
                              Power(Plus(a, Times(b,
                                  Sin(Plus(e, Times(f, x))))), Subtract(m,
                                      C1)),
                              Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))), n),
                              Power(Times(f, Plus(m, n)), CN1)),
                          x)),
                      Dist(Times(a, Subtract(Times(C2, m), C1), Power(Plus(m, n), CN1)),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m, C1)),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), IGtQ(Subtract(m, C1D2), C0),
                      Not(LtQ(n, CN1)), Not(And(IGtQ(Subtract(n, C1D2), C0), LtQ(n, m))),
                      Not(And(ILtQ(Plus(m, n), C0), GtQ(Plus(Times(C2, m), n, C1), C0)))))));
}
