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
class IntRules242 {
  public static IAST RULES =
      List(
          IIntegrate(
              4841, Integrate(ArcCos(
                  u_), x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(x,
                          ArcCos(u)), x),
                      Integrate(
                          SimplifyIntegrand(Times(x, D(u, x), Power(Subtract(C1, Sqr(u)), CN1D2)),
                              x),
                          x)),
                  And(InverseFunctionFreeQ(u, x), Not(FunctionOfExponentialQ(u, x))))),
          IIntegrate(4842,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcSin(u_),
                          b_DEFAULT)),
                      Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(Simp(
                      Times(Power(Plus(c, Times(d, x)), Plus(m, C1)), Plus(a, Times(b, ArcSin(u))),
                          Power(Times(d, Plus(m, C1)), CN1)),
                      x),
                      Dist(Times(b, Power(Times(d, Plus(m, C1)), CN1)),
                          Integrate(
                              SimplifyIntegrand(Times(Power(Plus(c, Times(d, x)), Plus(m, C1)),
                                  D(u, x), Power(Subtract(C1, Sqr(u)), CN1D2)), x),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, m), x), NeQ(m, CN1), InverseFunctionFreeQ(u, x),
                      Not(FunctionOfQ(Power(Plus(c, Times(d, x)), Plus(m, C1)), u, x)),
                      Not(FunctionOfExponentialQ(u, x))))),
          IIntegrate(4843,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCos(u_),
                          b_DEFAULT)),
                      Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(Plus(
                  Simp(Times(Power(Plus(c, Times(d, x)), Plus(m, C1)), Plus(a, Times(b, ArcCos(u))),
                      Power(Times(d, Plus(m, C1)), CN1)), x),
                  Dist(Times(b, Power(Times(d, Plus(m, C1)), CN1)),
                      Integrate(SimplifyIntegrand(Times(Power(Plus(c, Times(d, x)), Plus(m, C1)),
                          D(u, x), Power(Subtract(C1, Sqr(u)), CN1D2)), x), x),
                      x)),
                  And(FreeQ(List(a, b, c, d, m), x), NeQ(m, CN1), InverseFunctionFreeQ(u, x),
                      Not(FunctionOfQ(Power(Plus(c, Times(d,
                          x)), Plus(m,
                              C1)),
                          u, x)),
                      Not(FunctionOfExponentialQ(u, x))))),
          IIntegrate(4844,
              Integrate(Times(Plus(a_DEFAULT, Times(ArcSin(u_), b_DEFAULT)), v_), x_Symbol),
              Condition(
                  With(List(Set(w, IntHide(v, x))),
                      Condition(Subtract(Dist(Plus(a, Times(b, ArcSin(u))), w, x),
                          Dist(b,
                              Integrate(SimplifyIntegrand(
                                  Times(w, D(u, x), Power(Subtract(C1, Sqr(u)), CN1D2)), x), x),
                              x)),
                          InverseFunctionFreeQ(w, x))),
                  And(FreeQ(List(a,
                      b), x), InverseFunctionFreeQ(u, x), Not(
                          MatchQ(v,
                              Condition(
                                  Power(Plus(c_DEFAULT,
                                      Times(d_DEFAULT, x)), m_DEFAULT),
                                  FreeQ(List(c, d, m), x))))))),
          IIntegrate(4845,
              Integrate(Times(Plus(a_DEFAULT, Times(ArcCos(u_), b_DEFAULT)), v_), x_Symbol),
              Condition(
                  With(List(Set(w, IntHide(v, x))),
                      Condition(Plus(Dist(Plus(a, Times(b, ArcCos(u))), w, x),
                          Dist(b,
                              Integrate(SimplifyIntegrand(
                                  Times(w, D(u, x), Power(Subtract(C1, Sqr(u)), CN1D2)), x), x),
                              x)),
                          InverseFunctionFreeQ(w, x))),
                  And(FreeQ(List(a, b), x), InverseFunctionFreeQ(u, x),
                      Not(MatchQ(v,
                          Condition(Power(Plus(c_DEFAULT, Times(d_DEFAULT, x)), m_DEFAULT),
                              FreeQ(List(c, d, m), x))))))),
          IIntegrate(4846,
              Integrate(
                  Power(Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      p_DEFAULT),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(x,
                          Power(Plus(a, Times(b, ArcTan(Times(c, x)))), p)), x),
                      Dist(Times(b, c, p),
                          Integrate(
                              Times(x,
                                  Power(Plus(a, Times(b,
                                      ArcTan(Times(c, x)))), Subtract(p,
                                          C1)),
                                  Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), IGtQ(p, C0)))),
          IIntegrate(4847,
              Integrate(
                  Power(Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      p_DEFAULT),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(x,
                          Power(Plus(a, Times(b, ArcCot(Times(c, x)))), p)), x),
                      Dist(Times(b, c, p),
                          Integrate(
                              Times(x,
                                  Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Subtract(p,
                                      C1)),
                                  Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), IGtQ(p, C0)))),
          IIntegrate(4848,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(x_, CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(a,
                          Log(x)), x),
                      Dist(Times(C1D2, CI, b),
                          Integrate(Times(Log(Subtract(C1, Times(CI, c, x))), Power(x, CN1)),
                              x),
                          x),
                      Negate(
                          Dist(Times(C1D2, CI, b),
                              Integrate(Times(Log(Plus(C1,
                                  Times(CI, c, x))), Power(x,
                                      CN1)),
                                  x),
                              x))),
                  FreeQ(List(a, b, c), x))),
          IIntegrate(4849,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      Power(x_, CN1)),
                  x_Symbol),
              Condition(Plus(Simp(Times(a, Log(x)), x),
                  Dist(Times(C1D2, CI, b),
                      Integrate(Times(Log(Subtract(C1, Times(CI, Power(Times(c, x), CN1)))),
                          Power(x, CN1)), x),
                      x),
                  Negate(
                      Dist(Times(C1D2, CI, b),
                          Integrate(Times(Log(Plus(C1, Times(CI, Power(Times(c, x), CN1)))),
                              Power(x, CN1)), x),
                          x))),
                  FreeQ(List(a, b, c), x))),
          IIntegrate(4850,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)), p_),
                      Power(x_, CN1)),
                  x_Symbol),
              Condition(Subtract(
                  Simp(
                      Times(C2, Power(Plus(a, Times(b, ArcTan(Times(c, x)))), p),
                          ArcTanh(Subtract(C1, Times(C2, Power(Plus(C1, Times(CI, c, x)), CN1))))),
                      x),
                  Dist(Times(C2, b, c, p), Integrate(
                      Times(Power(Plus(a, Times(b, ArcTan(Times(c, x)))), Subtract(p, C1)),
                          ArcTanh(Subtract(C1, Times(C2, Power(Plus(C1, Times(CI, c, x)), CN1)))),
                          Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)),
                      x), x)),
                  And(FreeQ(List(a, b, c), x), IGtQ(p, C1)))),
          IIntegrate(4851,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT)), p_),
                      Power(x_, CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(C2, Power(Plus(a, Times(b, ArcCot(Times(c, x)))), p),
                              ArcCoth(Subtract(C1,
                                  Times(C2, Power(Plus(C1, Times(CI, c, x)), CN1))))),
                          x),
                      Dist(Times(C2, b, c, p),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Subtract(p,
                                      C1)),
                                  ArcCoth(Subtract(C1,
                                      Times(C2, Power(Plus(C1, Times(CI, c, x)), CN1)))),
                                  Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c), x), IGtQ(p, C1)))),
          IIntegrate(4852,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)), p_DEFAULT),
                      Power(Times(d_DEFAULT, x_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(Power(Times(d, x), Plus(m, C1)),
                          Power(Plus(a, Times(b, ArcTan(Times(c, x)))),
                              p),
                          Power(Times(d, Plus(m, C1)), CN1)), x),
                      Dist(Times(b, c, p, Power(Times(d, Plus(m, C1)), CN1)),
                          Integrate(Times(Power(Times(d, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, ArcTan(Times(c, x)))), Subtract(p, C1)), Power(
                                  Plus(C1, Times(Sqr(c), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, m), x), IGtQ(p, C0), Or(EqQ(p, C1), IntegerQ(m)),
                      NeQ(m, CN1)))),
          IIntegrate(4853,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          p_DEFAULT),
                      Power(Times(d_DEFAULT, x_), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Power(Times(d, x), Plus(m, C1)),
                          Power(Plus(a, Times(b, ArcCot(Times(c, x)))),
                              p),
                          Power(Times(d, Plus(m, C1)), CN1)), x),
                      Dist(
                          Times(b, c, p, Power(Times(d, Plus(m, C1)),
                              CN1)),
                          Integrate(Times(Power(Times(d, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Subtract(p, C1)),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, m), x), IGtQ(p, C0), Or(EqQ(p, C1), IntegerQ(m)),
                      NeQ(m, CN1)))),
          IIntegrate(4854,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Plus(a, Times(b, ArcTan(Times(c, x)))), p),
                                  Log(Times(C2,
                                      Power(Plus(C1, Times(e, x, Power(d, CN1))), CN1))),
                                  Power(e, CN1)),
                              x)),
                      Dist(Times(b, c, p, Power(e, CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, ArcTan(Times(c, x)))), Subtract(p, C1)),
                                  Log(Times(C2, Power(Plus(C1, Times(e, x, Power(d, CN1))), CN1))),
                                  Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d,
                      e), x), IGtQ(p,
                          C0),
                      EqQ(Plus(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
          IIntegrate(4855,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT)),
                          p_DEFAULT),
                      Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(Power(Plus(a, Times(b, ArcCot(Times(c, x)))), p),
                                  Log(Times(C2,
                                      Power(Plus(C1, Times(e, x, Power(d, CN1))), CN1))),
                                  Power(e, CN1)),
                              x)),
                      Dist(
                          Times(b, c, p, Power(e, CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, ArcCot(Times(c, x)))), Subtract(p, C1)),
                                  Log(Times(C2, Power(Plus(C1, Times(e, x, Power(d, CN1))), CN1))),
                                  Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d,
                      e), x), IGtQ(p,
                          C0),
                      EqQ(Plus(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
          IIntegrate(4856,
              Integrate(
                  Times(Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), Power(Plus(d_, Times(e_DEFAULT, x_)),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Plus(a, Times(b, ArcTan(Times(c, x)))),
                                  Log(Times(C2,
                                      Power(Subtract(C1, Times(CI, c, x)), CN1))),
                                  Power(e, CN1)),
                              x)),
                      Dist(
                          Times(b, c, Power(e,
                              CN1)),
                          Integrate(
                              Times(
                                  Log(Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1))), Power(
                                      Plus(C1, Times(Sqr(c), Sqr(x))), CN1)),
                              x),
                          x),
                      Negate(Dist(Times(b, c, Power(e, CN1)), Integrate(Times(
                          Log(Times(C2, c, Plus(d, Times(e, x)),
                              Power(Times(Plus(Times(c, d), Times(CI, e)),
                                  Subtract(C1, Times(CI, c, x))), CN1))),
                          Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)), x), x)),
                      Simp(
                          Times(Plus(a, Times(b, ArcTan(Times(c, x)))),
                              Log(Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), Times(CI, e)),
                                      Subtract(C1, Times(CI, c, x))), CN1))),
                              Power(e, CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Plus(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
          IIntegrate(4857,
              Integrate(
                  Times(
                      Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)),
                          b_DEFAULT)),
                      Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Plus(a, Times(b, ArcCot(Times(c, x)))),
                                  Log(Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1))), Power(
                                      e, CN1)),
                              x)),
                      Negate(Dist(Times(b, c, Power(e, CN1)),
                          Integrate(Times(Log(Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1))),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)), x),
                          x)),
                      Dist(Times(b, c, Power(e, CN1)),
                          Integrate(Times(
                              Log(Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), Times(CI, e)),
                                      Subtract(C1, Times(CI, c, x))), CN1))),
                              Power(Plus(C1, Times(Sqr(c), Sqr(x))), CN1)), x),
                          x),
                      Simp(
                          Times(Plus(a, Times(b, ArcCot(Times(c, x)))),
                              Log(Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), Times(CI, e)),
                                      Subtract(C1, Times(CI, c, x))), CN1))),
                              Power(e, CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Plus(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
          IIntegrate(4858,
              Integrate(
                  Times(Sqr(Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT))),
                      Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(Times(Sqr(Plus(a, Times(b, ArcTan(Times(c, x))))),
                              Log(Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1))), Power(e,
                                  CN1)),
                              x)),
                      Simp(Times(Sqr(Plus(a, Times(b, ArcTan(Times(c, x))))),
                          Log(Times(C2, c, Plus(d, Times(e, x)),
                              Power(Times(Plus(Times(c, d), Times(CI, e)),
                                  Subtract(C1, Times(CI, c, x))), CN1))),
                          Power(e, CN1)), x),
                      Simp(
                          Times(
                              CI, b, Plus(a, Times(b,
                                  ArcTan(Times(c, x)))),
                              PolyLog(C2,
                                  Subtract(C1,
                                      Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1)))),
                              Power(e, CN1)),
                          x),
                      Negate(Simp(
                          Times(CI, b, Plus(a, Times(b, ArcTan(Times(c, x)))),
                              PolyLog(C2,
                                  Subtract(C1, Times(C2, c, Plus(d, Times(e, x)),
                                      Power(Times(Plus(Times(c, d), Times(CI, e)),
                                          Subtract(C1, Times(CI, c, x))), CN1)))),
                              Power(e, CN1)),
                          x)),
                      Negate(Simp(Times(
                          Sqr(b),
                          PolyLog(
                              C3,
                              Subtract(C1, Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1)))),
                          Power(Times(C2, e), CN1)), x)),
                      Simp(Times(Sqr(b),
                          PolyLog(C3, Subtract(C1,
                              Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), Times(CI, e)),
                                      Subtract(C1, Times(CI, c, x))), CN1)))),
                          Power(Times(C2, e), CN1)), x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Plus(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
          IIntegrate(4859,
              Integrate(Times(
                  Sqr(Plus(a_DEFAULT, Times(ArcCot(Times(c_DEFAULT, x_)), b_DEFAULT))),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)), x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(Plus(a, Times(b, ArcCot(Times(c, x))))),
                                  Log(Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1))),
                                  Power(e, CN1)),
                              x)),
                      Simp(
                          Times(
                              Sqr(Plus(a,
                                  Times(b, ArcCot(Times(c, x))))),
                              Log(Times(
                                  C2, c, Plus(d, Times(e,
                                      x)),
                                  Power(
                                      Times(
                                          Plus(Times(c, d), Times(CI, e)), Subtract(C1,
                                              Times(CI, c, x))),
                                      CN1))),
                              Power(e, CN1)),
                          x),
                      Negate(
                          Simp(
                              Times(CI, b, Plus(a, Times(b, ArcCot(Times(c, x)))),
                                  PolyLog(C2,
                                      Subtract(C1,
                                          Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1)))),
                                  Power(e, CN1)),
                              x)),
                      Simp(
                          Times(
                              CI, b, Plus(a, Times(b,
                                  ArcCot(Times(c, x)))),
                              PolyLog(C2,
                                  Subtract(C1,
                                      Times(
                                          C2, c, Plus(d, Times(e,
                                              x)),
                                          Power(
                                              Times(Plus(Times(c, d), Times(CI, e)),
                                                  Subtract(C1, Times(CI, c, x))),
                                              CN1)))),
                              Power(e, CN1)),
                          x),
                      Negate(Simp(Times(
                          Sqr(b),
                          PolyLog(
                              C3,
                              Subtract(C1, Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1)))),
                          Power(Times(C2, e), CN1)), x)),
                      Simp(Times(Sqr(b),
                          PolyLog(C3,
                              Subtract(C1,
                                  Times(C2, c, Plus(d, Times(e, x)),
                                      Power(Times(Plus(Times(c, d), Times(CI, e)),
                                          Subtract(C1, Times(CI, c, x))), CN1)))),
                          Power(Times(C2, e), CN1)), x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Plus(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
          IIntegrate(4860,
              Integrate(Times(
                  Power(Plus(a_DEFAULT, Times(ArcTan(Times(c_DEFAULT, x_)), b_DEFAULT)), C3),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)), x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(Plus(a, Times(b, ArcTan(Times(c, x)))), C3),
                                  Log(Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1))), Power(
                                      e, CN1)),
                              x)),
                      Simp(Times(Power(Plus(a, Times(b, ArcTan(Times(c, x)))), C3),
                          Log(Times(C2, c, Plus(d, Times(e, x)),
                              Power(Times(Plus(Times(c, d), Times(CI, e)),
                                  Subtract(C1, Times(CI, c, x))), CN1))),
                          Power(e, CN1)), x),
                      Simp(
                          Times(
                              C3, CI, b, Sqr(Plus(a,
                                  Times(b, ArcTan(Times(c, x))))),
                              PolyLog(C2,
                                  Subtract(
                                      C1, Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1)))),
                              Power(Times(C2, e), CN1)),
                          x),
                      Negate(
                          Simp(
                              Times(C3, CI, b, Sqr(Plus(a, Times(b, ArcTan(Times(c, x))))),
                                  PolyLog(C2,
                                      Subtract(C1,
                                          Times(C2, c, Plus(d, Times(e, x)),
                                              Power(
                                                  Times(Plus(Times(c, d), Times(CI, e)),
                                                      Subtract(C1, Times(CI, c, x))),
                                                  CN1)))),
                                  Power(Times(C2, e), CN1)),
                              x)),
                      Negate(
                          Simp(
                              Times(C3, Sqr(b), Plus(a, Times(b, ArcTan(Times(c, x)))),
                                  PolyLog(C3,
                                      Subtract(C1,
                                          Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1)))),
                                  Power(Times(C2, e), CN1)),
                              x)),
                      Simp(
                          Times(
                              C3, Sqr(b), Plus(a, Times(b,
                                  ArcTan(Times(c, x)))),
                              PolyLog(C3,
                                  Subtract(C1,
                                      Times(C2, c, Plus(d, Times(e, x)),
                                          Power(
                                              Times(Plus(Times(c, d), Times(CI, e)),
                                                  Subtract(C1, Times(CI, c, x))),
                                              CN1)))),
                              Power(Times(C2, e), CN1)),
                          x),
                      Negate(Simp(Times(
                          C3, CI, Power(b, C3),
                          PolyLog(
                              C4,
                              Subtract(C1, Times(C2, Power(Subtract(C1, Times(CI, c, x)), CN1)))),
                          Power(Times(C4, e), CN1)), x)),
                      Simp(Times(C3, CI, Power(b, C3),
                          PolyLog(C4,
                              Subtract(C1,
                                  Times(C2, c, Plus(d, Times(e, x)),
                                      Power(Times(Plus(Times(c, d), Times(CI, e)),
                                          Subtract(C1, Times(CI, c, x))), CN1)))),
                          Power(Times(C4, e), CN1)), x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Plus(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))));
}
