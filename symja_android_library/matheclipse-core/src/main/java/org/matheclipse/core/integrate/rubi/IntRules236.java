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
class IntRules236 {
  public static IAST RULES =
      List(
          IIntegrate(4721,
              Integrate(
                  Times(Power(Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)), n_),
                      Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), m), Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x)))),
                              Power(Plus(d, Times(e, Sqr(
                                  x))), p),
                              Power(Plus(a, Times(b,
                                  ArcSin(Times(c, x)))), Plus(n,
                                      C1)),
                              Power(Times(b, c, Plus(n, C1)), CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(f, m, Power(d, IntPart(p)),
                                  Power(Plus(d, Times(e, Sqr(x))), FracPart(p)), Power(Times(b, c,
                                      Plus(n, C1), Power(Subtract(C1, Times(Sqr(c), Sqr(x))),
                                          FracPart(p))),
                                      CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), Subtract(m, C1)),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p,
                                          C1D2)),
                                      Power(Plus(a, Times(b, ArcSin(Times(c, x)))), Plus(n, C1))),
                                  x),
                              x)),
                      Dist(
                          Times(c, Plus(m, Times(C2, p), C1), Power(d, IntPart(p)),
                              Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(
                                  Times(b, f, Plus(n, C1),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcSin(Times(c, x)))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), LtQ(n,
                          CN1),
                      IGtQ(m, CN3), IGtQ(Times(C2, p), C0)))),
          IIntegrate(4722,
              Integrate(
                  Times(Power(Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)), n_),
                      Power(Times(f_DEFAULT, x_), m_DEFAULT), Power(
                          Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Times(f, x), m),
                                  Sqrt(Subtract(C1, Times(Sqr(c), Sqr(x)))),
                                  Power(Plus(d, Times(e, Sqr(x))), p),
                                  Power(Plus(a, Times(b,
                                      ArcCos(Times(c, x)))), Plus(n,
                                          C1)),
                                  Power(Times(b, c, Plus(n, C1)), CN1)),
                              x)),
                      Dist(
                          Times(f, m, Power(d, IntPart(p)),
                              Power(Plus(d, Times(e,
                                  Sqr(x))), FracPart(
                                      p)),
                              Power(
                                  Times(
                                      b, c, Plus(n, C1), Power(Subtract(C1, Times(Sqr(c), Sqr(x))),
                                          FracPart(p))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C1)),
                                  Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcCos(Times(c, x)))), Plus(n, C1))),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(c, Plus(m, Times(C2, p), C1), Power(d, IntPart(p)),
                                  Power(Plus(d, Times(e,
                                      Sqr(x))), FracPart(
                                          p)),
                                  Power(
                                      Times(b, f, Plus(n, C1),
                                          Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p))),
                                      CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), Plus(m, C1)),
                                      Power(Subtract(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)),
                                      Power(Plus(a, Times(b, ArcCos(Times(c, x)))), Plus(n, C1))),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d),
                      e), C0), LtQ(n,
                          CN1),
                      IGtQ(m, CN3), IGtQ(Times(C2, p), C0)))),
          IIntegrate(4723,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(x_, m_DEFAULT), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(d, p), Power(Power(c, Plus(m, C1)),
                          CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, x)), n), Power(Sin(x), m), Power(Cos(x),
                                      Plus(Times(C2, p), C1))),
                              x),
                          x, ArcSin(Times(c, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(Times(C2, p)), GtQ(p, CN1), IGtQ(m, C0),
                      Or(IntegerQ(p), GtQ(d, C0))))),
          IIntegrate(4724,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(x_, m_DEFAULT), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(Power(d, p), Power(Power(c, Plus(m, C1)),
                              CN1)),
                          Subst(
                              Integrate(
                                  Times(Power(Plus(a, Times(b, x)), n), Power(Cos(x), m),
                                      Power(Sin(x), Plus(Times(C2, p), C1))),
                                  x),
                              x, ArcCos(Times(c, x))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(Times(C2, p)), GtQ(p, CN1), IGtQ(m, C0), Or(IntegerQ(p),
                          GtQ(d, C0))))),
          IIntegrate(4725,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), n_),
                      Power(x_, m_DEFAULT), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(d, IntPart(p)), Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                          Power(Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p)), CN1)),
                      Integrate(
                          Times(Power(x, m), Power(Subtract(C1, Times(Sqr(c), Sqr(x))), p),
                              Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(Times(C2,
                          p)),
                      GtQ(p, CN1), IGtQ(m, C0), Not(Or(IntegerQ(p), GtQ(d, C0)))))),
          IIntegrate(4726,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_),
                      Power(x_, m_DEFAULT), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(d, IntPart(p)), Power(Plus(d, Times(e, Sqr(x))), FracPart(
                              p)),
                          Power(Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p)), CN1)),
                      Integrate(
                          Times(Power(x, m), Power(Subtract(C1, Times(Sqr(c), Sqr(x))), p),
                              Power(Plus(a, Times(b, ArcCos(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(Times(C2,
                          p)),
                      GtQ(p, CN1), IGtQ(m, C0), Not(Or(IntegerQ(p), GtQ(d, C0)))))),
          IIntegrate(4727,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Plus(a, Times(b, ArcSin(Times(c, x)))),
                                  n),
                              Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                          Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1D2))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      GtQ(d, C0), IGtQ(Plus(p, C1D2), C0), Not(IGtQ(Times(C1D2, Plus(m, C1)),
                          C0)),
                      Or(EqQ(m, CN1), EqQ(m, CN2))))),
          IIntegrate(4728,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(Integrate(ExpandIntegrand(
                  Times(Power(Plus(a, Times(b, ArcCos(Times(c, x)))), n),
                      Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                  Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1D2))), x),
                  x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      GtQ(d, C0), IGtQ(Plus(p, C1D2), C0), Not(IGtQ(Times(C1D2, Plus(m, C1)),
                          C0)),
                      Or(EqQ(m, CN1), EqQ(m, CN2))))),
          IIntegrate(4729,
              Integrate(Times(Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)), x_,
                  Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)), x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                          Plus(a, Times(b, ArcSin(Times(c, x)))),
                          Power(Times(C2, e, Plus(p, C1)), CN1)), x),
                      Dist(Times(b, c, Power(Times(C2, e, Plus(p, C1)), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Plus(Times(Sqr(c), d),
                      e), C0), NeQ(p,
                          CN1)))),
          IIntegrate(4730,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)), x_,
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                              Plus(a, Times(b, ArcCos(Times(c, x)))), Power(
                                  Times(C2, e, Plus(p, C1)), CN1)),
                          x),
                      Dist(Times(b, c, Power(Times(C2, e, Plus(p, C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)), Power(
                                      Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Plus(Times(Sqr(c), d),
                      e), C0), NeQ(p,
                          CN1)))),
          IIntegrate(4731,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(u,
                              IntHide(
                                  Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)),
                                  x))),
                      Subtract(Dist(Plus(a, Times(b, ArcSin(Times(c, x)))), u, x),
                          Dist(Times(b, c),
                              Integrate(SimplifyIntegrand(
                                  Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), NeQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(p),
                      Or(GtQ(p, C0), And(IGtQ(Times(C1D2, Subtract(m, C1)), C0),
                          LeQ(Plus(m, p), C0)))))),
          IIntegrate(4732,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(With(
                  List(Set(u,
                      IntHide(Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)),
                          x))),
                  Plus(Dist(Plus(a, Times(b, ArcCos(Times(c, x)))), u, x), Dist(Times(b, c),
                      Integrate(SimplifyIntegrand(
                          Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x), x),
                      x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), NeQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(p),
                      Or(GtQ(p, C0), And(IGtQ(Times(C1D2, Subtract(m, C1)), C0),
                          LeQ(Plus(m, p), C0)))))),
          IIntegrate(4733,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Power(Plus(a,
                              Times(b, ArcSin(Times(c, x)))), n),
                          Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Plus(Times(Sqr(c), d), e), C0),
                      IGtQ(n, C0), IntegerQ(p), IntegerQ(m)))),
          IIntegrate(4734,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcCos(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(Integrate(ExpandIntegrand(Power(Plus(a, Times(b, ArcCos(Times(c, x)))), n),
                  Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)), x), x), And(
                      FreeQ(List(a, b, c, d, e, f), x), NeQ(Plus(Times(Sqr(c), d), e), C0), IGtQ(n,
                          C0),
                      IntegerQ(p), IntegerQ(m)))),
          IIntegrate(4735,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcSin(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))),
                              p),
                          Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(4736,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p),
                          Power(Plus(a, Times(b, ArcCos(Times(c, x)))), n)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(4737,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(h_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_,
                          Times(e_DEFAULT, x_)), p_),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), q_)),
                  x_Symbol),
              Condition(
                  Dist(Power(Times(CN1, Sqr(d), g, Power(e, CN1)), q),
                      Integrate(
                          Times(Power(Times(h, x), m), Power(Plus(d, Times(e, x)), Subtract(p, q)),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), q),
                              Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x),
                      EqQ(Plus(Times(e, f), Times(d, g)), C0),
                      EqQ(Subtract(Times(Sqr(c), Sqr(d)),
                          Sqr(e)), C0),
                      HalfIntegerQ(p, q), GeQ(Subtract(p,
                          q), C0),
                      GtQ(d, C0), LtQ(Times(g, Power(e, CN1)), C0)))),
          IIntegrate(4738,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(h_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_,
                          Times(e_DEFAULT, x_)), p_),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), q_)),
                  x_Symbol),
              Condition(Dist(Power(Times(CN1, Sqr(d), g, Power(e, CN1)), q),
                  Integrate(
                      Times(Power(Times(h, x), m), Power(Plus(d, Times(e, x)), Subtract(p, q)),
                          Power(Subtract(C1, Times(Sqr(c), Sqr(x))), q),
                          Power(Plus(a, Times(b, ArcCos(Times(c, x)))), n)),
                      x),
                  x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x),
                      EqQ(Plus(Times(e, f), Times(d, g)), C0),
                      EqQ(Subtract(Times(Sqr(c),
                          Sqr(d)), Sqr(e)), C0),
                      HalfIntegerQ(p, q), GeQ(Subtract(p,
                          q), C0),
                      GtQ(d, C0), LtQ(Times(g, Power(e, CN1)), C0)))),
          IIntegrate(4739,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSin(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(h_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_,
                          Times(e_DEFAULT, x_)), p_),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), q_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(CN1, Sqr(d), g, Power(e, CN1)), IntPart(q)),
                          Power(Plus(d, Times(e, x)), FracPart(q)),
                          Power(Plus(f, Times(g, x)), FracPart(
                              q)),
                          Power(Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(q)), CN1)),
                      Integrate(
                          Times(Power(Times(h, x), m), Power(Plus(d, Times(e, x)), Subtract(p, q)),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), q),
                              Power(Plus(a, Times(b, ArcSin(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x),
                      EqQ(Plus(Times(e, f), Times(d,
                          g)), C0),
                      EqQ(Subtract(Times(Sqr(c), Sqr(
                          d)), Sqr(
                              e)),
                          C0),
                      HalfIntegerQ(p, q), GeQ(Subtract(p, q), C0)))),
          IIntegrate(4740,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCos(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(h_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_,
                          Times(e_DEFAULT, x_)), p_),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), q_)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(Times(CN1, Sqr(d), g, Power(e, CN1)), IntPart(q)),
                      Power(Plus(d, Times(e, x)), FracPart(q)),
                      Power(Plus(f, Times(g, x)), FracPart(q)),
                      Power(Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(q)), CN1)),
                      Integrate(
                          Times(Power(Times(h, x), m), Power(Plus(d, Times(e, x)), Subtract(p, q)),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), q),
                              Power(Plus(a, Times(b, ArcCos(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x),
                      EqQ(Plus(Times(e, f), Times(d, g)), C0),
                      EqQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0), HalfIntegerQ(p, q),
                      GeQ(Subtract(p, q), C0)))));
}
