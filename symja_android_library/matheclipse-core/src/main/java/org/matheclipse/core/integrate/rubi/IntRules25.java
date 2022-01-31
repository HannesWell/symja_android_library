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
class IntRules25 {
  public static IAST RULES =
      List(
          IIntegrate(501,
              Integrate(
                  Times(Power(Times(e_, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(e, IntPart(m)), Power(Times(e, x),
                              FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(
                              Power(x, m), Power(Plus(a,
                                  Times(b, Power(x, n))), p),
                              Power(Plus(c, Times(d, Power(x, n))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p, q), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), IntegerQ(Simplify(
                          Times(n, Power(Plus(m, C1), CN1)))),
                      Not(IntegerQ(n))))),
          IIntegrate(502,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Subtract(Times(c, b), Times(a, d)),
                                  Power(Times(e, x), Plus(m, C1)),
                                  Power(Plus(a, Times(b, Power(x,
                                      n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d,
                                      Power(x, n))), Subtract(q,
                                          C1)),
                                  Power(Times(a, b, e, n, Plus(p, C1)), CN1)),
                              x)),
                      Dist(Power(Times(a, b, n, Plus(p, C1)), CN1),
                          Integrate(
                              Times(Power(Times(e, x), m),
                                  Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C2)),
                                  Simp(Plus(
                                      Times(c,
                                          Plus(Times(c, b, n, Plus(p, C1)),
                                              Times(Subtract(Times(c, b), Times(a, d)),
                                                  Plus(m, C1)))),
                                      Times(d,
                                          Plus(Times(c, b, n, Plus(p, C1)),
                                              Times(Subtract(Times(c, b), Times(a, d)),
                                                  Plus(m, Times(n, Subtract(q, C1)), C1))),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), LtQ(p, CN1), GtQ(q,
                          C1),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(503,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Times(e, x), Plus(m, C1)),
                                  Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c,
                                      Times(d, Power(x, n))), q),
                                  Power(Times(a, e, n, Plus(p, C1)), CN1)),
                              x)),
                      Dist(Power(Times(a, n, Plus(p, C1)), CN1),
                          Integrate(Times(Power(Times(e, x), m),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                              Simp(
                                  Plus(Times(c, Plus(m, Times(n, Plus(p, C1)), C1)),
                                      Times(d, Plus(m, Times(n, Plus(p, q, C1)), C1), Power(x, n))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n), x),
                      NeQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      LtQ(p, CN1), LtQ(C0, q, C1), IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(504,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(b, Power(Times(e, x), Plus(m, C1)),
                                  Power(Plus(a, Times(b, Power(x,
                                      n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Plus(q,
                                      C1)),
                                  Power(
                                      Times(a, e, n, Subtract(Times(b, c), Times(a, d)), Plus(p,
                                          C1)),
                                      CN1)),
                              x)),
                      Dist(Power(Times(a, n, Subtract(Times(b, c), Times(a, d)), Plus(p, C1)), CN1),
                          Integrate(Times(Power(Times(e, x), m),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), q),
                              Simp(Plus(Times(c, b, Plus(m, C1)),
                                  Times(n, Subtract(Times(b, c), Times(a, d)), Plus(p, C1)),
                                  Times(d, b, Plus(m, Times(n, Plus(p, q, C2)), C1), Power(x, n))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n, q), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), LtQ(p, CN1), IntBinomialQ(a, b,
                          c, d, e, m, n, p, q, x)))),
          IIntegrate(505,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(e, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, Power(x, n))), p),
                              Power(Plus(c, Times(d, Power(x, n))), q), Power(
                                  Times(e, Plus(m, Times(n, Plus(p, q)), C1)), CN1)),
                          x),
                      Dist(
                          Times(n, Power(Plus(m, Times(n, Plus(p, q)), C1),
                              CN1)),
                          Integrate(
                              Times(Power(Times(e, x), m),
                                  Power(Plus(a, Times(b, Power(x,
                                      n))), Subtract(p, C1)),
                                  Power(Plus(c, Times(d,
                                      Power(x, n))), Subtract(q,
                                          C1)),
                                  Simp(
                                      Plus(Times(a, c, Plus(p, q)),
                                          Times(
                                              Plus(
                                                  Times(q, Subtract(Times(b, c),
                                                      Times(a, d))),
                                                  Times(a, d, Plus(p, q))),
                                              Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n), x),
                      NeQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      GtQ(q, C0), GtQ(p, C0), IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(506,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(d, Power(Times(e, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)), Power(
                                  Times(b, e, Plus(m, Times(n, Plus(p, q)), C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(b,
                              Plus(m, Times(n, Plus(p, q)), C1)), CN1),
                          Integrate(
                              Times(Power(Times(e, x), m), Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C2)),
                                  Simp(
                                      Plus(
                                          Times(c,
                                              Plus(
                                                  Times(
                                                      Subtract(Times(c, b), Times(a, d)),
                                                      Plus(m, C1)),
                                                  Times(c, b, n, Plus(p, q)))),
                                          Times(
                                              Plus(
                                                  Times(d, Subtract(Times(c, b), Times(a, d)),
                                                      Plus(m, C1)),
                                                  Times(d, n, Subtract(q, C1),
                                                      Subtract(Times(b, c), Times(a, d))),
                                                  Times(c, b, d, n, Plus(p, q))),
                                              Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), GtQ(q, C1),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(507,
              Integrate(
                  Times(
                      Power(x_, m_), Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), CN1), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Dist(Times(a, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Times(Power(x, Subtract(m, n)),
                              Power(Plus(a, Times(b, Power(x, n))), CN1)), x),
                          x)),
                      Dist(Times(c, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(
                              Times(Power(x, Subtract(m, n)),
                                  Power(Plus(c, Times(d, Power(x, n))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, m, n), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), Or(EqQ(m, n),
                          EqQ(m, Subtract(Times(C2, n), C1)))))),
          IIntegrate(508,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT,
                          Power(x_, n_))), CN1),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(
                              Times(Power(Times(e, x), m),
                                  Power(Plus(a, Times(b, Power(x, n))), CN1)),
                              x),
                          x),
                      Dist(Times(d, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(
                              Times(Power(Times(e, x), m),
                                  Power(Plus(c, Times(d, Power(x, n))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, n, m), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0)))),
          IIntegrate(509,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(
                      Times(Power(Times(e, x), m), Power(Plus(a, Times(b, Power(x, n))), p),
                          Power(Plus(c, Times(d, Power(x, n))), q)),
                      x), x),
                  And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(p, CN2), Or(IGtQ(q, CN2),
                          And(EqQ(q, CN3), IntegerQ(Times(C1D2, Subtract(m, C1)))))))),
          IIntegrate(510,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(
                          Power(a, p), Power(c, q), Power(Times(e, x), Plus(m,
                              C1)),
                          AppellF1(Times(Plus(m, C1), Power(n, CN1)), Negate(p), Negate(q),
                              Plus(C1, Times(Plus(m, C1), Power(n, CN1))),
                              Times(CN1, b, Power(x, n), Power(a, CN1)), Times(CN1, d, Power(x, n),
                                  Power(c, CN1))),
                          Power(Times(e, Plus(m, C1)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p, q), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      NeQ(m, CN1), NeQ(m, Subtract(n, C1)), Or(IntegerQ(p),
                          GtQ(a, C0)),
                      Or(IntegerQ(q), GtQ(c, C0))))),
          IIntegrate(511,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(Dist(
                  Times(Power(a, IntPart(p)), Power(Plus(a, Times(b, Power(x, n))), FracPart(p)),
                      Power(Power(Plus(C1, Times(b, Power(x, n), Power(a, CN1))), FracPart(p)),
                          CN1)),
                  Integrate(
                      Times(Power(Times(e, x), m),
                          Power(Plus(C1,
                              Times(b, Power(x, n), Power(a, CN1))), p),
                          Power(Plus(c, Times(d, Power(x, n))), q)),
                      x),
                  x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p, q), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), NeQ(m, CN1), NeQ(m,
                          Subtract(n, C1)),
                      Not(Or(IntegerQ(p), GtQ(a, C0)))))),
          IIntegrate(512,
              Integrate(
                  Times(Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(v_, n_))), p_DEFAULT),
                      Power(Plus(c_DEFAULT, Times(d_DEFAULT, Power(v_, n_))), q_DEFAULT), Power(x_,
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(Power(Coefficient(v, x, C1), Plus(m, C1)), CN1),
                      Subst(Integrate(
                          SimplifyIntegrand(Times(Power(Subtract(x, Coefficient(v, x, C0)), m),
                              Power(Plus(a, Times(b, Power(x, n))), p), Power(
                                  Plus(c, Times(d, Power(x, n))), q)),
                              x),
                          x), x, v),
                      x),
                  And(FreeQ(List(a, b, c, d, n, p, q), x), LinearQ(v, x), IntegerQ(m), NeQ(v, x)))),
          IIntegrate(513,
              Integrate(
                  Times(Power(u_, m_DEFAULT),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT,
                          Power(v_, n_))), p_DEFAULT),
                      Power(Plus(c_DEFAULT, Times(d_DEFAULT, Power(v_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(u, m), Power(Times(Coefficient(v, x, C1), Power(v, m)),
                          CN1)),
                      Subst(
                          Integrate(
                              Times(Power(x, m), Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), q)),
                              x),
                          x, v),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n, p, q), x), LinearPairQ(u, v, x)))),
          IIntegrate(514,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, $p("mn", true)))), q_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(x, Subtract(m, Times(n, q))),
                          Power(Plus(a,
                              Times(b, Power(x, n))), p),
                          Power(Plus(d, Times(c, Power(x, n))), q)),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n,
                      p), x), EqQ($s("mn"),
                          Negate(n)),
                      IntegerQ(q), Or(PosQ(n), Not(IntegerQ(p)))))),
          IIntegrate(515,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, $p("mn", true)))), q_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(x, Times(n, FracPart(q))),
                      Power(Plus(c, Times(d, Power(Power(x, n), CN1))), FracPart(q)), Power(
                          Power(Plus(d, Times(c, Power(x, n))), FracPart(q)), CN1)),
                      Integrate(
                          Times(Power(x, Subtract(m, Times(n, q))),
                              Power(Plus(a, Times(b, Power(x, n))),
                                  p),
                              Power(Plus(d, Times(c, Power(x, n))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, n, p,
                      q), x), EqQ($s("mn"),
                          Negate(n)),
                      Not(IntegerQ(q)), Not(IntegerQ(p))))),
          IIntegrate(516,
              Integrate(
                  Times(Power(Times(e_, x_), m_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, $p("mn", true)))), q_DEFAULT),
                      Power(Plus(a_DEFAULT, Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(e, IntPart(m)), Power(Times(e, x),
                              FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(
                              Power(x, m), Power(Plus(a, Times(b, Power(x, n))), p), Power(
                                  Plus(c, Times(d, Power(Power(x, n), CN1))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p, q), x), EqQ($s("mn"), Negate(n))))),
          IIntegrate(517,
              Integrate(
                  Times(u_DEFAULT,
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_DEFAULT))), q_DEFAULT),
                      Power(Plus($p("a1"), Times($p("b1", true), Power(x_, $p("non2", true)))),
                          p_DEFAULT),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, $p("non2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(u,
                          Power(
                              Plus(Times($s("a1"), $s("a2")),
                                  Times($s("b1"), $s("b2"), Power(x, n))),
                              p),
                          Power(Plus(c, Times(d, Power(x, n))), q)),
                      x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, d, n, p, q), x),
                      EqQ($s("non2"), Times(C1D2, n)),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0), Or(
                          IntegerQ(p), And(GtQ($s("a1"), C0), GtQ($s("a2"), C0)))))),
          IIntegrate(518,
              Integrate(
                  Times(u_DEFAULT,
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(e_DEFAULT, Power(x_, $p("n2", true)))), q_DEFAULT),
                      Power(Plus($p("a1"), Times($p("b1", true), Power(x_, $p("non2", true)))),
                          p_DEFAULT),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, $p("non2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(u,
                          Power(Plus(Times($s("a1"), $s("a2")),
                              Times($s("b1"), $s("b2"), Power(x, n))), p),
                          Power(Plus(c, Times(d, Power(x, n)), Times(e, Power(x, Times(C2, n)))),
                              q)),
                      x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, d, e, n, p, q), x),
                      EqQ($s("non2"), Times(C1D2, n)), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0), Or(
                          IntegerQ(p), And(GtQ($s("a1"), C0), GtQ($s("a2"), C0)))))),
          IIntegrate(519,
              Integrate(
                  Times(u_DEFAULT,
                      Power(Plus(c_,
                          Times(d_DEFAULT, Power(x_, n_DEFAULT))), q_DEFAULT),
                      Power(Plus($p("a1"), Times($p("b1", true), Power(x_, $p("non2", true)))), p_),
                      Power(Plus($p("a2"), Times($p("b2", true), Power(x_, $p("non2", true)))),
                          p_)),
                  x_Symbol),
              Condition(Dist(
                  Times(
                      Power(Plus($s("a1"), Times($s("b1"), Power(x, Times(C1D2, n)))), FracPart(p)),
                      Power(Plus($s("a2"), Times($s("b2"), Power(x, Times(C1D2, n)))), FracPart(p)),
                      Power(Power(
                          Plus(Times($s("a1"), $s("a2")), Times($s("b1"), $s("b2"), Power(x, n))),
                          FracPart(p)), CN1)),
                  Integrate(Times(u,
                      Power(Plus(Times($s("a1"), $s("a2")), Times($s("b1"), $s("b2"), Power(x, n))),
                          p),
                      Power(Plus(c, Times(d, Power(x, n))), q)), x),
                  x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, d, n, p, q), x),
                      EqQ($s("non2"), Times(C1D2, n)),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))),
                          C0),
                      Not(And(EqQ(n, C2), IGtQ(q, C0)))))),
          IIntegrate(520,
              Integrate(
                  Times(u_DEFAULT,
                      Power(
                          Plus(
                              c_, Times(d_DEFAULT, Power(x_, n_DEFAULT)), Times(e_DEFAULT,
                                  Power(x_, $p("n2", true)))),
                          q_DEFAULT),
                      Power(
                          Plus($p("a1"), Times($p("b1", true),
                              Power(x_, $p("non2", true)))),
                          p_DEFAULT),
                      Power(
                          Plus($p("a2"), Times($p("b2", true),
                              Power(x_, $p("non2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus($s("a1"), Times($s("b1"),
                                  Power(x, Times(C1D2, n)))),
                              FracPart(p)),
                          Power(Plus($s("a2"), Times($s("b2"), Power(x, Times(C1D2, n)))),
                              FracPart(p)),
                          Power(
                              Power(Plus(Times($s("a1"), $s("a2")),
                                  Times($s("b1"), $s("b2"), Power(x, n))), FracPart(p)),
                              CN1)),
                      Integrate(Times(u,
                          Power(Plus(Times($s("a1"), $s("a2")),
                              Times($s("b1"), $s("b2"), Power(x, n))), p),
                          Power(Plus(c, Times(d, Power(x, n)), Times(e, Power(x, Times(C2, n)))),
                              q)),
                          x),
                      x),
                  And(FreeQ(List($s("a1"), $s("b1"), $s("a2"), $s("b2"), c, d, e, n, p, q), x),
                      EqQ($s("non2"), Times(C1D2, n)), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Plus(Times($s("a2"), $s("b1")), Times($s("a1"), $s("b2"))), C0)))));
}
