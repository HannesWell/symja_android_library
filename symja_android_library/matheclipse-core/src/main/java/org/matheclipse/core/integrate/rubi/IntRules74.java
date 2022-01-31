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
class IntRules74 {
  public static IAST RULES =
      List(
          IIntegrate(1481,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))), q_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(Plus(a, Times(c, Power(x, Times(C2, n)))), FracPart(p)),
                          Power(
                              Times(Power(Plus(d, Times(e, Power(x, n))), FracPart(p)),
                                  Power(Plus(Times(a, Power(d, CN1)),
                                      Times(c, Power(x, n), Power(e, CN1))), FracPart(p))),
                              CN1)),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e, Power(x, n))), Plus(q, p)),
                              Power(Plus(Times(a, Power(d, CN1)),
                                  Times(c, Power(x, n), Power(e, CN1))), p)),
                          x),
                      x),
                  And(FreeQ(List(a, c, d, e, f, m, n, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                          C0),
                      Not(IntegerQ(p))))),
          IIntegrate(1482,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(
                          Plus(
                              a_, Times(c_DEFAULT, Power(x_,
                                  $p("n2", true))),
                              Times(b_DEFAULT, Power(x_, n_))),
                          p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(
                                  Negate(d), Subtract(Times(Subtract(m, Mod(m, n)), Power(n, CN1)),
                                      C1)),
                              Power(
                                  Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), p),
                              Power(x, Plus(Mod(m, n), C1)),
                              Power(Plus(d, Times(e, Power(x, n))), Plus(q,
                                  C1)),
                              Power(
                                  Times(n,
                                      Power(e,
                                          Plus(Times(C2, p),
                                              Times(Subtract(m, Mod(m, n)), Power(n, CN1)))),
                                      Plus(q, C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(n,
                                  Power(e,
                                      Plus(Times(C2, p),
                                          Times(Subtract(m, Mod(m, n)), Power(n, CN1)))),
                                  Plus(q, C1)),
                              CN1),
                          Integrate(
                              Times(Power(x, Mod(m, n)),
                                  Power(Plus(d, Times(e,
                                      Power(x, n))), Plus(q,
                                          C1)),
                                  ExpandToSum(
                                      Together(
                                          Times(C1,
                                              Subtract(
                                                  Times(n,
                                                      Power(e,
                                                          Plus(Times(C2, p),
                                                              Times(
                                                                  Subtract(m, Mod(m, n)), Power(n,
                                                                      CN1)))),
                                                      Plus(q, C1), Power(x, Subtract(m, Mod(m, n))),
                                                      Power(Plus(a, Times(b, Power(x, n)),
                                                          Times(c, Power(x, Times(C2, n)))), p)),
                                                  Times(
                                                      Power(Negate(d),
                                                          Subtract(Times(Subtract(m, Mod(m, n)),
                                                              Power(n, CN1)), C1)),
                                                      Power(Plus(Times(c, Sqr(d)),
                                                          Times(CN1, b, d, e), Times(a, Sqr(e))),
                                                          p),
                                                      Plus(Times(d, Plus(Mod(m, n), C1)),
                                                          Times(e,
                                                              Plus(Mod(m, n), Times(n, Plus(q, C1)),
                                                                  C1),
                                                              Power(x, n))))),
                                              Power(Plus(d, Times(e, Power(x, n))), CN1))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), IGtQ(p, C0), ILtQ(q, CN1), IGtQ(m, C0)))),
          IIntegrate(1483,
              Integrate(Times(Power(x_, m_DEFAULT),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT), Power(
                      Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(
                          Power(Negate(d), Subtract(Times(Subtract(m, Mod(m, n)), Power(n, CN1)),
                              C1)),
                          Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), p),
                          Power(x, Plus(Mod(m, n), C1)),
                          Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                          Power(Times(n,
                              Power(e, Plus(Times(C2, p), Times(
                                  Subtract(m, Mod(m, n)), Power(n, CN1)))),
                              Plus(q, C1)), CN1)),
                          x),
                      Dist(
                          Power(
                              Times(n,
                                  Power(e,
                                      Plus(Times(C2, p),
                                          Times(Subtract(m, Mod(m, n)), Power(n, CN1)))),
                                  Plus(q, C1)),
                              CN1),
                          Integrate(
                              Times(Power(x, Mod(m, n)),
                                  Power(Plus(d, Times(e,
                                      Power(x, n))), Plus(q,
                                          C1)),
                                  ExpandToSum(
                                      Together(Times(C1, Subtract(
                                          Times(n,
                                              Power(e,
                                                  Plus(Times(C2, p),
                                                      Times(Subtract(m, Mod(m, n)),
                                                          Power(n, CN1)))),
                                              Plus(q, C1), Power(x, Subtract(m, Mod(m, n))),
                                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p)),
                                          Times(Power(Negate(d),
                                              Subtract(Times(Subtract(m, Mod(m, n)), Power(n, CN1)),
                                                  C1)),
                                              Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), p),
                                              Plus(Times(d, Plus(Mod(m, n), C1)),
                                                  Times(e,
                                                      Plus(Mod(m, n), Times(n, Plus(q, C1)), C1),
                                                      Power(x, n))))),
                                          Power(Plus(d, Times(e, Power(x, n))), CN1))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      IGtQ(p, C0), ILtQ(q, CN1), IGtQ(m, C0)))),
          IIntegrate(1484,
              Integrate(
                  Times(Power(x_, m_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(
                          Power(Negate(d),
                              Subtract(Times(Subtract(m, Mod(m, n)), Power(n, CN1)), C1)),
                          Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), p),
                          Power(x, Plus(Mod(m, n), C1)),
                          Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                          Power(Times(n,
                              Power(e,
                                  Plus(Times(C2, p), Times(Subtract(m, Mod(m, n)), Power(n, CN1)))),
                              Plus(q, C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Power(Negate(d),
                                  Subtract(Times(Subtract(m, Mod(m, n)), Power(n, CN1)), C1)),
                              Power(Times(n, Power(e, Times(C2, p)), Plus(q, C1)), CN1)),
                          Integrate(
                              Times(Power(x, m), Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                                  ExpandToSum(
                                      Together(
                                          Times(C1,
                                              Subtract(
                                                  Times(n,
                                                      Power(Negate(d),
                                                          Plus(
                                                              Times(
                                                                  CN1, Subtract(m, Mod(m, n)),
                                                                  Power(n, CN1)),
                                                              C1)),
                                                      Power(e, Times(C2, p)), Plus(q, C1),
                                                      Power(
                                                          Plus(a, Times(b, Power(x, n)), Times(c,
                                                              Power(x, Times(C2, n)))),
                                                          p)),
                                                  Times(
                                                      Power(
                                                          Plus(
                                                              Times(c, Sqr(d)), Times(CN1, b, d, e),
                                                              Times(a, Sqr(e))),
                                                          p),
                                                      Power(
                                                          Times(
                                                              Power(e,
                                                                  Times(Subtract(m, Mod(m, n)),
                                                                      Power(n, CN1))),
                                                              Power(x, Subtract(m, Mod(m, n)))),
                                                          CN1),
                                                      Plus(Times(d, Plus(Mod(m, n), C1)),
                                                          Times(e,
                                                              Plus(Mod(m, n), Times(n, Plus(q, C1)),
                                                                  C1),
                                                              Power(x, n))))),
                                              Power(Plus(d, Times(e, Power(x, n))), CN1))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), IGtQ(p, C0),
                      ILtQ(q, CN1), ILtQ(m, C0)))),
          IIntegrate(1485,
              Integrate(Times(Power(x_, m_),
                  Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_DEFAULT),
                  Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_)), x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Power(Negate(d),
                                  Subtract(Times(Subtract(m, Mod(m, n)), Power(n, CN1)), C1)),
                              Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(
                                  e))), p),
                              Power(x, Plus(Mod(m, n), C1)),
                              Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                              Power(Times(n,
                                  Power(e,
                                      Plus(Times(C2, p),
                                          Times(Subtract(m, Mod(m, n)), Power(n, CN1)))),
                                  Plus(q, C1)), CN1)),
                          x),
                      Dist(
                          Times(
                              Power(
                                  Negate(d), Subtract(Times(Subtract(m, Mod(m, n)), Power(n, CN1)),
                                      C1)),
                              Power(Times(n, Power(e, Times(C2, p)), Plus(q, C1)), CN1)),
                          Integrate(
                              Times(
                                  Power(x, m), Power(Plus(d, Times(e,
                                      Power(x, n))), Plus(q,
                                          C1)),
                                  ExpandToSum(
                                      Together(
                                          Times(C1,
                                              Subtract(Times(n,
                                                  Power(Negate(d),
                                                      Plus(Times(CN1, Subtract(m, Mod(m, n)),
                                                          Power(n, CN1)), C1)),
                                                  Power(e, Times(C2,
                                                      p)),
                                                  Plus(q, C1),
                                                  Power(
                                                      Plus(a, Times(c,
                                                          Power(x, Times(C2, n)))),
                                                      p)),
                                                  Times(Power(
                                                      Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), p),
                                                      Power(
                                                          Times(
                                                              Power(e,
                                                                  Times(Subtract(m, Mod(m, n)),
                                                                      Power(n, CN1))),
                                                              Power(x, Subtract(m, Mod(m, n)))),
                                                          CN1),
                                                      Plus(Times(d, Plus(Mod(m, n), C1)),
                                                          Times(e,
                                                              Plus(Mod(m, n), Times(n, Plus(q, C1)),
                                                                  C1),
                                                              Power(x, n))))),
                                              Power(Plus(d, Times(e, Power(x, n))), CN1))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      IGtQ(p, C0), IntegersQ(m, q), ILtQ(q, CN1), ILtQ(m, C0)))),
          IIntegrate(1486,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(
                          a_, Times(c_DEFAULT, Power(x_, $p("n2", true))),
                          Times(b_DEFAULT, Power(x_, n_))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(c, p),
                              Power(Times(f, x), Plus(m, Times(C2, n, p), Negate(n), C1)),
                              Power(Plus(d, Times(e, Power(x, n))), Plus(q, C1)),
                              Power(
                                  Times(e, Power(f, Plus(Times(C2, n, p), Negate(n), C1)),
                                      Plus(m, Times(C2, n, p), Times(n, q), C1)),
                                  CN1)),
                          x),
                      Dist(
                          Power(Times(e,
                              Plus(m, Times(C2, n, p), Times(n, q), C1)), CN1),
                          Integrate(Times(Power(Times(f, x), m),
                              Power(Plus(d, Times(e, Power(x, n))), q),
                              ExpandToSum(Subtract(
                                  Times(e, Plus(m, Times(C2, n, p), Times(n, q), C1),
                                      Subtract(
                                          Power(
                                              Plus(a, Times(b, Power(x, n)), Times(c,
                                                  Power(x, Times(C2, n)))),
                                              p),
                                          Times(Power(c, p), Power(x, Times(C2, n, p))))),
                                  Times(d, Power(c, p), Plus(m, Times(C2, n, p), Negate(n), C1),
                                      Power(x, Subtract(Times(C2, n, p), n)))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, q), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a,
                          c)), C0),
                      IGtQ(n, C0), IGtQ(p, C0), GtQ(Times(C2, n, p), Subtract(n, C1)), Not(IntegerQ(
                          q)),
                      NeQ(Plus(m, Times(C2, n, p), Times(n, q), C1), C0)))),
          IIntegrate(1487,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(c, p),
                              Power(Times(f, x), Plus(m, Times(C2, n, p), Negate(n), C1)),
                              Power(Plus(d, Times(e, Power(x, n))), Plus(q,
                                  C1)),
                              Power(
                                  Times(
                                      e, Power(f, Plus(Times(C2, n, p), Negate(n),
                                          C1)),
                                      Plus(m, Times(C2, n, p), Times(n, q), C1)),
                                  CN1)),
                          x),
                      Dist(Power(Times(e, Plus(m, Times(C2, n, p), Times(n, q), C1)), CN1),
                          Integrate(
                              Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))), q),
                                  ExpandToSum(
                                      Subtract(
                                          Times(e, Plus(m, Times(C2, n, p), Times(n, q), C1),
                                              Subtract(
                                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))),
                                                      p),
                                                  Times(Power(c, p), Power(x, Times(C2, n, p))))),
                                          Times(d, Power(c, p),
                                              Plus(m, Times(C2, n, p), Negate(n), C1),
                                              Power(x, Subtract(Times(C2, n, p), n)))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, m, q), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      IGtQ(p, C0), GtQ(Times(C2, n, p), Subtract(n, C1)), Not(IntegerQ(
                          q)),
                      NeQ(Plus(m, Times(C2, n, p), Times(n, q), C1), C0)))),
          IIntegrate(1488,
              Integrate(
                  Times(
                      Power(Times(f_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true))), Times(b_DEFAULT,
                              Power(x_, n_))),
                          p_DEFAULT),
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
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, q), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      IGtQ(p, C0)))),
          IIntegrate(1489,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandIntegrand(
                      Times(Power(Times(f, x), m), Power(Plus(d, Times(e, Power(x, n))), q),
                          Power(Plus(a, Times(c, Power(x, Times(C2, n)))), p)),
                      x), x),
                  And(FreeQ(List(a, c, d, e, f, m, q), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      IGtQ(p, C0)))),
          IIntegrate(1490,
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
                  With(
                      List(Set(k,
                          GCD(Plus(m, C1), n))),
                      Condition(Dist(Power(k, CN1), Subst(
                          Integrate(Times(Power(x, Subtract(Times(Plus(m, C1), Power(k, CN1)), C1)),
                              Power(Plus(d, Times(e, Power(x, Times(n, Power(k, CN1))))), q),
                              Power(Plus(a, Times(b, Power(x, Times(n, Power(k, CN1)))),
                                  Times(c, Power(x, Times(C2, n, Power(k, CN1))))), p)),
                              x),
                          x, Power(x, k)), x), Unequal(k,
                              C1))),
                  And(FreeQ(List(a, b, c, d, e, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IGtQ(n, C0), IntegerQ(m)))),
          IIntegrate(1491,
              Integrate(
                  Times(Power(x_, m_DEFAULT),
                      Power(Plus(a_, Times(c_DEFAULT,
                          Power(x_, $p("n2", true)))), p_),
                      Power(Plus(d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(List(Set(k, GCD(Plus(m, C1), n))),
                      Condition(
                          Dist(Power(k, CN1),
                              Subst(Integrate(Times(
                                  Power(x, Subtract(Times(Plus(m, C1), Power(k, CN1)), C1)),
                                  Power(Plus(d, Times(e, Power(x, Times(n, Power(k, CN1))))), q),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n, Power(k, CN1))))),
                                      p)),
                                  x), x, Power(x, k)),
                              x),
                          Unequal(k, C1))),
                  And(FreeQ(List(a, c, d, e, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      IntegerQ(m)))),
          IIntegrate(1492,
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
              Condition(
                  With(
                      List(Set(k,
                          Denominator(m))),
                      Dist(Times(k, Power(f, CN1)), Subst(
                          Integrate(Times(Power(x, Subtract(Times(k, Plus(m, C1)), C1)), Power(
                              Plus(d, Times(e, Power(x, Times(k, n)), Power(Power(f, n), CN1))), q),
                              Power(
                                  Plus(a, Times(b, Power(x, Times(k, n)), Power(Power(f, n), CN1)),
                                      Times(c, Power(x, Times(C2, k, n)),
                                          Power(Power(f, Times(C2, n)), CN1))),
                                  p)),
                              x),
                          x, Power(Times(f, x), Power(k, CN1))), x)),
                  And(FreeQ(List(a, b, c, d, e, f, p, q), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b),
                          Times(C4, a, c)), C0),
                      IGtQ(n, C0), FractionQ(m), IntegerQ(p)))),
          IIntegrate(1493,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2", true)))), p_), Power(Plus(
                          d_, Times(e_DEFAULT, Power(x_, n_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(List(Set(k, Denominator(m))),
                      Dist(Times(k, Power(f, CN1)),
                          Subst(Integrate(Times(Power(x, Subtract(Times(k, Plus(m, C1)), C1)),
                              Power(Plus(d, Times(e, Power(x, Times(k, n)), Power(f, CN1))), q),
                              Power(Plus(a, Times(c, Power(x, Times(C2, k, n)), Power(f, CN1))),
                                  p)),
                              x), x, Power(Times(f, x), Power(k, CN1))),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, p, q), x), EqQ($s("n2"), Times(C2,
                      n)), IGtQ(n,
                          C0),
                      FractionQ(m), IntegerQ(p)))),
          IIntegrate(1494,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_)), Times(c_DEFAULT,
                              Power(x_, $p("n2")))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  p),
                              Plus(
                                  Times(d, Plus(m, Times(n, Plus(Times(C2, p), C1)),
                                      C1)),
                                  Times(e, Plus(m, C1), Power(x, n))),
                              Power(
                                  Times(
                                      f, Plus(m, C1), Plus(m, Times(n, Plus(Times(C2, p), C1)),
                                          C1)),
                                  CN1)),
                          x),
                      Dist(
                          Times(n, p,
                              Power(
                                  Times(
                                      Power(f, n), Plus(m, C1), Plus(m,
                                          Times(n, Plus(Times(C2, p), C1)), C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Plus(m, n)),
                                  Power(
                                      Plus(
                                          a, Times(b, Power(x, n)), Times(c,
                                              Power(x, Times(C2, n)))),
                                      Subtract(p, C1)),
                                  Simp(Plus(Times(C2, a, e, Plus(m, C1)),
                                      Times(CN1, b, d,
                                          Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)),
                                      Times(
                                          Subtract(Times(b, e, Plus(m, C1)),
                                              Times(C2, c, d,
                                                  Plus(m, Times(n, Plus(Times(C2, p), C1)), C1))),
                                          Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), GtQ(p, C0),
                      LtQ(m, CN1), NeQ(Plus(m, Times(n, Plus(Times(C2, p), C1)), C1),
                          C0),
                      IntegerQ(p)))),
          IIntegrate(1495,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(a,
                                  Times(c, Power(x, Times(C2, n)))), p),
                              Plus(
                                  Times(d, Plus(m, Times(n, Plus(Times(C2, p), C1)),
                                      C1)),
                                  Times(e, Plus(m, C1), Power(x, n))),
                              Power(Times(f, Plus(m, C1),
                                  Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)), CN1)),
                          x),
                      Dist(
                          Times(C2, n, p,
                              Power(Times(Power(f, n), Plus(m, C1),
                                  Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)), CN1)),
                          Integrate(Times(Power(Times(f, x), Plus(m, n)),
                              Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Subtract(p, C1)),
                              Subtract(Times(a, e, Plus(m, C1)),
                                  Times(c, d, Plus(m, Times(n, Plus(Times(C2, p), C1)), C1),
                                      Power(x, n)))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      GtQ(p, C0), LtQ(m, CN1), NeQ(Plus(m, Times(n, Plus(Times(C2, p), C1)),
                          C1), C0),
                      IntegerQ(p)))),
          IIntegrate(1496,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  p),
                              Plus(Times(b, e, n, p),
                                  Times(c, d, Plus(m, Times(n, Plus(Times(C2, p), C1)),
                                      C1)),
                                  Times(c, e, Plus(Times(C2, n, p), m, C1), Power(x, n))),
                              Power(
                                  Times(
                                      c, f, Plus(Times(C2, n,
                                          p), m, C1),
                                      Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)),
                                  CN1)),
                          x),
                      Dist(
                          Times(n, p,
                              Power(
                                  Times(
                                      c, Plus(Times(C2, n, p), m, C1), Plus(m,
                                          Times(n, Plus(Times(C2, p), C1)), C1)),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Times(f,
                                      x), m),
                                  Power(
                                      Plus(
                                          a, Times(b, Power(x,
                                              n)),
                                          Times(c, Power(x, Times(C2, n)))),
                                      Subtract(p, C1)),
                                  Simp(
                                      Plus(
                                          Times(
                                              C2, a, c, d, Plus(m, Times(n, Plus(Times(C2, p),
                                                  C1)), C1)),
                                          Times(CN1, a, b, e, Plus(m, C1)),
                                          Times(
                                              Subtract(
                                                  Plus(
                                                      Times(C2, a, c, e,
                                                          Plus(Times(C2, n, p), m, C1)),
                                                      Times(b, c, d,
                                                          Plus(m, Times(n, Plus(Times(C2, p), C1)),
                                                              C1))),
                                                  Times(Sqr(b), e, Plus(m, Times(n, p), C1))),
                                              Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), GtQ(p, C0),
                      NeQ(Plus(Times(C2, n,
                          p), m, C1), C0),
                      NeQ(Plus(m, Times(n, Plus(Times(C2, p), C1)), C1), C0), IntegerQ(p)))),
          IIntegrate(1497,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT, Power(x_, n_))), Power(Plus(a_,
                          Times(c_DEFAULT, Power(x_, $p("n2")))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(a,
                                  Times(c, Power(x, Times(C2, n)))), p),
                              Plus(
                                  Times(c, d, Plus(m, Times(n, Plus(Times(C2, p), C1)),
                                      C1)),
                                  Times(c, e, Plus(Times(C2, n, p), m, C1), Power(x, n))),
                              Power(
                                  Times(
                                      c, f, Plus(Times(C2, n, p), m, C1), Plus(m,
                                          Times(n, Plus(Times(C2, p), C1)), C1)),
                                  CN1)),
                          x),
                      Dist(
                          Times(C2, a, n, p,
                              Power(
                                  Times(
                                      Plus(Times(C2, n, p), m, C1), Plus(m,
                                          Times(n, Plus(Times(C2, p), C1)), C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(Times(f, x), m),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Subtract(p, C1)),
                                  Simp(
                                      Plus(Times(d, Plus(m, Times(n, Plus(Times(C2, p), C1)), C1)),
                                          Times(e, Plus(Times(C2, n, p), m, C1), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0),
                      GtQ(p, C0), NeQ(Plus(Times(C2, n,
                          p), m, C1), C0),
                      NeQ(Plus(m, Times(n, Plus(Times(C2, p), C1)), C1), C0), IntegerQ(p)))),
          IIntegrate(1498,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT, Power(x_, n_))),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Power(x_, n_)),
                              Times(c_DEFAULT, Power(x_, $p("n2")))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(f, Subtract(n, C1)),
                              Power(Times(f, x), Plus(m, Negate(n), C1)),
                              Power(
                                  Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))),
                                  Plus(p, C1)),
                              Subtract(
                                  Subtract(Times(b, d), Times(C2, a,
                                      e)),
                                  Times(Subtract(Times(b, e), Times(C2, c, d)), Power(x, n))),
                              Power(Times(n, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          x),
                      Dist(
                          Times(Power(f, n),
                              Power(Times(n, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(
                                      a, Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                      Plus(p, C1)),
                                  Simp(
                                      Plus(
                                          Times(Subtract(Subtract(n, m), C1),
                                              Subtract(Times(b, d), Times(C2, a, e))),
                                          Times(Plus(Times(C2, n, p), Times(C2, n), m, C1),
                                              Subtract(Times(b, e), Times(C2, c, d)), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), LtQ(p, CN1),
                      GtQ(m, Subtract(n, C1)), IntegerQ(p)))),
          IIntegrate(1499,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT,
                          Power(x_, n_))),
                      Power(Plus(a_, Times(c_DEFAULT, Power(x_, $p("n2")))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(Simp(
                      Times(Power(f, Subtract(n, C1)), Power(Times(f, x), Plus(m, Negate(n), C1)),
                          Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                          Subtract(Times(a, e), Times(c, d, Power(x, n))),
                          Power(Times(C2, a, c, n, Plus(p, C1)), CN1)),
                      x),
                      Dist(Times(Power(f, n), Power(Times(C2, a, c, n, Plus(p, C1)), CN1)),
                          Integrate(
                              Times(Power(Times(f, x), Subtract(m, n)),
                                  Power(Plus(a, Times(c, Power(x, Times(C2, n)))), Plus(p, C1)),
                                  Plus(Times(a, e, Subtract(Subtract(n, m), C1)),
                                      Times(c, d, Plus(Times(C2, n, p), Times(C2, n), m, C1),
                                          Power(x, n)))),
                              x),
                          x)),
                  And(FreeQ(List(a, c, d, e, f),
                      x), EqQ($s("n2"), Times(C2, n)), IGtQ(n, C0), LtQ(p, CN1),
                      GtQ(m, Subtract(n, C1)), IntegerQ(p)))),
          IIntegrate(1500,
              Integrate(
                  Times(Power(Times(f_DEFAULT, x_), m_DEFAULT),
                      Plus(d_, Times(e_DEFAULT, Power(x_, n_))),
                      Power(Plus(a_, Times(b_DEFAULT, Power(x_, n_)),
                          Times(c_DEFAULT, Power(x_, $p("n2")))), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Times(f, x), Plus(m, C1)), Power(Plus(a,
                                      Times(b, Power(x, n)), Times(c, Power(x, Times(C2, n)))),
                                      Plus(p, C1)),
                                  Plus(Times(d, Subtract(Sqr(b), Times(C2, a, c))),
                                      Times(CN1, a, b, e),
                                      Times(Subtract(Times(b, d), Times(C2, a, e)), c,
                                          Power(x, n))),
                                  Power(
                                      Times(a, f, n, Plus(p, C1),
                                          Subtract(Sqr(b), Times(C4, a, c))),
                                      CN1)),
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
                                  Simp(
                                      Plus(
                                          Times(d,
                                              Subtract(
                                                  Times(Sqr(b), Plus(m, Times(n, Plus(p, C1)), C1)),
                                                  Times(C2, a, c,
                                                      Plus(m, Times(C2, n, Plus(p, C1)), C1)))),
                                          Times(CN1, a, b, e, Plus(m, C1)),
                                          Times(c, Plus(m, Times(n, Plus(Times(C2, p), C3)), C1),
                                              Subtract(Times(b, d), Times(C2, a, e)), Power(x, n))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IGtQ(n, C0), LtQ(p, CN1),
                      IntegerQ(p)))));
}
