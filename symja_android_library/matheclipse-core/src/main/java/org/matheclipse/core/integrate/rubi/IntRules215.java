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
class IntRules215 {
  public static IAST RULES =
      List(
          IIntegrate(4301,
              Integrate(
                  Times(
                      $($s("§cos"), Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_))),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(C2, Sin(Plus(a, Times(b, x))),
                              Power(Times(g, Sin(Plus(c, Times(d, x)))),
                                  p),
                              Power(Times(d, Plus(Times(C2, p), C1)), CN1)),
                          x),
                      Dist(
                          Times(C2, p, g, Power(Plus(Times(C2, p), C1),
                              CN1)),
                          Integrate(
                              Times(
                                  Sin(Plus(a,
                                      Times(b, x))),
                                  Power(Times(g, Sin(Plus(c, Times(d, x)))), Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, g), x), EqQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Times(d,
                          Power(b, CN1)), C2),
                      Not(IntegerQ(p)), GtQ(p, C0), IntegerQ(Times(C2, p))))),
          IIntegrate(4302,
              Integrate(
                  Times(
                      $($s("§sin"), Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_))),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(CN2, Cos(Plus(a, Times(b, x))),
                              Power(Times(g, Sin(Plus(c, Times(d, x)))), p),
                              Power(Times(d, Plus(Times(C2, p), C1)), CN1)),
                          x),
                      Dist(Times(C2, p, g, Power(Plus(Times(C2, p), C1), CN1)),
                          Integrate(Times(Cos(Plus(a, Times(b, x))),
                              Power(Times(g, Sin(Plus(c, Times(d, x)))), Subtract(p, C1))), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, g), x), EqQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Times(d,
                          Power(b, CN1)), C2),
                      Not(IntegerQ(p)), GtQ(p, C0), IntegerQ(Times(C2, p))))),
          IIntegrate(4303,
              Integrate(
                  Times(
                      $($s("§cos"), Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_))),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Cos(Plus(a, Times(b, x))),
                              Power(Times(g, Sin(
                                  Plus(c, Times(d, x)))), Plus(p,
                                      C1)),
                              Power(Times(C2, b, g, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(Plus(Times(C2, p), C3), Power(Times(C2, g, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(Sin(Plus(a, Times(b, x))), Power(
                                  Times(g, Sin(Plus(c, Times(d, x)))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, g), x), EqQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Times(d,
                          Power(b, CN1)), C2),
                      Not(IntegerQ(p)), LtQ(p, CN1), IntegerQ(Times(C2, p))))),
          IIntegrate(4304,
              Integrate(
                  Times(
                      $($s("§sin"), Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_))),
                      Power(Times(g_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sin(Plus(a, Times(b, x))),
                                  Power(Times(g, Sin(Plus(c, Times(d, x)))), Plus(p,
                                      C1)),
                                  Power(Times(C2, b, g, Plus(p, C1)), CN1)),
                              x)),
                      Dist(
                          Times(Plus(Times(C2, p), C3), Power(Times(C2, g, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Cos(Plus(a,
                                      Times(b, x))),
                                  Power(Times(g, Sin(Plus(c, Times(d, x)))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, g), x), EqQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Times(d,
                          Power(b, CN1)), C2),
                      Not(IntegerQ(p)), LtQ(p, CN1), IntegerQ(Times(C2, p))))),
          IIntegrate(4305,
              Integrate(
                  Times(
                      $($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT,
                          x_))),
                      Power($($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(
                              ArcSin(
                                  Subtract(Cos(Plus(a, Times(b, x))), Sin(Plus(a, Times(b, x))))),
                              Power(d, CN1)), x)),
                      Simp(
                          Times(Log(Plus(Cos(Plus(a, Times(b, x))), Sin(Plus(a, Times(b, x))),
                              Sqrt(Sin(Plus(c, Times(d, x)))))), Power(d, CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)),
                          C2)))),
          IIntegrate(4306,
              Integrate(
                  Times(
                      $($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT,
                          x_))),
                      Power($($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(ArcSin(
                                  Subtract(Cos(Plus(a, Times(b, x))), Sin(Plus(a, Times(b, x))))),
                                  Power(d, CN1)),
                              x)),
                      Simp(
                          Times(Log(Plus(Cos(Plus(a, Times(b, x))), Sin(Plus(a, Times(b, x))),
                              Sqrt(Sin(Plus(c, Times(d, x)))))), Power(d, CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)),
                          C2)))),
          IIntegrate(4307,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(a_DEFAULT, Times(b_DEFAULT, x_))), CN1),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(Times(C2, g),
                      Integrate(
                          Times(
                              Sin(Plus(a, Times(b, x))), Power(Times(g, Sin(Plus(c, Times(d, x)))),
                                  Subtract(p, C1))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, g, p), x), EqQ(Subtract(Times(b, c), Times(a,
                      d)), C0), EqQ(Times(d,
                          Power(b, CN1)), C2),
                      Not(IntegerQ(p)), IntegerQ(Times(C2, p))))),
          IIntegrate(4308,
              Integrate(
                  Times(Power($($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))), CN1),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(Times(C2, g),
                      Integrate(
                          Times(
                              Cos(Plus(a,
                                  Times(b, x))),
                              Power(Times(g, Sin(Plus(c, Times(d, x)))), Subtract(p, C1))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, g, p), x), EqQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)),
                          C2),
                      Not(IntegerQ(p)), IntegerQ(Times(C2, p))))),
          IIntegrate(4309,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              e_DEFAULT),
                          m_DEFAULT),
                      Power(Times(g_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(g, Sin(Plus(c, Times(d, x)))), p),
                          Power(
                              Times(Power(Times(e, Cos(Plus(a, Times(b, x)))), p),
                                  Power(Sin(Plus(a, Times(b, x))), p)),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(e, Cos(Plus(a, Times(b, x)))), Plus(m,
                                  p)),
                              Power(Sin(Plus(a, Times(b, x))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, g, m, p), x),
                      EqQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      EqQ(Times(d, Power(b, CN1)), C2), Not(IntegerQ(p))))),
          IIntegrate(4310,
              Integrate(
                  Times(
                      Power(
                          Times(f_DEFAULT, $($s("§sin"),
                              Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                          n_DEFAULT),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(g, Sin(Plus(c, Times(d, x)))), p),
                          Power(
                              Times(
                                  Power(Cos(Plus(a, Times(b, x))), p), Power(
                                      Times(f, Sin(Plus(a, Times(b, x)))), p)),
                              CN1)),
                      Integrate(Times(Power(Cos(Plus(a, Times(b, x))), p),
                          Power(Times(f, Sin(Plus(a, Times(b, x)))), Plus(n, p))), x),
                      x),
                  And(FreeQ(List(a, b, c, d, f, g, n, p), x),
                      EqQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      EqQ(Times(d, Power(b, CN1)), C2), Not(IntegerQ(p))))),
          IIntegrate(4311,
              Integrate(
                  Times(
                      Sqr($($s("§cos"), Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_)))),
                      Sqr($($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                      Power(Times(g_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(C1D4, Integrate(Power(Times(g, Sin(Plus(c, Times(d, x)))), p),
                          x), x),
                      Dist(C1D4,
                          Integrate(
                              Times(
                                  Sqr(Cos(Plus(c, Times(d, x)))), Power(
                                      Times(g, Sin(Plus(c, Times(d, x)))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, g), x), EqQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)),
                          C2),
                      IGtQ(Times(C1D2, p), C0)))),
          IIntegrate(4312,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              e_DEFAULT),
                          m_DEFAULT),
                      Power(Times(f_DEFAULT, $($s("§sin"),
                          Plus(a_DEFAULT, Times(b_DEFAULT, x_)))), n_DEFAULT),
                      Power($($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(C2, p), Power(Times(Power(e, p), Power(f, p)),
                          CN1)),
                      Integrate(
                          Times(
                              Power(Times(e, Cos(Plus(a, Times(b, x)))), Plus(m,
                                  p)),
                              Power(Times(f, Sin(Plus(a, Times(b, x)))), Plus(n, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)),
                          C2),
                      IntegerQ(p)))),
          IIntegrate(4313,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              e_DEFAULT),
                          m_DEFAULT),
                      Power(Times(f_DEFAULT,
                          $($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_)))), n_DEFAULT),
                      Power(Times(g_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(e, Power(Times(e, Cos(Plus(a, Times(b, x)))), Subtract(m, C1)),
                          Power(Times(f, Sin(
                              Plus(a, Times(b, x)))), Plus(n,
                                  C1)),
                          Power(Times(g,
                              Sin(Plus(c, Times(d, x)))), p),
                          Power(Times(b, f, Plus(n, p, C1)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)), C2),
                      Not(IntegerQ(p)), EqQ(Plus(m, p, C1), C0)))),
          IIntegrate(4314,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              f_DEFAULT),
                          n_),
                      Power(Times(e_DEFAULT, $($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                          m_),
                      Power(Times(g_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Negate(Simp(Times(e, Power(Times(e, Sin(Plus(a, Times(b, x)))), Subtract(m, C1)),
                      Power(Times(f, Cos(Plus(a, Times(b, x)))), Plus(n, C1)),
                      Power(Times(g, Sin(Plus(c, Times(d, x)))),
                          p),
                      Power(Times(b, f, Plus(n, p, C1)), CN1)), x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      EqQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      EqQ(Times(d,
                          Power(b, CN1)), C2),
                      Not(IntegerQ(p)), EqQ(Plus(m, p, C1), C0)))),
          IIntegrate(4315,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              e_DEFAULT),
                          m_DEFAULT),
                      Power(Times(f_DEFAULT, $($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                          n_DEFAULT),
                      Power(Times(g_DEFAULT, $($s("§sin"), Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(
                          Times(Power(Times(e, Cos(Plus(a, Times(b, x)))), Plus(m, C1)),
                              Power(Times(f, Sin(Plus(a, Times(b, x)))), Plus(n, C1)),
                              Power(Times(g,
                                  Sin(Plus(c, Times(d, x)))), p),
                              Power(Times(b, e, f, Plus(m, p, C1)), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)), C2),
                      Not(IntegerQ(p)), EqQ(Plus(m, n, Times(C2, p), C2), C0),
                      NeQ(Plus(m, p, C1), C0)))),
          IIntegrate(4316,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              e_DEFAULT),
                          m_),
                      Power(
                          Times(f_DEFAULT,
                              $($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                          n_),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Sqr(e), Power(Times(e, Cos(Plus(a, Times(b, x)))), Subtract(m, C2)),
                              Power(Times(f, Sin(Plus(a,
                                  Times(b, x)))), n),
                              Power(Times(g, Sin(Plus(c, Times(d, x)))), Plus(p,
                                  C1)),
                              Power(Times(C2, b, g, Plus(n, p, C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Power(e, C4), Subtract(Plus(m, p),
                                  C1),
                              Power(Times(C4, Sqr(g), Plus(n, p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(e, Cos(Plus(a, Times(b, x)))), Subtract(m, C4)),
                                  Power(Times(f, Sin(Plus(a, Times(b, x)))), n),
                                  Power(Times(g, Sin(Plus(c, Times(d, x)))), Plus(p, C2))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, n), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)), C2),
                      Not(IntegerQ(p)), GtQ(m, C3), LtQ(p, CN1), NeQ(Plus(n, p,
                          C1), C0),
                      IntegersQ(Times(C2, m), Times(C2, n), Times(C2, p))))),
          IIntegrate(4317,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              f_DEFAULT),
                          n_),
                      Power(
                          Times(e_DEFAULT,
                              $($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                          m_),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(e),
                                  Power(Times(e, Sin(Plus(a, Times(b, x)))), Subtract(m, C2)),
                                  Power(Times(f, Cos(Plus(a, Times(b, x)))), n),
                                  Power(Times(g, Sin(
                                      Plus(c, Times(d, x)))), Plus(p,
                                          C1)),
                                  Power(Times(C2, b, g, Plus(n, p, C1)), CN1)),
                              x)),
                      Dist(
                          Times(
                              Power(e, C4), Subtract(Plus(m,
                                  p), C1),
                              Power(Times(C4, Sqr(g), Plus(n, p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(e, Sin(Plus(a, Times(b, x)))), Subtract(m, C4)),
                                  Power(Times(f, Cos(Plus(a, Times(b, x)))), n),
                                  Power(Times(g, Sin(Plus(c, Times(d, x)))), Plus(p, C2))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, n), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Times(d, Power(b,
                          CN1)), C2),
                      Not(IntegerQ(p)), GtQ(m, C3), LtQ(p, CN1), NeQ(Plus(n, p, C1), C0),
                      IntegersQ(Times(C2, m), Times(C2, n), Times(C2, p))))),
          IIntegrate(4318,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              e_DEFAULT),
                          m_),
                      Power(
                          Times(f_DEFAULT, $($s("§sin"),
                              Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                          n_DEFAULT),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(Times(e, Cos(Plus(a, Times(b,
                                  x)))), m),
                              Power(Times(f, Sin(Plus(a,
                                  Times(b, x)))), n),
                              Power(Times(g, Sin(Plus(c, Times(d, x)))), Plus(p, C1)),
                              Power(Times(C2, b, g, Plus(n, p, C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Sqr(e), Plus(m, n, Times(C2, p),
                                  C2),
                              Power(Times(C4, Sqr(g), Plus(n, p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(e, Cos(Plus(a, Times(b, x)))), Subtract(m, C2)),
                                  Power(Times(f, Sin(Plus(a, Times(b, x)))), n),
                                  Power(Times(g, Sin(Plus(c, Times(d, x)))), Plus(p, C2))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, n), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)), C2),
                      Not(IntegerQ(p)), GtQ(m, C1), LtQ(p, CN1),
                      NeQ(Plus(m, n, Times(C2,
                          p), C2), C0),
                      NeQ(Plus(n, p, C1), C0), IntegersQ(Times(C2, m), Times(C2, n),
                          Times(C2, p)),
                      Or(LtQ(p, CN2), EqQ(m, C2), EqQ(m, C3))))),
          IIntegrate(4319,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              f_DEFAULT),
                          n_DEFAULT),
                      Power(
                          Times(e_DEFAULT,
                              $($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                          m_),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Times(e, Sin(Plus(a, Times(b, x)))), m),
                                  Power(Times(f, Cos(Plus(a, Times(b, x)))), n),
                                  Power(Times(g, Sin(
                                      Plus(c, Times(d, x)))), Plus(p,
                                          C1)),
                                  Power(Times(C2, b, g, Plus(n, p, C1)), CN1)),
                              x)),
                      Dist(
                          Times(
                              Sqr(e), Plus(m, n, Times(C2, p), C2),
                              Power(Times(C4, Sqr(g), Plus(n, p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(e, Sin(Plus(a, Times(b, x)))), Subtract(m, C2)),
                                  Power(Times(f, Cos(Plus(a, Times(b, x)))), n),
                                  Power(Times(g, Sin(Plus(c, Times(d, x)))), Plus(p, C2))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, n), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)), C2),
                      Not(IntegerQ(p)), GtQ(m, C1), LtQ(p, CN1),
                      NeQ(Plus(m, n, Times(C2,
                          p), C2), C0),
                      NeQ(Plus(n, p, C1), C0), IntegersQ(Times(C2, m), Times(C2, n),
                          Times(C2, p)),
                      Or(LtQ(p, CN2), EqQ(m, C2), EqQ(m, C3))))),
          IIntegrate(4320,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              e_DEFAULT),
                          m_),
                      Power(
                          Times(f_DEFAULT,
                              $($s("§sin"), Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                          n_),
                      Power(
                          Times(g_DEFAULT, $($s("§sin"),
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(e, Power(Times(e, Cos(Plus(a, Times(b, x)))), Subtract(m, C1)),
                              Power(Times(f, Sin(
                                  Plus(a, Times(b, x)))), Plus(n,
                                      C1)),
                              Power(Times(g, Sin(Plus(c, Times(d, x)))), p),
                              Power(Times(b, f, Plus(n, p, C1)), CN1)),
                          x),
                      Dist(
                          Times(Sqr(e), Subtract(Plus(m, p), C1),
                              Power(Times(Sqr(f), Plus(n, p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(e, Cos(Plus(a, Times(b, x)))), Subtract(m, C2)),
                                  Power(Times(f, Sin(Plus(a, Times(b, x)))), Plus(n, C2)),
                                  Power(Times(g, Sin(Plus(c, Times(d, x)))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, p), x),
                      EqQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Times(d, Power(b, CN1)), C2),
                      Not(IntegerQ(p)), GtQ(m, C1), LtQ(n, CN1), NeQ(Plus(n, p, C1), C0),
                      IntegersQ(Times(C2, m), Times(C2, n), Times(C2, p))))));
}
