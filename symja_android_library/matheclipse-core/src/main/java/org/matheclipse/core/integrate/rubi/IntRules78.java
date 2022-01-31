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
class IntRules78 {
  public static IAST RULES =
      List(
          IIntegrate(1561,
              Integrate(Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT), Power(
                      Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))), q),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, n, p, q), x), EqQ($s("n2"), Times(C2, n)),
                      Or(IGtQ(p, C0), IGtQ(q, C0))))),
          IIntegrate(1562,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Times(f,
                          x), m), Power(Power(x, m),
                              CN1)),
                      Integrate(
                          ExpandIntegrand(
                              Times(Power(x, m),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p)),
                              Power(
                                  Subtract(
                                      Times(d,
                                          Power(Subtract(Sqr(d),
                                              Times(Sqr(e), Power(x, Times(C2, n)))), CN1)),
                                      Times(e, Power(x, n),
                                          Power(Subtract(Sqr(d),
                                              Times(Sqr(e), Power(x, Times(C2, n)))), CN1))),
                                  Negate(q)),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, n,
                      p), x), EqQ($s("n2"),
                          Times(C2, n)),
                      Not(IntegerQ(p)), ILtQ(q, C0)))),
          IIntegrate(1563,
              Integrate(Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                      Power(x_, n_))), p_DEFAULT),
                  Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)), x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(f, x), m), Power(Plus(d,
                              Times(e, Power(x, n))), q),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p, q), x), EqQ($s("n2"), Times(C2, n))))),
          IIntegrate(1564,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(Times(Power(Times(f, x), m),
                      Power(Plus(d, Times(e, Power(x, n))),
                          q),
                      Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p)), x),
                  And(FreeQ(List(a, c, d, e, f, m, n, p, q), x), EqQ($s("n2"), Times(C2, n))))),
          IIntegrate(1565,
              Integrate(
                  Times(Power(u_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(v_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(v_, n_))),
                          p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(v_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(u, m), Power(Times(Coefficient(v, x, C1), Power(v, m)),
                          CN1)),
                      Subst(
                          Integrate(Times(Power(x, m), Power(Plus(d, Times(e, Power(x, n))), q),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  p)),
                              x),
                          x, v),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), LinearPairQ(u, v,
                          x),
                      NeQ(v, x)))),
          IIntegrate(1566,
              Integrate(Times(Power(u_, m_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Power(v_, $p("n2", true)))), p_DEFAULT), Power(
                      Plus(d_, Times(e_DEFAULT, Power(v_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(u, m), Power(Times(Coefficient(v, x, C1), Power(v, m)), CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(x, m), Power(Plus(d, Times(e, Power(x, n))), q), Power(Plus(
                                      a, Times(c, Power(x, Times(C2, n)))), p)),
                              x),
                          x, v),
                      x),
                  And(FreeQ(List(a, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      LinearPairQ(u, v, x), NeQ(v, x)))),
          IIntegrate(1567,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, $p("mn", true)))), q_DEFAULT),
                      Power(
                          Plus(
                              a_DEFAULT, Times(b_DEFAULT, Power(x_, n_DEFAULT)), Times(c_DEFAULT,
                                  Power(x_, $p("n2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(x, Subtract(m, Times(n,
                              q))),
                          Power(Plus(e,
                              Times(d, Power(x, n))), q),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ($s("mn"),
                          Negate(n)),
                      IntegerQ(q), Or(PosQ(n), Not(IntegerQ(p)))))),
          IIntegrate(1568,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT,
                          Power(x_, $p("mn", true)))), q_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(x, Plus(m, Times($s("mn"), q))),
                          Power(Plus(e, Times(d, Power(Power(x, $s("mn")), CN1))),
                              q),
                          Power(Plus(a, Times(c, Power(x, $s("n2")))), p)),
                      x),
                  And(FreeQ(List(a, c, d, e, m, $s("mn"), p), x),
                      EqQ($s("n2"), Times(CN2,
                          $s("mn"))),
                      IntegerQ(q), Or(PosQ($s("n2")), Not(IntegerQ(p)))))),
          IIntegrate(1569,
              Integrate(
                  Times(Power(x_, m_DEFAULT), Power(Plus(a_DEFAULT,
                      Times(b_DEFAULT, Power(x_, $p("mn", true))), Times(c_DEFAULT,
                          Power(x_, $p("mn2", true)))),
                      p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_DEFAULT))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(x, Subtract(m, Times(C2, n,
                              p))),
                          Power(Plus(d,
                              Times(e, Power(x, n))), q),
                          Power(Plus(c, Times(b, Power(x, n)), Times(a, Power(x, Times(C2, n)))),
                              p)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, q), x), EqQ($s("mn"), Negate(
                      n)), EqQ($s("mn2"),
                          Times(C2, $s("mn"))),
                      IntegerQ(p)))),
          IIntegrate(1570,
              Integrate(
                  Times(
                      Power(x_, m_DEFAULT),
                      Power(Plus(a_DEFAULT, Times(c_DEFAULT,
                          Power(x_, $p("mn2", true)))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_DEFAULT))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(x, Subtract(m, Times(C2, n, p))),
                          Power(Plus(d, Times(e, Power(x, n))),
                              q),
                          Power(Plus(c, Times(a, Power(x, Times(C2, n)))), p)),
                      x),
                  And(FreeQ(List(a, c, d, e, m, n,
                      q), x), EqQ($s("mn2"),
                          Times(CN2, n)),
                      IntegerQ(p)))),
          IIntegrate(1571,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, $p("mn", true)))), q_),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(e, IntPart(q)), Power(x, Times(n, FracPart(q))),
                          Power(Plus(d, Times(e, Power(Power(x, n), CN1))), FracPart(q)),
                          Power(Power(Plus(C1, Times(d, Power(x, n), Power(e, CN1))), FracPart(q)),
                              CN1)),
                      Integrate(Times(Power(x, Subtract(m, Times(n, q))),
                          Power(Plus(C1, Times(d, Power(x, n), Power(e, CN1))), q),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p, q), x), EqQ($s("n2"),
                      Times(C2, n)), EqQ($s("mn"), Negate(n)), Not(IntegerQ(p)), Not(IntegerQ(q)),
                      PosQ(n)))),
          IIntegrate(1572,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT,
                          Power(x_, $p("mn", true)))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(e, IntPart(q)),
                          Power(Plus(d, Times(e, Power(x, $s("mn")))), FracPart(q)),
                          Power(Times(Power(x, Times($s("mn"), FracPart(q))),
                              Power(Plus(C1, Times(d, Power(Times(Power(x, $s("mn")), e), CN1))),
                                  FracPart(q))),
                              CN1)),
                      Integrate(
                          Times(Power(x, Plus(m, Times($s("mn"), q))),
                              Power(Plus(C1, Times(d, Power(Times(Power(x, $s("mn")), e), CN1))),
                                  q),
                              Power(Plus(a, Times(c, Power(x, $s("n2")))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, m, $s("mn"), p, q), x),
                      EqQ($s("n2"), Times(CN2, $s(
                          "mn"))),
                      Not(IntegerQ(p)), Not(IntegerQ(q)), PosQ($s("n2"))))),
          IIntegrate(1573,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_DEFAULT, Times(b_DEFAULT, Power(x_, $p("mn", true))), Times(
                                  c_DEFAULT, Power(x_, $p("mn2", true)))),
                          p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_DEFAULT))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(x, Times(C2, n,
                              FracPart(p))),
                          Power(
                              Plus(
                                  a, Times(b, Power(Power(x, n), CN1)), Times(c,
                                      Power(Power(x, Times(C2, n)), CN1))),
                              FracPart(p)),
                          Power(Power(
                              Plus(c, Times(b, Power(x, n)), Times(a, Power(x, Times(C2, n)))),
                              FracPart(p)), CN1)),
                      Integrate(
                          Times(Power(x, Subtract(m, Times(C2, n, p))),
                              Power(Plus(d,
                                  Times(e, Power(x, n))), q),
                              Power(
                                  Plus(c, Times(b, Power(x, n)), Times(a, Power(x, Times(C2, n)))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p, q), x), EqQ($s("mn"), Negate(n)),
                      EqQ($s("mn2"), Times(C2, $s(
                          "mn"))),
                      Not(IntegerQ(p)), Not(IntegerQ(q)), PosQ(n)))),
          IIntegrate(1574,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(a_DEFAULT, Times(c_DEFAULT,
                          Power(x_, $p("mn2", true)))), p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_DEFAULT))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(x, Times(C2, n, FracPart(p))),
                          Power(Plus(a, Times(c, Power(Power(x, Times(C2, n)), CN1))), FracPart(p)),
                          Power(Power(Plus(c, Times(a, Power(x, Times(C2, n)))), FracPart(p)),
                              CN1)),
                      Integrate(
                          Times(Power(x, Subtract(m, Times(C2, n, p))),
                              Power(Plus(d,
                                  Times(e, Power(x, n))), q),
                              Power(Plus(c, Times(a, Power(x, Times(C2, n)))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, m, n, p, q), x), EqQ($s("mn2"), Times(CN2,
                      n)), Not(
                          IntegerQ(p)),
                      Not(IntegerQ(q)), PosQ(n)))),
          IIntegrate(1575,
              Integrate(
                  Times(Power(Times(f_, x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, $p("mn", true)))), q_DEFAULT),
                      Power(
                          Plus(a_DEFAULT, Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, $p("n2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(f, IntPart(m)), Power(Times(f, x),
                              FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(Times(Power(x, m), Power(Plus(d, Times(e, Power(x, $s("mn")))), q),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ($s("mn"),
                          Negate(n))))),
          IIntegrate(1576,
              Integrate(
                  Times(Power(Times(f_, x_), m_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, $p("mn", true)))), q_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(f, IntPart(m)), Power(Times(f, x),
                              FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(
                              Power(x, m), Power(Plus(d, Times(e, Power(x, $s("mn")))),
                                  q),
                              Power(Plus(a, Times(c, Power(x, $s("n2")))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, $s("mn"), p, q), x),
                      EqQ($s("n2"), Times(CN2, $s("mn")))))),
          IIntegrate(1577,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, n_DEFAULT)), Times(b_DEFAULT,
                                  Power(x_, $p("mn")))),
                          p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(x, Subtract(m, Times(n,
                              p))),
                          Power(Plus(d,
                              Times(e, Power(x, n))), q),
                          Power(Plus(b, Times(a, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, q), x), EqQ($s("mn"), Negate(n)),
                      IntegerQ(p)))),
          IIntegrate(1578,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, n_DEFAULT)), Times(b_DEFAULT,
                                  Power(x_, $p("mn")))),
                          p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(x, Times(n, FracPart(
                              p))),
                          Power(Plus(a, Times(b, Power(Power(x, n), CN1)), Times(c, Power(x, n))),
                              FracPart(p)),
                          Power(
                              Power(
                                  Plus(b, Times(a, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  FracPart(p)),
                              CN1)),
                      Integrate(Times(Power(x, Subtract(m, Times(n, p))),
                          Power(Plus(d, Times(e, Power(x, n))), q),
                          Power(Plus(b, Times(a, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p,
                      q), x), EqQ($s("mn"),
                          Negate(n)),
                      Not(IntegerQ(p))))),
          IIntegrate(1579,
              Integrate(
                  Times(
                      Power(Times(f_, x_), m_DEFAULT), Power(Plus(a_,
                          Times(c_DEFAULT, Power(x_, n_DEFAULT)), Times(b_DEFAULT,
                              Power(x_, $p("mn")))),
                          p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(f, IntPart(m)), Power(Times(f, x),
                              FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(
                              Power(x, m), Power(Plus(d,
                                  Times(e, Power(x, n))), q),
                              Power(
                                  Plus(a, Times(b, Power(Power(x, n), CN1)), Times(c, Power(x, n))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p, q), x), EqQ($s("mn"), Negate(n))))),
          IIntegrate(1580, Integrate(Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
              Power(Plus($p("d1"), Times($p("e1", true), Power(x_, $p("non2", true)))), q_DEFAULT),
              Power(Plus($p("d2"), Times($p("e2", true), Power(x_, $p("non2", true)))), q_DEFAULT),
              Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(x_, n_)),
                  Times(c_DEFAULT, Power(x_, $p("n2")))), p_DEFAULT)),
              x_Symbol),
              Condition(Integrate(
                  Times(Power(Times(f, x), m),
                      Power(Plus(Times($s("d1"), $s("d2")), Times($s("e1"), $s("e2"), Power(x, n))),
                          q),
                      Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))), p)),
                  x),
                  And(FreeQ(List(a, b, c, $s("d1"), $s("e1"), $s("d2"), $s("e2"), f, n, p, q), x),
                      EqQ($s("n2"), Times(C2, n)), EqQ($s("non2"), Times(C1D2, n)),
                      EqQ(Plus(Times($s("d2"), $s("e1")), Times($s("d1"), $s("e2"))), C0),
                      Or(IntegerQ(q), And(GtQ($s("d1"), C0), GtQ($s("d2"), C0)))))));
}
