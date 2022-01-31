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
class IntRules23 {
  public static IAST RULES =
      List(
          IIntegrate(461,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Times(e, x), m), Power(Plus(a, Times(b, Power(x, n))), p),
                              Power(Plus(c, Times(d, Power(x, n))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), IGtQ(p, C0), Or(IntegerQ(m), IGtQ(Times(C2, Plus(m, C1)), C0),
                          Not(RationalQ(m)))))),
          IIntegrate(462,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Sqr(Plus(c_, Times(d_DEFAULT, Power(x_, n_))))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Sqr(c), Power(Times(e, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, Power(x, n))),
                                  Plus(p, C1)),
                              Power(Times(a, e, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(a, Power(e, n),
                              Plus(m, C1)), CN1),
                          Integrate(
                              Times(Power(Times(e, x), Plus(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n))), p),
                                  Simp(
                                      Subtract(
                                          Plus(Times(b, Sqr(c), n, Plus(p, C1)),
                                              Times(c, Subtract(Times(b, c), Times(C2, a, d)),
                                                  Plus(m, C1))),
                                          Times(a, Plus(m, C1), Sqr(d), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), LtQ(m, CN1), GtQ(n, C0)))),
          IIntegrate(463,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Sqr(Plus(c_, Times(d_DEFAULT, Power(x_, n_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(Subtract(Times(b, c), Times(a, d))),
                                  Power(Times(e, x), Plus(m, C1)),
                                  Power(Plus(a, Times(b,
                                      Power(x, n))), Plus(p,
                                          C1)),
                                  Power(Times(a, Sqr(b), e, n, Plus(p, C1)), CN1)),
                              x)),
                      Dist(
                          Power(Times(a, Sqr(b), n, Plus(p, C1)), CN1), Integrate(
                              Times(Power(Times(e, x), m),
                                  Power(Plus(a, Times(b, Power(x, n))), Plus(p,
                                      C1)),
                                  Simp(Plus(
                                      Times(Sqr(Subtract(Times(b, c), Times(a, d))), Plus(m, C1)),
                                      Times(Sqr(b), Sqr(c), n, Plus(p, C1)),
                                      Times(a, b, Sqr(d), n, Plus(p, C1), Power(x, n))), x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                      C0), IGtQ(n, C0), LtQ(p, CN1)))),
          IIntegrate(464,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Sqr(Plus(c_, Times(d_DEFAULT, Power(x_, n_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Sqr(d), Power(Times(e, x), Plus(m, n, C1)),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p,
                                  C1)),
                              Power(
                                  Times(b, Power(e, Plus(n,
                                      C1)), Plus(m, Times(n, Plus(p, C2)), C1)),
                                  CN1)),
                          x),
                      Dist(Power(Times(b, Plus(m, Times(n, Plus(p, C2)), C1)), CN1),
                          Integrate(
                              Times(Power(Times(e, x), m), Power(Plus(a, Times(b, Power(x, n))), p),
                                  Simp(
                                      Plus(Times(b, Sqr(c), Plus(m, Times(n, Plus(p, C2)), C1)),
                                          Times(d,
                                              Plus(
                                                  Times(Subtract(Times(C2, b, c), Times(a, d)),
                                                      Plus(m, n, C1)),
                                                  Times(C2, b, c, n, Plus(p, C1))),
                                              Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), IGtQ(n,
                          C0),
                      NeQ(Plus(m, Times(n, Plus(p, C2)), C1), C0)))),
          IIntegrate(465,
              Integrate(
                  Times(
                      Power(x_, m_DEFAULT), Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  With(List(Set(k, GCD(Plus(m, C1), n))),
                      Condition(Dist(Power(k, CN1),
                          Subst(Integrate(
                              Times(Power(x, Subtract(Times(Plus(m, C1), Power(k, CN1)), C1)),
                                  Power(Plus(a, Times(b, Power(x, Times(n, Power(k, CN1))))), p),
                                  Power(Plus(c, Times(d, Power(x, Times(n, Power(k, CN1))))), q)),
                              x), x, Power(x, k)),
                          x), Unequal(k, C1))),
                  And(FreeQ(List(a, b, c, d, p, q), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), IntegerQ(m)))),
          IIntegrate(466,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(With(List(Set(k, Denominator(m))),
                  Dist(Times(k, Power(e, CN1)),
                      Subst(Integrate(Times(Power(x, Subtract(Times(k, Plus(m, C1)), C1)),
                          Power(Plus(a, Times(b, Power(x, Times(k, n)), Power(Power(e, n), CN1))),
                              p),
                          Power(Plus(c, Times(d, Power(x, Times(k, n)), Power(Power(e, n), CN1))),
                              q)),
                          x), x, Power(Times(e, x), Power(k, CN1))),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, p, q), x),
                      NeQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      IGtQ(n, C0), FractionQ(m), IntegerQ(p)))),
          IIntegrate(467,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(e, Subtract(n, C1)),
                              Power(Times(e, x), Plus(m, Negate(n), C1)),
                              Power(Plus(a, Times(b,
                                  Power(x, n))), Plus(p,
                                      C1)),
                              Power(Plus(c, Times(d, Power(x, n))),
                                  q),
                              Power(Times(b, n, Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(Power(e, n), Power(Times(b, n, Plus(p, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(e, x), Subtract(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q,
                                      C1)),
                                  Simp(
                                      Plus(Times(c, Plus(m, Negate(n), C1)),
                                          Times(d, Plus(m, Times(n, Subtract(q, C1)), C1),
                                              Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), GtQ(q, C0), GtQ(Plus(m, Negate(n), C1),
                          C0),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(468,
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
                                  Power(Plus(c, Times(d, Power(x,
                                      n))), Subtract(q, C1)),
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
                  And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), GtQ(q, C1), IntBinomialQ(a, b, c, d, e, m, n, p, q,
                          x)))),
          IIntegrate(469,
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
                                  Power(Plus(a, Times(b,
                                      Power(x, n))), Plus(p,
                                          C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), q),
                                  Power(Times(a, e, n, Plus(p, C1)), CN1)),
                              x)),
                      Dist(
                          Power(Times(a, n,
                              Plus(p, C1)), CN1),
                          Integrate(
                              Times(Power(Times(e, x), m),
                                  Power(Plus(a, Times(b, Power(x,
                                      n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                                  Simp(Plus(Times(c, Plus(m, Times(n, Plus(p, C1)), C1)),
                                      Times(d, Plus(m, Times(n, Plus(p, q, C1)), C1), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), LtQ(C0, q, C1),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(470,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(a, Power(e, Subtract(Times(C2, n), C1)),
                                  Power(Times(e, x), Plus(m, Times(CN1, C2, n), C1)),
                                  Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), Plus(q,
                                      C1)),
                                  Power(
                                      Times(b, n, Subtract(Times(b, c), Times(a, d)),
                                          Plus(p, C1)),
                                      CN1)),
                              x)),
                      Dist(
                          Times(
                              Power(e, Times(C2,
                                  n)),
                              Power(Times(b, n, Subtract(Times(b, c), Times(a, d)), Plus(p, C1)),
                                  CN1)),
                          Integrate(Times(Power(Times(e, x), Subtract(m, Times(C2, n))),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), q),
                              Simp(Plus(Times(a, c, Plus(m, Times(CN1, C2, n), C1)),
                                  Times(Plus(Times(a, d, Plus(m, Negate(n), Times(n, q), C1)),
                                      Times(b, c, n, Plus(p, C1))), Power(x, n))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, q), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), GtQ(Plus(m, Negate(n),
                          C1), n),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(471,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(e, Subtract(n, C1)),
                              Power(Times(e, x), Plus(m, Negate(n), C1)),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d,
                                  Power(x, n))), Plus(q,
                                      C1)),
                              Power(
                                  Times(n, Subtract(Times(b, c), Times(a, d)), Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(Power(e, n),
                              Power(Times(n, Subtract(Times(b, c), Times(a, d)), Plus(p, C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(e, x), Subtract(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                                  Power(Plus(c, Times(d, Power(x, n))), q),
                                  Simp(Plus(Times(c, Plus(m, Negate(n), C1)),
                                      Times(d, Plus(m, Times(n, Plus(p, q, C1)), C1), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, q), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), GeQ(n, Plus(m, Negate(n), C1)),
                      GtQ(Plus(m, Negate(n), C1), C0),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(472,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(Times(b, Power(Times(e, x), Plus(m, C1)),
                          Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                          Power(Plus(c, Times(d, Power(x, n))), Plus(q, C1)),
                          Power(Times(a, e, n, Subtract(Times(b, c), Times(a, d)), Plus(p, C1)),
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
                  And(FreeQ(List(a, b, c, d, e, m, q), x),
                      NeQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(473,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(Subtract(Simp(
                  Times(Power(Times(e, x), Plus(m, C1)), Power(Plus(a, Times(b, Power(x, n))), p),
                      Power(Plus(c, Times(d, Power(x, n))), q), Power(Times(e, Plus(m, C1)), CN1)),
                  x),
                  Dist(Times(n, Power(Times(Power(e, n), Plus(m, C1)), CN1)),
                      Integrate(Times(Power(Times(e, x), Plus(m, n)),
                          Power(Plus(a, Times(b, Power(x, n))), Subtract(p, C1)),
                          Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                          Simp(Plus(Times(b, c, p), Times(a, d, q),
                              Times(b, d, Plus(p, q), Power(x, n))), x)),
                          x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), GtQ(q, C0), LtQ(m, CN1), GtQ(p, C0),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(474,
              Integrate(Times(Power(Times(e_DEFAULT, x_), m_),
                  Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                  Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)), x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(c, Power(Times(e, x), Plus(m, C1)), Power(Plus(a, Times(b, Power(x,
                              n))), Plus(p, C1)), Power(Plus(c, Times(d, Power(x, n))),
                                  Subtract(q, C1)),
                              Power(Times(a, e, Plus(m, C1)), CN1)),
                          x),
                      Dist(Power(Times(a, Power(e, n), Plus(m, C1)), CN1),
                          Integrate(
                              Times(Power(Times(e, x), Plus(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C2)),
                                  Simp(Plus(
                                      Times(c, Subtract(Times(c, b), Times(a, d)), Plus(m, C1)),
                                      Times(
                                          c, n,
                                          Plus(Times(b, c, Plus(p, C1)),
                                              Times(a, d, Subtract(q, C1)))),
                                      Times(d,
                                          Plus(Times(Subtract(Times(c, b), Times(a, d)),
                                              Plus(m, C1)), Times(c, b, n, Plus(p, q))),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), IGtQ(n, C0), GtQ(q, C1), LtQ(m, CN1), IntBinomialQ(a, b, c,
                          d, e, m, n, p, q, x)))),
          IIntegrate(475,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(Times(Power(Times(e, x), Plus(m, C1)),
                      Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                      Power(Plus(c, Times(d, Power(x, n))),
                          q),
                      Power(Times(a, e, Plus(m, C1)), CN1)), x), Dist(
                          Power(Times(a, Power(e, n), Plus(m, C1)), CN1),
                          Integrate(
                              Times(Power(Times(e, x), Plus(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                                  Simp(
                                      Plus(Times(c, b, Plus(m, C1)),
                                          Times(n, Plus(Times(b, c, Plus(p, C1)), Times(a, d, q))),
                                          Times(d,
                                              Plus(Times(b, Plus(m, C1)),
                                                  Times(b, n, Plus(p, q, C1))),
                                              Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), LtQ(C0, q, C1), LtQ(m, CN1), IntBinomialQ(a, b, c, d, e, m, n, p,
                          q, x)))),
          IIntegrate(476,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(Plus(
                  Simp(
                      Times(Power(Times(e, x), Plus(m, C1)), Power(Plus(a,
                          Times(b, Power(x, n))), p), Power(Plus(c, Times(d, Power(x, n))), q),
                          Power(Times(e, Plus(m, Times(n, Plus(p, q)), C1)), CN1)),
                      x),
                  Dist(
                      Times(n, Power(Plus(m, Times(n, Plus(p, q)), C1),
                          CN1)),
                      Integrate(Times(Power(Times(e, x), m),
                          Power(Plus(a, Times(b, Power(x, n))), Subtract(p, C1)),
                          Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)),
                          Simp(Plus(Times(a, c, Plus(p, q)),
                              Times(Plus(Times(q, Subtract(Times(b, c), Times(a, d))),
                                  Times(a, d, Plus(p, q))), Power(x, n))),
                              x)),
                          x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), GtQ(q, C0), GtQ(p, C0),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(477,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(Plus(c_,
                          Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(d, Power(Times(e, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), Subtract(q, C1)), Power(Times(b,
                                  e, Plus(m, Times(n, Plus(p, q)), C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(b,
                              Plus(m, Times(n, Plus(p, q)), C1)), CN1),
                          Integrate(
                              Times(Power(Times(e, x), m), Power(Plus(a, Times(b,
                                  Power(x, n))), p), Power(Plus(c,
                                      Times(d, Power(x, n))), Subtract(q, C2)),
                                  Simp(
                                      Plus(
                                          Times(c,
                                              Plus(
                                                  Times(
                                                      Subtract(Times(c, b), Times(a, d)),
                                                      Plus(m, C1)),
                                                  Times(c, b, n, Plus(p, q)))),
                                          Times(Plus(
                                              Times(d, Subtract(Times(c, b), Times(a, d)),
                                                  Plus(m, C1)),
                                              Times(d, n, Subtract(q, C1),
                                                  Subtract(Times(b, c), Times(a, d))),
                                              Times(c, b, d, n, Plus(p, q))), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, p), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), IGtQ(n, C0), GtQ(q, C1),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(478,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(e, Subtract(n, C1)),
                              Power(Times(e, x), Plus(m, Negate(n), C1)),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d, Power(x, n))), q), Power(
                                  Times(b, Plus(m, Times(n, Plus(p, q)), C1)), CN1)),
                          x),
                      Dist(
                          Times(Power(e, n), Power(Times(b, Plus(m, Times(n, Plus(p, q)), C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Times(e, x), Subtract(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), Subtract(q,
                                      C1)),
                                  Simp(Plus(Times(a, c, Plus(m, Negate(n), C1)),
                                      Times(
                                          Subtract(Times(a, d, Plus(m, Negate(n), C1)),
                                              Times(n, q, Subtract(Times(b, c), Times(a, d)))),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      IGtQ(n, C0), GtQ(q, C0), GtQ(Plus(m, Negate(n),
                          C1), C0),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(479,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_), Power(
                          Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(e, Subtract(Times(C2, n), C1)),
                              Power(Times(e, x), Plus(m, Times(CN1, C2, n), C1)),
                              Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                              Power(Plus(c, Times(d,
                                  Power(x, n))), Plus(q,
                                      C1)),
                              Power(Times(b, d, Plus(m, Times(n, Plus(p, q)), C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Power(e, Times(C2, n)), Power(
                                  Times(b, d, Plus(m, Times(n, Plus(p, q)), C1)), CN1)),
                          Integrate(
                              Times(Power(Times(e, x), Subtract(m, Times(C2, n))),
                                  Power(Plus(a, Times(b, Power(x, n))), p),
                                  Power(Plus(c, Times(d, Power(x, n))), q),
                                  Simp(Plus(Times(a, c, Plus(m, Times(CN1, C2, n), C1)),
                                      Times(
                                          Plus(Times(a, d, Plus(m, Times(n, Subtract(q, C1)), C1)),
                                              Times(b, c, Plus(m, Times(n, Subtract(p, C1)), C1))),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p, q), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), IGtQ(n, C0), GtQ(Plus(m,
                          Negate(n), C1),
                          n),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))),
          IIntegrate(480,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(Times(Power(Times(e, x), Plus(m, C1)),
                      Power(Plus(a, Times(b, Power(x, n))), Plus(p, C1)),
                      Power(Plus(c, Times(d, Power(x, n))), Plus(q, C1)),
                      Power(Times(a, c, e, Plus(m, C1)), CN1)), x),
                      Dist(Power(Times(a, c, Power(e, n), Plus(m, C1)), CN1),
                          Integrate(Times(Power(Times(e, x), Plus(m, n)),
                              Power(Plus(a, Times(b, Power(x, n))), p),
                              Power(Plus(c, Times(d, Power(x, n))), q),
                              Simp(Plus(Times(Plus(Times(b, c), Times(a, d)), Plus(m, n, C1)),
                                  Times(n, Plus(Times(b, c, p), Times(a, d, q))),
                                  Times(b, d, Plus(m, Times(n, Plus(p, q, C2)), C1), Power(x, n))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p, q), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), IGtQ(n, C0), LtQ(m, CN1),
                      IntBinomialQ(a, b, c, d, e, m, n, p, q, x)))));
}
