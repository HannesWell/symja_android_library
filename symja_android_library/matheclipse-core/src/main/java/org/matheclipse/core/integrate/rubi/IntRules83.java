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
class IntRules83 {
  public static IAST RULES =
      List(
          IIntegrate(1661,
              Integrate(Times(
                  $p("§pq"), Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(q, Expon($s("§pq"),
                              x)),
                          Set(e, Coeff($s("§pq"), x, Expon($s("§pq"), x)))),
                      Plus(
                          Simp(
                              Times(e, Power(x, Subtract(q, C1)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p,
                                      C1)),
                                  Power(Times(c, Plus(q, Times(C2, p), C1)), CN1)),
                              x),
                          Dist(Power(Times(c, Plus(q, Times(C2, p), C1)), CN1), Integrate(Times(
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                              ExpandToSum(
                                  Subtract(
                                      Subtract(
                                          Subtract(Times(c, Plus(q, Times(C2, p), C1), $s("§pq")),
                                              Times(a, e, Subtract(q, C1),
                                                  Power(x, Subtract(q, C2)))),
                                          Times(b, e, Plus(q, p), Power(x, Subtract(q, C1)))),
                                      Times(c, e, Plus(q, Times(C2, p), C1), Power(x, q))),
                                  x)),
                              x), x))),
                  And(FreeQ(List(a, b, c, p), x), PolyQ($s("§pq"), x), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), Not(
                          LeQ(p, CN1))))),
          IIntegrate(1662,
              Integrate(
                  Times($p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(q,
                          Expon($s("§pq"), x)), k),
                      Plus(
                          Integrate(
                              Times(
                                  Power(Times(d,
                                      x), m),
                                  Sum(Times(Coeff($s("§pq"), x, Times(C2,
                                      k)), Power(x,
                                          Times(C2, k))),
                                      List(k, C0, Plus(Times(C1D2, q), C1))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                              x),
                          Dist(Power(d, CN1),
                              Integrate(
                                  Times(Power(Times(d, x), Plus(m, C1)),
                                      Sum(Times(Coeff($s("§pq"), x, Plus(Times(C2, k), C1)),
                                          Power(x, Times(C2, k))),
                                          List(k, C0, Plus(Times(C1D2, Subtract(q, C1)), C1))),
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, m, p), x), PolyQ($s("§pq"), x),
                      Not(PolyQ($s("§pq"), Sqr(x)))))),
          IIntegrate(1663,
              Integrate(
                  Times($p("§pq"), Power(x_, m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(C1D2,
                      Subst(
                          Integrate(
                              Times(Power(x, Times(C1D2, Subtract(m, C1))),
                                  SubstFor(Sqr(x), $s("§pq"), x), Power(
                                      Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                              x),
                          x, Sqr(x)),
                      x),
                  And(FreeQ(List(a, b, c,
                      p), x), PolyQ($s("§pq"),
                          Sqr(x)),
                      IntegerQ(Times(C1D2, Subtract(m, C1)))))),
          IIntegrate(1664,
              Integrate(
                  Times($p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Times(d, x), m), $s("§pq"), Power(
                              Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m), x), PolyQ($s("§pq"), Sqr(x)), IGtQ(p, CN2)))),
          IIntegrate(1665,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(Dist(Power(d, CN2),
                  Integrate(Times(Power(Times(d, x), Plus(m, C2)),
                      ExpandToSum(Times($s("§pq"), Power(x, CN2)), x), Power(
                          Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                      x),
                  x),
                  And(FreeQ(List(a, b, c, d, m,
                      p), x), PolyQ($s("§pq"),
                          Sqr(x)),
                      EqQ(Coeff($s("§pq"), x, C0), C0)))),
          IIntegrate(1666,
              Integrate(
                  Times($p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(e, Coeff($s("§pq"), x, C0)), Set(f, Coeff($s("§pq"), x, C2)), Set(g,
                              Coeff($s("§pq"), x, C4))),
                      Condition(
                          Simp(
                              Times(e, Power(Times(d, x), Plus(m, C1)),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      Plus(p, C1)),
                                  Power(Times(a, d, Plus(m, C1)), CN1)),
                              x),
                          And(EqQ(Subtract(Times(a, f, Plus(m, C1)),
                              Times(b, e, Plus(m, Times(C2, p), C3))), C0),
                              EqQ(Subtract(Times(a, g, Plus(m, C1)),
                                  Times(c, e, Plus(m, Times(C4, p), C5))), C0),
                              NeQ(m, CN1)))),
                  And(FreeQ(List(a, b, c, d, m,
                      p), x), PolyQ($s("§pq"),
                          Sqr(x)),
                      EqQ(Expon($s("§pq"), x), C4)))),
          IIntegrate(1667,
              Integrate(
                  Times($p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(Dist(
                  Times(Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), FracPart(p)),
                      Power(Times(Power(Times(C4, c), IntPart(p)),
                          Power(Plus(b, Times(C2, c, Sqr(x))), Times(C2, FracPart(p)))), CN1)),
                  Integrate(Times(Power(Times(d, x), m), $s("§pq"),
                      Power(Plus(b, Times(C2, c, Sqr(x))), Times(C2, p))), x),
                  x),
                  And(FreeQ(List(a, b, c, d, m, p), x), PolyQ($s("§pq"), Sqr(x)),
                      GtQ(Expon($s("§pq"), Sqr(x)), C1), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0)))),
          IIntegrate(1668,
              Integrate(
                  Times($p("§pq"), Power(x_, m_),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(List(
                      Set(d,
                          Coeff(PolynomialRemainder(Times(Power(x, m), $s("§pq")),
                              Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), x), x, C0)),
                      Set(e,
                          Coeff(
                              PolynomialRemainder(Times(Power(x, m), $s("§pq")),
                                  Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), x),
                              x, C2))),
                      Plus(Simp(Times(x,
                          Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p, C1)),
                          Subtract(Subtract(Times(a, b, e), Times(d,
                              Subtract(Sqr(b), Times(C2, a, c)))), Times(c,
                                  Subtract(Times(b, d), Times(C2, a, e)), Sqr(x))),
                          Power(Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          x),
                          Dist(
                              Power(
                                  Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))),
                                  CN1),
                              Integrate(
                                  Times(
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                          Plus(p, C1)),
                                      ExpandToSum(
                                          Plus(
                                              Times(C2, a, Plus(p, C1),
                                                  Subtract(Sqr(b), Times(C4, a, c)),
                                                  PolynomialQuotient(Times(Power(x, m), $s("§pq")),
                                                      Plus(a, Times(b, Sqr(x)),
                                                          Times(c, Power(x, C4))),
                                                      x)),
                                              Times(Sqr(b), d, Plus(Times(C2, p), C3)),
                                              Times(CN1, C2, a, c, d, Plus(Times(C4, p), C5)),
                                              Times(CN1, a, b, e),
                                              Times(c, Plus(Times(C4, p), C7),
                                                  Subtract(Times(b, d), Times(C2, a, e)), Sqr(x))),
                                          x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c), x), PolyQ($s("§pq"), Sqr(x)),
                      GtQ(Expon($s("§pq"), Sqr(x)), C1), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      LtQ(p, CN1), IGtQ(Times(C1D2, m), C0)))),
          IIntegrate(1669,
              Integrate(
                  Times($p("§pq"), Power(x_, m_),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(d,
                          Coeff(
                              PolynomialRemainder(Times(Power(x, m), $s("§pq")),
                                  Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), x),
                              x, C0)),
                          Set(e,
                              Coeff(
                                  PolynomialRemainder(
                                      Times(Power(x, m), $s("§pq")), Plus(a, Times(b, Sqr(x)),
                                          Times(c, Power(x, C4))),
                                      x),
                                  x, C2))),
                      Plus(
                          Simp(
                              Times(x,
                                  Power(
                                      Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p,
                                          C1)),
                                  Subtract(Subtract(Times(a, b, e), Times(d,
                                      Subtract(Sqr(b), Times(C2, a, c)))), Times(c,
                                          Subtract(Times(b, d), Times(C2, a, e)), Sqr(x))),
                                  Power(
                                      Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))),
                                      CN1)),
                              x),
                          Dist(
                              Power(
                                  Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))),
                                  CN1),
                              Integrate(
                                  Times(Power(x, m),
                                      Power(
                                          Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p,
                                              C1)),
                                      ExpandToSum(
                                          Plus(
                                              Times(C2, a, Plus(p, C1),
                                                  Subtract(Sqr(b), Times(C4, a,
                                                      c)),
                                                  PolynomialQuotient(
                                                      Times(Power(x,
                                                          m), $s("§pq")),
                                                      Plus(a, Times(b, Sqr(x)),
                                                          Times(c, Power(x, C4))),
                                                      x),
                                                  Power(Power(x, m), CN1)),
                                              Times(Subtract(
                                                  Subtract(Times(Sqr(b), d, Plus(Times(C2, p), C3)),
                                                      Times(C2, a, c, d, Plus(Times(C4, p), C5))),
                                                  Times(a, b, e)), Power(Power(x, m), CN1)),
                                              Times(c, Plus(Times(C4, p), C7),
                                                  Subtract(Times(b, d), Times(C2, a, e)),
                                                  Power(x, Subtract(C2, m)))),
                                          x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c), x), PolyQ($s("§pq"), Sqr(x)),
                      GtQ(Expon($s("§pq"), Sqr(x)), C1), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      LtQ(p, CN1), ILtQ(Times(C1D2, m), C0)))),
          IIntegrate(1670,
              Integrate(
                  Times($p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(Unintegrable(
                  Times($s("§pq"), Power(Times(d, x), m),
                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                  x), And(FreeQ(List(a, b, c, d, m, p), x), PolyQ($s("§pq"), x)))),
          IIntegrate(1671,
              Integrate(Times($p("§pq"),
                  Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                      p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(
                      Times($s("§pq"), Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                      x), x),
                  And(FreeQ(List(a, b, c), x), PolyQ($s("§pq"), x), IGtQ(p, C0)))),
          IIntegrate(1672,
              Integrate(
                  Times($p("§pq"),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(x, PolynomialQuotient($s("§pq"), x, x),
                          Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                      x),
                  And(FreeQ(List(a, b, c, p), x), PolyQ($s("§pq"), x),
                      EqQ(Coeff($s("§pq"), x,
                          C0), C0),
                      Not(MatchQ($s("§pq"), Condition(Times(Power(x, m_DEFAULT), u_DEFAULT),
                          IntegerQ(m))))))),
          IIntegrate(1673,
              Integrate(
                  Times($p("§pq"),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(q,
                          Expon($s("§pq"), x)), k),
                      Plus(
                          Integrate(Times(
                              Sum(Times(
                                  Coeff($s("§pq"), x, Times(C2, k)), Power(x, Times(C2, k))),
                                  List(k, C0, Times(C1D2, q))),
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)), x),
                          Integrate(
                              Times(x,
                                  Sum(Times(Coeff($s("§pq"), x, Plus(Times(C2, k), C1)), Power(x,
                                      Times(C2, k))), List(k, C0,
                                          Times(C1D2, Subtract(q, C1)))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                              x))),
                  And(FreeQ(List(a, b, c, p), x), PolyQ($s("§pq"), x),
                      Not(PolyQ($s("§pq"), Sqr(x)))))),
          IIntegrate(1674,
              Integrate(
                  Times($p("§pq"),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(d, Coeff($s("§pq"), x, C0)), Set(e, Coeff($s("§pq"), x, C2)), Set(f,
                              Coeff($s("§pq"), x, C4))),
                      Condition(
                          Simp(
                              Times(d, x,
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                      Plus(p, C1)),
                                  Power(a, CN1)),
                              x),
                          And(EqQ(Subtract(Times(a, e),
                              Times(b, d, Plus(Times(C2, p), C3))), C0), EqQ(
                                  Subtract(Times(a, f),
                                      Times(c, d, Plus(Times(C4, p), C5))),
                                  C0)))),
                  And(FreeQ(List(a, b, c, p), x), PolyQ($s("§pq"), Sqr(x)),
                      EqQ(Expon($s("§pq"), x), C4)))),
          IIntegrate(1675,
              Integrate(
                  Times($p("§pq"),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(d, Coeff($s("§pq"), x, C0)), Set(e, Coeff($s("§pq"), x, C2)),
                          Set(f, Coeff($s("§pq"), x, C4)), Set(g, Coeff($s("§pq"), x, C6))),
                      Condition(Simp(Times(x,
                          Plus(Times(C3, a, d),
                              Times(Subtract(Times(a, e), Times(b, d, Plus(Times(C2, p), C3))),
                                  Sqr(x))),
                          Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p, C1)),
                          Power(Times(C3, Sqr(a)), CN1)), x), And(
                              EqQ(Subtract(Times(C3, Sqr(a), g),
                                  Times(c, Plus(Times(C4, p), C7),
                                      Subtract(Times(a, e), Times(b, d, Plus(Times(C2, p), C3))))),
                                  C0),
                              EqQ(Subtract(
                                  Subtract(
                                      Times(C3, Sqr(a), f),
                                      Times(C3, a, c, d, Plus(Times(C4, p), C5))),
                                  Times(b, Plus(Times(C2, p), C5),
                                      Subtract(Times(a, e), Times(b, d, Plus(Times(C2, p), C3))))),
                                  C0)))),
                  And(FreeQ(List(a, b, c,
                      p), x), PolyQ($s("§pq"),
                          Sqr(x)),
                      EqQ(Expon($s("§pq"), x), C6)))),
          IIntegrate(1676,
              Integrate(
                  Times($p("§pq"),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              $s("§pq"), Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b,
                      c), x), PolyQ($s("§pq"),
                          Sqr(x)),
                      Greater(Expon($s("§pq"), Sqr(x)), C1)))),
          IIntegrate(1677,
              Integrate(
                  Times($p("§pq"),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Plus(a, Times(b, Sqr(x)), Times(c,
                              Power(x, C4))), FracPart(
                                  p)),
                          Power(
                              Times(
                                  Power(Times(C4, c), IntPart(p)), Power(Plus(b,
                                      Times(C2, c, Sqr(x))),
                                      Times(C2, FracPart(p)))),
                              CN1)),
                      Integrate(
                          Times($s("§pq"), Power(Plus(b, Times(C2, c, Sqr(x))), Times(C2, p))), x),
                      x),
                  And(FreeQ(List(a, b, c, p), x), PolyQ($s("§pq"), Sqr(x)),
                      Greater(Expon($s("§pq"), Sqr(x)), C1),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(1678,
              Integrate(
                  Times($p("§pq"),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(With(List(
                  Set(d, Coeff(
                      PolynomialRemainder($s("§pq"), Plus(a, Times(b, Sqr(x)), Times(c,
                          Power(x, C4))), x),
                      x, C0)),
                  Set(e,
                      Coeff(
                          PolynomialRemainder($s("§pq"), Plus(a, Times(b, Sqr(x)),
                              Times(c, Power(x, C4))), x),
                          x, C2))),
                  Plus(
                      Simp(Times(x, Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(
                          x, C4))), Plus(p, C1)), Subtract(Subtract(Times(a, b, e), Times(d,
                              Subtract(Sqr(b), Times(C2, a, c)))), Times(c,
                                  Subtract(Times(b, d), Times(C2, a, e)), Sqr(x))),
                          Power(Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          x),
                      Dist(
                          Power(Times(C2, a, Plus(p, C1),
                              Subtract(Sqr(b), Times(C4, a, c))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), Plus(p,
                                      C1)),
                                  ExpandToSum(Plus(
                                      Times(C2, a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c)),
                                          PolynomialQuotient($s("§pq"),
                                              Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                              x)),
                                      Times(Sqr(b), d, Plus(Times(C2, p), C3)),
                                      Times(CN1, C2, a, c, d, Plus(Times(C4, p), C5)),
                                      Times(CN1, a, b, e),
                                      Times(c, Plus(Times(C4, p), C7),
                                          Subtract(Times(b, d), Times(C2, a, e)), Sqr(x))),
                                      x)),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c), x), PolyQ($s("§pq"), Sqr(x)),
                      Greater(Expon($s("§pq"), Sqr(x)), C1), NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      LtQ(p, CN1)))),
          IIntegrate(1679,
              Integrate(
                  Times($p("§pq"),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(q, Expon($s("§pq"), Sqr(x))), Set(e,
                              Coeff($s("§pq"), Sqr(x), Expon($s("§pq"), Sqr(x))))),
                      Plus(
                          Simp(
                              Times(
                                  e, Power(x, Subtract(Times(C2, q),
                                      C3)),
                                  Power(
                                      Plus(a, Times(b, Sqr(x)), Times(c,
                                          Power(x, C4))),
                                      Plus(p, C1)),
                                  Power(Times(c, Plus(Times(C2, q), Times(C4, p), C1)), CN1)),
                              x),
                          Dist(
                              Power(Times(c,
                                  Plus(Times(C2, q), Times(C4, p), C1)), CN1),
                              Integrate(
                                  Times(
                                      Power(Plus(a, Times(b, Sqr(
                                          x)), Times(c,
                                              Power(x, C4))),
                                          p),
                                      ExpandToSum(Subtract(
                                          Subtract(
                                              Subtract(
                                                  Times(c, Plus(Times(C2, q), Times(C4, p), C1),
                                                      $s("§pq")),
                                                  Times(a, e, Subtract(Times(C2, q), C3),
                                                      Power(x, Subtract(Times(C2, q), C4)))),
                                              Times(b, e,
                                                  Subtract(Plus(Times(C2, q), Times(C2, p)), C1),
                                                  Power(x, Subtract(Times(C2, q), C2)))),
                                          Times(c, e, Plus(Times(C2, q), Times(C4, p), C1),
                                              Power(x, Times(C2, q)))),
                                          x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, p), x), PolyQ($s("§pq"), Sqr(x)),
                      Greater(Expon($s("§pq"), Sqr(
                          x)), C1),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(LtQ(p, CN1))))),
          IIntegrate(1680, Integrate(Times($p("§pq"), Power($p("§q4"), p_)), x_Symbol),
              Condition(
                  With(
                      List(Set(a, Coeff($s("§q4"), x, C0)), Set(b, Coeff($s(
                          "§q4"), x, C1)), Set(c, Coeff($s("§q4"), x, C2)), Set(d, Coeff($s("§q4"),
                              x, C3)),
                          Set(e, Coeff($s("§q4"), x, C4))),
                      Condition(
                          Subst(Integrate(
                              SimplifyIntegrand(
                                  Times(
                                      ReplaceAll($s("§pq"),
                                          Rule(x, Plus(Times(CN1, d, Power(Times(C4, e), CN1)),
                                              x))),
                                      Power(Plus(a,
                                          Times(Power(d, C4),
                                              Power(Times(ZZ(256L), Power(e, C3)), CN1)),
                                          Times(CN1, b, d, Power(Times(C8, e), CN1)),
                                          Times(
                                              Subtract(c,
                                                  Times(C3, Sqr(d), Power(Times(C8, e), CN1))),
                                              Sqr(x)),
                                          Times(e, Power(x, C4))), p)),
                                  x),
                              x), x, Plus(Times(d, Power(Times(C4, e), CN1)), x)),
                          And(EqQ(Plus(Power(d, C3), Times(CN1, C4, c, d, e), Times(C8, b, Sqr(e))),
                              C0), NeQ(d, C0)))),
                  And(FreeQ(p, x), PolyQ($s("§pq"), x), PolyQ($s("§q4"), x, C4),
                      Not(IGtQ(p, C0))))));
}
