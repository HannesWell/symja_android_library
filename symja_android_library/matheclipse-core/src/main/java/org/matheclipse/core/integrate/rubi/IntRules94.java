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
class IntRules94 {
  public static IAST RULES =
      List(
          IIntegrate(1881,
              Integrate(
                  Times(
                      Plus(c_, Times(d_DEFAULT,
                          Power(x_, C4))),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C6))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(r, $($s("§numer"),
                              Rt(Times(b, Power(a, CN1)), C3))),
                          Set(s, $($s("§denom"), Rt(Times(b, Power(a, CN1)), C3)))),
                      Subtract(Simp(Times(Plus(C1, CSqrt3), d, Power(s, C3), x,
                          Sqrt(Plus(a, Times(b, Power(x, C6)))),
                          Power(Times(C2, a, Sqr(r), Plus(s, Times(Plus(C1, CSqrt3), r, Sqr(x)))),
                              CN1)),
                          x),
                          Simp(
                              Times(
                                  Power(C3, C1D4), d, s, x, Plus(s, Times(r, Sqr(
                                      x))),
                                  Sqrt(Times(Plus(
                                      Sqr(s), Times(CN1, r, s, Sqr(x)), Times(Sqr(r), Power(x,
                                          C4))),
                                      Power(Plus(s, Times(Plus(C1, CSqrt3), r, Sqr(x))), CN2))),
                                  EllipticE(
                                      ArcCos(
                                          Times(
                                              Plus(s, Times(Subtract(C1, CSqrt3), r,
                                                  Sqr(x))),
                                              Power(Plus(s, Times(Plus(C1, CSqrt3), r, Sqr(x))),
                                                  CN1))),
                                      Times(C1D4, Plus(C2, CSqrt3))),
                                  Power(Times(C2, Sqr(r),
                                      Sqrt(Times(r, Sqr(x), Plus(s, Times(r, Sqr(x))),
                                          Power(Plus(s, Times(Plus(C1, CSqrt3), r, Sqr(x))), CN2))),
                                      Sqrt(Plus(a, Times(b, Power(x, C6))))), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c,
                      d), x), EqQ(
                          Subtract(
                              Times(C2, Sqr(Rt(Times(b, Power(a, CN1)), C3)),
                                  c),
                              Times(Subtract(C1, CSqrt3), d)),
                          C0)))),
          IIntegrate(1882,
              Integrate(
                  Times(
                      Plus(c_, Times(d_DEFAULT,
                          Power(x_, C4))),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C6))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(b, Power(a, CN1)), C3))),
                      Plus(
                          Dist(Times(
                              Subtract(Times(C2, c, Sqr(q)), Times(Subtract(C1, CSqrt3), d)), Power(
                                  Times(C2, Sqr(q)), CN1)),
                              Integrate(Power(Plus(a, Times(b, Power(x, C6))), CN1D2), x), x),
                          Dist(Times(d, Power(Times(C2, Sqr(q)), CN1)),
                              Integrate(
                                  Times(Plus(C1, Negate(CSqrt3), Times(C2, Sqr(q), Power(x, C4))),
                                      Power(Plus(a, Times(b, Power(x, C6))), CN1D2)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d), x),
                      NeQ(Subtract(Times(C2, Sqr(Rt(Times(b, Power(a, CN1)), C3)), c),
                          Times(Subtract(C1, CSqrt3), d)), C0)))),
          IIntegrate(1883,
              Integrate(
                  Times(
                      Plus(c_, Times(d_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C8))), CN1D2)),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(
                          Times(c, d, Power(x, C3),
                              Sqrt(
                                  Times(CN1, Sqr(Subtract(c, Times(d, Sqr(x)))),
                                      Power(Times(c, d, Sqr(x)), CN1))),
                              Sqrt(
                                  Times(
                                      CN1, Sqr(d), Plus(a, Times(b,
                                          Power(x, C8))),
                                      Power(Times(b, Sqr(c), Power(x, C4)), CN1))),
                              EllipticF(ArcSin(Times(C1D2, C1,
                                  Sqrt(Times(
                                      Plus(Times(CSqrt2, Sqr(c)), Times(C2, c, d, Sqr(x)),
                                          Times(CSqrt2, Sqr(d), Power(x, C4))),
                                      Power(Times(c, d, Sqr(x)), CN1))))),
                                  Times(CN2, Subtract(C1, CSqrt2))),
                              Power(
                                  Times(Sqrt(Plus(C2, CSqrt2)), Subtract(c, Times(d, Sqr(x))),
                                      Sqrt(Plus(a, Times(b, Power(x, C8))))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, b, c,
                      d), x), EqQ(Subtract(Times(b, Power(c, C4)), Times(a, Power(d, C4))),
                          C0)))),
          IIntegrate(1884,
              Integrate(
                  Times(
                      Plus(c_, Times(d_DEFAULT,
                          Sqr(x_))),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, C8))), CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(
                              Plus(d, Times(Rt(Times(b, Power(a, CN1)), C4),
                                  c)),
                              Power(Times(C2, Rt(Times(b, Power(a, CN1)), C4)), CN1)),
                          Integrate(
                              Times(
                                  Plus(C1, Times(Rt(Times(b,
                                      Power(a, CN1)), C4), Sqr(
                                          x))),
                                  Power(Plus(a, Times(b, Power(x, C8))), CN1D2)),
                              x),
                          x),
                      Dist(
                          Times(Subtract(d, Times(Rt(Times(b, Power(a, CN1)), C4), c)),
                              Power(Times(C2, Rt(Times(b, Power(a, CN1)), C4)), CN1)),
                          Integrate(
                              Times(Subtract(C1, Times(Rt(Times(b, Power(a, CN1)), C4), Sqr(x))),
                                  Power(Plus(a, Times(b, Power(x, C8))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c,
                      d), x), NeQ(Subtract(Times(b, Power(c, C4)), Times(a, Power(d, C4))),
                          C0)))),
          IIntegrate(1885,
              Integrate(Times($p("§pq"),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)), x_Symbol),
              Condition(
                  Module(List(Set(q, Expon($s("§pq"), x)), j, k),
                      Integrate(
                          Sum(Times(Power(x, j),
                              Sum(Times(Coeff($s("§pq"), x, Plus(j, Times(C1D2, k, n))), Power(x,
                                  Times(C1D2, k, n))), List(k, C0,
                                      Plus(Times(C2, Subtract(q, j), Power(n, CN1)), C1))),
                              Power(Plus(a, Times(b, Power(x, n))), p)),
                              List(j, C0, Subtract(Times(C1D2, n), C1))),
                          x)),
                  And(FreeQ(List(a, b, p), x), PolyQ($s("§pq"), x), IGtQ(Times(C1D2,
                      n), C0), Not(
                          PolyQ($s("§pq"), Power(x, Times(C1D2, n))))))),
          IIntegrate(1886,
              Integrate(Times($p("§pq"), Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Plus(Dist(Coeff($s("§pq"), x, Subtract(n, C1)),
                      Integrate(Times(Power(x, Subtract(n, C1)),
                          Power(Plus(a, Times(b, Power(x, n))), p)), x),
                      x),
                      Integrate(Times(
                          ExpandToSum(Subtract($s("§pq"),
                              Times(Coeff($s("§pq"), x, Subtract(n, C1)),
                                  Power(x, Subtract(n, C1)))),
                              x),
                          Power(Plus(a, Times(b, Power(x, n))), p)), x)),
                  And(FreeQ(List(a, b, p), x), PolyQ($s("§pq"), x), IGtQ(n, C0),
                      Equal(Expon($s("§pq"), x), Subtract(n, C1))))),
          IIntegrate(1887,
              Integrate(Times($p("§pq"), Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(Times($s("§pq"), Power(Plus(a, Times(b, Power(x, n))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b), x), PolyQ($s("§pq"), x), IntegerQ(n)))),
          IIntegrate(1888,
              Integrate(Times($p("§pq"),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)), x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Expon($s("§pq"), x))),
                      Condition(
                          With(
                              List(Set(
                                  $s("§pqq"), Coeff($s("§pq"), x, q))),
                              Plus(
                                  Dist(Power(Times(b, Plus(q, Times(n, p), C1)), CN1), Integrate(
                                      Times(
                                          ExpandToSum(Subtract(
                                              Times(b, Plus(q, Times(n, p), C1),
                                                  Subtract($s("§pq"),
                                                      Times($s("§pqq"), Power(x, q)))),
                                              Times(a, $s("§pqq"), Plus(q, Negate(n), C1),
                                                  Power(x, Subtract(q, n)))),
                                              x),
                                          Power(Plus(a, Times(b, Power(x, n))), p)),
                                      x), x),
                                  Simp(Times($s("§pqq"), Power(x, Plus(q, Negate(n), C1)),
                                      Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                      Power(Times(b, Plus(q, Times(n, p), C1)), CN1)), x))),
                          And(NeQ(Plus(q, Times(n, p), C1), C0), GreaterEqual(Subtract(q, n), C0),
                              Or(IntegerQ(Times(C2, p)),
                                  IntegerQ(Plus(p,
                                      Times(Plus(q, C1), Power(Times(C2, n), CN1)))))))),
                  And(FreeQ(List(a, b, p), x), PolyQ($s("§pq"), x), IGtQ(n, C0)))),
          IIntegrate(1889,
              Integrate(Times($p("§pq"),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)), x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Expon($s("§pq"), x))),
                      Negate(
                          Subst(
                              Integrate(
                                  Times(
                                      ExpandToSum(Times(Power(x, q),
                                          ReplaceAll($s("§pq"), Rule(x, Power(x, CN1)))), x),
                                      Power(Plus(a, Times(b, Power(Power(x, n), CN1))), p),
                                      Power(Power(x, Plus(q, C2)), CN1)),
                                  x),
                              x, Power(x, CN1)))),
                  And(FreeQ(List(a, b, p), x), PolyQ($s("§pq"), x), ILtQ(n, C0)))),
          IIntegrate(1890,
              Integrate(Times($p("§pq"),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)), x_Symbol),
              Condition(
                  With(List(Set(g, Denominator(n))),
                      Dist(g,
                          Subst(
                              Integrate(Times(Power(x, Subtract(g, C1)),
                                  ReplaceAll($s("§pq"), Rule(x, Power(x, g))),
                                  Power(Plus(a, Times(b, Power(x, Times(g, n)))), p)), x),
                              x, Power(x, Power(g, CN1))),
                          x)),
                  And(FreeQ(List(a, b, p), x), PolyQ($s("§pq"), x), FractionQ(n)))),
          IIntegrate(1891,
              Integrate(
                  Times(
                      Plus(A_, Times(B_DEFAULT, Power(x_, m_DEFAULT))), Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(ASymbol, Integrate(Power(Plus(a, Times(b, Power(x, n))), p),
                          x), x),
                      Dist(BSymbol,
                          Integrate(Times(Power(x, m), Power(Plus(a, Times(b, Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, ASymbol, BSymbol, m, n, p), x),
                      EqQ(Plus(m, Negate(n), C1), C0)))),
          IIntegrate(1892,
              Integrate(Times($p("§p3"),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)), x_Symbol),
              Condition(
                  With(
                      List(Set(ASymbol, Coeff($s("§p3"), Power(x, Times(C1D2, n)), C0)),
                          Set(BSymbol, Coeff($s("§p3"), Power(x, Times(C1D2, n)), C1)),
                          Set(CSymbol, Coeff($s("§p3"), Power(x, Times(C1D2, n)), C2)), Set(D,
                              Coeff($s("§p3"), Power(x, Times(C1D2, n)), C3))),
                      Subtract(
                          Negate(
                              Simp(
                                  Times(x,
                                      Plus(Times(b, ASymbol), Times(CN1, a, CSymbol),
                                          Times(Subtract(Times(b, BSymbol), Times(a, D)),
                                              Power(x, Times(C1D2, n)))),
                                      Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)), Power(
                                          Times(a, b, n, Plus(p, C1)), CN1)),
                                  x)),
                          Dist(Power(Times(C2, a, b, n, Plus(p, C1)), CN1),
                              Integrate(
                                  Times(
                                      Power(Plus(a, Times(b,
                                          Power(x, n))), Plus(p,
                                              C1)),
                                      Simp(Plus(Times(C2, a, CSymbol),
                                          Times(CN1, C2, b, ASymbol,
                                              Plus(Times(n, Plus(p, C1)), C1)),
                                          Times(
                                              Subtract(Times(a, D, Plus(n, C2)),
                                                  Times(b, BSymbol,
                                                      Plus(Times(n, Plus(Times(C2, p), C3)), C2))),
                                              Power(x, Times(C1D2, n)))),
                                          x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, n), x), PolyQ($s("§p3"), Power(x, Times(C1D2, n)), C3),
                      ILtQ(p, CN1)))),
          IIntegrate(1893,
              Integrate(
                  Times($p("§pq"), Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))),
                      p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(Times($s("§pq"), Power(Plus(a, Times(b, Power(x, n))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, n, p), x),
                      Or(PolyQ($s("§pq"), x), PolyQ($s("§pq"), Power(x, n)))))),
          IIntegrate(1894,
              Integrate(
                  Times($p("§pq"), Power(Plus(a_, Times(b_DEFAULT, Power(v_, n_DEFAULT))),
                      p_)),
                  x_Symbol),
              Condition(
                  Dist(Power(Coeff(v, x, C1), CN1),
                      Subst(
                          Integrate(
                              Times(SubstFor(v, $s("§pq"), x),
                                  Power(Plus(a, Times(b, Power(x, n))), p)),
                              x),
                          x, v),
                      x),
                  And(FreeQ(List(a, b, n, p), x), LinearQ(v, x), PolyQ($s("§pq"), Power(v, n))))),
          IIntegrate(1895,
              Integrate(
                  Times($p("§pq"),
                      Power(Plus($p("a1"), Times($p("b1", true), Power(x_, n_DEFAULT))), p_DEFAULT),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_DEFAULT))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times($s("§pq"),
                          Power(
                              Plus(Times($s("a1"), $s("a2")),
                                  Times($s("b1"), $s("b2"), Power(x, Times(C2, n)))),
                              p)),
                      x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), n, p), x),
                      PolyQ($s("§pq"), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")),
                          Times($s("a1"), $s("b2"))), C0),
                      Or(IntegerQ(p), And(GtQ($s("a1"), C0), GtQ($s("a2"), C0)))))),
          IIntegrate(1896,
              Integrate(
                  Times($p("§pq"),
                      Power(Plus($p("a1"),
                          Times($p("b1", true), Power(x_, n_DEFAULT))), p_DEFAULT),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_DEFAULT))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), FracPart(p)),
                          Power(Plus($s("a2"),
                              Times($s("b2"), Power(x, n))), FracPart(p)),
                          Power(
                              Power(
                                  Plus(Times($s("a1"), $s("a2")), Times($s("b1"), $s("b2"),
                                      Power(x, Times(C2, n)))),
                                  FracPart(p)),
                              CN1)),
                      Integrate(
                          Times($s("§pq"),
                              Power(
                                  Plus(Times($s("a1"), $s("a2")),
                                      Times($s("b1"), $s("b2"), Power(x, Times(C2, n)))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), n, p), x),
                      PolyQ($s("§pq"), x), EqQ(Plus(Times($s("a2"), $s("b1")),
                          Times($s("a1"), $s("b2"))), C0),
                      Not(And(EqQ(n, C1), LinearQ($s("§pq"), x)))))),
          IIntegrate(1897,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_DEFAULT),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_DEFAULT))), p_DEFAULT), Plus(e_,
                          Times(f_DEFAULT, Power(x_, n_DEFAULT)), Times(g_DEFAULT,
                              Power(x_, $p("n2", true))))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(e, x, Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                          Power(Plus(c, Times(d, Power(x, n))), Plus(p, C1)), Power(Times(a, c),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, n, p), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(
                          Subtract(Times(a, c, f),
                              Times(e, Plus(Times(b, c), Times(a, d)),
                                  Plus(Times(n, Plus(p, C1)), C1))),
                          C0),
                      EqQ(Subtract(Times(a, c, g),
                          Times(b, d, e, Plus(Times(C2, n, Plus(p, C1)), C1))), C0)))),
          IIntegrate(1898,
              Integrate(
                  Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_DEFAULT),
                      Power(Plus(c_,
                          Times(d_DEFAULT, Power(x_, n_DEFAULT))), p_DEFAULT),
                      Plus(e_, Times(g_DEFAULT, Power(x_, $p("n2", true))))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(e, x, Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                          Power(Plus(c, Times(d, Power(x, n))), Plus(p,
                              C1)),
                          Power(Times(a, c), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, g, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Plus(Times(n, Plus(p, C1)),
                          C1), C0),
                      EqQ(Subtract(Times(a, c, g),
                          Times(b, d, e, Plus(Times(C2, n, Plus(p, C1)), C1))), C0)))),
          IIntegrate(1899, Integrate(Times(Plus(A_, Times(B_DEFAULT, Power(x_, m_DEFAULT))),
              Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT), Power(
                  Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_DEFAULT)),
              x_Symbol),
              Condition(
                  Plus(Dist(ASymbol,
                      Integrate(
                          Times(Power(Plus(a, Times(b, Power(x, n))), p),
                              Power(Plus(c, Times(d, Power(x, n))), q)),
                          x),
                      x),
                      Dist(BSymbol,
                          Integrate(
                              Times(Power(x, m), Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), q)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, ASymbol, BSymbol, m, n, p, q), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(m, Negate(n), C1), C0)))),
          IIntegrate(1900,
              Integrate(
                  Times(
                      Power($p(
                          "§px"), q_DEFAULT),
                      Power(
                          Plus(
                              a_DEFAULT, Times(b_DEFAULT, Power(Plus(c_, Times(d_DEFAULT, x_)),
                                  n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(k,
                          Denominator(n))),
                      Dist(Times(k, Power(d, CN1)),
                          Subst(
                              Integrate(SimplifyIntegrand(Times(Power(x, Subtract(k, C1)),
                                  Power(ReplaceAll($s("§px"),
                                      Rule(x,
                                          Subtract(Times(Power(x, k), Power(d, CN1)),
                                              Times(c, Power(d, CN1))))),
                                      q),
                                  Power(Plus(a, Times(b, Power(x, Times(k, n)))), p)), x), x),
                              x, Power(Plus(c, Times(d, x)), Power(k, CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, p), x), PolynomialQ($s("§px"), x), IntegerQ(q),
                      FractionQ(n)))));
}
