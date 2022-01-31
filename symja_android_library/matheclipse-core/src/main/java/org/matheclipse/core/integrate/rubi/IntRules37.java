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
class IntRules37 {
  public static IAST RULES = List(
      IIntegrate(741,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Negate(
                      Simp(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Plus(Times(a, e), Times(c, d, x)),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Times(C2, a, Plus(p, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                              CN1)),
                          x)),
                  Dist(
                      Power(Times(C2, a, Plus(p, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))),
                          CN1),
                      Integrate(Times(Power(Plus(d, Times(e, x)), m),
                          Simp(Plus(Times(c, Sqr(d), Plus(Times(C2, p), C3)),
                              Times(a, Sqr(e), Plus(m, Times(C2, p), C3)),
                              Times(c, e, d, Plus(m, Times(C2, p), C4), x)), x),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1))), x),
                      x)),
              And(FreeQ(List(a, c, d, e, m), x), NeQ(Plus(Times(c, Sqr(d)),
                  Times(a, Sqr(e))), C0), LtQ(p,
                      CN1),
                  IntQuadraticQ(a, C0, c, d, e, m, p, x)))),
      IIntegrate(742,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_), Power(Plus(a_DEFAULT,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                          Power(Plus(a, Times(b, x), Times(c,
                              Sqr(x))), Plus(p,
                                  C1)),
                          Power(Times(c, Plus(m, Times(C2, p), C1)), CN1)),
                      x),
                  Dist(Power(Times(c, Plus(m, Times(C2, p), C1)), CN1),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), Subtract(m, C2)), Simp(
                              Plus(Times(c, Sqr(d), Plus(m, Times(C2, p), C1)),
                                  Times(CN1, e,
                                      Plus(Times(a, e, Subtract(m, C1)), Times(b, d, Plus(p, C1)))),
                                  Times(e, Subtract(Times(C2, c, d), Times(b, e)), Plus(m, p), x)),
                              x), Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, m, p), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                  NeQ(Subtract(Times(C2, c, d), Times(b, e)), C0),
                  If(RationalQ(m), GtQ(m, C1), SumSimplerQ(m, CN2)), NeQ(Plus(m, Times(C2, p),
                      C1), C0),
                  IntQuadraticQ(a, b, c, d, e, m, p, x)))),
      IIntegrate(743,
          Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
              Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)), x_Symbol),
          Condition(Plus(
              Simp(Times(e, Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                  Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                  Power(Times(c, Plus(m, Times(C2, p), C1)), CN1)), x),
              Dist(Power(Times(c, Plus(m, Times(C2, p), C1)), CN1), Integrate(Times(
                  Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                  Simp(Plus(Times(c, Sqr(d), Plus(m, Times(C2, p), C1)),
                      Times(CN1, a, Sqr(e), Subtract(m, C1)), Times(C2, c, d, e, Plus(m, p), x)),
                      x),
                  Power(Plus(a, Times(c, Sqr(x))), p)), x), x)),
              And(FreeQ(List(a, c, d, e, m, p), x),
                  NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0),
                  If(RationalQ(m), GtQ(m, C1), SumSimplerQ(m, CN2)), NeQ(Plus(m, Times(C2, p), C1),
                      C0),
                  IntQuadraticQ(a, C0, c, d, e, m, p, x)))),
      IIntegrate(744,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_), Power(Plus(a_DEFAULT,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(e, Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Power(Plus(a, Times(b, x), Times(c,
                              Sqr(x))), Plus(p,
                                  C1)),
                          Power(
                              Times(
                                  Plus(m, C1), Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                                      Times(a, Sqr(e)))),
                              CN1)),
                      x),
                  Dist(
                      Power(Times(Plus(m, C1),
                          Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e)))), CN1),
                      Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                          Simp(Subtract(
                              Subtract(Times(c, d, Plus(m, C1)), Times(b, e, Plus(m, p, C2))),
                              Times(c, e, Plus(m, Times(C2, p), C3), x)), x),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)), x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, m, p), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Plus(Times(c, Sqr(
                      d)), Times(CN1, b, d,
                          e),
                      Times(a, Sqr(e))), C0),
                  NeQ(Subtract(Times(C2, c, d), Times(b, e)), C0), NeQ(m, CN1),
                  Or(And(LtQ(m, CN1), IntQuadraticQ(a, b, c, d, e, m, p, x)),
                      And(SumSimplerQ(m, C1), IntegerQ(
                          p)),
                      ILtQ(Simplify(Plus(m, Times(C2, p), C3)), C0))))),
      IIntegrate(745,
          Integrate(
              Times(
                  Power(Plus(d_,
                      Times(e_DEFAULT, x_)), m_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(Plus(
              Simp(Times(e, Power(Plus(d, Times(e, x)), Plus(m, C1)),
                  Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                  Power(Times(Plus(m, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1)), x),
              Dist(
                  Times(c,
                      Power(Times(Plus(m, C1), Plus(Times(c, Sqr(d)), Times(a, Sqr(e)))), CN1)),
                  Integrate(Times(Power(Plus(d, Times(e, x)), Plus(m, C1)),
                      Simp(Subtract(Times(d, Plus(m, C1)), Times(e, Plus(m, Times(C2, p), C3), x)),
                          x),
                      Power(Plus(a, Times(c, Sqr(x))), p)), x),
                  x)),
              And(FreeQ(List(a, c, d, e, m, p), x),
                  NeQ(Plus(Times(c, Sqr(d)),
                      Times(a, Sqr(e))), C0),
                  NeQ(m, CN1),
                  Or(And(LtQ(m, CN1), IntQuadraticQ(a, C0, c, d, e, m, p, x)),
                      And(SumSimplerQ(m,
                          C1), IntegerQ(p)),
                      ILtQ(Simplify(Plus(m, Times(C2, p), C3)), C0))))),
      IIntegrate(746,
          Integrate(
              Times(
                  Power(Plus(d_,
                      Times(e_DEFAULT, x_)), CN1),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1D4)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(d,
                      Integrate(
                          Power(
                              Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                  Power(Plus(a, Times(c, Sqr(x))), C1D4)),
                              CN1),
                          x),
                      x),
                  Dist(e,
                      Integrate(
                          Times(x,
                              Power(
                                  Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                      Power(Plus(a, Times(c, Sqr(x))), C1D4)),
                                  CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
      IIntegrate(747,
          Integrate(
              Times(
                  Power(Plus(d_,
                      Times(e_DEFAULT, x_)), CN1),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), QQ(-3L, 4L))),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(d,
                      Integrate(
                          Power(Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                              Power(Plus(a, Times(c, Sqr(x))), QQ(3L, 4L))), CN1),
                          x),
                      x),
                  Dist(e,
                      Integrate(
                          Times(x,
                              Power(
                                  Times(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))),
                                      Power(Plus(a, Times(c, Sqr(x))), QQ(3L, 4L))),
                                  CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e), x), NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0)))),
      IIntegrate(748,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                      x_)), CN1),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Dist(
                  Power(Power(Times(CN4, c, Power(Subtract(Sqr(b), Times(C4, a, c)), CN1)),
                      p), CN1),
                  Subst(
                      Integrate(
                          Times(
                              Power(Simp(
                                  Subtract(C1,
                                      Times(Sqr(x), Power(Subtract(Sqr(b), Times(C4, a, c)), CN1))),
                                  x), p),
                              Power(Simp(Plus(Times(C2, c, d), Times(CN1, b, e), Times(e, x)), x),
                                  CN1)),
                          x),
                      x, Plus(b, Times(C2, c, x))),
                  x),
              And(FreeQ(List(a, b, c, d, e, p), x),
                  GtQ(Subtract(Times(C4, a),
                      Times(Sqr(b), Power(c, CN1))), C0),
                  IntegerQ(Times(C4, p))))),
      IIntegrate(749,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                      x_)), CN1),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(Plus(a, Times(b, x),
                          Times(c, Sqr(x))), p),
                      Power(
                          Power(
                              Times(
                                  CN1, c, Plus(a, Times(b, x), Times(c,
                                      Sqr(x))),
                                  Power(Subtract(Sqr(b), Times(C4, a, c)), CN1)),
                              p),
                          CN1)),
                  Integrate(
                      Times(
                          Power(Subtract(Subtract(Times(CN1, a, c,
                              Power(Subtract(Sqr(b), Times(C4, a, c)), CN1)),
                              Times(b, c, x, Power(Subtract(Sqr(b), Times(C4, a, c)), CN1))),
                              Times(Sqr(c), Sqr(x), Power(Subtract(Sqr(b), Times(C4, a, c)), CN1))),
                              p),
                          Power(Plus(d, Times(e, x)), CN1)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, p), x),
                  Not(GtQ(Subtract(Times(C4, a), Times(Sqr(b), Power(c, CN1))),
                      C0)),
                  IntegerQ(Times(C4, p))))),
      IIntegrate(750,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), CN1), Power(Plus(a_,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      CN1D3)),
              x_Symbol),
          Condition(With(
              List(Set(q, Rt(Times(C3, c, Sqr(e), Subtract(Times(C2, c, d), Times(b, e))), C3))),
              Plus(
                  Negate(Simp(Times(CSqrt3, c, e,
                      ArcTan(Plus(C1DSqrt3,
                          Times(C2, Subtract(Subtract(Times(c, d), Times(b, e)), Times(c, e, x)),
                              Power(Times(CSqrt3, q,
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), C1D3)), CN1)))),
                      Power(q, CN2)), x)),
                  Negate(Simp(
                      Times(C3, c, e, Log(Plus(d, Times(e, x))), Power(Times(C2, Sqr(q)), CN1)),
                      x)),
                  Simp(Times(C3, c, e,
                      Log(Subtract(Subtract(Subtract(Times(c, d), Times(b, e)), Times(c, e, x)),
                          Times(q, Power(Plus(a, Times(b, x), Times(c, Sqr(x))), C1D3)))),
                      Power(Times(C2, Sqr(q)), CN1)), x))),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Times(C2, c, d),
                  Times(b, e)), C0), EqQ(
                      Subtract(
                          Plus(Times(Sqr(c), Sqr(d)), Times(CN1, b, c, d, e), Times(Sqr(b),
                              Sqr(e))),
                          Times(C3, a, c, Sqr(e))),
                      C0),
                  PosQ(Times(c, Sqr(e), Subtract(Times(C2, c, d), Times(b, e))))))),
      IIntegrate(751,
          Integrate(
              Times(
                  Power(Plus(d_,
                      Times(e_DEFAULT, x_)), CN1),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1D3)),
              x_Symbol),
          Condition(
              With(List(Set(q, Rt(Times(C6, Sqr(c), Sqr(e), Power(d, CN2)), C3))),
                  Plus(
                      Negate(
                          Simp(Times(CSqrt3, c, e,
                              ArcTan(Plus(C1DSqrt3, Times(C2, c, Subtract(d, Times(e, x)),
                                  Power(Times(CSqrt3, d, q, Power(Plus(a, Times(c, Sqr(x))), C1D3)),
                                      CN1)))),
                              Power(Times(Sqr(d), Sqr(q)), CN1)), x)),
                      Negate(
                          Simp(Times(C3, c, e, Log(Plus(d, Times(e, x))),
                              Power(Times(C2, Sqr(d), Sqr(q)), CN1)), x)),
                      Simp(
                          Times(C3, c, e,
                              Log(Subtract(Subtract(Times(c, d), Times(c, e, x)),
                                  Times(d, q, Power(Plus(a, Times(c, Sqr(x))), C1D3)))),
                              Power(Times(C2, Sqr(d), Sqr(q)), CN1)),
                          x))),
              And(FreeQ(List(a, c, d,
                  e), x), EqQ(Subtract(Times(c, Sqr(d)), Times(C3, a, Sqr(e))),
                      C0)))),
      IIntegrate(752,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), CN1), Power(Plus(a_,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      CN1D3)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(q, Rt(Times(CN3, c, Sqr(e), Subtract(Times(C2, c, d), Times(b, e))),
                          C3))),
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  CSqrt3, c, e,
                                  ArcTan(
                                      Subtract(
                                          C1DSqrt3,
                                          Times(C2,
                                              Subtract(Subtract(Times(c, d), Times(b, e)),
                                                  Times(c, e, x)),
                                              Power(Times(CSqrt3, q,
                                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))),
                                                      C1D3)),
                                                  CN1)))),
                                  Power(q, CN2)),
                              x)),
                      Negate(Simp(Times(C3, c, e, Log(Plus(d, Times(e, x))),
                          Power(Times(C2, Sqr(q)), CN1)), x)),
                      Simp(
                          Times(C3, c, e,
                              Log(Plus(Times(c, d), Times(CN1, b, e), Times(CN1, c, e, x),
                                  Times(q, Power(Plus(a, Times(b, x), Times(c, Sqr(x))), C1D3)))),
                              Power(Times(C2, Sqr(q)), CN1)),
                          x))),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Times(C2, c, d),
                  Times(b, e)), C0), EqQ(
                      Subtract(
                          Plus(Times(Sqr(c), Sqr(
                              d)), Times(CN1, b, c, d,
                                  e),
                              Times(Sqr(b), Sqr(e))),
                          Times(C3, a, c, Sqr(e))),
                      C0),
                  NegQ(Times(c, Sqr(e), Subtract(Times(C2, c, d), Times(b, e))))))),
      IIntegrate(753,
          Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), CN1),
              Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1D3)), x_Symbol),
          Condition(Dist(Power(a, C1D3),
              Integrate(Power(Times(Plus(d, Times(e, x)),
                  Power(Subtract(C1, Times(C3, e, x, Power(d, CN1))), C1D3), Power(
                      Plus(C1, Times(C3, e, x, Power(d, CN1))), C1D3)),
                  CN1), x),
              x),
              And(FreeQ(List(a, c, d, e), x), EqQ(Plus(Times(c, Sqr(d)),
                  Times(C9, a, Sqr(e))), C0), GtQ(a,
                      C0)))),
      IIntegrate(754,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), CN1),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), CN1D3)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(Plus(C1, Times(c, Sqr(x), Power(a, CN1))), C1D3),
                      Power(Plus(a, Times(c, Sqr(x))), CN1D3)),
                  Integrate(
                      Power(
                          Times(Plus(d, Times(e, x)),
                              Power(Plus(C1, Times(c, Sqr(x), Power(a, CN1))), C1D3)),
                          CN1),
                      x),
                  x),
              And(FreeQ(List(a, c, d, e), x), EqQ(Plus(Times(c, Sqr(d)), Times(C9, a, Sqr(e))), C0),
                  Not(GtQ(a, C0))))),
      IIntegrate(755,
          Integrate(
              Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), CN1),
                  Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1D3)),
              x_Symbol),
          Condition(
              With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                  Dist(Times(
                      Power(Plus(b, q, Times(C2, c, x)), C1D3),
                      Power(Plus(b, Negate(q), Times(C2, c, x)), C1D3),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1D3)),
                      Integrate(Power(
                          Times(Plus(d, Times(e, x)), Power(Plus(b, q, Times(C2, c, x)), C1D3),
                              Power(Plus(b, Negate(q), Times(C2, c, x)), C1D3)),
                          CN1), x),
                      x)),
              And(FreeQ(List(a, b, c, d, e), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Plus(Times(Sqr(c), Sqr(d)), Times(CN1, b, c, d, e),
                      Times(CN1, C2, Sqr(b), Sqr(e)), Times(C9, a, c, Sqr(e))), C0)))),
      IIntegrate(756,
          Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
              Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)), x_Symbol),
          Condition(
              Integrate(Times(
                  Power(Plus(d, Times(e, x)), m),
                  Power(Plus(Rt(a, C2), Times(Rt(Negate(c), C2), x)), p),
                  Power(Subtract(Rt(a, C2), Times(Rt(Negate(c), C2), x)), p)), x),
              And(FreeQ(List(a, c, d, e, m, p), x),
                  NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)), GtQ(a, C0),
                  LtQ(c, C0)))),
      IIntegrate(757,
          Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
              Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)), x_Symbol),
          Condition(
              Integrate(ExpandIntegrand(Power(Plus(a, Times(c, Sqr(x))), p),
                  Power(
                      Subtract(Times(d, Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1)),
                          Times(e, x, Power(Subtract(Sqr(d), Times(Sqr(e), Sqr(x))), CN1))),
                      Negate(m)),
                  x), x),
              And(FreeQ(List(a, c, d, e, p), x), NeQ(Plus(Times(c, Sqr(d)), Times(a,
                  Sqr(e))), C0), Not(IntegerQ(
                      p)),
                  ILtQ(m, C0)))),
      IIntegrate(758,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                      x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              With(
                  List(Set(q,
                      Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                  Negate(
                      Dist(
                          Times(
                              Power(Power(Plus(d, Times(e,
                                  x)), CN1), Times(C2, p)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p), Power(Times(e,
                                  Power(Times(e, Plus(b, Negate(q), Times(C2, c, x)), Power(Times(
                                      C2, c, Plus(d, Times(e, x))), CN1)), p),
                                  Power(
                                      Times(e, Plus(b, q, Times(C2, c,
                                          x)), Power(Times(C2, c, Plus(d, Times(e, x))),
                                              CN1)),
                                      p)),
                                  CN1)),
                          Subst(
                              Integrate(
                                  Times(Power(x, Subtract(Negate(m), Times(C2, Plus(p, C1)))),
                                      Power(
                                          Simp(
                                              Subtract(C1,
                                                  Times(Subtract(d,
                                                      Times(e, Subtract(b, q),
                                                          Power(Times(C2, c), CN1))),
                                                      x)),
                                              x),
                                          p),
                                      Power(
                                          Simp(Subtract(C1,
                                              Times(Subtract(d,
                                                  Times(e, Plus(b, q), Power(Times(C2, c), CN1))),
                                                  x)),
                                              x),
                                          p)),
                                  x),
                              x, Power(Plus(d, Times(e, x)), CN1)),
                          x))),
              And(FreeQ(List(a, b, c, d, e, p), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                      Times(a, Sqr(e))), C0),
                  NeQ(Subtract(Times(C2, c, d), Times(b, e)), C0), Not(IntegerQ(p)), ILtQ(m, C0)))),
      IIntegrate(759,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                      x_)), m_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              With(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                  Dist(
                      Times(
                          Power(Plus(a, Times(b, x),
                              Times(c, Sqr(x))), p),
                          Power(
                              Times(e,
                                  Power(Subtract(C1,
                                      Times(Plus(d, Times(e, x)),
                                          Power(
                                              Subtract(d, Times(e, Subtract(b, q), Power(
                                                  Times(C2, c), CN1))),
                                              CN1))),
                                      p),
                                  Power(
                                      Subtract(C1,
                                          Times(Plus(d, Times(e, x)),
                                              Power(Subtract(d, Times(e, Plus(b, q), Power(Times(C2,
                                                  c), CN1))), CN1))),
                                      p)),
                              CN1)),
                      Subst(
                          Integrate(
                              Times(Power(x, m),
                                  Power(
                                      Simp(
                                          Subtract(
                                              C1,
                                              Times(
                                                  x,
                                                  Power(
                                                      Subtract(
                                                          d,
                                                          Times(
                                                              e, Subtract(b, q),
                                                              Power(Times(C2, c), CN1))),
                                                      CN1))),
                                          x),
                                      p),
                                  Power(
                                      Simp(Subtract(C1,
                                          Times(x,
                                              Power(Subtract(d,
                                                  Times(e, Plus(b, q), Power(Times(C2, c), CN1))),
                                                  CN1))),
                                          x),
                                      p)),
                              x),
                          x, Plus(d, Times(e, x))),
                      x)),
              And(FreeQ(List(a, b, c, d, e, m, p), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a,
                      Sqr(e))), C0),
                  NeQ(Subtract(Times(C2, c, d), Times(b, e)), C0), Not(IntegerQ(p))))),
      IIntegrate(760,
          Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
              Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)), x_Symbol),
          Condition(
              With(
                  List(Set(q,
                      Rt(Times(CN1, a, c), C2))),
                  Dist(
                      Times(
                          Power(Plus(a, Times(c, Sqr(
                              x))), p),
                          Power(Times(e,
                              Power(Subtract(C1,
                                  Times(Plus(d, Times(e, x)),
                                      Power(Plus(d, Times(e, q, Power(c, CN1))), CN1))),
                                  p),
                              Power(
                                  Subtract(C1,
                                      Times(
                                          Plus(d, Times(e, x)), Power(Subtract(d,
                                              Times(e, q, Power(c, CN1))),
                                              CN1))),
                                  p)),
                              CN1)),
                      Subst(
                          Integrate(
                              Times(Power(x, m),
                                  Power(
                                      Simp(
                                          Subtract(C1,
                                              Times(x, Power(Plus(d, Times(e, q, Power(c, CN1))),
                                                  CN1))),
                                          x),
                                      p),
                                  Power(Simp(
                                      Subtract(C1,
                                          Times(x,
                                              Power(Subtract(d, Times(e, q, Power(c, CN1))), CN1))),
                                      x), p)),
                              x),
                          x, Plus(d, Times(e, x))),
                      x)),
              And(FreeQ(List(a, c, d, e, m, p), x),
                  NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p))))));
}
