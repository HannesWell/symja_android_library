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
class IntRules287 {
  public static IAST RULES = List(
      IIntegrate(5741,
          Integrate(Times(
              Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
              Power(
                  Times(f_DEFAULT, x_), m_),
              Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)), x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(
                          Power(Times(f, x), Plus(m, C1)), Power(Plus(d, Times(e,
                              Sqr(x))), p),
                          Power(Plus(a,
                              Times(b, ArcCosh(Times(c, x)))), n),
                          Power(Times(f, Plus(m, Times(C2, p), C1)), CN1)),
                      x),
                  Dist(
                      Times(C2, d, p, Power(Plus(m, Times(C2, p), C1),
                          CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e,
                                  Sqr(x))), Subtract(p,
                                      C1)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  Negate(
                      Dist(
                          Times(
                              b, c, n, Power(Negate(d),
                                  p),
                              Power(Times(f, Plus(m, Times(C2, p), C1)), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(C1, Times(c, x)), Subtract(p, C1D2)),
                                  Power(Plus(CN1, Times(c, x)), Subtract(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                  GtQ(n, C0), GtQ(p, C0), Not(LtQ(m, CN1)), IntegerQ(p), Or(RationalQ(m),
                      EqQ(n, C1))))),
      IIntegrate(5742, Integrate(
          Times(Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
              Power(Times(f_DEFAULT, x_), m_), Sqrt(Plus(d_, Times(e_DEFAULT, Sqr(x_))))),
          x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Power(Times(f, x), Plus(m, C1)), Sqrt(Plus(d, Times(e, Sqr(x)))),
                          Power(Plus(a, Times(b, ArcSinh(Times(c, x)))),
                              n),
                          Power(Times(f, Plus(m, C2)), CN1)),
                      x),
                  Dist(
                      Times(
                          Sqrt(Plus(d, Times(e,
                              Sqr(x)))),
                          Power(Times(Plus(m, C2), Sqrt(Plus(C1, Times(Sqr(c), Sqr(x))))), CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus(a,
                                  Times(b, ArcSinh(Times(c, x)))), n),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1D2)),
                          x),
                      x),
                  Negate(
                      Dist(
                          Times(b, c, n, Sqrt(Plus(d, Times(e, Sqr(x)))),
                              Power(
                                  Times(f, Plus(m, C2),
                                      Sqrt(Plus(C1, Times(Sqr(c), Sqr(x))))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c), d)), GtQ(n, C0),
                  Not(LtQ(m, CN1)), Or(RationalQ(m), EqQ(n, C1))))),
      IIntegrate(5743,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Sqrt(Plus($p("d1"),
                      Times($p("e1", true), x_))),
                  Sqrt(Plus($p("d2"), Times($p("e2", true), x_)))),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Power(Times(f, x), Plus(m, C1)),
                          Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                          Sqrt(Plus($s("d2"), Times($s("e2"),
                              x))),
                          Power(Plus(a,
                              Times(b, ArcCosh(Times(c, x)))), n),
                          Power(Times(f, Plus(m, C2)), CN1)),
                      x),
                  Negate(
                      Dist(
                          Times(Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                              Sqrt(Plus($s("d2"), Times($s("e2"), x))),
                              Power(Times(Plus(m, C2), Sqrt(Plus(C1, Times(c, x))),
                                  Sqrt(Plus(CN1, Times(c, x)))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n),
                                  Power(
                                      Times(Sqrt(Plus(C1, Times(c, x))),
                                          Sqrt(Plus(CN1, Times(c, x)))),
                                      CN1)),
                              x),
                          x)),
                  Negate(
                      Dist(Times(b, c, n, Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                          Sqrt(Plus($s("d2"), Times($s("e2"), x))),
                          Power(Times(f, Plus(m, C2), Sqrt(Plus(C1, Times(c, x))),
                              Sqrt(Plus(CN1, Times(c, x)))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, m), x),
                  EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), Not(LtQ(m, CN1)),
                  Or(RationalQ(m), EqQ(n, C1))))),
      IIntegrate(5744,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT,
                      x_), m_),
                  Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_DEFAULT)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(
                          Power(Times(f, x), Plus(m, C1)), Power(Plus(d, Times(e,
                              Sqr(x))), p),
                          Power(Plus(a,
                              Times(b, ArcSinh(Times(c, x)))), n),
                          Power(Times(f, Plus(m, Times(C2, p), C1)), CN1)),
                      x),
                  Dist(
                      Times(C2, d, p, Power(Plus(m, Times(C2, p), C1),
                          CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e,
                                  Sqr(x))), Subtract(p,
                                      C1)),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                          x),
                      x),
                  Negate(
                      Dist(
                          Times(b, c, n, Power(d, IntPart(p)),
                              Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(
                                  Times(f, Plus(m, Times(C2, p), C1),
                                      Power(Plus(C1, Times(Sqr(c), Sqr(x))), FracPart(p))),
                                  CN1)),
                          Integrate(Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c), d)), GtQ(n, C0),
                  GtQ(p, C0), Not(LtQ(m, CN1)), Or(RationalQ(m), EqQ(n, C1))))),
      IIntegrate(5745,
          Integrate(Times(
              Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
              Power(Times(f_DEFAULT, x_), m_), Power(Plus($p("d1"), Times($p("e1", true), x_)), p_),
              Power(Plus($p("d2"), Times($p("e2", true), x_)), p_)), x_Symbol),
          Condition(
              Plus(Simp(Times(Power(Times(f, x), Plus(m, C1)), Power(Plus($s("d1"), Times($s("e1"),
                  x)), p), Power(Plus($s("d2"), Times($s("e2"), x)), p), Power(Plus(a,
                      Times(b, ArcCosh(Times(c, x)))), n),
                  Power(Times(f, Plus(m, Times(C2, p), C1)), CN1)), x), Dist(
                      Times(C2, $s("d1"), $s("d2"), p, Power(Plus(m, Times(C2, p), C1),
                          CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus($s("d1"), Times($s("e1"), x)), Subtract(p, C1)),
                              Power(Plus($s("d2"), Times($s("e2"),
                                  x)), Subtract(p,
                                      C1)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  Negate(Dist(
                      Times(b, c, n, Power(Times(CN1, $s("d1"), $s("d2")), Subtract(p, C1D2)),
                          Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                          Sqrt(Plus($s("d2"), Times($s("e2"), x))),
                          Power(Times(f, Plus(m, Times(C2, p), C1), Sqrt(Plus(C1, Times(c, x))),
                              Sqrt(Plus(CN1, Times(c, x)))), CN1)),
                      Integrate(Times(Power(Times(f, x), Plus(m, C1)),
                          Power(Plus(CN1, Times(Sqr(c), Sqr(x))), Subtract(p, C1D2)),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))), x),
                      x))),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, m), x),
                  EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), GtQ(p, C0), Not(LtQ(m,
                      CN1)),
                  IntegerQ(Subtract(p, C1D2)), Or(RationalQ(m), EqQ(n, C1))))),
      IIntegrate(5746,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Power(Times(f, x), Plus(m, C1)),
                          Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))),
                              n),
                          Power(Times(d, f, Plus(m, C1)), CN1)),
                      x),
                  Dist(
                      Times(b, c, n, Power(Negate(
                          d), p), Power(Times(f, Plus(m, C1)),
                              CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(C1, Times(c, x)), Plus(p, C1D2)),
                              Power(Plus(CN1, Times(c,
                                  x)), Plus(p,
                                      C1D2)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                          x),
                      x),
                  Dist(
                      Times(
                          Sqr(c), Plus(m, Times(C2,
                              p), C3),
                          Power(Times(Sqr(f), Plus(m, C1)), CN1)),
                      Integrate(Times(Power(Times(f, x), Plus(m, C2)),
                          Power(Plus(d, Times(e, Sqr(x))), p),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)), x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, p), x), EqQ(Plus(Times(Sqr(c), d),
                  e), C0), GtQ(n,
                      C0),
                  LtQ(m, CN1), IntegerQ(m), IntegerQ(p)))),
      IIntegrate(5747,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Power(Times(f, x), Plus(m, C1)),
                          Power(Plus(d, Times(e,
                              Sqr(x))), Plus(p,
                                  C1)),
                          Power(Plus(a, Times(b, ArcSinh(Times(c, x)))),
                              n),
                          Power(Times(d, f, Plus(m, C1)), CN1)),
                      x),
                  Negate(
                      Dist(
                          Times(Sqr(c), Plus(m, Times(C2, p), C3), Power(Times(Sqr(f), Plus(m, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C2)),
                                  Power(Plus(d, Times(e,
                                      Sqr(x))), p),
                                  Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                              x),
                          x)),
                  Negate(Dist(
                      Times(b, c, n, Power(d, IntPart(p)),
                          Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                          Power(Times(f, Plus(m, C1),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), FracPart(p))), CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), Plus(p, C1D2)),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Subtract(n, C1))),
                          x),
                      x))),
              And(FreeQ(List(a, b, c, d, e, f, p), x), EqQ(e, Times(Sqr(c),
                  d)), GtQ(n,
                      C0),
                  LtQ(m, CN1), IntegerQ(m)))),
      IIntegrate(5748,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_),
                  Power(Plus($p("d1"),
                      Times($p("e1", true), x_)), p_),
                  Power(Plus($p("d2"), Times($p("e2", true), x_)), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Power(Times(f, x), Plus(m, C1)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))),
                              n),
                          Power(Times($s("d1"), $s("d2"), f, Plus(m, C1)), CN1)),
                      x),
                  Dist(
                      Times(
                          Sqr(c), Plus(m, Times(C2, p), C3), Power(Times(Sqr(f), Plus(m, C1)),
                              CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Plus(m, C2)),
                              Power(Plus($s("d1"), Times($s("e1"), x)), p),
                              Power(Plus($s("d2"), Times($s("e2"), x)), p), Power(
                                  Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  Dist(
                      Times(b, c, n, Power(Times(CN1, $s("d1"), $s("d2")), IntPart(p)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), FracPart(p)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), FracPart(p)),
                          Power(
                              Times(f, Plus(m, C1), Power(Plus(C1, Times(c, x)), FracPart(p)),
                                  Power(Plus(CN1, Times(c, x)), FracPart(p))),
                              CN1)),
                      Integrate(Times(Power(Times(f, x), Plus(m, C1)),
                          Power(Plus(CN1, Times(Sqr(c), Sqr(x))), Plus(p, C1D2)), Power(Plus(a,
                              Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, p), x),
                  EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), LtQ(m, CN1), IntegerQ(m),
                  IntegerQ(Plus(p, C1D2))))),
      IIntegrate(5749,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_),
                  Power(Plus($p("d1"), Times($p("e1", true), x_)), p_), Power(
                      Plus($p("d2"), Times($p("e2", true), x_)), p_)),
              x_Symbol),
          Condition(Plus(
              Simp(Times(Power(Times(f, x), Plus(m, C1)),
                  Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                  Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)),
                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n),
                  Power(Times($s("d1"), $s("d2"), f, Plus(m, C1)), CN1)), x),
              Dist(Times(Sqr(c), Plus(m, Times(C2, p), C3), Power(Times(Sqr(f), Plus(m, C1)), CN1)),
                  Integrate(
                      Times(Power(Times(f, x), Plus(m, C2)),
                          Power(Plus($s("d1"), Times($s("e1"),
                              x)), p),
                          Power(Plus($s("d2"),
                              Times($s("e2"), x)), p),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                      x),
                  x),
              Dist(
                  Times(b, c, n, Power(Times(CN1, $s("d1"), $s("d2")), IntPart(p)),
                      Power(Plus($s("d1"), Times($s("e1"), x)), FracPart(p)),
                      Power(Plus($s("d2"), Times($s("e2"), x)), FracPart(p)),
                      Power(
                          Times(f, Plus(m, C1), Power(Plus(C1, Times(c, x)), FracPart(p)),
                              Power(Plus(CN1, Times(c, x)), FracPart(p))),
                          CN1)),
                  Integrate(
                      Times(Power(Times(f, x), Plus(m, C1)),
                          Power(Plus(C1, Times(c, x)), Plus(p, C1D2)),
                          Power(Plus(CN1, Times(c, x)), Plus(p, C1D2)), Power(Plus(a,
                              Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                      x),
                  x)),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, p), x),
                  EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), LtQ(m,
                      CN1),
                  IntegerQ(m)))),
      IIntegrate(5750,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(f, Power(Times(f, x), Subtract(m, C1)),
                          Power(Plus(d, Times(e,
                              Sqr(x))), Plus(p,
                                  C1)),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))),
                              n),
                          Power(Times(C2, e, Plus(p, C1)), CN1)),
                      x),
                  Negate(
                      Dist(
                          Times(b, f, n, Power(Negate(
                              d), p), Power(Times(C2, c, Plus(p, C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C1)),
                                  Power(Plus(C1, Times(c, x)), Plus(p, C1D2)),
                                  Power(Plus(CN1, Times(c, x)), Plus(p,
                                      C1D2)),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x)),
                  Negate(Dist(Times(Sqr(f), Subtract(m, C1), Power(Times(C2, e, Plus(p, C1)), CN1)),
                      Integrate(Times(Power(Times(f, x), Subtract(m, C2)),
                          Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)), x),
                      x))),
              And(FreeQ(List(a, b, c, d, e, f), x), EqQ(Plus(Times(Sqr(c), d), e), C0), GtQ(n, C0),
                  LtQ(p, CN1), GtQ(m, C1), IntegerQ(p)))),
      IIntegrate(5751,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(f, Power(Times(f, x), Subtract(m, C1)),
                          Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                          Power(Plus(a, Times(b, ArcSinh(Times(c, x)))),
                              n),
                          Power(Times(C2, e, Plus(p, C1)), CN1)),
                      x),
                  Negate(
                      Dist(
                          Times(Sqr(f), Subtract(m, C1), Power(Times(C2, e, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C2)),
                                  Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)), Power(
                                      Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                              x),
                          x)),
                  Negate(
                      Dist(
                          Times(b, f, n, Power(d, IntPart(p)),
                              Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                              Power(
                                  Times(C2, c, Plus(p, C1),
                                      Power(Plus(C1, Times(Sqr(c), Sqr(x))), FracPart(p))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C1)),
                                  Power(Plus(C1, Times(Sqr(c), Sqr(x))), Plus(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f), x), EqQ(e, Times(Sqr(c),
                  d)), GtQ(n,
                      C0),
                  LtQ(p, CN1), GtQ(m, C1)))),
      IIntegrate(5752,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_),
                  Power(Plus($p("d1"),
                      Times($p("e1", true), x_)), p_),
                  Power(Plus($p("d2"), Times($p("e2", true), x_)), p_)),
              x_Symbol),
          Condition(Plus(
              Simp(Times(f, Power(Times(f, x), Subtract(m, C1)),
                  Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                  Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)),
                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n),
                  Power(Times(C2, $s("e1"), $s("e2"), Plus(p, C1)), CN1)), x),
              Negate(
                  Dist(
                      Times(Sqr(f), Subtract(m, C1),
                          Power(Times(C2, $s("e1"), $s("e2"), Plus(p, C1)), CN1)),
                      Integrate(Times(Power(Times(f, x), Subtract(m, C2)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)), Power(
                              Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x)),
              Negate(
                  Dist(
                      Times(b, f, n, Power(Times(CN1, $s("d1"), $s("d2")), IntPart(p)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), FracPart(p)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), FracPart(p)),
                          Power(Times(C2, c, Plus(p, C1), Power(Plus(C1, Times(c, x)), FracPart(p)),
                              Power(Plus(CN1, Times(c, x)), FracPart(p))), CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Subtract(m, C1)),
                              Power(Plus(CN1, Times(Sqr(c), Sqr(x))), Plus(p, C1D2)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                          x),
                      x))),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f), x),
                  EqQ(Subtract($s("e1"), Times(c,
                      $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), LtQ(p, CN1), GtQ(m, C1),
                  IntegerQ(Plus(p, C1D2))))),
      IIntegrate(5753,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_),
                  Power(Plus($p("d1"), Times($p("e1", true), x_)), p_),
                  Power(Plus($p("d2"), Times($p("e2", true), x_)), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(f, Power(Times(f, x), Subtract(m, C1)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)),
                          Power(Plus(a,
                              Times(b, ArcCosh(Times(c, x)))), n),
                          Power(Times(C2, $s("e1"), $s("e2"), Plus(p, C1)), CN1)),
                      x),
                  Negate(
                      Dist(
                          Times(
                              Sqr(f), Subtract(m, C1), Power(
                                  Times(C2, $s("e1"), $s("e2"), Plus(p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C2)),
                                  Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                                  Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)), Power(
                                      Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                              x),
                          x)),
                  Negate(Dist(
                      Times(b, f, n, Power(Times(CN1, $s("d1"), $s("d2")), IntPart(p)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), FracPart(p)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), FracPart(p)),
                          Power(Times(C2, c, Plus(p, C1), Power(Plus(C1, Times(c, x)), FracPart(p)),
                              Power(Plus(CN1, Times(c, x)), FracPart(p))), CN1)),
                      Integrate(Times(Power(Times(f, x), Subtract(m, C1)),
                          Power(Plus(C1, Times(c, x)), Plus(p, C1D2)),
                          Power(Plus(CN1, Times(c, x)), Plus(p, C1D2)),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))), x),
                      x))),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f), x),
                  EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), LtQ(p,
                      CN1),
                  Not(IntegerQ(p)), GtQ(m, C1)))),
      IIntegrate(5754, Integrate(
          Times(Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
              Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
          x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))),
                                  n),
                              Power(Times(C2, d, f, Plus(p, C1)), CN1)),
                          x)),
                  Dist(
                      Times(Plus(m, Times(C2,
                          p), C3), Power(Times(C2, d, Plus(p, C1)),
                              CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(p,
                                  C1)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  Negate(
                      Dist(
                          Times(b, c, n, Power(Negate(d), p), Power(Times(C2, f, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(C1, Times(c, x)), Plus(p, C1D2)),
                                  Power(Plus(CN1, Times(c, x)), Plus(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(Plus(Times(Sqr(c), d), e), C0),
                  GtQ(n, C0), LtQ(p, CN1), Not(GtQ(m, C1)), IntegerQ(p)))),
      IIntegrate(5755,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(p, C1)),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))),
                                  n),
                              Power(Times(C2, d, f, Plus(p, C1)), CN1)),
                          x)),
                  Dist(
                      Times(Plus(m, Times(C2,
                          p), C3), Power(Times(C2, d, Plus(p, C1)),
                              CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e, Sqr(x))), Plus(p,
                                  C1)),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), n)),
                          x),
                      x),
                  Dist(
                      Times(b, c, n, Power(d, IntPart(p)),
                          Power(Plus(d, Times(e, Sqr(x))), FracPart(p)),
                          Power(
                              Times(
                                  C2, f, Plus(p, C1), Power(Plus(C1, Times(Sqr(c), Sqr(x))),
                                      FracPart(p))),
                              CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), Plus(p, C1D2)),
                              Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Subtract(n, C1))),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ(e, Times(Sqr(c),
                  d)), GtQ(n, C0), LtQ(p, CN1), Not(
                      GtQ(m, C1)),
                  Or(IntegerQ(m), IntegerQ(p), EqQ(n, C1))))),
      IIntegrate(5756,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_),
                  Power(Plus($p("d1"),
                      Times($p("e1", true), x_)), p_),
                  Power(Plus($p("d2"), Times($p("e2", true), x_)), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(Times(Power(Times(f, x), Plus(m, C1)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n), Power(
                              Times(C2, $s("d1"), $s("d2"), f, Plus(p, C1)), CN1)),
                          x)),
                  Dist(
                      Times(
                          Plus(m, Times(C2, p), C3),
                          Power(Times(C2, $s("d1"), $s("d2"), Plus(p, C1)), CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                              Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p,
                                  C1)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  Negate(
                      Dist(Times(b, c, n, Power(Times(CN1, $s("d1"), $s("d2")), IntPart(p)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), FracPart(p)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), FracPart(p)),
                          Power(Times(C2, f, Plus(p, C1), Power(Plus(C1, Times(c, x)), FracPart(p)),
                              Power(Plus(CN1, Times(c, x)), FracPart(p))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(CN1, Times(Sqr(c), Sqr(x))), Plus(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, m), x),
                  EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), LtQ(p, CN1), Not(GtQ(m,
                      C1)),
                  Or(IntegerQ(m), EqQ(n, C1)), IntegerQ(Plus(p, C1D2))))),
      IIntegrate(5757,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT, x_)), b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_),
                  Power(Plus($p("d1"),
                      Times($p("e1", true), x_)), p_),
                  Power(Plus($p("d2"), Times($p("e2", true), x_)), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(Times(Power(Times(f, x), Plus(m, C1)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n),
                          Power(Times(C2, $s("d1"), $s("d2"), f, Plus(p, C1)), CN1)), x)),
                  Dist(
                      Times(
                          Plus(m, Times(C2, p), C3), Power(
                              Times(C2, $s("d1"), $s("d2"), Plus(p, C1)), CN1)),
                      Integrate(Times(Power(Times(f, x), m),
                          Power(Plus($s("d1"), Times($s("e1"), x)), Plus(p, C1)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), Plus(p, C1)), Power(
                              Plus(a, Times(b, ArcCosh(Times(c, x)))), n)),
                          x),
                      x),
                  Negate(
                      Dist(Times(b, c, n, Power(Times(CN1, $s("d1"), $s("d2")), IntPart(p)),
                          Power(Plus($s("d1"), Times($s("e1"), x)), FracPart(p)),
                          Power(Plus($s("d2"), Times($s("e2"), x)), FracPart(p)),
                          Power(Times(C2, f, Plus(p, C1), Power(Plus(C1, Times(c, x)), FracPart(p)),
                              Power(Plus(CN1, Times(c, x)), FracPart(p))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(C1, Times(c, x)), Plus(p, C1D2)),
                                  Power(Plus(CN1, Times(c, x)), Plus(p, C1D2)),
                                  Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, m), x),
                  EqQ(Subtract($s("e1"), Times(c, $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), LtQ(p, CN1), Not(
                      GtQ(m, C1)),
                  Or(IntegerQ(m), IntegerQ(p), EqQ(n, C1))))),
      IIntegrate(5758,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT,
                      x_), m_),
                  Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(f, Power(Times(f, x), Subtract(m, C1)), Sqrt(Plus(d, Times(e, Sqr(x)))),
                          Power(Plus(a,
                              Times(b, ArcSinh(Times(c, x)))), n),
                          Power(Times(e, m), CN1)),
                      x),
                  Negate(
                      Dist(
                          Times(Sqr(f), Subtract(m, C1), Power(Times(Sqr(c), m),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C2)),
                                  Power(Plus(a, Times(b, ArcSinh(Times(c, x)))),
                                      n),
                                  Power(Plus(d, Times(e, Sqr(x))), CN1D2)),
                              x),
                          x)),
                  Negate(
                      Dist(
                          Times(
                              b, f, n, Sqrt(Plus(C1, Times(Sqr(c), Sqr(x)))), Power(
                                  Times(c, m, Sqrt(Plus(d, Times(e, Sqr(x))))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, C1)),
                                  Power(Plus(a, Times(b, ArcSinh(Times(c, x)))), Subtract(n, C1))),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f), x), EqQ(e, Times(Sqr(c),
                  d)), GtQ(n,
                      C0),
                  GtQ(m, C1), IntegerQ(m)))),
      IIntegrate(5759,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCosh(Times(c_DEFAULT,
                      x_)), b_DEFAULT)), n_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_),
                  Power(Plus($p("d1"),
                      Times($p("e1", true), x_)), CN1D2),
                  Power(Plus($p("d2"), Times($p("e2", true), x_)), CN1D2)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(f, Power(Times(f, x), Subtract(m, C1)),
                          Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                          Sqrt(Plus($s("d2"), Times($s("e2"),
                              x))),
                          Power(Plus(a, Times(b, ArcCosh(Times(c, x)))),
                              n),
                          Power(Times($s("e1"), $s("e2"), m), CN1)),
                      x),
                  Dist(
                      Times(Sqr(f), Subtract(m, C1), Power(Times(Sqr(c), m),
                          CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Subtract(m, C2)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), n),
                              Power(
                                  Times(Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                                      Sqrt(Plus($s("d2"), Times($s("e2"), x)))),
                                  CN1)),
                          x),
                      x),
                  Dist(
                      Times(b, f, n, Sqrt(Plus($s("d1"), Times($s("e1"), x))),
                          Sqrt(Plus($s("d2"), Times($s("e2"), x))),
                          Power(
                              Times(c, $s("d1"), $s("d2"), m, Sqrt(Plus(C1, Times(c, x))),
                                  Sqrt(Plus(CN1, Times(c, x)))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(f, x), Subtract(m,
                                  C1)),
                              Power(Plus(a, Times(b, ArcCosh(Times(c, x)))), Subtract(n, C1))),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f), x),
                  EqQ(Subtract($s("e1"), Times(c,
                      $s("d1"))), C0),
                  EqQ(Plus($s("e2"), Times(c, $s("d2"))), C0), GtQ(n, C0), GtQ(m,
                      C1),
                  IntegerQ(m)))),
      IIntegrate(5760,
          Integrate(
              Times(Power(Plus(a_DEFAULT, Times(ArcSinh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                  n_DEFAULT), Power(x_, m_), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Dist(Power(Times(Power(c, Plus(m, C1)), Sqrt(d)), CN1),
                  Subst(Integrate(Times(Power(Plus(a, Times(b, x)), n), Power(Sinh(x), m)), x), x,
                      ArcSinh(Times(c, x))),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), EqQ(e, Times(Sqr(c), d)), GtQ(d, C0), IGtQ(n, C0),
                  IntegerQ(m)))));
}
