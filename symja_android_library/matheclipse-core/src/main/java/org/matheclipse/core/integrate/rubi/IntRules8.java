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
class IntRules8 {
  public static IAST RULES = List(
      IIntegrate(161,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_),
                  Sqrt(Plus(c_DEFAULT, Times(d_DEFAULT,
                      x_))),
                  Sqrt(Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                  Sqrt(Plus(g_DEFAULT, Times(h_DEFAULT, x_)))),
              x_Symbol),
          Condition(
              Plus(Simp(
                  Times(C2, Power(Plus(a, Times(b, x)), Plus(m, C1)), Sqrt(Plus(c, Times(d, x))),
                      Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x))), Power(
                          Times(b, Plus(Times(C2, m), C5)), CN1)),
                  x),
                  Dist(
                      Power(Times(b,
                          Plus(Times(C2, m), C5)), CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(b, x)), m),
                              Simp(
                                  Subtract(
                                      Plus(Times(C3, b, c, e, g),
                                          Times(CN1, a,
                                              Plus(Times(d, e, g), Times(c, f, g), Times(c, e, h))),
                                          Times(C2,
                                              Subtract(
                                                  Times(b,
                                                      Plus(Times(d, e, g), Times(c, f, g),
                                                          Times(c, e, h))),
                                                  Times(a,
                                                      Plus(Times(d, f, g), Times(d, e, h),
                                                          Times(c, f, h)))),
                                              x)),
                                      Times(Subtract(Times(C3, a, d, f, h),
                                          Times(b,
                                              Plus(Times(d, f, g), Times(d, e, h),
                                                  Times(c, f, h)))),
                                          Sqr(x))),
                                  x),
                              Power(Times(Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                                  Sqrt(Plus(g, Times(h, x)))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g, h, m), x), IntegerQ(Times(C2, m)),
                  Not(LtQ(m, CN1))))),
      IIntegrate(162,
          Integrate(Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_),
              Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
              Sqrt(Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
              Sqrt(Plus(g_DEFAULT, Times(h_DEFAULT, x_)))), x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(C2, Power(Plus(a, Times(b, x)), m), Sqrt(Plus(c, Times(d, x))),
                          Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x))), Power(
                              Times(d, Plus(Times(C2, m), C3)), CN1)),
                      x),
                  Dist(
                      Power(Times(d,
                          Plus(Times(C2, m), C3)), CN1),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b,
                                  x)), Subtract(m,
                                      C1)),
                              Power(
                                  Times(
                                      Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f,
                                          x))),
                                      Sqrt(Plus(g, Times(h, x)))),
                                  CN1),
                              Simp(
                                  Subtract(
                                      Subtract(
                                          Plus(Times(C2, b, c, e, g, m),
                                              Times(a,
                                                  Subtract(Times(c, Plus(Times(f, g), Times(e, h))),
                                                      Times(C2, d, e, g, Plus(m, C1))))),
                                          Times(
                                              Subtract(
                                                  Times(b,
                                                      Subtract(Times(C2, d, e, g),
                                                          Times(c, Plus(Times(f, g), Times(e, h)),
                                                              Plus(Times(C2, m), C1)))),
                                                  Times(a,
                                                      Subtract(Times(C2, c, f, h),
                                                          Times(d, Plus(Times(C2, m), C1),
                                                              Plus(Times(f, g), Times(e, h)))))),
                                              x)),
                                      Times(Plus(Times(C2, a, d, f, h, m),
                                          Times(b,
                                              Subtract(Times(d, Plus(Times(f, g), Times(e, h))),
                                                  Times(C2, c, f, h, Plus(m, C1))))),
                                          Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g, h, m), x), IntegerQ(Times(C2, m)), GtQ(m, C0)))),
      IIntegrate(163,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), CN1),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
                  Sqrt(Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_))),
                  Sqrt(Plus(g_DEFAULT, Times(h_DEFAULT, x_)))),
              x_Symbol),
          Condition(
              Plus(
                  Dist(
                      Times(
                          Subtract(Times(b, e), Times(a, f)), Subtract(Times(b, g),
                              Times(a, h)),
                          Power(b, CN2)),
                      Integrate(Power(Times(Plus(a, Times(b, x)), Sqrt(Plus(c, Times(d, x))),
                          Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x)))), CN1), x),
                      x),
                  Dist(Power(b, CN2),
                      Integrate(
                          Times(
                              Simp(Plus(Times(b, f, g), Times(b, e, h), Times(CN1, a, f, h),
                                  Times(b, f, h, x)), x),
                              Power(Times(Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                                  Sqrt(Plus(g, Times(h, x)))), CN1)),
                          x),
                      x)),
              FreeQ(List(a, b, c, d, e, f, g, h), x))),
      IIntegrate(164,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
                  Sqrt(Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_))),
                  Sqrt(Plus(g_DEFAULT, Times(h_DEFAULT, x_)))),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(Power(Plus(a, Times(b, x)), Plus(m, C1)), Sqrt(Plus(c, Times(d, x))),
                          Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h,
                              x))),
                          Power(Times(Plus(m, C1), Subtract(Times(b, c), Times(a, d))), CN1)),
                      x),
                  Dist(Power(Times(C2, Plus(m, C1), Subtract(Times(b, c), Times(a, d))), CN1),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b, x)), Plus(m,
                                  C1)),
                              Power(Times(Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                                  Sqrt(Plus(g, Times(h, x)))), CN1),
                              Simp(Plus(Times(c, Plus(Times(f, g), Times(e, h))),
                                  Times(d, e, g, Plus(Times(C2, m), C3)),
                                  Times(C2,
                                      Plus(Times(c, f, h),
                                          Times(d, Plus(m, C2), Plus(Times(f, g), Times(e, h)))),
                                      x),
                                  Times(d, f, h, Plus(Times(C2, m), C5), Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g, h, m), x), IntegerQ(Times(C2, m)), LtQ(m, CN1)))),
      IIntegrate(165,
          Integrate(Times(Sqrt(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
              Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
              Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2), Power(
                  Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      C2, Plus(a, Times(b,
                          x)),
                      Sqrt(
                          Times(Subtract(Times(b, g), Times(a, h)), Plus(c, Times(d, x)),
                              Power(Times(Subtract(Times(d, g), Times(c, h)), Plus(a, Times(b, x))),
                                  CN1))),
                      Sqrt(
                          Times(
                              Subtract(Times(b, g), Times(a, h)), Plus(e, Times(f,
                                  x)),
                              Power(
                                  Times(Subtract(Times(f, g), Times(e,
                                      h)), Plus(a,
                                          Times(b, x))),
                                  CN1))),
                      Power(Times(Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x)))), CN1)),
                  Subst(Integrate(Power(
                      Times(Subtract(h, Times(b, Sqr(x))),
                          Sqrt(Plus(C1,
                              Times(Subtract(Times(b, c), Times(a, d)), Sqr(x),
                                  Power(Subtract(Times(d, g), Times(c, h)), CN1)))),
                          Sqrt(Plus(C1,
                              Times(Subtract(Times(b, e), Times(a, f)), Sqr(x), Power(
                                  Subtract(Times(f, g), Times(e, h)), CN1))))),
                      CN1), x), x, Times(Sqrt(Plus(g, Times(h, x))),
                          Power(Plus(a, Times(b, x)), CN1D2))),
                  x),
              FreeQ(List(a, b, c, d, e, f, g, h), x))),
      IIntegrate(166,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), QQ(3L, 2L)),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2), Power(
                      Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Subtract(Dist(Times(b, Power(d, CN1)),
                  Integrate(
                      Times(Sqrt(Plus(a, Times(b, x))), Sqrt(Plus(c, Times(d, x))),
                          Power(Times(Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x)))),
                              CN1)),
                      x),
                  x),
                  Dist(Times(Subtract(Times(b, c), Times(a, d)), Power(d, CN1)),
                      Integrate(
                          Times(Sqrt(Plus(a, Times(b, x))),
                              Power(Times(Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                                  Sqrt(Plus(g, Times(h, x)))), CN1)),
                          x),
                      x)),
              FreeQ(List(a, b, c, d, e, f, g, h), x))),
      IIntegrate(167,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT,
                      x_)), CN1D2),
                  Power(Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_)), CN1D2),
                  Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(Times(C2, Sqr(b), Power(Plus(a, Times(b, x)), Subtract(m, C2)),
                      Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                      Sqrt(Plus(g, Times(h, x))), Power(Times(d, f, h, Subtract(Times(C2, m), C1)),
                          CN1)),
                      x),
                  Dist(Power(Times(d, f, h, Subtract(Times(C2, m), C1)), CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(b, x)), Subtract(m, C3)),
                              Power(
                                  Times(
                                      Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))), Sqrt(
                                          Plus(g, Times(h, x)))),
                                  CN1),
                              Simp(
                                  Subtract(
                                      Plus(
                                          Times(a, Sqr(b),
                                              Plus(Times(d, e, g), Times(c, f, g), Times(c, e, h))),
                                          Times(C2, Power(b,
                                              C3), c, e, g, Subtract(m, C2)),
                                          Times(CN1, Power(a, C3), d, f, h,
                                              Subtract(Times(C2, m), C1)),
                                          Times(b,
                                              Subtract(
                                                  Plus(
                                                      Times(C2, a, b,
                                                          Plus(Times(d, f, g), Times(d, e, h),
                                                              Times(c, f, h))),
                                                      Times(Sqr(b), Subtract(Times(C2, m), C3),
                                                          Plus(Times(d, e, g), Times(c, f, g),
                                                              Times(c, e, h)))),
                                                  Times(C3, Sqr(a), d, f, h,
                                                      Subtract(Times(C2, m), C1))),
                                              x)),
                                      Times(C2, Sqr(b), Subtract(m, C1),
                                          Subtract(
                                              Times(C3, a, d, f, h),
                                              Times(b,
                                                  Plus(Times(d, f, g), Times(d, e, h),
                                                      Times(c, f, h)))),
                                          Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g, h), x), IntegerQ(Times(C2, m)), GeQ(m, C2)))),
      IIntegrate(168,
          Integrate(Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), CN1),
              Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
              Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2), Power(
                  Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Dist(CN2,
                  Subst(
                      Integrate(
                          Power(
                              Times(
                                  Simp(
                                      Subtract(Subtract(Times(b, c), Times(a, d)),
                                          Times(b, Sqr(x))),
                                      x),
                                  Sqrt(Simp(
                                      Plus(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)),
                                          Times(f, Sqr(x), Power(d, CN1))),
                                      x)),
                                  Sqrt(
                                      Simp(
                                          Plus(Times(Subtract(Times(d, g), Times(c, h)),
                                              Power(d, CN1)), Times(h, Sqr(x), Power(d, CN1))),
                                          x))),
                              CN1),
                          x),
                      x, Sqrt(Plus(c, Times(d, x)))),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, g, h), x),
                  GtQ(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)), C0)))),
      IIntegrate(169,
          Integrate(Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), CN1),
              Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
              Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2),
              Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)), x_Symbol),
          Condition(
              Dist(CN2,
                  Subst(
                      Integrate(
                          Power(
                              Times(
                                  Simp(
                                      Subtract(Subtract(Times(b, c), Times(a, d)),
                                          Times(b, Sqr(x))),
                                      x),
                                  Sqrt(Simp(
                                      Plus(Times(Subtract(Times(d, e), Times(c, f)), Power(d, CN1)),
                                          Times(f, Sqr(x), Power(d, CN1))),
                                      x)),
                                  Sqrt(
                                      Simp(
                                          Plus(Times(Subtract(Times(d, g), Times(c, h)),
                                              Power(d, CN1)), Times(h, Sqr(x), Power(d, CN1))),
                                          x))),
                              CN1),
                          x),
                      x, Sqrt(Plus(c, Times(d, x)))),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, g, h), x),
                  Not(SimplerQ(Plus(e, Times(f, x)), Plus(c, Times(d, x)))),
                  Not(SimplerQ(Plus(g, Times(h, x)), Plus(c, Times(d, x))))))),
      IIntegrate(170,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), CN1D2),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
                  Power(Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_)), CN1D2),
                  Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Dist(
                  Times(C2, Sqrt(Plus(g, Times(h, x))),
                      Sqrt(Times(Subtract(Times(b, e), Times(a, f)), Plus(c, Times(d, x)),
                          Power(Times(Subtract(Times(d, e), Times(c, f)), Plus(a, Times(b, x))),
                              CN1))),
                      Power(
                          Times(Subtract(Times(f, g), Times(e, h)), Sqrt(Plus(c, Times(d, x))),
                              Sqrt(
                                  Times(CN1, Subtract(Times(b, e), Times(a, f)),
                                      Plus(g, Times(h, x)),
                                      Power(Times(Subtract(Times(f, g), Times(e, h)),
                                          Plus(a, Times(b, x))), CN1)))),
                          CN1)),
                  Subst(
                      Integrate(Power(
                          Times(
                              Sqrt(Plus(C1,
                                  Times(Subtract(Times(b, c), Times(a, d)), Sqr(x),
                                      Power(Subtract(Times(d, e), Times(c, f)), CN1)))),
                              Sqrt(Subtract(C1,
                                  Times(Subtract(Times(b, g), Times(a, h)), Sqr(x),
                                      Power(Subtract(Times(f, g), Times(e, h)), CN1))))),
                          CN1), x),
                      x, Times(Sqrt(Plus(e, Times(f, x))), Power(Plus(a, Times(b, x)), CN1D2))),
                  x),
              FreeQ(List(a, b, c, d, e, f, g, h), x))),
      IIntegrate(171,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), QQ(-3L, 2L)),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
                  Power(Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_)), CN1D2),
                  Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Dist(
                          Times(d, Power(Subtract(Times(b, c), Times(a, d)),
                              CN1)),
                          Integrate(
                              Power(
                                  Times(
                                      Sqrt(Plus(a, Times(b, x))), Sqrt(Plus(c, Times(d, x))),
                                      Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x)))),
                                  CN1),
                              x),
                          x)),
                  Dist(
                      Times(b, Power(Subtract(Times(b, c), Times(a, d)),
                          CN1)),
                      Integrate(Times(Sqrt(Plus(c, Times(d, x))),
                          Power(Times(Power(Plus(a, Times(b, x)), QQ(3L, 2L)),
                              Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x)))), CN1)),
                          x),
                      x)),
              FreeQ(List(a, b, c, d, e, f, g, h), x))),
      IIntegrate(172,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1D2),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2), Power(
                      Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(Times(Sqr(b), Power(Plus(a, Times(b, x)), Plus(m, C1)),
                      Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                      Sqrt(Plus(g, Times(h, x))),
                      Power(Times(Plus(m, C1), Subtract(Times(b, c), Times(a, d)),
                          Subtract(Times(b, e), Times(a, f)), Subtract(Times(b, g), Times(a, h))),
                          CN1)),
                      x),
                  Dist(
                      Power(Times(C2, Plus(m, C1), Subtract(Times(b, c), Times(a, d)),
                          Subtract(Times(b, e), Times(a, f)), Subtract(Times(b, g), Times(a, h))),
                          CN1),
                      Integrate(Times(
                          Power(Plus(a, Times(b, x)), Plus(m,
                              C1)),
                          Power(Times(Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                              Sqrt(Plus(g, Times(h, x)))), CN1),
                          Simp(Plus(Times(C2, Sqr(a), d, f, h, Plus(m, C1)),
                              Times(CN1, C2, a, b, Plus(m, C1),
                                  Plus(Times(d, f, g), Times(d, e, h), Times(c, f, h))),
                              Times(Sqr(b), Plus(Times(C2, m), C3),
                                  Plus(Times(d, e, g), Times(c, f, g), Times(c, e, h))),
                              Times(CN1, C2, b,
                                  Subtract(Times(a, d, f, h, Plus(m, C1)),
                                      Times(b, Plus(m, C2),
                                          Plus(Times(d, f, g), Times(d, e, h), Times(c, f, h)))),
                                  x),
                              Times(d, f, h, Plus(Times(C2, m), C5), Sqr(b), Sqr(x))), x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g, h), x), IntegerQ(Times(C2, m)), LeQ(m, CN2)))),
      IIntegrate(173,
          Integrate(
              Times(Sqrt(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                  Sqrt(Plus(c_DEFAULT, Times(d_DEFAULT,
                      x_))),
                  Power(Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_)), CN1D2),
                  Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Sqrt(Plus(a, Times(b, x))), Sqrt(Plus(c, Times(d, x))),
                          Sqrt(Plus(g, Times(h, x))), Power(
                              Times(h, Sqrt(Plus(e, Times(f, x)))), CN1)),
                      x),
                  Negate(Dist(
                      Times(Subtract(Times(d, e), Times(c, f)), Subtract(Times(f, g), Times(e, h)),
                          Power(Times(C2, f, h), CN1)),
                      Integrate(Times(Sqrt(Plus(a, Times(b, x))),
                          Power(Times(Sqrt(Plus(c, Times(d, x))),
                              Power(Plus(e, Times(f, x)), QQ(3L, 2L)), Sqrt(Plus(g, Times(h, x)))),
                              CN1)),
                          x),
                      x)),
                  Dist(
                      Times(Subtract(Times(d, e), Times(c, f)),
                          Subtract(Plus(Times(b, f, g), Times(b, e, h)),
                              Times(C2, a, f, h)),
                          Power(Times(C2, Sqr(f), h), CN1)),
                      Integrate(Power(Times(Sqrt(Plus(a, Times(b, x))), Sqrt(Plus(c, Times(d, x))),
                          Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x)))), CN1), x),
                      x),
                  Dist(
                      Times(
                          Subtract(Times(a, d, f, h),
                              Times(b,
                                  Subtract(Plus(Times(d, f, g), Times(d, e, h)), Times(c, f, h)))),
                          Power(Times(C2, Sqr(f), h), CN1)),
                      Integrate(
                          Times(Sqrt(Plus(e, Times(f, x))),
                              Power(Times(Sqrt(Plus(a, Times(b, x))), Sqrt(Plus(c, Times(d, x))),
                                  Sqrt(Plus(g, Times(h, x)))), CN1)),
                          x),
                      x)),
              FreeQ(List(a, b, c, d, e, f, g, h), x))),
      IIntegrate(174,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_),
                  Sqrt(Plus(c_DEFAULT, Times(d_DEFAULT,
                      x_))),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2),
                  Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(C2, b, Power(Plus(a, Times(b, x)), Subtract(m, C1)),
                          Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                          Sqrt(Plus(g,
                              Times(h, x))),
                          Power(Times(f, h, Plus(Times(C2, m), C1)), CN1)),
                      x),
                  Dist(
                      Power(Times(f, h,
                          Plus(Times(C2, m), C1)), CN1),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b,
                                  x)), Subtract(m,
                                      C2)),
                              Power(
                                  Times(
                                      Sqrt(Plus(c, Times(d,
                                          x))),
                                      Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x)))),
                                  CN1),
                              Simp(
                                  Subtract(
                                      Plus(
                                          Times(a, b,
                                              Plus(Times(d, e, g), Times(c,
                                                  Plus(Times(f, g), Times(e, h))))),
                                          Times(C2, Sqr(b), c, e, g, Subtract(m, C1)),
                                          Times(CN1, Sqr(a), c, f, h, Plus(Times(C2, m), C1)),
                                          Times(
                                              Plus(
                                                  Times(Sqr(b), Subtract(Times(C2, m), C1),
                                                      Plus(Times(d, e, g),
                                                          Times(c,
                                                              Plus(Times(f, g), Times(e, h))))),
                                                  Times(CN1, Sqr(a), d, f, h,
                                                      Plus(Times(C2, m), C1)),
                                                  Times(C2, a, b,
                                                      Subtract(Plus(Times(d, f, g), Times(d, e, h)),
                                                          Times(C2, c, f, h, m)))),
                                              x)),
                                      Times(b,
                                          Plus(Times(a, d, f, h, Subtract(Times(C4, m), C1)),
                                              Times(b,
                                                  Subtract(Times(c, f, h),
                                                      Times(C2, d, Plus(Times(f, g), Times(e, h)),
                                                          m)))),
                                          Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g, h, m), x), IntegerQ(Times(C2, m)), GtQ(m, C1)))),
      IIntegrate(175,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), CN1),
                  Sqrt(Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                  Power(Plus(e_DEFAULT,
                      Times(f_DEFAULT, x_)), CN1D2),
                  Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Plus(
                  Dist(Times(d, Power(b, CN1)),
                      Integrate(
                          Power(
                              Times(Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                                  Sqrt(Plus(g, Times(h, x)))),
                              CN1),
                          x),
                      x),
                  Dist(
                      Times(Subtract(Times(b, c), Times(a, d)), Power(b,
                          CN1)),
                      Integrate(
                          Power(
                              Times(
                                  Plus(a, Times(b, x)), Sqrt(Plus(c, Times(d, x))), Sqrt(
                                      Plus(e, Times(f, x))),
                                  Sqrt(Plus(g, Times(h, x)))),
                              CN1),
                          x),
                      x)),
              FreeQ(List(a, b, c, d, e, f, g, h), x))),
      IIntegrate(176,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), QQ(-3L, 2L)),
                  Sqrt(Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2), Power(
                      Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      CN2, Sqrt(Plus(c,
                          Times(d, x))),
                      Sqrt(
                          Times(
                              CN1, Subtract(Times(b, e), Times(a, f)), Plus(g, Times(h,
                                  x)),
                              Power(
                                  Times(Subtract(Times(f, g), Times(e, h)), Plus(a, Times(b,
                                      x))),
                                  CN1))),
                      Power(
                          Times(
                              Subtract(Times(b, e), Times(a, f)), Sqrt(Plus(g,
                                  Times(h, x))),
                              Sqrt(
                                  Times(Subtract(Times(b, e), Times(a, f)), Plus(c, Times(d, x)),
                                      Power(
                                          Times(Subtract(Times(d, e), Times(c, f)),
                                              Plus(a, Times(b, x))),
                                          CN1)))),
                          CN1)),
                  Subst(
                      Integrate(
                          Times(
                              Sqrt(Plus(C1,
                                  Times(Subtract(Times(b, c), Times(a, d)), Sqr(x),
                                      Power(Subtract(Times(d, e), Times(c, f)), CN1)))),
                              Power(
                                  Subtract(C1,
                                      Times(Subtract(Times(b, g), Times(a, h)), Sqr(x),
                                          Power(Subtract(Times(f, g), Times(e, h)), CN1))),
                                  CN1D2)),
                          x),
                      x, Times(Sqrt(Plus(e, Times(f, x))), Power(Plus(a, Times(b, x)), CN1D2))),
                  x),
              FreeQ(List(a, b, c, d, e, f, g, h), x))),
      IIntegrate(177,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_),
                  Sqrt(Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2), Power(
                      Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Plus(Simp(
                  Times(b, Power(Plus(a, Times(b, x)), Plus(m, C1)), Sqrt(Plus(c, Times(d, x))),
                      Sqrt(Plus(e, Times(f, x))), Sqrt(Plus(g, Times(h, x))),
                      Power(Times(Plus(m, C1), Subtract(Times(b, e), Times(a, f)),
                          Subtract(Times(b, g), Times(a, h))), CN1)),
                  x),
                  Dist(
                      Power(Times(C2, Plus(m, C1), Subtract(Times(b, e), Times(a, f)),
                          Subtract(Times(b, g), Times(a, h))), CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(b, x)), Plus(m, C1)),
                              Power(Times(
                                  Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                                  Sqrt(Plus(g, Times(h, x)))), CN1),
                              Simp(Subtract(
                                  Plus(Times(C2, a, c, f, h, Plus(m, C1)),
                                      Times(CN1, b,
                                          Plus(Times(d, e, g),
                                              Times(c, Plus(Times(C2, m), C3),
                                                  Plus(Times(f, g), Times(e, h))))),
                                      Times(C2,
                                          Subtract(Times(a, d, f, h, Plus(m, C1)),
                                              Times(b, Plus(m, C2),
                                                  Plus(Times(d, f, g), Times(d, e, h),
                                                      Times(c, f, h)))),
                                          x)),
                                  Times(b, d, f, h, Plus(Times(C2, m), C5), Sqr(x))), x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g, h, m), x), IntegerQ(Times(C2, m)), LeQ(m, CN2)))),
      IIntegrate(178,
          Integrate(Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), CN1),
              Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), CN1),
              Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)),
                  p_),
              Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), q_)), x_Symbol),
          Condition(
              Subtract(
                  Dist(
                      Times(
                          Subtract(Times(b, e), Times(a, f)),
                          Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                      Integrate(
                          Times(Power(Plus(e, Times(f, x)), Subtract(p, C1)),
                              Power(Plus(g, Times(h, x)), q), Power(Plus(a, Times(b, x)), CN1)),
                          x),
                      x),
                  Dist(
                      Times(
                          Subtract(Times(d, e), Times(c,
                              f)),
                          Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                      Integrate(
                          Times(
                              Power(Plus(e, Times(f, x)), Subtract(p, C1)),
                              Power(Plus(g, Times(h, x)), q), Power(Plus(c, Times(d, x)), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g, h, q), x), LtQ(C0, p, C1)))),
      IIntegrate(179,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_DEFAULT),
                  Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), n_),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), CN1D2), Power(
                      Plus(g_DEFAULT, Times(h_DEFAULT, x_)), CN1D2)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(
                      Power(Times(Sqrt(Plus(c, Times(d, x))), Sqrt(Plus(e, Times(f, x))),
                          Sqrt(Plus(g, Times(h, x)))), CN1),
                      Times(
                          Power(Plus(a, Times(b, x)), m), Power(Plus(c, Times(d, x)),
                              Plus(n, C1D2))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, g, h), x), IntegerQ(m), IntegerQ(Plus(n, C1D2))))),
      IIntegrate(180,
          Integrate(Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_)), m_),
              Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), n_),
              Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), p_),
              Power(Plus(g_DEFAULT, Times(h_DEFAULT, x_)), q_)), x_Symbol),
          Condition(
              Integrate(ExpandIntegrand(
                  Times(Power(Plus(a, Times(b, x)), m), Power(Plus(c, Times(d, x)), n),
                      Power(Plus(e, Times(f, x)), p), Power(Plus(g, Times(h, x)), q)),
                  x), x),
              And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x), IntegersQ(p, q)))));
}
