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
class IntRules208 {
  public static IAST RULES =
      List(
          IIntegrate(4161,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                      Power(
                          Plus(a_DEFAULT,
                              Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_), b_DEFAULT),
                              Times(
                                  Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p(
                                      "n2")),
                                  c_DEFAULT)),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(f, FreeFactors(Cot(Plus(d, Times(e, x))),
                          x))),
                      Negate(
                          Dist(
                              Times(Power(f, Plus(m, C1)), Power(e, CN1)),
                              Subst(
                                  Integrate(Times(Power(x, m),
                                      Power(ExpandToSum(
                                          Plus(a,
                                              Times(b,
                                                  Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                                                      Times(C1D2, n))),
                                              Times(c, Power(Plus(C1, Times(Sqr(f), Sqr(x))), n))),
                                          x), p),
                                      Power(Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                                          Plus(Times(C1D2, m), C1)), CN1)),
                                      x),
                                  x, Times(Cot(Plus(d, Times(e, x))), Power(f, CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, p), x), EqQ($s("n2"), Times(C2,
                      n)), IntegerQ(
                          Times(C1D2, m)),
                      IntegerQ(Times(C1D2, n))))),
          IIntegrate(4162,
              Integrate(
                  Times(
                      Power($($s("§sec"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power(
                                      $($s("§sec"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_))),
                                      $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(C4, p),
                          Power(c, p)), CN1),
                      Integrate(
                          Times(
                              Power(Sec(
                                  Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(b, Times(C2, c, Power(Sec(Plus(d, Times(e, x))), n))), Times(
                                      C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IntegerQ(p)))),
          IIntegrate(4163,
              Integrate(
                  Times(
                      Power($($s("§csc"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      n_DEFAULT),
                                  b_DEFAULT),
                              Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)), c_DEFAULT)),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(C4, p),
                          Power(c, p)), CN1),
                      Integrate(
                          Times(Power(Csc(Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(b, Times(C2, c,
                                      Power(Csc(Plus(d, Times(e, x))), n))),
                                  Times(C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(p)))),
          IIntegrate(4164,
              Integrate(
                  Times(
                      Power($($s("§sec"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power(
                                      $($s("§sec"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(
                                  a, Times(b, Power(Sec(
                                      Plus(d, Times(e, x))), n)),
                                  Times(c, Power(Sec(Plus(d, Times(e, x))), Times(C2, n)))),
                              p),
                          Power(
                              Power(Plus(b, Times(C2, c, Power(Sec(Plus(d, Times(e, x))), n))),
                                  Times(C2, p)),
                              CN1)),
                      Integrate(
                          Times(Power(Sec(Plus(d, Times(e, x))), m),
                              Power(Plus(b, Times(C2, c, Power(Sec(Plus(d, Times(e, x))), n))),
                                  Times(C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      Not(IntegerQ(p))))),
          IIntegrate(4165,
              Integrate(
                  Times(
                      Power($($s("§csc"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT), b_DEFAULT),
                              Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)), c_DEFAULT)),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(
                                  a, Times(b, Power(Csc(
                                      Plus(d, Times(e, x))), n)),
                                  Times(c, Power(Csc(Plus(d, Times(e, x))), Times(C2, n)))),
                              p),
                          Power(
                              Power(Plus(b, Times(C2, c, Power(Csc(Plus(d, Times(e, x))), n))),
                                  Times(C2, p)),
                              CN1)),
                      Integrate(
                          Times(Power(Csc(Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(b, Times(C2, c, Power(Csc(Plus(d, Times(e, x))), n))), Times(
                                      C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
          IIntegrate(4166,
              Integrate(
                  Times(
                      Power($($s("§sec"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power(
                                  $($s("§sec"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(
                              Power($($s("§sec"),
                                  Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(a, Times(b, Power($($s("§sec"), Plus(d, Times(e, x))), n)),
                                      Times(c,
                                          Power($($s("§sec"), Plus(d, Times(e, x))),
                                              Times(C2, n)))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                      IntegersQ(m, n, p)))),
          IIntegrate(4167,
              Integrate(
                  Times(
                      Power($($s("§csc"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(Plus(a_DEFAULT,
                          Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              n_DEFAULT), b_DEFAULT),
                          Times(
                              Power(
                                  $($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2",
                                      true)),
                              c_DEFAULT)),
                          p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(Times(Power($($s("§csc"), Plus(d, Times(e, x))), m),
                          Power(
                              Plus(a, Times(b, Power($($s("§csc"), Plus(d, Times(e, x))), n)),
                                  Times(c,
                                      Power($($s("§csc"), Plus(d, Times(e, x))), Times(C2, n)))),
                              p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2,
                      n)), IntegersQ(m, n,
                          p)))),
          IIntegrate(4168,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      $($s("§sec"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2", true)))),
                          p_DEFAULT),
                      Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(f,
                          FreeFactors(Cos(Plus(d, Times(e, x))), x))),
                      Negate(
                          Dist(Power(Times(e, Power(f, Subtract(Plus(m, Times(n, p)), C1))), CN1),
                              Subst(Integrate(Times(
                                  Power(Subtract(C1, Times(Sqr(f), Sqr(x))),
                                      Times(C1D2, Subtract(m, C1))),
                                  Power(Plus(c, Times(b, Power(Times(f, x), n)),
                                      Times(c, Power(Times(f, x), Times(C2, n)))), p),
                                  Power(Power(x, Plus(m, Times(C2, n, p))), CN1)), x), x, Times(
                                      Cos(Plus(d, Times(e, x))), Power(f, CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2,
                      n)), IntegerQ(
                          Times(C1D2, Subtract(m, C1))),
                      IntegerQ(n), IntegerQ(p)))),
          IIntegrate(4169,
              Integrate(
                  Times(
                      Power($($s("§cot"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(
                              Times(
                                  Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      n_DEFAULT),
                                  b_DEFAULT),
                              a_,
                              Times(c_DEFAULT,
                                  Power(
                                      $($s("§sec"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_))),
                                      $p("n2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(f,
                          FreeFactors(Sin(Plus(d, Times(e, x))), x))),
                      Dist(Power(Times(e, Power(f, Subtract(Plus(m, Times(n, p)), C1))), CN1),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(Subtract(C1, Times(Sqr(f), Sqr(x))),
                                          Times(C1D2, Subtract(m, C1))),
                                      Power(Plus(c, Times(b, Power(Times(f, x), n)),
                                          Times(c, Power(Times(f, x), Times(C2, n)))), p),
                                      Power(Power(x, Plus(m, Times(C2, n, p))), CN1)),
                                  x),
                              x, Times(Sin(Plus(d, Times(e, x))), Power(f, CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2, n)), IntegerQ(
                      Times(C1D2, Subtract(m, C1))), IntegerQ(n), IntegerQ(p)))),
          IIntegrate(4170,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(c_DEFAULT,
                                  Power(
                                      $($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2", true))),
                              Times(b_DEFAULT, Power($($s("§sec"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_))),
                          p_DEFAULT),
                      Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(List(Set(f, FreeFactors(Tan(Plus(d, Times(e, x))), x))),
                      Dist(Times(Power(f, Plus(m, C1)), Power(e, CN1)),
                          Subst(
                              Integrate(
                                  Times(Power(x, m),
                                      Power(ExpandToSum(
                                          Plus(a,
                                              Times(b,
                                                  Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                                                      Times(C1D2, n))),
                                              Times(c, Power(Plus(C1, Times(Sqr(f), Sqr(x))), n))),
                                          x), p),
                                      Power(Plus(C1, Times(Sqr(f), Sqr(x))), CN1)),
                                  x),
                              x, Times(Tan(Plus(d, Times(e, x))), Power(f, CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2,
                      n)), IntegerQ(
                          Times(C1D2, m)),
                      IntegerQ(Times(C1D2, n))))),
          IIntegrate(4171,
              Integrate(
                  Times(Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(Plus(
                          Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_),
                              b_DEFAULT),
                          a_,
                          Times(c_DEFAULT,
                              Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(f,
                          FreeFactors(Cot(Plus(d, Times(e, x))), x))),
                      Negate(
                          Dist(Times(Power(f, Plus(m, C1)), Power(e, CN1)),
                              Subst(
                                  Integrate(Times(Power(x, m),
                                      Power(ExpandToSum(
                                          Plus(a,
                                              Times(b,
                                                  Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                                                      Times(C1D2, n))),
                                              Times(c, Power(Plus(C1, Times(Sqr(f), Sqr(x))), n))),
                                          x), p),
                                      Power(Plus(C1, Times(Sqr(f), Sqr(x))), CN1)), x),
                                  x, Times(Cot(Plus(d, Times(e, x))), Power(f, CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                      IntegerQ(Times(C1D2, m)), IntegerQ(Times(C1D2, n))))),
          IIntegrate(4172,
              Integrate(
                  Times(
                      Plus(
                          A_, Times(B_DEFAULT,
                              $($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  $($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                              Times(c_DEFAULT,
                                  Sqr($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(C4, n),
                          Power(c, n)), CN1),
                      Integrate(
                          Times(
                              Plus(ASymbol, Times(BSymbol,
                                  Sec(Plus(d, Times(e, x))))),
                              Power(Plus(b, Times(C2, c,
                                  Sec(Plus(d, Times(e, x))))), Times(C2,
                                      n))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol), x),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(n)))),
          IIntegrate(4173,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              Times(
                                  Sqr($($s("§csc"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_)))),
                                  c_DEFAULT),
                              a_),
                          n_),
                      Plus(Times($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), B_DEFAULT),
                          A_)),
                  x_Symbol),
              Condition(
                  Dist(Power(Times(Power(C4, n), Power(c, n)), CN1),
                      Integrate(
                          Times(Plus(ASymbol, Times(BSymbol, Csc(Plus(d, Times(e, x))))),
                              Power(Plus(b, Times(C2, c, Csc(Plus(d, Times(e, x))))),
                                  Times(C2, n))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol), x),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(n)))),
          IIntegrate(4174,
              Integrate(
                  Times(
                      Plus(
                          A_,
                          Times(B_DEFAULT, $($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, $($s("§sec"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                              Times(
                                  c_DEFAULT, Sqr($($s("§sec"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_)))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(a, Times(b, Sec(Plus(d, Times(e, x)))),
                                  Times(c, Sqr(Sec(Plus(d, Times(e, x)))))),
                              n),
                          Power(
                              Power(Plus(b, Times(C2, c, Sec(Plus(d, Times(e, x))))),
                                  Times(C2, n)),
                              CN1)),
                      Integrate(
                          Times(
                              Plus(ASymbol, Times(BSymbol,
                                  Sec(Plus(d, Times(e, x))))),
                              Power(Plus(b, Times(C2, c,
                                  Sec(Plus(d, Times(e, x))))), Times(C2,
                                      n))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, ASymbol,
                      BSymbol), x), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      Not(IntegerQ(n))))),
          IIntegrate(4175,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              Times($($s("§csc"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              Times(
                                  Sqr($($s("§csc"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_)))),
                                  c_DEFAULT),
                              a_),
                          n_),
                      Plus(
                          Times($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              B_DEFAULT),
                          A_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Plus(a, Times(b, Csc(Plus(d, Times(e, x)))),
                              Times(c, Sqr(Csc(Plus(d, Times(e, x)))))), n),
                          Power(
                              Power(Plus(b, Times(C2, c, Csc(Plus(d, Times(e, x))))), Times(C2, n)),
                              CN1)),
                      Integrate(
                          Times(
                              Plus(ASymbol, Times(BSymbol,
                                  Csc(Plus(d, Times(e, x))))),
                              Power(Plus(b, Times(C2, c,
                                  Csc(Plus(d, Times(e, x))))), Times(C2,
                                      n))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, ASymbol,
                      BSymbol), x), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      Not(IntegerQ(n))))),
          IIntegrate(4176,
              Integrate(
                  Times(
                      Plus(
                          A_, Times(B_DEFAULT,
                              $($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sec"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                              Times(
                                  c_DEFAULT, Sqr($($s("§sec"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_)))))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Plus(
                          Dist(
                              Plus(BSymbol,
                                  Times(Subtract(Times(b, BSymbol), Times(C2, ASymbol, c)),
                                      Power(q, CN1))),
                              Integrate(
                                  Power(Plus(b, q, Times(C2, c, Sec(Plus(d, Times(e, x))))), CN1),
                                  x),
                              x),
                          Dist(
                              Subtract(BSymbol,
                                  Times(Subtract(Times(b, BSymbol), Times(C2, ASymbol, c)),
                                      Power(q, CN1))),
                              Integrate(
                                  Power(Plus(b, Negate(q), Times(C2, c, Sec(Plus(d, Times(e, x))))),
                                      CN1),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol), x),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(4177,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times($($s("§csc"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              Times(Sqr($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                  c_DEFAULT)),
                          CN1),
                      Plus(
                          Times($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              B_DEFAULT),
                          A_)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Plus(
                          Dist(
                              Plus(BSymbol,
                                  Times(
                                      Subtract(Times(b, BSymbol), Times(C2, ASymbol, c)), Power(q,
                                          CN1))),
                              Integrate(
                                  Power(Plus(b, q, Times(C2, c, Csc(Plus(d, Times(e, x))))), CN1),
                                  x),
                              x),
                          Dist(
                              Subtract(BSymbol,
                                  Times(
                                      Subtract(Times(b, BSymbol), Times(C2, ASymbol, c)), Power(q,
                                          CN1))),
                              Integrate(
                                  Power(Plus(b, Negate(q), Times(C2, c, Csc(Plus(d, Times(e, x))))),
                                      CN1),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, ASymbol,
                      BSymbol), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0)))),
          IIntegrate(4178,
              Integrate(
                  Times(
                      Plus(
                          A_, Times(B_DEFAULT,
                              $($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))))),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT, $($s("§sec"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                              Times(
                                  c_DEFAULT,
                                  Sqr($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))))),
                          n_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(Plus(ASymbol, Times(BSymbol, $($s("§sec"), Plus(d, Times(e, x))))),
                              Power(
                                  Plus(a, Times(b, $($s("§sec"), Plus(d, Times(e, x)))), Times(c,
                                      Sqr($($s("§sec"), Plus(d, Times(e, x)))))),
                                  n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, ASymbol,
                      BSymbol), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IntegerQ(n)))),
          IIntegrate(4179,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times($($s("§csc"),
                                  Plus(d_DEFAULT, Times(e_DEFAULT, x_))), b_DEFAULT),
                              Times(Sqr($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                  c_DEFAULT)),
                          n_),
                      Plus(Times($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), B_DEFAULT),
                          A_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(Plus(ASymbol, Times(BSymbol, $($s("§csc"), Plus(d, Times(e, x))))),
                              Power(
                                  Plus(a, Times(b, $($s("§csc"), Plus(d, Times(e, x)))),
                                      Times(c, Sqr($($s("§csc"), Plus(d, Times(e, x)))))),
                                  n)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, ASymbol, BSymbol), x), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0), IntegerQ(n)))),
          IIntegrate(4180, Integrate(Times(
              $($s("§csc"),
                  Plus(
                      e_DEFAULT, Times(Pi, k_DEFAULT),
                      Times(Complex(C0, $p("fz")), f_DEFAULT, x_))),
              Power(Plus(c_DEFAULT, Times(d_DEFAULT, x_)), m_DEFAULT)), x_Symbol),
              Condition(
                  Plus(
                      Simp(Times(CN2, Power(Plus(c, Times(d, x)), m),
                          ArcTanh(Times(Exp(Plus(Times(CN1, CI, e), Times(f, $s("fz"), x))),
                              Power(Exp(Times(CI, k, Pi)), CN1))),
                          Power(Times(f, $s("fz"), CI), CN1)), x),
                      Negate(
                          Dist(
                              Times(d, m, Power(Times(f, $s("fz"), CI), CN1)), Integrate(Times(
                                  Power(Plus(c, Times(d, x)), Subtract(m, C1)), Log(Subtract(C1,
                                      Times(Exp(Plus(Times(CN1, CI, e), Times(f, $s("fz"), x))),
                                          Power(Exp(Times(CI, k, Pi)), CN1))))),
                                  x),
                              x)),
                      Dist(Times(d, m, Power(Times(f, $s("fz"), CI), CN1)),
                          Integrate(Times(Power(Plus(c, Times(d, x)), Subtract(m, C1)),
                              Log(Plus(C1,
                                  Times(Exp(Plus(Times(CN1, CI, e), Times(f, $s("fz"), x))),
                                      Power(Exp(Times(CI, k, Pi)), CN1))))),
                              x),
                          x)),
                  And(FreeQ(List(c, d, e, f, $s("fz")), x), IntegerQ(Times(C2, k)), IGtQ(m, C0)))));
}
