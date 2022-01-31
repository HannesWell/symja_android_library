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
class IntRules226 {
  public static IAST RULES =
      List(
          IIntegrate(4521,
              Integrate(
                  Times(
                      Cos(Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_))),
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sin(
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CI, Power(Plus(e, Times(f,
                                      x)), Plus(m,
                                          C1)),
                                  Power(Times(b, f, Plus(m, C1)), CN1)),
                              x)),
                      Dist(CI,
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Exp(Times(CI, Plus(c, Times(d, x)))),
                                  Power(Plus(Times(CI, a),
                                      Negate(Rt(Plus(Negate(Sqr(a)), Sqr(b)), C2)), Times(b, Exp(
                                          Times(CI, Plus(c, Times(d, x)))))),
                                      CN1)),
                              x),
                          x),
                      Dist(CI,
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Exp(Times(CI, Plus(c, Times(d, x)))), Power(
                                      Plus(
                                          Times(CI, a), Rt(Plus(Negate(Sqr(a)), Sqr(b)), C2),
                                          Times(b, Exp(Times(CI, Plus(c, Times(d, x)))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0),
                      NegQ(Subtract(Sqr(a), Sqr(b)))))),
          IIntegrate(4522,
              Integrate(
                  Times(
                      Power(Plus(Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT),
                          a_), CN1),
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              CI, Power(Plus(e, Times(f,
                                  x)), Plus(m,
                                      C1)),
                              Power(Times(b, f, Plus(m, C1)), CN1)),
                          x),
                      Integrate(
                          Times(
                              Power(Plus(e, Times(f,
                                  x)), m),
                              Exp(Times(CI,
                                  Plus(c, Times(d, x)))),
                              Power(
                                  Plus(Times(CI, a), Negate(Rt(Plus(Negate(Sqr(a)), Sqr(b)), C2)),
                                      Times(CI, b, Exp(Times(CI, Plus(c, Times(d, x)))))),
                                  CN1)),
                          x),
                      Integrate(Times(Power(Plus(e, Times(f, x)), m),
                          Exp(Times(CI, Plus(c, Times(d, x)))), Power(Plus(Times(CI, a),
                              Rt(Plus(Negate(Sqr(a)), Sqr(b)), C2), Times(CI, b,
                                  Exp(Times(CI, Plus(c, Times(d, x)))))),
                              CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), IGtQ(m,
                          C0),
                      NegQ(Subtract(Sqr(a), Sqr(b)))))),
          IIntegrate(4523,
              Integrate(
                  Times(
                      Power(Cos(Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), n_),
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Cos(Plus(c, Times(d, x))), Subtract(n, C2))),
                              x),
                          x),
                      Dist(Power(b, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Cos(Plus(c, Times(d, x))), Subtract(n,
                                      C2)),
                                  Sin(Plus(c, Times(d, x)))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f,
                      m), x), IGtQ(n,
                          C1),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4524,
              Integrate(
                  Times(
                      Power(Plus(
                          Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT), Power(
                          Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Sin(Plus(c, Times(d, x))), Subtract(n, C2))),
                              x),
                          x),
                      Dist(Power(b, CN1), Integrate(Times(Power(Plus(e, Times(f, x)), m),
                          Power(Sin(Plus(c, Times(d, x))),
                              Subtract(n, C2)),
                          Cos(Plus(c, Times(d, x)))), x), x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), IGtQ(n, C1),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4525, Integrate(
              Times(Power(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                  Power(
                      Plus(a_, Times(b_DEFAULT, Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))), CN1)),
              x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(a, Power(b, CN2)),
                          Integrate(
                              Times(
                                  Power(Plus(e, Times(f, x)), m), Power(Cos(Plus(c, Times(d, x))),
                                      Subtract(n, C2))),
                              x),
                          x),
                      Negate(
                          Dist(Power(b, CN1),
                              Integrate(
                                  Times(Power(Plus(e, Times(f, x)), m),
                                      Power(Cos(Plus(c,
                                          Times(d, x))), Subtract(n,
                                              C2)),
                                      Sin(Plus(c, Times(d, x)))),
                                  x),
                              x)),
                      Negate(Dist(Times(Subtract(Sqr(a), Sqr(b)), Power(b, CN2)),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Cos(Plus(c, Times(d, x))), Subtract(n, C2)),
                              Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)), x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(n, C1),
                      NeQ(Subtract(Sqr(a), Sqr(b)), C0), IGtQ(m, C0)))),
          IIntegrate(4526,
              Integrate(
                  Times(
                      Power(
                          Plus(Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_),
                          CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_)),
                  x_Symbol),
              Condition(
                  Plus(Dist(
                      Times(a, Power(b,
                          CN2)),
                      Integrate(
                          Times(Power(Plus(e, Times(f, x)), m),
                              Power(Sin(Plus(c, Times(d, x))), Subtract(n, C2))),
                          x),
                      x),
                      Negate(
                          Dist(Power(b, CN1),
                              Integrate(
                                  Times(Power(Plus(e, Times(f, x)), m),
                                      Power(Sin(Plus(c,
                                          Times(d, x))), Subtract(n,
                                              C2)),
                                      Cos(Plus(c, Times(d, x)))),
                                  x),
                              x)),
                      Negate(Dist(Times(Subtract(Sqr(a), Sqr(b)), Power(b, CN2)),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Sin(Plus(c, Times(d, x))), Subtract(n, C2)),
                              Power(Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)), x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(n, C1), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), IGtQ(m,
                          C0)))),
          IIntegrate(4527,
              Integrate(
                  Times(
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT,
                              Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1),
                      Power(Tan(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(b, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m), Sec(Plus(c, Times(d, x))),
                                  Power(Tan(Plus(c, Times(d, x))), Subtract(n, C1))),
                              x),
                          x),
                      Dist(
                          Times(a, Power(b,
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m), Sec(Plus(c, Times(d, x))),
                                  Power(Tan(Plus(c,
                                      Times(d, x))), Subtract(n,
                                          C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0)))),
          IIntegrate(4528,
              Integrate(
                  Times(
                      Power(Cot(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT),
                              a_),
                          CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(b, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m), Csc(Plus(c, Times(d, x))),
                                  Power(Cot(Plus(c, Times(d, x))), Subtract(n, C1))),
                              x),
                          x),
                      Dist(
                          Times(a, Power(b,
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m), Csc(Plus(c, Times(d, x))),
                                  Power(Cot(Plus(c,
                                      Times(d, x))), Subtract(n,
                                          C1)),
                                  Power(Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0)))),
          IIntegrate(4529,
              Integrate(
                  Times(
                      Power(Cot(Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sin(
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Cot(Plus(c, Times(d, x))), n)),
                              x),
                          x),
                      Dist(
                          Times(b, Power(a,
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m), Cos(Plus(c, Times(d, x))),
                                  Power(Cot(Plus(c, Times(d, x))), Subtract(n,
                                      C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0)))),
          IIntegrate(4530,
              Integrate(
                  Times(
                      Power(Plus(
                          Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)), m_DEFAULT),
                      Power(Tan(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Tan(Plus(c, Times(d, x))), n)),
                              x),
                          x),
                      Dist(
                          Times(b, Power(a,
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m), Sin(Plus(c, Times(d, x))),
                                  Power(Tan(Plus(c, Times(d, x))), Subtract(n, C1)), Power(Plus(a,
                                      Times(b, Cos(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0)))),
          IIntegrate(4531,
              Integrate(
                  Times(Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Sec(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Sec(Plus(c, Times(d, x))), Plus(n, C2))),
                              x),
                          x),
                      Dist(Power(b, CN1),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Sec(Plus(c, Times(d, x))), Plus(n, C1)),
                              Tan(Plus(c, Times(d, x)))), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f,
                      n), x), IGtQ(m,
                          C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4532,
              Integrate(
                  Times(
                      Power(Csc(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT),
                              a_),
                          CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(Dist(Power(a, CN1),
                      Integrate(Times(Power(Plus(e, Times(f, x)), m),
                          Power(Csc(Plus(c, Times(d, x))), Plus(n, C2))), x),
                      x),
                      Dist(Power(b, CN1),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Csc(Plus(c, Times(d, x))), Plus(n, C1)),
                              Cot(Plus(c, Times(d, x)))), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f,
                      n), x), IGtQ(m,
                          C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(4533,
              Integrate(
                  Times(
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)), m_DEFAULT),
                      Power(Sec(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sin(
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(Times(Sqr(b), Power(Subtract(Sqr(a), Sqr(b)), CN1)),
                              Integrate(Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Sec(Plus(c, Times(d, x))), Subtract(n, C2)),
                                  Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)), x),
                              x)),
                      Dist(
                          Power(Subtract(Sqr(a),
                              Sqr(b)), CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Sec(
                                      Plus(c, Times(d, x))), n),
                                  Subtract(a, Times(b, Sin(Plus(c, Times(d, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), IGtQ(n,
                          C0)))),
          IIntegrate(4534,
              Integrate(
                  Times(
                      Power(Csc(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT),
                              a_),
                          CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Dist(Times(Sqr(b), Power(Subtract(Sqr(a), Sqr(b)), CN1)),
                              Integrate(Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Csc(Plus(c, Times(d, x))), Subtract(n, C2)), Power(Plus(a,
                                      Times(b, Cos(Plus(c, Times(d, x))))), CN1)),
                                  x),
                              x)),
                      Dist(Power(Subtract(Sqr(a), Sqr(b)), CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Csc(Plus(c, Times(d, x))), n), Subtract(a,
                                      Times(b, Cos(Plus(c, Times(d, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), IGtQ(n,
                          C0)))),
          IIntegrate(4535,
              Integrate(
                  Times(
                      Power(Csc(Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sin(
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Csc(Plus(c, Times(d, x))), n)),
                              x),
                          x),
                      Dist(
                          Times(b, Power(a,
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Csc(Plus(c,
                                      Times(d, x))), Subtract(n,
                                          C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0)))),
          IIntegrate(4536,
              Integrate(
                  Times(
                      Power(Plus(
                          Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)), m_DEFAULT),
                      Power(Sec(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Sec(Plus(c, Times(d, x))), n)),
                              x),
                          x),
                      Dist(Times(b, Power(a, CN1)),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Sec(Plus(c, Times(d, x))), Subtract(n, C1)),
                              Power(Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0)))),
          IIntegrate(4537,
              Integrate(
                  Times(Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT,
                              Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1),
                      Power($(F_, Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(e, Times(f, x)), m), Power(F(Plus(c,
                              Times(d, x))), n),
                          Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), TrigQ(FSymbol)))),
          IIntegrate(4538,
              Integrate(
                  Times(
                      Power(Plus(
                          Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)), m_DEFAULT),
                      Power($(F_, Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(e, Times(f, x)), m), Power(F(Plus(c, Times(d, x))), n), Power(
                              Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), TrigQ(FSymbol)))),
          IIntegrate(4539,
              Integrate(
                  Times(
                      Power(Cos(Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_))), p_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)), m_DEFAULT),
                      Power(Sin(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT, Sin(
                              Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(b, CN1),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Cos(Plus(c, Times(d, x))), p),
                              Power(Sin(Plus(c, Times(d, x))), Subtract(n, C1))), x),
                          x),
                      Dist(Times(a, Power(b, CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Cos(Plus(c, Times(d, x))), p),
                                  Power(Sin(Plus(c, Times(d, x))), Subtract(n, C1)), Power(Plus(a,
                                      Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0), IGtQ(p, C0)))),
          IIntegrate(4540,
              Integrate(
                  Times(
                      Power(Cos(Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(Plus(
                          Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)), m_DEFAULT),
                      Power(Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(b, CN1),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Sin(Plus(c, Times(d, x))), p),
                              Power(Cos(Plus(c, Times(d, x))), Subtract(n, C1))), x),
                          x),
                      Dist(Times(a, Power(b, CN1)),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Sin(Plus(c, Times(d, x))), p),
                              Power(Cos(Plus(c, Times(d, x))), Subtract(n, C1)),
                              Power(Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0), IGtQ(p, C0)))));
}
