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
class IntRules177 {
  public static IAST RULES =
      List(
          IIntegrate(3541,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Sqr(Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(d, Subtract(Times(C2, b, c), Times(a, d)), x,
                          Power(b, CN2)), x),
                      Dist(Times(Sqr(d), Power(b,
                          CN1)), Integrate(Tan(Plus(e, Times(f, x))),
                              x),
                          x),
                      Dist(Times(Sqr(Subtract(Times(b, c), Times(a, d))), Power(b, CN2)),
                          Integrate(Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), CN1),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), NeQ(Plus(Sqr(a), Sqr(b)),
                          C0)))),
          IIntegrate(3542,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_DEFAULT,
                              Times(b_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Sqr(Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Sqr(Subtract(Times(b, c), Times(a, d))),
                          Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Plus(m,
                              C1)),
                          Power(Times(b, f, Plus(m, C1), Plus(Sqr(a), Sqr(b))), CN1)), x),
                      Dist(Power(Plus(Sqr(a), Sqr(b)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Simp(Subtract(
                                      Subtract(Plus(Times(a, Sqr(c)), Times(C2, b, c, d)),
                                          Times(a, Sqr(d))),
                                      Times(Subtract(Subtract(Times(b, Sqr(c)), Times(C2, a, c, d)),
                                          Times(b, Sqr(d))), Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), LtQ(m,
                          CN1),
                      NeQ(Plus(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3543,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Sqr(Plus(
                          c_DEFAULT, Times(d_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Sqr(d),
                              Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Plus(m,
                                  C1)),
                              Power(Times(b, f, Plus(m, C1)), CN1)),
                          x),
                      Integrate(
                          Times(
                              Power(Plus(a,
                                  Times(b, Tan(Plus(e, Times(f, x))))), m),
                              Simp(
                                  Plus(Sqr(c), Negate(Sqr(d)),
                                      Times(C2, c, d, Tan(Plus(e, Times(f, x))))),
                                  x)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), Not(LeQ(m,
                          CN1)),
                      Not(And(EqQ(m, C2), EqQ(a, C0)))))),
          IIntegrate(3544,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§tan"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(CN2, a, b, Power(f,
                          CN1)),
                      Subst(
                          Integrate(
                              Power(
                                  Subtract(Subtract(Times(a, c), Times(b, d)),
                                      Times(C2, Sqr(a), Sqr(x))),
                                  CN1),
                              x),
                          x,
                          Times(
                              Sqrt(Plus(c, Times(d,
                                  Tan(Plus(e, Times(f, x)))))),
                              Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), CN1D2))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Plus(Sqr(a), Sqr(b)),
                          C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3545,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(a, b,
                              Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Subtract(m, C1)),
                              Power(Plus(c, Times(d,
                                  Tan(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                              Power(
                                  Times(f, Subtract(m, C1),
                                      Subtract(Times(a, c), Times(b, d))),
                                  CN1)),
                          x),
                      Dist(
                          Times(C2, Sqr(a), Power(Subtract(Times(a, c), Times(b, d)),
                              CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Subtract(m,
                                  C1)), Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))),
                                      Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Sqr(a), Sqr(b)), C0), NeQ(Plus(Sqr(c), Sqr(
                          d)), C0),
                      EqQ(Plus(m, n), C0), GtQ(m, C1D2)))),
          IIntegrate(3546,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              a, Power(Plus(a, Times(b,
                                  Tan(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))),
                                  n),
                              Power(Times(C2, b, f, m), CN1)),
                          x),
                      Dist(
                          Times(Subtract(Times(a, c), Times(b, d)), Power(Times(C2, Sqr(b)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(
                                      Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), Subtract(n,
                                          C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Sqr(a), Sqr(b)), C0), NeQ(Plus(Sqr(c), Sqr(d)), C0), EqQ(Plus(m, n),
                          C0),
                      LeQ(m, Negate(C1D2))))),
          IIntegrate(3547,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              a, Power(Plus(a, Times(b, Tan(
                                  Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d,
                                  Tan(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                              Power(Times(C2, f, m, Subtract(Times(b, c), Times(a, d))), CN1)),
                          x),
                      Dist(Power(Times(C2, a), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), n)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Sqr(a), Sqr(b)), C0), NeQ(Plus(Sqr(c), Sqr(
                          d)), C0),
                      EqQ(Plus(m, n, C1), C0), LtQ(m, CN1)))),
          IIntegrate(3548,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  d, Power(Plus(a,
                                      Times(b, Tan(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d, Tan(Plus(e,
                                      Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(Times(f, m, Plus(Sqr(c), Sqr(d))), CN1)),
                              x)),
                      Dist(Times(a, Power(Subtract(Times(a, c), Times(b, d)), CN1)),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), m),
                                  Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m, n),
                      x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Sqr(a), Sqr(b)), C0), NeQ(Plus(Sqr(c), Sqr(d)),
                          C0),
                      EqQ(Plus(m, n, C1), C0), Not(LtQ(m, CN1))))),
          IIntegrate(3549,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Plus(Times(a, c), Times(b, d)),
                                  Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), n),
                                  Power(
                                      Times(C2, Subtract(Times(b, c), Times(a, d)), f, Plus(a,
                                          Times(b, Tan(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x)),
                      Dist(Power(Times(C2, a, Subtract(Times(b, c), Times(a, d))), CN1),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), Subtract(n,
                                          C1)),
                                  Simp(Subtract(
                                      Plus(Times(a, c, d, Subtract(n, C1)), Times(b, Sqr(c)),
                                          Times(b, Sqr(d), n)),
                                      Times(d, Subtract(Times(b, c), Times(a, d)), Subtract(n, C1),
                                          Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0), LtQ(C0, n, C1)))),
          IIntegrate(3550,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Subtract(Times(b, c), Times(a,
                                  d)),
                              Power(Plus(c, Times(d,
                                  Tan(Plus(e, Times(f, x))))), Subtract(n,
                                      C1)),
                              Power(
                                  Times(C2, a, f, Plus(a,
                                      Times(b, Tan(Plus(e, Times(f, x)))))),
                                  CN1)),
                          x),
                      Dist(
                          Power(Times(C2,
                              Sqr(a)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))),
                                      Subtract(n, C2)),
                                  Simp(
                                      Subtract(
                                          Subtract(
                                              Plus(Times(a, Sqr(c)),
                                                  Times(a, Sqr(d), Subtract(n, C1))),
                                              Times(b, c, d, n)),
                                          Times(d,
                                              Plus(Times(a, c, Subtract(n, C2)), Times(b, d, n)),
                                              Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Plus(Sqr(a), Sqr(b)),
                          C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0), GtQ(n, C1)))),
          IIntegrate(3551,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), CN1),
                              x),
                          x),
                      Dist(Times(d, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), CN1),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Plus(Sqr(a), Sqr(b)),
                          C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3552,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(a,
                                  Power(Plus(c, Times(d,
                                      Tan(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(
                                      Times(
                                          C2, f, Subtract(Times(b, c), Times(a, d)), Plus(a, Times(
                                              b, Tan(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x)),
                      Dist(
                          Power(Times(C2, a,
                              Subtract(Times(b, c), Times(a, d))), CN1),
                          Integrate(
                              Times(Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), n),
                                  Simp(Subtract(
                                      Plus(Times(b, c), Times(a, d, Subtract(n, C1))), Times(b, d,
                                          n, Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Plus(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0), Not(GtQ(n, C0))))),
          IIntegrate(3553,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(a), Subtract(Times(b, c), Times(a, d)),
                                  Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))),
                                      Subtract(m, C2)),
                                  Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                                  Power(
                                      Times(d, f, Plus(Times(b, c), Times(a,
                                          d)), Plus(n,
                                              C1)),
                                      CN1)),
                              x)),
                      Dist(
                          Times(a, Power(Times(d, Plus(Times(b, c), Times(a, d)), Plus(n, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Subtract(m,
                                          C2)),
                                  Power(Plus(c, Times(d,
                                      Tan(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Simp(Plus(
                                      Times(b,
                                          Subtract(Times(b, c, Subtract(m, C2)),
                                              Times(a, d,
                                                  Subtract(Subtract(m, Times(C2, n)), C4)))),
                                      Times(
                                          Subtract(
                                              Plus(Times(a, b, c, Subtract(m, C2)),
                                                  Times(Sqr(b), d, Plus(n, C1))),
                                              Times(Sqr(a), d, Subtract(Plus(m, n), C1))),
                                          Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Plus(Sqr(c),
                          Sqr(d)), C0),
                      GtQ(m, C1), LtQ(n, CN1), Or(IntegerQ(m),
                          IntegersQ(Times(C2, m), Times(C2, n)))))),
          IIntegrate(3554,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          QQ(3L, 2L)),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(Times(C2, Sqr(a),
                          Power(Subtract(Times(a, c), Times(b, d)), CN1)),
                          Integrate(Sqrt(Plus(a, Times(b, Tan(Plus(e, Times(f, x)))))), x), x),
                      Dist(
                          Times(Plus(Times(C2, b, c, d), Times(a, Subtract(Sqr(c), Sqr(d)))),
                              Power(Times(a, Plus(Sqr(c), Sqr(d))), CN1)),
                          Integrate(
                              Times(Subtract(a, Times(b, Tan(Plus(e, Times(f, x))))),
                                  Sqrt(Plus(a, Times(b, Tan(Plus(e, Times(f, x)))))), Power(Plus(c,
                                      Times(d, Tan(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a,
                      d)), C0), EqQ(Plus(Sqr(a),
                          Sqr(b)), C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3555,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          QQ(3L, 2L)),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(Plus(
                  Dist(Times(C2, a),
                      Integrate(Times(Sqrt(Plus(a, Times(b, Tan(Plus(e, Times(f, x)))))),
                          Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), CN1D2)), x),
                      x),
                  Dist(Times(b, Power(a, CN1)),
                      Integrate(
                          Times(Plus(b, Times(a, Tan(Plus(e, Times(f, x))))),
                              Sqrt(Plus(a, Times(b, Tan(Plus(e, Times(f, x)))))),
                              Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), CN1D2)),
                          x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a,
                      d)), C0), EqQ(Plus(Sqr(a),
                          Sqr(b)), C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(3556,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Sqr(b),
                          Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Subtract(m, C2)),
                          Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), Plus(n,
                              C1)),
                          Power(Times(d, f, Subtract(Plus(m, n), C1)), CN1)), x),
                      Dist(
                          Times(a, Power(Times(d, Subtract(Plus(m, n), C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b,
                                          Tan(Plus(e, Times(f, x))))),
                                      Subtract(m, C2)),
                                  Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), n),
                                  Simp(Plus(Times(b, c, Subtract(m, C2)),
                                      Times(a, d, Plus(m, Times(C2, n))),
                                      Times(
                                          Plus(Times(a, c, Subtract(m, C2)),
                                              Times(b, d,
                                                  Subtract(Plus(Times(C3, m), Times(C2, n)), C4))),
                                          Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Plus(Sqr(a), Sqr(b)), C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0), IntegerQ(Times(C2, m)), GtQ(m, C1),
                      NeQ(Subtract(Plus(m, n), C1), C0), Or(IntegerQ(m),
                          IntegersQ(Times(C2, m), Times(C2, n)))))),
          IIntegrate(3557,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Sqrt(
                          Plus(c_DEFAULT,
                              Times(
                                  d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                                      Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(Simp(Times(b, Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), m),
                          Sqrt(Plus(c, Times(d, Tan(Plus(e, Times(f, x)))))), Power(
                              Times(C2, a, f, m), CN1)),
                          x)),
                      Dist(Power(Times(C4, Sqr(a), m), CN1), Integrate(
                          Times(Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Simp(Plus(Times(C2, a, c, m), Times(b, d),
                                  Times(a, d, Plus(Times(C2, m), C1), Tan(Plus(e, Times(f, x))))),
                                  x),
                              Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), CN1D2)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Sqr(a), Sqr(b)), C0), NeQ(Plus(Sqr(c),
                          Sqr(d)), C0),
                      LtQ(m, C0), IntegersQ(Times(C2, m))))),
          IIntegrate(3558,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Subtract(Times(b, c), Times(a, d)),
                                  Power(Plus(a,
                                      Times(b, Tan(Plus(e, Times(f, x))))), m),
                                  Power(
                                      Plus(c, Times(d,
                                          Tan(Plus(e, Times(f, x))))),
                                      Subtract(n, C1)),
                                  Power(Times(C2, a, f, m), CN1)),
                              x)),
                      Dist(
                          Power(Times(C2, Sqr(a),
                              m), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                                  Power(
                                      Plus(c, Times(d,
                                          Tan(Plus(e, Times(f, x))))),
                                      Subtract(n, C2)),
                                  Simp(
                                      Subtract(
                                          Subtract(
                                              Times(c,
                                                  Plus(Times(a, c, m),
                                                      Times(b, d, Subtract(n, C1)))),
                                              Times(d,
                                                  Plus(Times(b, c, m),
                                                      Times(a, d, Subtract(n, C1))))),
                                          Times(d,
                                              Subtract(Times(b, d, Plus(m, Negate(n), C1)),
                                                  Times(a, c, Subtract(Plus(m, n), C1))),
                                              Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Plus(Sqr(a), Sqr(b)), C0), NeQ(Plus(Sqr(c),
                          Sqr(d)), C0),
                      LtQ(m, C0), GtQ(n, C1), Or(IntegerQ(m),
                          IntegersQ(Times(C2, m), Times(C2, n)))))),
          IIntegrate(3559,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(a, Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d,
                                  Tan(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                              Power(Times(C2, f, m, Subtract(Times(b, c), Times(a, d))), CN1)),
                          x),
                      Dist(Power(Times(C2, a, m, Subtract(Times(b, c), Times(a, d))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Tan(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), n),
                                  Simp(
                                      Plus(Times(b, c, m),
                                          Times(CN1, a, d, Plus(Times(C2, m), n, C1)),
                                          Times(b, d, Plus(m, n, C1), Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Plus(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Plus(Sqr(c),
                          Sqr(d)), C0),
                      LtQ(m, C0), Or(IntegerQ(m), IntegersQ(Times(C2, m), Times(C2, n)))))),
          IIntegrate(3560,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§tan"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              d, Power(Plus(a,
                                  Times(b, Tan(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Tan(Plus(e, Times(f, x))))), Subtract(n,
                                  C1)),
                              Power(Times(f, Subtract(Plus(m, n), C1)), CN1)),
                          x),
                      Dist(Power(Times(a, Subtract(Plus(m, n), C1)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a,
                                      Times(b, Tan(Plus(e, Times(f, x))))), m),
                                  Power(
                                      Plus(c, Times(d,
                                          Tan(Plus(e, Times(f, x))))),
                                      Subtract(n, C2)),
                                  Simp(Plus(
                                      Times(d, Plus(Times(b, c, m), Times(a, d, Plus(CN1, n)))),
                                      Times(CN1, a, Sqr(c), Subtract(Plus(m, n), C1)),
                                      Times(d,
                                          Subtract(Times(b, d, m),
                                              Times(a, c, Subtract(Plus(m, Times(C2, n)), C2))),
                                          Tan(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0), EqQ(Plus(Sqr(a), Sqr(b)), C0),
                      NeQ(Plus(Sqr(c), Sqr(d)), C0), GtQ(n, C1), NeQ(Subtract(Plus(m, n), C1), C0),
                      Or(IntegerQ(n), IntegersQ(Times(C2, m), Times(C2, n)))))));
}
