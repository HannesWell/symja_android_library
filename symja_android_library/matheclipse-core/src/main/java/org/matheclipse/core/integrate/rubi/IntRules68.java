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
class IntRules68 {
  public static IAST RULES =
      List(
          IIntegrate(1361,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(
                      Times(Power(d, Subtract(n, C1)), Power(Times(d, x), Plus(m, Negate(n), C1)),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p),
                          Plus(Times(b, n, p),
                              Times(c, Plus(m, Times(n, Subtract(Times(C2, p), C1)), C1),
                                  Power(x, n))),
                          Power(
                              Times(c, Plus(m, Times(C2, n, p), C1),
                                  Plus(m, Times(n, Subtract(Times(C2, p), C1)), C1)),
                              CN1)),
                      x),
                      Dist(
                          Times(n, p, Power(d, n),
                              Power(
                                  Times(
                                      c, Plus(m, Times(C2, n, p), C1), Plus(m, Times(n,
                                          Subtract(Times(C2, p), C1)), C1)),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Times(d, x), Subtract(m,
                                      n)),
                                  Power(
                                      Plus(
                                          a, Times(b, Power(x, n)), Times(c,
                                              Power(x, Times(C2, n)))),
                                      Subtract(p, C1)),
                                  Simp(Subtract(Times(a, b, Plus(m, Negate(n), C1)),
                                      Times(
                                          Subtract(
                                              Times(C2, a, c,
                                                  Plus(m, Times(n, Subtract(Times(C2, p), C1)),
                                                      C1)),
                                              Times(Sqr(b),
                                                  Plus(m, Times(n, Subtract(p, C1)), C1))),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), IGtQ(p, C0),
                      GtQ(m, Subtract(n, C1)), NeQ(Plus(m, Times(C2, n, p),
                          C1), C0),
                      NeQ(Plus(m, Times(n, Subtract(Times(C2, p), C1)), C1), C0)))),
          IIntegrate(1362,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Power(Times(d, x), Plus(m,
                                  C1)),
                              Power(
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  p),
                              Power(Times(d, Plus(m, C1)), CN1)),
                          x),
                      Dist(Times(n, p, Power(Times(Power(d, n), Plus(m, C1)), CN1)), Integrate(
                          Times(Power(Times(d, x), Plus(m, n)), Plus(b, Times(C2, c, Power(x, n))),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  Subtract(p, C1))),
                          x), x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), IGtQ(p, C0), LtQ(m,
                          CN1)))),
          IIntegrate(1363,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(Times(d, x), Plus(m,
                                  C1)),
                              Power(
                                  Plus(a, Times(b, Power(x,
                                      n)), Times(c,
                                          Power(x, Times(C2, n)))),
                                  p),
                              Power(Times(d, Plus(m, Times(C2, n, p), C1)), CN1)),
                          x),
                      Dist(Times(n, p, Power(Plus(m, Times(C2, n, p), C1), CN1)),
                          Integrate(
                              Times(Power(Times(d, x), m),
                                  Plus(Times(C2, a), Times(b, Power(x, n))),
                                  Power(
                                      Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))),
                                      Subtract(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, m), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), IGtQ(p, C0), NeQ(Plus(m, Times(C2, n, p), C1), C0)))),
          IIntegrate(1364,
              Integrate(Times(Power(Times(d_DEFAULT, x_), m_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                      Times(b_DEFAULT, Power(x_, n_))), p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(d, Subtract(n, C1)),
                              Power(Times(d, x), Plus(m, Negate(
                                  n), C1)),
                              Plus(b, Times(C2, c,
                                  Power(x, n))),
                              Power(
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  Plus(p, C1)),
                              Power(Times(n, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          x),
                      Dist(
                          Times(
                              Power(d, n), Power(Times(n, Plus(p, C1),
                                  Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          Integrate(
                              Times(Power(Times(d, x), Subtract(m, n)),
                                  Plus(Times(b, Plus(m, Negate(n), C1)),
                                      Times(C2, c, Plus(m, Times(C2, n, Plus(p, C1)), C1),
                                          Power(x, n))),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(n, C0), ILtQ(p, CN1), GtQ(m, Subtract(n, C1)), LeQ(m,
                          Subtract(Times(C2, n), C1))))),
          IIntegrate(1365,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(d, Subtract(Times(C2, n), C1)),
                                  Power(Times(d, x), Plus(m, Times(CN1, C2, n), C1)),
                                  Plus(Times(C2, a), Times(b, Power(x, n))),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                  Power(Times(n, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))),
                                      CN1)),
                              x)),
                      Dist(
                          Times(Power(d, Times(C2, n)),
                              Power(Times(n, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          Integrate(Times(Power(Times(d, x), Subtract(m, Times(C2, n))),
                              Plus(Times(C2, a, Plus(m, Times(CN1, C2, n), C1)),
                                  Times(b, Plus(m, Times(n, Plus(Times(C2, p), C1)), C1),
                                      Power(x, n))),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  Plus(p, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), ILtQ(p, CN1), GtQ(m, Subtract(Times(C2, n), C1))))),
          IIntegrate(1366,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Times(d, x), Plus(m, C1)),
                                  Plus(Sqr(b), Times(CN1, C2, a, c), Times(b, c, Power(x, n))),
                                  Power(
                                      Plus(
                                          a, Times(b, Power(x, n)), Times(c,
                                              Power(x, Times(C2, n)))),
                                      Plus(p, C1)),
                                  Power(
                                      Times(a, d, n, Plus(p, C1),
                                          Subtract(Sqr(b), Times(C4, a, c))),
                                      CN1)),
                              x)),
                      Dist(Power(Times(a, n, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1),
                          Integrate(
                              Times(Power(Times(d, x), m),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                  Simp(Plus(Times(Sqr(b), Plus(m, Times(n, Plus(p, C1)), C1)),
                                      Times(CN1, C2, a, c, Plus(m, Times(C2, n, Plus(p, C1)), C1)),
                                      Times(b, c, Plus(m, Times(n, Plus(Times(C2, p), C3)), C1),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, m), x), EqQ($s("n2"),
                      Times(C2, n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0),
                      ILtQ(p, CN1)))),
          IIntegrate(1367,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(d, Subtract(Times(C2, n), C1)),
                              Power(Times(d, x), Plus(m, Times(CN1, C2, n), C1)),
                              Power(
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  Plus(p, C1)),
                              Power(Times(c, Plus(m, Times(C2, n, p), C1)), CN1)),
                          x),
                      Dist(Times(
                          Power(d, Times(C2, n)),
                          Power(Times(c, Plus(m, Times(C2, n, p), C1)), CN1)),
                          Integrate(Times(
                              Power(Times(d, x), Subtract(m, Times(C2, n))),
                              Simp(Plus(Times(a, Plus(m, Times(CN1, C2, n), C1)),
                                  Times(b, Plus(m, Times(n, Subtract(p, C1)), C1), Power(x, n))),
                                  x),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, p), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0),
                      GtQ(m, Subtract(Times(C2, n),
                          C1)),
                      NeQ(Plus(m, Times(C2, n, p), C1), C0), IntegerQ(p)))),
          IIntegrate(1368,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_),
                      Power(
                          Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Power(Times(d, x), Plus(m,
                                  C1)),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  Plus(p, C1)),
                              Power(Times(a, d, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Power(Times(a, Power(d, n),
                              Plus(m, C1)), CN1),
                          Integrate(Times(Power(Times(d, x), Plus(m, n)),
                              Plus(Times(b, Plus(m, Times(n, Plus(p, C1)), C1)),
                                  Times(c, Plus(m, Times(C2, n, Plus(p, C1)), C1), Power(x, n))),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  p)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, p), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), LtQ(m,
                          CN1),
                      IntegerQ(p)))),
          IIntegrate(1369,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Times(d, x), Plus(m, C1)),
                              Power(Times(a, d, Plus(m, C1)), CN1)),
                          x),
                      Dist(Power(Times(a, Power(d, n)), CN1),
                          Integrate(
                              Times(Power(Times(d, x), Plus(m, n)), Plus(b, Times(c, Power(x, n))),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ($s("n2"),
                      Times(C2, n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0),
                      LtQ(m, CN1)))),
          IIntegrate(1370,
              Integrate(
                  Times(Power(x_, m_),
                      Power(
                          Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      PolynomialDivide(
                          Power(x, m), Plus(a, Times(b, Power(x, n)),
                              Times(c, Power(x, Times(C2, n)))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), IGtQ(m, Subtract(Times(C3, n), C1))))),
          IIntegrate(1371,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(d, Subtract(Times(C2, n), C1)),
                              Power(Times(d, x), Plus(m, Times(CN1, C2, n), C1)), Power(
                                  Times(c, Plus(m, Times(CN1, C2, n), C1)), CN1)),
                          x),
                      Dist(Times(Power(d, Times(C2, n)), Power(c, CN1)),
                          Integrate(
                              Times(Power(Times(d, x), Subtract(m, Times(C2, n))),
                                  Plus(a, Times(b, Power(x, n))),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), GtQ(m,
                          Subtract(Times(C2, n), C1))))),
          IIntegrate(1372,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          CN1)),
                  x_Symbol),
              Condition(With(List(Set(q, Rt(Times(a, Power(c, CN1)), C2))),
                  With(List(Set(r, Rt(Subtract(Times(C2, q), Times(b, Power(c, CN1))), C2))),
                      Plus(
                          Negate(
                              Dist(Power(Times(C2, c, r), CN1),
                                  Integrate(Times(Power(x, Subtract(m, Times(C3, C1D2, n))),
                                      Subtract(q, Times(r, Power(x, Times(C1D2, n)))),
                                      Power(Plus(q, Times(CN1, r, Power(x, Times(C1D2, n))),
                                          Power(x, n)), CN1)),
                                      x),
                                  x)),
                          Dist(Power(Times(C2, c, r), CN1),
                              Integrate(Times(Power(x, Subtract(m, Times(C3, C1D2, n))),
                                  Plus(q, Times(r, Power(x, Times(C1D2, n)))),
                                  Power(Plus(q, Times(r, Power(x, Times(C1D2, n))), Power(x, n)),
                                      CN1)),
                                  x),
                              x)))),
                  And(FreeQ(List(a, b, c), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(Times(C1D2, n), C0), IGtQ(m, C0), GeQ(m, Times(C1D2, C3, n)), LtQ(m,
                          Times(C2, n)),
                      NegQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(1373,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          CN1)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(q,
                          Rt(Times(a, Power(c, CN1)), C2))),
                      With(List(Set(r, Rt(Subtract(Times(C2, q), Times(b, Power(c, CN1))), C2))),
                          Subtract(
                              Dist(
                                  Power(Times(C2, c, r), CN1),
                                  Integrate(
                                      Times(Power(x, Subtract(m, Times(C1D2, n))),
                                          Power(Plus(q, Times(CN1, r, Power(x, Times(C1D2, n))),
                                              Power(x, n)), CN1)),
                                      x),
                                  x),
                              Dist(Power(Times(C2, c, r), CN1),
                                  Integrate(
                                      Times(Power(x, Subtract(m, Times(C1D2, n))),
                                          Power(Plus(q, Times(r, Power(x, Times(C1D2, n))),
                                              Power(x, n)), CN1)),
                                      x),
                                  x)))),
                  And(FreeQ(List(a, b, c), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(Times(C1D2, n), C0), IGtQ(m, C0), GeQ(m, Times(C1D2, n)), LtQ(m, Times(
                          C1D2, C3, n)),
                      NegQ(Subtract(Sqr(b), Times(C4, a, c)))))),
          IIntegrate(1374,
              Integrate(
                  Times(Power(Times(d_DEFAULT, x_), m_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Subtract(
                          Dist(
                              Times(C1D2, Power(d, n), Plus(Times(b, Power(q, CN1)), C1)),
                              Integrate(Times(Power(Times(d, x), Subtract(m, n)),
                                  Power(Plus(Times(C1D2, b), Times(C1D2, q), Times(c, Power(x, n))),
                                      CN1)),
                                  x),
                              x),
                          Dist(Times(C1D2, Power(d, n), Subtract(Times(b, Power(q, CN1)), C1)),
                              Integrate(
                                  Times(Power(Times(d, x), Subtract(m, n)),
                                      Power(Plus(Times(C1D2, b), Times(CN1, C1D2, q),
                                          Times(c, Power(x, n))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), EqQ($s("n2"), Times(C2, n)), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), IGtQ(n,
                          C0),
                      GeQ(m, n)))),
          IIntegrate(1375,
              Integrate(
                  Times(Power(Times(d_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), CN1)),
                  x_Symbol),
              Condition(
                  With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Subtract(Dist(Times(c, Power(q, CN1)), Integrate(Times(Power(Times(d, x), m),
                          Power(Plus(Times(C1D2, b), Times(CN1, C1D2, q), Times(c, Power(x, n))),
                              CN1)),
                          x), x), Dist(
                              Times(c, Power(q, CN1)),
                              Integrate(Times(Power(Times(d, x), m),
                                  Power(Plus(Times(C1D2, b), Times(C1D2, q), Times(c, Power(x, n))),
                                      CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, m), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IGtQ(n, C0)))),
          IIntegrate(1376,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Power(Power(x, n), CN1)),
                                      Times(c, Power(Power(x, Times(C2, n)), CN1))), p),
                                  Power(Power(x, Plus(m, C2)), CN1)),
                              x),
                          x, Power(x, CN1))),
                  And(FreeQ(List(a, b, c, p), x), EqQ($s("n2"), Times(C2, n)), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), ILtQ(n,
                          C0),
                      IntegerQ(m)))),
          IIntegrate(1377,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(k,
                          Denominator(m))),
                      Negate(
                          Dist(
                              Times(k, Power(d,
                                  CN1)),
                              Subst(
                                  Integrate(
                                      Times(Power(Plus(a,
                                          Times(b,
                                              Power(Times(Power(d, n), Power(x, Times(k, n))),
                                                  CN1)),
                                          Times(c,
                                              Power(Times(Power(d, Times(C2, n)),
                                                  Power(x, Times(C2, k, n))), CN1))),
                                          p),
                                          Power(Power(x, Plus(Times(k, Plus(m, C1)), C1)), CN1)),
                                      x),
                                  x, Power(Power(Times(d, x), Power(k, CN1)), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d, p), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      ILtQ(n, C0), FractionQ(m)))),
          IIntegrate(1378,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT,
                          x_), m_),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(
                              Power(d, IntPart(m)), Power(Times(d, x), FracPart(m)),
                              Power(Power(x, CN1), FracPart(m))),
                          Subst(Integrate(Times(
                              Power(Plus(a, Times(b, Power(Power(x, n), CN1)),
                                  Times(c, Power(Power(x, Times(C2, n)), CN1))), p),
                              Power(Power(x, Plus(m, C2)), CN1)), x), x, Power(x, CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, m, p), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      ILtQ(n, C0), Not(RationalQ(m))))),
          IIntegrate(1379,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(With(List(Set(k, Denominator(n))),
                  Dist(k, Subst(
                      Integrate(Times(Power(x, Subtract(Times(k, Plus(m, C1)), C1)),
                          Power(Plus(a, Times(b, Power(x, Times(k, n))),
                              Times(c, Power(x, Times(C2, k, n)))), p)),
                          x),
                      x, Power(x, Power(k, CN1))), x)),
                  And(FreeQ(List(a, b, c, m, p), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      FractionQ(n)))),
          IIntegrate(1380,
              Integrate(
                  Times(
                      Power(Times(d_,
                          x_), m_),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(d, IntPart(m)), Power(Times(d, x), FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(Power(x, m), Power(
                              Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, m, p), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), FractionQ(n)))));
}
