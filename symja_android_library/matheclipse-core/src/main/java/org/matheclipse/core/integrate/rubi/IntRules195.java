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
class IntRules195 {
  public static IAST RULES =
      List(
          IIntegrate(3901,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sec"),
                                  Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          n_DEFAULT),
                      Power(
                          Times(
                              e_DEFAULT, Power($($s("§tan"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                                  p_)),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(e, Power(Tan(Plus(c, Times(d, x))),
                              p)), m),
                          Power(Power(Times(e, Tan(Plus(c, Times(d, x)))), Times(m, p)), CN1)),
                      Integrate(
                          Times(
                              Power(Times(e, Tan(Plus(c, Times(d, x)))), Times(m,
                                  p)),
                              Power(Plus(a, Times(b, Sec(Plus(c, Times(d, x))))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(3902,
              Integrate(
                  Times(
                      Power(
                          Times(Power($($s("§cot"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_),
                              e_DEFAULT),
                          m_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(e, Power(Cot(Plus(c, Times(d, x))), p)), m), Power(
                          Power(Times(e, Cot(Plus(c, Times(d, x)))), Times(m, p)), CN1)),
                      Integrate(
                          Times(
                              Power(Times(e, Cot(
                                  Plus(c, Times(d, x)))), Times(m,
                                      p)),
                              Power(Plus(a, Times(b, Csc(Plus(c, Times(d, x))))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(3903,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_)),
                  x_Symbol),
              Condition(
                  Dist(Power(c, n),
                      Integrate(
                          ExpandTrig(
                              Power(
                                  Plus(C1, Times(d, $($s("§csc"), Plus(e, Times(f, x))),
                                      Power(c, CN1))),
                                  n),
                              Power(Plus(a, Times(b, $($s("§csc"), Plus(e, Times(f, x))))), m), x),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), IGtQ(m, C0), ILtQ(n, C0), LtQ(Plus(m, n),
                          C2)))),
          IIntegrate(3904,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT), c_),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(CN1, a,
                          c), m),
                      Integrate(
                          Times(
                              Power(Cot(Plus(e,
                                  Times(f, x))), Times(C2,
                                      m)),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), Subtract(n, m))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      IntegerQ(m), RationalQ(n), Not(And(IntegerQ(n), GtQ(Subtract(m, n), C0)))))),
          IIntegrate(3905,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT), c_),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(CN1, a, c), Plus(m, C1D2)), Cot(Plus(e,
                              Times(f, x))),
                          Power(
                              Times(
                                  Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f,
                                      x)))))),
                                  Sqrt(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))))),
                              CN1)),
                      Integrate(Power(Cot(Plus(e, Times(f, x))), Times(C2, m)), x), x),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(b, c),
                      Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      IntegerQ(Plus(m, C1D2))))),
          IIntegrate(3906,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              C2, a, c, Cot(Plus(e,
                                  Times(f, x))),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), Subtract(n, C1)),
                              Power(
                                  Times(f, Subtract(Times(C2, n), C1),
                                      Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))))),
                                  CN1)),
                          x),
                      Dist(c,
                          Integrate(
                              Times(Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))),
                                      Subtract(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c),
                      Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      GtQ(n, C1D2)))),
          IIntegrate(3907,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(CN2, a, Cot(Plus(e, Times(f, x))),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n), Power(
                                  Times(f, Plus(
                                      Times(C2, n), C1),
                                      Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))))),
                                  CN1)),
                          x),
                      Dist(Power(c, CN1),
                          Integrate(Times(Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), Plus(n, C1))), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c), Times(a,
                      d)), C0), EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      LtQ(n, Negate(C1D2))))),
          IIntegrate(3908,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          QQ(3L, 2L)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(CN4, Sqr(a), Cot(Plus(e, Times(f, x))),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n),
                              Power(
                                  Times(f, Plus(Times(C2, n), C1),
                                      Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))))),
                                  CN1)),
                          x),
                      Dist(
                          Times(a, Power(c,
                              CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a,
                                      Times(b, Csc(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), LtQ(n, Negate(C1D2))))),
          IIntegrate(3909,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          QQ(3L, 2L)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(CN2, Sqr(a), Cot(Plus(e, Times(f, x))),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n), Power(
                                  Times(f, Plus(
                                      Times(C2, n), C1),
                                      Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))))),
                                  CN1)),
                          x),
                      Dist(a,
                          Integrate(
                              Times(
                                  Sqrt(Plus(a, Times(b,
                                      Csc(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), EqQ(Plus(Times(b, c), Times(a,
                      d)), C0), EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      Not(LeQ(n, Negate(C1D2)))))),
          IIntegrate(3910,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          QQ(5L, 2L)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              CN8, Power(a, C3), Cot(Plus(e, Times(f,
                                  x))),
                              Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), n),
                              Power(
                                  Times(f, Plus(Times(C2, n), C1),
                                      Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))))),
                                  CN1)),
                          x),
                      Dist(Times(Sqr(a), Power(c, CN2)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))), Plus(n, C2))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c), Times(a,
                      d)), C0), EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      LtQ(n, Negate(C1D2))))),
          IIntegrate(3911,
              Integrate(
                  Times(Power(
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_),
                      m_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  d_DEFAULT),
                              c_),
                          n_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(a, c, Cot(Plus(e, Times(f, x))),
                              Power(
                                  Times(f, Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                                      Sqrt(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))))),
                                  CN1)),
                          Subst(Integrate(Times(Power(Plus(b, Times(a, x)), Subtract(m, C1D2)),
                              Power(Plus(d, Times(c, x)),
                                  Subtract(n, C1D2)),
                              Power(Power(x, Plus(m, n)), CN1)), x), x, Sin(
                                  Plus(e, Times(f, x)))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), IntegerQ(Subtract(m,
                          C1D2)),
                      EqQ(Plus(m, n), C0)))),
          IIntegrate(3912,
              Integrate(
                  Times(Power(
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_),
                      m_DEFAULT),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          c_), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(a, c, Cot(Plus(e, Times(f, x))),
                          Power(Times(f, Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                              Sqrt(Plus(c, Times(d, Csc(Plus(e, Times(f, x))))))), CN1)),
                      Subst(
                          Integrate(
                              Times(Power(Plus(a, Times(b, x)), Subtract(m, C1D2)),
                                  Power(Plus(c, Times(d, x)), Subtract(n, C1D2)), Power(x, CN1)),
                              x),
                          x, Csc(Plus(e, Times(f, x)))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), EqQ(Plus(Times(b, c), Times(a, d)),
                      C0), EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3913,
              Integrate(
                  Times(
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_),
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          c_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(a, c,
                          x), x),
                      Dist(Times(b, d), Integrate(Sqr(Csc(Plus(e, Times(f, x)))), x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(3914,
              Integrate(
                  Times(
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_),
                      Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          c_)),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(a, c, x), x),
                      Dist(Times(b, d), Integrate(Sqr(Csc(Plus(e, Times(f, x)))),
                          x), x),
                      Dist(
                          Plus(Times(b, c), Times(a,
                              d)),
                          Integrate(Csc(Plus(e, Times(f, x))), x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), NeQ(Plus(Times(b, c), Times(a, d)),
                          C0)))),
          IIntegrate(3915,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_)),
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          c_)),
                  x_Symbol),
              Condition(
                  Plus(Dist(c, Integrate(Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))), x), x),
                      Dist(d,
                          Integrate(Times(Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                              Csc(Plus(e, Times(f, x)))), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3916,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_)),
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          c_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(a, c),
                          Integrate(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))),
                              CN1D2), x),
                          x),
                      Integrate(
                          Times(Csc(Plus(e, Times(f, x))),
                              Plus(Times(b, c), Times(a, d), Times(b, d, Csc(
                                  Plus(e, Times(f, x))))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(3917,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_),
                      Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          c_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  b, d, Cot(Plus(e,
                                      Times(f, x))),
                                  Power(
                                      Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Subtract(m,
                                          C1)),
                                  Power(Times(f, m), CN1)),
                              x)),
                      Dist(Power(m, CN1), Integrate(Times(
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Subtract(m, C1)),
                          Simp(Plus(Times(a, c, m),
                              Times(Plus(Times(b, c, m), Times(a, d, Subtract(Times(C2, m), C1))),
                                  Csc(Plus(e, Times(f, x))))),
                              x)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), GtQ(m, C1), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      IntegerQ(Times(C2, m))))),
          IIntegrate(3918,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_),
                      Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          c_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  b, d, Cot(Plus(e,
                                      Times(f, x))),
                                  Power(
                                      Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Subtract(m,
                                          C1)),
                                  Power(Times(f, m), CN1)),
                              x)),
                      Dist(Power(m, CN1), Integrate(Times(
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Subtract(m, C2)),
                          Simp(Plus(Times(Sqr(a), c, m),
                              Times(Plus(Times(Sqr(b), d, Subtract(m, C1)), Times(C2, a, b, c, m),
                                  Times(Sqr(a), d, m)), Csc(Plus(e, Times(f, x)))),
                              Times(b,
                                  Plus(Times(b, c, m), Times(a, d, Subtract(Times(C2, m), C1))),
                                  Sqr(Csc(Plus(e, Times(f, x)))))),
                              x)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                      C0), GtQ(m, C1), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegerQ(Times(C2, m))))),
          IIntegrate(3919,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1),
                      Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          c_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(c, x,
                          Power(a, CN1)), x),
                      Dist(
                          Times(Subtract(Times(b, c), Times(a, d)), Power(a,
                              CN1)),
                          Integrate(
                              Times(
                                  Csc(Plus(e, Times(f,
                                      x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                          C0)))),
          IIntegrate(3920,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2),
                      Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          c_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(c, Power(a, CN1)),
                          Integrate(Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))), x), x),
                      Dist(Times(Subtract(Times(b, c), Times(a, d)), Power(a, CN1)),
                          Integrate(Times(Csc(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))));
}
