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
class IntRules224 {
  public static IAST RULES =
      List(
          IIntegrate(4481,
              Integrate(
                  Power(Sin(Times(Plus(a_DEFAULT, Times(Log(x_), b_DEFAULT)), d_DEFAULT)),
                      p_),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Sin(Times(d,
                              Plus(a, Times(b, Log(x))))), p),
                          Power(x, Times(CI, b, d,
                              p)),
                          Power(Power(
                              Subtract(C1,
                                  Times(Exp(Times(C2, CI, a, d)), Power(x, Times(C2, CI, b, d)))),
                              p), CN1)),
                      Integrate(
                          Times(
                              Power(
                                  Subtract(C1,
                                      Times(Exp(Times(C2, CI, a, d)),
                                          Power(x, Times(C2, CI, b, d)))),
                                  p),
                              Power(Power(x, Times(CI, b, d, p)), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, p), x), Not(IntegerQ(p))))),
          IIntegrate(4482,
              Integrate(
                  Power(Cos(Times(Plus(a_DEFAULT, Times(Log(x_), b_DEFAULT)), d_DEFAULT)),
                      p_),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Cos(Times(d,
                              Plus(a, Times(b, Log(x))))), p),
                          Power(x, Times(CI, b, d,
                              p)),
                          Power(
                              Power(
                                  Plus(C1,
                                      Times(Exp(Times(C2, CI, a, d)),
                                          Power(x, Times(C2, CI, b, d)))),
                                  p),
                              CN1)),
                      Integrate(
                          Times(
                              Power(
                                  Plus(C1,
                                      Times(Exp(Times(C2, CI, a, d)),
                                          Power(x, Times(C2, CI, b, d)))),
                                  p),
                              Power(Power(x, Times(CI, b, d, p)), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, p), x), Not(IntegerQ(p))))),
          IIntegrate(4483,
              Integrate(
                  Power(
                      Sin(Times(
                          Plus(
                              a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                  b_DEFAULT)),
                          d_DEFAULT)),
                      p_DEFAULT),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(x, Power(Times(n, Power(Times(c, Power(x, n)), Power(n, CN1))),
                          CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(x, Subtract(Power(n, CN1), C1)), Power(
                                      Sin(Times(d, Plus(a, Times(b, Log(x))))), p)),
                              x),
                          x, Times(c, Power(x, n))),
                      x),
                  And(FreeQ(List(a, b, c, d, n, p), x), Or(NeQ(c, C1), NeQ(n, C1))))),
          IIntegrate(4484,
              Integrate(
                  Power(
                      Cos(Times(
                          Plus(
                              a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                  b_DEFAULT)),
                          d_DEFAULT)),
                      p_DEFAULT),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(x, Power(Times(n, Power(Times(c, Power(x, n)), Power(n, CN1))),
                          CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(x, Subtract(Power(n, CN1), C1)), Power(
                                      Cos(Times(d, Plus(a, Times(b, Log(x))))), p)),
                              x),
                          x, Times(c, Power(x, n))),
                      x),
                  And(FreeQ(List(a, b, c, d, n, p), x), Or(NeQ(c, C1), NeQ(n, C1))))),
          IIntegrate(4485,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Sin(Times(
                          Plus(a_DEFAULT,
                              Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))), b_DEFAULT)),
                          d_DEFAULT))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Plus(m, C1), Power(Times(e, x), Plus(m, C1)),
                          Sin(Times(d, Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                          Power(Plus(Times(Sqr(b), Sqr(d), e, Sqr(n)), Times(e, Sqr(Plus(m, C1)))),
                              CN1)),
                          x),
                      Simp(
                          Times(b, d, n, Power(Times(e, x), Plus(m, C1)),
                              Cos(Times(d, Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                              Power(Plus(Times(Sqr(b), Sqr(d), e, Sqr(n)),
                                  Times(e, Sqr(Plus(m, C1)))), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m,
                      n), x), NeQ(Plus(Times(Sqr(b), Sqr(d), Sqr(n)), Sqr(Plus(m, C1))),
                          C0)))),
          IIntegrate(4486,
              Integrate(
                  Times(
                      Cos(Times(
                          Plus(
                              a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                  b_DEFAULT)),
                          d_DEFAULT)),
                      Power(Times(e_DEFAULT, x_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Plus(m, C1), Power(Times(e, x), Plus(m, C1)),
                          Cos(Times(d, Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                          Power(Plus(Times(Sqr(b), Sqr(d), e, Sqr(n)), Times(e, Sqr(Plus(m, C1)))),
                              CN1)),
                          x),
                      Simp(
                          Times(b, d, n, Power(Times(e, x), Plus(m, C1)),
                              Sin(Times(d,
                                  Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                              Power(
                                  Plus(Times(Sqr(b), Sqr(d), e, Sqr(n)),
                                      Times(e, Sqr(Plus(m, C1)))),
                                  CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n), x), NeQ(Plus(Times(Sqr(b), Sqr(d), Sqr(n)),
                      Sqr(Plus(m, C1))),
                      C0)))),
          IIntegrate(4487,
              Integrate(
                  Times(Power(Times(e_DEFAULT, x_), m_DEFAULT),
                      Power(Sin(Times(
                          Plus(
                              a_DEFAULT,
                              Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))), b_DEFAULT)),
                          d_DEFAULT)), p_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Plus(m, C1), Power(Times(e, x), Plus(m, C1)),
                              Power(Sin(Times(d,
                                  Plus(a, Times(b, Log(Times(c, Power(x, n))))))), p),
                              Power(
                                  Plus(
                                      Times(Sqr(
                                          b), Sqr(d), e, Sqr(n), Sqr(p)),
                                      Times(e, Sqr(Plus(m, C1)))),
                                  CN1)),
                          x),
                      Dist(
                          Times(Sqr(b), Sqr(d), Sqr(n), p, Subtract(p, C1),
                              Power(
                                  Plus(Times(Sqr(b), Sqr(d), Sqr(n), Sqr(p)),
                                      Sqr(Plus(m, C1))),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Times(e,
                                      x), m),
                                  Power(
                                      Sin(Times(d, Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                                      Subtract(p, C2))),
                              x),
                          x),
                      Negate(
                          Simp(Times(b, d, n, p, Power(Times(e, x), Plus(m, C1)),
                              Cos(Times(d, Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                              Power(Sin(Times(d, Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                                  Subtract(p, C1)),
                              Power(Plus(Times(Sqr(b), Sqr(d), e, Sqr(n), Sqr(p)),
                                  Times(e, Sqr(Plus(m, C1)))), CN1)),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, m, n), x), IGtQ(p, C1), NeQ(Plus(Times(Sqr(b), Sqr(
                      d), Sqr(n), Sqr(p)), Sqr(
                          Plus(m, C1))),
                      C0)))),
          IIntegrate(4488,
              Integrate(
                  Times(
                      Power(
                          Cos(Times(
                              Plus(
                                  a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                      b_DEFAULT)),
                              d_DEFAULT)),
                          p_),
                      Power(Times(e_DEFAULT, x_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Plus(m, C1), Power(Times(e, x), Plus(m,
                                  C1)),
                              Power(Cos(Times(d,
                                  Plus(a, Times(b, Log(Times(c, Power(x, n))))))), p),
                              Power(
                                  Plus(
                                      Times(Sqr(b), Sqr(d), e, Sqr(n), Sqr(
                                          p)),
                                      Times(e, Sqr(Plus(m, C1)))),
                                  CN1)),
                          x),
                      Dist(
                          Times(Sqr(b), Sqr(d), Sqr(n), p, Subtract(p, C1),
                              Power(
                                  Plus(Times(Sqr(b), Sqr(d), Sqr(n), Sqr(
                                      p)), Sqr(
                                          Plus(m, C1))),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Times(e,
                                      x), m),
                                  Power(
                                      Cos(Times(d,
                                          Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                                      Subtract(p, C2))),
                              x),
                          x),
                      Simp(
                          Times(b, d, n, p, Power(Times(e, x), Plus(m, C1)),
                              Sin(Times(d, Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                              Power(Cos(Times(d, Plus(a, Times(b, Log(Times(c, Power(x, n))))))),
                                  Subtract(p, C1)),
                              Power(Plus(Times(Sqr(b), Sqr(d), e, Sqr(n), Sqr(p)),
                                  Times(e, Sqr(Plus(m, C1)))), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, m, n), x), IGtQ(p, C1), NeQ(Plus(
                      Times(Sqr(b), Sqr(d), Sqr(n), Sqr(p)), Sqr(Plus(m, C1))), C0)))),
          IIntegrate(4489,
              Integrate(
                  Times(
                      Power(Times(e_DEFAULT,
                          x_), m_DEFAULT),
                      Power(
                          Sin(Times(Plus(a_DEFAULT, Times(Log(x_), b_DEFAULT)),
                              d_DEFAULT)),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Plus(m, C1), p), Power(Times(Power(C2, p), Power(b, p), Power(d, p),
                              Power(p, p)), CN1)),
                      Integrate(
                          ExpandIntegrand(Times(Power(Times(e, x), m),
                              Power(Subtract(
                                  Times(Exp(Times(a, b, Sqr(d), p, Power(Plus(m, C1), CN1))),
                                      Power(Power(x, Times(Plus(m, C1), Power(p, CN1))), CN1)),
                                  Times(Power(x, Times(Plus(m, C1), Power(p, CN1))),
                                      Power(Exp(Times(a, b, Sqr(d), p, Power(Plus(m, C1), CN1))),
                                          CN1))),
                                  p)),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e,
                      m), x), IGtQ(p, C0), EqQ(
                          Plus(Times(Sqr(b), Sqr(d), Sqr(p)), Sqr(Plus(m, C1))), C0)))),
          IIntegrate(4490,
              Integrate(
                  Times(
                      Power(
                          Cos(Times(Plus(a_DEFAULT, Times(Log(x_), b_DEFAULT)),
                              d_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(e_DEFAULT, x_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Power(C2,
                          p), CN1),
                      Integrate(
                          ExpandIntegrand(Times(Power(Times(e, x), m),
                              Power(Plus(
                                  Times(Exp(Times(a, b, Sqr(d), p, Power(Plus(m, C1), CN1))),
                                      Power(Power(x, Times(Plus(m, C1), Power(p, CN1))), CN1)),
                                  Times(Power(x, Times(Plus(m, C1), Power(p, CN1))),
                                      Power(Exp(Times(a, b, Sqr(d), p, Power(Plus(m, C1), CN1))),
                                          CN1))),
                                  p)),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e,
                      m), x), IGtQ(p, C0), EqQ(
                          Plus(Times(Sqr(b), Sqr(d), Sqr(p)), Sqr(Plus(m, C1))), C0)))),
          IIntegrate(4491,
              Integrate(
                  Times(
                      Power(Times(e_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Sin(Times(Plus(a_DEFAULT, Times(Log(x_), b_DEFAULT)), d_DEFAULT)), p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Sin(Times(d,
                              Plus(a, Times(b, Log(x))))), p),
                          Power(x, Times(CI, b, d, p)),
                          Power(Power(
                              Subtract(C1,
                                  Times(Exp(Times(C2, CI, a, d)), Power(x, Times(C2, CI, b, d)))),
                              p), CN1)),
                      Integrate(
                          Times(
                              Power(Times(e,
                                  x), m),
                              Power(
                                  Subtract(C1,
                                      Times(Exp(Times(C2, CI, a, d)),
                                          Power(x, Times(C2, CI, b, d)))),
                                  p),
                              Power(Power(x, Times(CI, b, d, p)), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, m, p), x), Not(IntegerQ(p))))),
          IIntegrate(4492,
              Integrate(
                  Times(
                      Power(Cos(Times(Plus(a_DEFAULT, Times(Log(x_), b_DEFAULT)), d_DEFAULT)),
                          p_),
                      Power(Times(e_DEFAULT, x_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Times(Power(Cos(Times(d, Plus(a, Times(b, Log(x))))), p),
                      Power(x, Times(CI, b, d, p)),
                      Power(Power(
                          Plus(C1, Times(Exp(Times(C2, CI, a, d)), Power(x, Times(C2, CI, b, d)))),
                          p), CN1)),
                      Integrate(
                          Times(Power(Times(e, x), m),
                              Power(
                                  Plus(C1,
                                      Times(Exp(Times(C2, CI, a, d)),
                                          Power(x, Times(C2, CI, b, d)))),
                                  p),
                              Power(Power(x, Times(CI, b, d, p)), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, m, p), x), Not(IntegerQ(p))))),
          IIntegrate(4493,
              Integrate(
                  Times(
                      Power(Times(e_DEFAULT,
                          x_), m_DEFAULT),
                      Power(Sin(Times(
                          Plus(a_DEFAULT,
                              Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))), b_DEFAULT)),
                          d_DEFAULT)), p_DEFAULT)),
                  x_Symbol),
              Condition(Dist(Times(Power(Times(e, x), Plus(m, C1)),
                  Power(
                      Times(e, n, Power(Times(c, Power(x, n)), Times(Plus(m, C1), Power(n, CN1)))),
                      CN1)),
                  Subst(
                      Integrate(Times(Power(x, Subtract(Times(Plus(m, C1), Power(n, CN1)), C1)),
                          Power(Sin(Times(d, Plus(a, Times(b, Log(x))))), p)), x),
                      x, Times(c, Power(x, n))),
                  x), And(FreeQ(List(a, b, c, d, e, m, n, p), x), Or(NeQ(c, C1), NeQ(n, C1))))),
          IIntegrate(4494,
              Integrate(
                  Times(
                      Power(
                          Cos(Times(
                              Plus(a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                  b_DEFAULT)),
                              d_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(e_DEFAULT, x_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(e, x), Plus(m,
                              C1)),
                          Power(
                              Times(
                                  e, n, Power(Times(c, Power(x, n)),
                                      Times(Plus(m, C1), Power(n, CN1)))),
                              CN1)),
                      Subst(
                          Integrate(
                              Times(Power(x, Subtract(Times(Plus(m, C1), Power(n, CN1)), C1)),
                                  Power(Cos(Times(d, Plus(a, Times(b, Log(x))))), p)),
                              x),
                          x, Times(c, Power(x, n))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x), Or(NeQ(c, C1), NeQ(n, C1))))),
          IIntegrate(4495,
              Integrate(
                  Times(
                      Power(
                          Times(
                              Plus(e_DEFAULT,
                                  Times(Log(Times(g_DEFAULT, Power(x_, m_DEFAULT))), f_DEFAULT)),
                              h_DEFAULT),
                          q_DEFAULT),
                      Sin(Times(
                          Plus(
                              a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                  b_DEFAULT)),
                          d_DEFAULT))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(CI,
                              Power(
                                  Times(Exp(Times(CI, a, d)),
                                      Power(Times(c, Power(x, n)), Times(CI, b,
                                          d)),
                                      C2, Power(Power(x, Times(CI, b, d, n)), CN1)),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(Times(h, Plus(e, Times(f, Log(Times(g, Power(x, m)))))), q),
                                  Power(Power(x, Times(CI, b, d, n)), CN1)),
                              x),
                          x),
                      Dist(
                          Times(CI, Exp(Times(CI, a, d)),
                              Power(Times(c, Power(x,
                                  n)), Times(CI, b,
                                      d)),
                              Power(Times(C2, Power(x, Times(CI, b, d, n))), CN1)),
                          Integrate(
                              Times(
                                  Power(x, Times(CI, b, d,
                                      n)),
                                  Power(Times(h, Plus(e, Times(f, Log(Times(g, Power(x, m)))))),
                                      q)),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f, g, h, m, n, q), x))),
          IIntegrate(4496,
              Integrate(
                  Times(
                      Cos(Times(
                          Plus(
                              a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                  b_DEFAULT)),
                          d_DEFAULT)),
                      Power(
                          Times(
                              Plus(
                                  e_DEFAULT, Times(Log(Times(g_DEFAULT, Power(x_, m_DEFAULT))),
                                      f_DEFAULT)),
                              h_DEFAULT),
                          q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Power(
                              Times(Exp(Times(CI, a, d)),
                                  Power(Times(c, Power(x,
                                      n)), Times(CI, b,
                                          d)),
                                  C2, Power(Power(x, Times(CI, b, d, n)), CN1)),
                              CN1),
                          Integrate(
                              Times(
                                  Power(Times(h, Plus(e, Times(f, Log(Times(g, Power(x, m)))))), q),
                                  Power(Power(x, Times(CI, b, d, n)), CN1)),
                              x),
                          x),
                      Dist(
                          Times(
                              Exp(Times(CI, a, d)), Power(Times(c, Power(x,
                                  n)), Times(CI, b,
                                      d)),
                              Power(Times(C2, Power(x, Times(CI, b, d, n))), CN1)),
                          Integrate(
                              Times(
                                  Power(x, Times(CI, b, d,
                                      n)),
                                  Power(Times(h, Plus(e, Times(f, Log(Times(g, Power(x, m)))))),
                                      q)),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f, g, h, m, n, q), x))),
          IIntegrate(4497,
              Integrate(
                  Times(
                      Power(
                          Times(
                              Plus(
                                  e_DEFAULT, Times(Log(Times(g_DEFAULT, Power(x_, m_DEFAULT))),
                                      f_DEFAULT)),
                              h_DEFAULT),
                          q_DEFAULT),
                      Power(Times(i_DEFAULT,
                          x_), r_DEFAULT),
                      Sin(Times(
                          Plus(
                              a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                  b_DEFAULT)),
                          d_DEFAULT))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(CI, Power(Times(i, x), r),
                              Power(
                                  Times(Exp(Times(CI, a, d)),
                                      Power(Times(c, Power(x, n)), Times(CI, b, d)), C2, Power(x,
                                          Subtract(r, Times(CI, b, d, n)))),
                                  CN1)),
                          Integrate(
                              Times(Power(x, Subtract(r, Times(CI, b, d, n))),
                                  Power(Times(h, Plus(e, Times(f, Log(Times(g, Power(x, m)))))),
                                      q)),
                              x),
                          x),
                      Dist(
                          Times(CI, Exp(Times(CI, a, d)), Power(Times(i, x), r),
                              Power(Times(c, Power(x,
                                  n)), Times(CI, b,
                                      d)),
                              Power(Times(C2, Power(x, Plus(r, Times(CI, b, d, n)))), CN1)),
                          Integrate(
                              Times(
                                  Power(x, Plus(r,
                                      Times(CI, b, d, n))),
                                  Power(Times(h, Plus(e, Times(f, Log(Times(g, Power(x, m)))))),
                                      q)),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f, g, h, i, m, n, q, r), x))),
          IIntegrate(4498,
              Integrate(
                  Times(
                      Cos(Times(
                          Plus(
                              a_DEFAULT, Times(Log(Times(c_DEFAULT, Power(x_, n_DEFAULT))),
                                  b_DEFAULT)),
                          d_DEFAULT)),
                      Power(
                          Times(
                              Plus(
                                  e_DEFAULT,
                                  Times(Log(Times(g_DEFAULT, Power(x_, m_DEFAULT))), f_DEFAULT)),
                              h_DEFAULT),
                          q_DEFAULT),
                      Power(Times(i_DEFAULT, x_), r_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(Power(Times(i, x), r),
                              Power(
                                  Times(Exp(Times(CI, a, d)),
                                      Power(Times(c, Power(x, n)), Times(CI, b, d)), C2, Power(x,
                                          Subtract(r, Times(CI, b, d, n)))),
                                  CN1)),
                          Integrate(
                              Times(Power(x, Subtract(r, Times(CI, b, d, n))),
                                  Power(Times(h, Plus(e, Times(f, Log(Times(g, Power(x, m)))))),
                                      q)),
                              x),
                          x),
                      Dist(
                          Times(Exp(Times(CI, a, d)), Power(Times(i, x), r),
                              Power(Times(c, Power(x,
                                  n)), Times(CI, b,
                                      d)),
                              Power(Times(C2, Power(x, Plus(r, Times(CI, b, d, n)))), CN1)),
                          Integrate(
                              Times(Power(x, Plus(r, Times(CI, b, d, n))),
                                  Power(Times(h, Plus(e, Times(f, Log(Times(g, Power(x, m)))))),
                                      q)),
                              x),
                          x)),
                  FreeQ(List(a, b, c, d, e, f, g, h, i, m, n, q, r), x))),
          IIntegrate(4499,
              Integrate(
                  Power(Sec(Times(Plus(a_DEFAULT, Times(Log(x_), b_DEFAULT)), d_DEFAULT)),
                      p_DEFAULT),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(C2,
                          p), Exp(Times(CI, a, d, p))),
                      Integrate(
                          Times(
                              Power(x, Times(CI, b, d,
                                  p)),
                              Power(
                                  Power(Plus(C1,
                                      Times(Exp(Times(C2, CI, a, d)), Power(x,
                                          Times(C2, CI, b, d)))),
                                      p),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d), x), IntegerQ(p)))),
          IIntegrate(4500,
              Integrate(
                  Power(Csc(Times(Plus(a_DEFAULT, Times(Log(x_), b_DEFAULT)), d_DEFAULT)),
                      p_DEFAULT),
                  x_Symbol),
              Condition(Dist(Times(Power(Times(CN2, CI), p), Exp(Times(CI, a, d, p))),
                  Integrate(Times(Power(x, Times(CI, b, d, p)), Power(
                      Power(Subtract(C1,
                          Times(Exp(Times(C2, CI, a, d)), Power(x, Times(C2, CI, b, d)))), p),
                      CN1)), x),
                  x), And(FreeQ(List(a, b, d), x), IntegerQ(p)))));
}
