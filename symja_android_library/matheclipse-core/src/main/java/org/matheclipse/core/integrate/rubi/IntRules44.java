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
class IntRules44 {
  public static IAST RULES = List(
      IIntegrate(881,
          Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
              Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
              Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)), x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(Sqr(e), Power(Plus(d, Times(e, x)), Subtract(m, C2)),
                          Power(Plus(f, Times(g, x)), Plus(n, C1)),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Times(c, g, Plus(n, p, C2)), CN1)),
                      x),
                  Dist(
                      Times(
                          Subtract(Times(e, f, Plus(p, C1)),
                              Times(d, g, Plus(Times(C2, n), p, C3))),
                          Power(Times(g, Plus(n, p, C2)), CN1)),
                      Integrate(
                          Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(f, Times(g, x)), n), Power(Plus(a, Times(c, Sqr(x))), p)),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e, f, g, m, n, p), x),
                  NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))),
                      C0),
                  Not(IntegerQ(p)), EqQ(Subtract(Plus(m, p), C1),
                      C0),
                  Not(LtQ(n, CN1)), IntegerQ(Times(C2, p))))),
      IIntegrate(882,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(a_DEFAULT,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(Times(Power(Plus(d, Times(e, x)), m),
                      Power(Plus(f, Times(g, x)), n), Power(Plus(a, Times(b, x), Times(c, Sqr(x))),
                          p)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, g, n, p), x),
                  NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                  Not(IntegerQ(p)), ILtQ(m, C0), Or(ILtQ(n, C0),
                      And(IGtQ(n, C0), ILtQ(Plus(p, C1D2), C0))),
                  Not(IGtQ(n, C0))))),
      IIntegrate(883,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(Power(Plus(a, Times(c, Sqr(x))), CN1D2),
                      Times(Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)), n),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1D2))),
                      x),
                  x),
              And(FreeQ(List(a, c, d, e, f, g, n, p), x),
                  NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), IntegerQ(
                      Subtract(p, C1D2)),
                  ILtQ(m, C0), ILtQ(n, C0), Not(IGtQ(n, C0))))),
      IIntegrate(884,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(
                      Times(
                          Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)),
                              n),
                          Power(Plus(a, Times(c, Sqr(x))), p)),
                      x),
                  x),
              And(FreeQ(List(a, c, d, e, f, g, n, p), x),
                  NeQ(Subtract(Times(e, f), Times(d, g)),
                      C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)), ILtQ(m,
                      C0),
                  Or(ILtQ(n, C0), And(IGtQ(n, C0), ILtQ(Plus(p, C1D2), C0))), Not(IGtQ(n, C0))))),
      IIntegrate(885,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                      x_)), m_DEFAULT),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT,
                      x_)), n_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(QSymbol,
                          PolynomialQuotient(Power(Plus(f, Times(g, x)), n),
                              Plus(Times(a, e), Times(c, d, x)), x)),
                      Set(h,
                          PolynomialRemainder(
                              Power(Plus(f, Times(g, x)), n), Plus(Times(a, e),
                                  Times(c, d, x)),
                              x))),
                  Plus(
                      Simp(
                          Times(h, Subtract(Times(C2, c, d), Times(b, e)),
                              Power(Plus(d, Times(e, x)), m),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Times(e, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1)),
                          x),
                      Dist(Power(Times(Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c))), CN1),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              ExpandToSum(Subtract(
                                  Times(d, e, Plus(p, C1), Subtract(Sqr(b), Times(C4, a, c)),
                                      QSymbol),
                                  Times(h, Subtract(Times(C2, c, d), Times(b, e)),
                                      Plus(m, Times(C2, p), C2))),
                                  x)),
                              x),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a,
                      Sqr(e))), C0),
                  ILtQ(Plus(p, C1D2), C0), IGtQ(m, C0), IGtQ(n, C0), Not(IGtQ(n, C0))))),
      IIntegrate(886,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                      x_)), m_DEFAULT),
                  Power(Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(QSymbol,
                          PolynomialQuotient(
                              Power(Plus(f,
                                  Times(g, x)), n),
                              Plus(Times(a, e), Times(c, d, x)), x)),
                      Set(h,
                          PolynomialRemainder(Power(Plus(f, Times(g, x)), n),
                              Plus(Times(a, e), Times(c, d, x)), x))),
                  Plus(
                      Negate(Simp(Times(d, h, Power(Plus(d, Times(e, x)), m),
                          Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Times(C2, a, e, Plus(p, C1)), CN1)), x)),
                      Dist(Times(d, Power(Times(C2, a, Plus(p, C1)), CN1)),
                          Integrate(Times(Power(Plus(d, Times(e, x)), Subtract(m, C1)),
                              Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              ExpandToSum(Plus(Times(C2, a, e, Plus(p, C1), QSymbol),
                                  Times(h, Plus(m, Times(C2, p), C2))), x)),
                              x),
                          x))),
              And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), ILtQ(Plus(p, C1D2), C0),
                  IGtQ(m, C0), IGtQ(n, C0), Not(IGtQ(n, C0))))),
      IIntegrate(887,
          Integrate(
              Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                      Times(Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)), n)), x),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                  Not(IntegerQ(p)), EqQ(Plus(m, n, Times(C2, p), C1), C0), ILtQ(m, C0),
                  ILtQ(n, C0)))),
      IIntegrate(888,
          Integrate(
              Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(
                      Power(Plus(a,
                          Times(c, Sqr(x))), p),
                      Times(Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)), n)), x),
                  x),
              And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)), EqQ(
                      Plus(m, n, Times(C2, p), C1), C0),
                  ILtQ(m, C0), ILtQ(n, C0)))),
      IIntegrate(889,
          Integrate(
              Times(Power(Times(e_DEFAULT, x_), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT,
                      x_)), n_),
                  Power(Plus(Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(Times(e, x), m), Power(Plus(Times(b, x), Times(c, Sqr(x))), p),
                      Power(Times(Power(x, Plus(m, p)), Power(Plus(b, Times(c, x)), p)), CN1)),
                  Integrate(
                      Times(Power(x, Plus(m, p)), Power(Plus(f, Times(g, x)), n),
                          Power(Plus(b, Times(c, x)), p)),
                      x),
                  x),
              And(FreeQ(List(b, c, e, f, g, m, n), x), Not(IntegerQ(p)), Not(IGtQ(n, C0))))),
      IIntegrate(890,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Integrate(
                  Times(
                      Power(Plus(d, Times(e, x)), Plus(m, p)), Power(Plus(f, Times(g,
                          x)), n),
                      Power(Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))), p)),
                  x),
              And(FreeQ(List(a, c, d, e, f, g, m, n), x),
                  NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(
                      p)),
                  GtQ(a, C0), GtQ(d, C0), Not(IGtQ(m, C0)), Not(IGtQ(n, C0))))),
      IIntegrate(891,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(a_DEFAULT,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), FracPart(p)),
                      Power(Times(Power(Plus(d, Times(e, x)), FracPart(p)),
                          Power(Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))),
                              FracPart(p))),
                          CN1)),
                  Integrate(
                      Times(Power(Plus(d, Times(e, x)), Plus(m, p)), Power(Plus(f, Times(g, x)), n),
                          Power(Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))), p)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, f, g, m, n), x),
                  NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  EqQ(Plus(Times(c, Sqr(
                      d)), Times(CN1, b, d,
                          e),
                      Times(a, Sqr(e))), C0),
                  Not(IntegerQ(p)), Not(IGtQ(m, C0)), Not(IGtQ(n, C0))))),
      IIntegrate(892,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(Power(Plus(a, Times(c, Sqr(x))), FracPart(p)),
                      Power(
                          Times(Power(Plus(d, Times(e, x)), FracPart(p)),
                              Power(Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))),
                                  FracPart(p))),
                          CN1)),
                  Integrate(
                      Times(Power(Plus(d, Times(e, x)), Plus(m, p)), Power(Plus(f, Times(g, x)), n),
                          Power(Plus(Times(a, Power(d, CN1)), Times(c, x, Power(e, CN1))), p)),
                      x),
                  x),
              And(FreeQ(List(a, c, d, e, f, g, m, n), x),
                  NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  EqQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), Not(IntegerQ(p)), Not(IGtQ(m,
                      C0)),
                  Not(IGtQ(n, C0))))),
      IIntegrate(893,
          Integrate(Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
              Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_),
              Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(ExpandIntegrand(Times(Power(Plus(d, Times(e, x)), m),
                  Power(Plus(f, Times(g, x)), n), Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)),
                  x), x),
              And(FreeQ(List(a, b, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                  IntegerQ(p), Or(And(EqQ(p, C1), IntegersQ(m, n)),
                      And(ILtQ(m, C0), ILtQ(n, C0)))))),
      IIntegrate(894,
          Integrate(
              Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandIntegrand(
                      Times(Power(Plus(d, Times(e, x)), m), Power(Plus(f, Times(g, x)), n),
                          Power(Plus(a, Times(c, Sqr(x))), p)),
                      x),
                  x),
              And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Plus(Times(c, Sqr(d)),
                      Times(a, Sqr(e))), C0),
                  IntegerQ(p), Or(And(EqQ(p, C1), IntegersQ(m,
                      n)), And(ILtQ(m, C0),
                          ILtQ(n, C0)))))),
      IIntegrate(895,
          Integrate(
              Times(
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT,
                      x_)), CN1),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), CN1), Power(Plus(a_DEFAULT,
                      Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(
                      Times(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))),
                          Power(Times(e, Subtract(Times(e, f), Times(d, g))), CN1)),
                      Integrate(
                          Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                              Power(Plus(d, Times(e, x)), CN1)),
                          x),
                      x),
                  Dist(Power(Times(e, Subtract(Times(e, f), Times(d, g))), CN1),
                      Integrate(Times(
                          Simp(Subtract(Plus(Times(c, d, f), Times(CN1, b, e, f), Times(a, e, g)),
                              Times(c, Subtract(Times(e, f), Times(d, g)), x)), x),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                          Power(Plus(f, Times(g, x)), CN1)), x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Subtract(Sqr(b), Times(C4, a,
                      c)), C0),
                  NeQ(Plus(Times(c, Sqr(
                      d)), Times(CN1, b, d,
                          e),
                      Times(a, Sqr(e))), C0),
                  FractionQ(p), GtQ(p, C0)))),
      IIntegrate(896,
          Integrate(
              Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), CN1),
                  Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)),
                      CN1),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_)),
              x_Symbol),
          Condition(
              Subtract(
                  Dist(
                      Times(
                          Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), Power(
                              Times(e, Subtract(Times(e, f), Times(d, g))), CN1)),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(c,
                                  Sqr(x))), Subtract(p,
                                      C1)),
                              Power(Plus(d, Times(e, x)), CN1)),
                          x),
                      x),
                  Dist(Power(Times(e, Subtract(Times(e, f), Times(d, g))), CN1),
                      Integrate(Times(
                          Simp(Subtract(Plus(Times(c, d, f), Times(a, e, g)),
                              Times(c, Subtract(Times(e, f), Times(d, g)), x)), x),
                          Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C1)),
                          Power(Plus(f, Times(g, x)), CN1)), x),
                      x)),
              And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d,
                  g)), C0), NeQ(Plus(Times(c, Sqr(d)),
                      Times(a, Sqr(e))), C0),
                  FractionQ(p), GtQ(p, C0)))),
      IIntegrate(897, Integrate(Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
          Power(Plus(f_DEFAULT, Times(g_DEFAULT, x_)), n_), Power(Plus(a_DEFAULT,
              Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
          x_Symbol),
          Condition(
              With(
                  List(Set(q,
                      Denominator(m))),
                  Dist(
                      Times(q, Power(e,
                          CN1)),
                      Subst(
                          Integrate(Times(
                              Power(x, Subtract(Times(q, Plus(m, C1)), C1)),
                              Power(Plus(Times(Subtract(Times(e, f), Times(d, g)), Power(e, CN1)),
                                  Times(g, Power(x, q), Power(e, CN1))), n),
                              Power(
                                  Plus(
                                      Times(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e),
                                          Times(a, Sqr(e))), Power(e, CN2)),
                                      Times(CN1, Subtract(Times(C2, c, d), Times(b, e)),
                                          Power(x, q), Power(e, CN2)),
                                      Times(c, Power(x, Times(C2, q)), Power(e, CN2))),
                                  p)),
                              x),
                          x, Power(Plus(d, Times(e, x)), Power(q, CN1))),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Plus(Times(c, Sqr(d)), Times(CN1, b, d, e), Times(a, Sqr(e))), C0),
                  IntegersQ(n, p), FractionQ(m)))),
      IIntegrate(898,
          Integrate(
              Times(Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_DEFAULT,
                      Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)),
              x_Symbol),
          Condition(
              With(
                  List(Set(q,
                      Denominator(m))),
                  Dist(Times(q, Power(e, CN1)),
                      Subst(
                          Integrate(Times(Power(x, Subtract(Times(q, Plus(m, C1)), C1)),
                              Power(Plus(Times(Subtract(Times(e, f), Times(d, g)), Power(e, CN1)),
                                  Times(g, Power(x, q), Power(e, CN1))), n),
                              Power(Plus(
                                  Times(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), Power(e, CN2)),
                                  Times(CN1, C2, c, d, Power(x, q), Power(e, CN2)),
                                  Times(c, Power(x, Times(C2, q)), Power(e, CN2))), p)),
                              x),
                          x, Power(Plus(d, Times(e, x)), Power(q, CN1))),
                      x)),
              And(FreeQ(List(a, c, d, e, f, g), x), NeQ(Subtract(Times(e, f), Times(d, g)), C0),
                  NeQ(Plus(Times(c, Sqr(d)), Times(a, Sqr(e))), C0), IntegersQ(n, p),
                  FractionQ(m)))),
      IIntegrate(899,
          Integrate(
              Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
                  Power(Plus(f_,
                      Times(g_DEFAULT, x_)), n_),
                  Power(Plus(a_DEFAULT, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(Times(Power(Plus(Times(d, f), Times(e, g, Sqr(x))), m),
                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p)), x),
              And(FreeQ(List(a, b, c, d, e, f, g, m, n, p), x), EqQ(Subtract(m, n), C0),
                  EqQ(Plus(Times(e, f), Times(d, g)), C0),
                  Or(IntegerQ(m), And(GtQ(d, C0), GtQ(f, C0)))))),
      IIntegrate(900,
          Integrate(Times(Power(Plus(d_, Times(e_DEFAULT, x_)), m_),
              Power(Plus(f_, Times(g_DEFAULT, x_)), n_),
              Power(Plus(a_DEFAULT, Times(c_DEFAULT, Sqr(x_))), p_DEFAULT)), x_Symbol),
          Condition(
              Integrate(Times(Power(Plus(Times(d, f), Times(e, g, Sqr(x))), m),
                  Power(Plus(a, Times(c, Sqr(x))), p)), x),
              And(FreeQ(List(a, c, d, e, f, g, m, n, p), x), EqQ(Subtract(m, n), C0),
                  EqQ(Plus(Times(e, f), Times(d, g)), C0),
                  Or(IntegerQ(m), And(GtQ(d, C0), GtQ(f, C0)))))));
}
