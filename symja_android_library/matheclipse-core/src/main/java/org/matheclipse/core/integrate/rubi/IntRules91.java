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
class IntRules91 {
  public static IAST RULES =
      List(
          IIntegrate(1821,
              Integrate(
                  Times(
                      $p("§pq"), Power(x_, m_DEFAULT), Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(n, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(x,
                                      Subtract(Simplify(Times(Plus(m, C1), Power(n, CN1))), C1)),
                                  SubstFor(Power(x, n), $s("§pq"), x),
                                  Power(Plus(a, Times(b, x)), p)),
                              x),
                          x, Power(x, n)),
                      x),
                  And(FreeQ(List(a, b, m, n, p), x), PolyQ($s("§pq"), Power(x,
                      n)), IntegerQ(
                          Simplify(Times(Plus(m, C1), Power(n, CN1))))))),
          IIntegrate(1822,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(c_, x_), m_DEFAULT), Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(c, IntPart(m)), Power(Times(c,
                              x), FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(Power(x, m), $s("§pq"), Power(Plus(a, Times(b, Power(x, n))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, m, n, p), x), PolyQ($s("§pq"), Power(x,
                      n)), IntegerQ(
                          Simplify(Times(Plus(m, C1), Power(n, CN1))))))),
          IIntegrate(1823,
              Integrate(
                  Times(
                      $p("§pq"), Power(x_, m_DEFAULT), Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              $s("§pq"), Power(Plus(a, Times(b, Power(x, n))),
                                  Plus(p, C1)),
                              Power(Times(b, n, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(b, n,
                              Plus(p, C1)), CN1),
                          Integrate(
                              Times(D($s("§pq"), x),
                                  Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, m, n), x), PolyQ($s("§pq"), x),
                      EqQ(Plus(m, Negate(n), C1), C0), LtQ(p, CN1)))),
          IIntegrate(1824,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT), Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Integrate(
                          Times(Power(Times(d, x), Plus(m, C1)),
                              PolynomialQuotient($s("§pq"), x,
                                  x),
                              Power(Plus(a, Times(b, Power(x, n))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, m, n,
                      p), x), PolyQ($s("§pq"),
                          x),
                      EqQ(Coeff($s("§pq"), x, C0), C0)))),
          IIntegrate(1825,
              Integrate(Times($p("§pq"), Power(x_, m_DEFAULT),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_)), x_Symbol),
              Condition(Module(List(Set(u, IntHide(Times(Power(x, m), $s("§pq")), x))),
                  Subtract(Simp(Times(u, Power(Plus(a, Times(b, Power(x, n))), p)), x),
                      Dist(Times(b, n, p),
                          Integrate(Times(Power(x, Plus(m, n)),
                              Power(Plus(a, Times(b, Power(x, n))), Subtract(p, C1)),
                              ExpandToSum(Times(u, Power(Power(x, Plus(m, C1)), CN1)), x)), x),
                          x))),
                  And(FreeQ(List(a, b), x), PolyQ($s(
                      "§pq"), x), IGtQ(n,
                          C0),
                      GtQ(p, C0), LtQ(Plus(m, Expon($s("§pq"), x), C1), C0)))),
          IIntegrate(1826,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(q,
                          Expon($s("§pq"), x)), i),
                      Plus(
                          Simp(
                              Times(
                                  Power(Times(c, x), m), Power(Plus(a,
                                      Times(b, Power(x, n))), p),
                                  Sum(Times(
                                      Coeff($s("§pq"), x, i), Power(x, Plus(i, C1)), Power(
                                          Plus(m, Times(n, p), i, C1), CN1)),
                                      List(i, C0, q))),
                              x),
                          Dist(Times(a, n, p),
                              Integrate(
                                  Times(Power(Times(c, x), m),
                                      Power(Plus(a, Times(b, Power(x, n))), Subtract(p, C1)), Sum(
                                          Times(
                                              Coeff($s("§pq"), x, i), Power(x, i), Power(
                                                  Plus(m, Times(n, p), i, C1), CN1)),
                                          List(i, C0, q))),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, m), x), PolyQ($s("§pq"), x), IGtQ(Times(C1D2,
                      Subtract(n, C1)), C0), GtQ(p,
                          C0)))),
          IIntegrate(1827,
              Integrate(
                  Times(
                      $p("§p4"), Sqr(x_), Power(Plus(a_, Times(b_DEFAULT,
                          Power(x_, C4))), QQ(-3L,
                              2L))),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(e, Coeff($s("§p4"), x, C0)), Set(f, Coeff($s("§p4"), x, C1)), Set(h,
                              Coeff($s("§p4"), x, C4))),
                      Condition(
                          Negate(Simp(
                              Times(Subtract(f, Times(C2, h, Power(x, C3))),
                                  Power(Times(C2, b, Sqrt(Plus(a, Times(b, Power(x, C4))))), CN1)),
                              x)),
                          EqQ(Subtract(Times(b, e), Times(C3, a, h)), C0))),
                  And(FreeQ(List(a, b), x), PolyQ($s("§p4"), x, C4), EqQ(Coeff($s("§p4"), x,
                      C2), C0), EqQ(Coeff($s("§p4"), x, C3),
                          C0)))),
          IIntegrate(1828,
              Integrate(Times($p("§pq"), Power(x_, m_DEFAULT),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_)), x_Symbol),
              Condition(
                  With(
                      List(Set(q, Plus(m, Expon($s("§pq"), x)))), Condition(
                          Module(
                              List(
                                  Set(QSymbol,
                                      PolynomialQuotient(
                                          Times(Power(b,
                                              Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1)),
                                              Power(x, m), $s("§pq")),
                                          Plus(a, Times(b, Power(x, n))), x)),
                                  Set($s("R"),
                                      PolynomialRemainder(Times(
                                          Power(b,
                                              Plus(
                                                  Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1)),
                                          Power(x, m), $s("§pq")), Plus(a, Times(b, Power(x, n))),
                                          x))),
                              Subtract(
                                  Dist(
                                      Power(Times(a, n, Plus(p, C1),
                                          Power(b,
                                              Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1))),
                                          CN1),
                                      Integrate(
                                          Times(Power(Plus(a, Times(b, Power(x, n))),
                                              Plus(p, C1)),
                                              ExpandToSum(Plus(Times(a, n, Plus(p, C1), QSymbol),
                                                  Times(n, Plus(p, C1), $s("R")),
                                                  D(Times(x, $s("R")), x)), x)),
                                          x),
                                      x),
                                  Simp(
                                      Times(x, $s("R"),
                                          Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                          Power(Times(a, n, Plus(p, C1),
                                              Power(b,
                                                  Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                      C1))),
                                              CN1)),
                                      x))),
                          GeQ(q, n))),
                  And(FreeQ(List(a, b), x), PolyQ($s("§pq"), x), IGtQ(n, C0), LtQ(p, CN1),
                      IGtQ(m, C0)))),
          IIntegrate(1829,
              Integrate(
                  Times(
                      $p("§pq"), Power(x_, m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Expon($s("§pq"), x))),
                      Module(
                          List(Set(QSymbol,
                              PolynomialQuotient(Times(a,
                                  Power(b, Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                      C1)),
                                  Power(x, m), $s("§pq")), Plus(a, Times(b, Power(x, n))), x)),
                              Set($s("R"),
                                  PolynomialRemainder(
                                      Times(a,
                                          Power(b,
                                              Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1)),
                                          Power(x, m), $s("§pq")),
                                      Plus(a, Times(b, Power(x, n))), x)),
                              i),
                          Subtract(
                              Dist(
                                  Power(
                                      Times(a, n, Plus(p, C1),
                                          Power(b,
                                              Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1))),
                                      CN1),
                                  Integrate(Times(Power(x, m),
                                      Power(Plus(a,
                                          Times(b, Power(x, n))), Plus(p, C1)),
                                      ExpandToSum(Plus(
                                          Times(n, Plus(p, C1), QSymbol, Power(Power(x, m), CN1)),
                                          Sum(Times(Plus(Times(n, Plus(p, C1)), i, C1),
                                              Coeff($s("R"), x, i), Power(x, Subtract(i, m)),
                                              Power(a, CN1)), List(i, C0, Subtract(n, C1)))),
                                          x)),
                                      x),
                                  x),
                              Simp(
                                  Times(x, $s("R"),
                                      Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                      Power(Times(Sqr(a), n, Plus(p, C1),
                                          Power(b,
                                              Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1))),
                                          CN1)),
                                  x)))),
                  And(FreeQ(List(a,
                      b), x), PolyQ($s("§pq"),
                          x),
                      IGtQ(n, C0), LtQ(p, CN1), ILtQ(m, C0)))),
          IIntegrate(1830,
              Integrate(
                  Times(
                      $p("§pq"), Power(x_, m_DEFAULT), Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  With(List(Set(g, GCD(Plus(m, C1), n))),
                      Condition(Dist(Power(g, CN1),
                          Subst(Integrate(
                              Times(Power(x, Subtract(Times(Plus(m, C1), Power(g, CN1)), C1)),
                                  ReplaceAll($s("§pq"), Rule(x, Power(x, Power(g, CN1)))),
                                  Power(Plus(a, Times(b, Power(x, Times(n, Power(g, CN1))))), p)),
                              x), x, Power(x, g)),
                          x), Unequal(g, C1))),
                  And(FreeQ(List(a, b, p), x), PolyQ($s("§pq"), Power(x, n)), IGtQ(n, C0),
                      IntegerQ(m)))),
          IIntegrate(1831,
              Integrate(
                  Times($p("§pq"), Power(Times(c_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(v,
                      Sum(Times(Power(Times(c, x), Plus(m, $s("ii"))),
                          Plus(Coeff($s("§pq"), x, $s("ii")),
                              Times(Coeff($s("§pq"), x, Plus(Times(C1D2, n), $s("ii"))),
                                  Power(x, Times(C1D2, n)))),
                          Power(Times(Power(c, $s("ii")), Plus(a, Times(b, Power(x, n)))), CN1)),
                          List($s("ii"), C0, Subtract(Times(C1D2, n), C1))))),
                      Condition(Integrate(v, x), SumQ(v))),
                  And(FreeQ(List(a, b, c, m), x), PolyQ($s("§pq"), x), IGtQ(Times(C1D2,
                      n), C0), Less(Expon($s("§pq"), x),
                          n)))),
          IIntegrate(1832,
              Integrate(
                  Times(
                      $p("§pq"), Power(x_, CN1),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Coeff($s("§pq"), x, C0),
                          Integrate(Power(Times(x, Sqrt(Plus(a, Times(b, Power(x, n))))), CN1),
                              x),
                          x),
                      Integrate(
                          Times(
                              ExpandToSum(Times(Subtract($s("§pq"), Coeff($s("§pq"), x, C0)),
                                  Power(x, CN1)), x),
                              Power(Plus(a, Times(b, Power(x, n))), CN1D2)),
                          x)),
                  And(FreeQ(List(a,
                      b), x), PolyQ($s("§pq"),
                          x),
                      IGtQ(n, C0), NeQ(Coeff($s("§pq"), x, C0), C0)))),
          IIntegrate(1833,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(q, Expon($s("§pq"), x)), j, k), Integrate(Sum(
                          Times(Power(Times(c, x), Plus(m, j)),
                              Sum(Times(Coeff($s("§pq"), x, Plus(j, Times(C1D2, k, n))),
                                  Power(x, Times(C1D2, k, n))),
                                  List(k, C0, Plus(Times(C2, Subtract(q, j), Power(n, CN1)), C1))),
                              Power(Plus(a, Times(b, Power(x, n))), p), Power(Power(c, j), CN1)),
                          List(j, C0, Subtract(Times(C1D2, n), C1))), x)),
                  And(FreeQ(List(a, b, c, m, p), x), PolyQ($s("§pq"), x), IGtQ(Times(C1D2, n), C0),
                      Not(PolyQ($s("§pq"), Power(x, Times(C1D2, n))))))),
          IIntegrate(1834,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Times(c,
                                  x), m),
                              $s("§pq"), Power(Plus(a, Times(b, Power(x, n))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, m), x), PolyQ($s("§pq"), x), IntegerQ(n), Not(
                      IGtQ(m, C0))))),
          IIntegrate(1835,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(c_DEFAULT, x_), m_), Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("§pq0"),
                          Coeff($s("§pq"), x, C0))),
                      Condition(
                          Plus(
                              Simp(
                                  Times($s("§pq0"), Power(Times(c, x), Plus(m, C1)),
                                      Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)), Power(
                                          Times(a, c, Plus(m, C1)), CN1)),
                                  x),
                              Dist(Power(Times(C2, a, c, Plus(m, C1)), CN1), Integrate(Times(
                                  Power(Times(c, x), Plus(m, C1)),
                                  ExpandToSum(Subtract(
                                      Times(C2, a, Plus(m, C1), Subtract($s("§pq"), $s("§pq0")),
                                          Power(x, CN1)),
                                      Times(C2, b, $s("§pq0"), Plus(m, Times(n, Plus(p, C1)), C1),
                                          Power(x, Subtract(n, C1)))),
                                      x),
                                  Power(Plus(a, Times(b, Power(x, n))), p)), x), x)),
                          NeQ($s("§pq0"), C0))),
                  And(FreeQ(List(a, b, c, p), x), PolyQ($s(
                      "§pq"), x), IGtQ(n, C0), LtQ(m, CN1), LeQ(Subtract(n, C1),
                          Expon($s("§pq"), x))))),
          IIntegrate(1836,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Expon($s("§pq"), x))),
                      Condition(
                          With(List(Set($s("§pqq"), Coeff($s("§pq"), x, q))),
                              Plus(
                                  Dist(
                                      Power(Times(b,
                                          Plus(m, q, Times(n, p), C1)), CN1),
                                      Integrate(Times(Power(Times(c, x), m),
                                          ExpandToSum(Subtract(
                                              Times(b, Plus(m, q, Times(n, p), C1),
                                                  Subtract($s("§pq"),
                                                      Times($s("§pqq"), Power(x, q)))),
                                              Times(a, $s("§pqq"), Plus(m, q, Negate(n), C1),
                                                  Power(x, Subtract(q, n)))),
                                              x),
                                          Power(Plus(a, Times(b, Power(x, n))), p)), x),
                                      x),
                                  Simp(Times(
                                      $s("§pqq"), Power(Times(c, x), Plus(m, q, Negate(n), C1)),
                                      Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                      Power(Times(b, Power(c, Plus(q, Negate(n), C1)),
                                          Plus(m, q, Times(n, p), C1)), CN1)),
                                      x))),
                          And(NeQ(Plus(m, q, Times(n, p), C1), C0),
                              GreaterEqual(Subtract(q, n), C0),
                              Or(IntegerQ(Times(C2, p)),
                                  IntegerQ(Plus(p,
                                      Times(Plus(q, C1), Power(Times(C2, n), CN1)))))))),
                  And(FreeQ(List(a, b, c, m, p), x), PolyQ($s("§pq"), x), IGtQ(n, C0)))),
          IIntegrate(1837,
              Integrate(
                  Times(
                      $p("§pq"), Power(x_, m_DEFAULT), Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Expon($s("§pq"), x))),
                      Negate(
                          Subst(
                              Integrate(Times(
                                  ExpandToSum(Times(Power(x, q),
                                      ReplaceAll($s("§pq"), Rule(x, Power(x, CN1)))), x),
                                  Power(Plus(a, Times(b, Power(Power(x, n), CN1))), p),
                                  Power(Power(x, Plus(m, q, C2)), CN1)), x),
                              x, Power(x, CN1)))),
                  And(FreeQ(List(a, b, p), x), PolyQ($s("§pq"), x), ILtQ(n, C0), IntegerQ(m)))),
          IIntegrate(1838,
              Integrate(Times($p("§pq"), Power(Times(c_DEFAULT, x_), m_DEFAULT),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)), x_Symbol),
              Condition(
                  With(List(Set(g, Denominator(m)), Set(q, Expon($s("§pq"), x))),
                      Negate(
                          Dist(
                              Times(g, Power(c,
                                  CN1)),
                              Subst(
                                  Integrate(
                                      Times(
                                          ExpandToSum(
                                              Times(
                                                  Power(x, Times(g,
                                                      q)),
                                                  ReplaceAll($s("§pq"),
                                                      Rule(x, Power(Times(c, Power(x, g)), CN1)))),
                                              x),
                                          Power(Plus(a,
                                              Times(b,
                                                  Power(Times(Power(c, n), Power(x, Times(g, n))),
                                                      CN1))),
                                              p),
                                          Power(Power(x, Plus(Times(g, Plus(m, q, C1)), C1)), CN1)),
                                      x),
                                  x, Power(Power(Times(c, x), Power(g, CN1)), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, p), x), PolyQ($s("§pq"), x), ILtQ(n, C0), FractionQ(m)))),
          IIntegrate(1839,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(c_DEFAULT,
                          x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Expon($s("§pq"), x))),
                      Negate(
                          Dist(Times(Power(Times(c, x), m), Power(Power(x, CN1), m)),
                              Subst(
                                  Integrate(
                                      Times(
                                          ExpandToSum(
                                              Times(Power(x, q),
                                                  ReplaceAll($s("§pq"), Rule(x, Power(x, CN1)))),
                                              x),
                                          Power(Plus(a, Times(b, Power(Power(x, n), CN1))), p),
                                          Power(Power(x, Plus(m, q, C2)), CN1)),
                                      x),
                                  x, Power(x, CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, m, p), x), PolyQ($s("§pq"), x), ILtQ(n, C0),
                      Not(RationalQ(m))))),
          IIntegrate(1840,
              Integrate(Times($p("§pq"), Power(x_, m_DEFAULT),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)), x_Symbol),
              Condition(
                  With(List(Set(g, Denominator(n))),
                      Dist(g,
                          Subst(
                              Integrate(Times(Power(x, Subtract(Times(g, Plus(m, C1)), C1)),
                                  ReplaceAll($s("§pq"), Rule(x, Power(x, g))),
                                  Power(Plus(a, Times(b, Power(x, Times(g, n)))), p)), x),
                              x, Power(x, Power(g, CN1))),
                          x)),
                  And(FreeQ(List(a, b, m, p), x), PolyQ($s("§pq"), x), FractionQ(n)))));
}
