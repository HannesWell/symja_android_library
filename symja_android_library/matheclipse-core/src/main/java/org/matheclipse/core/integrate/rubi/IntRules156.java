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
class IntRules156 {
  public static IAST RULES =
      List(
          IIntegrate(3121,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      CN1),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(f,
                          FreeFactors(Cot(Times(C1D2, Plus(d, Times(e, x)))), x))),
                      Negate(
                          Dist(
                              Times(f, Power(e,
                                  CN1)),
                              Subst(
                                  Integrate(Power(Plus(a, Times(c, f,
                                      x)), CN1), x),
                                  x, Times(Cot(Times(C1D2, Plus(d, Times(e, x)))), Power(f, CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(a, b), C0)))),
          IIntegrate(3122,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT,
                              x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      CN1),
                  x_Symbol),
              Condition(
                  Module(
                      List(
                          Set(f,
                              FreeFactors(
                                  Tan(Plus(Times(C1D2, Plus(d, Times(e, x))), Times(C1D4, Pi))),
                                  x))),
                      Dist(
                          Times(f, Power(e,
                              CN1)),
                          Subst(
                              Integrate(Power(Plus(a, Times(b, f, x)),
                                  CN1), x),
                              x,
                              Times(
                                  Tan(Plus(Times(C1D2, Plus(d,
                                      Times(e, x))), Times(C1D4,
                                          Pi))),
                                  Power(f, CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(a, c), C0)))),
          IIntegrate(3123,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      CN1),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(f,
                          FreeFactors(Cot(Plus(Times(C1D2, Plus(d, Times(e, x))), Times(C1D4, Pi))),
                              x))),
                      Negate(
                          Dist(
                              Times(f, Power(e,
                                  CN1)),
                              Subst(Integrate(Power(Plus(a, Times(b, f, x)), CN1), x), x,
                                  Times(
                                      Cot(Plus(Times(C1D2, Plus(d, Times(e, x))), Times(C1D4, Pi))),
                                      Power(f, CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Subtract(a,
                      c), C0), NeQ(Subtract(a, b),
                          C0)))),
          IIntegrate(3124,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT,
                              Times(e_DEFAULT, x_))))),
                      CN1),
                  x_Symbol),
              Condition(
                  Module(List(Set(f, FreeFactors(Tan(Times(C1D2, Plus(d, Times(e, x)))), x))),
                      Dist(Times(C2, f, Power(e, CN1)),
                          Subst(
                              Integrate(Power(
                                  Plus(a, b, Times(C2, c, f, x),
                                      Times(Subtract(a, b), Sqr(f), Sqr(x))),
                                  CN1), x),
                              x, Times(Tan(Times(C1D2, Plus(d, Times(e, x)))), Power(f, CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d,
                      e), x), NeQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)),
                          C0)))),
          IIntegrate(3125,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT,
                              Times(e_DEFAULT, x_))))),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(b, Power(Times(c, e),
                          CN1)),
                      Subst(
                          Integrate(Power(Times(x, Sqrt(Plus(a, x))),
                              CN1), x),
                          x,
                          Plus(
                              Times(b, Cos(Plus(d, Times(e, x)))), Times(c,
                                  Sin(Plus(d, Times(e, x)))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ(Plus(Sqr(b), Sqr(c)), C0)))),
          IIntegrate(3126,
              Integrate(
                  Power(Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                      a_, Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Integrate(
                      Power(Plus(a,
                          Times(Sqrt(Plus(Sqr(b), Sqr(c))),
                              Cos(Subtract(Plus(d, Times(e, x)), ArcTan(b, c))))),
                          CN1D2),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), NeQ(Plus(Sqr(b), Sqr(c)), C0),
                      GtQ(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), C0)))),
          IIntegrate(3127,
              Integrate(
                  Power(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT,
                              Times(e_DEFAULT, x_))))),
                      CN1D2),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Sqrt(
                              Times(
                                  Plus(a, Times(b, Cos(Plus(d, Times(e, x)))), Times(c,
                                      Sin(Plus(d, Times(e, x))))),
                                  Power(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), CN1))),
                          Power(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                              Times(c, Sin(Plus(d, Times(e, x))))), CN1D2)),
                      Integrate(
                          Power(
                              Plus(Times(a, Power(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), CN1)),
                                  Times(Sqrt(Plus(Sqr(b), Sqr(c))),
                                      Cos(Subtract(Plus(d, Times(e, x)), ArcTan(b, c))),
                                      Power(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), CN1))),
                              CN1D2),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Subtract(Subtract(Sqr(a), Sqr(
                          b)), Sqr(
                              c)),
                          C0),
                      NeQ(Plus(Sqr(b),
                          Sqr(c)), C0),
                      Not(GtQ(Plus(a, Sqrt(Plus(Sqr(b), Sqr(c)))), C0))))),
          IIntegrate(3128,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(d_DEFAULT,
                              Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT,
                              $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      QQ(-3L, 2L)),
                  x_Symbol),
              Condition(Plus(
                  Simp(Times(C2,
                      Subtract(Times(c, Cos(Plus(d, Times(e, x)))),
                          Times(b, Sin(Plus(d, Times(e, x))))),
                      Power(Times(e, Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)),
                          Sqrt(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                              Times(c, Sin(Plus(d, Times(e, x))))))),
                          CN1)),
                      x),
                  Dist(Power(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)), CN1),
                      Integrate(Sqrt(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                          Times(c, Sin(Plus(d, Times(e, x)))))), x),
                      x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)), C0)))),
          IIntegrate(3129,
              Integrate(
                  Power(
                      Plus(
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT,
                              x_))))),
                      n_),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Plus(
                                  Times(CN1, c, Cos(Plus(d, Times(e, x)))), Times(b,
                                      Sin(Plus(d, Times(e, x))))),
                              Power(
                                  Plus(
                                      a, Times(b, Cos(Plus(d, Times(e, x)))), Times(c,
                                          Sin(Plus(d, Times(e, x))))),
                                  Plus(n, C1)),
                              Power(
                                  Times(e, Plus(n, C1), Subtract(Subtract(Sqr(a), Sqr(
                                      b)), Sqr(
                                          c))),
                                  CN1)),
                          x),
                      Dist(
                          Power(Times(Plus(n, C1), Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c))),
                              CN1),
                          Integrate(Times(
                              Subtract(
                                  Subtract(Times(a, Plus(n, C1)),
                                      Times(b, Plus(n, C2), Cos(Plus(d, Times(e, x))))),
                                  Times(c, Plus(n, C2), Sin(Plus(d, Times(e, x))))),
                              Power(
                                  Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                      Times(c, Sin(Plus(d, Times(e, x))))),
                                  Plus(n, C1))),
                              x),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x),
                      NeQ(Subtract(Subtract(Sqr(a), Sqr(
                          b)), Sqr(
                              c)),
                          C0),
                      LtQ(n, CN1), NeQ(n, QQ(-3L, 2L))))),
          IIntegrate(3130,
              Integrate(
                  Times(Power(
                      Plus(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          a_, Times(c_DEFAULT,
                              $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      CN1),
                      Plus(A_DEFAULT,
                          Times($($s("§cos"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_))), B_DEFAULT),
                          Times(C_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Subtract(Subtract(Times(C2, a, ASymbol), Times(b, BSymbol)),
                                  Times(c, CSymbol)),
                              x, Power(Times(C2, Sqr(a)), CN1)),
                          x),
                      Negate(
                          Simp(
                              Times(Plus(Times(b, BSymbol), Times(c, CSymbol)),
                                  Subtract(
                                      Times(b, Cos(Plus(d, Times(e, x)))), Times(c,
                                          Sin(Plus(d, Times(e, x))))),
                                  Power(Times(C2, a, b, c, e), CN1)),
                              x)),
                      Simp(
                          Times(Plus(Times(Sqr(a), Subtract(Times(b, BSymbol), Times(c, CSymbol))),
                              Times(CN1, C2, a, ASymbol, Sqr(b)), Times(Sqr(b),
                                  Plus(Times(b, BSymbol), Times(c, CSymbol)))),
                              Log(RemoveContent(
                                  Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                      Times(c, Sin(Plus(d, Times(e, x))))),
                                  x)),
                              Power(Times(C2, Sqr(a), b, c, e), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol,
                      CSymbol), x), EqQ(Plus(Sqr(b), Sqr(c)),
                          C0)))),
          IIntegrate(3131,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              a_,
                              Times(c_DEFAULT, $($s("§sin"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          CN1),
                      Plus(
                          A_DEFAULT, Times(C_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(Plus(Simp(Times(Subtract(Times(C2, a, ASymbol), Times(c, CSymbol)), x,
                  Power(Times(C2, Sqr(a)), CN1)), x),
                  Negate(
                      Simp(Times(CSymbol, Cos(Plus(d, Times(e,
                          x))), Power(Times(C2, a, e),
                              CN1)),
                          x)),
                  Simp(Times(c, CSymbol, Sin(Plus(d, Times(e, x))),
                      Power(Times(C2, a, b, e), CN1)), x),
                  Simp(
                      Times(
                          Plus(
                              Times(CN1, Sqr(a), CSymbol), Times(C2, a, c, ASymbol), Times(Sqr(b),
                                  CSymbol)),
                          Log(RemoveContent(
                              Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x))))),
                              x)),
                          Power(Times(C2, Sqr(a), b, e), CN1)),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, CSymbol), x),
                      EqQ(Plus(Sqr(b), Sqr(c)), C0)))),
          IIntegrate(3132,
              Integrate(
                  Times(
                      Plus(
                          A_DEFAULT, Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              B_DEFAULT)),
                      Power(
                          Plus(
                              Times($(
                                  $s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_,
                              Times(c_DEFAULT,
                                  $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Subtract(Times(C2, a, ASymbol), Times(b, BSymbol)), x,
                              Power(Times(C2, Sqr(a)), CN1)),
                          x),
                      Simp(
                          Times(BSymbol, Sin(Plus(d,
                              Times(e, x))), Power(Times(C2, a, e),
                                  CN1)),
                          x),
                      Negate(Simp(Times(b, BSymbol, Cos(Plus(d, Times(e, x))),
                          Power(Times(C2, a, c, e), CN1)), x)),
                      Simp(
                          Times(
                              Plus(Times(Sqr(a), BSymbol), Times(CN1, C2, a, b, ASymbol),
                                  Times(Sqr(b), BSymbol)),
                              Log(RemoveContent(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x))))), x)),
                              Power(Times(C2, Sqr(a), c, e), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol,
                      BSymbol), x), EqQ(Plus(Sqr(b), Sqr(c)),
                          C0)))),
          IIntegrate(3133,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times($($s("§cos"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              Times(c_DEFAULT,
                                  $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          CN1),
                      Plus(A_DEFAULT,
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), B_DEFAULT),
                          Times(C_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(Plus(Times(b, BSymbol), Times(c, CSymbol)), x,
                              Power(Plus(Sqr(b), Sqr(c)), CN1)),
                          x),
                      Simp(
                          Times(Subtract(Times(c, BSymbol), Times(b, CSymbol)),
                              Log(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x)))))),
                              Power(Times(e, Plus(Sqr(b), Sqr(c))), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol, CSymbol), x),
                      NeQ(Plus(Sqr(b),
                          Sqr(c)), C0),
                      EqQ(Subtract(
                          Times(ASymbol, Plus(Sqr(b),
                              Sqr(c))),
                          Times(a, Plus(Times(b, BSymbol), Times(c, CSymbol)))), C0)))),
          IIntegrate(3134, Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT,
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      CN1),
                  Plus(A_DEFAULT,
                      Times(C_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
              x_Symbol),
              Condition(
                  Subtract(
                      Simp(Times(c, CSymbol, x, Power(Plus(Sqr(b), Sqr(c)), CN1)), x),
                      Simp(Times(b, CSymbol,
                          Log(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                              Times(c, Sin(Plus(d, Times(e, x)))))),
                          Power(Times(e, Plus(Sqr(b), Sqr(c))), CN1)), x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, CSymbol), x),
                      NeQ(Plus(Sqr(b), Sqr(c)), C0), EqQ(
                          Subtract(Times(ASymbol, Plus(Sqr(b), Sqr(c))),
                              Times(a, c, CSymbol)),
                          C0)))),
          IIntegrate(3135,
              Integrate(
                  Times(
                      Plus(
                          A_DEFAULT,
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), B_DEFAULT)),
                      Power(Plus(a_DEFAULT,
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(Simp(Times(b, BSymbol, x, Power(Plus(Sqr(b), Sqr(c)), CN1)), x),
                      Simp(
                          Times(c, BSymbol,
                              Log(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x)))))),
                              Power(Times(e, Plus(Sqr(b), Sqr(c))), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol), x),
                      NeQ(Plus(Sqr(b),
                          Sqr(c)), C0),
                      EqQ(Subtract(Times(ASymbol, Plus(Sqr(b), Sqr(c))), Times(a, b, BSymbol)),
                          C0)))),
          IIntegrate(3136,
              Integrate(
                  Times(
                      Power(Plus(a_DEFAULT,
                          Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                          Times(c_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          CN1),
                      Plus(A_DEFAULT,
                          Times($($s("§cos"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_))), B_DEFAULT),
                          Times(C_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(
                          Times(
                              Plus(Times(b, BSymbol), Times(c,
                                  CSymbol)),
                              x, Power(Plus(Sqr(b), Sqr(c)), CN1)),
                          x),
                      Dist(
                          Times(
                              Subtract(Times(ASymbol, Plus(Sqr(b), Sqr(c))),
                                  Times(a, Plus(Times(b, BSymbol), Times(c, CSymbol)))),
                              Power(Plus(Sqr(b), Sqr(c)), CN1)),
                          Integrate(
                              Power(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x))))), CN1),
                              x),
                          x),
                      Simp(
                          Times(Subtract(Times(c, BSymbol), Times(b, CSymbol)),
                              Log(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x)))))),
                              Power(Times(e, Plus(Sqr(b), Sqr(c))), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol, CSymbol), x),
                      NeQ(Plus(Sqr(b), Sqr(c)), C0),
                      NeQ(Subtract(Times(ASymbol, Plus(Sqr(b), Sqr(c))),
                          Times(a, Plus(Times(b, BSymbol), Times(c, CSymbol)))), C0)))),
          IIntegrate(3137,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times($($s("§cos"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              Times(c_DEFAULT, $($s("§sin"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          CN1),
                      Plus(
                          A_DEFAULT, Times(C_DEFAULT, $($s("§sin"),
                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(c, CSymbol, Plus(d, Times(e, x)),
                          Power(Times(e, Plus(Sqr(b), Sqr(c))), CN1)), x),
                      Dist(
                          Times(
                              Subtract(Times(ASymbol, Plus(Sqr(b), Sqr(c))), Times(a, c, CSymbol)),
                              Power(Plus(Sqr(b), Sqr(c)), CN1)),
                          Integrate(
                              Power(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x))))), CN1),
                              x),
                          x),
                      Negate(
                          Simp(Times(b, CSymbol,
                              Log(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x)))))),
                              Power(Times(e, Plus(Sqr(b), Sqr(c))), CN1)), x))),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, CSymbol), x),
                      NeQ(Plus(Sqr(b), Sqr(c)), C0),
                      NeQ(Subtract(Times(ASymbol, Plus(Sqr(b), Sqr(c))), Times(a, c, CSymbol)),
                          C0)))),
          IIntegrate(3138,
              Integrate(
                  Times(
                      Plus(
                          A_DEFAULT, Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              B_DEFAULT)),
                      Power(
                          Plus(a_DEFAULT,
                              Times($($s("§cos"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              Times(c_DEFAULT,
                                  $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(b, BSymbol, Plus(d, Times(e, x)),
                          Power(Times(e, Plus(Sqr(b), Sqr(c))), CN1)), x),
                      Dist(
                          Times(
                              Subtract(Times(ASymbol, Plus(Sqr(b), Sqr(c))), Times(a, b, BSymbol)),
                              Power(Plus(Sqr(b), Sqr(c)), CN1)),
                          Integrate(Power(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                              Times(c, Sin(Plus(d, Times(e, x))))), CN1), x),
                          x),
                      Simp(
                          Times(c, BSymbol,
                              Log(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x)))))),
                              Power(Times(e, Plus(Sqr(b), Sqr(c))), CN1)),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol), x),
                      NeQ(Plus(Sqr(b),
                          Sqr(c)), C0),
                      NeQ(Subtract(Times(ASymbol, Plus(Sqr(b),
                          Sqr(c))), Times(a, b,
                              BSymbol)),
                          C0)))),
          IIntegrate(3139,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($(
                                  $s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  b_DEFAULT),
                              a_,
                              Times(c_DEFAULT,
                                  $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          n_DEFAULT),
                      Plus(A_DEFAULT, Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                          B_DEFAULT),
                          Times(C_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Simp(
                      Times(
                          Plus(Times(BSymbol, c), Times(CN1, b, CSymbol),
                              Times(CN1, a, CSymbol, Cos(Plus(d, Times(e, x)))),
                              Times(a, BSymbol, Sin(Plus(d, Times(e, x))))),
                          Power(
                              Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                                  Times(c, Sin(Plus(d, Times(e, x))))),
                              n),
                          Power(Times(a, e, Plus(n, C1)), CN1)),
                      x),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol, CSymbol, n), x), NeQ(n, CN1),
                      EqQ(Subtract(Subtract(Sqr(a), Sqr(b)),
                          Sqr(c)), C0),
                      EqQ(Plus(
                          Times(Plus(Times(b, BSymbol), Times(c, CSymbol)), n), Times(a, ASymbol,
                              Plus(n, C1))),
                          C0)))),
          IIntegrate(3140,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§cos"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              a_,
                              Times(c_DEFAULT,
                                  $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                          n_DEFAULT),
                      Plus(
                          A_DEFAULT,
                          Times(C_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                  x_Symbol),
              Condition(
                  Negate(Simp(
                      Times(Plus(Times(b, CSymbol), Times(a, CSymbol, Cos(Plus(d, Times(e, x))))),
                          Power(Plus(a, Times(b, Cos(Plus(d, Times(e, x)))),
                              Times(c, Sin(Plus(d, Times(e, x))))), n),
                          Power(Times(a, e, Plus(n, C1)), CN1)),
                      x)),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, CSymbol, n), x), NeQ(n, CN1),
                      EqQ(Subtract(Subtract(Sqr(a), Sqr(b)), Sqr(c)), C0),
                      EqQ(Plus(Times(c, CSymbol, n), Times(a, ASymbol, Plus(n, C1))), C0)))));
}
