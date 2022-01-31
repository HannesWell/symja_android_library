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
class IntRules87 {
  public static IAST RULES =
      List(
          IIntegrate(1741,
              Integrate(
                  Times(
                      $p("§px"), Power(Plus(d_,
                          Times(e_DEFAULT, x_)), CN1),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(ASymbol, Coeff($s("§px"), x, C0)),
                          Set(BSymbol, Coeff($s("§px"), x, C1)), Set(CSymbol,
                              Coeff($s("§px"), x, C2)),
                          Set(D, Coeff($s("§px"), x, C3))),
                      Plus(
                          Integrate(Times(x,
                              Plus(Times(BSymbol, d), Times(CN1, ASymbol, e),
                                  Times(Subtract(Times(d, D), Times(CSymbol, e)), Sqr(x))),
                              Power(
                                  Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                      Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                  CN1)),
                              x),
                          Integrate(
                              Times(
                                  Subtract(Plus(Times(ASymbol, d),
                                      Times(Subtract(Times(CSymbol, d), Times(BSymbol, e)),
                                          Sqr(x))),
                                      Times(D, e, Power(x, C4))),
                                  Power(
                                      Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                      CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), PolyQ($s("§px"), x),
                      LeQ(Expon($s("§px"),
                          x), C3),
                      NeQ(Plus(Times(c, Power(d,
                          C4)), Times(b, Sqr(d),
                              Sqr(e)),
                          Times(a, Power(e, C4))), C0)))),
          IIntegrate(1742,
              Integrate(
                  Times(
                      $p("§px"), Power(Plus(d_, Times(e_DEFAULT,
                          x_)), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(ASymbol, Coeff($s("§px"), x, C0)),
                          Set(BSymbol, Coeff($s("§px"), x, C1)), Set(CSymbol, Coeff($s("§px"), x,
                              C2)),
                          Set(D, Coeff($s("§px"), x, C3))),
                      Plus(
                          Integrate(Times(x,
                              Plus(Times(BSymbol, d), Times(CN1, ASymbol, e),
                                  Times(Subtract(Times(d, D), Times(CSymbol, e)), Sqr(x))),
                              Power(Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                  Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1)),
                              x),
                          Integrate(
                              Times(
                                  Subtract(Plus(Times(ASymbol, d),
                                      Times(Subtract(Times(CSymbol, d), Times(BSymbol, e)),
                                          Sqr(x))),
                                      Times(D, e, Power(x, C4))),
                                  Power(Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                      Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1)),
                              x))),
                  And(FreeQ(List(a, c, d, e), x), PolyQ($s("§px"), x), LeQ(Expon($s("§px"),
                      x), C3), NeQ(Plus(Times(c, Power(d, C4)), Times(a, Power(e, C4))),
                          C0)))),
          IIntegrate(1743,
              Integrate(
                  Times(
                      $p("§px"), Power(Plus(d_,
                          Times(e_DEFAULT, x_)), CN1),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(d,
                          Integrate(Times($s("§px"),
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p), Power(
                                  Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                              x),
                          x),
                      Dist(e,
                          Integrate(
                              Times(x, $s("§px"),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c,
                                      Power(x, C4))), p),
                                  Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d,
                      e), x), PolyQ($s("§px"),
                          x),
                      IntegerQ(Plus(p, C1D2))))),
          IIntegrate(1744,
              Integrate(
                  Times($p("§px"), Power(Plus(d_, Times(e_DEFAULT, x_)), CN1), Power(
                      Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(d,
                          Integrate(
                              Times($s("§px"), Power(Plus(a, Times(c, Power(x, C4))), p),
                                  Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                              x),
                          x),
                      Dist(e,
                          Integrate(
                              Times(x, $s("§px"), Power(Plus(a, Times(c, Power(x, C4))), p),
                                  Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), PolyQ($s("§px"), x), IntegerQ(Plus(p, C1D2))))),
          IIntegrate(1745,
              Integrate(
                  Times($p("§pq"), Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(n, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  SubstFor(Power(x, n), $s("§pq"), x), Power(
                                      Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                              x),
                          x, Power(x, n)),
                      x),
                  And(FreeQ(List(a, b, c, m, n, p), x), EqQ($s("n2"),
                      Times(C2, n)), PolyQ($s("§pq"), Power(x, n)),
                      EqQ(Simplify(Plus(m, Negate(n), C1)), C0)))),
          IIntegrate(1746,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT), Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_DEFAULT)), Times(c_DEFAULT,
                              Power(x_, $p("n2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Times(d,
                                  x), m),
                              $s("§pq"),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), x), IGtQ(p, C0)))),
          IIntegrate(1747,
              Integrate(
                  Times(Power(Times(g_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT),
                      Plus(d_, Times(e_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(f_DEFAULT, Power(x_, $p("n2", true))))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(d, Power(Times(g, x), Plus(m, C1)),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              Plus(p, C1)),
                          Power(Times(a, g, Plus(m, C1)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Subtract(Times(a, e, Plus(m, C1)),
                          Times(b, d, Plus(m, Times(n, Plus(p, C1)), C1))), C0),
                      EqQ(Subtract(Times(a, f, Plus(m, C1)),
                          Times(c, d, Plus(m, Times(C2, n, Plus(p, C1)), C1))),
                          C0),
                      NeQ(m, CN1)))),
          IIntegrate(1748,
              Integrate(
                  Times(Power(Times(g_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT),
                      Plus(d_, Times(f_DEFAULT, Power(x_, $p("n2", true))))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(d, Power(Times(g, x), Plus(m, C1)),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              Plus(p, C1)),
                          Power(Times(a, g, Plus(m, C1)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, f, g, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Plus(m, Times(n, Plus(p, C1)), C1), C0), EqQ(Plus(Times(c, d),
                          Times(a, f)), C0),
                      NeQ(m, CN1)))),
          IIntegrate(1749,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(b_DEFAULT, Power(x_,
                                  n_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              FracPart(p)),
                          Power(
                              Times(Power(Times(C4, c), IntPart(p)),
                                  Power(Plus(b, Times(C2, c, Power(x, n))),
                                      Times(C2, FracPart(p)))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(Times(d, x), m), $s("§pq"), Power(
                                  Plus(b, Times(C2, c, Power(x, n))), Times(C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), x), EqQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      Not(IntegerQ(Times(C2, p)))))),
          IIntegrate(1750,
              Integrate(
                  Times($p("§pq"), Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(Power(n, CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(x,
                                      Subtract(Simplify(Times(Plus(m, C1), Power(n, CN1))), C1)),
                                  SubstFor(Power(x, n), $s("§pq"), x),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                              x),
                          x, Power(x, n)),
                      x),
                  And(FreeQ(List(a, b, c, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), Power(x, n)), NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IntegerQ(Simplify(Times(Plus(m, C1), Power(n, CN1))))))),
          IIntegrate(1751,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(d_,
                          x_), m_DEFAULT),
                      Power(Plus(
                          a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(Times(d, x), m), Power(Power(x, m), CN1)),
                      Integrate(Times(Power(x, m), $s("§pq"),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), Power(x, n)), NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IntegerQ(Simplify(Times(Plus(m, C1), Power(n, CN1))))))),
          IIntegrate(1752,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(Power(d, CN1),
                      Integrate(
                          Times(Power(Times(d, x), Plus(m, C1)),
                              PolynomialQuotient($s(
                                  "§pq"), x, x),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), x), EqQ(Coeff($s("§pq"), x, C0), C0)))),
          IIntegrate(1753,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(b_DEFAULT, Power(x_, n_DEFAULT)), Times(c_DEFAULT,
                                  Power(x_, $p("n2", true)))),
                          QQ(-3L, 2L)),
                      Plus(e_, Times(f_DEFAULT, Power(x_, q_DEFAULT)), Times(g_DEFAULT, Power(x_,
                          r_DEFAULT)), Times(h_DEFAULT,
                              Power(x_, s_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Negate(
                      Simp(Times(
                          Plus(
                              Times(C2, c, Subtract(Times(b, f), Times(C2, a, g))),
                              Times(
                                  C2, h, Subtract(Sqr(b), Times(C4, a, c)),
                                  Power(x, Times(C1D2, n))),
                              Times(C2, c, Subtract(Times(C2, c, f), Times(b, g)), Power(x, n))),
                          Power(Times(c, n, Subtract(Sqr(b), Times(C4, a, c)),
                              Sqrt(Plus(a, Times(b, Power(x, n)),
                                  Times(c, Power(x, Times(C2, n)))))),
                              CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, e, f, g, h, m, n), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(q, Times(C1D2, n)), EqQ(r, Times(C1D2, C3, n)), EqQ(s, Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(C2, m), Negate(n), C2),
                          C0),
                      EqQ(Plus(Times(c, e), Times(a, h)), C0)))),
          IIntegrate(1754,
              Integrate(
                  Times(
                      Power(Times(d_,
                          x_), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, $p("n2", true)))),
                          QQ(-3L, 2L)),
                      Plus(e_, Times(f_DEFAULT, Power(x_, q_DEFAULT)),
                          Times(g_DEFAULT, Power(x_, r_DEFAULT)),
                          Times(h_DEFAULT, Power(x_, s_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(Times(d, x), m), Power(Power(x, m), CN1)),
                      Integrate(Times(Power(x, m), Plus(e, Times(f, Power(x, Times(C1D2, n))),
                          Times(g, Power(x, Times(C1D2, C3, n))), Times(h, Power(x, Times(C2, n)))),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              QQ(-3L, 2L))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, g, h, m, n), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(q, Times(C1D2, n)), EqQ(r, Times(C1D2, C3, n)), EqQ(s, Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      EqQ(Plus(Times(C2, m), Negate(n), C2), C0),
                      EqQ(Plus(Times(c, e), Times(a, h)), C0)))),
          IIntegrate(1755,
              Integrate(Times($p("§pq"), Power(x_, m_),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_)),
                      Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(Module(List(Set(q, Expon($s("§pq"), x))),
                  Condition(
                      Module(
                          List(
                              Set(QSymbol,
                                  PolynomialQuotient(
                                      Times(a,
                                          Power(Times(b, c),
                                              Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1)),
                                          Power(x, m), $s("§pq")),
                                      Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))),
                                      x)),
                              Set($s("R"), PolynomialRemainder(
                                  Times(a,
                                      Power(
                                          Times(b, c),
                                          Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))), C1)),
                                      Power(x, m), $s("§pq")),
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  x)),
                              i),
                          Subtract(
                              Dist(
                                  Power(
                                      Times(a, n, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c)),
                                          Power(Times(b, c),
                                              Plus(
                                                  Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1))),
                                      CN1),
                                  Integrate(
                                      Times(Power(x, m),
                                          Power(
                                              Plus(
                                                  a, Times(b, Power(x, n)),
                                                  Times(c, Power(x, Times(C2, n)))),
                                              Plus(p, C1)),
                                          ExpandToSum(
                                              Plus(Times(n, Plus(p, C1),
                                                  Subtract(Sqr(b), Times(C4, a, c)), QSymbol, Power(
                                                      Power(x, m), CN1)),
                                                  Sum(Plus(
                                                      Times(
                                                          Subtract(
                                                              Times(Subtract(
                                                                  Times(Sqr(b),
                                                                      Plus(Times(n, Plus(p, C1)), i,
                                                                          C1),
                                                                      Power(a, CN1)),
                                                                  Times(C2, c,
                                                                      Plus(
                                                                          Times(C2, n, Plus(p, C1)),
                                                                          i, C1))),
                                                                  Coeff($s("R"), x, i)),
                                                              Times(b, Plus(i, C1),
                                                                  Coeff($s("R"), x, Plus(n, i)))),
                                                          Power(x, Subtract(i, m))),
                                                      Times(
                                                          c,
                                                          Plus(Times(n, Plus(Times(C2, p), C3)), i,
                                                              C1),
                                                          Subtract(
                                                              Times(b, Coeff($s("R"), x, i),
                                                                  Power(a, CN1)),
                                                              Times(C2,
                                                                  Coeff($s("R"), x, Plus(n, i)))),
                                                          Power(x, Subtract(Plus(n, i), m)))),
                                                      List(i, C0, Subtract(n, C1)))),
                                              x)),
                                      x),
                                  x),
                              Simp(
                                  Times(x,
                                      Power(
                                          Plus(
                                              a, Times(b, Power(x, n)), Times(c,
                                                  Power(x, Times(C2, n)))),
                                          Plus(p, C1)),
                                      Sum(Plus(
                                          Times(
                                              Subtract(
                                                  Times(Subtract(Sqr(b), Times(C2, a, c)),
                                                      Coeff($s("R"), x, i)),
                                                  Times(a, b, Coeff($s("R"), x, Plus(n, i)))),
                                              Power(x, i)),
                                          Times(
                                              c,
                                              Subtract(Times(b, Coeff($s("R"), x, i)),
                                                  Times(C2, a, Coeff($s("R"), x, Plus(n, i)))),
                                              Power(x, Plus(n, i)))),
                                          List(i, C0, Subtract(n, C1))),
                                      Power(Times(Sqr(a), n, Plus(p, C1),
                                          Subtract(Sqr(b), Times(C4, a, c)),
                                          Power(Times(b, c),
                                              Plus(Floor(Times(Subtract(q, C1), Power(n, CN1))),
                                                  C1))),
                                          CN1)),
                                  x))),
                      GeQ(q, Times(C2, n)))),
                  And(FreeQ(List(a, b, c), x), EqQ($s("n2"), Times(C2, n)), PolyQ($s("§pq"), x),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), ILtQ(m, C0)))),
          IIntegrate(1756,
              Integrate(
                  Times($p("§pq"), Power(x_, m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(List(Set(g, GCD(Plus(m, C1), n))),
                      Condition(Dist(Power(g, CN1),
                          Subst(
                              Integrate(
                                  Times(Power(x, Subtract(Times(Plus(m, C1), Power(g, CN1)), C1)),
                                      ReplaceAll($s("§pq"), Rule(x, Power(x, Power(g, CN1)))),
                                      Power(Plus(a, Times(b, Power(x, Times(n, Power(g, CN1)))),
                                          Times(c, Power(x, Times(C2, n, Power(g, CN1))))), p)),
                                  x),
                              x, Power(x, g)),
                          x), NeQ(g, C1))),
                  And(FreeQ(List(a, b, c, p), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), Power(x, n)), NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), IntegerQ(m)))),
          IIntegrate(1757,
              Integrate(
                  Times($p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(Times(Power(Times(d, x), m), $s("§pq"),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), Power(x, n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      IGtQ(n, C0), NiceSqrtQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(1758,
              Integrate(Times($p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                      Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Expon($s("§pq"), x))),
                      Condition(
                          With(List(Set($s("§pqq"), Coeff($s("§pq"), x, q))),
                              Plus(Integrate(Times(Power(Times(d, x), m), ExpandToSum(
                                  Subtract(
                                      Subtract($s("§pq"), Times($s("§pqq"), Power(x, q))),
                                      Times(
                                          $s("§pqq"),
                                          Plus(
                                              Times(a, Plus(m, q, Times(CN1, C2, n), C1),
                                                  Power(x, Subtract(q, Times(C2, n)))),
                                              Times(b, Plus(m, q, Times(n, Subtract(p, C1)), C1),
                                                  Power(x, Subtract(q, n)))),
                                          Power(Times(c, Plus(m, q, Times(C2, n, p), C1)), CN1))),
                                  x),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), p)),
                                  x),
                                  Simp(Times($s("§pqq"),
                                      Power(Times(d, x), Plus(m, q, Times(CN1, C2, n), C1)),
                                      Power(Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                      Power(Times(c, Power(d, Plus(q, Times(CN1, C2, n), C1)),
                                          Plus(m, q, Times(C2, n, p), C1)), CN1)),
                                      x))),
                          And(GeQ(q, Times(C2, n)), NeQ(Plus(m, q, Times(C2, n, p),
                              C1), C0), Or(IntegerQ(Times(C2, p)),
                                  And(EqQ(n,
                                      C1), IntegerQ(Times(C4, p))),
                                  IntegerQ(
                                      Plus(p, Times(Plus(q, C1), Power(Times(C2, n), CN1)))))))),
                  And(FreeQ(List(a, b, c, d, m, p), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), Power(x, n)), NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0)))),
          IIntegrate(1759,
              Integrate(
                  Times(
                      $p("§pq"), Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(b_DEFAULT, Power(x_,
                                  n_)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          p_)),
                  x_Symbol),
              Condition(
                  Module(List(Set(q, Expon($s("§pq"), x)), j, k),
                      Integrate(
                          Sum(Times(
                              C1, Power(Times(d, x), Plus(m, j)),
                              Sum(Times(Coeff($s("§pq"), x, Plus(j, Times(k, n))),
                                  Power(x, Times(k, n))),
                                  List(k, C0, Plus(Times(Subtract(q, j), Power(n, CN1)), C1))),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  p),
                              Power(Power(d, j), CN1)), List(j, C0, Subtract(n, C1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, m, p), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), x), NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), Not(PolyQ($s("§pq"), Power(x, n)))))),
          IIntegrate(1760,
              Integrate(
                  Times($p("§pq"), Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(
                          b_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(c_DEFAULT, Power(x_, $p("n2", true)))), CN1)),
                  x_Symbol),
              Condition(
                  Integrate(RationalFunctionExpand(Times(Power(Times(d, x), m), $s("§pq"),
                      Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))), CN1)),
                      x), x),
                  And(FreeQ(List(a, b, c, d, m), x), EqQ($s("n2"), Times(C2, n)),
                      PolyQ($s("§pq"), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                      IGtQ(n, C0)))));
}
