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
class IntRules86 {
  public static IAST RULES =
      List(
          IIntegrate(1721,
              Integrate(
                  Times(
                      $p("§px"), Power(Plus(d_,
                          Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(Power(Plus(a, Times(c, Power(x, C4))), CN1D2),
                          Times($s("§px"), Power(Plus(d, Times(e, Sqr(x))), q),
                              Power(Plus(a, Times(c, Power(x, C4))), Plus(p, C1D2))),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e), x), PolyQ($s("§px"), Sqr(x)),
                      NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), IntegerQ(Plus(p, C1D2)),
                      IntegerQ(q)))),
          IIntegrate(1722,
              Integrate(
                  Times($p("§px"), Power(Plus(d_, Times(e_DEFAULT, Sqr(x_))), q_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(Times($s("§px"), Power(Plus(d, Times(e, Sqr(x))), q),
                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)), x),
                  And(FreeQ(List(a, b, c, d, e, p, q), x), PolyQ($s("§px"), x)))),
          IIntegrate(
              1723, Integrate(Times($p("§px"),
                  Power(Plus(d_, Times(e_DEFAULT,
                      Sqr(x_))), q_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)), x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          $s("§px"), Power(Plus(d,
                              Times(e, Sqr(x))), q),
                          Power(Plus(a, Times(c, Power(x, C4))), p)),
                      x),
                  And(FreeQ(List(a, c, d, e, p, q), x), PolyQ($s("§px"), x)))),
          IIntegrate(1724,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, x_)), CN1),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(d,
                          Integrate(
                              Power(
                                  Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                      Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                  CN1),
                              x),
                          x),
                      Dist(e,
                          Integrate(
                              Times(x,
                                  Power(
                                      Times(
                                          Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))))),
                                      CN1)),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e), x))),
          IIntegrate(1725,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(d,
                          Integrate(
                              Power(Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                  Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1),
                              x),
                          x),
                      Dist(e,
                          Integrate(
                              Times(x,
                                  Power(Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                      Sqrt(Plus(a, Times(c, Power(x, C4))))), CN1)),
                              x),
                          x)),
                  FreeQ(List(a, c, d, e), x))),
          IIntegrate(1726,
              Integrate(
                  Times(Power(Plus(d_, Times(e_DEFAULT, x_)), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(e, C3), Power(Plus(d, Times(e, x)), Plus(q, C1)),
                              Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4)))),
                              Power(
                                  Times(Plus(q, C1),
                                      Plus(Times(c, Power(d, C4)), Times(b, Sqr(d), Sqr(e)),
                                          Times(a, Power(e, C4)))),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(Plus(q, C1),
                                  Plus(Times(c, Power(d, C4)), Times(b, Sqr(d), Sqr(e)),
                                      Times(a, Power(e, C4)))),
                              CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(q, C1)),
                                  Simp(Subtract(
                                      Plus(
                                          Times(d, Plus(q, C1),
                                              Plus(Times(c, Sqr(d)), Times(b, Sqr(e)))),
                                          Times(CN1, e,
                                              Plus(Times(c, Sqr(d), Plus(q, C1)),
                                                  Times(b, Sqr(e), Plus(q, C2))),
                                              x),
                                          Times(c, d, Sqr(e), Plus(q, C1), Sqr(x))),
                                      Times(c, Power(e, C3), Plus(q, C3), Power(x, C3))), x),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Plus(Times(c, Power(d, C4)), Times(b, Sqr(d), Sqr(e)),
                          Times(a, Power(e, C4))), C0),
                      ILtQ(q, CN1)))),
          IIntegrate(1727,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT,
                          x_)), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(e, C3), Power(Plus(d, Times(e, x)), Plus(q, C1)),
                              Sqrt(Plus(a, Times(c, Power(x, C4)))),
                              Power(Times(Plus(q, C1),
                                  Plus(Times(c, Power(d, C4)), Times(a, Power(e, C4)))),
                                  CN1)),
                          x),
                      Dist(Times(c, Power(
                          Times(Plus(q, C1), Plus(Times(c, Power(d, C4)), Times(a, Power(e, C4)))),
                          CN1)), Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(q, C1)), Simp(
                                  Subtract(
                                      Plus(Times(Power(d, C3), Plus(q, C1)),
                                          Times(CN1, Sqr(d), e, Plus(q, C1), x),
                                          Times(d, Sqr(e), Plus(q, C1), Sqr(x))),
                                      Times(Power(e, C3), Plus(q, C3), Power(x, C3))),
                                  x), Power(Plus(a, Times(c, Power(x, C4))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x),
                      NeQ(Plus(Times(c, Power(d,
                          C4)), Times(a,
                              Power(e, C4))),
                          C0),
                      ILtQ(q, CN1)))),
          IIntegrate(1728,
              Integrate(
                  Times(
                      Power(Plus(d_,
                          Times(e_DEFAULT, x_)), CN1),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(d,
                          Integrate(Times(
                              Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p), Power(
                                  Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                              x),
                          x),
                      Dist(e,
                          Integrate(
                              Times(
                                  x, Power(Plus(a, Times(b, Sqr(x)), Times(c,
                                      Power(x, C4))), p),
                                  Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), IntegerQ(Plus(p, C1D2))))),
          IIntegrate(1729,
              Integrate(
                  Times(
                      Power(Plus(d_, Times(e_DEFAULT, x_)), CN1),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(Dist(d,
                      Integrate(Times(Power(Plus(a, Times(c, Power(x, C4))), p),
                          Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)), x),
                      x),
                      Dist(e,
                          Integrate(
                              Times(x, Power(Plus(a, Times(c, Power(x, C4))), p),
                                  Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), IntegerQ(Plus(p, C1D2))))),
          IIntegrate(1730,
              Integrate(
                  Times($p("§px"), Power(Plus(d_, Times(e_DEFAULT, x_)), q_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(PolynomialQuotient($s("§px"), Plus(d, Times(e, x)), x),
                          Power(Plus(d, Times(e, x)), Plus(q, C1)), Power(
                              Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), p)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, p, q), x), PolyQ($s("§px"), x), EqQ(
                      PolynomialRemainder($s("§px"), Plus(d, Times(e, x)), x), C0)))),
          IIntegrate(1731,
              Integrate(
                  Times(
                      $p("§px"), Power(Plus(d_, Times(e_DEFAULT,
                          x_)), q_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(PolynomialQuotient($s("§px"), Plus(d, Times(e, x)), x),
                          Power(Plus(d, Times(e, x)),
                              Plus(q, C1)),
                          Power(Plus(a, Times(c, Power(x, C4))), p)),
                      x),
                  And(FreeQ(List(a, c, d, e, p, q), x), PolyQ($s("§px"), x), EqQ(
                      PolynomialRemainder($s("§px"), Plus(d, Times(e, x)), x), C0)))),
          IIntegrate(1732,
              Integrate(
                  Times($p("§px"), Power(Plus(d_, Times(e_DEFAULT, x_)), q_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(x_)),
                              Times(c_DEFAULT, Power(x_, C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          PolynomialQuotient($s("§px"),
                              Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), x),
                          Power(Plus(d, Times(e, x)), q), Power(Plus(a, Times(b, Sqr(x)),
                              Times(c, Power(x, C4))), Plus(p, C1))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, p, q), x), PolyQ($s("§px"), x),
                      EqQ(PolynomialRemainder($s("§px"),
                          Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), x), C0)))),
          IIntegrate(1733,
              Integrate(Times($p("§px"), Power(Plus(d_, Times(e_DEFAULT, x_)), q_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), p_DEFAULT)), x_Symbol),
              Condition(
                  Integrate(
                      Times(PolynomialQuotient($s("§px"), Plus(a, Times(c, Power(x, C4))), x),
                          Power(Plus(d, Times(e, x)), q),
                          Power(Plus(a, Times(c, Power(x, C4))), Plus(p, C1))),
                      x),
                  And(FreeQ(List(a, c, d, e, p, q), x), PolyQ($s("§px"), x),
                      EqQ(PolynomialRemainder($s("§px"), Plus(a, Times(c, Power(x, C4))), x),
                          C0)))),
          IIntegrate(1734,
              Integrate(Times(
                  $p("§px"), Power(Plus(d_, Times(e_DEFAULT, x_)), q_),
                  Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                      CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(
                          Set(ASymbol, Coeff($s("§px"), x, C0)), Set(BSymbol,
                              Coeff($s("§px"), x, C1)),
                          Set(CSymbol, Coeff($s("§px"), x, C2)), Set(D, Coeff($s("§px"), x, C3))),
                      Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(q, C1)),
                          Plus(Times(ASymbol, d),
                              Times(Plus(Times(BSymbol, d), Times(ASymbol, e)), x),
                              Times(Plus(Times(CSymbol, d), Times(BSymbol, e)), Sqr(x)),
                              Times(CSymbol, e, Power(x, C3))),
                          Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2)), x)),
                  And(FreeQ(List(a, b, c, d, e), x), PolyQ($s("§px"), x),
                      LeQ(Expon($s("§px"), x), C2),
                      NeQ(Plus(Times(c, Power(d, C4)), Times(b, Sqr(d), Sqr(e)),
                          Times(a, Power(e, C4))), C0),
                      GtQ(q, C0)))),
          IIntegrate(1735,
              Integrate(Times($p("§px"), Power(Plus(d_, Times(e_DEFAULT, x_)), q_),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)), x_Symbol),
              Condition(
                  With(List(Set(ASymbol, Coeff($s("§px"), x, C0)),
                      Set(BSymbol, Coeff($s("§px"), x, C1)), Set(CSymbol,
                          Coeff($s("§px"), x, C2)),
                      Set(D, Coeff($s("§px"), x, C3))),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), Subtract(q, C1)),
                              Plus(Times(ASymbol, d),
                                  Times(Plus(Times(BSymbol, d), Times(ASymbol, e)), x),
                                  Times(Plus(Times(CSymbol, d), Times(BSymbol, e)),
                                      Sqr(x)),
                                  Times(CSymbol, e, Power(x, C3))),
                              Power(Plus(a, Times(c, Power(x, C4))), CN1D2)),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), PolyQ($s("§px"), x), LeQ(Expon($s("§px"),
                      x), C2), NeQ(Plus(Times(c, Power(d, C4)), Times(a, Power(e, C4))),
                          C0),
                      GtQ(q, C0)))),
          IIntegrate(1736,
              Integrate(
                  Times(
                      $p("§px"), Power(Plus(d_,
                          Times(e_DEFAULT, x_)), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(ASymbol, Coeff($s("§px"), x, C0)),
                          Set(BSymbol, Coeff($s("§px"), x, C1)), Set(CSymbol, Coeff($s("§px"), x,
                              C2)),
                          Set(D, Coeff($s("§px"), x, C3))),
                      Subtract(
                          Simp(
                              Times(D, Power(Plus(d, Times(e, x)), q),
                                  Sqrt(Plus(a, Times(b, Sqr(x)),
                                      Times(c, Power(x, C4)))),
                                  Power(Times(c, Plus(q, C2)), CN1)),
                              x),
                          Dist(Power(Times(c, Plus(q, C2)), CN1),
                              Integrate(
                                  Times(
                                      Power(Plus(d, Times(e, x)), Subtract(q,
                                          C1)),
                                      Simp(
                                          Subtract(
                                              Plus(
                                                  Times(a, D, e, q),
                                                  Times(CN1, ASymbol, c, d, Plus(q, C2)),
                                                  Times(Subtract(
                                                      Subtract(Times(b, d, D),
                                                          Times(BSymbol, c, d, Plus(q, C2))),
                                                      Times(ASymbol, c, e, Plus(q, C2))), x),
                                                  Times(
                                                      Subtract(Times(b, D, e, Plus(q, C1)),
                                                          Times(c,
                                                              Plus(Times(CSymbol, d),
                                                                  Times(BSymbol, e)),
                                                              Plus(q, C2))),
                                                      Sqr(x))),
                                              Times(c,
                                                  Plus(Times(d, D, q),
                                                      Times(CSymbol, e, Plus(q, C2))),
                                                  Power(x, C3))),
                                          x),
                                      Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))),
                                          CN1D2)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), PolyQ($s("§px"), x, C3),
                      NeQ(Plus(Times(c, Power(d, C4)), Times(b, Sqr(d), Sqr(e)),
                          Times(a, Power(e, C4))), C0),
                      GtQ(q, C0)))),
          IIntegrate(1737,
              Integrate(Times(
                  $p("§px"), Power(Plus(d_, Times(e_DEFAULT, x_)), q_),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)), x_Symbol),
              Condition(
                  With(
                      List(Set(ASymbol, Coeff($s("§px"), x, C0)),
                          Set(BSymbol, Coeff($s("§px"), x, C1)), Set(CSymbol,
                              Coeff($s("§px"), x, C2)),
                          Set(D, Coeff($s("§px"), x, C3))),
                      Subtract(
                          Simp(
                              Times(D, Power(Plus(d, Times(e, x)), q),
                                  Sqrt(Plus(a,
                                      Times(c, Power(x, C4)))),
                                  Power(Times(c, Plus(q, C2)), CN1)),
                              x),
                          Dist(Power(Times(c, Plus(q, C2)), CN1),
                              Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(q, C1)),
                                  Simp(Subtract(
                                      Subtract(
                                          Subtract(
                                              Subtract(Times(a, D, e, q),
                                                  Times(ASymbol, c, d, Plus(q, C2))),
                                              Times(c,
                                                  Plus(Times(BSymbol, d, Plus(q, C2)),
                                                      Times(ASymbol, e, Plus(q, C2))),
                                                  x)),
                                          Times(c, Plus(Times(CSymbol, d), Times(BSymbol, e)),
                                              Plus(q, C2), Sqr(x))),
                                      Times(c, Plus(Times(d, D, q), Times(CSymbol, e, Plus(q, C2))),
                                          Power(x, C3))),
                                      x),
                                  Power(Plus(a, Times(c, Power(x, C4))), CN1D2)), x),
                              x))),
                  And(FreeQ(List(a, c, d, e), x), PolyQ($s("§px"), x,
                      C3), NeQ(Plus(Times(c, Power(d, C4)), Times(a, Power(e, C4))), C0),
                      GtQ(q, C0)))),
          IIntegrate(1738,
              Integrate(
                  Times($p("§px"), Power(Plus(d_, Times(e_DEFAULT, x_)), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_)), Times(c_DEFAULT, Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(With(
                  List(Set(ASymbol, Coeff($s("§px"), x, C0)), Set(BSymbol, Coeff($s("§px"), x, C1)),
                      Set(CSymbol, Coeff($s("§px"), x, C2)), Set(D, Coeff($s("§px"), x, C3))),
                  Plus(
                      Negate(Simp(Times(
                          Subtract(Plus(Times(Power(d, C3), D), Times(CN1, CSymbol, Sqr(d), e),
                              Times(BSymbol, d, Sqr(e))), Times(ASymbol, Power(e, C3))),
                          Power(Plus(d, Times(e, x)), Plus(q, C1)),
                          Sqrt(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4)))),
                          Power(Times(
                              Plus(q, C1),
                              Plus(Times(
                                  c, Power(d, C4)), Times(b, Sqr(d), Sqr(e)),
                                  Times(a, Power(e, C4)))),
                              CN1)),
                          x)),
                      Dist(
                          Power(Times(Plus(q, C1),
                              Plus(Times(c, Power(d, C4)), Times(b, Sqr(d), Sqr(e)),
                                  Times(a, Power(e, C4)))),
                              CN1),
                          Integrate(
                              Times(Power(Plus(d, Times(e, x)), Plus(q, C1)),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2),
                                  Simp(Plus(
                                      Times(Plus(q, C1),
                                          Plus(
                                              Times(
                                                  a, e,
                                                  Plus(
                                                      Times(Sqr(d), D), Times(CN1, CSymbol, d, e),
                                                      Times(BSymbol, Sqr(e)))),
                                              Times(
                                                  ASymbol, d, Plus(Times(c, Sqr(
                                                      d)), Times(b,
                                                          Sqr(e)))))),
                                      Times(CN1,
                                          Subtract(
                                              Subtract(
                                                  Times(e, Plus(q, C1),
                                                      Plus(Times(ASymbol, c, Sqr(d)),
                                                          Times(a, e,
                                                              Subtract(Times(d, D),
                                                                  Times(CSymbol, e))))),
                                                  Times(BSymbol, d,
                                                      Plus(Times(c, Sqr(d), Plus(q, C1)),
                                                          Times(b, Sqr(e), Plus(q, C2))))),
                                              Times(b,
                                                  Subtract(Subtract(Times(Power(d, C3), D),
                                                      Times(CSymbol, Sqr(d), e)),
                                                      Times(ASymbol, Power(e, C3), Plus(q, C2))))),
                                          x),
                                      Times(Plus(q, C1), Plus(
                                          Times(D, e, Plus(Times(b, Sqr(d)), Times(a, Sqr(e)))),
                                          Times(c, d,
                                              Subtract(Times(CSymbol, Sqr(d)),
                                                  Times(e,
                                                      Subtract(Times(BSymbol, d),
                                                          Times(ASymbol, e)))))),
                                          Sqr(x)),
                                      Times(c, Plus(q, C3),
                                          Subtract(
                                              Plus(Times(Power(d, C3), D),
                                                  Times(CN1, CSymbol, Sqr(d), e),
                                                  Times(BSymbol, d, Sqr(e))),
                                              Times(ASymbol, Power(e, C3))),
                                          Power(x, C3))),
                                      x)),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e), x), PolyQ($s("§px"), x),
                      LeQ(Expon($s("§px"), x), C3), NeQ(
                          Plus(Times(c, Power(d, C4)), Times(b, Sqr(d), Sqr(e)),
                              Times(a, Power(e, C4))),
                          C0),
                      LtQ(q, CN1)))),
          IIntegrate(1739,
              Integrate(
                  Times(
                      $p("§px"), Power(Plus(d_, Times(e_DEFAULT,
                          x_)), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, C4))), CN1D2)),
                  x_Symbol),
              Condition(
                  With(List(Set(ASymbol, Coeff($s("§px"), x, C0)),
                      Set(BSymbol, Coeff($s("§px"), x, C1)), Set(CSymbol,
                          Coeff($s("§px"), x, C2)),
                      Set(D, Coeff($s("§px"), x, C3))),
                      Plus(
                          Negate(
                              Simp(
                                  Times(
                                      Subtract(
                                          Plus(Times(Power(d, C3), D),
                                              Times(CN1, CSymbol, Sqr(d), e),
                                              Times(BSymbol, d, Sqr(e))),
                                          Times(ASymbol, Power(e, C3))),
                                      Power(Plus(d, Times(e, x)), Plus(q, C1)),
                                      Sqrt(Plus(a, Times(c, Power(x, C4)))),
                                      Power(
                                          Times(Plus(q, C1), Plus(Times(c, Power(d, C4)),
                                              Times(a, Power(e, C4)))),
                                          CN1)),
                                  x)),
                          Dist(
                              Power(Times(Plus(q, C1),
                                  Plus(Times(c, Power(d, C4)), Times(a, Power(e, C4)))), CN1),
                              Integrate(
                                  Times(Power(Plus(d, Times(e, x)), Plus(q, C1)),
                                      Power(Plus(a, Times(c, Power(x, C4))), CN1D2),
                                      Simp(
                                          Plus(
                                              Times(Plus(q, C1),
                                                  Plus(Times(a, e,
                                                      Plus(Times(Sqr(d), D),
                                                          Times(CN1, CSymbol, d, e),
                                                          Times(BSymbol, Sqr(e)))),
                                                      Times(ASymbol, d, c, Sqr(d)))),
                                              Times(CN1,
                                                  Subtract(
                                                      Times(e, Plus(q, C1),
                                                          Plus(Times(ASymbol, c, Sqr(d)),
                                                              Times(a, e,
                                                                  Subtract(Times(d, D),
                                                                      Times(CSymbol, e))))),
                                                      Times(BSymbol, d, c, Sqr(d), Plus(q, C1))),
                                                  x),
                                              Times(Plus(q, C1),
                                                  Plus(
                                                      Times(D, e, a, Sqr(e)),
                                                      Times(c, d,
                                                          Subtract(Times(CSymbol, Sqr(d)),
                                                              Times(e,
                                                                  Subtract(Times(BSymbol, d),
                                                                      Times(ASymbol, e)))))),
                                                  Sqr(x)),
                                              Times(c, Plus(q, C3),
                                                  Subtract(
                                                      Plus(Times(Power(d, C3), D),
                                                          Times(CN1, CSymbol, Sqr(d), e),
                                                          Times(BSymbol, d, Sqr(e))),
                                                      Times(ASymbol, Power(e, C3))),
                                                  Power(x, C3))),
                                          x)),
                                  x),
                              x))),
                  And(FreeQ(List(a, c, d, e), x), PolyQ($s("§px"), x), LeQ(Expon($s("§px"),
                      x), C3), NeQ(Plus(Times(c, Power(d, C4)), Times(a, Power(e, C4))),
                          C0),
                      LtQ(q, CN1)))),
          IIntegrate(1740,
              Integrate(
                  Times(
                      Plus(A_, Times(B_DEFAULT, x_)), Power(Plus(d_,
                          Times(e_DEFAULT, x_)), CN1),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sqr(
                              x_)), Times(c_DEFAULT,
                                  Power(x_, C4))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(
                              Sqr(ASymbol), Plus(Times(BSymbol, d), Times(ASymbol, e)),
                              Power(e, CN1)),
                          Subst(
                              Integrate(
                                  Power(
                                      Subtract(
                                          Plus(Times(C6, Power(ASymbol, C3), BSymbol, d),
                                              Times(C3, Power(ASymbol, C4), e)),
                                          Times(a, e, Sqr(x))),
                                      CN1),
                                  x),
                              x,
                              Times(Sqr(Plus(ASymbol, Times(BSymbol, x))),
                                  Power(Plus(a, Times(b, Sqr(x)), Times(c, Power(x, C4))), CN1D2))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol), x),
                      NeQ(Subtract(Times(BSymbol, d), Times(ASymbol, e)), C0),
                      EqQ(Plus(Times(Sqr(c), Power(d, C6)),
                          Times(a, Power(e, C4),
                              Plus(Times(ZZ(13L), c, Sqr(d)), Times(b, Sqr(e))))),
                          C0),
                      EqQ(Subtract(Times(Sqr(b), Power(e, C4)),
                          Times(ZZ(12L), c, Sqr(d), Subtract(Times(c, Sqr(d)), Times(b, Sqr(e))))),
                          C0),
                      EqQ(Plus(Times(C4, ASymbol, c, d, e),
                          Times(BSymbol, Subtract(Times(C2, c, Sqr(d)), Times(b, Sqr(e))))),
                          C0)))));
}
