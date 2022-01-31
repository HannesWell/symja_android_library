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
class IntRules76 {
  public static IAST RULES =
      List(
          IIntegrate(1521,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(d, Power(a, CN1)),
                          Integrate(
                              Times(
                                  Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))),
                                      Subtract(q, C1))),
                              x),
                          x),
                      Dist(
                          Power(Times(a,
                              Power(f, n)), CN1),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, n)),
                                  Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1)),
                                  Simp(Subtract(Times(a, e), Times(c, d, Power(x, n))), x),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      Not(IntegerQ(q)), GtQ(q, C0), LtQ(m, C0)))),
          IIntegrate(1522,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(Sqr(d), Power(f, Times(C2, n)),
                              Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                                  Power(Plus(d, Times(e, Power(x, n))), q)),
                              x),
                          x),
                      Dist(
                          Times(
                              Power(f, Times(C2,
                                  n)),
                              Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                                  Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                                  Simp(Plus(Times(a, d),
                                      Times(Subtract(Times(b, d), Times(a, e)), Power(x, n))), x),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(n, C0), Not(IntegerQ(
                          q)),
                      LtQ(q, CN1), GtQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1523,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(
                              Sqr(d), Power(f, Times(C2,
                                  n)),
                              Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                          Integrate(
                              Times(
                                  Power(Times(f, x), Subtract(m,
                                      Times(C2, n))),
                                  Power(Plus(d, Times(e, Power(x, n))), q)),
                              x),
                          x),
                      Dist(
                          Times(a, Power(f, Times(C2, n)),
                              Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                          Integrate(Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                              Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                              Subtract(d, Times(e, Power(x, n))), Power(
                                  Plus(a, Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0), Not(
                      IntegerQ(q)), LtQ(q, CN1), GtQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1524,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(
                              Times(d, e, Power(f, n),
                                  Power(
                                      Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                                          Times(a, Sqr(e))),
                                      CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), Subtract(m, n)),
                                      Power(Plus(d, Times(e, Power(x, n))), q)),
                                  x),
                              x)),
                      Dist(
                          Times(
                              Power(f, n),
                              Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                                  Simp(Plus(Times(a, e), Times(c, d, Power(x, n))), x),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), Not(IntegerQ(
                          q)),
                      LtQ(q, CN1), GtQ(m, Subtract(n, C1)), LeQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1525,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(
                              Times(
                                  d, e, Power(f, n), Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                                      CN1)),
                              Integrate(
                                  Times(
                                      Power(Times(f, x), Subtract(m, n)), Power(
                                          Plus(d, Times(e, Power(x, n))), q)),
                                  x),
                              x)),
                      Dist(Times(Power(f, n), Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                                  Simp(Plus(Times(a, e), Times(c, d, Power(x, n))), x),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      Not(IntegerQ(q)), LtQ(q, CN1), GtQ(m, Subtract(n,
                          C1)),
                      LeQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1526,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_,
                          Times(e_DEFAULT, Power(x_, n_))), q_),
                      Power(
                          Plus(
                              a_, Times(b_DEFAULT, Power(x_, n_)), Times(c_DEFAULT,
                                  Power(x_, $p("n2")))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(Sqr(e),
                              Power(
                                  Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                                      Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(d, Times(e, Power(x, n))), q)),
                              x),
                          x),
                      Dist(
                          Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), CN1),
                          Integrate(Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                              Simp(
                                  Subtract(Subtract(Times(c, d), Times(b, e)),
                                      Times(c, e, Power(x, n))),
                                  x),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(n, C0), Not(IntegerQ(q)), LtQ(q, CN1)))),
          IIntegrate(1527,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(Sqr(e), Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(d, Times(e, Power(x, n))), q)),
                              x),
                          x),
                      Dist(Times(c, Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                                  Subtract(d, Times(e, Power(x, n))), Power(Plus(a,
                                      Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, m), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      Not(IntegerQ(q)), LtQ(q, CN1)))),
          IIntegrate(1528,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Power(Plus(d,
                              Times(e, Power(x, n))), q),
                          Times(Power(Times(f, x), m),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, q, n), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), Not(IntegerQ(q)), IntegerQ(m)))),
          IIntegrate(1529,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(c_DEFAULT, Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(Power(Plus(d, Times(e, Power(x, n))), q),
                          Times(Power(Times(f, x), m),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, q, n), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n, C0), Not(IntegerQ(q)), IntegerQ(
                          m)))),
          IIntegrate(1530,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))), q)),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              CN1),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, q, n), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(n, C0), Not(IntegerQ(q)), Not(IntegerQ(m))))),
          IIntegrate(1531,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), CN1), Power(
                          Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))),
                              q)),
                          Power(Plus(a, Times(c, Power(x, Times(C2, n)))), CN1), x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, q, n), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      Not(IntegerQ(q)), Not(IntegerQ(m))))),
          IIntegrate(1532,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(
                          Plus(
                              a_DEFAULT, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_DEFAULT),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Power(d, CN2),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Plus(Times(a, d),
                                      Times(Subtract(Times(b, d), Times(a, e)), Power(x, n))),
                                  Power(
                                      Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))),
                                      Subtract(p, C1))),
                              x),
                          x),
                      Dist(Times(Plus(
                          Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          Power(Times(Sqr(d), Power(f, Times(C2, n))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, Times(C2, n))),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), Subtract(p, C1)),
                                  Power(Plus(d, Times(e, Power(x, n))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), GtQ(p, C0), LtQ(m, Negate(n))))),
          IIntegrate(1533,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_DEFAULT),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(a, Power(d,
                              CN2)),
                          Integrate(
                              Times(
                                  Power(Times(f, x), m), Subtract(d, Times(e,
                                      Power(x, n))),
                                  Power(Plus(a, Times(c,
                                      Power(x, Times(C2, n)))), Subtract(p,
                                          C1))),
                              x),
                          x),
                      Dist(
                          Times(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                              Power(Times(Sqr(d), Power(f, Times(C2, n))), CN1)),
                          Integrate(Times(Power(Times(f, x), Plus(m, Times(C2, n))),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Subtract(p, C1)),
                              Power(Plus(d, Times(e, Power(x, n))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      GtQ(p, C0), LtQ(m, Negate(n))))),
          IIntegrate(1534,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(
                          Plus(
                              a_DEFAULT, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_DEFAULT),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Power(Times(d,
                              e), CN1),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Plus(Times(a, e), Times(c, d,
                                      Power(x, n))),
                                  Power(
                                      Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))),
                                      Subtract(p, C1))),
                              x),
                          x),
                      Dist(
                          Times(
                              Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), Power(
                                  Times(d, e, Power(f, n)), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), Subtract(p, C1)),
                                  Power(Plus(d, Times(e, Power(x, n))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), GtQ(p, C0), LtQ(m, C0)))),
          IIntegrate(1535,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_DEFAULT),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Power(Times(d,
                              e), CN1),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Plus(Times(a, e), Times(c, d,
                                      Power(x, n))),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))),
                                      Subtract(p, C1))),
                              x),
                          x),
                      Dist(
                          Times(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                              Power(Times(d, e, Power(f, n)), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, n)),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Subtract(p, C1)),
                                  Power(Plus(d, Times(e, Power(x, n))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      GtQ(p, C0), LtQ(m, C0)))),
          IIntegrate(1536,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Plus(a_DEFAULT, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(
                          b_DEFAULT, Power(x_, n_))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(Times(Power(f, Times(C2, n)),
                              Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                                  CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                                      Plus(Times(a, d),
                                          Times(Subtract(Times(b, d), Times(a, e)), Power(x, n))),
                                      Power(Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))), p)),
                                  x),
                              x)),
                      Dist(
                          Times(Sqr(d), Power(f, Times(C2, n)),
                              Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                  Power(Plus(d, Times(e, Power(x, n))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), LtQ(p, CN1), GtQ(m, n)))),
          IIntegrate(1537,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(
                              Times(a, Power(f, Times(C2, n)), Power(
                                  Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                                      Subtract(d, Times(e, Power(x, n))), Power(Plus(a,
                                          Times(c, Power(x, Times(C2, n)))), p)),
                                  x),
                              x)),
                      Dist(
                          Times(Sqr(d), Power(f, Times(C2, n)),
                              Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), CN1)),
                          Integrate(Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                              Power(Plus(d, Times(e, Power(x, n))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      LtQ(p, CN1), GtQ(m, n)))),
          IIntegrate(1538,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_DEFAULT, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(
                                  b_DEFAULT, Power(x_, n_))),
                          p_),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(Power(f, n),
                              Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Plus(Times(a, e), Times(c, d,
                                      Power(x, n))),
                                  Power(
                                      Plus(
                                          a, Times(b, Power(x, n)), Times(c,
                                              Power(x, Times(C2, n)))),
                                      p)),
                              x),
                          x),
                      Dist(
                          Times(d, e, Power(f, n),
                              Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                  Power(Plus(d, Times(e, Power(x, n))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), LtQ(p, CN1),
                      GtQ(m, C0)))),
          IIntegrate(1539,
              Integrate(Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_), Power(
                      Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(Power(f, n), Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Plus(Times(a, e), Times(c, d, Power(x, n))), Power(
                                      Plus(a, Times(c, Power(x, Times(C2, n)))), p)),
                              x),
                          x),
                      Dist(
                          Times(
                              d, e, Power(f, n), Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                  Power(Plus(d, Times(e, Power(x, n))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      LtQ(p, CN1), GtQ(m, C0)))),
          IIntegrate(1540,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(
                      Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))), p),
                      Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))), q)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, q), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0),
                      Or(IGtQ(q, C0), IntegersQ(m, q))))));
}
