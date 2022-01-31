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
class IntRules138 {
  public static IAST RULES =
      List(
          IIntegrate(2761,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Sqr(Plus(c_, Times(d_DEFAULT, $($s("§sin"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Sqr(d), Cos(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(b, f, Plus(m, C2)), CN1)),
                              x)),
                      Dist(
                          Power(Times(b,
                              Plus(m, C2)), CN1),
                          Integrate(
                              Times(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                                  Simp(Subtract(
                                      Times(b,
                                          Plus(Times(Sqr(d), Plus(m, C1)),
                                              Times(Sqr(c), Plus(m, C2)))),
                                      Times(d, Subtract(Times(a, d), Times(C2, b, c, Plus(m, C2))),
                                          Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, m), x),
                      NeQ(Subtract(Times(b, c), Times(a,
                          d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), Not(LtQ(m, CN1))))),
          IIntegrate(2762,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(b), Subtract(Times(b, c), Times(a, d)),
                                  Cos(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C2)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                                  Power(Times(d, f, Plus(n, C1), Plus(Times(b, c), Times(a, d))),
                                      CN1)),
                              x)),
                      Dist(
                          Times(
                              Sqr(b), Power(Times(d, Plus(n, C1), Plus(Times(b, c), Times(a, d))),
                                  CN1)),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m,
                                          C2)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                                  Simp(Subtract(
                                      Subtract(Times(a, c, Subtract(m, C2)),
                                          Times(b, d, Subtract(Subtract(m, Times(C2, n)), C4))),
                                      Times(
                                          Subtract(Times(b, c, Subtract(m, C1)),
                                              Times(a, d, Plus(m, Times(C2, n), C1))),
                                          Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      GtQ(m, C1), LtQ(n, CN1), Or(
                          IntegersQ(Times(C2, m), Times(C2, n)), IntegerQ(Plus(m,
                              C1D2)),
                          And(IntegerQ(m), EqQ(c, C0)))))),
          IIntegrate(2763,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(b), Cos(Plus(e, Times(f, x))),
                                  Power(
                                      Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Subtract(m,
                                          C2)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                                  Power(Times(d, f, Plus(m, n)), CN1)),
                              x)),
                      Dist(
                          Power(Times(d,
                              Plus(m, n)), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))),
                                      Subtract(m, C2)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(Subtract(Plus(Times(a, b, c, Subtract(m, C2)),
                                      Times(Sqr(b), d, Plus(n, C1)), Times(Sqr(a), d, Plus(m, n))),
                                      Times(b,
                                          Subtract(Times(b, c, Subtract(m, C1)),
                                              Times(a, d,
                                                  Subtract(Plus(Times(C3, m), Times(C2, n)), C2))),
                                          Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      GtQ(m, C1), Not(LtQ(n,
                          CN1)),
                      Or(IntegersQ(Times(C2, m), Times(C2, n)), IntegerQ(Plus(m,
                          C1D2)), And(IntegerQ(m),
                              EqQ(c, C0)))))),
          IIntegrate(2764,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(b, Cos(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                          Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)), x),
                      Dist(Power(Times(a, b, Plus(Times(C2, m), C1)), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Subtract(n, C1)),
                              Simp(
                                  Subtract(Subtract(Times(a, d, n), Times(b, c, Plus(m, C1))),
                                      Times(b, d, Plus(m, n, C1), Sin(Plus(e, Times(f, x))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      LtQ(m, CN1), LtQ(C0, n, C1), Or(IntegersQ(Times(C2, m), Times(C2,
                          n)), And(IntegerQ(m),
                              EqQ(c, C0)))))),
          IIntegrate(2765,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Subtract(Times(b, c), Times(a, d)), Cos(Plus(e, Times(f,
                                  x))),
                              Power(Plus(a,
                                  Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(
                                  d, Sin(Plus(e, Times(f, x))))), Subtract(n, C1)),
                              Power(Times(a, f, Plus(Times(C2, m), C1)), CN1)),
                          x),
                      Dist(Power(Times(a, b, Plus(Times(C2, m), C1)), CN1), Integrate(Times(
                          Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                          Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Subtract(n, C2)),
                          Simp(
                              Plus(
                                  Times(b,
                                      Plus(Times(Sqr(c), Plus(m, C1)),
                                          Times(Sqr(d), Subtract(n, C1)))),
                                  Times(a, c, d, Plus(m, Negate(n), C1)),
                                  Times(d,
                                      Plus(Times(a, d, Plus(m, Negate(n), C1)),
                                          Times(b, c, Plus(m, n))),
                                      Sin(Plus(e, Times(f, x))))),
                              x)),
                          x), x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      LtQ(m, CN1), GtQ(n, C1), Or(IntegersQ(Times(C2, m), Times(C2,
                          n)), And(IntegerQ(m),
                              EqQ(c, C0)))))),
          IIntegrate(2766,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          m_),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Sqr(b), Cos(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), m),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n,
                                  C1)),
                              Power(
                                  Times(
                                      a, f, Plus(Times(C2,
                                          m), C1),
                                      Subtract(Times(b, c), Times(a, d))),
                                  CN1)),
                          x),
                      Dist(
                          Power(
                              Times(a, Plus(Times(C2,
                                  m), C1), Subtract(Times(b, c),
                                      Times(a, d))),
                              CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Simp(
                                      Plus(Times(b, c, Plus(m, C1)),
                                          Times(CN1, a, d, Plus(Times(C2, m), n, C2)),
                                          Times(b, d, Plus(m, n, C2), Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0),
                      LtQ(m, CN1), Not(GtQ(n,
                          C0)),
                      Or(IntegersQ(Times(C2, m), Times(C2, n)), And(IntegerQ(m), EqQ(c, C0)))))),
          IIntegrate(2767,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(
                                  Subtract(Times(b, c), Times(a, d)), Cos(Plus(e,
                                      Times(f, x))),
                                  Power(
                                      Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Subtract(n,
                                          C1)),
                                  Power(
                                      Times(a, f, Plus(a,
                                          Times(b, Sin(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x)),
                      Dist(
                          Times(d, Power(Times(a, b),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(
                                      Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Subtract(n,
                                          C2)),
                                  Simp(
                                      Plus(Times(b, d, Subtract(n, C1)), Times(CN1, a, c, n),
                                          Times(
                                              Subtract(Times(b, c, Subtract(n, C1)),
                                                  Times(a, d, n)),
                                              Sin(Plus(e, Times(f, x))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      GtQ(n, C1), Or(IntegerQ(Times(C2, n)), EqQ(c, C0))))),
          IIntegrate(2768,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(b), Cos(Plus(e, Times(f, x))),
                                  Power(Plus(c, Times(d,
                                      Sin(Plus(e, Times(f, x))))), Plus(n,
                                          C1)),
                                  Power(
                                      Times(
                                          a, f, Subtract(Times(b, c), Times(a, d)), Plus(a, Times(b,
                                              Sin(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x)),
                      Dist(
                          Times(d, Power(Times(a, Subtract(Times(b, c), Times(a, d))),
                              CN1)),
                          Integrate(
                              Times(Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Subtract(Times(a, n),
                                      Times(b, Plus(n, C1), Sin(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      LtQ(n, C0), Or(IntegerQ(Times(C2, n)), EqQ(c, C0))))),
          IIntegrate(2769,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  b, Cos(Plus(e, Times(f,
                                      x))),
                                  Power(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x))))), n),
                                  Power(Times(a, f, Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                      CN1)),
                              x)),
                      Dist(Times(d, n, Power(Times(a, b), CN1)),
                          Integrate(
                              Times(Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Subtract(n,
                                  C1)), Subtract(a,
                                      Times(b, Sin(Plus(e, Times(f, x)))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0), Or(IntegerQ(Times(C2, n)), EqQ(c, C0))))),
          IIntegrate(2770,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(CN2, b, Cos(Plus(e, Times(f, x))),
                              Power(Plus(c,
                                  Times(d, Sin(Plus(e, Times(f, x))))), n),
                              Power(
                                  Times(
                                      f, Plus(Times(C2, n), C1), Sqrt(Plus(a,
                                          Times(b, Sin(Plus(e, Times(f, x))))))),
                                  CN1)),
                          x),
                      Dist(
                          Times(
                              C2, n, Plus(Times(b, c), Times(a, d)), Power(
                                  Times(b, Plus(Times(C2, n), C1)), CN1)),
                          Integrate(
                              Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))),
                                      Subtract(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      GtQ(n, C0), IntegerQ(Times(C2, n))))),
          IIntegrate(2771,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          QQ(-3L, 2L))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(
                          CN2, Sqr(b), Cos(Plus(e,
                              Times(f, x))),
                          Power(
                              Times(f, Plus(Times(b, c), Times(a, d)),
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), Sqrt(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x))))))),
                              CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                      C0), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2772,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Subtract(Times(b, c), Times(a, d)), Cos(Plus(e, Times(f, x))),
                              Power(Plus(c, Times(d,
                                  Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                              Power(Times(
                                  f, Plus(n, C1), Subtract(Sqr(c), Sqr(d)), Sqrt(Plus(a,
                                      Times(b, Sin(Plus(e, Times(f, x))))))),
                                  CN1)),
                          x),
                      Dist(
                          Times(
                              Plus(Times(C2, n), C3), Subtract(Times(b, c), Times(a, d)),
                              Power(Times(C2, b, Plus(n, C1), Subtract(Sqr(c), Sqr(d))), CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c),
                          Sqr(d)), C0),
                      LtQ(n, CN1), NeQ(Plus(Times(C2, n), C3), C0), IntegerQ(Times(C2, n))))),
          IIntegrate(2773,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(
                              a_,
                              Times(b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(CN2, b, Power(f,
                          CN1)),
                      Subst(
                          Integrate(
                              Power(Subtract(Plus(Times(b, c), Times(a, d)), Times(d, Sqr(x))),
                                  CN1),
                              x),
                          x,
                          Times(
                              b, Cos(Plus(e,
                                  Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1D2))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c),
                      Times(a, d)), C0), EqQ(Subtract(Sqr(a), Sqr(b)),
                          C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2774,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          CN1D2),
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                      Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(CN2, Power(f,
                          CN1)),
                      Subst(
                          Integrate(Power(Subtract(C1, Times(Sqr(x), Power(a, CN1))),
                              CN1D2), x),
                          x,
                          Times(
                              b, Cos(Plus(e,
                                  Times(f, x))),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1D2))),
                      x),
                  And(FreeQ(List(a, b, d, e, f), x), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      EqQ(d, Times(a, Power(b, CN1)))))),
          IIntegrate(2775,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, $($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(Times(CN2, b, Power(f, CN1)),
                      Subst(Integrate(Power(Plus(b, Times(d, Sqr(x))), CN1), x), x,
                          Times(b, Cos(Plus(e, Times(f, x))),
                              Power(Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Sqrt(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))))), CN1))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                      C0), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2776,
              Integrate(
                  Times(
                      Sqrt(
                          Plus(
                              a_,
                              Times(
                                  b_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))))),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Sqr(a), Cos(Plus(e, Times(f, x))),
                          Power(
                              Times(f, Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                                  Sqrt(Subtract(a, Times(b, Sin(Plus(e, Times(f, x))))))),
                              CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Plus(c, Times(d, x)), n), Power(Subtract(a, Times(b, x)),
                                      CN1D2)),
                              x),
                          x, Sin(Plus(e, Times(f, x)))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, n), x),
                      NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)),
                          C0),
                      Not(IntegerQ(Times(C2, n)))))),
          IIntegrate(2777,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Sqrt(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(
                          Times(d, Power(b,
                              CN1)),
                          Integrate(
                              Times(
                                  Sqrt(Plus(a, Times(b,
                                      Sin(Plus(e, Times(f, x)))))),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(
                          Times(Subtract(Times(b, c), Times(a, d)), Power(b,
                              CN1)),
                          Integrate(
                              Power(Times(
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))), Sqrt(Plus(c,
                                      Times(d, Sin(Plus(e, Times(f, x))))))),
                                  CN1),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)),
                      C0), EqQ(Subtract(Sqr(a), Sqr(b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0)))),
          IIntegrate(2778,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              CN2, d, Cos(Plus(e,
                                  Times(f, x))),
                              Power(Plus(c, Times(d,
                                  Sin(Plus(e, Times(f, x))))), Subtract(n,
                                      C1)),
                              Power(Times(f, Subtract(Times(C2, n), C1),
                                  Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))))), CN1)),
                          x),
                      Dist(Power(Times(b, Subtract(Times(C2, n), C1)), CN1),
                          Integrate(Times(
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Subtract(n, C2)),
                              Simp(
                                  Plus(Times(a, c, d),
                                      Times(CN1, b,
                                          Plus(Times(C2, Sqr(d), Subtract(n, C1)),
                                              Times(Sqr(c), Subtract(Times(C2, n), C1)))),
                                      Times(d,
                                          Subtract(Times(a, d),
                                              Times(b, c, Subtract(Times(C4, n), C3))),
                                          Sin(Plus(e, Times(f, x))))),
                                  x),
                              Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1D2)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0), GtQ(n, C1), IntegerQ(Times(C2, n))))),
          IIntegrate(2779,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT,
                                  Times(f_DEFAULT, x_))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Negate(
                          Simp(
                              Times(d, Cos(Plus(e, Times(f, x))),
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n,
                                      C1)),
                                  Power(
                                      Times(f, Plus(n, C1), Subtract(Sqr(c), Sqr(d)),
                                          Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))))),
                                      CN1)),
                              x)),
                      Dist(Power(Times(C2, b, Plus(n, C1), Subtract(Sqr(c), Sqr(d))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), Plus(n, C1)),
                                  Simp(Plus(Times(a, d), Times(CN1, C2, b, c, Plus(n, C1)),
                                      Times(b, d, Plus(Times(C2, n), C3),
                                          Sin(Plus(e, Times(f, x))))),
                                      x),
                                  Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(
                          b)), C0),
                      NeQ(Subtract(Sqr(c), Sqr(d)), C0), LtQ(n, CN1), IntegerQ(Times(C2, n))))),
          IIntegrate(2780,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1D2),
                      Power(
                          Plus(c_DEFAULT,
                              Times(d_DEFAULT,
                                  $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(Dist(Times(b, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                      Integrate(Power(Plus(a, Times(b, Sin(Plus(e, Times(f, x))))), CN1D2), x), x),
                      Dist(Times(d, Power(Subtract(Times(b, c), Times(a, d)), CN1)),
                          Integrate(Times(Sqrt(Plus(a, Times(b, Sin(Plus(e, Times(f, x)))))),
                              Power(Plus(c, Times(d, Sin(Plus(e, Times(f, x))))), CN1)), x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), NeQ(Subtract(Times(b, c), Times(a, d)), C0),
                      EqQ(Subtract(Sqr(a), Sqr(b)), C0), NeQ(Subtract(Sqr(c), Sqr(d)), C0)))));
}
