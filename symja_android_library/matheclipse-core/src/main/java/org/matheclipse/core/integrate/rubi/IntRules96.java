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
class IntRules96 {
  public static IAST RULES =
      List(
          IIntegrate(1921,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(a_DEFAULT, Power(x_, q_DEFAULT)), Times(c_DEFAULT,
                              Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(x, Plus(m,
                                  C1)),
                              Power(
                                  Plus(
                                      Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                          Power(x, Subtract(Times(C2, n), q)))),
                                  p),
                              Power(Plus(m, Times(p, Subtract(Times(C2, n), q)), C1), CN1)),
                          x),
                      Dist(
                          Times(Subtract(n, q), p,
                              Power(Plus(m, Times(p, Subtract(Times(C2, n), q)), C1), CN1)),
                          Integrate(
                              Times(Power(x, Plus(m, q)),
                                  Plus(Times(C2, a), Times(b, Power(x, Subtract(n, q)))),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                          Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                      Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), GtQ(p, C0),
                      RationalQ(m, q), GtQ(Plus(m, Times(p, q), C1), Negate(Subtract(n, q))),
                      NeQ(Plus(m, Times(p, Subtract(Times(C2, n), q)), C1), C0)))),
          IIntegrate(1922,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT)), Times(c_DEFAULT,
                                  Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(x, Plus(m, Negate(q), C1)),
                                  Plus(Sqr(
                                      b), Times(CN1, C2, a, c),
                                      Times(b, c, Power(x, Subtract(n, q)))),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                          Power(x, Subtract(Times(C2, n), q)))),
                                      Plus(p, C1)),
                                  Power(Times(a, Subtract(n, q), Plus(p, C1),
                                      Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                              x)),
                      Dist(
                          Times(
                              Subtract(Times(C2, a, c), Times(Sqr(b),
                                  Plus(p, C2))),
                              Power(Times(a, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          Integrate(
                              Times(Power(x, Subtract(m, q)),
                                  Power(Plus(Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                      Power(x, Subtract(Times(C2, n), q)))), Plus(p,
                                          C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), LtQ(p, CN1),
                      RationalQ(m, p, q), EqQ(
                          Plus(m, Times(p, q), C1), Times(CN1, Subtract(n, q),
                              Plus(Times(C2, p), C3)))))),
          IIntegrate(1923,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT)), Times(c_DEFAULT,
                                  Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(x, Plus(m, Times(CN1, C2, n), q, C1)),
                                  Plus(Times(C2, a), Times(b, Power(x, Subtract(n, q)))),
                                  Power(Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                      Times(c, Power(x, Subtract(Times(C2, n), q)))), Plus(p, C1)),
                                  Power(Times(Subtract(n, q), Plus(p, C1),
                                      Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                              x)),
                      Dist(
                          Power(
                              Times(Subtract(n, q), Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))),
                              CN1),
                          Integrate(
                              Times(Power(x, Plus(m, Times(CN1, C2, n), q)),
                                  Plus(
                                      Times(C2, a,
                                          Plus(m, Times(p, q), Times(CN1, C2, Subtract(n, q)), C1)),
                                      Times(b,
                                          Plus(m, Times(p, q),
                                              Times(Subtract(n, q), Plus(Times(C2, p), C1)), C1),
                                          Power(x, Subtract(n, q)))),
                                  Power(Plus(Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                      Power(x, Subtract(Times(C2, n), q)))), Plus(p,
                                          C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(
                          IntegerQ(p)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), LtQ(p,
                          CN1),
                      RationalQ(m, q), GtQ(Plus(m, Times(p, q), C1), Times(C2, Subtract(n, q)))))),
          IIntegrate(1924,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT)), Times(c_DEFAULT,
                                  Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(Times(Power(x, Plus(m, Negate(q), C1)),
                          Plus(Sqr(b), Times(CN1, C2, a, c), Times(b, c, Power(x, Subtract(n, q)))),
                          Power(
                              Plus(Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                  Power(x, Subtract(Times(C2, n), q)))),
                              Plus(p, C1)),
                          Power(Times(a, Subtract(n, q), Plus(p, C1),
                              Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          x)),
                      Dist(
                          Power(
                              Times(
                                  a, Subtract(n, q), Plus(p, C1), Subtract(Sqr(b),
                                      Times(C4, a, c))),
                              CN1),
                          Integrate(
                              Times(Power(x, Subtract(m, q)),
                                  Plus(
                                      Times(Sqr(b),
                                          Plus(m, Times(p, q), Times(Subtract(n, q), Plus(p, C1)),
                                              C1)),
                                      Times(CN1, C2, a, c,
                                          Plus(m, Times(p, q),
                                              Times(C2, Subtract(n, q), Plus(p, C1)), C1)),
                                      Times(b, c,
                                          Plus(m, Times(p, q),
                                              Times(Subtract(n, q), Plus(Times(C2, p), C3)), C1),
                                          Power(x, Subtract(n, q)))),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                          Power(x, Subtract(Times(C2, n), q)))),
                                      Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), RationalQ(m, q), LtQ(Plus(m, Times(p,
                          q), C1), Subtract(n,
                              q))))),
          IIntegrate(1925,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(x, Plus(m, Negate(n), C1)),
                              Plus(b, Times(C2, c,
                                  Power(x, Subtract(n, q)))),
                              Power(
                                  Plus(
                                      Times(a, Power(x, q)), Times(b, Power(x,
                                          n)),
                                      Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                  Plus(p, C1)),
                              Power(
                                  Times(
                                      Subtract(n, q), Plus(p, C1), Subtract(Sqr(b),
                                          Times(C4, a, c))),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(Subtract(n, q), Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))),
                              CN1),
                          Integrate(Times(Power(x, Subtract(m, n)),
                              Plus(Times(b, Plus(m, Times(p, q), Negate(n), q, C1)),
                                  Times(C2, c,
                                      Plus(m, Times(p, q), Times(C2, Subtract(n, q), Plus(p, C1)),
                                          C1),
                                      Power(x, Subtract(n, q)))),
                              Power(
                                  Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                      Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                  Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), RationalQ(m, q), LtQ(Subtract(n, q),
                          Plus(m, Times(p, q), C1), Times(C2, Subtract(n, q)))))),
          IIntegrate(1926,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_,
                                  q_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Power(x, Plus(m, Times(CN1, C2, n), q,
                                  C1)),
                              Power(
                                  Plus(
                                      Times(a, Power(x, q)), Times(b, Power(x,
                                          n)),
                                      Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                  Plus(p, C1)),
                              Power(Times(C2, c, Subtract(n, q), Plus(p, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, Power(Times(C2, c),
                              CN1)),
                          Integrate(
                              Times(Power(x, Plus(m, Negate(n), q)),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                          Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                      p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), GeQ(p, CN1),
                      LtQ(p, C0), RationalQ(m, q), EqQ(Plus(m, Times(p, q), C1),
                          Times(C2, Subtract(n, q)))))),
          IIntegrate(1927,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT)), Times(c_DEFAULT,
                                  Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(
                                  Power(x, Plus(m, Negate(q),
                                      C1)),
                                  Power(Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                      Times(c, Power(x, Subtract(Times(C2, n), q)))), Plus(p, C1)),
                                  Power(Times(C2, a, Subtract(n, q), Plus(p, C1)), CN1)),
                              x)),
                      Dist(
                          Times(b, Power(Times(C2, a),
                              CN1)),
                          Integrate(
                              Times(Power(x, Subtract(Plus(m, n), q)),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                          Power(x, Subtract(Times(C2, n), q)))),
                                      p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), GeQ(p, CN1),
                      LtQ(p, C0), RationalQ(m, q), EqQ(Plus(m, Times(p, q), C1),
                          Times(CN2, Subtract(n, q), Plus(p, C1)))))),
          IIntegrate(1928,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_,
                                  q_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(x, Plus(m, Times(CN1, C2, n), q, C1)),
                              Power(Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                  Times(c, Power(x, Subtract(Times(C2, n), q)))), Plus(p, C1)),
                              Power(
                                  Times(c, Plus(m, Times(p, q), Times(C2, Subtract(n, q), p), C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(c, Plus(m, Times(p, q), Times(C2, Subtract(n, q), p), C1)),
                              CN1),
                          Integrate(Times(Power(x, Subtract(m, Times(C2, Subtract(n, q)))),
                              Plus(
                                  Times(a,
                                      Plus(m, Times(p, q), Times(CN1, C2, Subtract(n, q)), C1)),
                                  Times(b,
                                      Plus(m, Times(p, q), Times(Subtract(n, q), Subtract(p, C1)),
                                          C1),
                                      Power(x, Subtract(n, q)))),
                              Power(
                                  Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                      Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                  p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), GeQ(p, CN1),
                      LtQ(p, C0), RationalQ(m, q), GtQ(Plus(m, Times(p, q), C1), Times(C2, Subtract(
                          n, q)))))),
          IIntegrate(1929,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(a_DEFAULT, Power(x_, q_DEFAULT)),
                          Times(c_DEFAULT, Power(x_, r_DEFAULT))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(x, Plus(m, Negate(q), C1)),
                              Power(
                                  Plus(
                                      Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                          Power(x, Subtract(Times(C2, n), q)))),
                                  Plus(p, C1)),
                              Power(Times(a, Plus(m, Times(p, q), C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(a,
                              Plus(m, Times(p, q), C1)), CN1),
                          Integrate(Times(Power(x, Subtract(Plus(m, n), q)),
                              Plus(
                                  Times(b,
                                      Plus(m, Times(p, q), Times(Subtract(n, q), Plus(p, C1)), C1)),
                                  Times(c,
                                      Plus(m, Times(p, q), Times(C2, Subtract(n, q), Plus(p, C1)),
                                          C1),
                                      Power(x, Subtract(n, q)))),
                              Power(Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                  Times(c, Power(x, Subtract(Times(C2, n), q)))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), EqQ(r, Subtract(Times(C2, n), q)),
                      PosQ(Subtract(n, q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), GeQ(p, CN1), LtQ(p, C0), RationalQ(m, q),
                      LtQ(Plus(m, Times(p, q), C1), C0)))),
          IIntegrate(1930,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT)),
                              Times(c_DEFAULT, Power(x_, r_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(
                                  Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                      Power(x, Subtract(Times(C2, n), q)))),
                              p),
                          Power(
                              Times(Power(x, Times(p, q)),
                                  Power(
                                      Plus(a, Times(b, Power(x, Subtract(n, q))),
                                          Times(c, Power(x, Times(C2, Subtract(n, q))))),
                                      p)),
                              CN1)),
                      Integrate(Times(Power(x, Plus(m, Times(p, q))),
                          Power(Plus(a, Times(b, Power(x, Subtract(n, q))),
                              Times(c, Power(x, Times(C2, Subtract(n, q))))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, m, n, p, q), x), EqQ(r, Subtract(Times(C2,
                      n), q)), Not(IntegerQ(
                          p)),
                      PosQ(Subtract(n, q))))),
          IIntegrate(1931,
              Integrate(
                  Times(Power(u_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(u_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(u_, q_DEFAULT)), Times(c_DEFAULT,
                                  Power(u_, r_DEFAULT))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(Coefficient(u, x, C1), CN1),
                      Subst(
                          Integrate(
                              Times(Power(x, m),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                          Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                      p)),
                              x),
                          x, u),
                      x),
                  And(FreeQ(List(a, b, c, m, n, p, q), x), EqQ(r, Subtract(Times(C2, n),
                      q)), LinearQ(u,
                          x),
                      NeQ(u, x)))),
          IIntegrate(1932,
              Integrate(
                  Times(
                      Power(Plus(Times(c_DEFAULT, Power(x_, j_DEFAULT)),
                          Times(b_DEFAULT, Power(x_, n_DEFAULT)), Times(a_DEFAULT,
                              Power(x_, q_DEFAULT))),
                          p_DEFAULT),
                      Plus(A_, Times(B_DEFAULT, Power(x_, r_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(x, Times(p, q)),
                          Plus(ASymbol, Times(BSymbol,
                              Power(x, Subtract(n, q)))),
                          Power(Plus(a, Times(b, Power(x, Subtract(n, q))),
                              Times(c, Power(x, Times(C2, Subtract(n, q))))), p)),
                      x),
                  And(FreeQ(List(a, b, c, ASymbol, BSymbol, n, q), x), EqQ(r, Subtract(n,
                      q)), EqQ(j, Subtract(Times(C2, n), q)), IntegerQ(
                          p),
                      PosQ(Subtract(n, q))))),
          IIntegrate(1933,
              Integrate(
                  Times(
                      Plus(A_, Times(B_DEFAULT,
                          Power(x_, j_DEFAULT))),
                      Power(Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(a_DEFAULT, Power(x_, q_DEFAULT)), Times(c_DEFAULT,
                              Power(x_, r_DEFAULT))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(x, Times(C1D2,
                              q)),
                          Sqrt(
                              Plus(a, Times(b, Power(x, Subtract(n, q))),
                                  Times(c, Power(x, Times(C2, Subtract(n, q)))))),
                          Power(
                              Plus(
                                  Times(a, Power(x, q)), Times(b, Power(x,
                                      n)),
                                  Times(c, Power(x, Subtract(Times(C2, n), q)))),
                              CN1D2)),
                      Integrate(Times(Plus(ASymbol, Times(BSymbol, Power(x, Subtract(n, q)))),
                          Power(Times(Power(x, Times(C1D2, q)),
                              Sqrt(Plus(a, Times(b, Power(x, Subtract(n, q))),
                                  Times(c, Power(x, Times(C2, Subtract(n, q))))))),
                              CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, ASymbol, BSymbol, n, q), x), EqQ(j, Subtract(n, q)),
                      EqQ(r, Subtract(Times(C2, n), q)), PosQ(Subtract(n, q)), EqQ(n, C3),
                      EqQ(q, C2)))),
          IIntegrate(1934,
              Integrate(
                  Times(
                      Power(Plus(Times(c_DEFAULT, Power(x_, j_DEFAULT)),
                          Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                          Times(a_DEFAULT, Power(x_, q_DEFAULT))), p_),
                      Plus(A_, Times(B_DEFAULT, Power(x_, r_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(x,
                              Plus(
                                  Times(b, BSymbol, Subtract(n,
                                      q), p),
                                  Times(ASymbol, c,
                                      Plus(
                                          Times(p, q), Times(Subtract(n, q),
                                              Plus(Times(C2, p), C1)),
                                          C1)),
                                  Times(BSymbol, c, Plus(Times(p, Subtract(Times(C2, n), q)), C1),
                                      Power(x, Subtract(n, q)))),
                              Power(Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                  Times(c, Power(x, Subtract(Times(C2, n), q)))), p),
                              Power(
                                  Times(c, Plus(Times(p, Subtract(Times(C2, n), q)), C1),
                                      Plus(Times(p, q),
                                          Times(Subtract(n, q), Plus(Times(C2, p), C1)), C1)),
                                  CN1)),
                          x),
                      Dist(
                          Times(Subtract(n, q), p,
                              Power(
                                  Times(
                                      c, Plus(Times(p,
                                          Subtract(Times(C2, n), q)), C1),
                                      Plus(
                                          Times(p, q), Times(Subtract(n, q),
                                              Plus(Times(C2, p), C1)),
                                          C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(x, q),
                                  Plus(
                                      Times(C2, a, ASymbol, c,
                                          Plus(
                                              Times(p, q), Times(Subtract(n, q), Plus(Times(C2, p),
                                                  C1)),
                                              C1)),
                                      Times(CN1, a, b, BSymbol, Plus(Times(p, q), C1)),
                                      Times(
                                          Subtract(
                                              Plus(
                                                  Times(C2, a, BSymbol, c,
                                                      Plus(Times(p, Subtract(Times(C2, n), q)),
                                                          C1)),
                                                  Times(ASymbol, b, c,
                                                      Plus(Times(p, q),
                                                          Times(Subtract(n, q),
                                                              Plus(Times(C2, p), C1)),
                                                          C1))),
                                              Times(Sqr(b), BSymbol,
                                                  Plus(Times(p, q), Times(Subtract(n, q), p), C1))),
                                          Power(x, Subtract(n, q)))),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                          Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                      Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, ASymbol, BSymbol, n, q), x), EqQ(r, Subtract(n, q)),
                      EqQ(j, Subtract(Times(C2, n), q)), Not(IntegerQ(p)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), GtQ(p, C0),
                      NeQ(Plus(Times(p, Subtract(Times(C2, n), q)),
                          C1), C0),
                      NeQ(Plus(Times(p, q), Times(Subtract(n, q), Plus(Times(C2, p), C1)), C1),
                          C0)))),
          IIntegrate(1935,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times(c_DEFAULT, Power(x_,
                                  j_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT))),
                          p_),
                      Plus(A_, Times(B_DEFAULT, Power(x_, r_DEFAULT)))),
                  x_Symbol),
              Condition(With(List(Set(n, Plus(q, r))), Condition(
                  Plus(
                      Simp(Times(x,
                          Plus(
                              Times(ASymbol,
                                  Plus(Times(p, q), Times(Subtract(n, q), Plus(Times(C2, p), C1)),
                                      C1)),
                              Times(BSymbol, Plus(Times(p, Subtract(Times(C2, n), q)), C1),
                                  Power(x, Subtract(n, q)))),
                          Power(
                              Plus(
                                  Times(a, Power(x,
                                      q)),
                                  Times(c, Power(x, Subtract(Times(C2, n), q)))),
                              p),
                          Power(
                              Times(Plus(Times(p, Subtract(Times(C2, n), q)), C1),
                                  Plus(Times(p, q), Times(Subtract(n, q), Plus(Times(C2, p), C1)),
                                      C1)),
                              CN1)),
                          x),
                      Dist(Times(Subtract(n, q), p,
                          Power(
                              Times(Plus(Times(p, Subtract(Times(C2, n), q)), C1),
                                  Plus(Times(p, q), Times(Subtract(n, q), Plus(Times(C2, p), C1)),
                                      C1)),
                              CN1)),
                          Integrate(Times(Power(x, q), Plus(
                              Times(C2, a, ASymbol,
                                  Plus(Times(p, q), Times(Subtract(n, q), Plus(Times(C2, p), C1)),
                                      C1)),
                              Times(C2, a, BSymbol, Plus(Times(p, Subtract(Times(C2, n), q)), C1),
                                  Power(x, Subtract(n, q)))),
                              Power(
                                  Plus(Times(a, Power(x, q)),
                                      Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                  Subtract(p, C1))),
                              x),
                          x)),
                  And(EqQ(j, Subtract(Times(C2, n), q)),
                      NeQ(Plus(Times(p, Subtract(Times(C2, n), q)), C1), C0),
                      NeQ(Plus(Times(p, q), Times(Subtract(n, q), Plus(Times(C2, p), C1)), C1),
                          C0)))),
                  And(FreeQ(List(a, c, ASymbol, BSymbol, q), x), Not(IntegerQ(p)), GtQ(p, C0)))),
          IIntegrate(1936,
              Integrate(
                  Times(
                      Power(
                          Plus(Times(c_DEFAULT, Power(x_, j_DEFAULT)),
                              Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT))),
                          p_),
                      Plus(A_, Times(B_DEFAULT, Power(x_, r_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(x, Plus(Negate(q),
                                      C1)),
                                  Plus(Times(ASymbol, Sqr(b)), Times(CN1, a, b, BSymbol),
                                      Times(CN1, C2, a, ASymbol, c),
                                      Times(
                                          Subtract(Times(ASymbol, b), Times(C2, a,
                                              BSymbol)),
                                          c, Power(x, Subtract(n, q)))),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)), Times(c,
                                          Power(x, Subtract(Times(C2, n), q)))),
                                      Plus(p, C1)),
                                  Power(
                                      Times(a, Subtract(n, q), Plus(p, C1),
                                          Subtract(Sqr(b), Times(C4, a, c))),
                                      CN1)),
                              x)),
                      Dist(
                          Power(
                              Times(
                                  a, Subtract(n, q), Plus(p, C1), Subtract(Sqr(b),
                                      Times(C4, a, c))),
                              CN1),
                          Integrate(
                              Times(
                                  Plus(
                                      Times(ASymbol, Sqr(b),
                                          Plus(Times(p, q), Times(Subtract(n, q), Plus(p, C1)),
                                              C1)),
                                      Times(CN1, a, b, BSymbol, Plus(Times(p, q), C1)),
                                      Times(CN1, C2, a, ASymbol, c,
                                          Plus(Times(p, q), Times(C2, Subtract(n, q), Plus(p, C1)),
                                              C1)),
                                      Times(
                                          Plus(Times(p, q),
                                              Times(Subtract(n, q), Plus(Times(C2, p), C3)), C1),
                                          Subtract(Times(ASymbol, b), Times(C2, a, BSymbol)), c,
                                          Power(x, Subtract(n, q)))),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                          Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                      Plus(p, C1)),
                                  Power(Power(x, q), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, ASymbol, BSymbol, n, q), x), EqQ(r, Subtract(n, q)),
                      EqQ(j, Subtract(Times(C2,
                          n), q)),
                      Not(IntegerQ(p)), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), LtQ(p, CN1)))),
          IIntegrate(1937,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times(c_DEFAULT, Power(x_, j_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, q_DEFAULT))),
                          p_),
                      Plus(A_, Times(B_DEFAULT, Power(x_, r_DEFAULT)))),
                  x_Symbol),
              Condition(With(List(Set(n, Plus(q, r))), Condition(
                  Plus(
                      Negate(
                          Simp(Times(
                              Power(x, Plus(Negate(q),
                                  C1)),
                              Plus(
                                  Times(a, ASymbol, c), Times(a, BSymbol, c,
                                      Power(x, Subtract(n, q)))),
                              Power(
                                  Plus(Times(a, Power(x, q)), Times(c,
                                      Power(x, Subtract(Times(C2, n), q)))),
                                  Plus(p, C1)),
                              Power(Times(a, Subtract(n, q), Plus(p, C1), C2, a, c), CN1)),
                              x)),
                      Dist(Power(Times(a, Subtract(n, q), Plus(p, C1), C2, a, c), CN1),
                          Integrate(
                              Times(
                                  Plus(
                                      Times(a, ASymbol, c,
                                          Plus(Times(p, q), Times(C2, Subtract(n, q), Plus(p, C1)),
                                              C1)),
                                      Times(a, BSymbol, c,
                                          Plus(Times(p, q),
                                              Times(Subtract(n, q), Plus(Times(C2, p), C3)), C1),
                                          Power(x, Subtract(n, q)))),
                                  Power(
                                      Plus(Times(a, Power(x, q)),
                                          Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                      Plus(p, C1)),
                                  Power(Power(x, q), CN1)),
                              x),
                          x)),
                  EqQ(j, Subtract(Times(C2, n), q)))),
                  And(FreeQ(List(a, c, ASymbol, BSymbol, q), x), Not(IntegerQ(p)), LtQ(p, CN1)))),
          IIntegrate(1938, Integrate(Times(Plus(A_, Times(B_DEFAULT, Power(x_, j_DEFAULT))),
              Power(Plus(Times(b_DEFAULT, Power(x_, n_DEFAULT)),
                  Times(a_DEFAULT, Power(x_, q_DEFAULT)), Times(c_DEFAULT, Power(x_, r_DEFAULT))),
                  p_DEFAULT)),
              x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Plus(ASymbol, Times(BSymbol, Power(x, Subtract(n, q)))),
                          Power(
                              Plus(Times(b, Power(x, n)),
                                  Times(c, Power(x, Subtract(Times(C2, n), q))), Times(a,
                                      Power(x, q))),
                              p)),
                      x),
                  And(FreeQ(List(a, b, c, ASymbol, BSymbol, n, p, q), x), EqQ(j, Subtract(n, q)),
                      EqQ(r, Subtract(Times(C2, n), q))))),
          IIntegrate(1939,
              Integrate(
                  Times(
                      Plus(A_, Times(B_DEFAULT,
                          Power(u_, j_DEFAULT))),
                      Power(
                          Plus(Times(b_DEFAULT, Power(u_, n_DEFAULT)),
                              Times(a_DEFAULT, Power(u_,
                                  q_DEFAULT)),
                              Times(c_DEFAULT, Power(u_, r_DEFAULT))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Coefficient(u, x,
                          C1), CN1),
                      Subst(
                          Integrate(
                              Times(Plus(ASymbol, Times(BSymbol, Power(x, Subtract(n, q)))),
                                  Power(
                                      Plus(Times(a, Power(x, q)), Times(b, Power(x, n)),
                                          Times(c, Power(x, Subtract(Times(C2, n), q)))),
                                      p)),
                              x),
                          x, u),
                      x),
                  And(FreeQ(List(a, b, c, ASymbol, BSymbol, n, p, q), x), EqQ(j, Subtract(n,
                      q)), EqQ(r,
                          Subtract(Times(C2, n), q)),
                      LinearQ(u, x), NeQ(u, x)))),
          IIntegrate(1940, Integrate(Times(Power(x_, m_DEFAULT),
              Power(Plus(Times(c_DEFAULT, Power(x_, j_DEFAULT)),
                  Times(b_DEFAULT, Power(x_, n_DEFAULT)), Times(a_DEFAULT, Power(x_, q_DEFAULT))),
                  p_DEFAULT),
              Plus(A_, Times(B_DEFAULT, Power(x_, r_DEFAULT)))), x_Symbol),
              Condition(
                  Integrate(Times(Power(x, Plus(m, Times(p, q))),
                      Plus(ASymbol, Times(BSymbol, Power(x, Subtract(n, q)))),
                      Power(Plus(a, Times(b, Power(x, Subtract(n, q))),
                          Times(c, Power(x, Times(C2, Subtract(n, q))))), p)),
                      x),
                  And(FreeQ(List(a, b, c, ASymbol, BSymbol, m, n, q), x), EqQ(r, Subtract(n, q)),
                      EqQ(j, Subtract(Times(C2, n), q)), IntegerQ(p), PosQ(Subtract(n, q))))));
}
