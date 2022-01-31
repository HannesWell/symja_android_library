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
class IntRules16 {
  public static IAST RULES =
      List(
          IIntegrate(321,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(c, Subtract(n, C1)),
                              Power(Times(c, x), Plus(m, Negate(n), C1)),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)), Power(
                                  Times(b, Plus(m, Times(n, p), C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              a, Power(c, n), Plus(m, Negate(
                                  n), C1),
                              Power(Times(b, Plus(m, Times(n, p), C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Times(c, x), Subtract(m,
                                      n)),
                                  Power(Plus(a, Times(b, Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, p), x), IGtQ(n, C0), GtQ(m, Subtract(n, C1)), NeQ(Plus(m,
                      Times(n, p), C1), C0), IntBinomialQ(a, b, c, n, m, p,
                          x)))),
          IIntegrate(322,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(
                      Times(Power(c, Subtract(n, C1)), Power(Times(c, x), Plus(m, Negate(n), C1)),
                          Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                          Power(Times(b, Plus(m, Times(n, p), C1)), CN1)),
                      x),
                      Dist(
                          Times(a, Power(c, n), Plus(m, Negate(n), C1),
                              Power(Times(b, Plus(m, Times(n, p), C1)), CN1)),
                          Integrate(Times(Power(Times(c, x), Subtract(m, n)),
                              Power(Plus(a, Times(b, Power(x, n))), p)), x),
                          x)),
                  And(FreeQ(List(a, b, c, m, p), x), IGtQ(n, C0), SumSimplerQ(m, Negate(n)),
                      NeQ(Plus(m, Times(n, p),
                          C1), C0),
                      ILtQ(Simplify(Plus(Times(Plus(m, C1), Power(n, CN1)), p)), C0)))),
          IIntegrate(323,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_),
                      Power(Plus($p("a1"), Times($p("b1", true), Power(x_, n_))), p_), Power(Plus(
                          $p("a2"), Times($p("b2", true), Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(Times(Power(c, Subtract(Times(C2, n), C1)),
                      Power(Times(c, x), Plus(m, Times(CN1, C2, n), C1)),
                      Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), Plus(p, C1)),
                      Power(Plus($s("a2"), Times($s("b2"), Power(x, n))), Plus(p, C1)), Power(
                          Times($s("b1"), $s("b2"), Plus(m, Times(C2, n, p), C1)), CN1)),
                      x),
                      Dist(
                          Times($s("a1"), $s("a2"), Power(c, Times(C2, n)),
                              Plus(m, Times(CN1, C2, n), C1), Power(Times($s("b1"), $s("b2"),
                                  Plus(m, Times(C2, n, p), C1)), CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Subtract(m, Times(C2, n))),
                                  Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), p),
                                  Power(Plus($s("a2"), Times($s("b2"), Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, p), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0),
                      IGtQ(Times(C2, n), C0), GtQ(m, Subtract(Times(C2, n), C1)),
                      NeQ(Plus(m, Times(C2, n, p),
                          C1), C0),
                      IntBinomialQ(
                          Times($s("a1"), $s(
                              "a2")),
                          Times($s("b1"), $s("b2")), c, Times(C2, n), m, p, x)))),
          IIntegrate(324,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_),
                      Power(Plus($p("a1"), Times($p("b1", true), Power(x_, n_))), p_), Power(Plus(
                          $p("a2"), Times($p("b2", true), Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(c, Subtract(Times(C2, n), C1)),
                              Power(Times(c, x), Plus(m, Times(CN1, C2, n), C1)),
                              Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), Plus(p, C1)),
                              Power(Plus($s("a2"), Times($s("b2"), Power(x, n))), Plus(p, C1)),
                              Power(Times($s("b1"), $s("b2"), Plus(m, Times(C2, n, p), C1)), CN1)),
                          x),
                      Dist(
                          Times($s("a1"), $s("a2"), Power(c, Times(C2, n)),
                              Plus(m, Times(CN1, C2, n), C1),
                              Power(Times($s("b1"), $s("b2"), Plus(m, Times(C2, n, p), C1)), CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Subtract(m, Times(C2, n))),
                                  Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), p),
                                  Power(Plus($s("a2"), Times($s("b2"), Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, m, p), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"),
                          $s("b2"))), C0),
                      IGtQ(Times(C2, n), C0), SumSimplerQ(m, Times(CN2, n)),
                      NeQ(Plus(m, Times(C2, n, p),
                          C1), C0),
                      ILtQ(Simplify(Plus(Times(Plus(m, C1), Power(Times(C2, n), CN1)), p)), C0)))),
          IIntegrate(325,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Times(c, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, Power(x, n))),
                                  Plus(p, C1)),
                              Power(Times(a, c, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              b, Plus(m, Times(n,
                                  Plus(p, C1)), C1),
                              Power(Times(a, Power(c, n), Plus(m, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Plus(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c,
                      p), x), IGtQ(n,
                          C0),
                      LtQ(m, CN1), IntBinomialQ(a, b, c, n, m, p, x)))),
          IIntegrate(326,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Power(Times(c, x), Plus(m, C1)),
                          Power(Plus(a, Times(b, Power(x, n))),
                              Plus(p, C1)),
                          Power(Times(a, c, Plus(m, C1)), CN1)), x),
                      Dist(
                          Times(
                              b, Plus(m, Times(n, Plus(p, C1)),
                                  C1),
                              Power(Times(a, Power(c, n), Plus(m, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Plus(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, m,
                      p), x), IGtQ(n, C0), SumSimplerQ(m, n), ILtQ(
                          Simplify(Plus(Times(Plus(m, C1), Power(n, CN1)), p)), C0)))),
          IIntegrate(327,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_),
                      Power(Plus($p("a1"), Times($p("b1", true),
                          Power(x_, n_))), p_),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Power(Times(c, x), Plus(m, C1)),
                          Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), Plus(p, C1)),
                          Power(Plus($s("a2"), Times($s("b2"), Power(x, n))), Plus(p, C1)), Power(
                              Times($s("a1"), $s("a2"), c, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times($s("b1"), $s("b2"), Plus(m, Times(C2, n, Plus(p, C1)), C1),
                              Power(Times($s("a1"), $s("a2"), Power(c, Times(C2, n)), Plus(m, C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Plus(m, Times(C2, n))),
                                  Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), p),
                                  Power(Plus($s("a2"), Times($s("b2"), Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, p), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"),
                          $s("b2"))), C0),
                      IGtQ(Times(C2,
                          n), C0),
                      LtQ(m, CN1),
                      IntBinomialQ(
                          Times($s("a1"), $s("a2")), Times($s("b1"), $s(
                              "b2")),
                          c, Times(C2, n), m, p, x)))),
          IIntegrate(328,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_),
                      Power(Plus($p("a1"), Times($p("b1", true),
                          Power(x_, n_))), p_),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Power(Times(c, x), Plus(m, C1)),
                          Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), Plus(p, C1)),
                          Power(Plus($s("a2"), Times($s("b2"), Power(x, n))), Plus(p, C1)),
                          Power(Times($s("a1"), $s("a2"), c, Plus(m, C1)), CN1)), x),
                      Dist(
                          Times($s("b1"), $s("b2"), Plus(m, Times(C2, n, Plus(p, C1)), C1),
                              Power(Times($s("a1"), $s("a2"), Power(c, Times(C2, n)), Plus(m, C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Plus(m, Times(C2, n))),
                                  Power(Plus($s("a1"), Times($s("b1"), Power(x, n))), p),
                                  Power(Plus($s("a2"), Times($s("b2"), Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, m, p), x),
                      EqQ(Plus(Times($s("a2"), $s(
                          "b1")), Times($s("a1"),
                              $s("b2"))),
                          C0),
                      IGtQ(Times(C2, n), C0), SumSimplerQ(m, Times(C2,
                          n)),
                      ILtQ(Simplify(Plus(Times(Plus(m, C1), Power(Times(C2, n), CN1)), p)), C0)))),
          IIntegrate(329,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT, x_), m_), Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(With(List(Set(k, Denominator(m))),
                  Dist(Times(k, Power(c, CN1)),
                      Subst(Integrate(Times(Power(x, Subtract(Times(k, Plus(m, C1)), C1)),
                          Power(Plus(a, Times(b, Power(x, Times(k, n)), Power(Power(c, n), CN1))),
                              p)),
                          x), x, Power(Times(c, x), Power(k, CN1))),
                      x)),
                  And(FreeQ(List(a, b, c,
                      p), x), IGtQ(n,
                          C0),
                      FractionQ(m), IntBinomialQ(a, b, c, n, m, p, x)))),
          IIntegrate(330,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_),
                      Power(Plus($p("a1"), Times($p("b1", true), Power(x_, n_))), p_),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  With(List(Set(k, Denominator(m))),
                      Dist(Times(k,
                          Power(c, CN1)),
                          Subst(Integrate(Times(Power(x, Subtract(Times(k, Plus(m, C1)), C1)),
                              Power(Plus($s("a1"),
                                  Times($s("b1"), Power(x, Times(k, n)), Power(Power(c, n), CN1))),
                                  p),
                              Power(Plus($s("a2"),
                                  Times($s("b2"), Power(x, Times(k, n)), Power(Power(c, n), CN1))),
                                  p)),
                              x), x, Power(Times(c, x), Power(k, CN1))),
                          x)),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, p), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0),
                      IGtQ(Times(C2,
                          n), C0),
                      FractionQ(m),
                      IntBinomialQ(
                          Times($s("a1"), $s(
                              "a2")),
                          Times($s("b1"), $s("b2")), c, Times(C2, n), m, p, x)))),
          IIntegrate(331, Integrate(
              Times(Power(x_, m_DEFAULT), Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
              x_Symbol),
              Condition(
                  Dist(Power(a, Plus(p, Times(Plus(m, C1), Power(n, CN1)))),
                      Subst(
                          Integrate(
                              Times(Power(x, m),
                                  Power(Power(Subtract(C1, Times(b, Power(x, n))),
                                      Plus(p, Times(Plus(m, C1), Power(n, CN1)), C1)), CN1)),
                              x),
                          x,
                          Times(
                              x, Power(Power(Plus(a, Times(b, Power(x, n))), Power(n, CN1)), CN1))),
                      x),
                  And(FreeQ(List(a, b), x), IGtQ(n, C0), LtQ(CN1, p, C0), NeQ(p, Negate(C1D2)),
                      IntegersQ(m, Plus(p, Times(Plus(m, C1), Power(n, CN1))))))),
          IIntegrate(332,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus($p("a1"), Times($p("b1", true),
                          Power(x_, n_))), p_),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(
                          Times($s("a1"), $s("a2")), Plus(p,
                              Times(Plus(m, C1), Power(Times(C2, n), CN1)))),
                      Subst(Integrate(Times(Power(x, m),
                          Power(
                              Times(
                                  Power(Subtract(C1, Times($s("b1"), Power(x, n))),
                                      Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1)), C1)),
                                  Power(Subtract(C1, Times($s("b2"), Power(x, n))),
                                      Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1)), C1))),
                              CN1)),
                          x), x,
                          Times(x,
                              Power(Times(
                                  Power(Plus($s("a1"), Times($s("b1"), Power(x, n))),
                                      Power(Times(C2, n), CN1)),
                                  Power(Plus($s("a2"), Times($s("b2"), Power(x, n))),
                                      Power(Times(C2, n), CN1))),
                                  CN1))),
                      x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2")), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0),
                      IGtQ(Times(C2, n), C0), LtQ(CN1, p, C0), NeQ(p, Negate(
                          C1D2)),
                      IntegersQ(m, Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1))))))),
          IIntegrate(333,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(Dist(Times(
                  Power(Times(a, Power(Plus(a, Times(b, Power(x, n))), CN1)),
                      Plus(p, Times(Plus(m, C1), Power(n, CN1)))),
                  Power(Plus(a, Times(b, Power(x, n))),
                      Plus(p, Times(Plus(m, C1), Power(n, CN1))))),
                  Subst(
                      Integrate(
                          Times(Power(x, m),
                              Power(Power(Subtract(C1, Times(b, Power(x, n))),
                                  Plus(p, Times(Plus(m, C1), Power(n, CN1)), C1)),
                                  CN1)),
                          x),
                      x, Times(x, Power(Power(Plus(a, Times(b, Power(x, n))), Power(n, CN1)),
                          CN1))),
                  x),
                  And(FreeQ(List(a, b), x), IGtQ(n, C0), LtQ(CN1, p, C0), NeQ(p, Negate(C1D2)),
                      IntegerQ(m), LtQ(
                          Denominator(Plus(p,
                              Times(Plus(m, C1), Power(n, CN1)))),
                          Denominator(p))))),
          IIntegrate(334,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus($p("a1"), Times($p("b1", true), Power(x_, n_))), p_), Power(Plus(
                          $p("a2"), Times($p("b2", true), Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times($s("a1"), Power(Plus($s("a1"), Times($s("b1"), Power(x, n))),
                              CN1)), Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1)))),
                          Power(
                              Plus($s("a1"), Times($s("b1"),
                                  Power(x, n))),
                              Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1)))),
                          Power(
                              Times(
                                  $s("a2"), Power(Plus($s("a2"), Times($s("b2"), Power(x, n))),
                                      CN1)),
                              Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1)))),
                          Power(Plus($s("a2"), Times($s("b2"), Power(x, n))),
                              Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1))))),
                      Subst(
                          Integrate(
                              Times(Power(x, m),
                                  Power(
                                      Times(
                                          Power(Subtract(C1, Times($s("b1"), Power(x, n))),
                                              Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1)),
                                                  C1)),
                                          Power(Subtract(C1, Times($s("b2"), Power(x, n))),
                                              Plus(p, Times(Plus(m, C1), Power(Times(C2, n), CN1)),
                                                  C1))),
                                      CN1)),
                              x),
                          x,
                          Times(x,
                              Power(Times(
                                  Power(Plus($s("a1"), Times($s("b1"), Power(x, n))),
                                      Power(Times(C2, n), CN1)),
                                  Power(Plus($s("a2"), Times($s("b2"), Power(x, n))),
                                      Power(Times(C2, n), CN1))),
                                  CN1))),
                      x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2")), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"),
                          $s("b2"))), C0),
                      IGtQ(Times(C2, n), C0), LtQ(CN1, p, C0), NeQ(p, Negate(
                          C1D2)),
                      IntegerQ(m), LtQ(
                          Denominator(Plus(p,
                              Times(Plus(m, C1), Power(Times(C2, n), CN1)))),
                          Denominator(p))))),
          IIntegrate(335,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(a,
                                      Times(b, Power(Power(x, n), CN1))), p),
                                  Power(Power(x, Plus(m, C2)), CN1)),
                              x),
                          x, Power(x, CN1))),
                  And(FreeQ(List(a, b, p), x), ILtQ(n, C0), IntegerQ(m)))),
          IIntegrate(336,
              Integrate(Times(Power(x_, m_DEFAULT),
                  Power(Plus($p("a1"), Times($p("b1", true), Power(x_, n_))), p_),
                  Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_))), p_)), x_Symbol),
              Condition(Negate(Subst(Integrate(
                  Times(Power(Plus($s("a1"), Times($s("b1"), Power(Power(x, n), CN1))), p),
                      Power(Plus($s("a2"), Times($s("b2"), Power(Power(x, n), CN1))), p),
                      Power(Power(x, Plus(m, C2)), CN1)),
                  x), x, Power(x, CN1))), And(
                      FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), p), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")),
                          Times($s("a1"), $s("b2"))), C0),
                      ILtQ(Times(C2, n), C0), IntegerQ(m)))),
          IIntegrate(337,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(k,
                          Denominator(m))),
                      Negate(Dist(Times(k, Power(c, CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(Plus(a,
                                          Times(b,
                                              Power(Times(Power(c, n), Power(x, Times(k, n))),
                                                  CN1))),
                                          p),
                                      Power(Power(x, Plus(Times(k, Plus(m, C1)), C1)), CN1)),
                                  x),
                              x, Power(Power(Times(c, x), Power(k, CN1)), CN1)),
                          x))),
                  And(FreeQ(List(a, b, c, p), x), ILtQ(n, C0), FractionQ(m)))),
          IIntegrate(338,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_),
                      Power(Plus($p("a1"), Times($p("b1", true),
                          Power(x_, n_))), p_),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(k,
                          Denominator(m))),
                      Negate(
                          Dist(
                              Times(k, Power(c,
                                  CN1)),
                              Subst(
                                  Integrate(
                                      Times(
                                          Power(
                                              Plus($s("a1"),
                                                  Times($s("b1"),
                                                      Power(
                                                          Times(Power(c, n), Power(x, Times(k, n))),
                                                          CN1))),
                                              p),
                                          Power(Plus($s("a2"),
                                              Times($s("b2"),
                                                  Power(Times(Power(c, n), Power(x, Times(k, n))),
                                                      CN1))),
                                              p),
                                          Power(Power(x, Plus(Times(k, Plus(m, C1)), C1)), CN1)),
                                      x),
                                  x, Power(Power(Times(c, x), Power(k, CN1)), CN1)),
                              x))),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, p), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))),
                          C0),
                      ILtQ(Times(C2, n), C0), FractionQ(m)))),
          IIntegrate(339,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(
                              Power(Times(c, x), Plus(m, C1)), Power(Power(x, CN1), Plus(m, C1)),
                              Power(c, CN1)),
                          Subst(
                              Integrate(
                                  Times(Power(Plus(a, Times(b, Power(Power(x, n), CN1))), p),
                                      Power(Power(x, Plus(m, C2)), CN1)),
                                  x),
                              x, Power(x, CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, m, p), x), ILtQ(n, C0), Not(RationalQ(m))))),
          IIntegrate(340,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_),
                      Power(Plus($p("a1"), Times($p("b1", true),
                          Power(x_, n_))), p_),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Negate(Dist(
                      Times(Power(Times(c, x), Plus(m, C1)), Power(Power(x, CN1), Plus(m, C1)),
                          Power(c, CN1)),
                      Subst(Integrate(
                          Times(Power(Plus($s("a1"), Times($s("b1"), Power(Power(x, n), CN1))), p),
                              Power(Plus($s("a2"), Times($s("b2"), Power(Power(x, n), CN1))), p),
                              Power(Power(x, Plus(m, C2)), CN1)),
                          x), x, Power(x, CN1)),
                      x)),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, m, p), x),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0),
                      ILtQ(Times(C2, n), C0), Not(RationalQ(m))))));
}
