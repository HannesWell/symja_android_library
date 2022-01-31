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
class IntRules296 {
  public static IAST RULES = List(
      IIntegrate(5921,
          Integrate(Times(
              Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)),
                  b_DEFAULT)),
              Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)), x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(
                          Times(
                              Plus(a, Times(b, ArcCoth(Times(c, x)))),
                              Log(Times(C2, Power(Plus(C1, Times(c, x)), CN1))), Power(e, CN1)),
                          x)),
                  Dist(Times(b, c, Power(e, CN1)),
                      Integrate(
                          Times(
                              Log(Times(C2, Power(Plus(C1, Times(c, x)),
                                  CN1))),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)),
                          x),
                      x),
                  Negate(
                      Dist(
                          Times(b, c, Power(e,
                              CN1)),
                          Integrate(Times(
                              Log(Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1))),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)), x),
                          x)),
                  Simp(
                      Times(Plus(a, Times(b, ArcCoth(Times(c, x)))),
                          Log(Times(C2, c, Plus(d, Times(e, x)),
                              Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1))),
                          Power(e, CN1)),
                      x)),
              And(FreeQ(List(a, b, c, d, e), x),
                  NeQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
      IIntegrate(5922,
          Integrate(Times(Sqr(Plus(a_DEFAULT, Times(ArcTanh(Times(c_DEFAULT, x_)), b_DEFAULT))),
              Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)), x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(
                          Times(Sqr(Plus(a, Times(b, ArcTanh(Times(c, x))))), Log(Times(
                              C2, Power(Plus(C1, Times(c, x)), CN1))), Power(e,
                                  CN1)),
                          x)),
                  Simp(
                      Times(Sqr(Plus(a, Times(b, ArcTanh(Times(c, x))))),
                          Log(Times(C2, c, Plus(d, Times(e, x)), Power(
                              Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1))),
                          Power(e, CN1)),
                      x),
                  Simp(
                      Times(b, Plus(a, Times(b, ArcTanh(Times(c, x)))),
                          PolyLog(C2, Subtract(C1, Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                          Power(e, CN1)),
                      x),
                  Negate(
                      Simp(Times(b, Plus(a, Times(b, ArcTanh(Times(c, x)))),
                          PolyLog(C2,
                              Subtract(C1,
                                  Times(C2, c, Plus(d, Times(e, x)),
                                      Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))),
                                          CN1)))),
                          Power(e, CN1)), x)),
                  Simp(Times(Sqr(b),
                      PolyLog(C3, Subtract(C1, Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                      Power(Times(C2, e), CN1)), x),
                  Negate(
                      Simp(Times(Sqr(b),
                          PolyLog(C3, Subtract(C1,
                              Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1)))),
                          Power(Times(C2, e), CN1)), x))),
              And(FreeQ(List(a, b, c, d, e), x),
                  NeQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
      IIntegrate(5923,
          Integrate(Times(Sqr(Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)), b_DEFAULT))),
              Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)), x_Symbol),
          Condition(
              Plus(
                  Negate(Simp(
                      Times(Sqr(Plus(a, Times(b, ArcCoth(Times(c,
                          x))))), Log(Times(
                              C2, Power(Plus(C1, Times(c, x)), CN1))),
                          Power(e, CN1)),
                      x)),
                  Simp(Times(Sqr(Plus(a, Times(b, ArcCoth(Times(c, x))))),
                      Log(Times(C2, c, Plus(d, Times(e, x)),
                          Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1))),
                      Power(e, CN1)), x),
                  Simp(
                      Times(b, Plus(a, Times(b, ArcCoth(Times(c, x)))),
                          PolyLog(C2, Subtract(C1, Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                          Power(e, CN1)),
                      x),
                  Negate(
                      Simp(Times(b, Plus(a, Times(b, ArcCoth(Times(c, x)))),
                          PolyLog(C2,
                              Subtract(C1,
                                  Times(C2, c, Plus(d, Times(e, x)),
                                      Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))),
                                          CN1)))),
                          Power(e, CN1)), x)),
                  Simp(
                      Times(Sqr(b),
                          PolyLog(C3, Subtract(C1,
                              Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                          Power(Times(C2, e), CN1)),
                      x),
                  Negate(
                      Simp(Times(Sqr(b),
                          PolyLog(C3,
                              Subtract(C1,
                                  Times(C2, c, Plus(d, Times(e, x)),
                                      Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))),
                                          CN1)))),
                          Power(Times(C2, e), CN1)), x))),
              And(FreeQ(List(a, b, c, d, e), x),
                  NeQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
      IIntegrate(5924,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT,
                      Times(ArcTanh(Times(c_DEFAULT, x_)), b_DEFAULT)), C3),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
              x_Symbol),
          Condition(Plus(
              Negate(
                  Simp(
                      Times(
                          Power(Plus(a, Times(b, ArcTanh(Times(c, x)))), C3),
                          Log(Times(C2, Power(Plus(C1, Times(c, x)), CN1))), Power(e, CN1)),
                      x)),
              Simp(
                  Times(
                      Power(Plus(a,
                          Times(b, ArcTanh(Times(c, x)))), C3),
                      Log(Times(C2, c, Plus(d, Times(e, x)),
                          Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1))),
                      Power(e, CN1)),
                  x),
              Simp(
                  Times(C3, b, Sqr(Plus(a, Times(b, ArcTanh(Times(c, x))))),
                      PolyLog(C2, Subtract(C1,
                          Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                      Power(Times(C2, e), CN1)),
                  x),
              Negate(
                  Simp(
                      Times(C3, b, Sqr(Plus(a, Times(b, ArcTanh(Times(c, x))))),
                          PolyLog(C2,
                              Subtract(C1,
                                  Times(C2, c, Plus(d, Times(e, x)),
                                      Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))),
                                          CN1)))),
                          Power(Times(C2, e), CN1)),
                      x)),
              Simp(
                  Times(C3, Sqr(b), Plus(a, Times(b, ArcTanh(Times(c, x)))),
                      PolyLog(C3, Subtract(C1,
                          Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                      Power(Times(C2, e), CN1)),
                  x),
              Negate(
                  Simp(
                      Times(C3, Sqr(b), Plus(a, Times(b, ArcTanh(Times(c, x)))),
                          PolyLog(C3,
                              Subtract(C1,
                                  Times(C2, c, Plus(d, Times(e, x)),
                                      Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))),
                                          CN1)))),
                          Power(Times(C2, e), CN1)),
                      x)),
              Simp(Times(C3, Power(b, C3),
                  PolyLog(C4, Subtract(C1, Times(C2, Power(Plus(C1, Times(c, x)), CN1)))), Power(
                      Times(C4, e), CN1)),
                  x),
              Negate(
                  Simp(
                      Times(C3, Power(b, C3),
                          PolyLog(C4, Subtract(C1,
                              Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1)))),
                          Power(Times(C4, e), CN1)),
                      x))),
              And(FreeQ(List(a, b, c, d, e), x),
                  NeQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
      IIntegrate(5925,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      C3),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(
                          Times(
                              Power(Plus(a, Times(b, ArcCoth(Times(c, x)))), C3),
                              Log(Times(C2, Power(Plus(C1, Times(c, x)), CN1))), Power(e, CN1)),
                          x)),
                  Simp(
                      Times(
                          Power(Plus(a,
                              Times(b, ArcCoth(Times(c, x)))), C3),
                          Log(Times(C2, c, Plus(d, Times(e, x)),
                              Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1))),
                          Power(e, CN1)),
                      x),
                  Simp(Times(C3, b, Sqr(Plus(a, Times(b, ArcCoth(Times(c, x))))),
                      PolyLog(C2, Subtract(C1, Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                      Power(Times(C2, e), CN1)), x),
                  Negate(Simp(Times(C3, b, Sqr(Plus(a, Times(b, ArcCoth(Times(c, x))))),
                      PolyLog(C2,
                          Subtract(C1,
                              Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1)))),
                      Power(Times(C2, e), CN1)), x)),
                  Simp(Times(C3, Sqr(b), Plus(a, Times(b, ArcCoth(Times(c, x)))),
                      PolyLog(C3, Subtract(C1,
                          Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                      Power(Times(C2, e), CN1)), x),
                  Negate(
                      Simp(
                          Times(C3, Sqr(b), Plus(a, Times(b, ArcCoth(Times(c, x)))),
                              PolyLog(C3,
                                  Subtract(C1,
                                      Times(C2, c, Plus(d, Times(e, x)),
                                          Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))),
                                              CN1)))),
                              Power(Times(C2, e), CN1)),
                          x)),
                  Simp(Times(C3, Power(b, C3),
                      PolyLog(C4, Subtract(C1, Times(C2, Power(Plus(C1, Times(c, x)), CN1)))),
                      Power(Times(C4, e), CN1)), x),
                  Negate(
                      Simp(Times(C3, Power(b, C3),
                          PolyLog(C4, Subtract(C1,
                              Times(C2, c, Plus(d, Times(e, x)),
                                  Power(Times(Plus(Times(c, d), e), Plus(C1, Times(c, x))), CN1)))),
                          Power(Times(C4, e), CN1)), x))),
              And(FreeQ(List(a, b, c, d, e), x),
                  NeQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
      IIntegrate(5926,
          Integrate(
              Times(
                  Plus(a_DEFAULT, Times(ArcTanh(Times(c_DEFAULT, x_)), b_DEFAULT)), Power(
                      Plus(d_, Times(e_DEFAULT, x_)), q_DEFAULT)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(Power(Plus(d, Times(e, x)), Plus(q, C1)),
                          Plus(a, Times(b, ArcTanh(Times(c, x)))), Power(Times(e, Plus(q, C1)),
                              CN1)),
                      x),
                  Dist(
                      Times(b, c, Power(Times(e, Plus(q, C1)),
                          CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), Plus(q, C1)), Power(
                              Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, q), x), NeQ(q, CN1)))),
      IIntegrate(5927,
          Integrate(
              Times(
                  Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)),
                      b_DEFAULT)),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), q_DEFAULT)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(Times(Power(Plus(d, Times(e, x)), Plus(q, C1)), Plus(a,
                      Times(b, ArcCoth(Times(c, x)))), Power(Times(e, Plus(q, C1)), CN1)), x),
                  Dist(Times(b, c, Power(Times(e, Plus(q, C1)), CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), Plus(q, C1)),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, q), x), NeQ(q, CN1)))),
      IIntegrate(5928,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT,
                      Times(ArcTanh(Times(c_DEFAULT, x_)), b_DEFAULT)), p_),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), q_DEFAULT)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(Power(Plus(d, Times(e, x)), Plus(q, C1)),
                          Power(Plus(a,
                              Times(b, ArcTanh(Times(c, x)))), p),
                          Power(Times(e, Plus(q, C1)), CN1)),
                      x),
                  Dist(Times(b, c, p, Power(Times(e, Plus(q, C1)), CN1)),
                      Integrate(ExpandIntegrand(
                          Power(Plus(a, Times(b, ArcTanh(Times(c, x)))), Subtract(p, C1)),
                          Times(Power(Plus(d, Times(e, x)), Plus(q, C1)),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)),
                          x), x),
                      x)),
              And(FreeQ(List(a, b, c, d, e), x), IGtQ(p, C1), IntegerQ(q), NeQ(q, CN1)))),
      IIntegrate(5929,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT,
                      Times(ArcCoth(Times(c_DEFAULT, x_)), b_DEFAULT)), p_),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), q_DEFAULT)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(Power(Plus(d, Times(e, x)), Plus(q, C1)),
                          Power(Plus(a, Times(b, ArcCoth(Times(c, x)))),
                              p),
                          Power(Times(e, Plus(q, C1)), CN1)),
                      x),
                  Dist(
                      Times(b, c, p, Power(Times(e, Plus(q, C1)),
                          CN1)),
                      Integrate(
                          ExpandIntegrand(
                              Power(Plus(a, Times(b, ArcCoth(Times(c, x)))), Subtract(p, C1)),
                              Times(
                                  Power(Plus(d, Times(e, x)), Plus(q, C1)), Power(
                                      Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)),
                              x),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e), x), IGtQ(p, C1), IntegerQ(q), NeQ(q, CN1)))),
      IIntegrate(5930,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcTanh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), p_DEFAULT),
                  Power(Times(f_DEFAULT,
                      x_), m_DEFAULT),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(Times(f, Power(e, CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Subtract(m, C1)),
                              Power(Plus(a, Times(b, ArcTanh(Times(c, x)))), p)),
                          x),
                      x),
                  Dist(
                      Times(d, f, Power(e,
                          CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Subtract(m, C1)),
                              Power(Plus(a, Times(b, ArcTanh(Times(c, x)))),
                                  p),
                              Power(Plus(d, Times(e, x)), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(p, C0), EqQ(Subtract(Times(Sqr(c), Sqr(d)),
                  Sqr(e)), C0), GtQ(m,
                      C0)))),
      IIntegrate(5931,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), p_DEFAULT),
                  Power(Times(f_DEFAULT,
                      x_), m_DEFAULT),
                  Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
              x_Symbol),
          Condition(
              Subtract(Dist(Times(f, Power(e, CN1)),
                  Integrate(Times(Power(Times(f, x), Subtract(m, C1)),
                      Power(Plus(a, Times(b, ArcCoth(Times(c, x)))), p)), x),
                  x),
                  Dist(Times(d, f, Power(e, CN1)),
                      Integrate(Times(Power(Times(f, x), Subtract(m, C1)),
                          Power(Plus(a, Times(b, ArcCoth(Times(c, x)))), p),
                          Power(Plus(d, Times(e, x)), CN1)), x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(p, C0), EqQ(Subtract(Times(Sqr(c), Sqr(d)),
                  Sqr(e)), C0), GtQ(m,
                      C0)))),
      IIntegrate(5932,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcTanh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      p_DEFAULT),
                  Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(
                          Power(Plus(a, Times(b, ArcTanh(Times(c, x)))), p), Log(
                              Subtract(C2, Times(C2,
                                  Power(Plus(C1, Times(e, x, Power(d, CN1))), CN1)))),
                          Power(d, CN1)),
                      x),
                  Dist(
                      Times(b, c, p, Power(d,
                          CN1)),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b, ArcTanh(Times(c, x)))), Subtract(p, C1)), Log(
                                  Subtract(C2, Times(C2,
                                      Power(Plus(C1, Times(e, x, Power(d, CN1))), CN1)))),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d,
                  e), x), IGtQ(p,
                      C0),
                  EqQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
      IIntegrate(5933,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)), b_DEFAULT)),
                      p_DEFAULT),
                  Power(x_, CN1), Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(
                          Power(Plus(a,
                              Times(b, ArcCoth(Times(c, x)))), p),
                          Log(Subtract(C2,
                              Times(C2, Power(Plus(C1, Times(e, x, Power(d, CN1))), CN1)))),
                          Power(d, CN1)),
                      x),
                  Dist(Times(b, c, p, Power(d, CN1)),
                      Integrate(
                          Times(Power(Plus(a, Times(b, ArcCoth(Times(c, x)))), Subtract(p, C1)),
                              Log(Subtract(C2,
                                  Times(C2, Power(Plus(C1, Times(e, x, Power(d, CN1))), CN1)))),
                              Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d,
                  e), x), IGtQ(p,
                      C0),
                  EqQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0)))),
      IIntegrate(5934,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcTanh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), p_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(Power(d, CN1),
                      Integrate(
                          Times(Power(Times(f, x), m),
                              Power(Plus(a, Times(b, ArcTanh(Times(c, x)))), p)),
                          x),
                      x),
                  Dist(
                      Times(e, Power(Times(d, f),
                          CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, ArcTanh(Times(c, x)))),
                                  p),
                              Power(Plus(d, Times(e, x)), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(p, C0), EqQ(Subtract(Times(Sqr(c), Sqr(d)),
                  Sqr(e)), C0), LtQ(m,
                      CN1)))),
      IIntegrate(5935,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), p_DEFAULT),
                  Power(Times(f_DEFAULT, x_), m_), Power(Plus(d_, Times(e_DEFAULT, x_)), CN1)),
              x_Symbol),
          Condition(
              Subtract(Dist(Power(d, CN1),
                  Integrate(
                      Times(Power(Times(f, x), m),
                          Power(Plus(a, Times(b, ArcCoth(Times(c, x)))), p)),
                      x),
                  x),
                  Dist(Times(e, Power(Times(d, f), CN1)),
                      Integrate(
                          Times(Power(Times(f, x), Plus(m, C1)),
                              Power(Plus(a, Times(b, ArcCoth(Times(c, x)))),
                                  p),
                              Power(Plus(d, Times(e, x)), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(p, C0), EqQ(Subtract(Times(Sqr(c), Sqr(
                  d)), Sqr(
                      e)),
                  C0), LtQ(m, CN1)))),
      IIntegrate(5936,
          Integrate(
              Times(Plus(a_DEFAULT, Times(ArcTanh(Times(c_DEFAULT, x_)), b_DEFAULT)),
                  Power(Times(f_DEFAULT,
                      x_), m_DEFAULT),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), q_DEFAULT)),
              x_Symbol),
          Condition(With(
              List(
                  Set(u, IntHide(Times(Power(Times(f, x), m), Power(Plus(d, Times(e, x)), q)), x))),
              Subtract(Dist(Plus(a, Times(b, ArcTanh(Times(c, x)))), u, x), Dist(Times(b, c),
                  Integrate(SimplifyIntegrand(
                      Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)), x), x),
                  x))),
              And(FreeQ(List(a, b, c, d, e, f, q), x), NeQ(q, CN1), IntegerQ(Times(C2,
                  m)), Or(
                      And(IGtQ(m, C0), IGtQ(q,
                          C0)),
                      And(ILtQ(Plus(m, q, C1), C0), LtQ(Times(m, q), C0)))))),
      IIntegrate(5937,
          Integrate(
              Times(Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)), b_DEFAULT)),
                  Power(Times(f_DEFAULT,
                      x_), m_DEFAULT),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), q_DEFAULT)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(u,
                          IntHide(Times(Power(Times(f, x), m), Power(Plus(d, Times(e, x)), q)),
                              x))),
                  Subtract(Dist(Plus(a, Times(b, ArcCoth(Times(c, x)))), u, x),
                      Dist(Times(b, c),
                          Integrate(
                              SimplifyIntegrand(
                                  Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)), x),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, q), x), NeQ(q, CN1), IntegerQ(Times(C2,
                  m)), Or(
                      And(IGtQ(m, C0), IGtQ(q,
                          C0)),
                      And(ILtQ(Plus(m, q, C1), C0), LtQ(Times(m, q), C0)))))),
      IIntegrate(5938,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcTanh(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), p_),
                  Power(Times(f_DEFAULT,
                      x_), m_DEFAULT),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), q_)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(u,
                          IntHide(Times(Power(Times(f, x), m), Power(Plus(d, Times(e, x)), q)),
                              x))),
                  Subtract(
                      Dist(Power(Plus(a, Times(b, ArcTanh(Times(c, x)))),
                          p), u, x),
                      Dist(Times(b, c, p),
                          Integrate(
                              ExpandIntegrand(Power(
                                  Plus(a, Times(b, ArcTanh(Times(c, x)))), Subtract(p, C1)),
                                  Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)), x),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, q),
                  x), IGtQ(p, C1), EqQ(Subtract(Times(Sqr(c), Sqr(d)), Sqr(e)), C0),
                  IntegersQ(m, q), NeQ(m, CN1), NeQ(q, CN1), ILtQ(Plus(m, q, C1),
                      C0),
                  LtQ(Times(m, q), C0)))),
      IIntegrate(5939,
          Integrate(
              Times(
                  Power(Plus(a_DEFAULT, Times(ArcCoth(Times(c_DEFAULT, x_)),
                      b_DEFAULT)), p_),
                  Power(Times(f_DEFAULT,
                      x_), m_DEFAULT),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), q_)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(u,
                          IntHide(Times(Power(Times(f, x), m), Power(Plus(d, Times(e, x)), q)),
                              x))),
                  Subtract(
                      Dist(Power(Plus(a, Times(b, ArcCoth(Times(c, x)))),
                          p), u, x),
                      Dist(Times(b, c, p),
                          Integrate(ExpandIntegrand(
                              Power(Plus(a, Times(b, ArcCoth(Times(c, x)))), Subtract(p, C1)),
                              Times(u, Power(Subtract(C1, Times(Sqr(c), Sqr(x))), CN1)), x), x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, q), x), IGtQ(p, C1),
                  EqQ(Subtract(Times(Sqr(c), Sqr(
                      d)), Sqr(
                          e)),
                      C0),
                  IntegersQ(m, q), NeQ(m, CN1), NeQ(q, CN1), ILtQ(Plus(m, q,
                      C1), C0),
                  LtQ(Times(m, q), C0)))),
      IIntegrate(5940, Integrate(
          Times(Power(Plus(a_DEFAULT, Times(ArcTanh(Times(c_DEFAULT, x_)), b_DEFAULT)), p_DEFAULT),
              Power(Times(f_DEFAULT, x_), m_DEFAULT),
              Power(Plus(d_, Times(e_DEFAULT, x_)), q_DEFAULT)),
          x_Symbol),
          Condition(
              Integrate(ExpandIntegrand(Power(Plus(a, Times(b, ArcTanh(Times(c, x)))), p),
                  Times(Power(Times(f, x), m), Power(Plus(d, Times(e, x)), q)), x), x),
              And(FreeQ(List(a, b, c, d, e, f, m), x), IGtQ(p, C0), IntegerQ(q),
                  Or(GtQ(q, C0), NeQ(a, C0), IntegerQ(m))))));
}
