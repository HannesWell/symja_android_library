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
class IntRules193 {
  public static IAST RULES =
      List(
          IIntegrate(3861,
              Integrate(
                  Times(Power($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN1),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(Cos(Plus(e, Times(f, x))),
                                  Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                                  Power(Times(a, f), CN1)),
                              x)),
                      Dist(
                          Times(b, Power(Times(C2, a),
                              CN1)),
                          Integrate(
                              Times(
                                  Plus(C1, Sqr(Csc(
                                      Plus(e, Times(f, x))))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3862,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          CN1D2),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(Dist(Power(a, CN1),
                      Integrate(Times(Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), CN1D2)), x),
                      x),
                      Dist(Times(b, Power(Times(a, d), CN1)),
                          Integrate(
                              Times(Sqrt(Times(d, Csc(Plus(e, Times(f, x))))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3863,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Cos(Plus(e, Times(f, x))),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                          Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))), Power(
                              Times(a, d, f, n), CN1)),
                          x),
                      Dist(
                          Power(Times(C2, a, d,
                              n), CN1),
                          Integrate(
                              Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                                  Simp(
                                      Plus(Times(CN1, b, Plus(Times(C2, n), C1)),
                                          Times(C2, a, Plus(n, C1), Csc(Plus(e, Times(f, x)))),
                                          Times(b, Plus(Times(C2, n), C3),
                                              Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(n,
                          CN1),
                      IntegerQ(Times(C2, n))))),
          IIntegrate(3864,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          QQ(3L, 2L))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(a, Cot(Plus(e, Times(f, x))),
                              Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                              Power(Times(d,
                                  Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(f, n), CN1)),
                          x),
                      Dist(Power(Times(C2, d, n), CN1), Integrate(Times(
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                          Simp(Plus(Times(a, b, Subtract(Times(C2, n), C1)),
                              Times(C2, Plus(Times(Sqr(b), n), Times(Sqr(a), Plus(n, C1))),
                                  Csc(Plus(e, Times(f, x)))),
                              Times(a, b, Plus(Times(C2, n), C3), Sqr(Csc(Plus(e, Times(f, x)))))),
                              x),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)), x), x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LeQ(n,
                          CN1),
                      IntegersQ(Times(C2, n))))),
          IIntegrate(3865,
              Integrate(
                  Times(
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
                          Simp(
                              Times(
                                  Power(d, C3), Cot(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(
                                      Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(
                                      Plus(e, Times(f, x)))), Subtract(n,
                                          C3)),
                                  Power(Times(b, f, Subtract(Plus(m, n), C1)), CN1)),
                              x)),
                      Dist(Times(Power(d, C3), Power(Times(b, Subtract(Plus(m, n), C1)), CN1)),
                          Integrate(Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C3)), Simp(
                                  Subtract(
                                      Plus(Times(a, Subtract(n, C3)),
                                          Times(b, Subtract(Plus(m, n), C2),
                                              Csc(Plus(e, Times(f, x))))),
                                      Times(a, Subtract(n, C2), Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, m), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      GtQ(n, C3), Or(IntegerQ(n), IntegersQ(Times(C2, m),
                          Times(C2, n))),
                      Not(IGtQ(m, C2))))),
          IIntegrate(3866,
              Integrate(
                  Times(
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
                              Times(
                                  b, d, Cot(Plus(e,
                                      Times(f, x))),
                                  Power(
                                      Plus(a, Times(b,
                                          Csc(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C1)),
                                  Power(Times(f, Subtract(Plus(m, n), C1)), CN1)),
                              x)),
                      Dist(
                          Times(d, Power(Subtract(Plus(m, n), C1),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b,
                                          Csc(Plus(e, Times(f, x))))),
                                      Subtract(m, C2)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C1)),
                                  Simp(Plus(Times(a, b, Subtract(n, C1)),
                                      Times(
                                          Plus(Times(Sqr(b), Subtract(Plus(m, n), C2)),
                                              Times(Sqr(a), Subtract(Plus(m, n), C1))),
                                          Csc(Plus(e, Times(f, x)))),
                                      Times(a, b, Subtract(Plus(Times(C2, m), n), C2),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      LtQ(C0, m, C2), LtQ(C0, n, C3), NeQ(Subtract(Plus(m, n), C1), C0), Or(
                          IntegerQ(m), IntegersQ(Times(C2, m), Times(C2, n)))))),
          IIntegrate(3867,
              Integrate(
                  Times(
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
                              Times(Sqr(d), Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(
                                      Plus(e, Times(f, x))))), m),
                                  Power(Times(d, Csc(Plus(e, Times(f,
                                      x)))), Subtract(n,
                                          C2)),
                                  Power(Times(f, Subtract(Plus(m, n), C1)), CN1)),
                              x)),
                      Dist(Times(Sqr(d), Power(Times(b, Subtract(Plus(m, n), C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))),
                                      Subtract(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C2)),
                                  Simp(Plus(Times(a, b, Subtract(n, C2)),
                                      Times(Sqr(b), Subtract(Plus(m, n), C2),
                                          Csc(Plus(e, Times(f, x)))),
                                      Times(a, b, m, Sqr(Csc(Plus(e, Times(f, x)))))), x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      LtQ(CN1, m, C2), LtQ(C1, n, C3), NeQ(Subtract(Plus(m, n),
                          C1), C0),
                      Or(IntegerQ(n), IntegersQ(Times(C2, m), Times(C2, n)))))),
          IIntegrate(3868,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          CN1D2),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          QQ(3L, 2L))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(a,
                          Integrate(
                              Times(Sqrt(Plus(a, Times(b, Csc(Plus(e, Times(f, x)))))),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), CN1D2)),
                              x),
                          x),
                      Dist(
                          Times(b, Power(d,
                              CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a,
                                      Times(b, Csc(Plus(e, Times(f, x)))))),
                                  Sqrt(Times(d, Csc(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3869,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Sin(Plus(e, Times(f, x))), n),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), n)),
                      Integrate(
                          Times(Power(Plus(b, Times(a, Sin(Plus(e, Times(f, x))))), m),
                              Power(Power(Sin(Plus(e, Times(f, x))), Plus(m, n)), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, n), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegerQ(m)))),
          IIntegrate(3870,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(d,
                              Csc(Plus(e, Times(f, x)))), n),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m)),
                      x),
                  FreeQ(List(a, b, d, e, f, m, n), x))),
          IIntegrate(3871,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          m_),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sec"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(d, Cos(Plus(e, Times(f, x)))), FracPart(
                              m)),
                          Power(Times(Sec(Plus(e, Times(f, x))), Power(d, CN1)), FracPart(m))),
                      Integrate(
                          Times(
                              Power(Plus(a,
                                  Times(b, Sec(Plus(e, Times(f, x))))), p),
                              Power(Power(Times(Sec(Plus(e, Times(f, x))), Power(d, CN1)), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, m, p), x), Not(IntegerQ(m)), Not(IntegerQ(p))))),
          IIntegrate(3872,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_DEFAULT),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                          Power(Plus(b, Times(a,
                              Sin(Plus(e, Times(f, x))))), m),
                          Power(Power(Sin(Plus(e, Times(f, x))), m), CN1)),
                      x),
                  And(FreeQ(List(a, b, e, f, g, p), x), IntegerQ(m)))),
          IIntegrate(3873,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Power(Times(f,
                              Power(b, Subtract(p, C1))), CN1),
                          Subst(
                              Integrate(Times(
                                  Power(Plus(Negate(a), Times(b, x)), Times(C1D2, Subtract(p, C1))),
                                  Power(Plus(a, Times(b, x)), Plus(m,
                                      Times(C1D2, Subtract(p, C1)))),
                                  Power(Power(x, Plus(p, C1)), CN1)), x),
                              x, Csc(Plus(e, Times(f, x)))),
                          x)),
                  And(FreeQ(List(a, b, e, f, m), x), IntegerQ(Times(C1D2,
                      Subtract(p, C1))), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(3874,
              Integrate(
                  Times(Power($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_DEFAULT),
                      Power(Plus(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_), m_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(Power(f, CN1),
                          Subst(
                              Integrate(
                                  Times(Power(Plus(CN1, x), Times(C1D2, Subtract(p, C1))),
                                      Power(Plus(C1, x), Times(C1D2, Subtract(p, C1))),
                                      Power(Plus(a, Times(b, x)), m), Power(Power(x, Plus(p, C1)),
                                          CN1)),
                                  x),
                              x, Csc(Plus(e, Times(f, x)))),
                          x)),
                  And(FreeQ(List(a, b, e, f, m), x), IntegerQ(Times(C1D2,
                      Subtract(p, C1))), NeQ(Subtract(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(3875,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN2),
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
                          Times(Tan(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m), Power(f,
                                  CN1)),
                          x),
                      Dist(Times(b, m),
                          Integrate(
                              Times(Csc(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))),
                                      Subtract(m, C1))),
                              x),
                          x)),
                  FreeQ(List(a, b, e, f, m), x))),
          IIntegrate(3876,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          p_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Sin(Plus(e, Times(f, x))), FracPart(m)),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), FracPart(m)),
                          Power(Power(Plus(b, Times(a, Sin(Plus(e, Times(f, x))))), FracPart(m)),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(g, Cos(
                                  Plus(e, Times(f, x)))), p),
                              Power(Plus(b, Times(a, Sin(Plus(e, Times(f, x))))),
                                  m),
                              Power(Power(Sin(Plus(e, Times(f, x))), m), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), Or(EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegersQ(Times(C2, m), p))))),
          IIntegrate(3877,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), g_DEFAULT),
                          p_DEFAULT),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Times(g, Cos(Plus(e, Times(f, x)))), p),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m)),
                      x),
                  FreeQ(List(a, b, e, f, g, m, p), x))),
          IIntegrate(3878,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_DEFAULT),
                      Power(
                          Times(g_DEFAULT, $($s("§sec"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(g, IntPart(p)),
                          Power(Times(g,
                              Sec(Plus(e, Times(f, x)))), FracPart(p)),
                          Power(Cos(Plus(e, Times(f, x))), FracPart(p))),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m), Power(Power(
                                  Cos(Plus(e, Times(f, x))), p), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), Not(IntegerQ(p))))),
          IIntegrate(3879, Integrate(Times(
              Power($($s("§cot"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_DEFAULT),
              Power(
                  Plus(Times($($s("§csc"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_),
                  n_DEFAULT)),
              x_Symbol),
              Condition(
                  Dist(Power(Times(Power(a, Subtract(Subtract(m, n), C1)), Power(b, n), d), CN1),
                      Subst(
                          Integrate(
                              Times(Power(Subtract(a, Times(b, x)), Times(C1D2, Subtract(m, C1))),
                                  Power(Plus(a, Times(b, x)), Plus(Times(C1D2, Subtract(m, C1)),
                                      n)),
                                  Power(Power(x, Plus(m, n)), CN1)),
                              x),
                          x, Sin(Plus(c, Times(d, x)))),
                      x),
                  And(FreeQ(List(a, b, c, d), x), IntegerQ(Times(C1D2, Subtract(m,
                      C1))), EqQ(Subtract(Sqr(a),
                          Sqr(b)), C0),
                      IntegerQ(n)))),
          IIntegrate(3880,
              Integrate(
                  Times(Power($($s("§cot"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), m_DEFAULT),
                      Power(Plus(Times($($s("§csc"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                          b_DEFAULT), a_), n_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(Power(Times(d, Power(b, Subtract(m, C1))), CN1),
                          Subst(
                              Integrate(Times(
                                  Power(Plus(Negate(a), Times(b, x)), Times(C1D2, Subtract(m, C1))),
                                  Power(Plus(a, Times(b, x)),
                                      Plus(Times(C1D2, Subtract(m, C1)), n)),
                                  Power(x, CN1)), x),
                              x, Csc(Plus(c, Times(d, x)))),
                          x)),
                  And(FreeQ(List(a, b, c, d, n), x), IntegerQ(Times(C1D2, Subtract(m, C1))),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), Not(IntegerQ(n))))));
}
