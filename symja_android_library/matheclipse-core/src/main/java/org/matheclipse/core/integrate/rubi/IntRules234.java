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
class IntRules234 {
  public static IAST RULES =
      List(
          IIntegrate(4681,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                              Power(Plus(a,
                                  Times(b, ArcSin(Times(c, x)))), n),
                              Power(Times(d, f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, c, n, Power(d, IntPart(p)),
                              Power(Plus(d, Times(e, Sqr(x))), FracPart(p)), Power(Times(f,
                                  Plus(m, C1), Power(Subtract(C1, Times(Sqr(c), Sqr(x))),
                                      FracPart(p))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Plus(p,
                                      C1D2)),
                                  Power(Plus(a, Times(b, ArcSin(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, p), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), GtQ(n,
                          C0),
                      EqQ(Plus(m, Times(C2, p), C3), C0), NeQ(m, CN1)))),
          IIntegrate(4682,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e,
                                  Sqr(x))), Plus(p,
                                      C1)),
                              Power(Plus(a,
                                  Times(b, ArcCos(Times(c, x)))), n),
                              Power(Times(d, f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, c, n, Power(d, IntPart(p)),
                              Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(Times(f, Plus(m, C1),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Plus(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcCos(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, p), x), EqQ(Plus(Times(Sqr(c),
                      d), e), C0), GtQ(n, C0), EqQ(Plus(m, Times(C2, p),
                          C3), C0),
                      NeQ(m, CN1)))),
          IIntegrate(4683,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(Plus(
                  Simp(Times(Power(Plus(d, Times(e, Sqr(x))), p),
                      Plus(a, Times(b, ArcSin(Times(c, x)))), Power(Times(C2, p), CN1)), x),
                  Dist(d,
                      Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1)),
                          Plus(a, Times(b, ArcSin(Times(c, x)))), Power(x, CN1)), x),
                      x),
                  Negate(Dist(Times(b, c, Power(d, p), Power(Times(C2, p), CN1)),
                      Integrate(Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)), x),
                      x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IGtQ(p, C0)))),
          IIntegrate(4684,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(Plus(
                  Simp(Times(Power(Plus(d, Times(e, Sqr(x))), p),
                      Plus(a, Times(b, ArcCos(Times(c, x)))), Power(Times(C2, p), CN1)), x),
                  Dist(d,
                      Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1)),
                          Plus(a, Times(b, ArcCos(Times(c, x)))), Power(x, CN1)), x),
                      x),
                  Dist(Times(b, c, Power(d, p), Power(Times(C2, p), CN1)),
                      Integrate(Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)), x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IGtQ(p, C0)))),
          IIntegrate(4685,
              Integrate(Times(
                  Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), p),
                              Plus(a, Times(b,
                                  ArcSin(Times(c, x)))),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(b, c, Power(d,
                                  p), Power(Times(f, Plus(m, C1)), CN1)),
                              Integrate(
                                  Times(
                                      Power(Times(f,
                                          x), Plus(m, C1)),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))),
                                          Subtract(p, C1D2))),
                                  x),
                              x)),
                      Negate(Dist(Times(C2, e, p, Power(Times(Sqr(f), Plus(m, C1)), CN1)),
                          Integrate(Times(Power(Times(f, x), Plus(m, C2)),
                              Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1)),
                              Plus(a, Times(b, ArcSin(Times(c, x))))), x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), IGtQ(p,
                          C0),
                      ILtQ(Times(C1D2, Plus(m, C1)), C0)))),
          IIntegrate(4686,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCos(
                          Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), p),
                              Plus(a, Times(b,
                                  ArcCos(Times(c, x)))),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, c, Power(d, p), Power(Times(f, Plus(m, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Times(f, x), Plus(m,
                                      C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2))),
                              x),
                          x),
                      Negate(Dist(Times(C2, e, p, Power(Times(Sqr(f), Plus(m, C1)), CN1)),
                          Integrate(Times(Power(Times(f, x), Plus(m, C2)),
                              Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1)),
                              Plus(a, Times(b, ArcCos(Times(c, x))))), x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), IGtQ(p,
                          C0),
                      ILtQ(Times(C1D2, Plus(m, C1)), C0)))),
          IIntegrate(4687,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcSin(
                          Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(List(Set(u,
                      IntHide(Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)),
                          x))),
                      Subtract(
                          Dist(Plus(a,
                              Times(b, ArcSin(Times(c, x)))), u, x),
                          Dist(Times(b, c),
                              Integrate(
                                  SimplifyIntegrand(
                                      Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                                      x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), IGtQ(p,
                          C0)))),
          IIntegrate(4688,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(u,
                              IntHide(
                                  Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)),
                                  x))),
                      Plus(Dist(Plus(a, Times(b, ArcCos(Times(c, x)))), u, x),
                          Dist(Times(b, c),
                              Integrate(SimplifyIntegrand(
                                  Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), IGtQ(p,
                          C0)))),
          IIntegrate(4689,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                          b_DEFAULT)),
                      Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(u,
                          IntHide(Times(Power(x, m), Power(Subtract(C1, Times(Sqr(c), Sqr(x))), p)),
                              x))),
                      Subtract(
                          Dist(Times(Power(d, p), Plus(a, Times(b, ArcSin(Times(c, x))))), u, x),
                          Dist(Times(b, c, Power(d, p)),
                              Integrate(SimplifyIntegrand(
                                  Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(Subtract(p, C1D2)), Or(
                          IGtQ(Times(C1D2, Plus(m, C1)),
                              C0),
                          ILtQ(Times(C1D2, Plus(m, Times(C2, p), C3)), C0)),
                      NeQ(p, Negate(C1D2)), GtQ(d, C0)))),
          IIntegrate(4690,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)),
                          b_DEFAULT)),
                      Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(u,
                              IntHide(
                                  Times(Power(x, m),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))), p)),
                                  x))),
                      Plus(Dist(Times(Power(d, p), Plus(a, Times(b, ArcCos(Times(c, x))))), u, x),
                          Dist(Times(b, c, Power(d, p)),
                              Integrate(SimplifyIntegrand(
                                  Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(Subtract(p,
                          C1D2)),
                      Or(IGtQ(Times(C1D2, Plus(m,
                          C1)), C0), ILtQ(Times(C1D2,
                              Plus(m, Times(C2, p), C3)), C0)),
                      NeQ(p, Negate(C1D2)), GtQ(d, C0)))),
          IIntegrate(4691,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                          b_DEFAULT)),
                      Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(u,
                              IntHide(
                                  Times(Power(x, m), Power(Subtract(C1, Times(Sqr(c), Sqr(x))), p)),
                                  x))),
                      Subtract(Dist(
                          Plus(a, Times(b, ArcSin(Times(c, x)))),
                          Integrate(Times(Power(x, m), Power(Plus(d, Times(e, Sqr(x))), p)), x), x),
                          Dist(Times(
                              b, c, Power(d, Subtract(p, C1D2)), Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                              Integrate(SimplifyIntegrand(
                                  Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IGtQ(Plus(p,
                          C1D2), C0),
                      Or(IGtQ(Times(C1D2, Plus(m, C1)), C0),
                          ILtQ(Times(C1D2, Plus(m, Times(C2, p), C3)), C0))))),
          IIntegrate(4692,
              Integrate(Times(
                  Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)), Power(x_, m_),
                  Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)), x_Symbol),
              Condition(
                  With(
                      List(
                          Set(u,
                              IntHide(
                                  Times(Power(x, m),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))), p)),
                                  x))),
                      Plus(Dist(Plus(a, Times(b, ArcCos(Times(c, x)))),
                          Integrate(Times(Power(x, m), Power(Plus(d, Times(e, Sqr(x))), p)), x), x),
                          Dist(
                              Times(b, c, Power(d, Subtract(p, C1D2)),
                                  Sqrt(Plus(d, Times(e, Sqr(x)))),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                              Integrate(SimplifyIntegrand(
                                  Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IGtQ(Plus(p, C1D2), C0),
                      Or(IGtQ(Times(C1D2, Plus(m, C1)), C0),
                          ILtQ(Times(C1D2, Plus(m, Times(C2, p), C3)), C0))))),
          IIntegrate(4693,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_), Sqrt(Plus(d_, Times(e_DEFAULT, Sqr(x_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)), Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Power(Plus(a,
                                  Times(b, ArcSin(Times(c, x)))), n),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(b, c, n, Sqrt(Plus(d, Times(e, Sqr(x)))),
                                  Power(
                                      Times(f, Plus(m, C1),
                                          Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x))))),
                                      CN1)),
                              Integrate(
                                  Times(
                                      Power(Times(f, x), Plus(m,
                                          C1)),
                                      Power(Plus(a, Times(b, ArcSin(Times(c, x)))),
                                          Subtract(n, C1))),
                                  x),
                              x)),
                      Dist(
                          Times(Sqr(c), Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Power(Times(Sqr(f), Plus(m, C1),
                                  Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x))))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C2)),
                                  Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), GtQ(n,
                          C0),
                      LtQ(m, CN1)))),
          IIntegrate(4694,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_), Sqrt(Plus(d_, Times(e_DEFAULT, Sqr(x_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(Times(f, x), Plus(m, C1)), Sqrt(Plus(d, Times(e,
                                  Sqr(x)))),
                              Power(Plus(a, Times(b,
                                  ArcCos(Times(c, x)))), n),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Dist(Times(b, c, n, Sqrt(Plus(d, Times(e, Sqr(x)))),
                          Power(Times(f, Plus(m, C1), Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x))))),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(a, Times(b, ArcCos(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x),
                      Dist(
                          Times(Sqr(c), Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Power(Times(Sqr(f), Plus(m, C1),
                                  Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x))))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C2)),
                                  Power(Plus(a, Times(b, ArcCos(Times(c, x)))), n),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), GtQ(n,
                          C0),
                      LtQ(m, CN1)))),
          IIntegrate(4695,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e,
                                  Sqr(x))), p),
                              Power(Plus(a,
                                  Times(b, ArcSin(Times(c, x)))), n),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Negate(
                          Dist(Times(C2, e, p, Power(Times(Sqr(f), Plus(m, C1)), CN1)),
                              Integrate(Times(Power(Times(f, x), Plus(m, C2)),
                                  Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1)), Power(
                                      Plus(a, Times(b, ArcSin(Times(c, x)))), n)),
                                  x),
                              x)),
                      Negate(Dist(
                          Times(b, c, n, Power(d, IntPart(p)),
                              Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(
                                  Times(f, Plus(m, C1),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcSin(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      GtQ(n, C0), GtQ(p, C0), LtQ(m, CN1)))),
          IIntegrate(4696,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT,
                          x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e,
                                  Sqr(x))), p),
                              Power(Plus(a,
                                  Times(b, ArcCos(Times(c, x)))), n),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Negate(Dist(Times(C2, e, p, Power(Times(Sqr(f), Plus(m, C1)), CN1)),
                          Integrate(Times(Power(Times(f, x), Plus(m, C2)),
                              Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1)), Power(
                                  Plus(a, Times(b, ArcCos(Times(c, x)))), n)),
                              x),
                          x)),
                      Dist(
                          Times(b, c, n, Power(d, IntPart(p)),
                              Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(
                                  Times(f, Plus(m, C1),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcCos(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      GtQ(n, C0), GtQ(p, C0), LtQ(m, CN1)))),
          IIntegrate(4697,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_), Sqrt(Plus(d_, Times(e_DEFAULT, Sqr(x_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(Times(f, x), Plus(m, C1)), Sqrt(Plus(d, Times(e,
                                  Sqr(x)))),
                              Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n),
                              Power(Times(f, Plus(m, C2)), CN1)),
                          x),
                      Dist(
                          Times(
                              Sqrt(Plus(d,
                                  Times(e, Sqr(x)))),
                              Power(
                                  Times(Plus(m, C2),
                                      Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x))))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n), Power(
                                      Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(b, c, n, Sqrt(Plus(d, Times(e, Sqr(x)))),
                                  Power(Times(f, Plus(m, C2),
                                      Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x))))), CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), Plus(m, C1)),
                                      Power(Plus(a, Times(b, ArcSin(Times(c, x)))),
                                          Subtract(n, C1))),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      GtQ(n, C0), Not(LtQ(m, CN1)), Or(RationalQ(m), EqQ(n, C1))))),
          IIntegrate(4698,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_), Sqrt(Plus(d_, Times(e_DEFAULT, Sqr(x_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(Times(f, x), Plus(m, C1)), Sqrt(Plus(d, Times(e,
                                  Sqr(x)))),
                              Power(Plus(a,
                                  Times(b, ArcCos(Times(c, x)))), n),
                              Power(Times(f, Plus(m, C2)), CN1)),
                          x),
                      Dist(
                          Times(
                              Sqrt(Plus(d,
                                  Times(e, Sqr(x)))),
                              Power(
                                  Times(Plus(m, C2), Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x))))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(a, Times(b,
                                      ArcCos(Times(c, x)))), n),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                              x),
                          x),
                      Dist(
                          Times(b, c, n, Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Power(
                                  Times(f, Plus(m, C2), Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x))))),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Times(f, x), Plus(m,
                                      C1)),
                                  Power(Plus(a, Times(b, ArcCos(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), GtQ(n,
                          C0),
                      Not(LtQ(m, CN1)), Or(RationalQ(m), EqQ(n, C1))))),
          IIntegrate(4699,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), p),
                              Power(Plus(a,
                                  Times(b, ArcSin(Times(c, x)))), n),
                              Power(Times(f, Plus(m, Times(C2, p), C1)), CN1)),
                          x),
                      Dist(Times(C2, d, p, Power(Plus(m, Times(C2, p), C1), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(d, Times(e, Sqr(x))), Subtract(p,
                                      C1)),
                                  Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n)),
                              x),
                          x),
                      Negate(Dist(Times(b, c, n, Power(d, IntPart(p)),
                          Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                          Power(
                              Times(f, Plus(m, Times(C2, p), C1),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p))),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p,
                                      C1D2)),
                                  Power(Plus(a, Times(b, ArcSin(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), GtQ(n, C0), GtQ(p,
                          C0),
                      Not(LtQ(m, CN1)), Or(RationalQ(m), EqQ(n, C1))))),
          IIntegrate(4700,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), p),
                              Power(Plus(a,
                                  Times(b, ArcCos(Times(c, x)))), n),
                              Power(Times(f, Plus(m, Times(C2, p), C1)), CN1)),
                          x),
                      Dist(
                          Times(C2, d, p, Power(Plus(m, Times(C2, p), C1),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1)), Power(
                                      Plus(a, Times(b, ArcCos(Times(c, x)))), n)),
                              x),
                          x),
                      Dist(
                          Times(b, c, n, Power(d, IntPart(p)),
                              Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(
                                  Times(f, Plus(m, Times(C2, p), C1),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcCos(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      GtQ(n, C0), GtQ(p, C0), Not(LtQ(m, CN1)), Or(RationalQ(m), EqQ(n, C1))))));
}
