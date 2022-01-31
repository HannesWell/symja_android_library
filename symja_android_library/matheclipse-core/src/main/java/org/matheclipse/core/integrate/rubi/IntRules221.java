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
class IntRules221 {
  public static IAST RULES =
      List(
          IIntegrate(4421,
              Integrate(
                  Times(
                      Power(u_, m_DEFAULT), Power($(F_,
                          v_), n_DEFAULT),
                      Power($(G_, w_), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Times(
                          Power(ExpandToSum(u,
                              x), m),
                          Power(F(ExpandToSum(v, x)), n), Power(G(ExpandToSum(v, x)), p)),
                      x),
                  And(FreeQ(List(m, n, p), x), TrigQ(FSymbol), TrigQ(GSymbol), EqQ(v, w),
                      LinearQ(List(u, v, w), x), Not(LinearMatchQ(List(u, v, w), x))))),
          IIntegrate(4422,
              Integrate(
                  Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                      Power(Plus(e_DEFAULT,
                          Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Plus(a_, Times(b_DEFAULT, Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), m),
                              Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))),
                                  Plus(n, C1)),
                              Power(Times(b, d, Plus(n, C1)), CN1)),
                          x),
                      Dist(
                          Times(f, m, Power(Times(b, d, Plus(n, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(e, Times(f, x)), Subtract(m,
                                      C1)),
                                  Power(Plus(a, Times(b, Sin(Plus(c, Times(d, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), IGtQ(m, C0), NeQ(n, CN1)))),
          IIntegrate(4423,
              Integrate(
                  Times(
                      Power(
                          Plus(Times(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          n_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT), Sin(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Plus(e,
                                      Times(f, x)), m),
                                  Power(Plus(a, Times(b,
                                      Cos(Plus(c, Times(d, x))))), Plus(n,
                                          C1)),
                                  Power(Times(b, d, Plus(n, C1)), CN1)),
                              x)),
                      Dist(
                          Times(f, m, Power(Times(b, d, Plus(n, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(e, Times(f, x)), Subtract(m, C1)), Power(Plus(a,
                                      Times(b, Cos(Plus(c, Times(d, x))))),
                                      Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), IGtQ(m, C0), NeQ(n, CN1)))),
          IIntegrate(4424,
              Integrate(
                  Times(Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Sqr(Sec(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                      Power(Plus(a_, Times(b_DEFAULT, Tan(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))),
                          n_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), m),
                              Power(Plus(a, Times(b, Tan(Plus(c, Times(d, x))))), Plus(n,
                                  C1)),
                              Power(Times(b, d, Plus(n, C1)), CN1)),
                          x),
                      Dist(
                          Times(f, m, Power(Times(b, d, Plus(n, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(e, Times(f, x)), Subtract(m,
                                      C1)),
                                  Power(Plus(a, Times(b, Tan(Plus(c, Times(d, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), IGtQ(m, C0), NeQ(n, CN1)))),
          IIntegrate(4425,
              Integrate(
                  Times(
                      Sqr(Csc(
                          Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                      Power(Plus(Times(Cot(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT),
                          a_), n_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Plus(e,
                                      Times(f, x)), m),
                                  Power(Plus(a, Times(b, Cot(Plus(c, Times(d, x))))), Plus(n, C1)),
                                  Power(Times(b, d, Plus(n, C1)), CN1)),
                              x)),
                      Dist(
                          Times(f, m, Power(Times(b, d, Plus(n, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(e, Times(f, x)), Subtract(m,
                                      C1)),
                                  Power(Plus(a, Times(b, Cot(Plus(c, Times(d, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), IGtQ(m, C0), NeQ(n, CN1)))),
          IIntegrate(4426,
              Integrate(
                  Times(
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT,
                          x_)), m_DEFAULT),
                      Sec(Plus(c_DEFAULT, Times(d_DEFAULT, x_))),
                      Power(Plus(a_, Times(b_DEFAULT,
                          Sec(Plus(c_DEFAULT, Times(d_DEFAULT, x_))))), n_DEFAULT),
                      Tan(Plus(c_DEFAULT, Times(d_DEFAULT, x_)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), m),
                              Power(Plus(a, Times(b, Sec(Plus(c, Times(d, x))))), Plus(n, C1)),
                              Power(Times(b, d, Plus(n, C1)), CN1)),
                          x),
                      Dist(
                          Times(f, m, Power(Times(b, d, Plus(n, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), Subtract(m, C1)), Power(Plus(a,
                                  Times(b, Sec(Plus(c, Times(d, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), IGtQ(m, C0), NeQ(n, CN1)))),
          IIntegrate(4427,
              Integrate(
                  Times(
                      Cot(Plus(c_DEFAULT, Times(d_DEFAULT,
                          x_))),
                      Csc(Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))),
                      Power(Plus(Times(Csc(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), b_DEFAULT),
                          a_), n_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Power(Plus(e,
                                      Times(f, x)), m),
                                  Power(Plus(a, Times(b, Csc(Plus(c, Times(d, x))))), Plus(n, C1)),
                                  Power(Times(b, d, Plus(n, C1)), CN1)),
                              x)),
                      Dist(
                          Times(f, m, Power(Times(b, d, Plus(n, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(e, Times(f, x)), Subtract(m,
                                      C1)),
                                  Power(Plus(a, Times(b, Csc(Plus(c, Times(d, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x), IGtQ(m, C0), NeQ(n, CN1)))),
          IIntegrate(4428,
              Integrate(
                  Times(Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                      Power(Sin(Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_))), p_DEFAULT),
                      Power(Sin(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrigReduce(
                          Power(Plus(e,
                              Times(f, x)), m),
                          Times(Power(Sin(Plus(a, Times(b, x))), p),
                              Power(Sin(Plus(c, Times(d, x))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(p, C0), IGtQ(q, C0), IntegerQ(m)))),
          IIntegrate(4429,
              Integrate(
                  Times(Power(Cos(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), p_DEFAULT),
                      Power(Cos(Plus(c_DEFAULT,
                          Times(d_DEFAULT, x_))), q_DEFAULT),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrigReduce(Power(Plus(e, Times(f, x)), m),
                          Times(Power(Cos(Plus(a, Times(b, x))), p),
                              Power(Cos(Plus(c, Times(d, x))), q)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(p, C0), IGtQ(q, C0), IntegerQ(m)))),
          IIntegrate(4430,
              Integrate(Times(Power(Cos(Plus(c_DEFAULT, Times(d_DEFAULT, x_))), q_DEFAULT),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT), Power(
                      Sin(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(ExpandTrigReduce(Power(Plus(e, Times(f, x)), m),
                      Times(
                          Power(Sin(Plus(a, Times(b, x))), p), Power(Cos(Plus(c, Times(d, x))), q)),
                      x), x),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), IGtQ(p, C0), IGtQ(q, C0)))),
          IIntegrate(4431,
              Integrate(Times(Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT),
                  Power($(F_, Plus(a_DEFAULT, Times(b_DEFAULT, x_))), p_DEFAULT), Power($(G_,
                      Plus(c_DEFAULT, Times(d_DEFAULT, x_))), q_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrigExpand(
                          Times(Power(Plus(e, Times(f, x)), m), Power(G(Plus(c, Times(d, x))), q)),
                          FSymbol, Plus(c, Times(d, x)), p, Times(b, Power(d, CN1)), x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m), x), MemberQ(List(Sin, Cos), FSymbol),
                      MemberQ(List(Sec, Csc), GSymbol), IGtQ(p, C0), IGtQ(q, C0),
                      EqQ(Subtract(Times(b, c),
                          Times(a, d)), C0),
                      IGtQ(Times(b, Power(d, CN1)), C1)))),
          IIntegrate(4432,
              Integrate(
                  Times(
                      Power(F_, Times(c_DEFAULT,
                          Plus(a_DEFAULT, Times(b_DEFAULT, x_)))),
                      Sin(Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(b, c, Log(FSymbol), Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                          Sin(Plus(d, Times(e, x))), Power(Plus(Sqr(e),
                              Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))), CN1)),
                          x),
                      Simp(
                          Times(e, Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Cos(Plus(d, Times(e,
                                  x))),
                              Power(Plus(Sqr(e), Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))), CN1)),
                          x)),
                  And(FreeQ(List(FSymbol, a, b, c, d,
                      e), x), NeQ(Plus(Sqr(e), Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                          C0)))),
          IIntegrate(4433,
              Integrate(
                  Times(
                      Cos(Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                      Power(F_, Times(c_DEFAULT, Plus(a_DEFAULT, Times(b_DEFAULT, x_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(b, c, Log(FSymbol), Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Cos(Plus(d, Times(e, x))),
                              Power(Plus(Sqr(e), Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))), CN1)),
                          x),
                      Simp(
                          Times(e, Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Sin(Plus(d, Times(e, x))),
                              Power(Plus(Sqr(e), Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))), CN1)),
                          x)),
                  And(FreeQ(List(FSymbol, a, b, c, d,
                      e), x), NeQ(Plus(Sqr(e), Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                          C0)))),
          IIntegrate(4434,
              Integrate(
                  Times(
                      Power(F_, Times(c_DEFAULT, Plus(a_DEFAULT, Times(b_DEFAULT, x_)))), Power(
                          Sin(Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(b, c, Log(FSymbol), Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Power(Sin(Plus(d, Times(e, x))), n),
                              Power(
                                  Plus(Times(Sqr(e), Sqr(n)),
                                      Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                                  CN1)),
                          x),
                      Dist(
                          Times(n, Subtract(n, C1), Sqr(e),
                              Power(
                                  Plus(
                                      Times(Sqr(e), Sqr(n)), Times(Sqr(b), Sqr(c),
                                          Sqr(Log(FSymbol)))),
                                  CN1)),
                          Integrate(Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Power(Sin(Plus(d, Times(e, x))), Subtract(n, C2))), x),
                          x),
                      Negate(
                          Simp(Times(e, n, Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Cos(Plus(d, Times(e, x))),
                              Power(Sin(Plus(d, Times(e, x))), Subtract(n, C1)),
                              Power(Plus(Times(Sqr(e), Sqr(n)),
                                  Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))), CN1)),
                              x))),
                  And(FreeQ(List(FSymbol, a, b, c, d,
                      e), x), NeQ(
                          Plus(Times(Sqr(e), Sqr(n)),
                              Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                          C0),
                      GtQ(n, C1)))),
          IIntegrate(4435,
              Integrate(
                  Times(
                      Power(Cos(Plus(d_DEFAULT,
                          Times(e_DEFAULT, x_))), m_),
                      Power(F_, Times(c_DEFAULT, Plus(a_DEFAULT, Times(b_DEFAULT, x_))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(b, c, Log(FSymbol), Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Power(Cos(Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(Times(Sqr(e), Sqr(m)),
                                      Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                                  CN1)),
                          x),
                      Dist(
                          Times(m, Subtract(m, C1), Sqr(e),
                              Power(
                                  Plus(
                                      Times(Sqr(e), Sqr(m)), Times(Sqr(b), Sqr(c),
                                          Sqr(Log(FSymbol)))),
                                  CN1)),
                          Integrate(
                              Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                                  Power(Cos(Plus(d, Times(e, x))), Subtract(m, C2))),
                              x),
                          x),
                      Simp(
                          Times(e, m, Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Sin(Plus(d, Times(e, x))),
                              Power(Cos(Plus(d, Times(e, x))), Subtract(m, C1)),
                              Power(Plus(Times(Sqr(e), Sqr(m)),
                                  Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))), CN1)),
                          x)),
                  And(FreeQ(List(FSymbol, a, b, c, d, e), x),
                      NeQ(Plus(Times(Sqr(e), Sqr(m)), Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                          C0),
                      GtQ(m, C1)))),
          IIntegrate(4436,
              Integrate(
                  Times(
                      Power(F_, Times(c_DEFAULT, Plus(a_DEFAULT, Times(b_DEFAULT, x_)))), Power(
                          Sin(Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(
                          Times(b, c, Log(FSymbol), Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Power(Sin(Plus(d, Times(e, x))), Plus(n, C2)),
                              Power(Times(Sqr(e), Plus(n, C1), Plus(n, C2)), CN1)),
                          x)),
                      Simp(
                          Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Cos(Plus(d, Times(e, x))), Power(Sin(Plus(d, Times(e, x))),
                                  Plus(n, C1)),
                              Power(Times(e, Plus(n, C1)), CN1)),
                          x)),
                  And(FreeQ(List(FSymbol, a, b, c, d, e,
                      n), x), EqQ(
                          Plus(
                              Times(Sqr(e), Sqr(
                                  Plus(n, C2))),
                              Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                          C0),
                      NeQ(n, CN1), NeQ(n, CN2)))),
          IIntegrate(4437,
              Integrate(
                  Times(
                      Power(Cos(Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_), Power(F_, Times(
                          c_DEFAULT, Plus(a_DEFAULT, Times(b_DEFAULT, x_))))),
                  x_Symbol),
              Condition(
                  Subtract(Negate(
                      Simp(
                          Times(b, c, Log(FSymbol), Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Power(Cos(Plus(d, Times(e, x))), Plus(n, C2)),
                              Power(Times(Sqr(e), Plus(n, C1), Plus(n, C2)), CN1)),
                          x)),
                      Simp(
                          Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                              Sin(Plus(d, Times(e, x))),
                              Power(Cos(Plus(d, Times(e, x))),
                                  Plus(n, C1)),
                              Power(Times(e, Plus(n, C1)), CN1)),
                          x)),
                  And(FreeQ(List(FSymbol, a, b, c, d, e, n), x),
                      EqQ(Plus(Times(Sqr(e), Sqr(Plus(n, C2))),
                          Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))), C0),
                      NeQ(n, CN1), NeQ(n, CN2)))),
          IIntegrate(4438,
              Integrate(
                  Times(
                      Power(F_, Times(c_DEFAULT, Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_)))),
                      Power(Sin(Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_)),
                  x_Symbol),
              Condition(Plus(
                  Negate(
                      Simp(Times(b, c, Log(FSymbol), Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                          Power(Sin(Plus(d, Times(e, x))), Plus(n, C2)),
                          Power(Times(Sqr(e), Plus(n, C1), Plus(n, C2)), CN1)), x)),
                  Dist(
                      Times(
                          Plus(Times(Sqr(e), Sqr(Plus(n, C2))),
                              Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                          Power(Times(Sqr(e), Plus(n, C1), Plus(n, C2)), CN1)),
                      Integrate(Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                          Power(Sin(Plus(d, Times(e, x))), Plus(n, C2))), x),
                      x),
                  Simp(Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                      Cos(Plus(d, Times(e, x))), Power(Sin(Plus(d, Times(e, x))), Plus(n, C1)),
                      Power(Times(e, Plus(n, C1)), CN1)), x)),
                  And(FreeQ(List(FSymbol, a, b, c, d, e), x),
                      NeQ(Plus(Times(Sqr(e), Sqr(Plus(n, C2))),
                          Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))), C0),
                      LtQ(n, CN1), NeQ(n, CN2)))),
          IIntegrate(4439,
              Integrate(
                  Times(Power(Cos(Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_),
                      Power(F_, Times(c_DEFAULT, Plus(a_DEFAULT, Times(b_DEFAULT, x_))))),
                  x_Symbol),
              Condition(Plus(
                  Negate(
                      Simp(Times(b, c, Log(FSymbol), Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                          Power(Cos(Plus(d, Times(e, x))), Plus(n, C2)),
                          Power(Times(Sqr(e), Plus(n, C1), Plus(n, C2)), CN1)), x)),
                  Dist(
                      Times(
                          Plus(Times(Sqr(e), Sqr(Plus(n, C2))),
                              Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                          Power(Times(Sqr(e), Plus(n, C1), Plus(n, C2)), CN1)),
                      Integrate(Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                          Power(Cos(Plus(d, Times(e, x))), Plus(n, C2))), x),
                      x),
                  Negate(
                      Simp(Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                          Sin(Plus(d, Times(e, x))), Power(Cos(Plus(d, Times(e, x))), Plus(n, C1)),
                          Power(Times(e, Plus(n, C1)), CN1)), x))),
                  And(FreeQ(List(FSymbol, a, b, c, d,
                      e), x), NeQ(
                          Plus(
                              Times(Sqr(e), Sqr(
                                  Plus(n, C2))),
                              Times(Sqr(b), Sqr(c), Sqr(Log(FSymbol)))),
                          C0),
                      LtQ(n, CN1), NeQ(n, CN2)))),
          IIntegrate(4440,
              Integrate(
                  Times(
                      Power(F_, Times(c_DEFAULT, Plus(a_DEFAULT,
                          Times(b_DEFAULT, x_)))),
                      Power(Sin(Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Exp(Times(CI, n, Plus(d, Times(e, x)))),
                          Power(Sin(Plus(d, Times(e, x))), n),
                          Power(Power(Plus(CN1, Exp(Times(C2, CI, Plus(d, Times(e, x))))), n),
                              CN1)),
                      Integrate(Times(Power(FSymbol, Times(c, Plus(a, Times(b, x)))),
                          Power(Plus(CN1, Exp(Times(C2, CI, Plus(d, Times(e, x))))), n),
                          Power(Exp(Times(CI, n, Plus(d, Times(e, x)))), CN1)), x),
                      x),
                  And(FreeQ(List(FSymbol, a, b, c, d, e, n), x), Not(IntegerQ(n))))));
}
