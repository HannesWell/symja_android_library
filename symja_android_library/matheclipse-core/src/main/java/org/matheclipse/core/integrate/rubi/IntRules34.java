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
class IntRules34 {
  public static IAST RULES = List(
      IIntegrate(681,
          Integrate(Times(
              Power(Plus(d_, Times(e_DEFAULT, x_)), CN1),
              Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1)),
              x_Symbol),
          Condition(Plus(
              Dist(Times(CN4, b, c, Power(Times(d, Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                  Integrate(Power(Plus(b, Times(C2, c, x)), CN1), x), x),
              Dist(Times(Sqr(b), Power(Times(Sqr(d), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                  Integrate(Times(Plus(d, Times(e, x)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)), x),
                  x)),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0)))),
      IIntegrate(682,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Simp(
                  Times(C2, c, Power(Plus(d, Times(e, x)), Plus(m, C1)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)), Power(
                          Times(e, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, p), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0), EqQ(Plus(m, Times(C2, p),
                      C3), C0),
                  NeQ(p, CN1)))),
      IIntegrate(683,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT,
                      Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(
                      Times(
                          Power(Plus(d,
                              Times(e, x)), m),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d),
                      Times(b, e)), C0),
                  IGtQ(p, C0), Not(And(EqQ(m, C3), NeQ(p, C1)))))),
      IIntegrate(684,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                          Power(Times(e, Plus(m, C1)), CN1)),
                      x),
                  Dist(Times(b, p, Power(Times(d, e, Plus(m, C1)), CN1)),
                      Integrate(
                          Times(
                              Power(Plus(d, Times(e, x)), Plus(m, C2)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1))),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0),
                  NeQ(Plus(m, Times(C2, p), C3), C0), GtQ(p, C0), LtQ(m, CN1),
                  Not(And(IntegerQ(Times(C1D2, m)),
                      LtQ(Plus(m, Times(C2, p), C3), C0))),
                  IntegerQ(Times(C2, p))))),
      IIntegrate(685,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                          Power(Times(e, Plus(m, Times(C2, p), C1)), CN1)),
                      x),
                  Dist(
                      Times(d, p, Subtract(Sqr(b), Times(C4, a, c)),
                          Power(Times(b, e, Plus(m, Times(C2, p), C1)), CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1))),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0),
                  NeQ(Plus(m, Times(C2, p), C3), C0), GtQ(p, C0), Not(LtQ(m,
                      CN1)),
                  Not(And(IGtQ(Times(C1D2, Subtract(m, C1)), C0),
                      Or(Not(IntegerQ(p)), LtQ(m, Times(C2, p))))),
                  RationalQ(m), IntegerQ(Times(C2, p))))),
      IIntegrate(686,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(d, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))),
                              Plus(p, C1)),
                          Power(Times(b, Plus(p, C1)), CN1)),
                      x),
                  Dist(
                      Times(d, e, Subtract(m, C1), Power(Times(b, Plus(p, C1)),
                          CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1))),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0),
                  NeQ(Plus(m, Times(C2, p),
                      C3), C0),
                  LtQ(p, CN1), GtQ(m, C1), IntegerQ(Times(C2, p))))),
      IIntegrate(687, Integrate(
          Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
              Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
          x_Symbol),
          Condition(
              Subtract(
                  Simp(Times(C2, c, Power(Plus(d, Times(e, x)), Plus(m, C1)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                      Power(Times(e, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)), x),
                  Dist(
                      Times(C2, c, e, Plus(m, Times(C2, p), C3),
                          Power(Times(e, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                      Integrate(Times(Power(Plus(d, Times(e, x)), m),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1))), x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0),
                  NeQ(Plus(m, Times(C2, p), C3), C0), LtQ(p,
                      CN1),
                  Not(GtQ(m, C1)), RationalQ(m), IntegerQ(Times(C2, p))))),
      IIntegrate(688,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), CN1), Power(Plus(a_DEFAULT,
                  Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Dist(Times(C4, c),
                  Subst(Integrate(Power(
                      Plus(Times(Sqr(b), e), Times(CN1, C4, a, c, e), Times(C4, c, e, Sqr(x))),
                      CN1), x), x, Sqrt(Plus(a, Times(b, x), Times(c, Sqr(x))))),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0)))),
      IIntegrate(689,
          Integrate(
              Times(
                  Power(Plus(d_, Times(e_DEFAULT,
                      x_)), CN1D2),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      C4, Sqrt(Times(CN1, c, Power(Subtract(Sqr(b), Times(C4, a, c)), CN1))), Power(
                          e, CN1)),
                  Subst(
                      Integrate(
                          Power(
                              Simp(Subtract(C1,
                                  Times(Sqr(b), Power(x, C4),
                                      Power(Times(Sqr(d), Subtract(Sqr(b), Times(C4, a, c))),
                                          CN1))),
                                  x),
                              CN1D2),
                          x),
                      x, Sqrt(Plus(d, Times(e, x)))),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0),
                  LtQ(Times(c, Power(Subtract(Sqr(b), Times(C4, a, c)), CN1)), C0)))),
      IIntegrate(690,
          Integrate(
              Times(
                  Sqrt(Plus(d_, Times(e_DEFAULT,
                      x_))),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      C4, Sqrt(Times(CN1, c, Power(Subtract(Sqr(b), Times(C4, a, c)), CN1))),
                      Power(e, CN1)),
                  Subst(
                      Integrate(Times(Sqr(x),
                          Power(Simp(Subtract(C1,
                              Times(Sqr(b), Power(x, C4),
                                  Power(Times(Sqr(d), Subtract(Sqr(b), Times(C4, a, c))), CN1))),
                              x), CN1D2)),
                          x),
                      x, Sqrt(Plus(d, Times(e, x)))),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0), LtQ(
                      Times(c, Power(Subtract(Sqr(b), Times(C4, a, c)), CN1)), C0)))),
      IIntegrate(691,
          Integrate(
              Times(
                  Power(Plus(d_, Times(e_DEFAULT,
                      x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Sqrt(
                          Times(
                              CN1, c, Plus(a, Times(b, x), Times(c,
                                  Sqr(x))),
                              Power(Subtract(Sqr(b), Times(C4, a, c)), CN1))),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1D2)),
                  Integrate(Times(Power(Plus(d, Times(e, x)), m), Power(
                      Subtract(
                          Subtract(
                              Times(CN1, a, c, Power(Subtract(Sqr(b), Times(C4, a, c)), CN1)),
                              Times(b, c, x, Power(Subtract(Sqr(b), Times(C4, a, c)), CN1))),
                          Times(Sqr(c), Sqr(x), Power(Subtract(Sqr(b), Times(C4, a, c)), CN1))),
                      CN1D2)), x),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0), EqQ(Sqr(m), C1D4)))),
      IIntegrate(692,
          Integrate(
              Times(
                  Power(Plus(d_,
                      Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(C2, d, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)), Power(
                              Times(b, Plus(m, Times(C2, p), C1)), CN1)),
                      x),
                  Dist(
                      Times(Sqr(d), Subtract(m, C1), Subtract(Sqr(b), Times(C4, a, c)), Power(
                          Times(Sqr(b), Plus(m, Times(C2, p), C1)), CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0),
                  NeQ(Plus(m, Times(C2, p), C3), C0), GtQ(m, C1),
                  NeQ(Plus(m, Times(C2, p),
                      C1), C0),
                  Or(IntegerQ(Times(C2, p)), And(IntegerQ(m), RationalQ(p)), OddQ(m))))),
      IIntegrate(693,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(Plus(Simp(Times(CN2, b, d, Power(Plus(d, Times(e, x)), Plus(m, C1)),
              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)), Power(
                  Times(Sqr(d), Plus(m, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
              x),
              Dist(
                  Times(Sqr(b), Plus(m, Times(C2, p), C3),
                      Power(Times(Sqr(d), Plus(m, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                  Integrate(
                      Times(Power(Plus(d, Times(e, x)), Plus(m, C2)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                      x),
                  x)),
              And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0),
                  NeQ(Plus(m, Times(C2, p), C3), C0), LtQ(m, CN1),
                  Or(IntegerQ(Times(C2, p)), And(IntegerQ(m), RationalQ(p)),
                      IntegerQ(Times(C1D2, Plus(m, Times(C2, p), C3))))))),
      IIntegrate(694,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Dist(Power(e, CN1),
                  Subst(
                      Integrate(
                          Times(Power(x, m),
                              Power(Plus(a, Times(CN1, Sqr(b), Power(Times(C4, c), CN1)),
                                  Times(c, Sqr(x), Power(e, CN2))), p)),
                          x),
                      x, Plus(d, Times(e, x))),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, p), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Subtract(Times(C2, c, d), Times(b, e)), C0)))),
      IIntegrate(695,
          Integrate(
              Times(
                  Power(Plus(d_,
                      Times(e_DEFAULT, x_)), CN1),
                  Power(Plus(a_DEFAULT, Times(c_DEFAULT, Sqr(x_))), CN1D4)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(C1,
                          ArcTan(
                              Times(
                                  Power(Subtract(CN1,
                                      Times(c, Sqr(x), Power(a, CN1))), C1D4),
                                  Power(
                                      Subtract(Subtract(
                                          C1, Times(c, d, x, Power(Times(C2, a, e), CN1))),
                                          Sqrt(Subtract(CN1, Times(c, Sqr(x), Power(a, CN1))))),
                                      CN1))),
                          Power(Times(C2, Power(Negate(a), C1D4), e), CN1)),
                      x),
                  Simp(
                      Times(C1, Log(Times(
                          Subtract(
                              Plus(C1, Times(CN1, c, d, x, Power(Times(C2, a, e), CN1)),
                                  Sqrt(Subtract(CN1, Times(c, Sqr(x), Power(a, CN1))))),
                              Power(Subtract(CN1, Times(c, Sqr(x), Power(a, CN1))), C1D4)),
                          Power(
                              Plus(C1, Times(CN1, c, d, x, Power(Times(C2, a, e), CN1)),
                                  Sqrt(Subtract(CN1, Times(c, Sqr(x), Power(a, CN1)))),
                                  Power(Subtract(CN1, Times(c, Sqr(x), Power(a, CN1))), C1D4)),
                              CN1))),
                          Power(Times(C4, Power(Negate(a), C1D4), e), CN1)),
                      x)),
              And(FreeQ(List(a, c, d, e), x), EqQ(Plus(Times(c, Sqr(d)), Times(C2, a, Sqr(e))), C0),
                  LtQ(a, C0)))),
      IIntegrate(696,
          Integrate(
              Times(
                  Power(Plus(d_,
                      Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(e, m, Power(d, Subtract(m, C1)),
                          Power(Plus(a, Times(c, Sqr(x))),
                              Plus(p, C1)),
                          Power(Times(C2, c, Plus(p, C1)), CN1)),
                      x),
                  Integrate(
                      Times(
                          Subtract(Power(Plus(d, Times(e, x)), m),
                              Times(e, m, Power(d, Subtract(m, C1)), x)),
                          Power(Plus(a, Times(c, Sqr(x))), p)),
                      x)),
              And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                  IGtQ(p, C1), IGtQ(m, C0), LeQ(m, p)))),
      IIntegrate(697,
          Integrate(
              Times(
                  Power(Plus(d_, Times(e_DEFAULT, x_)), m_), Power(
                      Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
              x_Symbol),
          Condition(Integrate(
              ExpandIntegrand(
                  Times(Power(Plus(d, Times(e, x)), m), Power(Plus(a, Times(c, Sqr(x))), p)), x),
              x),
              And(FreeQ(List(a, c, d, e, m), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                  IGtQ(p, C0)))),
      IIntegrate(698,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT,
                      Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(
                      Times(Power(Plus(d, Times(e, x)), m),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                  NeQ(Subtract(Times(C2, c, d),
                      Times(b, e)), C0),
                  IntegerQ(p), Or(GtQ(p, C0), And(EqQ(a, C0), IntegerQ(m)))))),
      IIntegrate(699,
          Integrate(
              Times(
                  Sqrt(Plus(d_DEFAULT, Times(e_DEFAULT,
                      x_))),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1)),
              x_Symbol),
          Condition(
              Dist(Times(C2, e),
                  Subst(
                      Integrate(Times(Sqr(x),
                          Power(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)),
                              Times(CN1, Subtract(Times(C2, c, d), Times(b, e)), Sqr(x)),
                              Times(c, Power(x, C4))), CN1)),
                          x),
                      x, Sqrt(Plus(d, Times(e, x)))),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                  NeQ(Subtract(Times(C2, c, d), Times(b, e)), C0)))),
      IIntegrate(700,
          Integrate(Times(Sqrt(Plus(d_, Times(e_DEFAULT, x_))),
              Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1)), x_Symbol),
          Condition(
              Dist(
                  Times(C2, e),
                  Subst(
                      Integrate(Times(Sqr(x),
                          Power(Plus(Times(c, Sqr(d)), Times(a, Sqr(e)),
                              Times(CN1, C2, c, d, Sqr(x)), Times(c, Power(x, C4))), CN1)),
                          x),
                      x, Sqrt(Plus(d, Times(e, x)))),
                  x),
              And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))));
}
