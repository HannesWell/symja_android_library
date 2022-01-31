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
class IntRules19 {
  public static IAST RULES =
      List(
          IIntegrate(381,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(x, Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                          Power(Plus(c, Times(d, Power(x, n))), Plus(q, C1)), Power(Times(a, c),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, n, p, q), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Times(n, Plus(p, q, C2)),
                          C1), C0),
                      EqQ(Plus(Times(a, d, Plus(p, C1)), Times(b, c, Plus(q, C1))), C0)))),
          IIntegrate(382,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(b, x, Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Plus(q, C1)),
                                  Power(
                                      Times(a, n, Plus(p, C1),
                                          Subtract(Times(b, c), Times(a, d))),
                                      CN1)),
                              x)),
                      Dist(Times(
                          Plus(Times(b, c),
                              Times(n, Plus(p, C1), Subtract(Times(b, c), Times(a, d)))),
                          Power(Times(a, n, Plus(p, C1), Subtract(Times(b, c), Times(a, d))), CN1)),
                          Integrate(Times(Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), q)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, n, q), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Times(n, Plus(p, q, C2)), C1), C0),
                      Or(LtQ(p, CN1), Not(LtQ(q, CN1))), NeQ(p, CN1)))),
          IIntegrate(383,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_)))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(c, x, Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                          Power(a, CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, n, p), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Times(a, d), Times(b, c, Plus(Times(n, Plus(p, C1)), C1))),
                          C0)))),
          IIntegrate(384,
              Integrate(
                  Times(
                      Power(Plus($p("a1"),
                          Times($p("b1", true), Power(x_, $p("non2", true)))), p_DEFAULT),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, $p("non2", true)))),
                          p_DEFAULT),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_)))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(c, x,
                          Power(Plus($s("a1"), Times($s("b1"), Power(x, Times(C1D2, n)))),
                              Plus(p, C1)),
                          Power(Plus($s("a2"), Times($s("b2"), Power(x, Times(C1D2, n)))),
                              Plus(p, C1)),
                          Power(Times($s("a1"), $s("a2")), CN1)),
                      x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, d, n, p), x),
                      EqQ($s("non2"), Times(C1D2, n)),
                      EqQ(Plus(Times($s("a2"), $s("b1")),
                          Times($s("a1"), $s("b2"))), C0),
                      EqQ(Subtract(Times($s("a1"), $s("a2"), d),
                          Times($s("b1"), $s("b2"), c, Plus(Times(n, Plus(p, C1)), C1))),
                          C0)))),
          IIntegrate(385,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(Times(Subtract(Times(b, c), Times(a, d)), x,
                              Power(Plus(a, Times(b, Power(x, n))),
                                  Plus(p, C1)),
                              Power(Times(a, b, n, Plus(p, C1)), CN1)), x)),
                      Dist(
                          Times(
                              Subtract(Times(a, d), Times(b, c, Plus(Times(n, Plus(p, C1)),
                                  C1))),
                              Power(Times(a, b, n, Plus(p, C1)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)), x), x)),
                  And(FreeQ(List(a, b, c, d, n, p), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      Or(LtQ(p, CN1), ILtQ(Plus(Power(n, CN1), p), C0))))),
          IIntegrate(386,
              Integrate(
                  Times(
                      Power(
                          Plus($p("a1"), Times($p("b1", true),
                              Power(x_, $p("non2", true)))),
                          p_DEFAULT),
                      Power(
                          Plus($p("a2"),
                              Times($p("b2", true), Power(x_, $p("non2", true)))),
                          p_DEFAULT),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(Times(
                              Subtract(Times($s("b1"), $s("b2"), c), Times($s("a1"), $s("a2"), d)),
                              x,
                              Power(
                                  Plus($s("a1"), Times($s("b1"), Power(x, Times(C1D2, n)))), Plus(p,
                                      C1)),
                              Power(Plus($s("a2"), Times($s("b2"), Power(x, Times(C1D2, n)))),
                                  Plus(p, C1)),
                              Power(Times($s("a1"), $s("a2"), $s("b1"), $s("b2"), n, Plus(p, C1)),
                                  CN1)),
                              x)),
                      Dist(
                          Times(
                              Subtract(
                                  Times($s("a1"), $s(
                                      "a2"), d),
                                  Times($s("b1"), $s("b2"), c, Plus(Times(n, Plus(p, C1)), C1))),
                              Power(Times($s("a1"), $s("a2"), $s("b1"), $s("b2"), n, Plus(p, C1)),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Plus($s("a1"), Times($s("b1"), Power(x, Times(C1D2, n)))),
                                      Plus(p, C1)),
                                  Power(Plus($s("a2"), Times($s("b2"), Power(x, Times(C1D2, n)))),
                                      Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, d, n), x),
                      EqQ($s("non2"), Times(C1D2, n)),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0),
                      Or(LtQ(p, CN1), ILtQ(Plus(Power(n, CN1), p), C0))))),
          IIntegrate(387,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), CN1),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(c, x,
                          Power(a, CN1)), x),
                      Dist(
                          Times(Subtract(Times(b, c), Times(a,
                              d)), Power(a, CN1)),
                          Integrate(Power(Plus(b, Times(a, Power(Power(x, n), CN1))), CN1), x), x)),
                  And(FreeQ(List(a, b, c, d, n), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), LtQ(n,
                          C0)))),
          IIntegrate(388,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(d, x, Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                          Power(Times(b, Plus(Times(n, Plus(p, C1)), C1)), CN1)), x),
                      Dist(
                          Times(
                              Subtract(Times(a, d), Times(b, c,
                                  Plus(Times(n, Plus(p, C1)), C1))),
                              Power(Times(b, Plus(Times(n, Plus(p, C1)), C1)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Power(x, n))), p), x), x)),
                  And(FreeQ(List(a, b, c, d, n), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      NeQ(Plus(Times(n, Plus(p, C1)), C1), C0)))),
          IIntegrate(389,
              Integrate(
                  Times(
                      Power(
                          Plus($p("a1"), Times($p("b1", true), Power(x_, $p("non2", true)))),
                          p_DEFAULT),
                      Power(Plus(
                          $p("a2"), Times($p("b2", true), Power(x_, $p("non2", true)))), p_DEFAULT),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(d, x,
                              Power(Plus($s("a1"), Times($s("b1"), Power(x, Times(C1D2, n)))),
                                  Plus(p, C1)),
                              Power(
                                  Plus($s("a2"), Times($s("b2"), Power(x, Times(C1D2, n)))), Plus(p,
                                      C1)),
                              Power(Times($s("b1"), $s("b2"), Plus(Times(n, Plus(p, C1)), C1)),
                                  CN1)),
                          x),
                      Dist(
                          Times(
                              Subtract(
                                  Times($s("a1"), $s(
                                      "a2"), d),
                                  Times($s("b1"), $s("b2"), c, Plus(Times(n, Plus(p, C1)), C1))),
                              Power(Times($s("b1"), $s("b2"), Plus(Times(n, Plus(p, C1)), C1)),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Plus($s("a1"), Times($s("b1"), Power(x, Times(C1D2, n)))),
                                      p),
                                  Power(Plus($s("a2"), Times($s("b2"), Power(x, Times(C1D2, n)))),
                                      p)),
                              x),
                          x)),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, d, n, p), x),
                      EqQ($s("non2"), Times(C1D2, n)),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0),
                      NeQ(Plus(Times(n, Plus(p, C1)), C1), C0)))),
          IIntegrate(390,
              Integrate(Times(
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                  Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)), x_Symbol),
              Condition(
                  Integrate(PolynomialDivide(Power(Plus(a, Times(b, Power(x, n))), p),
                      Power(Plus(c, Times(d, Power(x, n))), Negate(q)), x), x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), IGtQ(p, C0), ILtQ(q, C0), GeQ(p, Negate(q))))),
          IIntegrate(391,
              Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), CN1),
                  Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), CN1)), x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Power(x, n))), CN1), x), x),
                      Dist(Times(d, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Power(Plus(c, Times(d, Power(x, n))), CN1), x), x)),
                  And(FreeQ(List(a, b, c, d, n), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(392,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Sqr(x_))), CN1D3),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(b, Power(a, CN1)), C2))),
                      Plus(
                          Simp(
                              Times(
                                  q, ArcTanh(Times(CSqrt3,
                                      Power(Times(q, x), CN1))),
                                  Power(
                                      Times(C2, Power(C2, QQ(2L,
                                          3L)), CSqrt3, Power(a,
                                              C1D3),
                                          d),
                                      CN1)),
                              x),
                          Negate(Simp(
                              Times(q,
                                  ArcTan(Times(
                                      Power(a, C1D3), q, x,
                                      Power(Plus(Power(a, C1D3),
                                          Times(Power(C2, C1D3),
                                              Power(Plus(a, Times(b, Sqr(x))), C1D3))),
                                          CN1))),
                                  Power(Times(C2, Power(C2, QQ(2L, 3L)), Power(a, C1D3), d), CN1)),
                              x)),
                          Simp(
                              Times(
                                  q, ArcTan(Times(q, x)),
                                  Power(Times(C6, Power(C2, QQ(2L, 3L)), Power(a, C1D3), d), CN1)),
                              x),
                          Simp(Times(q, ArcTanh(Times(CSqrt3,
                              Subtract(Power(a, C1D3),
                                  Times(Power(C2, C1D3), Power(Plus(a, Times(b, Sqr(x))), C1D3))),
                              Power(Times(Power(a, C1D3), q, x), CN1))),
                              Power(
                                  Times(C2, Power(C2, QQ(2L, 3L)), CSqrt3, Power(a, C1D3), d),
                                  CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Plus(Times(b, c), Times(C3, a, d)),
                          C0),
                      PosQ(Times(b, Power(a, CN1)))))),
          IIntegrate(393,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Sqr(x_))), CN1D3),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Times(CN1, b, Power(a, CN1)), C2))),
                      Plus(
                          Simp(
                              Times(
                                  q, ArcTan(Times(CSqrt3, Power(Times(q, x),
                                      CN1))),
                                  Power(Times(C2, Power(C2, QQ(2L, 3L)), CSqrt3, Power(a, C1D3), d),
                                      CN1)),
                              x),
                          Simp(
                              Times(q,
                                  ArcTanh(Times(Power(a, C1D3), q, x,
                                      Power(Plus(Power(a, C1D3),
                                          Times(Power(C2, C1D3),
                                              Power(Plus(a, Times(b, Sqr(x))), C1D3))),
                                          CN1))),
                                  Power(Times(C2, Power(C2, QQ(2L, 3L)), Power(a, C1D3), d), CN1)),
                              x),
                          Negate(
                              Simp(Times(q, ArcTanh(Times(q, x)),
                                  Power(Times(C6, Power(C2, QQ(2L, 3L)), Power(a, C1D3), d), CN1)),
                                  x)),
                          Simp(Times(q, ArcTan(Times(CSqrt3,
                              Subtract(Power(a, C1D3),
                                  Times(Power(C2, C1D3), Power(Plus(a, Times(b, Sqr(x))), C1D3))),
                              Power(Times(Power(a, C1D3), q, x), CN1))),
                              Power(Times(C2, Power(C2, QQ(2L, 3L)), CSqrt3, Power(a, C1D3), d),
                                  CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Plus(Times(b, c), Times(C3, a, d)),
                          C0),
                      NegQ(Times(b, Power(a, CN1)))))),
          IIntegrate(394,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1D3),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(b, Power(a, CN1)), C2))),
                      Plus(
                          Simp(
                              Times(
                                  q, ArcTan(Times(C1D3, q,
                                      x)),
                                  Power(Times(ZZ(12L), Rt(a, C3), d), CN1)),
                              x),
                          Simp(
                              Times(q,
                                  ArcTan(
                                      Times(
                                          Sqr(Subtract(Rt(a, C3),
                                              Power(Plus(a, Times(b, Sqr(x))), C1D3))),
                                          Power(Times(C3, Sqr(Rt(a, C3)), q, x), CN1))),
                                  Power(Times(ZZ(12L), Rt(a, C3), d), CN1)),
                              x),
                          Negate(Simp(Times(q,
                              ArcTanh(Times(CSqrt3,
                                  Subtract(Rt(a, C3), Power(Plus(a, Times(b, Sqr(x))), C1D3)),
                                  Power(Times(Rt(a, C3), q, x), CN1))),
                              Power(Times(C4, CSqrt3, Rt(a, C3), d), CN1)), x)))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Times(b, c), Times(C9, a, d)),
                          C0),
                      PosQ(Times(b, Power(a, CN1)))))),
          IIntegrate(395,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT, Sqr(x_))), CN1D3),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Times(CN1, b, Power(a, CN1)), C2))),
                      Plus(
                          Negate(
                              Simp(
                                  Times(
                                      q, ArcTanh(Times(C1D3, q,
                                          x)),
                                      Power(Times(ZZ(12L), Rt(a, C3), d), CN1)),
                                  x)),
                          Simp(
                              Times(q,
                                  ArcTanh(
                                      Times(
                                          Sqr(Subtract(Rt(a, C3),
                                              Power(Plus(a, Times(b, Sqr(x))), C1D3))),
                                          Power(Times(C3, Sqr(Rt(a, C3)), q, x), CN1))),
                                  Power(Times(ZZ(12L), Rt(a, C3), d), CN1)),
                              x),
                          Negate(
                              Simp(Times(q,
                                  ArcTan(Times(CSqrt3,
                                      Subtract(Rt(a, C3), Power(Plus(a, Times(b, Sqr(x))), C1D3)),
                                      Power(Times(Rt(a, C3), q, x), CN1))),
                                  Power(Times(C4, CSqrt3, Rt(a, C3), d), CN1)), x)))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Times(b, c), Times(C9, a, d)),
                          C0),
                      NegQ(Times(b, Power(a, CN1)))))),
          IIntegrate(396,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT,
                          Sqr(x_))), QQ(2L,
                              3L)),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(b, Power(d, CN1)),
                          Integrate(Power(Plus(a, Times(b, Sqr(x))), CN1D3), x), x),
                      Dist(Times(Subtract(Times(b, c), Times(a, d)), Power(d, CN1)),
                          Integrate(Power(Times(Power(Plus(a, Times(b, Sqr(x))), C1D3),
                              Plus(c, Times(d, Sqr(x)))), CN1), x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Plus(Times(b, c), Times(C3, a, d)),
                          C0)))),
          IIntegrate(397,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1D4),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(Sqr(b), Power(a, CN1)), C4))),
                      Subtract(
                          Negate(
                              Simp(
                                  Times(b,
                                      ArcTan(
                                          Times(
                                              Plus(
                                                  b, Times(Sqr(q),
                                                      Sqrt(Plus(a, Times(b, Sqr(x)))))),
                                              Power(
                                                  Times(
                                                      Power(q, C3), x, Power(Plus(a,
                                                          Times(b, Sqr(x))), C1D4)),
                                                  CN1))),
                                      Power(Times(C2, a, d, q), CN1)),
                                  x)),
                          Simp(Times(b, ArcTanh(Times(
                              Subtract(b, Times(Sqr(q), Sqrt(Plus(a, Times(b, Sqr(x)))))),
                              Power(Times(Power(q, C3), x, Power(Plus(a, Times(b, Sqr(x))), C1D4)),
                                  CN1))),
                              Power(Times(C2, a, d, q), CN1)), x))),
                  And(FreeQ(List(a, b, c,
                      d), x), EqQ(Subtract(Times(b, c), Times(C2, a, d)),
                          C0),
                      PosQ(Times(Sqr(b), Power(a, CN1)))))),
          IIntegrate(398,
              Integrate(Times(
                  Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1D4),
                  Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)), x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Times(CN1, Sqr(b), Power(a, CN1)), C4))),
                      Plus(
                          Simp(
                              Times(b,
                                  ArcTan(Times(q, x,
                                      Power(Times(CSqrt2, Power(Plus(a, Times(b, Sqr(x))), C1D4)),
                                          CN1))),
                                  Power(Times(C2, CSqrt2, a, d, q), CN1)),
                              x),
                          Simp(
                              Times(b,
                                  ArcTanh(Times(q, x,
                                      Power(Times(CSqrt2, Power(Plus(a, Times(b, Sqr(x))), C1D4)),
                                          CN1))),
                                  Power(Times(C2, CSqrt2, a, d, q), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c,
                      d), x), EqQ(Subtract(Times(b, c), Times(C2, a, d)),
                          C0),
                      NegQ(Times(Sqr(b), Power(a, CN1)))))),
          IIntegrate(399,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT, Sqr(x_))), CN1D4), Power(
                          Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(C2, Sqrt(Times(CN1, b, Sqr(x),
                          Power(a, CN1))), Power(x,
                              CN1)),
                      Subst(
                          Integrate(
                              Times(Sqr(x),
                                  Power(
                                      Times(Sqrt(Subtract(C1, Times(Power(x, C4), Power(a, CN1)))),
                                          Plus(Times(b, c), Times(CN1, a, d),
                                              Times(d, Power(x, C4)))),
                                      CN1)),
                              x),
                          x, Power(Plus(a, Times(b, Sqr(x))), C1D4)),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(400,
              Integrate(
                  Times(
                      Power(Plus(a_, Times(b_DEFAULT,
                          Sqr(x_))), QQ(-3L,
                              4L)),
                      Power(Plus(c_, Times(d_DEFAULT, Sqr(x_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(c, CN1),
                          Integrate(Power(Plus(a, Times(b, Sqr(x))), QQ(-3L, 4L)), x), x),
                      Dist(Times(d, Power(c, CN1)),
                          Integrate(Times(Sqr(x),
                              Power(Times(Power(Plus(a, Times(b, Sqr(x))), QQ(3L, 4L)),
                                  Plus(c, Times(d, Sqr(x)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x),
                      EqQ(Subtract(Times(b, c), Times(C2, a, d)), C0)))));
}
