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
class IntRules137 {
  public static IAST RULES =
      List(
          IIntegrate(2741,
              Integrate(
                  Times(
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
                              Times(
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), Sqrt(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x))))))),
                              CN1)),
                      Integrate(Power(Cos(Plus(e, Times(f, x))), CN1), x), x),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2742,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(b, Cos(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b,
                              Sin(Plus(e, Times(f, x))))), m),
                          Power(Plus(c,
                              Times(d, Sin(Plus(e, Times(f, x))))), n),
                          Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x),
                      EqQ(Plus(Times(b, c), Times(a,
                          d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      EqQ(Plus(m, n, C1), C0), NeQ(m, Negate(C1D2))))),
          IIntegrate(2743,
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
                  Plus(
                      Simp(
                          Times(b, Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))), n),
                              Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                          x),
                      Dist(Times(Plus(m, n, C1), Power(Times(a, Plus(Times(C2, m), C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x),
                      EqQ(Plus(Times(b, c), Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      ILtQ(Simplify(Plus(m, n, C1)), C0), NeQ(m, Negate(
                          C1D2)),
                      Or(SumSimplerQ(m, C1), Not(SumSimplerQ(n, C1)))))),
          IIntegrate(2744,
              Integrate(
                  Times(
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
                  Plus(
                      Simp(
                          Times(b, Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))), n),
                              Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                          x),
                      Dist(Times(Plus(m, n, C1), Power(Times(a, Plus(Times(C2, m), C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(m, CN1), Not(LtQ(m, n,
                          CN1)),
                      IntegersQ(Times(C2, m), Times(C2, n))))),
          IIntegrate(2745,
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
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(a, IntPart(m)), Power(c, IntPart(m)),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), FracPart(m)),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), FracPart(
                              m)),
                          Power(Power(Cos(Plus(e, Times(f, x))), Times(C2, FracPart(m))), CN1)),
                      Integrate(
                          Times(
                              Power(Cos(Plus(e, Times(f, x))), Times(C2,
                                  m)),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Subtract(n, m))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x),
                      EqQ(Plus(Times(b, c), Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      Or(FractionQ(m), Not(FractionQ(n)))))),
          IIntegrate(2746,
              Integrate(
                  Times(
                      Sqr(Plus(
                          a_DEFAULT, Times(b_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(b), Cos(Plus(e, Times(f, x))),
                                  Power(Times(d, f), CN1)),
                              x)),
                      Dist(Power(d, CN1),
                          Integrate(
                              Times(
                                  Simp(
                                      Subtract(Times(Sqr(a), d),
                                          Times(b, Subtract(Times(b, c), Times(C2, a, d)),
                                              Sin(Plus(e, Times(f, x))))),
                                      x),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                          C0)))),
          IIntegrate(2747,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1),
                              x),
                          x),
                      Dist(Times(d, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(2748,
              Integrate(
                  Times(
                      Power(
                          Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_),
                      Plus(
                          c_, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(Dist(c, Integrate(Power(Times(b, Sin(Plus(e, Times(f, x)))), m), x), x),
                      Dist(Times(d, Power(b, CN1)),
                          Integrate(Power(Times(b, Sin(Plus(e, Times(f, x)))), Plus(m, C1)),
                              x),
                          x)),
                  FreeQ(List(b, c, d, e, f, m), x))),
          IIntegrate(2749,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          c_, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(
                          Times(
                              d, Cos(Plus(e, Times(f,
                                  x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                  m),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), EqQ(
                          Plus(Times(a, d, m), Times(b, c, Plus(m, C1))), C0)))),
          IIntegrate(2750,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Subtract(Times(b, c), Times(a, d)), Cos(Plus(e, Times(f,
                                  x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                  m),
                              Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Plus(Times(a, d, m), Times(b, c, Plus(m, C1))), Power(
                                  Times(a, b, Plus(Times(C2, m), C1)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                              Plus(m, C1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a,
                      d)), C0), EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      LtQ(m, Negate(C1D2))))),
          IIntegrate(2751,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(d, Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Times(f, Plus(m, C1)), CN1)), x)),
                      Dist(
                          Times(
                              Plus(Times(a, d, m), Times(b, c, Plus(m, C1))), Power(Times(b,
                                  Plus(m, C1)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), x), x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x),
                      NeQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), Not(LtQ(m, Negate(C1D2)))))),
          IIntegrate(2752,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(Subtract(Times(b, c), Times(a,
                              d)), Power(b,
                                  CN1)),
                          Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1D2),
                              x),
                          x),
                      Dist(
                          Times(d, Power(b,
                              CN1)),
                          Integrate(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2753,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(d, Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Times(f, Plus(m, C1)), CN1)), x)),
                      Dist(Power(Plus(m, C1), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m, C1)),
                              Simp(Plus(Times(b, d, m), Times(a, c, Plus(m, C1)),
                                  Times(Plus(Times(a, d, m), Times(b, c, Plus(m, C1))),
                                      Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a,
                      d)), C0), NeQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      GtQ(m, C0), IntegerQ(Times(C2, m))))),
          IIntegrate(2754,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Subtract(Times(b, c), Times(a, d)), Cos(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x))))), Plus(m,
                                          C1)),
                                  Power(Times(f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                              x)),
                      Dist(Power(Times(Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Simp(Subtract(Times(Subtract(Times(a, c), Times(b, d)), Plus(m, C1)),
                                  Times(Subtract(Times(b, c), Times(a, d)), Plus(m, C2),
                                      Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a,
                      d)), C0), NeQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      LtQ(m, CN1), IntegerQ(Times(C2, m))))),
          IIntegrate(2755,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(c_, Times(d_DEFAULT, $($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(c, Cos(Plus(e, Times(f, x))),
                          Power(
                              Times(f, Sqrt(Plus(C1, Sin(Plus(e, Times(f, x))))),
                                  Sqrt(Subtract(C1, Sin(Plus(e, Times(f, x)))))),
                              CN1)),
                      Subst(
                          Integrate(
                              Times(Power(Plus(a, Times(b, x)), m),
                                  Sqrt(Plus(C1, Times(d, x, Power(c, CN1)))), Power(
                                      Subtract(C1, Times(d, x, Power(c, CN1))), CN1D2)),
                              x),
                          x, Sin(Plus(e, Times(f, x)))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), Not(IntegerQ(Times(C2, m))), EqQ(
                          Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2756,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(Subtract(Times(b, c), Times(a, d)), Power(b, CN1)), Integrate(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), x),
                          x),
                      Dist(
                          Times(d, Power(b,
                              CN1)),
                          Integrate(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(2757,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          n_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(Power(Plus(a, Times(b, $($s("§sin"), Plus(e, Times(f, x))))), m),
                              Power(Times(d, $($s("§sin"), Plus(e, Times(f, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, n), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), IGtQ(m,
                          C0),
                      RationalQ(n)))),
          IIntegrate(2758,
              Integrate(
                  Times(
                      Sqr($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(Times(b, Cos(Plus(e, Times(f, x))),
                      Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                          m),
                      Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)), x), Dist(
                          Power(Times(Sqr(a), Plus(Times(C2, m), C1)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Subtract(Times(a, m), Times(b, Plus(Times(C2, m), C1),
                                      Sin(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m,
                          Negate(C1D2))))),
          IIntegrate(2759,
              Integrate(
                  Times(
                      Sqr($($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_)),
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
                                  Power(Times(b, f, Plus(m, C2)), CN1)),
                              x)),
                      Dist(
                          Power(Times(b,
                              Plus(m, C2)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Subtract(Times(b, Plus(m,
                                      C1)), Times(a,
                                          Sin(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, m), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      Not(LtQ(m, Negate(C1D2)))))),
          IIntegrate(2760,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Sqr(Plus(
                          c_, Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Subtract(Times(b, c), Times(a, d)), Cos(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                              m),
                          Plus(c, Times(d, Sin(Plus(e, Times(f, x))))),
                          Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)), x),
                      Dist(Power(Times(a, b, Plus(Times(C2, m), C1)), CN1), Integrate(Times(
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                          Simp(Plus(Times(a, c, d, Subtract(m, C1)),
                              Times(b, Plus(Sqr(d), Times(Sqr(c), Plus(m, C1)))),
                              Times(d, Plus(Times(a, d, Subtract(m, C1)), Times(b, c, Plus(m, C2))),
                                  Sin(Plus(e, Times(f, x))))),
                              x)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(m, CN1)))));
}
