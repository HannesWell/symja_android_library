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
class IntRules258 {
  public static IAST RULES =
      List(
          IIntegrate(5161, Integrate(Times(u_, Power(v_, n_DEFAULT)), x_Symbol),
              Condition(With(List(Set($s("tmp"), InverseFunctionOfLinear(u, x))),
                  Condition(
                      Dist(
                          Times(
                              Power(Times(
                                  CN1, Discriminant(v, x),
                                  Power(Times(C4, Coefficient(v, x, C2)), CN1)), n),
                              Power(Coefficient(Part($s("tmp"), C1), x, C1), CN1)),
                          Subst(Integrate(
                              SimplifyIntegrand(Times(SubstForInverseFunction(u, $s("tmp"), x),
                                  Power(Sec(x), Times(C2, Plus(n, C1)))), x),
                              x), x, $s("tmp")),
                          x),
                      And(Not(FalseQ($s("tmp"))), EqQ(Head($s("tmp")), ArcTan),
                          EqQ(Plus(Times(Discriminant(v, x), Sqr(Part($s("tmp"), C1))),
                              Sqr(D(v, x))), C0)))),
                  And(QuadraticQ(v, x), ILtQ(n, C0), NegQ(Discriminant(v,
                      x)), MatchQ(u,
                          Condition(Times(r_DEFAULT, Power(f_, w_)), FreeQ(f, x)))))),
          IIntegrate(
              5162, Integrate(Times(u_,
                  Power(v_, n_DEFAULT)), x_Symbol),
              Condition(With(List(Set($s("tmp"), InverseFunctionOfLinear(u, x))),
                  Condition(Negate(Dist(
                      Times(Power(Times(CN1, Discriminant(v, x),
                          Power(Times(C4, Coefficient(v, x, C2)), CN1)), n),
                          Power(Coefficient(Part($s("tmp"), C1), x, C1), CN1)),
                      Subst(
                          Integrate(
                              SimplifyIntegrand(Times(SubstForInverseFunction(u, $s("tmp"), x),
                                  Power(Csc(x), Times(C2, Plus(n, C1)))), x),
                              x),
                          x, $s("tmp")),
                      x)), And(
                          Not(FalseQ($s("tmp"))), EqQ(Head($s("tmp")), ArcCot),
                          EqQ(Plus(Times(Discriminant(v, x), Sqr(Part($s("tmp"), C1))),
                              Sqr(D(v, x))), C0)))),
                  And(QuadraticQ(v, x), ILtQ(n, C0), NegQ(Discriminant(v, x)), MatchQ(u,
                      Condition(Times(r_DEFAULT, Power(f_, w_)), FreeQ(f, x)))))),
          IIntegrate(5163,
              Integrate(
                  ArcTan(
                      Plus(c_DEFAULT, Times(d_DEFAULT,
                          Tan(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(x,
                          ArcTan(Plus(c, Times(d, Tan(Plus(a, Times(b, x))))))), x),
                      Dist(Times(CI, b),
                          Integrate(
                              Times(x,
                                  Power(
                                      Plus(c, Times(CI, d),
                                          Times(c, Exp(Plus(Times(C2, CI, a),
                                              Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5164,
              Integrate(
                  ArcCot(
                      Plus(c_DEFAULT, Times(d_DEFAULT,
                          Tan(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(x,
                          ArcCot(Plus(c, Times(d, Tan(Plus(a, Times(b, x))))))), x),
                      Dist(Times(CI, b),
                          Integrate(
                              Times(x,
                                  Power(
                                      Plus(c, Times(CI, d),
                                          Times(c, Exp(Plus(Times(C2, CI, a),
                                              Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5165,
              Integrate(
                  ArcTan(
                      Plus(c_DEFAULT, Times(Cot(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                          d_DEFAULT))),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(x,
                          ArcTan(Plus(c, Times(d, Cot(Plus(a, Times(b, x))))))), x),
                      Dist(Times(CI, b),
                          Integrate(
                              Times(x,
                                  Power(
                                      Subtract(
                                          Subtract(c, Times(CI, d)),
                                          Times(c,
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(Subtract(c, Times(CI, d))), CN1)))),
          IIntegrate(5166,
              Integrate(
                  ArcCot(
                      Plus(c_DEFAULT, Times(Cot(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                          d_DEFAULT))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(x,
                          ArcCot(Plus(c, Times(d, Cot(Plus(a, Times(b, x))))))), x),
                      Dist(Times(CI, b),
                          Integrate(
                              Times(x,
                                  Power(
                                      Subtract(Subtract(c, Times(CI, d)),
                                          Times(c,
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), EqQ(Sqr(Subtract(c, Times(CI, d))), CN1)))),
          IIntegrate(5167,
              Integrate(ArcTan(Plus(c_DEFAULT, Times(d_DEFAULT,
                  Tan(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))))), x_Symbol),
              Condition(
                  Plus(Simp(Times(x, ArcTan(Plus(c, Times(d, Tan(Plus(a, Times(b, x))))))), x),
                      Dist(Times(b, Subtract(Subtract(C1, Times(CI, c)), d)),
                          Integrate(Times(x, Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                              Power(
                                  Plus(C1, Times(CN1, CI, c), d,
                                      Times(Subtract(Subtract(C1, Times(CI, c)), d),
                                          Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                  CN1)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(b, Plus(C1, Times(CI, c),
                                  d)),
                              Integrate(
                                  Times(x, Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                      Power(
                                          Plus(C1, Times(CI, c), Negate(d),
                                              Times(Plus(C1, Times(CI, c), d),
                                                  Exp(Plus(Times(C2, CI, a),
                                                      Times(C2, CI, b, x))))),
                                          CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5168,
              Integrate(ArcCot(Plus(c_DEFAULT, Times(d_DEFAULT,
                  Tan(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))))), x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(x,
                          ArcCot(Plus(c, Times(d, Tan(Plus(a, Times(b, x))))))), x),
                      Negate(
                          Dist(Times(b, Subtract(Subtract(C1, Times(CI, c)), d)),
                              Integrate(
                                  Times(
                                      x, Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                      Power(Plus(C1, Times(CN1, CI, c), d,
                                          Times(Subtract(Subtract(C1, Times(CI, c)), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                          CN1)),
                                  x),
                              x)),
                      Dist(Times(b,
                          Plus(C1, Times(CI, c), d)),
                          Integrate(
                              Times(x, Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Plus(C1, Times(CI, c), Negate(d),
                                          Times(Plus(C1, Times(CI, c), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5169, Integrate(
              ArcTan(Plus(c_DEFAULT, Times(Cot(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), d_DEFAULT))),
              x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(x,
                          ArcTan(Plus(c, Times(d, Cot(Plus(a, Times(b, x))))))), x),
                      Dist(
                          Times(b, Subtract(Plus(C1, Times(CI, c)),
                              d)),
                          Integrate(
                              Times(x, Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Subtract(Plus(C1, Times(CI, c), d),
                                          Times(Subtract(Plus(C1, Times(CI, c)), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x),
                      Negate(
                          Dist(Times(b, Plus(C1, Times(CN1, CI, c), d)),
                              Integrate(Times(x, Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Subtract(Subtract(Subtract(C1, Times(CI, c)), d),
                                          Times(Plus(C1, Times(CN1, CI, c), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5170,
              Integrate(ArcCot(Plus(c_DEFAULT, Times(Cot(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                  d_DEFAULT))), x_Symbol),
              Condition(
                  Plus(Simp(Times(x, ArcCot(Plus(c, Times(d, Cot(Plus(a, Times(b, x))))))), x),
                      Negate(
                          Dist(Times(b, Subtract(Plus(C1, Times(CI, c)), d)),
                              Integrate(
                                  Times(x, Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                      Power(
                                          Subtract(Plus(C1, Times(CI, c), d),
                                              Times(Subtract(Plus(C1, Times(CI, c)), d),
                                                  Exp(Plus(Times(C2, CI, a),
                                                      Times(C2, CI, b, x))))),
                                          CN1)),
                                  x),
                              x)),
                      Dist(
                          Times(b, Plus(C1, Times(CN1, CI, c),
                              d)),
                          Integrate(
                              Times(
                                  x, Exp(Plus(Times(C2, CI, a),
                                      Times(C2, CI, b, x))),
                                  Power(
                                      Subtract(
                                          Subtract(Subtract(C1,
                                              Times(CI, c)), d),
                                          Times(Plus(C1, Times(CN1, CI, c), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d), x), NeQ(Sqr(Subtract(c, Times(CI, d))), CN1)))),
          IIntegrate(5171,
              Integrate(
                  Times(
                      ArcTan(
                          Plus(
                              c_DEFAULT,
                              Times(d_DEFAULT, Tan(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))))),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                              ArcTan(Plus(c, Times(d, Tan(Plus(a, Times(b, x)))))), Power(
                                  Times(f, Plus(m, C1)), CN1)),
                          x),
                      Dist(Times(CI, b, Power(Times(f, Plus(m, C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Power(
                                      Plus(c, Times(CI, d),
                                          Times(c,
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), IGtQ(m,
                          C0),
                      EqQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5172,
              Integrate(
                  Times(
                      ArcCot(Plus(c_DEFAULT,
                          Times(d_DEFAULT, Tan(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))))),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                              ArcCot(Plus(c,
                                  Times(d, Tan(Plus(a, Times(b, x)))))),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(CI, b, Power(Times(f, Plus(m, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(e, Times(f, x)), Plus(m,
                                      C1)),
                                  Power(
                                      Plus(c, Times(CI, d),
                                          Times(c,
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0),
                      EqQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5173,
              Integrate(
                  Times(
                      ArcTan(
                          Plus(
                              c_DEFAULT, Times(Cot(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                                  d_DEFAULT))),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                              ArcTan(Plus(c, Times(d, Cot(Plus(a, Times(b, x)))))), Power(
                                  Times(f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(CI, b, Power(Times(f, Plus(m, C1)),
                              CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Power(
                                      Subtract(Subtract(c, Times(CI, d)),
                                          Times(c,
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0),
                      EqQ(Sqr(Subtract(c, Times(CI, d))), CN1)))),
          IIntegrate(5174,
              Integrate(
                  Times(
                      ArcCot(
                          Plus(c_DEFAULT, Times(Cot(Plus(a_DEFAULT, Times(b_DEFAULT, x_))),
                              d_DEFAULT))),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                              ArcCot(Plus(c,
                                  Times(d, Cot(Plus(a, Times(b, x)))))),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(CI, b, Power(Times(f, Plus(m, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Plus(e, Times(f, x)), Plus(m,
                                      C1)),
                                  Power(
                                      Subtract(
                                          Subtract(c, Times(CI,
                                              d)),
                                          Times(c,
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0),
                      EqQ(Sqr(Subtract(c, Times(CI, d))), CN1)))),
          IIntegrate(5175,
              Integrate(
                  Times(
                      ArcTan(
                          Plus(
                              c_DEFAULT, Times(d_DEFAULT,
                                  Tan(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))))),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                              ArcTan(Plus(c, Times(d, Tan(Plus(a, Times(b, x)))))), Power(
                                  Times(f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, Subtract(Subtract(C1, Times(CI, c)), d),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Plus(C1, Times(CN1, CI, c), d,
                                          Times(
                                              Subtract(Subtract(C1, Times(CI, c)), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(b, Plus(C1, Times(CI,
                                  c), d), Power(Times(f, Plus(m, C1)),
                                      CN1)),
                              Integrate(Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Plus(C1, Times(CI, c), Negate(d),
                                          Times(Plus(C1, Times(CI, c), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), IGtQ(m, C0), NeQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5176,
              Integrate(
                  Times(
                      ArcCot(Plus(c_DEFAULT,
                          Times(d_DEFAULT, Tan(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))))),
                      Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                              ArcCot(Plus(c,
                                  Times(d, Tan(Plus(a, Times(b, x)))))),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(
                                  b, Subtract(Subtract(C1, Times(CI, c)),
                                      d),
                                  Power(Times(f, Plus(m, C1)), CN1)),
                              Integrate(Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Plus(C1, Times(CN1, CI, c), d,
                                          Times(Subtract(Subtract(C1, Times(CI, c)), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                                  x),
                              x)),
                      Dist(
                          Times(b, Plus(C1, Times(CI,
                              c), d), Power(Times(f, Plus(m, C1)),
                                  CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Plus(C1, Times(CI, c), Negate(d),
                                          Times(Plus(C1, Times(CI, c), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f), x), IGtQ(m, C0),
                      NeQ(Sqr(Plus(c, Times(CI, d))), CN1)))),
          IIntegrate(5177,
              Integrate(Times(ArcTan(
                  Plus(c_DEFAULT, Times(Cot(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), d_DEFAULT))),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)), x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                          ArcTan(Plus(c, Times(d, Cot(Plus(a, Times(b, x)))))), Power(
                              Times(f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(b, Subtract(Plus(C1, Times(CI, c)), d),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(Subtract(Plus(C1, Times(CI, c), d),
                                      Times(Subtract(Plus(C1, Times(CI, c)), d),
                                          Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x),
                      Negate(
                          Dist(
                              Times(
                                  b, Plus(C1, Times(CN1, CI, c), d),
                                  Power(Times(f, Plus(m, C1)), CN1)),
                              Integrate(Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Subtract(Subtract(Subtract(C1, Times(CI, c)), d),
                                          Times(Plus(C1, Times(CN1, CI, c), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), IGtQ(m,
                          C0),
                      NeQ(Sqr(Subtract(c, Times(CI, d))), CN1)))),
          IIntegrate(5178,
              Integrate(Times(ArcCot(
                  Plus(c_DEFAULT, Times(Cot(Plus(a_DEFAULT, Times(b_DEFAULT, x_))), d_DEFAULT))),
                  Power(Plus(e_DEFAULT, Times(f_DEFAULT, x_)), m_DEFAULT)), x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                              ArcCot(Plus(c, Times(d, Cot(Plus(a, Times(b, x)))))), Power(
                                  Times(f, Plus(m, C1)), CN1)),
                          x),
                      Negate(
                          Dist(
                              Times(
                                  b, Subtract(Plus(C1,
                                      Times(CI, c)), d),
                                  Power(Times(f, Plus(m, C1)), CN1)),
                              Integrate(
                                  Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                      Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                      Power(
                                          Subtract(Plus(C1, Times(CI, c), d),
                                              Times(Subtract(Plus(C1, Times(CI, c)), d),
                                                  Exp(Plus(Times(C2, CI, a),
                                                      Times(C2, CI, b, x))))),
                                          CN1)),
                                  x),
                              x)),
                      Dist(
                          Times(b, Plus(C1, Times(CN1, CI, c), d),
                              Power(Times(f, Plus(m, C1)), CN1)),
                          Integrate(
                              Times(Power(Plus(e, Times(f, x)), Plus(m, C1)),
                                  Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))),
                                  Power(
                                      Subtract(Subtract(Subtract(C1, Times(CI, c)), d),
                                          Times(Plus(C1, Times(CN1, CI, c), d),
                                              Exp(Plus(Times(C2, CI, a), Times(C2, CI, b, x))))),
                                      CN1)),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e,
                      f), x), IGtQ(m,
                          C0),
                      NeQ(Sqr(Subtract(c, Times(CI, d))), CN1)))),
          IIntegrate(
              5179, Integrate(ArcTan(
                  Tanh(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))), x_Symbol),
              Condition(
                  Subtract(Simp(Times(x, ArcTan(Tanh(Plus(a, Times(b, x))))), x),
                      Dist(b, Integrate(Times(x, Sech(Plus(Times(C2, a), Times(C2, b, x)))), x),
                          x)),
                  FreeQ(List(a, b), x))),
          IIntegrate(5180, Integrate(ArcCot(Tanh(Plus(a_DEFAULT, Times(b_DEFAULT, x_)))), x_Symbol),
              Condition(
                  Plus(Simp(Times(x, ArcCot(Tanh(Plus(a, Times(b, x))))), x), Dist(b,
                      Integrate(Times(x, Sech(Plus(Times(C2, a), Times(C2, b, x)))), x), x)),
                  FreeQ(List(a, b), x))));
}
