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
class IntRules77 {
  public static IAST RULES =
      List(
          IIntegrate(1541,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandIntegrand(Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p),
                          Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, q), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      IGtQ(q, C0)))),
          IIntegrate(1542,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Negate(
                      Subst(
                          Integrate(
                              Times(Power(Plus(d, Times(e, Power(Power(x, n), CN1))), q),
                                  Power(Plus(a, Times(b, Power(Power(x, n), CN1)),
                                      Times(c, Power(Power(x, Times(C2, n)), CN1))), p),
                                  Power(Power(x, Plus(m, C2)), CN1)),
                              x),
                          x, Power(x, CN1))),
                  And(FreeQ(List(a, b, c, d, e, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      ILtQ(n, C0), IntegerQ(m)))),
          IIntegrate(1543,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Negate(
                      Subst(
                          Integrate(
                              Times(Power(Plus(d, Times(e, Power(Power(x, n), CN1))), q),
                                  Power(Plus(a, Times(c, Power(Power(x, Times(C2, n)), CN1))), p),
                                  Power(Power(x, Plus(m, C2)), CN1)),
                              x),
                          x, Power(x, CN1))),
                  And(FreeQ(List(a, c, d, e, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), ILtQ(n,
                          C0),
                      IntegerQ(m)))),
          IIntegrate(1544,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(List(Set(g, Denominator(m))),
                      Negate(
                          Dist(
                              Times(g, Power(f,
                                  CN1)),
                              Subst(
                                  Integrate(
                                      Times(
                                          Power(
                                              Plus(d,
                                                  Times(e,
                                                      Power(
                                                          Times(Power(f, n), Power(x, Times(g, n))),
                                                          CN1))),
                                              q),
                                          Power(Plus(a,
                                              Times(b,
                                                  Power(Times(Power(f, n), Power(x, Times(g, n))),
                                                      CN1)),
                                              Times(c,
                                                  Power(Times(Power(f, Times(C2, n)),
                                                      Power(x, Times(C2, g, n))), CN1))),
                                              p),
                                          Power(Power(x, Plus(Times(g, Plus(m, C1)), C1)), CN1)),
                                      x),
                                  x, Power(Power(Times(f, x), Power(g, CN1)), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      ILtQ(n, C0), FractionQ(m)))),
          IIntegrate(1545,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(g,
                          Denominator(m))),
                      Negate(
                          Dist(
                              Times(g, Power(f,
                                  CN1)),
                              Subst(
                                  Integrate(Times(
                                      Power(
                                          Plus(
                                              d,
                                              Times(e,
                                                  Power(Times(Power(f, n), Power(x, Times(g, n))),
                                                      CN1))),
                                          q),
                                      Power(Plus(a,
                                          Times(c,
                                              Power(Times(Power(f, Times(C2, n)),
                                                  Power(x, Times(C2, g, n))), CN1))),
                                          p),
                                      Power(Power(x, Plus(Times(g, Plus(m, C1)), C1)), CN1)), x),
                                  x, Power(Power(Times(f, x), Power(g, CN1)), CN1)),
                              x))),
                  And(FreeQ(List(a, c, d, e, f, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), ILtQ(n,
                          C0),
                      FractionQ(m)))),
          IIntegrate(1546,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(Negate(
                  Dist(
                      Times(
                          Power(f, IntPart(m)), Power(Times(f, x),
                              FracPart(m)),
                          Power(Power(x, CN1), FracPart(m))),
                      Subst(Integrate(Times(Power(Plus(d, Times(e, Power(Power(x, n), CN1))), q),
                          Power(Plus(a, Times(b, Power(Power(x, n), CN1)),
                              Times(c, Power(Power(x, Times(C2, n)), CN1))), p),
                          Power(Power(x, Plus(m, C2)), CN1)), x), x, Power(x, CN1)),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      ILtQ(n, C0), Not(RationalQ(m))))),
          IIntegrate(1547,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_), Power(Plus(
                          d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(
                              Power(f, IntPart(m)), Power(Times(f,
                                  x), FracPart(m)),
                              Power(Power(x, CN1), FracPart(m))),
                          Subst(
                              Integrate(
                                  Times(Power(Plus(d, Times(e, Power(Power(x, n), CN1))), q),
                                      Power(Plus(a, Times(c, Power(Power(x, Times(C2, n)), CN1))),
                                          p),
                                      Power(Power(x, Plus(m, C2)), CN1)),
                                  x),
                              x, Power(x, CN1)),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, m, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), ILtQ(n,
                          C0),
                      Not(RationalQ(m))))),
          IIntegrate(1548,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(With(List(Set(g, Denominator(n))),
                  Dist(g,
                      Subst(
                          Integrate(Times(Power(x, Subtract(Times(g, Plus(m, C1)), C1)),
                              Power(Plus(d, Times(e, Power(x, Times(g, n)))), q),
                              Power(Plus(a, Times(b, Power(x, Times(g, n))),
                                  Times(c, Power(x, Times(C2, g, n)))), p)),
                              x),
                          x, Power(x, Power(g, CN1))),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, m, p, q), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), FractionQ(n)))),
          IIntegrate(1549,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_), Power(Plus(
                          d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set(g,
                          Denominator(n))),
                      Dist(g,
                          Subst(
                              Integrate(
                                  Times(Power(x, Subtract(Times(g, Plus(m, C1)), C1)),
                                      Power(Plus(d, Times(e, Power(x, Times(g, n)))), q),
                                      Power(Plus(a, Times(c, Power(x, Times(C2, g, n)))), p)),
                                  x),
                              x, Power(x, Power(g, CN1))),
                          x)),
                  And(FreeQ(List(a, c, d, e, m, p, q), x), EqQ($s("n2"), Times(C2, n)),
                      FractionQ(n)))),
          IIntegrate(1550,
              Integrate(
                  Times(
                      Power(Times(f_,
                          x_), m_),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(f, IntPart(m)), Power(Times(f, x),
                              FracPart(m)),
                          Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(Power(x, m), Power(Plus(d, Times(e, Power(x, n))), q),
                              Power(
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      FractionQ(n)))),
          IIntegrate(1551,
              Integrate(
                  Times(Power(Times(f_, x_), m_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_), Power(Plus(
                          d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(f, IntPart(m)), Power(Times(f, x),
                          FracPart(m)), Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(Power(x, m), Power(Plus(d, Times(e, Power(x, n))), q),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, p,
                      q), x), EqQ($s("n2"),
                          Times(C2, n)),
                      FractionQ(n)))),
          IIntegrate(1552,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                                  Power(x_, n_))),
                          p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Plus(m,
                          C1), CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(
                                      Plus(d,
                                          Times(e,
                                              Power(x,
                                                  Simplify(Times(n, Power(Plus(m, C1), CN1)))))),
                                      q),
                                  Power(
                                      Plus(a,
                                          Times(b,
                                              Power(x,
                                                  Simplify(Times(n, Power(Plus(m, C1), CN1))))),
                                          Times(c,
                                              Power(x,
                                                  Simplify(
                                                      Times(C2, n, Power(Plus(m, C1), CN1)))))),
                                      p)),
                              x),
                          x, Power(x, Plus(m, C1))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p, q), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(Simplify(
                          Times(n, Power(Plus(m, C1), CN1)))),
                      Not(IntegerQ(n))))),
          IIntegrate(1553,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Plus(m,
                          C1), CN1),
                      Subst(
                          Integrate(
                              Times(
                                  Power(
                                      Plus(d,
                                          Times(e,
                                              Power(x,
                                                  Simplify(Times(n, Power(Plus(m, C1), CN1)))))),
                                      q),
                                  Power(
                                      Plus(a, Times(c,
                                          Power(x,
                                              Simplify(Times(C2, n, Power(Plus(m, C1), CN1)))))),
                                      p)),
                              x),
                          x, Power(x, Plus(m, C1))),
                      x),
                  And(FreeQ(List(a, c, d, e, m, n, p, q), x), EqQ($s("n2"), Times(C2, n)), IntegerQ(
                      Simplify(Times(n, Power(Plus(m, C1), CN1)))), Not(IntegerQ(n))))),
          IIntegrate(1554,
              Integrate(
                  Times(
                      Power(Times(f_,
                          x_), m_),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(f, IntPart(m)), Power(Times(f, x),
                          FracPart(m)), Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(Power(x, m), Power(Plus(d, Times(e, Power(x, n))), q),
                              Power(
                                  Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, p, q), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(Simplify(
                          Times(n, Power(Plus(m, C1), CN1)))),
                      Not(IntegerQ(n))))),
          IIntegrate(1555,
              Integrate(Times(Power(Times(f_, x_), m_),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_), Power(
                      Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(f, IntPart(m)), Power(Times(f, x),
                          FracPart(m)), Power(Power(x, FracPart(m)), CN1)),
                      Integrate(
                          Times(
                              Power(x, m), Power(Plus(d, Times(e, Power(x, n))), q), Power(
                                  Plus(a, Times(c, Power(x, Times(C2, n)))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), IntegerQ(Simplify(Times(n, Power(Plus(m, C1), CN1)))), Not(
                          IntegerQ(n))))),
          IIntegrate(1556,
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
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  With(List(Set(r, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Subtract(
                          Dist(Times(C2, c, Power(r, CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), m),
                                      Power(Plus(d, Times(e, Power(x, n))), q),
                                      Power(Plus(b, Negate(r), Times(C2, c, Power(x, n))), CN1)),
                                  x),
                              x),
                          Dist(
                              Times(C2, c, Power(r,
                                  CN1)),
                              Integrate(
                                  Times(Power(Times(f, x), m),
                                      Power(Plus(d, Times(e, Power(x, n))), q), Power(Plus(b, r,
                                          Times(C2, c, Power(x, n))), CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, q), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0)))),
          IIntegrate(1557,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_,
                          Times(c_DEFAULT, Power(x_, $p("n2", true)))), CN1),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  With(List(Set(r, Rt(Times(CN1, a, c), C2))),
                      Subtract(
                          Negate(Dist(Times(c, Power(Times(C2, r), CN1)),
                              Integrate(Times(Power(Times(f, x), m),
                                  Power(Plus(d, Times(e, Power(x, n))), q),
                                  Power(Subtract(r, Times(c, Power(x, n))), CN1)), x),
                              x)),
                          Dist(Times(c, Power(Times(C2, r), CN1)),
                              Integrate(Times(Power(Times(f, x), m),
                                  Power(Plus(d, Times(e, Power(x, n))), q),
                                  Power(Plus(r, Times(c, Power(x, n))), CN1)), x),
                              x))),
                  And(FreeQ(List(a, c, d, e, f, m, n, q), x), EqQ($s("n2"), Times(C2, n))))),
          IIntegrate(1558,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(
                                      Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))),
                                      Plus(p, C1)),
                                  Plus(
                                      Times(d, Subtract(Sqr(b),
                                          Times(C2, a, c))),
                                      Times(CN1, a, b, e),
                                      Times(Subtract(Times(b, d), Times(C2, a, e)), c,
                                          Power(x, n))),
                                  Power(Times(a, f, n, Plus(p, C1),
                                      Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                              x)),
                      Dist(
                          Power(Times(a, n, Plus(p, C1),
                              Subtract(Sqr(b), Times(C4, a, c))), CN1),
                          Integrate(
                              Times(
                                  Power(Times(f,
                                      x), m),
                                  Power(
                                      Plus(
                                          a, Times(b, Power(x, n)), Times(c,
                                              Power(x, Times(C2, n)))),
                                      Plus(p, C1)),
                                  Simp(Plus(
                                      Times(d,
                                          Subtract(
                                              Times(Sqr(b), Plus(m, Times(n, Plus(p, C1)), C1)),
                                              Times(C2, a, c,
                                                  Plus(m, Times(C2, n, Plus(p, C1)), C1)))),
                                      Times(CN1, a, b, e, Plus(m, C1)),
                                      Times(
                                          Plus(m, Times(n, Plus(Times(C2, p), C3)), C1),
                                          Subtract(Times(b, d), Times(C2, a, e)), c, Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), EqQ($s("n2"), Times(C2, n)), NeQ(
                      Subtract(Sqr(b), Times(C4, a, c)), C0), ILtQ(Plus(p, C1), C0)))),
          IIntegrate(1559,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Times(f, x), Plus(m, C1)),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                  Plus(d, Times(e, Power(x, n))), Power(
                                      Times(C2, a, f, n, Plus(p, C1)), CN1)),
                              x)),
                      Dist(
                          Power(Times(C2, a, n,
                              Plus(p, C1)), CN1),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                  Simp(
                                      Plus(Times(d, Plus(m, Times(C2, n, Plus(p, C1)), C1)),
                                          Times(e, Plus(m, Times(n, Plus(Times(C2, p), C3)), C1),
                                              Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, m, n), x), EqQ($s("n2"), Times(C2,
                      n)), ILtQ(Plus(p, C1),
                          C0)))),
          IIntegrate(1560,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(
                      Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))), q),
                          Power(Plus(a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                              p)),
                      x), x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p, q), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Or(IGtQ(p, C0), IGtQ(q, C0))))));
}
