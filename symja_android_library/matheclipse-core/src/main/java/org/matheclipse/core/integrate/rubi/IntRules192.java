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
class IntRules192 {
  public static IAST RULES =
      List(
          IIntegrate(3841,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Sqr(a), Cot(Plus(e,
                                  Times(f, x))),
                              Power(Plus(a, Times(b,
                                  Csc(Plus(e, Times(f, x))))), Subtract(m,
                                      C2)),
                              Power(Times(d,
                                  Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(f, n), CN1)),
                          x),
                      Dist(Power(Times(d, n), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))),
                                      Subtract(m, C3)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)),
                                  Simp(
                                      Subtract(
                                          Subtract(
                                              Times(Sqr(a), b,
                                                  Subtract(Subtract(m, Times(C2, n)), C2)),
                                              Times(a,
                                                  Plus(Times(C3, Sqr(b), n),
                                                      Times(Sqr(a), Plus(n, C1))),
                                                  Csc(Plus(e, Times(f, x))))),
                                          Times(b,
                                              Plus(Times(Sqr(b), n),
                                                  Times(Sqr(a), Subtract(Plus(m, n), C1))),
                                              Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0), GtQ(m, C2),
                      Or(And(IntegerQ(m), LtQ(n,
                          CN1)), And(IntegersQ(Plus(m, C1D2), Times(C2, n)),
                              LeQ(n, CN1)))))),
          IIntegrate(3842,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  Sqr(b), Cot(Plus(e,
                                      Times(f, x))),
                                  Power(
                                      Plus(a, Times(
                                          b, Csc(Plus(e, Times(f, x))))),
                                      Subtract(m, C2)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                                  Power(Times(f, Subtract(Plus(m, n), C1)), CN1)),
                              x)),
                      Dist(
                          Power(Times(d,
                              Subtract(Plus(m, n), C1)), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Subtract(m, C3)),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                              Simp(Plus(Times(Power(a, C3), d, Subtract(Plus(m, n), C1)),
                                  Times(a, Sqr(b), d, n),
                                  Times(b,
                                      Plus(Times(Sqr(b), d, Subtract(Plus(m, n), C2)),
                                          Times(C3, Sqr(a), d, Subtract(Plus(m, n), C1))),
                                      Csc(Plus(e, Times(f, x)))),
                                  Times(a, Sqr(b), d,
                                      Subtract(Plus(Times(C3, m), Times(C2, n)), C4),
                                      Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, n), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0),
                      GtQ(m, C2), Or(IntegerQ(m), IntegersQ(Times(C2, m),
                          Times(C2, n))),
                      Not(And(IGtQ(n, C2), Not(IntegerQ(m))))))),
          IIntegrate(3843,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(
                                  b, d, Cot(Plus(e,
                                      Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(
                                      Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(
                                      Plus(e, Times(f, x)))), Subtract(n,
                                          C1)),
                                  Power(Times(f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                              x)),
                      Dist(
                          Power(Times(Plus(m, C1),
                              Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(Times(
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C1)),
                              Simp(
                                  Subtract(
                                      Plus(Times(b, d, Subtract(n, C1)),
                                          Times(a, d, Plus(m, C1), Csc(Plus(e, Times(f, x))))),
                                      Times(b, d, Plus(m, n, C1), Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m, CN1), LtQ(C0, n,
                          C1),
                      IntegersQ(Times(C2, m), Times(C2, n))))),
          IIntegrate(3844,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(a, Sqr(d), Cot(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b, Csc(
                                  Plus(e, Times(f, x))))), Plus(m, C1)),
                              Power(Times(d, Csc(
                                  Plus(e, Times(f, x)))), Subtract(n,
                                      C2)),
                              Power(Times(f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                          x),
                      Dist(Times(Sqr(d), Power(Times(Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C2)),
                                  Subtract(
                                      Plus(Times(a, Subtract(n, C2)),
                                          Times(b, Plus(m, C1), Csc(Plus(e, Times(f, x))))),
                                      Times(a, Plus(m, n), Sqr(Csc(Plus(e, Times(f, x))))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m, CN1), LtQ(C1, n,
                          C2),
                      IntegersQ(Times(C2, m), Times(C2, n))))),
          IIntegrate(3845,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Sqr(a), Power(d, C3), Cot(Plus(e, Times(f, x))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(
                                      Plus(e, Times(f, x)))), Subtract(n,
                                          C3)),
                                  Power(Times(b, f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                              x)),
                      Dist(
                          Times(
                              Power(d, C3),
                              Power(Times(b, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C3)),
                                  Simp(Subtract(
                                      Plus(Times(Sqr(a), Subtract(n, C3)),
                                          Times(a, b, Plus(m, C1), Csc(Plus(e, Times(f, x))))),
                                      Times(
                                          Plus(Times(Sqr(a), Subtract(n, C2)),
                                              Times(Sqr(b), Plus(m, C1))),
                                          Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m, CN1), Or(IGtQ(n, C3),
                          And(IntegersQ(Plus(n, C1D2), Times(C2, m)), GtQ(n, C2)))))),
          IIntegrate(3846,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Cot(Plus(e, Times(f, x))),
                              Power(Plus(a, Times(b,
                                  Csc(Plus(e, Times(f, x))))), Plus(m,
                                      C1)),
                              Power(Times(d,
                                  Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(a, f, n), CN1)),
                          x),
                      Dist(Power(Times(a, d, n), CN1),
                          Integrate(Times(Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), m),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n, C1)), Simp(
                                  Subtract(
                                      Subtract(Times(b, Plus(m, n, C1)),
                                          Times(a, Plus(n, C1), Csc(Plus(e, Times(f, x))))),
                                      Times(b, Plus(m, n, C2), Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(
                      b)), C0), ILtQ(Plus(m,
                          C1D2), C0),
                      ILtQ(n, C0)))),
          IIntegrate(3847,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          m_)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Sqr(b), Cot(Plus(e, Times(f, x))),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                          Power(Times(d, Csc(Plus(e, Times(f, x)))), n), Power(
                              Times(a, f, Plus(m, C1), Subtract(Sqr(a), Sqr(b))), CN1)),
                          x),
                      Dist(
                          Power(Times(a, Plus(m, C1),
                              Subtract(Sqr(a), Sqr(b))), CN1),
                          Integrate(
                              Times(
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), Plus(m, C1)),
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), n),
                                  Plus(Times(Sqr(a), Plus(m, C1)),
                                      Times(CN1, Sqr(b), Plus(m, n, C1)),
                                      Times(CN1, a, b, Plus(m, C1), Csc(Plus(e, Times(f, x)))),
                                      Times(Sqr(b), Plus(m, n, C2),
                                          Sqr(Csc(Plus(e, Times(f, x))))))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, n), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LtQ(m,
                          CN1),
                      IntegersQ(Times(C2, m), Times(C2, n))))),
          IIntegrate(3848,
              Integrate(
                  Times(
                      Sqrt(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          d_DEFAULT)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(Times(d, Sin(Plus(e, Times(f, x))))), Sqrt(Times(d,
                              Csc(Plus(e, Times(f, x))))),
                          Power(d, CN1)),
                      Integrate(
                          Times(
                              Sqrt(Times(d, Sin(Plus(e, Times(f, x))))), Power(
                                  Plus(b, Times(a, Sin(Plus(e, Times(f, x))))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3849,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          QQ(3L, 2L)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          d, Sqrt(Times(d,
                              Sin(Plus(e, Times(f, x))))),
                          Sqrt(Times(d, Csc(Plus(e, Times(f, x)))))),
                      Integrate(
                          Power(
                              Times(
                                  Sqrt(Times(d,
                                      Sin(Plus(e, Times(f, x))))),
                                  Plus(b, Times(a, Sin(Plus(e, Times(f, x)))))),
                              CN1),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3850,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT),
                          QQ(5L, 2L)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Dist(
                          Times(d, Power(b, CN1)), Integrate(
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), QQ(3L, 2L)), x),
                          x),
                      Dist(Times(a, d, Power(b, CN1)),
                          Integrate(
                              Times(
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), QQ(3L,
                                      2L)),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3851,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Negate(
                          Simp(
                              Times(Power(d, C3), Cot(Plus(e, Times(f, x))),
                                  Power(Times(d, Csc(
                                      Plus(e, Times(f, x)))), Subtract(n,
                                          C3)),
                                  Power(Times(b, f, Subtract(n, C2)), CN1)),
                              x)),
                      Dist(
                          Times(Power(d, C3), Power(Times(b, Subtract(n, C2)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n,
                                      C3)),
                                  Simp(
                                      Subtract(
                                          Plus(Times(a, Subtract(n, C3)),
                                              Times(b, Subtract(n, C3), Csc(Plus(e, Times(f, x))))),
                                          Times(a, Subtract(n, C2),
                                              Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), GtQ(n,
                          C3)))),
          IIntegrate(3852,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          CN1D2),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(Times(Sqr(b), Power(Times(Sqr(a), Sqr(d)), CN1)),
                          Integrate(Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), QQ(3L, 2L)),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1)), x),
                          x),
                      Dist(Power(a, CN2),
                          Integrate(Times(Subtract(a, Times(b, Csc(Plus(e, Times(f, x))))),
                              Power(Times(d, Csc(Plus(e, Times(f, x)))), CN1D2)), x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3853,
              Integrate(Times(
                  Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT), n_),
                  Power(
                      Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), b_DEFAULT),
                          a_),
                      CN1)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Cot(Plus(e, Times(f, x))),
                              Power(Times(d,
                                  Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(a, f, n), CN1)),
                          x),
                      Dist(
                          Power(Times(a, d,
                              n), CN1),
                          Integrate(
                              Times(
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n,
                                      C1)),
                                  Simp(
                                      Subtract(
                                          Subtract(Times(b, n), Times(a, Plus(n, C1),
                                              Csc(Plus(e, Times(f, x))))),
                                          Times(b, Plus(n, C1), Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LeQ(n,
                          CN1),
                      IntegerQ(Times(C2, n))))),
          IIntegrate(3854,
              Integrate(
                  Times(
                      Sqrt(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT)),
                      Sqrt(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_))),
                  x_Symbol),
              Condition(
                  Plus(
                      Dist(a,
                          Integrate(
                              Times(Sqrt(Times(d, Csc(Plus(e, Times(f, x))))),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x),
                      Dist(Times(b, Power(d, CN1)),
                          Integrate(
                              Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), QQ(3L, 2L)),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3855,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Sqrt(
                          Plus(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              b_DEFAULT), a_))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(CN2, d, Cos(Plus(e, Times(f, x))),
                              Sqrt(Plus(a, Times(b, Csc(
                                  Plus(e, Times(f, x)))))),
                              Power(Times(d, Csc(
                                  Plus(e, Times(f, x)))), Subtract(n,
                                      C1)),
                              Power(Times(f, Subtract(Times(C2, n), C1)), CN1)),
                          x),
                      Dist(
                          Times(Sqr(d), Power(Subtract(Times(C2, n), C1), CN1)), Integrate(
                              Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(n, C2)),
                                  Simp(
                                      Plus(Times(C2, a, Subtract(n, C2)),
                                          Times(b, Subtract(Times(C2, n), C3),
                                              Csc(Plus(e, Times(f, x)))),
                                          Times(a, Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), GtQ(n,
                          C1),
                      IntegerQ(Times(C2, n))))),
          IIntegrate(3856,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          CN1D2),
                      Sqrt(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_))),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(Plus(a,
                              Times(b, Csc(Plus(e, Times(f, x)))))),
                          Power(
                              Times(
                                  Sqrt(Times(d, Csc(
                                      Plus(e, Times(f, x))))),
                                  Sqrt(Plus(b, Times(a, Sin(Plus(e, Times(f, x))))))),
                              CN1)),
                      Integrate(Sqrt(Plus(b, Times(a, Sin(Plus(e, Times(f, x)))))), x), x),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3857,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Sqrt(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Cot(Plus(e, Times(f, x))),
                              Sqrt(Plus(a, Times(b,
                                  Csc(Plus(e, Times(f, x)))))),
                              Power(Times(d,
                                  Csc(Plus(e, Times(f, x)))), n),
                              Power(Times(f, n), CN1)),
                          x),
                      Dist(
                          Power(Times(C2, d,
                              n), CN1),
                          Integrate(
                              Times(
                                  Power(Times(d, Csc(Plus(e, Times(f, x)))), Plus(n,
                                      C1)),
                                  Simp(
                                      Subtract(
                                          Subtract(b,
                                              Times(C2, a, Plus(n, C1), Csc(Plus(e, Times(f, x))))),
                                          Times(b, Plus(Times(C2, n), C3),
                                              Sqr(Csc(Plus(e, Times(f, x)))))),
                                      x),
                                  Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a),
                      Sqr(b)), C0), LeQ(n,
                          CN1),
                      IntegerQ(Times(C2, n))))),
          IIntegrate(3858,
              Integrate(
                  Times(
                      Sqrt(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), d_DEFAULT)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(Times(d, Csc(Plus(e,
                              Times(f, x))))),
                          Sqrt(Plus(b,
                              Times(a, Sin(Plus(e, Times(f, x)))))),
                          Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                      Integrate(Power(Plus(b, Times(a, Sin(Plus(e, Times(f, x))))), CN1D2), x), x),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3859,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          QQ(3L, 2L)),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(d, Sqrt(Times(d, Csc(Plus(e, Times(f, x))))),
                          Sqrt(Plus(b, Times(a, Sin(Plus(e, Times(f, x)))))), Power(
                              Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)),
                      Integrate(
                          Power(
                              Times(Sin(Plus(e, Times(f, x))),
                                  Sqrt(Plus(b, Times(a, Sin(Plus(e, Times(f, x))))))),
                              CN1),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0)))),
          IIntegrate(3860,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          n_),
                      Power(
                          Plus(
                              Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_),
                          CN1D2)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(CN2, Sqr(d), Cos(Plus(e, Times(f, x))),
                              Power(Times(d, Csc(
                                  Plus(e, Times(f, x)))), Subtract(n, C2)),
                              Sqrt(Plus(a,
                                  Times(b, Csc(Plus(e, Times(f, x)))))),
                              Power(Times(b, f, Subtract(Times(C2, n), C3)), CN1)),
                          x),
                      Dist(Times(Power(d, C3), Power(Times(b, Subtract(Times(C2, n), C3)), CN1)),
                          Integrate(Times(Power(Times(d, Csc(Plus(e, Times(f, x)))),
                              Subtract(n, C3)),
                              Simp(Subtract(
                                  Plus(Times(C2, a, Subtract(n, C3)),
                                      Times(b, Subtract(Times(C2, n), C5),
                                          Csc(Plus(e, Times(f, x))))),
                                  Times(C2, a, Subtract(n, C2), Sqr(Csc(Plus(e, Times(f, x)))))),
                                  x),
                              Power(Plus(a, Times(b, Csc(Plus(e, Times(f, x))))), CN1D2)), x),
                          x)),
                  And(FreeQ(List(a, b, d, e, f), x), NeQ(Subtract(Sqr(a), Sqr(b)), C0), GtQ(n, C2),
                      IntegerQ(Times(C2, n))))));
}
