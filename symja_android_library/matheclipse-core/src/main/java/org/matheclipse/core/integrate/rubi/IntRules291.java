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
class IntRules291 {
  public static IAST RULES =
      List(
          IIntegrate(5821,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), n_DEFAULT),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), m_DEFAULT), Power(
                          Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Plus(d,
                                  Times(e, Sqr(x))), p),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                          Power(Plus(f, Times(g, x)), m), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), EqQ(e, Times(Sqr(c), d)), IGtQ(m, C0),
                      IntegerQ(Plus(p,
                          C1D2)),
                      GtQ(d, C0), IGtQ(n, C0),
                      Or(And(EqQ(n, C1), GtQ(p, CN1)), GtQ(p, C0), EqQ(m, C1),
                          And(EqQ(m, C2), LtQ(p, CN2)))))),
          IIntegrate(5822,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true), x_)), p_),
                      Power(Plus($p("d2"), Times($p("e2", true), x_)), p_), Power(
                          Plus(f_, Times(g_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Plus($s("d1"), Times($s("e1"), x)), p),
                              Power(Plus($s("d2"), Times($s("e2"), x)),
                                  p),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          Power(Plus(f, Times(g, x)), m), x),
                      x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), IGtQ(m, C0),
                      IntegerQ(Plus(p, C1D2)), GtQ($s("d1"), C0), LtQ($s(
                          "d2"), C0),
                      IGtQ(n, C0), Or(
                          And(EqQ(n, C1), GtQ(p, CN1)), GtQ(p, C0), EqQ(m, C1), And(EqQ(m, C2),
                              LtQ(p, CN2)))))),
          IIntegrate(5823,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                              b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(f_DEFAULT,
                          Times(g_DEFAULT, x_)), m_),
                      Sqrt(Plus(d_, Times(e_DEFAULT, Sqr(x_))))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(f, Times(g, x)), m), Plus(d, Times(e, Sqr(x))),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Plus(n, C1)), Power(
                                  Times(b, c, Sqrt(d), Plus(n, C1)), CN1)),
                          x),
                      Dist(Power(Times(b, c, Sqrt(d), Plus(n, C1)), CN1),
                          Integrate(
                              Times(
                                  Plus(Times(d, g, m), Times(C2, e, f, x),
                                      Times(e, g, Plus(m, C2), Sqr(x))),
                                  Power(Plus(f, Times(g, x)), Subtract(m, C1)),
                                  Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), EqQ(e, Times(Sqr(c),
                      d)), ILtQ(m,
                          C0),
                      GtQ(d, C0), IGtQ(n, C0)))),
          IIntegrate(5824,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCosh(
                          Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Sqrt(Plus($p("d1"), Times($p("e1", true), x_))),
                      Sqrt(Plus($p("d2"),
                          Times($p("e2", true), x_))),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(f, Times(g, x)), m),
                              Plus(Times($s("d1"), $s("d2")), Times($s("e1"), $s("e2"), Sqr(x))),
                              Power(Plus(a, Times(b,
                                  ArcCosh(Times(c, x)))), Plus(n,
                                      C1)),
                              Power(Times(b, c, Sqrt(Times(CN1, $s("d1"), $s("d2"))), Plus(n, C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(Times(b, c, Sqrt(Times(CN1, $s("d1"), $s("d2"))),
                              Plus(n, C1)), CN1),
                          Integrate(
                              Times(
                                  Plus(Times($s("d1"), $s("d2"), g, m),
                                      Times(C2, $s("e1"), $s("e2"), f, x),
                                      Times($s("e1"), $s("e2"), g, Plus(m, C2), Sqr(x))),
                                  Power(Plus(f, Times(g, x)), Subtract(m,
                                      C1)),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"),
                          Times(c, $s("d2"))), C0),
                      ILtQ(m, C0), GtQ($s("d1"), C0), LtQ($s("d2"), C0), IGtQ(n, C0)))),
          IIntegrate(5825,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Plus(f_,
                          Times(g_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Sqrt(Plus(d, Times(e, Sqr(x)))), Power(
                                  Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                          Times(Power(Plus(f, Times(g, x)), m),
                              Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1D2))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), EqQ(e, Times(Sqr(c),
                      d)), IntegerQ(
                          m),
                      IGtQ(Plus(p, C1D2), C0), GtQ(d, C0), IGtQ(n, C0)))),
          IIntegrate(5826,
              Integrate(
                  Times(Power(
                      Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true), x_)), p_),
                      Power(Plus($p("d2"), Times($p("e2", true), x_)), p_), Power(
                          Plus(f_, Times(g_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(
                      Times(Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                          Sqrt(Plus($s("d2"), Times($s("e2"), x))),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                      Times(Power(Plus(f, Times(g, x)), m),
                          Power(Plus($s("d1"), Times($s("e1"), x)), Subtract(p,
                              C1D2)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), Subtract(p, C1D2))),
                      x), x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c,
                          $s("d2"))), C0),
                      IntegerQ(m), IGtQ(Plus(p,
                          C1D2), C0),
                      GtQ($s("d1"), C0), LtQ($s("d2"), C0), IGtQ(n, C0)))),
          IIntegrate(5827,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), n_DEFAULT),
                      Power(Plus(f_,
                          Times(g_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(f, Times(g, x)), m),
                              Power(Plus(d, Times(e, Sqr(
                                  x))), Plus(p, C1D2)),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Plus(n, C1)),
                              Power(Times(b, c, Sqrt(d), Plus(n, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(b, c, Sqrt(d),
                              Plus(n, C1)), CN1),
                          Integrate(
                              ExpandIntegrand(
                                  Times(Power(Plus(f, Times(g, x)), Subtract(m, C1)), Power(
                                      Plus(a, Times(b, ArcSinh(Times(c, x)))), Plus(n, C1))),
                                  Times(Plus(Times(d, g, m), Times(e, f, Plus(Times(C2, p),
                                      C1), x), Times(e, g, Plus(m, Times(C2, p), C1),
                                          Sqr(x))),
                                      Power(Plus(d, Times(e, Sqr(x))), Subtract(p, C1D2))),
                                  x),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), EqQ(e, Times(Sqr(c),
                      d)), ILtQ(m,
                          C0),
                      IGtQ(Subtract(p, C1D2), C0), GtQ(d, C0), IGtQ(n, C0)))),
          IIntegrate(5828,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT,
                              x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true), x_)), p_),
                      Power(Plus($p("d2"), Times($p("e2", true), x_)), p_), Power(
                          Plus(f_, Times(g_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(f, Times(g, x)), m),
                              Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1D2)),
                              Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1D2)),
                              Power(Plus(a, Times(b,
                                  ArcCosh(Times(c, x)))), Plus(n,
                                      C1)),
                              Power(
                                  Times(b, c, Sqrt(Times(CN1, $s("d1"),
                                      $s("d2"))), Plus(n,
                                          C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(Times(b, c, Sqrt(Times(CN1, $s("d1"), $s("d2"))), Plus(n, C1)),
                              CN1),
                          Integrate(
                              ExpandIntegrand(Times(
                                  Power(Plus(f, Times(g, x)), Subtract(m, C1)),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Plus(n, C1))),
                                  Times(
                                      Plus(Times($s("d1"), $s("d2"), g, m),
                                          Times($s("e1"), $s("e2"), f, Plus(Times(C2, p), C1), x),
                                          Times($s("e1"), $s("e2"), g, Plus(m, Times(C2, p), C1),
                                              Sqr(x))),
                                      Power(Plus($s("d1"), Times($s("e1"), x)), Subtract(p, C1D2)),
                                      Power(Plus($s("d2"), Times($s("e2"), x)), Subtract(p, C1D2))),
                                  x),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), ILtQ(m, C0),
                      IGtQ(Subtract(p,
                          C1D2), C0),
                      GtQ($s("d1"), C0), LtQ($s("d2"), C0), IGtQ(n, C0)))),
          IIntegrate(5829,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcSinh(
                          Times(c_DEFAULT, x_)), b_DEFAULT)), n_),
                      Power(Plus(f_,
                          Times(g_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(f, Times(g, x)), m),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Plus(n, C1)), Power(
                                  Times(b, c, Sqrt(d), Plus(n, C1)), CN1)),
                          x),
                      Dist(
                          Times(g, m, Power(Times(b, c, Sqrt(d), Plus(n, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(f, Times(g, x)), Subtract(m,
                                      C1)),
                                  Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), EqQ(e, Times(Sqr(c),
                      d)), IGtQ(m,
                          C0),
                      GtQ(d, C0), LtQ(n, CN1)))),
          IIntegrate(5830,
              Integrate(
                  Times(Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_),
                      Power(Plus($p("d1"), Times($p("e1", true),
                          x_)), CN1D2),
                      Power(Plus($p("d2"),
                          Times($p("e2", true), x_)), CN1D2),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(f, Times(g, x)), m),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Plus(n,
                                  C1)),
                              Power(
                                  Times(b, c, Sqrt(Times(CN1, $s("d1"),
                                      $s("d2"))), Plus(n,
                                          C1)),
                                  CN1)),
                          x),
                      Dist(
                          Times(g, m,
                              Power(Times(b, c, Sqrt(Times(CN1, $s("d1"), $s("d2"))), Plus(n, C1)),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(f, Times(g, x)), Subtract(m, C1)), Power(Plus(a,
                                      Times(b, ArcCosh(Times(c, x)))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), IGtQ(m, C0), GtQ($s("d1"),
                          C0),
                      LtQ($s("d2"), C0), LtQ(n, CN1)))),
          IIntegrate(5831,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Plus(f_,
                          Times(g_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(c, Plus(m, C1)),
                          Sqrt(d)), CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(a,
                                      Times(b, x)), n),
                                  Power(Plus(Times(c, f), Times(g, Sinh(x))), m)),
                              x),
                          x, ArcSinh(Times(c, x))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, n), x), EqQ(e, Times(Sqr(c), d)), IntegerQ(m),
                      GtQ(d, C0), Or(GtQ(m, C0), IGtQ(n, C0))))),
          IIntegrate(5832,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true), x_)), CN1D2),
                      Power(Plus($p("d2"),
                          Times($p("e2", true), x_)), CN1D2),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(c, Plus(m, C1)),
                          Sqrt(Times(CN1, $s("d1"), $s("d2")))), CN1),
                      Subst(
                          Integrate(
                              Times(Power(Plus(a, Times(b, x)), n),
                                  Power(Plus(Times(c, f), Times(g, Cosh(x))), m)),
                              x),
                          x, ArcCosh(Times(c, x))),
                      x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g, n), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), IntegerQ(m), GtQ($s(
                          "d1"), C0),
                      LtQ($s("d2"), C0), Or(GtQ(m, C0), IGtQ(n, C0))))),
          IIntegrate(5833,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), n_DEFAULT),
                      Power(Plus(f_,
                          Times(g_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))),
                                  n),
                              Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                          Times(Power(Plus(f, Times(g, x)), m),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1D2))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g), x), EqQ(e, Times(Sqr(
                      c), d)), IntegerQ(m), ILtQ(Plus(p,
                          C1D2), C0),
                      GtQ(d, C0), IGtQ(n, C0)))),
          IIntegrate(5834,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true), x_)), p_),
                      Power(Plus($p("d2"),
                          Times($p("e2", true), x_)), p_),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n),
                              Power(Times(Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                                  Sqrt(Plus($s("d2"), Times($s("e2"), x)))), CN1)),
                          Times(Power(Plus(f, Times(g, x)), m),
                              Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1D2)), Power(
                                  Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1D2))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), IntegerQ(m), ILtQ(Plus(p,
                          C1D2), C0),
                      GtQ($s("d1"), C0), LtQ($s("d2"), C0), IGtQ(n, C0)))),
          IIntegrate(5835,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcSinh(
                              Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(f_,
                          Times(g_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(d, IntPart(p)), Power(Plus(d,
                          Times(e, Sqr(x))), FracPart(p)), Power(
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), FracPart(p)), CN1)),
                      Integrate(
                          Times(
                              Power(Plus(f, Times(g,
                                  x)), m),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), p), Power(
                                  Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, n), x), EqQ(e, Times(Sqr(
                      c), d)), IntegerQ(m), IntegerQ(Subtract(p,
                          C1D2)),
                      Not(GtQ(d, C0))))),
          IIntegrate(5836,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                          b_DEFAULT)), n_DEFAULT),
                      Power(Plus(f_,
                          Times(g_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Negate(d), IntPart(p)),
                          Power(Plus(d,
                              Times(e, Sqr(x))), FracPart(p)),
                          Power(
                              Times(
                                  Power(Plus(C1, Times(c, x)), FracPart(p)), Power(
                                      Plus(CN1, Times(c, x)), FracPart(p))),
                              CN1)),
                      Integrate(
                          Times(Power(Plus(f, Times(g, x)), m), Power(Plus(C1, Times(c, x)), p),
                              Power(Plus(CN1, Times(c, x)), p),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g,
                      n), x), EqQ(Plus(Times(Sqr(c), d), e),
                          C0),
                      IntegerQ(m), IntegerQ(Subtract(p, C1D2))))),
          IIntegrate(5837,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true),
                          x_)), p_),
                      Power(Plus($p("d2"),
                          Times($p("e2", true), x_)), p_),
                      Power(Plus(f_, Times(g_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(CN1, $s("d1"), $s("d2")), IntPart(p)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), FracPart(p)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), FracPart(p)),
                          Power(Power(Subtract(C1, Times(Sqr(c), Sqr(x))), FracPart(p)), CN1)),
                      Integrate(
                          Times(Power(Plus(f, Times(g, x)), m), Power(Plus(C1, Times(c, x)), p),
                              Power(Plus(CN1, Times(c, x)), p),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g, n), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"), Times(c,
                          $s("d2"))), C0),
                      IntegerQ(m), IntegerQ(Subtract(p,
                          C1D2)),
                      Not(And(GtQ($s("d1"), C0), LtQ($s("d2"), C0)))))),
          IIntegrate(5838,
              Integrate(
                  Times(
                      Log(Times(h_DEFAULT,
                          Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), m_DEFAULT))),
                      Power(Plus(a_DEFAULT,
                          Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Log(Times(h, Power(Plus(f,
                                  Times(g, x)), m))),
                              Power(Plus(a, Times(b,
                                  ArcSinh(Times(c, x)))), Plus(n,
                                      C1)),
                              Power(Times(b, c, Sqrt(d), Plus(n, C1)), CN1)),
                          x),
                      Dist(Times(g, m, Power(Times(b, c, Sqrt(d), Plus(n, C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Plus(n, C1)),
                                  Power(Plus(f, Times(g, x)), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m), x), EqQ(e, Times(Sqr(c), d)),
                      GtQ(d, C0), IGtQ(n, C0)))),
          IIntegrate(5839,
              Integrate(
                  Times(
                      Log(Times(h_DEFAULT,
                          Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), m_DEFAULT))),
                      Power(Plus(a_DEFAULT,
                          Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                      Power(Plus($p("d1"), Times($p("e1", true), x_)), CN1D2), Power(
                          Plus($p("d2"), Times($p("e2", true), x_)), CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Log(Times(h, Power(Plus(f, Times(g, x)), m))),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Plus(n,
                                  C1)),
                              Power(
                                  Times(b, c, Sqrt(Times(CN1, $s("d1"),
                                      $s("d2"))), Plus(n,
                                          C1)),
                                  CN1)),
                          x),
                      Dist(
                          Times(g, m,
                              Power(Times(b, c, Sqrt(Times(CN1, $s("d1"), $s("d2"))), Plus(n, C1)),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))),
                                      Plus(n, C1)),
                                  Power(Plus(f, Times(g, x)), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, g, h, m), x),
                      EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                      EqQ(Plus($s("e2"),
                          Times(c, $s("d2"))), C0),
                      GtQ($s("d1"), C0), LtQ($s("d2"), C0), IGtQ(n, C0)))),
          IIntegrate(5840,
              Integrate(
                  Times(
                      Log(Times(h_DEFAULT,
                          Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), m_DEFAULT))),
                      Power(
                          Plus(a_DEFAULT,
                              Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          n_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(d, IntPart(p)), Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                          Power(Power(Plus(C1, Times(Sqr(c), Sqr(x))), FracPart(p)), CN1)),
                      Integrate(Times(Log(Times(h, Power(Plus(f, Times(g, x)), m))),
                          Power(Plus(C1, Times(Sqr(c), Sqr(x))), p),
                          Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), n)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x), EqQ(e, Times(Sqr(c), d)),
                      IntegerQ(Subtract(p, C1D2)), Not(GtQ(d, C0))))));
}
