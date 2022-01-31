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
class IntRules227 {
  public static IAST RULES =
      List(
          IIntegrate(4541,
              Integrate(
                  Times(Power(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
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
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Cos(Plus(c, Times(d, x))), Subtract(p, C1)),
                                  Power(Tan(Plus(c, Times(d, x))), Subtract(n, C1))),
                              x),
                          x),
                      Dist(
                          Times(a, Power(b,
                              CN1)),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Cos(Plus(c, Times(d, x))), Subtract(p, C1)),
                              Power(Tan(Plus(c, Times(d, x))), Subtract(n, C1)), Power(
                                  Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0), IGtQ(p, C0)))),
          IIntegrate(4542,
              Integrate(
                  Times(Power(Cot(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(Plus(Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT), Power(Sin(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(Dist(Power(b, CN1),
                      Integrate(Times(Power(Plus(e, Times(f, x)), m),
                          Power(Sin(Plus(c, Times(d, x))), Subtract(p, C1)),
                          Power(Cot(Plus(c, Times(d, x))), Subtract(n, C1))), x),
                      x),
                      Dist(Times(a, Power(b, CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Sin(Plus(c, Times(d, x))), Subtract(p, C1)),
                                  Power(Cot(Plus(c, Times(d, x))), Subtract(n, C1)),
                                  Power(Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0), IGtQ(p, C0)))),
          IIntegrate(4543,
              Integrate(
                  Times(
                      Power(Cos(Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_))), p_DEFAULT),
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
                                  Power(Cos(Plus(c, Times(d, x))), p),
                                  Power(Cot(Plus(c, Times(d, x))), n)),
                              x),
                          x),
                      Dist(
                          Times(b, Power(a,
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Cos(Plus(c, Times(d, x))), Plus(p, C1)),
                                  Power(Cot(Plus(c,
                                      Times(d, x))), Subtract(n,
                                          C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0), IGtQ(p, C0)))),
          IIntegrate(4544,
              Integrate(
                  Times(
                      Power(Plus(
                          Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Sin(Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_))), p_DEFAULT),
                      Power(Tan(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Sin(Plus(c, Times(d, x))), p),
                                  Power(Tan(Plus(c, Times(d, x))), n)),
                              x),
                          x),
                      Dist(
                          Times(b, Power(a,
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Sin(Plus(c, Times(d, x))), Plus(p, C1)),
                                  Power(Tan(Plus(c, Times(d, x))), Subtract(n, C1)),
                                  Power(Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0), IGtQ(p, C0)))),
          IIntegrate(4545,
              Integrate(
                  Times(
                      Power(Cos(Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_))), p_DEFAULT),
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
                                  Power(Cos(Plus(c, Times(d, x))), p),
                                  Power(Csc(Plus(c, Times(d, x))), n)),
                              x),
                          x),
                      Dist(
                          Times(b, Power(a,
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), m),
                                  Power(Cos(Plus(c, Times(d, x))), p),
                                  Power(Csc(Plus(c, Times(d, x))), Subtract(n,
                                      C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0), IGtQ(p, C0)))),
          IIntegrate(4546,
              Integrate(
                  Times(
                      Power(Plus(
                          Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Sec(Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power(Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Power(a, CN1),
                          Integrate(Times(Power(Plus(e, Times(f, x)), m),
                              Power(Sin(Plus(c, Times(d, x))), p), Power(Sec(Plus(c, Times(d, x))),
                                  n)),
                              x),
                          x),
                      Dist(Times(b, Power(a, CN1)), Integrate(
                          Times(Power(Plus(e, Times(f, x)), m), Power(Sin(Plus(c, Times(d, x))), p),
                              Power(Sec(Plus(c, Times(d, x))), Subtract(n, C1)),
                              Power(Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0), IGtQ(n, C0), IGtQ(p, C0)))),
          IIntegrate(4547,
              Integrate(
                  Times(Power(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT),
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT,
                              Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1),
                      Power($(F_, Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Plus(e, Times(f, x)), m), Power(Cos(Plus(c, Times(d, x))), p),
                          Power(F(Plus(c, Times(d, x))), n), Power(Plus(a,
                              Times(b, Sin(Plus(c, Times(d, x))))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), TrigQ(FSymbol)))),
          IIntegrate(4548,
              Integrate(
                  Times(
                      Power(
                          Plus(Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_),
                          CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT),
                      Power($(F_, Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Plus(e, Times(f, x)), m), Power(F(Plus(c, Times(d, x))), n),
                          Power(Sin(Plus(c, Times(d, x))), p), Power(
                              Plus(a, Times(b, Cos(Plus(c, Times(d, x))))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), TrigQ(FSymbol)))),
          IIntegrate(4549,
              Integrate(
                  Times(Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(
                          Plus(a_, Times(b_DEFAULT,
                              Sec(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          CN1),
                      Power($(F_, Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Plus(e, Times(f, x)), m), Cos(Plus(c, Times(d, x))),
                          Power(F(Plus(c, Times(d, x))), n), Power(
                              Plus(b, Times(a, Cos(Plus(c, Times(d, x))))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), TrigQ(FSymbol), IntegersQ(m, n)))),
          IIntegrate(4550,
              Integrate(
                  Times(
                      Power(Plus(
                          Times(Csc(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)), m_DEFAULT),
                      Power($(F_, Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Plus(e, Times(f, x)), m), Sin(Plus(c, Times(d, x))),
                          Power(F(Plus(c, Times(d, x))), n), Power(
                              Plus(b, Times(a, Sin(Plus(c, Times(d, x))))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), TrigQ(FSymbol), IntegersQ(m, n)))),
          IIntegrate(4551,
              Integrate(
                  Times(Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT, Sec(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))), CN1),
                      Power($(F_, Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), n_DEFAULT),
                      Power($(G_, Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(Power(Plus(e, Times(f, x)), m), Cos(Plus(c, Times(d, x))),
                          Power(F(Plus(c,
                              Times(d, x))), n),
                          Power(G(Plus(c, Times(d, x))), p), Power(
                              Plus(b, Times(a, Cos(Plus(c, Times(d, x))))), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), TrigQ(FSymbol), TrigQ(GSymbol),
                      IntegersQ(m, n, p)))),
          IIntegrate(4552,
              Integrate(
                  Times(Power(
                      Plus(Times(Csc(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT), a_), CN1),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power($(F_, Plus(c_DEFAULT, Times(d_DEFAULT, x_))), n_DEFAULT), Power($(G_,
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(Integrate(Times(Power(Plus(e, Times(f, x)), m), Sin(Plus(c, Times(d, x))),
                  Power(F(Plus(c, Times(d, x))), n), Power(G(Plus(c, Times(d, x))),
                      p),
                  Power(Plus(b, Times(a, Sin(Plus(c, Times(d, x))))), CN1)), x), And(
                      FreeQ(List(a, b, c, d, e,
                          f), x),
                      TrigQ(FSymbol), TrigQ(GSymbol), IntegersQ(m, n, p)))),
          IIntegrate(4553,
              Integrate(
                  Times(
                      Power(Sin(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_))), p_DEFAULT),
                      Power(Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(Power(Power(C2, Plus(p, q)), CN1),
                      Integrate(ExpandIntegrand(
                          Power(
                              Subtract(Times(CI, Power(Exp(Times(CI, Plus(c, Times(d, x)))), CN1)),
                                  Times(CI, Exp(Times(CI, Plus(c, Times(d, x)))))),
                              q),
                          Power(
                              Subtract(Times(CI, Power(Exp(Times(CI, Plus(a, Times(b, x)))), CN1)),
                                  Times(CI, Exp(Times(CI, Plus(a, Times(b, x)))))),
                              p),
                          x), x),
                      x),
                  And(FreeQ(List(a, b, c, d, q), x), IGtQ(p, C0), Not(IntegerQ(q))))),
          IIntegrate(4554,
              Integrate(Times(Power(Cos(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), p_DEFAULT),
                  Power(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), q_DEFAULT)), x_Symbol),
              Condition(
                  Dist(Power(Power(C2, Plus(p, q)), CN1),
                      Integrate(
                          ExpandIntegrand(
                              Power(Plus(Exp(Times(CN1, CI, Plus(c, Times(d, x)))),
                                  Exp(Times(CI, Plus(c, Times(d, x))))), q),
                              Power(Plus(Exp(Times(CN1, CI, Plus(a, Times(b, x)))),
                                  Exp(Times(CI, Plus(a, Times(b, x))))), p),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, q), x), IGtQ(p, C0), Not(IntegerQ(q))))),
          IIntegrate(4555,
              Integrate(
                  Times(
                      Power(Cos(Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), q_DEFAULT),
                      Power(Sin(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Power(C2,
                          Plus(p, q)), CN1),
                      Integrate(
                          ExpandIntegrand(
                              Power(Plus(Exp(Times(CN1, CI, Plus(c, Times(d, x)))),
                                  Exp(Times(CI, Plus(c, Times(d, x))))), q),
                              Power(
                                  Subtract(Times(CI, Power(Exp(
                                      Times(CI, Plus(a, Times(b, x)))), CN1)), Times(CI, Exp(
                                          Times(CI, Plus(a, Times(b, x)))))),
                                  p),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, q), x), IGtQ(p, C0), Not(IntegerQ(q))))),
          IIntegrate(4556,
              Integrate(
                  Times(
                      Power(Cos(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), p_DEFAULT), Power(Sin(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Power(C2,
                          Plus(p, q)), CN1),
                      Integrate(
                          ExpandIntegrand(
                              Power(
                                  Subtract(
                                      Times(CI, Power(Exp(Times(CI, Plus(c, Times(d, x)))), CN1)),
                                      Times(CI, Exp(Times(CI, Plus(c, Times(d, x)))))),
                                  q),
                              Power(
                                  Plus(Exp(Times(CN1, CI, Plus(a, Times(b, x)))),
                                      Exp(Times(CI, Plus(a, Times(b, x))))),
                                  p),
                              x),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, q), x), IGtQ(p, C0), Not(IntegerQ(q))))),
          IIntegrate(4557,
              Integrate(
                  Times(
                      Sin(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_))),
                      Tan(Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                  x_Symbol),
              Condition(
                  Integrate(
                      Plus(Power(Times(Exp(Times(CI, Plus(a, Times(b, x)))), C2), CN1),
                          Times(CN1, C1D2, Exp(
                              Times(CI, Plus(a, Times(b, x))))),
                          Negate(
                              Power(Times(Exp(Times(CI, Plus(a, Times(b, x)))),
                                  Plus(C1, Exp(Times(C2, CI, Plus(c, Times(d, x)))))), CN1)),
                          Times(
                              Exp(Times(CI, Plus(a, Times(b, x)))), Power(Plus(C1,
                                  Exp(Times(C2, CI, Plus(c, Times(d, x))))), CN1))),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Sqr(b), Sqr(d)), C0)))),
          IIntegrate(4558,
              Integrate(
                  Times(
                      Cos(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), Cot(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                  x_Symbol),
              Condition(
                  Integrate(Subtract(
                      Subtract(
                          Plus(
                              Times(CI,
                                  Power(Times(Exp(Times(CI, Plus(a, Times(b, x)))), C2), CN1)),
                              Times(C1D2, CI, Exp(Times(CI, Plus(a, Times(b, x)))))),
                          Times(CI,
                              Power(
                                  Times(Exp(Times(CI, Plus(a, Times(b, x)))),
                                      Subtract(C1, Exp(Times(C2, CI, Plus(c, Times(d, x)))))),
                                  CN1))),
                      Times(
                          CI, Exp(Times(CI, Plus(a, Times(b, x)))), Power(Subtract(C1,
                              Exp(Times(C2, CI, Plus(c, Times(d, x))))), CN1))),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Sqr(b), Sqr(d)), C0)))),
          IIntegrate(4559,
              Integrate(
                  Times(
                      Cot(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), Sin(
                          Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                  x_Symbol),
              Condition(
                  Integrate(Subtract(
                      Plus(Negate(Power(Times(Exp(Times(CI, Plus(a, Times(b, x)))), C2), CN1)),
                          Times(C1D2, Exp(Times(CI, Plus(a, Times(b, x))))),
                          Power(
                              Times(Exp(Times(CI, Plus(a, Times(b, x)))),
                                  Subtract(C1, Exp(Times(C2, CI, Plus(c, Times(d, x)))))),
                              CN1)),
                      Times(
                          Exp(Times(CI, Plus(a,
                              Times(b, x)))),
                          Power(Subtract(C1, Exp(Times(C2, CI, Plus(c, Times(d, x))))), CN1))),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Sqr(b), Sqr(d)), C0)))),
          IIntegrate(4560,
              Integrate(
                  Times(
                      Cos(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_))),
                      Tan(Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                  x_Symbol),
              Condition(
                  Integrate(Plus(
                      Times(CN1, CI, Power(Times(Exp(Times(CI, Plus(a, Times(b, x)))), C2), CN1)),
                      Times(CN1, C1D2, CI, Exp(Times(CI, Plus(a, Times(b, x))))),
                      Times(CI,
                          Power(Times(Exp(Times(CI, Plus(a, Times(b, x)))),
                              Plus(C1, Exp(Times(C2, CI, Plus(c, Times(d, x)))))), CN1)),
                      Times(CI, Exp(Times(CI, Plus(a, Times(b, x)))),
                          Power(Plus(C1, Exp(Times(C2, CI, Plus(c, Times(d, x))))), CN1))),
                      x),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Subtract(Sqr(b), Sqr(d)), C0)))));
}
