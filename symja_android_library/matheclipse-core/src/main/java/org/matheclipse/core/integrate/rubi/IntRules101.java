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
class IntRules101 {
  public static IAST RULES =
      List(
          IIntegrate(2021,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_,
                                  j_DEFAULT)),
                              Times(b_DEFAULT, Power(x_, n_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(c, x), Plus(m, C1)),
                              Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                  p),
                              Power(Times(c, Plus(m, Times(n, p), C1)), CN1)),
                          x),
                      Dist(
                          Times(a, Subtract(n, j), p, Power(
                              Times(Power(c, j), Plus(m, Times(n, p), C1)), CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Plus(m, j)),
                                  Power(
                                      Plus(Times(a, Power(x, j)),
                                          Times(b, Power(x, n))),
                                      Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, m), x), Not(IntegerQ(p)), LtQ(C0, j, n),
                      Or(IntegersQ(j, n), GtQ(c, C0)), GtQ(p, C0), NeQ(Plus(m, Times(n, p), C1),
                          C0)))),
          IIntegrate(2022,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_,
                                  j_DEFAULT)),
                              Times(b_DEFAULT, Power(x_, n_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(
                      Times(Power(c, Subtract(n, C1)), Power(Times(c, x), Plus(m, Negate(n), C1)),
                          Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))), Plus(p, C1)),
                          Power(Times(b, Subtract(n, j), Plus(p, C1)), CN1)),
                      x),
                      Dist(
                          Times(Power(c, n), Plus(m, Times(j, p), Negate(n), j,
                              C1), Power(Times(b, Subtract(n, j), Plus(p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Subtract(m, n)),
                                  Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                      Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), Not(IntegerQ(p)), LtQ(C0, j, n),
                      Or(IntegersQ(j, n), GtQ(c,
                          C0)),
                      LtQ(p, CN1), GtQ(Plus(m, Times(j, p), C1), Subtract(n, j))))),
          IIntegrate(2023,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(Times(a_DEFAULT, Power(x_, j_DEFAULT)),
                          Times(b_DEFAULT, Power(x_, n_DEFAULT))), p_)),
                  x_Symbol),
              Condition(
                  Plus(Negate(Simp(
                      Times(Power(c, Subtract(j, C1)), Power(Times(c, x), Plus(m, Negate(j), C1)),
                          Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))), Plus(p, C1)),
                          Power(Times(a, Subtract(n, j), Plus(p, C1)), CN1)),
                      x)), Dist(
                          Times(
                              Power(c, j), Plus(m, Times(n, p), n, Negate(j), C1), Power(
                                  Times(a, Subtract(n, j), Plus(p, C1)), CN1)),
                          Integrate(Times(Power(Times(c, x), Subtract(m, j)),
                              Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                  Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, m), x), Not(IntegerQ(p)), LtQ(C0, j, n), Or(IntegersQ(j,
                      n), GtQ(c, C0)), LtQ(p,
                          CN1)))),
          IIntegrate(2024,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_, j_DEFAULT)), Times(b_DEFAULT,
                                  Power(x_, n_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(c, Subtract(n, C1)),
                              Power(Times(c, x), Plus(m, Negate(n),
                                  C1)),
                              Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                  Plus(p, C1)),
                              Power(Times(b, Plus(m, Times(n, p), C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              a, Power(c, Subtract(n, j)), Plus(m, Times(j, p), Negate(n), j,
                                  C1),
                              Power(Times(b, Plus(m, Times(n, p), C1)), CN1)),
                          Integrate(
                              Times(Power(Times(c, x),
                                  Subtract(m, Subtract(n, j))),
                                  Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, m, p), x), Not(IntegerQ(p)), LtQ(C0, j, n),
                      Or(IntegersQ(j, n), GtQ(c, C0)),
                      GtQ(Plus(m, Times(j, p), C1, Negate(n),
                          j), C0),
                      NeQ(Plus(m, Times(n, p), C1), C0)))),
          IIntegrate(2025,
              Integrate(
                  Times(Power(Times(c_DEFAULT, x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_, j_DEFAULT)), Times(b_DEFAULT,
                                  Power(x_, n_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(c, Subtract(j, C1)),
                              Power(Times(c, x), Plus(m, Negate(j), C1)),
                              Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                  Plus(p, C1)),
                              Power(Times(a, Plus(m, Times(j, p), C1)), CN1)),
                          x),
                      Dist(
                          Times(b, Plus(m, Times(n, p), n, Negate(j), C1),
                              Power(Times(a, Power(c, Subtract(n, j)), Plus(m, Times(j, p), C1)),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Times(c, x), Subtract(Plus(m, n),
                                      j)),
                                  Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))), p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, m, p), x), Not(IntegerQ(p)), LtQ(C0, j, n), Or(IntegersQ(
                      j, n), GtQ(c, C0)), LtQ(Plus(m, Times(j, p), C1),
                          C0)))),
          IIntegrate(2026,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_,
                                  j_DEFAULT)),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Plus(m,
                          C1), CN1),
                      Subst(
                          Integrate(Power(
                              Plus(Times(a, Power(x, Simplify(Times(j, Power(Plus(m, C1), CN1))))),
                                  Times(b, Power(x, Simplify(Times(n, Power(Plus(m, C1), CN1)))))),
                              p), x),
                          x, Power(x, Plus(m, C1))),
                      x),
                  And(FreeQ(List(a, b, j, m, n, p), x), Not(IntegerQ(p)), NeQ(n, j),
                      IntegerQ(Simplify(Times(j, Power(n, CN1)))), NeQ(m,
                          CN1),
                      IntegerQ(Simplify(Times(n, Power(Plus(m, C1), CN1)))), Not(IntegerQ(n))))),
          IIntegrate(2027,
              Integrate(
                  Times(Power(Times(c_, x_), m_DEFAULT),
                      Power(Plus(Times(a_DEFAULT, Power(x_, j_DEFAULT)),
                          Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(c, IntPart(m)), Power(Times(c, x),
                              FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(Power(x, m),
                              Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, j, m, n, p), x), Not(IntegerQ(p)), NeQ(n, j),
                      IntegerQ(Simplify(Times(j,
                          Power(n, CN1)))),
                      NeQ(m, CN1), IntegerQ(Simplify(
                          Times(n, Power(Plus(m, C1), CN1)))),
                      Not(IntegerQ(n))))),
          IIntegrate(2028,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_,
                                  j_DEFAULT)),
                              Times(b_DEFAULT, Power(x_, n_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(c, x), Plus(m, C1)),
                              Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                  p),
                              Power(Times(c, p, Subtract(n, j)), CN1)),
                          x),
                      Dist(
                          Times(a, Power(Power(c, j),
                              CN1)),
                          Integrate(Times(Power(Times(c, x), Plus(m, j)),
                              Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                  Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, j, m, n), x), IGtQ(Plus(p, C1D2), C0), NeQ(n,
                      j), EqQ(Simplify(Plus(m, Times(j, p), C1)), C0),
                      Or(IntegerQ(j), GtQ(c, C0))))),
          IIntegrate(2029,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(Times(a_DEFAULT, Power(x_, j_DEFAULT)),
                          Times(b_DEFAULT, Power(x_, n_DEFAULT))), CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(CN2, Power(Subtract(n, j),
                          CN1)),
                      Subst(
                          Integrate(Power(Subtract(C1, Times(a, Sqr(x))),
                              CN1), x),
                          x,
                          Times(
                              Power(x, Times(C1D2, j)), Power(Plus(Times(a, Power(x, j)),
                                  Times(b, Power(x, n))), CN1D2))),
                      x),
                  And(FreeQ(List(a, b, j, n), x), EqQ(m, Subtract(Times(C1D2, j), C1)),
                      NeQ(n, j)))),
          IIntegrate(2030,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_, j_DEFAULT)), Times(b_DEFAULT,
                                  Power(x_, n_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(c, Subtract(j, C1)),
                                  Power(Times(c, x), Plus(m, Negate(j), C1)),
                                  Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                      Plus(p, C1)),
                                  Power(Times(a, Subtract(n, j), Plus(p, C1)), CN1)),
                              x)),
                      Dist(
                          Times(
                              Power(c, j), Plus(m, Times(n, p), n, Negate(j), C1), Power(
                                  Times(a, Subtract(n, j), Plus(p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(c, x), Subtract(m, j)),
                                  Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                      Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, j, m, n), x), ILtQ(Plus(p, C1D2), C0), NeQ(n,
                      j), EqQ(Simplify(Plus(m, Times(j, p), C1)), C0),
                      Or(IntegerQ(j), GtQ(c, C0))))),
          IIntegrate(2031,
              Integrate(
                  Times(
                      Power(Times(c_,
                          x_), m_DEFAULT),
                      Power(Plus(Times(a_DEFAULT, Power(x_, j_DEFAULT)),
                          Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(c, IntPart(m)), Power(Times(c,
                              x), FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(
                              Power(x, m), Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, j, m, n, p), x), IntegerQ(Plus(p, C1D2)), NeQ(n, j),
                      EqQ(Simplify(Plus(m, Times(j, p), C1)), C0)))),
          IIntegrate(2032,
              Integrate(
                  Times(
                      Power(Times(c_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_, j_DEFAULT)), Times(b_DEFAULT,
                                  Power(x_, n_DEFAULT))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(c, IntPart(m)), Power(Times(c, x), FracPart(m)),
                          Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, n))), FracPart(p)),
                          Power(
                              Times(Power(x, Plus(FracPart(m), Times(j, FracPart(p)))),
                                  Power(Plus(a, Times(b, Power(x, Subtract(n, j)))), FracPart(p))),
                              CN1)),
                      Integrate(
                          Times(
                              Power(x, Plus(m, Times(j, p))), Power(
                                  Plus(a, Times(b, Power(x, Subtract(n, j)))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, j, m, n, p), x), Not(IntegerQ(p)), NeQ(n, j),
                      PosQ(Subtract(n, j))))),
          IIntegrate(2033,
              Integrate(
                  Times(Power(u_, m_DEFAULT),
                      Power(
                          Plus(Times(a_DEFAULT, Power(v_, j_DEFAULT)),
                              Times(b_DEFAULT, Power(v_, n_DEFAULT))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(u, m), Power(Times(Coefficient(v, x, C1), Power(v, m)),
                          CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(x, m), Power(Plus(Times(a, Power(x, j)),
                                      Times(b, Power(x, n))), p)),
                              x),
                          x, v),
                      x),
                  And(FreeQ(List(a, b, j, m, n, p), x), LinearPairQ(u, v, x)))),
          IIntegrate(2034,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(Times(b_DEFAULT, Power(x_, k_DEFAULT)), Times(a_DEFAULT,
                              Power(x_, j_))),
                          p_),
                      Power(Plus(c_, Times(d_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(n, CN1),
                      Subst(Integrate(
                          Times(Power(x, Subtract(Simplify(Times(Plus(m, C1), Power(n, CN1))), C1)),
                              Power(
                                  Plus(Times(a, Power(x, Simplify(Times(j, Power(n, CN1))))),
                                      Times(b, Power(x, Simplify(Times(k, Power(n, CN1)))))),
                                  p),
                              Power(Plus(c, Times(d, x)), q)),
                          x), x, Power(x, n)),
                      x),
                  And(FreeQ(List(a, b, c, d, j, k, m, n, p, q), x), Not(IntegerQ(p)), NeQ(k, j),
                      IntegerQ(Simplify(Times(j, Power(n, CN1)))),
                      IntegerQ(Simplify(Times(k, Power(n, CN1)))), IntegerQ(Simplify(
                          Times(Plus(m, C1), Power(n, CN1)))),
                      NeQ(Sqr(n), C1)))),
          IIntegrate(2035,
              Integrate(
                  Times(Power(Times(e_, x_), m_DEFAULT),
                      Power(Plus(c_,
                          Times(d_DEFAULT, Power(x_, n_DEFAULT))), q_DEFAULT),
                      Power(
                          Plus(
                              Times(b_DEFAULT, Power(x_, k_DEFAULT)), Times(a_DEFAULT,
                                  Power(x_, j_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(e, IntPart(m)), Power(Times(e,
                              x), FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(Power(x, m),
                              Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, k))),
                                  p),
                              Power(Plus(c, Times(d, Power(x, n))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, j, k, m, n, p, q), x), Not(IntegerQ(p)), NeQ(k, j),
                      IntegerQ(Simplify(Times(j, Power(n, CN1)))),
                      IntegerQ(Simplify(Times(k, Power(n, CN1)))), IntegerQ(Simplify(
                          Times(Plus(m, C1), Power(n, CN1)))),
                      NeQ(Sqr(n), C1)))),
          IIntegrate(2036,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(Times(a_DEFAULT, Power(x_, j_DEFAULT)),
                          Times(b_DEFAULT, Power(x_, $p("jn", true)))), p_),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(c, Power(e, Subtract(j, C1)),
                          Power(Times(e, x), Plus(m, Negate(j), C1)),
                          Power(
                              Plus(Times(a, Power(x, j)), Times(b, Power(x, Plus(j, n)))), Plus(p,
                                  C1)),
                          Power(Times(a, Plus(m, Times(j, p), C1)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, j, m, n, p), x), EqQ($s("jn"), Plus(j, n)),
                      Not(IntegerQ(p)), NeQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(
                          Subtract(
                              Times(a, d, Plus(m, Times(j, p), C1)), Times(b, c,
                                  Plus(m, n, Times(p, Plus(j, n)), C1))),
                          C0),
                      Or(GtQ(e, C0), IntegersQ(j)), NeQ(Plus(m, Times(j, p), C1), C0)))),
          IIntegrate(2037,
              Integrate(
                  Times(
                      Power(Times(e_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_,
                                  j_DEFAULT)),
                              Times(b_DEFAULT, Power(x_, $p("jn", true)))),
                          p_),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(Power(e, Subtract(j, C1)), Subtract(Times(b, c), Times(a, d)),
                                  Power(Times(e,
                                      x), Plus(m, Negate(j), C1)),
                                  Power(Plus(Times(a, Power(x, j)),
                                      Times(b, Power(x, Plus(j, n)))), Plus(p, C1)),
                                  Power(Times(a, b, n, Plus(p, C1)), CN1)),
                              x)),
                      Dist(
                          Times(Power(e, j),
                              Subtract(
                                  Times(a, d, Plus(m, Times(j, p), C1)), Times(b, c,
                                      Plus(m, n, Times(p, Plus(j, n)), C1))),
                              Power(Times(a, b, n, Plus(p, C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Times(e, x), Subtract(m,
                                      j)),
                                  Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, Plus(j, n)))),
                                      Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, j, m, n), x), EqQ($s("jn"), Plus(j, n)),
                      Not(IntegerQ(p)), NeQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      LtQ(p, CN1), GtQ(j, C0), LeQ(j, m), Or(GtQ(e, C0), IntegerQ(j))))),
          IIntegrate(2038,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(
                          Plus(
                              Times(a_DEFAULT, Power(x_, j_DEFAULT)), Times(b_DEFAULT,
                                  Power(x_, $p("jn", true)))),
                          p_),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(c, Power(e, Subtract(j, C1)),
                              Power(Times(e, x), Plus(m, Negate(j), C1)),
                              Power(Plus(Times(a, Power(x, j)),
                                  Times(b, Power(x, Plus(j, n)))), Plus(p, C1)),
                              Power(Times(a, Plus(m, Times(j, p), C1)), CN1)),
                          x),
                      Dist(
                          Times(Subtract(Times(a, d, Plus(m, Times(j, p), C1)), Times(b, c,
                              Plus(m, n, Times(p, Plus(j, n)), C1))), Power(
                                  Times(a, Power(e, n), Plus(m, Times(j, p), C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Times(e, x), Plus(m,
                                      n)),
                                  Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, Plus(j, n)))),
                                      p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, j, p), x), EqQ($s("jn"), Plus(j, n)),
                      Not(IntegerQ(p)), NeQ(Subtract(Times(b, c), Times(a, d)), C0), GtQ(n, C0),
                      Or(LtQ(Plus(m, Times(j, p)), CN1),
                          And(IntegersQ(Subtract(m, C1D2), Subtract(p, C1D2)), LtQ(p, C0),
                              LtQ(m, Subtract(Times(CN1, n, p), C1)))),
                      Or(GtQ(e, C0), IntegersQ(j, n)), NeQ(Plus(m, Times(j, p),
                          C1), C0),
                      NeQ(Plus(m, Negate(n), Times(j, p), C1), C0)))),
          IIntegrate(2039,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(Times(a_DEFAULT, Power(x_, j_DEFAULT)),
                          Times(b_DEFAULT, Power(x_, $p("jn", true)))), p_),
                      Plus(c_, Times(d_DEFAULT, Power(x_, n_DEFAULT)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(d, Power(e, Subtract(j, C1)),
                              Power(Times(e, x), Plus(m, Negate(j), C1)),
                              Power(
                                  Plus(Times(a, Power(x, j)), Times(b, Power(x, Plus(j, n)))), Plus(
                                      p, C1)),
                              Power(Times(b, Plus(m, n, Times(p, Plus(j, n)), C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Subtract(Times(a, d, Plus(m, Times(j, p), C1)),
                                  Times(b, c, Plus(m, n, Times(p, Plus(j, n)), C1))),
                              Power(Times(b, Plus(m, n, Times(p, Plus(j, n)), C1)), CN1)),
                          Integrate(
                              Times(Power(Times(e, x), m),
                                  Power(Plus(Times(a, Power(x, j)), Times(b, Power(x, Plus(j, n)))),
                                      p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, j, m, n, p), x), EqQ($s("jn"), Plus(j, n)),
                      Not(IntegerQ(p)), NeQ(Subtract(Times(b, c), Times(a, d)), C0), NeQ(Plus(m, n,
                          Times(p, Plus(j, n)), C1), C0),
                      Or(GtQ(e, C0), IntegerQ(j))))),
          IIntegrate(2040,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(c_,
                          Times(d_DEFAULT, Power(x_, n_DEFAULT))), q_DEFAULT),
                      Power(
                          Plus(
                              Times(b_DEFAULT, Power(x_,
                                  k_DEFAULT)),
                              Times(a_DEFAULT, Power(x_, j_))),
                          p_)),
                  x_Symbol),
              Condition(Dist(
                  Power(Plus(m,
                      C1), CN1),
                  Subst(Integrate(
                      Times(
                          Power(
                              Plus(Times(
                                  a, Power(x, Simplify(Times(j, Power(Plus(m, C1), CN1))))),
                                  Times(b, Power(x, Simplify(Times(k, Power(Plus(m, C1), CN1)))))),
                              p),
                          Power(
                              Plus(c,
                                  Times(d, Power(x, Simplify(Times(n, Power(Plus(m, C1), CN1)))))),
                              q)),
                      x), x, Power(x, Plus(m, C1))),
                  x),
                  And(FreeQ(List(a, b, c, d, j, k, m, n, p, q), x), Not(IntegerQ(p)), NeQ(k, j),
                      IntegerQ(Simplify(Times(j, Power(n, CN1)))),
                      IntegerQ(Simplify(Times(k, Power(n, CN1)))), NeQ(m, CN1),
                      IntegerQ(Simplify(Times(n, Power(Plus(m, C1), CN1)))), Not(IntegerQ(n))))));
}
