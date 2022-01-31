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
class IntRules75 {
  public static IAST RULES =
      List(
          IIntegrate(1501,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(Plus(Negate(Simp(
                  Times(Power(Times(f, x), Plus(m, C1)),
                      Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                      Plus(d, Times(e, Power(x, n))), Power(Times(C2, a, f, n, Plus(p, C1)), CN1)),
                  x)), Dist(
                      Power(Times(C2, a, n, Plus(p, C1)), CN1),
                      Integrate(Times(Power(Times(f, x), m),
                          Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                          Simp(Plus(Times(d, Plus(m, Times(C2, n, Plus(p, C1)), C1)),
                              Times(e, Plus(m, Times(n, Plus(Times(C2, p), C3)), C1), Power(x, n))),
                              x)),
                          x),
                      x)),
                  And(FreeQ(List(a, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      LtQ(p, CN1), IntegerQ(p)))),
          IIntegrate(1502,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(
                          Plus(
                              a_, Times(b_DEFAULT, Power(x_, n_)), Times(c_DEFAULT,
                                  Power(x_, $p("n2")))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(e, Power(f, Subtract(n, C1)),
                              Power(Times(f, x), Plus(m, Negate(n),
                                  C1)),
                              Power(
                                  Plus(a, Times(b, Power(x,
                                      n)), Times(c,
                                          Power(x, Times(C2, n)))),
                                  Plus(p, C1)),
                              Power(Times(c, Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Power(f, n), Power(Times(c,
                                  Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(Times(f, x), Subtract(m,
                                      n)),
                                  Power(
                                      Plus(
                                          a, Times(b, Power(x,
                                              n)),
                                          Times(c, Power(x, Times(C2, n)))),
                                      p),
                                  Simp(Plus(Times(a, e, Plus(m, Negate(n), C1)),
                                      Times(
                                          Subtract(Times(b, e, Plus(m, Times(n, p), C1)),
                                              Times(c, d,
                                                  Plus(m, Times(n, Plus(Times(C2, p), C1)), C1))),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, p), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(n, C0), GtQ(m, Subtract(n,
                          C1)),
                      NeQ(Plus(m, Times(n, Plus(Times(C2, p), C1)), C1), C0), IntegerQ(p)))),
          IIntegrate(1503,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(e, Power(f, Subtract(n, C1)),
                              Power(Times(f, x), Plus(m, Negate(n), C1)),
                              Power(Plus(a, Times(c,
                                  Power(x, Times(C2, n)))), Plus(p,
                                      C1)),
                              Power(Times(c, Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)), CN1)),
                          x),
                      Dist(
                          Times(Power(f, n), Power(Times(c,
                              Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p),
                                  Subtract(
                                      Times(a, e, Plus(m, Negate(n), C1)), Times(c, d,
                                          Plus(m, Times(n, Plus(Times(C2, p), C1)), C1), Power(x,
                                              n)))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, p), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      GtQ(m, Subtract(n,
                          C1)),
                      NeQ(Plus(m, Times(n, Plus(Times(C2, p), C1)), C1), C0), IntegerQ(p)))),
          IIntegrate(1504,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(
                          Plus(
                              a_, Times(b_DEFAULT, Power(x_, n_)), Times(c_DEFAULT,
                                  Power(x_, $p("n2")))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              d, Power(Times(f, x), Plus(m,
                                  C1)),
                              Power(
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  Plus(p, C1)),
                              Power(Times(a, f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(a, Power(f, n),
                              Plus(m, C1)), CN1),
                          Integrate(
                              Times(
                                  Power(Times(f, x), Plus(m,
                                      n)),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), p),
                                  Simp(Subtract(
                                      Subtract(Times(a, e, Plus(m, C1)),
                                          Times(b, d, Plus(m, Times(n, Plus(p, C1)), C1))),
                                      Times(c, d, Plus(m, Times(C2, n, Plus(p, C1)), C1),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, p), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), LtQ(m,
                          CN1),
                      IntegerQ(p)))),
          IIntegrate(1505,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT, Power(x_, n_))), Power(Plus(a_,
                          Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(d, Power(Times(f, x), Plus(m, C1)),
                      Power(Plus(a, Times(c, Power(x, Times(C2, n)))),
                          Plus(p, C1)),
                      Power(Times(a, f, Plus(m, C1)), CN1)), x),
                      Dist(Power(Times(a, Power(f, n), Plus(m, C1)), CN1),
                          Integrate(Times(Power(Times(f, x), Plus(m, n)),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p),
                              Subtract(Times(a, e, Plus(m, C1)),
                                  Times(c, d, Plus(m, Times(C2, n, Plus(p, C1)), C1),
                                      Power(x, n)))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, p), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      LtQ(m, CN1), IntegerQ(p)))),
          IIntegrate(1506,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_), Plus(d_, Times(e_DEFAULT, Power(x_, n_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(a, c), C2))),
                      Condition(
                          With(List(Set(
                              r, Rt(Subtract(Times(C2, c, q), Times(b, c)), C2))), Plus(
                                  Dist(
                                      Times(c, Power(Times(C2, q, r), CN1)), Integrate(
                                          Times(Power(Times(f, x), m),
                                              Simp(
                                                  Subtract(Times(d, r),
                                                      Times(Subtract(Times(c, d), Times(e, q)),
                                                          Power(x, Times(C1D2, n)))),
                                                  x),
                                              Power(
                                                  Plus(q, Times(CN1, r,
                                                      Power(x, Times(C1D2, n))),
                                                      Times(c, Power(x, n))),
                                                  CN1)),
                                          x),
                                      x),
                                  Dist(
                                      Times(c, Power(Times(C2, q, r), CN1)),
                                      Integrate(Times(Power(Times(f, x), m),
                                          Simp(Plus(Times(d, r),
                                              Times(Subtract(Times(c, d), Times(e, q)),
                                                  Power(x, Times(C1D2, n)))),
                                              x),
                                          Power(Plus(q, Times(r, Power(x, Times(C1D2, n))),
                                              Times(c, Power(x, n))), CN1)),
                                          x),
                                      x))),
                          Not(LtQ(Subtract(Times(C2, c, q), Times(b, c)), C0)))),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      LtQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IntegersQ(m, Times(C1D2, n)), LtQ(C0, m, n), PosQ(Times(a, c))))),
          IIntegrate(1507,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT, x_), m_), Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(a, c), C2))),
                      Condition(
                          With(List(Set(r, Rt(Times(C2, c, q), C2))),
                              Plus(Dist(Times(c, Power(Times(C2, q, r), CN1)),
                                  Integrate(Times(Power(Times(f, x), m),
                                      Simp(Subtract(Times(d, r),
                                          Times(Subtract(Times(c, d), Times(e, q)),
                                              Power(x, Times(C1D2, n)))),
                                          x),
                                      Power(Plus(q, Times(CN1, r, Power(x, Times(C1D2, n))),
                                          Times(c, Power(x, n))), CN1)),
                                      x),
                                  x),
                                  Dist(Times(c, Power(Times(C2, q, r), CN1)),
                                      Integrate(Times(Power(Times(f, x), m),
                                          Simp(Plus(Times(d, r),
                                              Times(Subtract(Times(c, d), Times(e, q)),
                                                  Power(x, Times(C1D2, n)))),
                                              x),
                                          Power(Plus(q, Times(r, Power(x, Times(C1D2, n))),
                                              Times(c, Power(x, n))), CN1)),
                                          x),
                                      x))),
                          Not(LtQ(Times(C2, c, q), C0)))),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)), GtQ(Times(a,
                      c), C0), IntegersQ(m,
                          Times(C1D2, n)),
                      LtQ(C0, m, n)))),
          IIntegrate(1508,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(
                          Plus(
                              a_, Times(b_DEFAULT, Power(x_,
                                  n_)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(a, c), C2))),
                      Condition(
                          With(
                              List(Set(r,
                                  Rt(Subtract(Times(C2, c, q), Times(b, c)), C2))),
                              Plus(
                                  Dist(Times(c, Power(Times(C2, q, r), CN1)),
                                      Integrate(
                                          Times(Power(Times(f, x), m),
                                              Subtract(Times(d, r),
                                                  Times(Subtract(Times(c, d), Times(e, q)),
                                                      Power(x, Times(C1D2, n)))),
                                              Power(Plus(q, Times(CN1, r, Power(x, Times(C1D2, n))),
                                                  Times(c, Power(x, n))), CN1)),
                                          x),
                                      x),
                                  Dist(Times(c, Power(Times(C2, q, r), CN1)),
                                      Integrate(Times(Power(Times(f, x), m),
                                          Plus(Times(d, r),
                                              Times(Subtract(Times(c, d), Times(e, q)),
                                                  Power(x, Times(C1D2, n)))),
                                          Power(Plus(q, Times(r, Power(x, Times(C1D2, n))),
                                              Times(c, Power(x, n))), CN1)),
                                          x),
                                      x))),
                          Not(LtQ(Subtract(Times(C2, c, q), Times(b, c)), C0)))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)),
                      LtQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(Times(C1D2, n), C1),
                      PosQ(Times(a, c))))),
          IIntegrate(1509,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q, Rt(Times(a, c), C2))), Condition(
                          With(
                              List(Set(r,
                                  Rt(Times(C2, c, q), C2))),
                              Plus(
                                  Dist(Times(c, Power(Times(C2, q, r), CN1)),
                                      Integrate(
                                          Times(Power(Times(f, x), m),
                                              Subtract(Times(d, r),
                                                  Times(Subtract(Times(c, d), Times(e, q)),
                                                      Power(x, Times(C1D2, n)))),
                                              Power(Plus(q, Times(CN1, r, Power(x, Times(C1D2, n))),
                                                  Times(c, Power(x, n))), CN1)),
                                          x),
                                      x),
                                  Dist(Times(c, Power(Times(C2, q, r), CN1)),
                                      Integrate(Times(Power(Times(f, x), m),
                                          Plus(Times(d, r),
                                              Times(Subtract(Times(c, d), Times(e, q)),
                                                  Power(x, Times(C1D2, n)))),
                                          Power(Plus(q, Times(r, Power(x, Times(C1D2, n))),
                                              Times(c, Power(x, n))), CN1)),
                                          x),
                                      x))),
                          Not(LtQ(Times(C2, c, q), C0)))),
                  And(FreeQ(List(a, c, d, e, f, m), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(Times(C1D2, n),
                          C1),
                      GtQ(Times(a, c), C0)))),
          IIntegrate(1510,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(
                          Plus(
                              a_, Times(b_DEFAULT, Power(x_,
                                  n_)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Plus(
                          Dist(
                              Plus(Times(C1D2, e),
                                  Times(
                                      Subtract(Times(C2, c, d), Times(b, e)),
                                      Power(Times(C2, q), CN1))),
                              Integrate(
                                  Times(Power(Times(f, x), m),
                                      Power(Plus(Times(C1D2, b), Times(CN1, C1D2, q),
                                          Times(c, Power(x, n))), CN1)),
                                  x),
                              x),
                          Dist(
                              Subtract(Times(C1D2, e),
                                  Times(Subtract(Times(C2, c, d), Times(b, e)),
                                      Power(Times(C2, q), CN1))),
                              Integrate(
                                  Times(Power(Times(f, x), m),
                                      Power(Plus(Times(C1D2, b), Times(C1D2, q),
                                          Times(c, Power(x, n))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IGtQ(n, C0)))),
          IIntegrate(1511,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Times(CN1, a, c), C2))),
                      Plus(
                          Negate(
                              Dist(Plus(Times(C1D2, e), Times(c, d, Power(Times(C2, q), CN1))),
                                  Integrate(Times(Power(Times(f, x), m),
                                      Power(Subtract(q, Times(c, Power(x, n))), CN1)), x),
                                  x)),
                          Dist(Subtract(Times(C1D2, e), Times(c, d, Power(Times(C2, q), CN1))),
                              Integrate(Times(Power(Times(f, x), m),
                                  Power(Plus(q, Times(c, Power(x, n))), CN1)), x),
                              x))),
                  And(FreeQ(List(a, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0)))),
          IIntegrate(1512,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(
                              Power(Times(f, x), m), Power(Plus(d,
                                  Times(e, Power(x, n))), q),
                              Power(
                                  Plus(a, Times(b, Power(x,
                                      n)), Times(c,
                                          Power(x, Times(C2, n)))),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), IntegerQ(q), IntegerQ(m)))),
          IIntegrate(1513,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(
                          Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))), q),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      IntegerQ(q), IntegerQ(m)))),
          IIntegrate(1514,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                          Power(x_, n_))), CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(Power(Times(f, x), m),
                      Times(Power(Plus(d, Times(e, Power(x, n))), q),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              CN1)),
                      x), x),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), IntegerQ(q), Not(IntegerQ(m))))),
          IIntegrate(1515,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(Power(Times(f, x), m),
                      Times(Power(Plus(d, Times(e, Power(x, n))), q),
                          Power(Plus(a, Times(c, Power(x, Times(C2, n)))), CN1)),
                      x), x),
                  And(FreeQ(List(a, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      IntegerQ(q), Not(IntegerQ(m))))),
          IIntegrate(1516,
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
                          Times(Power(f, Times(C2,
                              n)), Power(c,
                                  CN2)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                                  Plus(Times(c, d), Times(CN1, b, e), Times(c, e, Power(x, n))),
                                  Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1))),
                              x),
                          x),
                      Dist(Times(Power(f, Times(C2, n)), Power(c, CN2)), Integrate(Times(
                          Power(Times(f, x), Subtract(m, Times(C2, n))),
                          Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1)),
                          Simp(Plus(Times(a, Subtract(Times(c, d), Times(b, e))),
                              Times(Plus(Times(b, c, d), Times(CN1, Sqr(b), e), Times(a, c, e)),
                                  Power(x, n))),
                              x),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              CN1)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(n, C0), Not(IntegerQ(
                          q)),
                      GtQ(q, C0), GtQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1517,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(Power(f, Times(C2,
                              n)), Power(c,
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                                  Power(Plus(d, Times(e, Power(x, n))), q)),
                              x),
                          x),
                      Dist(Times(a, Power(f, Times(C2, n)), Power(c, CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, Times(C2, n))),
                                  Power(Plus(d, Times(e, Power(x, n))), q), Power(Plus(a,
                                      Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, q), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      Not(IntegerQ(q)), GtQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1518,
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
                  Subtract(
                      Dist(
                          Times(e, Power(f, n), Power(c,
                              CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1))),
                              x),
                          x),
                      Dist(Times(Power(f, n), Power(c, CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1)),
                                  Simp(
                                      Subtract(Times(a, e),
                                          Times(Subtract(Times(c, d), Times(b, e)), Power(x, n))),
                                      x),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), Not(IntegerQ(
                          q)),
                      GtQ(q, C0), GtQ(m, Subtract(n, C1)), LeQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1519,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(e, Power(f, n), Power(c, CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1))),
                              x),
                          x),
                      Dist(Times(Power(f, n), Power(c, CN1)),
                          Integrate(Times(Power(Times(f, x), Subtract(m, n)),
                              Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1)),
                              Simp(Subtract(Times(a, e), Times(c, d,
                                  Power(x, n))), x),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      Not(IntegerQ(q)), GtQ(q, C0), GtQ(m, Subtract(n,
                          C1)),
                      LeQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1520,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          CN1),
                      Power(Plus(d_DEFAULT, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Subtract(Dist(Times(d, Power(a, CN1)),
                      Integrate(Times(Power(Times(f, x), m),
                          Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1))), x),
                      x),
                      Dist(Power(Times(a, Power(f, n)), CN1), Integrate(Times(
                          Power(Times(f, x), Plus(m, n)),
                          Power(Plus(d, Times(e, Power(x, n))), Subtract(q, C1)),
                          Simp(Plus(Times(b, d), Times(CN1, a, e), Times(c, d, Power(x, n))), x),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              CN1)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), Not(IntegerQ(q)),
                      GtQ(q, C0), LtQ(m, C0)))));
}
