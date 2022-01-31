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
class IntRules289 {
  public static IAST RULES =
      List(
          IIntegrate(5781,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(x_, m_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true), x_)), p_DEFAULT), Power(Plus(
                          $p("d2"), Times($p("e2", true), x_)), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(CN1, $s("d1"), $s("d2")), p), Power(Power(c, Plus(m, C1)),
                              CN1)),
                      Subst(
                          Integrate(
                              Times(Power(Plus(a, Times(b, x)), n), Power(Cosh(x), m),
                                  Power(Sinh(x), Plus(Times(C2, p), C1))),
                              x),
                          x, ArcCosh(Times(c, x))),
                      x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), n), x),
                      EqQ(Subtract($s("e1"), Times(c, $s(
                          "d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c,
                          $s("d2"))), C0),
                      IntegerQ(Plus(p, C1D2)), GtQ(p, CN1), IGtQ(m, C0), And(GtQ($s("d1"), C0),
                          LtQ($s("d2"), C0))))),
          IIntegrate(5782,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_),
                      Power(x_, m_DEFAULT), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(d, IntPart(p)), Power(Plus(d, Times(e,
                              Sqr(x))), FracPart(
                                  p)),
                          Power(Power(Plus(C1, Times(Sqr(c), Sqr(x))), FracPart(p)), CN1)),
                      Integrate(
                          Times(
                              Power(x, m), Power(Plus(C1,
                                  Times(Sqr(c), Sqr(x))), p),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ(e, Times(Sqr(c), d)),
                      IntegerQ(Times(C2, p)), GtQ(p, CN1), IGtQ(m,
                          C0),
                      Not(Or(IntegerQ(p), GtQ(d, C0)))))),
          IIntegrate(5783,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT,
                          x_)), b_DEFAULT)), n_DEFAULT),
                      Power(x_, m_DEFAULT),
                      Power(Plus($p("d1"),
                          Times($p("e1", true), x_)), p_DEFAULT),
                      Power(Plus($p("d2"), Times($p("e2", true), x_)), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(CN1, $s("d1"), $s("d2")), IntPart(p)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), FracPart(p)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), FracPart(p)),
                          Power(Times(Power(Plus(C1, Times(c, x)), FracPart(p)),
                              Power(Plus(CN1, Times(c, x)), FracPart(p))), CN1)),
                      Integrate(
                          Times(Power(x, m), Power(Plus(C1, Times(c, x)), p),
                              Power(Plus(CN1, Times(c, x)), p), Power(
                                  Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), n), x),
                      EqQ(Subtract($s("e1"), Times(c, $s(
                          "d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), IntegerQ(Times(C2, p)),
                      GtQ(p, CN1), IGtQ(m, C0), Not(Or(IntegerQ(p),
                          And(GtQ($s("d1"), C0), LtQ($s("d2"), C0))))))),
          IIntegrate(5784,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))),
                                  n),
                              Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                          Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1D2))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), EqQ(e, Times(Sqr(c), d)), GtQ(d, C0),
                      IGtQ(Plus(p, C1D2), C0), Not(IGtQ(Times(C1D2, Plus(m, C1)), C0)), Or(
                          EqQ(m, CN1), EqQ(m, CN2))))),
          IIntegrate(5785,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus($p("d1"), Times($p("e1", true), x_)), p_),
                      Power(Plus($p("d2"), Times($p("e2", true), x_)), p_)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(
                      Times(Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n),
                          Power(Times(Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                              Sqrt(Plus($s("d2"), Times($s("e2"), x)))), CN1)),
                      Times(Power(Times(f, x), m),
                          Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1D2)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1D2))),
                      x), x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, m, n), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ($s("d1"), C0),
                      LtQ($s("d2"), C0), IGtQ(Plus(p, C1D2), C0), Not(IGtQ(Times(C1D2, Plus(m, C1)),
                          C0)),
                      Or(EqQ(m, CN1), EqQ(m, CN2))))),
          IIntegrate(5786,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCosh(
                          Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(Times(f_DEFAULT, x_), m_DEFAULT), Plus(d_, Times(e_DEFAULT, Sqr(x_)))),
                  x_Symbol),
              Condition(Plus(
                  Simp(Times(
                      d, Power(Times(f, x), Plus(m, C1)), Plus(a, Times(b, ArcCosh(Times(c, x)))),
                      Power(Times(f, Plus(m, C1)), CN1)), x),
                  Negate(Dist(Times(b, c, Power(Times(f, Plus(m, C1), Plus(m, C3)), CN1)),
                      Integrate(Times(Power(Times(f, x), Plus(m, C1)),
                          Plus(Times(d, Plus(m, C3)), Times(e, Plus(m, C1), Sqr(x))),
                          Power(Times(Sqrt(Plus(C1, Times(c, x))), Sqrt(Plus(CN1, Times(c, x)))),
                              CN1)),
                          x),
                      x)),
                  Simp(
                      Times(e, Power(Times(f, x), Plus(m, C3)),
                          Plus(a, Times(b, ArcCosh(Times(c, x)))), Power(
                              Times(Power(f, C3), Plus(m, C3)), CN1)),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), NeQ(Plus(Times(Sqr(c), d), e), C0),
                      NeQ(m, CN1), NeQ(m, CN3)))),
          IIntegrate(5787,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), x_,
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                              Plus(a, Times(b,
                                  ArcSinh(Times(c, x)))),
                              Power(Times(C2, e, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, c, Power(Times(C2, e, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(d, Times(e, Sqr(x))), Plus(p,
                                      C1)),
                                  Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), NeQ(e, Times(Sqr(c), d)), NeQ(p, CN1)))),
          IIntegrate(5788,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                          b_DEFAULT)),
                      x_, Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                              Plus(a, Times(b, ArcCosh(Times(c, x)))), Power(
                                  Times(C2, e, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, c, Power(Times(C2, e, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                                  Power(
                                      Times(Sqrt(Plus(C1, Times(c, x))),
                                          Sqrt(Plus(CN1, Times(c, x)))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Plus(Times(Sqr(c), d),
                      e), C0), NeQ(p,
                          CN1)))),
          IIntegrate(5789,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(List(Set(u,
                      IntHide(Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)),
                          x))),
                      Subtract(Dist(Plus(a, Times(b, ArcSinh(Times(c, x)))), u, x),
                          Dist(Times(b, c),
                              Integrate(
                                  SimplifyIntegrand(
                                      Times(u, Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1D2)), x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), NeQ(e, Times(Sqr(c),
                      d)), IntegerQ(p), Or(
                          GtQ(p, C0), And(IGtQ(Times(C1D2, Subtract(m, C1)), C0),
                              LeQ(Plus(m, p), C0)))))),
          IIntegrate(5790,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCosh(
                          Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(u,
                          IntHide(Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)),
                              x))),
                      Subtract(
                          Dist(Plus(a,
                              Times(b, ArcCosh(Times(c, x)))), u, x),
                          Dist(Times(b, c),
                              Integrate(
                                  SimplifyIntegrand(
                                      Times(u,
                                          Power(Times(Sqrt(Plus(C1, Times(c, x))),
                                              Sqrt(Plus(CN1, Times(c, x)))), CN1)),
                                      x),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), NeQ(Plus(Times(Sqr(c), d), e), C0),
                      IntegerQ(p), Or(
                          GtQ(p, C0), And(IGtQ(Times(C1D2, Subtract(m, C1)), C0),
                              LeQ(Plus(m, p), C0)))))),
          IIntegrate(5791,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Power(Plus(a,
                              Times(b, ArcSinh(Times(c, x)))), n),
                          Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(e, Times(Sqr(c), d)), IGtQ(n, C0),
                      IntegerQ(p), IntegerQ(m)))),
          IIntegrate(5792,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n), Times(Power(
                              Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Plus(Times(Sqr(c), d),
                      e), C0), IGtQ(n,
                          C0),
                      IntegerQ(p), IntegerQ(m)))),
          IIntegrate(5793,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(f, x), m), Power(Plus(d, Times(e, Sqr(x))),
                              p),
                          Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(5794,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(f, x), m), Power(Plus(d,
                              Times(e, Sqr(x))), p),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), IntegerQ(p)))),
          IIntegrate(5795,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true),
                          x_)), p_DEFAULT),
                      Power(Plus($p("d2"), Times($p("e2", true), x_)), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Times(f, x), m), Power(Plus($s("d1"), Times($s("e1"), x)), p),
                          Power(Plus($s("d2"), Times($s("e2"), x)),
                              p),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                      x),
                  FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, m, n, p), x))),
          IIntegrate(5796,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(h_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, x_)),
                          p_),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), q_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(CN1, Sqr(d), g,
                          Power(e, CN1)), q),
                      Integrate(
                          Times(Power(Times(h, x), m), Power(Plus(d, Times(e, x)), Subtract(p, q)),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), q), Power(
                                  Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x),
                      EqQ(Plus(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(Sqr(c),
                          Sqr(d)), Sqr(e)), C0),
                      HalfIntegerQ(p, q), GeQ(Subtract(p, q), C0), GtQ(d,
                          C0),
                      LtQ(Times(g, Power(e, CN1)), C0)))),
          IIntegrate(5797,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
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
                          Power(Power(Plus(C1, Times(Sqr(c), Sqr(x))), FracPart(q)), CN1)),
                      Integrate(
                          Times(
                              Power(Times(h, x), m), Power(Plus(d, Times(e,
                                  x)), Subtract(p,
                                      q)),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), q), Power(
                                  Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x),
                      EqQ(Plus(Times(e, f), Times(d, g)), C0),
                      EqQ(Plus(Times(Sqr(c), Sqr(d)), Sqr(e)), C0), HalfIntegerQ(p,
                          q),
                      GeQ(Subtract(p, q), C0)))),
          IIntegrate(5798,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Negate(d), IntPart(p)),
                          Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                          Power(
                              Times(Power(Plus(C1, Times(c, x)), FracPart(p)),
                                  Power(Plus(CN1, Times(c, x)), FracPart(p))),
                              CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m), Power(Plus(C1, Times(c, x)), p),
                              Power(Plus(CN1, Times(c, x)), p), Power(
                                  Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                      Not(IntegerQ(p))))),
          IIntegrate(5799,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), CN1)),
                  x_Symbol),
              Condition(
                  Subst(
                      Integrate(Times(Power(Plus(a, Times(b, x)), n), Cosh(x),
                          Power(Plus(Times(c, d), Times(e, Sinh(x))), CN1)), x),
                      x, ArcSinh(Times(c, x))),
                  And(FreeQ(List(a, b, c, d, e), x), IGtQ(n, C0)))),
          IIntegrate(5800,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), CN1)),
                  x_Symbol),
              Condition(Subst(
                  Integrate(Times(Power(Plus(a, Times(b, x)), n), Sinh(x),
                      Power(Plus(Times(c, d), Times(e, Cosh(x))), CN1)), x),
                  x, ArcCosh(Times(c, x))), And(FreeQ(List(a, b, c, d, e), x), IGtQ(n, C0)))));
}
