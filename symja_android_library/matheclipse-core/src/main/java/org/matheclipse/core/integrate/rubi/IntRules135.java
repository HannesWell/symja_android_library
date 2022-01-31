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
class IntRules135 {
  public static IAST RULES =
      List(
          IIntegrate(2701,
              Integrate(
                  Times(
                      Sqrt(Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          g_DEFAULT)),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Plus(Negate(Sqr(a)), Sqr(b)), C2))),
                      Plus(
                          Dist(
                              Times(a, g, Power(
                                  Times(C2, b), CN1)),
                              Integrate(
                                  Power(
                                      Times(
                                          Sqrt(Times(g, Cos(Plus(e, Times(f, x))))), Plus(q, Times(
                                              b, Cos(Plus(e, Times(f, x)))))),
                                      CN1),
                                  x),
                              x),
                          Negate(
                              Dist(
                                  Times(a, g, Power(Times(C2, b),
                                      CN1)),
                                  Integrate(Power(Times(Sqrt(Times(g, Cos(Plus(e, Times(f, x))))),
                                      Subtract(q, Times(b, Cos(Plus(e, Times(f, x)))))), CN1), x),
                                  x)),
                          Dist(
                              Times(b, g, Power(f,
                                  CN1)),
                              Subst(
                                  Integrate(Times(Sqrt(x),
                                      Power(Plus(Times(Sqr(g), Subtract(Sqr(a), Sqr(b))),
                                          Times(Sqr(b), Sqr(x))), CN1)),
                                      x),
                                  x, Times(g, Cos(Plus(e, Times(f, x))))),
                              x))),
                  And(FreeQ(List(a, b, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2702,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              g_DEFAULT),
                          CN1D2),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Plus(Negate(Sqr(a)), Sqr(b)), C2))),
                      Plus(
                          Negate(
                              Dist(Times(a, Power(Times(C2, q), CN1)),
                                  Integrate(
                                      Power(
                                          Times(Sqrt(Times(g, Cos(Plus(e, Times(f, x))))),
                                              Plus(q, Times(b, Cos(Plus(e, Times(f, x)))))),
                                          CN1),
                                      x),
                                  x)),
                          Dist(
                              Times(b, g, Power(f,
                                  CN1)),
                              Subst(
                                  Integrate(
                                      Power(
                                          Times(Sqrt(x),
                                              Plus(Times(Sqr(g), Subtract(Sqr(a), Sqr(b))),
                                                  Times(Sqr(b), Sqr(x)))),
                                          CN1),
                                      x),
                                  x, Times(g, Cos(Plus(e, Times(f, x))))),
                              x),
                          Negate(Dist(Times(a, Power(Times(C2, q), CN1)),
                              Integrate(Power(Times(Sqrt(Times(g, Cos(Plus(e, Times(f, x))))),
                                  Subtract(q, Times(b, Cos(Plus(e, Times(f, x)))))), CN1), x),
                              x)))),
                  And(FreeQ(List(a, b, e, f, g), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(2703,
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
                  Simp(
                      Times(g, Power(Times(g, Cos(Plus(e, Times(f, x)))), Subtract(p, C1)),
                          Power(Plus(a, Times(b,
                              Sin(Plus(e, Times(f, x))))), Plus(m,
                                  C1)),
                          AppellF1(Subtract(Negate(p), m), Times(C1D2, Subtract(C1, p)),
                              Times(C1D2, Subtract(C1, p)), Subtract(Subtract(C1,
                                  p), m),
                              Times(
                                  Plus(a, b), Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      CN1)),
                              Times(
                                  Subtract(a, b), Power(
                                      Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1))),
                          Power(
                              Times(b, f, Plus(m, p),
                                  Power(
                                      Times(
                                          CN1, b, Subtract(C1, Sin(
                                              Plus(e, Times(f, x)))),
                                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                                      Times(C1D2, Subtract(p, C1))),
                                  Power(
                                      Times(b, Plus(C1, Sin(Plus(e, Times(f, x)))),
                                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1)),
                                      Times(C1D2, Subtract(p, C1)))),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, e, f, g, p), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), ILtQ(m,
                          C0),
                      Not(IGtQ(Plus(m, p, C1), C0))))),
          IIntegrate(2704,
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
                  Dist(
                      Times(
                          g, Power(Times(g, Cos(
                              Plus(e, Times(f, x)))), Subtract(p,
                                  C1)),
                          Power(
                              Times(f,
                                  Power(
                                      Subtract(C1,
                                          Times(
                                              Plus(a, Times(b,
                                                  Sin(Plus(e, Times(f, x))))),
                                              Power(Subtract(a, b), CN1))),
                                      Times(C1D2, Subtract(p, C1))),
                                  Power(
                                      Subtract(C1,
                                          Times(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                              Power(Plus(a, b), CN1))),
                                      Times(C1D2, Subtract(p, C1)))),
                              CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(
                                      Subtract(Times(CN1, b, Power(Subtract(a, b), CN1)),
                                          Times(b, x, Power(Subtract(a, b), CN1))),
                                      Times(C1D2, Subtract(p, C1))),
                                  Power(
                                      Subtract(Times(b, Power(Plus(a, b), CN1)),
                                          Times(b, x, Power(Plus(a, b), CN1))),
                                      Times(C1D2, Subtract(p, C1))),
                                  Power(Plus(a, Times(b, x)), m)),
                              x),
                          x, Sin(Plus(e, Times(f, x)))),
                      x),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      Not(IGtQ(m, C0))))),
          IIntegrate(2705,
              Integrate(
                  Times(
                      Power(
                          Times(g_DEFAULT, $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(g, Times(C2, IntPart(p))),
                          Power(Times(g, Cos(
                              Plus(e, Times(f, x)))), FracPart(
                                  p)),
                          Power(Times(g, Sec(Plus(e, Times(f, x)))), FracPart(p))),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), Power(Power(
                                  Times(g, Cos(Plus(e, Times(f, x)))), p), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), Not(IntegerQ(p))))),
          IIntegrate(2706,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Times(g_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Sqr(Sec(Plus(e, Times(f, x)))),
                                  Power(Times(g, Tan(Plus(e, Times(f, x)))), p)),
                              x),
                          x),
                      Dist(
                          Power(Times(b,
                              g), CN1),
                          Integrate(
                              Times(
                                  Sec(Plus(e,
                                      Times(f, x))),
                                  Power(Times(g, Tan(Plus(e, Times(f, x)))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, g, p), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), NeQ(p,
                          CN1)))),
          IIntegrate(2707,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(f, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(x, p),
                                  Power(Plus(a, x), Subtract(m, Times(C1D2, Plus(p, C1)))),
                                  Power(Power(Subtract(a, x), Times(C1D2, Plus(p, C1))), CN1)),
                              x),
                          x, Times(b, Sin(Plus(e, Times(f, x))))),
                      x),
                  And(FreeQ(List(a, b, e, f, m), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegerQ(Times(C1D2, Plus(p, C1)))))),
          IIntegrate(2708,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(Power(a, p),
                      Integrate(
                          Times(
                              Power(Sin(
                                  Plus(e, Times(f, x))), p),
                              Power(Power(Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegersQ(m, p), EqQ(p, Times(C2, m))))),
          IIntegrate(2709,
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
                  Dist(Power(a, p),
                      Integrate(
                          ExpandIntegrand(
                              Times(Power(Sin(Plus(e, Times(f, x))), p),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, Times(C1D2, p))),
                                  Power(
                                      Power(Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                          Times(C1D2, p)),
                                      CN1)),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegersQ(m, Times(C1D2,
                          p)),
                      Or(LtQ(p, C0), GtQ(Subtract(m, Times(C1D2, p)), C0))))),
          IIntegrate(2710,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power(Times(g_DEFAULT, $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Power(Times(g,
                              Tan(Plus(e, Times(f, x)))), p),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), x),
                      x),
                  And(FreeQ(List(a, b, e, f, g, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IGtQ(m, C0)))),
          IIntegrate(2711,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(Times(g_DEFAULT, $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(a, Times(C2,
                          m)),
                      Integrate(
                          ExpandIntegrand(
                              Times(
                                  Power(Times(g, Tan(Plus(e, Times(f, x)))),
                                      p),
                                  Power(Power(Sec(Plus(e, Times(f, x))), m), CN1)),
                              Power(
                                  Subtract(
                                      Times(a, Sec(
                                          Plus(e, Times(f, x)))),
                                      Times(b, Tan(Plus(e, Times(f, x))))),
                                  Negate(m)),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f, g, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      ILtQ(m, C0)))),
          IIntegrate(2712,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_),
                      Sqr($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(b, Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Times(a, f, Subtract(Times(C2, m), C1),
                                  Cos(Plus(e, Times(f, x)))), CN1)),
                          x),
                      Dist(Power(Times(Sqr(a), Subtract(Times(C2, m), C1)), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Subtract(Times(a, m), Times(b, Subtract(Times(C2, m), C1),
                                  Sin(Plus(e, Times(f, x))))),
                              Power(Cos(Plus(e, Times(f, x))), CN2)), x),
                          x)),
                  And(FreeQ(List(a, b, e, f), x), EqQ(Subtract(Sqr(a),
                      Sqr(b)), C0), Not(IntegerQ(m)), LtQ(m, C0)))),
          IIntegrate(2713,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          m_),
                      Sqr($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(Times(b, f, m, Cos(Plus(e, Times(f, x)))), CN1)),
                              x)),
                      Dist(Power(Times(b, m), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Plus(Times(b, Plus(m, C1)), Times(a,
                                      Sin(Plus(e, Times(f, x))))),
                                  Power(Cos(Plus(e, Times(f, x))), CN2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, m), x), EqQ(Subtract(Sqr(a), Sqr(
                      b)), C0), Not(IntegerQ(
                          m)),
                      Not(LtQ(m, C0))))),
          IIntegrate(2714,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), C4)),
                  x_Symbol),
              Condition(
                  Subtract(Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m), x),
                      Integrate(Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Subtract(C1, Times(C2, Sqr(Sin(Plus(e, Times(f, x)))))),
                          Power(Cos(Plus(e, Times(f, x))), CN4)), x)),
                  And(FreeQ(List(a, b, e, f,
                      m), x), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      IntegerQ(Subtract(m, C1D2))))),
          IIntegrate(2715,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN2)),
                  x_Symbol),
              Condition(
                  Plus(Negate(
                      Simp(
                          Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(a, f, Tan(Plus(e, Times(f, x)))), CN1)),
                          x)),
                      Dist(Power(b, CN2),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Subtract(Times(b, m),
                                      Times(a, Plus(m, C1), Sin(Plus(e, Times(f, x))))),
                                  Power(Sin(Plus(e, Times(f, x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f), x), EqQ(Subtract(Sqr(a), Sqr(
                      b)), C0), IntegerQ(Subtract(m,
                          C1D2)),
                      LtQ(m, CN1)))),
          IIntegrate(2716,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_DEFAULT),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Times(f, Tan(Plus(e, Times(f, x)))), CN1)), x)),
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Subtract(Times(b, m), Times(a, Plus(m, C1),
                                      Sin(Plus(e, Times(f, x))))),
                                  Power(Sin(Plus(e, Times(f, x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f, m), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      IntegerQ(Subtract(m, C1D2)), Not(LtQ(m, CN1))))),
          IIntegrate(2717,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN4)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(CN2, Power(Times(a, b),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C2)),
                                  Power(Sin(Plus(e, Times(f, x))), CN3)),
                              x),
                          x),
                      Dist(Power(a, CN2),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C2)),
                                  Plus(C1, Sqr(
                                      Sin(Plus(e, Times(f, x))))),
                                  Power(Sin(Plus(e, Times(f, x))), CN4)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, e, f), x), EqQ(Subtract(Sqr(a), Sqr(
                      b)), C0), IntegerQ(Subtract(m,
                          C1D2)),
                      LtQ(m, CN1)))),
          IIntegrate(2718,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), CN4)),
                  x_Symbol),
              Condition(
                  Plus(
                      Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                          m), x),
                      Integrate(
                          Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Subtract(C1, Times(C2,
                                  Sqr(Sin(Plus(e, Times(f, x)))))),
                              Power(Sin(Plus(e, Times(f, x))), CN4)),
                          x)),
                  And(FreeQ(List(a, b, e, f, m), x), EqQ(Subtract(Sqr(a), Sqr(
                      b)), C0), IntegerQ(Subtract(m,
                          C1D2)),
                      Not(LtQ(m, CN1))))),
          IIntegrate(2719,
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
                  Dist(
                      Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                          Sqrt(Subtract(a, Times(b, Sin(Plus(e, Times(f, x)))))), Power(
                              Times(b, f, Cos(Plus(e, Times(f, x)))), CN1)),
                      Subst(
                          Integrate(
                              Times(Power(x, p),
                                  Power(Plus(a, x), Subtract(m, Times(C1D2,
                                      Plus(p, C1)))),
                                  Power(Power(Subtract(a, x), Times(C1D2, Plus(p, C1))), CN1)),
                              x),
                          x, Times(b, Sin(Plus(e, Times(f, x))))),
                      x),
                  And(FreeQ(List(a, b, e, f,
                      m), x), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      Not(IntegerQ(m)), IntegerQ(Times(C1D2, p))))),
          IIntegrate(2720,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Times(g_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(g, Tan(
                              Plus(e, Times(f, x)))), Plus(p,
                                  C1)),
                          Power(
                              Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))),
                              Times(C1D2, Plus(p, C1))),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                              Times(C1D2, Plus(p, C1))),
                          Power(
                              Times(f, g, Power(Times(b, Sin(Plus(e, Times(f, x)))), Plus(p, C1))),
                              CN1)),
                      Subst(
                          Integrate(Times(Power(x, p),
                              Power(Plus(a, x), Subtract(m, Times(C1D2, Plus(p, C1)))),
                              Power(Power(Subtract(a, x), Times(C1D2, Plus(p, C1))), CN1)), x),
                          x, Times(b, Sin(Plus(e, Times(f, x))))),
                      x),
                  And(FreeQ(List(a, b, e, f, g, m, p), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      Not(IntegerQ(m)), Not(IntegerQ(p))))));
}
