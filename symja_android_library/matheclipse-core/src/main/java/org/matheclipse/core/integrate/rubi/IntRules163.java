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
class IntRules163 {
  public static IAST RULES = List(
      IIntegrate(3261,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT,
                          Times(
                              Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT),
                              b_DEFAULT),
                          Times(
                              Power(
                                  $($s("§cos"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_))),
                                  $p("n2", true)),
                              c_DEFAULT)),
                      p_DEFAULT),
                  Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_)),
              x_Symbol),
          Condition(
              Dist(Power(Times(Power(C4, p), Power(c, p)), CN1),
                  Integrate(
                      Times(Power(Sin(Plus(d, Times(e, x))), m),
                          Power(Plus(b, Times(C2, c, Power(Cos(Plus(d, Times(e, x))), n))),
                              Times(C2, p))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, n), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2, Subtract(m, C1)))), EqQ(
                      Subtract(Sqr(b), Times(C4, a, c)), C0),
                  IntegerQ(p)))),
      IIntegrate(3262,
          Integrate(
              Times(
                  Power($($s("§cos"),
                      Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                      p_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(
                          Plus(
                              a, Times(b, Power(Sin(Plus(d, Times(e,
                                  x))), n)),
                              Times(c, Power(Sin(Plus(d, Times(e, x))), Times(C2, n)))),
                          p),
                      Power(
                          Power(
                              Plus(b, Times(C2, c, Power(Sin(Plus(d, Times(e, x))), n))), Times(C2,
                                  p)),
                          CN1)),
                  Integrate(
                      Times(
                          Power(Cos(
                              Plus(d, Times(e, x))), m),
                          Power(
                              Plus(b, Times(C2, c, Power(Sin(Plus(d, Times(e, x))), n))), Times(C2,
                                  p))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2,
                      Subtract(m, C1)))),
                  EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
      IIntegrate(3263,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT,
                          Times(
                              Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT),
                              b_DEFAULT),
                          Times(
                              Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)),
                              c_DEFAULT)),
                      p_),
                  Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(
                          Plus(
                              a, Times(b, Power(Cos(Plus(d, Times(e, x))),
                                  n)),
                              Times(c, Power(Cos(Plus(d, Times(e, x))), Times(C2, n)))),
                          p),
                      Power(Power(Plus(b, Times(C2, c, Power(Cos(Plus(d, Times(e, x))), n))),
                          Times(C2, p)), CN1)),
                  Integrate(
                      Times(Power(Sin(Plus(d, Times(e, x))), m),
                          Power(Plus(b, Times(C2, c, Power(Cos(Plus(d, Times(e, x))), n))),
                              Times(C2, p))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2,
                      Subtract(m, C1)))),
                  EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
      IIntegrate(3264,
          Integrate(Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
              Power(Plus(a_DEFAULT,
                  Times(b_DEFAULT, Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_)),
                  Times(c_DEFAULT, Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                      $p("n2")))),
                  p_DEFAULT)),
              x_Symbol),
          Condition(
              Module(
                  List(Set(f,
                      FreeFactors(Cot(Plus(d, Times(e, x))), x))),
                  Negate(Dist(Times(Power(f, Plus(m, C1)), Power(e, CN1)), Subst(Integrate(Times(
                      Power(x, m),
                      Power(ExpandToSum(Plus(c, Times(b, Power(Plus(C1, Sqr(x)), Times(C1D2, n))),
                          Times(a, Power(Plus(C1, Sqr(x)), n))), x), p),
                      Power(
                          Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                              Plus(Times(C1D2, m), Times(n, p), C1)),
                          CN1)),
                      x), x, Times(Cot(Plus(d, Times(e, x))), Power(f, CN1))), x))),
              And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                  IntegerQ(Times(C1D2, m)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                      C0),
                  IntegerQ(Times(C1D2, n)), IntegerQ(p)))),
      IIntegrate(3265,
          Integrate(
              Times(Power(Plus(a_DEFAULT,
                  Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_), b_DEFAULT),
                  Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2")),
                      c_DEFAULT)),
                  p_DEFAULT),
                  Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
              x_Symbol),
          Condition(
              Module(
                  List(Set(f,
                      FreeFactors(Tan(Plus(d, Times(e, x))), x))),
                  Dist(Times(Power(f, Plus(m, C1)), Power(e, CN1)), Subst(Integrate(Times(
                      Power(x, m),
                      Power(ExpandToSum(Plus(c, Times(b, Power(Plus(C1, Sqr(x)), Times(C1D2, n))),
                          Times(a, Power(Plus(C1, Sqr(x)), n))), x), p),
                      Power(Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                          Plus(Times(C1D2, m), Times(n, p), C1)), CN1)),
                      x), x, Times(Tan(Plus(d, Times(e, x))), Power(f, CN1))), x)),
              And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                  IntegerQ(Times(C1D2, m)), NeQ(Subtract(Sqr(b), Times(C4, a,
                      c)), C0),
                  IntegerQ(Times(C1D2, n)), IntegerQ(p)))),
      IIntegrate(3266,
          Integrate(
              Times(
                  Power($($s("§cos"),
                      Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power(
                                  $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2",
                                      true)))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandTrig(
                      Times(
                          Power(Subtract(C1, Sqr($($s("§sin"), Plus(d, Times(e, x))))), Times(C1D2,
                              m)),
                          Power(
                              Plus(
                                  a, Times(b, Power($($s("§sin"), Plus(d, Times(e, x))),
                                      n)),
                                  Times(c, Power($($s("§sin"), Plus(d, Times(e, x))),
                                      Times(C2, n)))),
                              p)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                  IntegerQ(Times(C1D2, m)), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0),
                  IntegersQ(n, p)))),
      IIntegrate(3267,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT,
                          Times(
                              Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT),
                              b_DEFAULT),
                          Times(
                              Power(
                                  $($s("§cos"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_))),
                                  $p("n2", true)),
                              c_DEFAULT)),
                      p_DEFAULT),
                  Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandTrig(
                      Times(
                          Power(Subtract(C1, Sqr($($s("§cos"), Plus(d, Times(e, x))))),
                              Times(C1D2, m)),
                          Power(
                              Plus(a, Times(b, Power($($s("§cos"), Plus(d, Times(e, x))), n)),
                                  Times(c,
                                      Power($($s("§cos"), Plus(d, Times(e, x))), Times(C2, n)))),
                              p)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                  IntegerQ(Times(C1D2, m)), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0),
                  IntegersQ(n, p)))),
      IIntegrate(3268,
          Integrate(
              Times(
                  Power(
                      Plus(a_,
                          Times(c_DEFAULT,
                              Power(
                                  Times(f_DEFAULT,
                                      $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                  $p("n2", true))),
                          Times(b_DEFAULT,
                              Power(
                                  Times(f_DEFAULT,
                                      $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                  n_))),
                      p_DEFAULT),
                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
              x_Symbol),
          Condition(
              Module(
                  List(Set(g,
                      FreeFactors(Sin(Plus(d, Times(e, x))), x))),
                  Dist(Times(Power(g, Plus(m, C1)), Power(e, CN1)),
                      Subst(
                          Integrate(
                              Times(Power(x, m),
                                  Power(Plus(a, Times(b, Power(Times(f, g, x), n)),
                                      Times(c, Power(Times(f, g, x), Times(C2, n)))), p),
                                  Power(Power(Subtract(C1, Times(Sqr(g), Sqr(x))),
                                      Times(C1D2, Plus(m, C1))), CN1)),
                              x),
                          x, Times(Sin(Plus(d, Times(e, x))), Power(g, CN1))),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, n), x), IntegerQ(Times(C1D2,
                  Subtract(m, C1))), IntegerQ(
                      Times(C2, p))))),
      IIntegrate(3269,
          Integrate(
              Times(Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                  Power(
                      Plus(
                          Times(c_DEFAULT,
                              Power(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  f_DEFAULT), $p("n2", true))),
                          Times(b_DEFAULT,
                              Power(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  f_DEFAULT), n_)),
                          a_),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Module(
                  List(Set(g,
                      FreeFactors(Cos(Plus(d, Times(e, x))), x))),
                  Negate(
                      Dist(Times(Power(g, Plus(m, C1)), Power(e, CN1)),
                          Subst(
                              Integrate(Times(Power(x, m),
                                  Power(Plus(a, Times(b, Power(Times(f, g, x), n)),
                                      Times(c, Power(Times(f, g, x), Times(C2, n)))), p),
                                  Power(Power(Subtract(C1, Times(Sqr(g), Sqr(x))),
                                      Times(C1D2, Plus(m, C1))), CN1)),
                                  x),
                              x, Times(Cos(Plus(d, Times(e, x))), Power(g, CN1))),
                          x))),
              And(FreeQ(List(a, b, c, d, e, f, n), x), IntegerQ(Times(C1D2,
                  Subtract(m, C1))), IntegerQ(
                      Times(C2, p))))),
      IIntegrate(3270,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power(
                                  $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2",
                                      true)))),
                      p_DEFAULT),
                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_)),
              x_Symbol),
          Condition(
              Dist(
                  Power(Times(Power(C4, p),
                      Power(c, p)), CN1),
                  Integrate(
                      Times(
                          Power(Tan(
                              Plus(d, Times(e, x))), m),
                          Power(
                              Plus(b, Times(C2, c,
                                  Power(Sin(Plus(d, Times(e, x))), n))),
                              Times(C2, p))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, n), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2,
                      Subtract(m, C1)))),
                  EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(p)))),
      IIntegrate(3271,
          Integrate(
              Times(
                  Power($($s("§cot"),
                      Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                  Power(Plus(a_DEFAULT,
                      Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_DEFAULT),
                          b_DEFAULT),
                      Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                          $p("n2", true)), c_DEFAULT)),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Dist(
                  Power(Times(Power(C4, p),
                      Power(c, p)), CN1),
                  Integrate(
                      Times(
                          Power(Cot(
                              Plus(d, Times(e, x))), m),
                          Power(
                              Plus(b, Times(C2, c, Power(Cos(Plus(d, Times(e, x))), n))), Times(C2,
                                  p))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, n), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2,
                      Subtract(m, C1)))),
                  EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(p)))),
      IIntegrate(3272,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power(
                                  $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2",
                                      true)))),
                      p_),
                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(
                          Plus(
                              a, Times(b, Power(Sin(Plus(d, Times(e, x))),
                                  n)),
                              Times(c, Power(Sin(Plus(d, Times(e, x))), Times(C2, n)))),
                          p),
                      Power(Power(Plus(b, Times(C2, c, Power(Sin(Plus(d, Times(e, x))), n))),
                          Times(C2, p)), CN1)),
                  Integrate(
                      Times(Power(Tan(Plus(d, Times(e, x))), m),
                          Power(
                              Plus(b, Times(C2, c, Power(Sin(Plus(d, Times(e, x))), n))), Times(C2,
                                  p))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2,
                      Subtract(m, C1)))),
                  EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
      IIntegrate(3273,
          Integrate(
              Times(
                  Power($($s("§cot"),
                      Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                  Power(
                      Plus(a_DEFAULT,
                          Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              n_DEFAULT), b_DEFAULT),
                          Times(
                              Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)),
                              c_DEFAULT)),
                      p_)),
              x_Symbol),
          Condition(
              Dist(
                  Times(
                      Power(
                          Plus(
                              a, Times(b, Power(Cos(Plus(d, Times(e,
                                  x))), n)),
                              Times(c, Power(Cos(Plus(d, Times(e, x))), Times(C2, n)))),
                          p),
                      Power(Power(Plus(b, Times(C2, c, Power(Cos(Plus(d, Times(e, x))), n))),
                          Times(C2, p)), CN1)),
                  Integrate(Times(Power(Cot(Plus(d, Times(e, x))), m),
                      Power(Plus(b, Times(C2, c, Power(Cos(Plus(d, Times(e, x))), n))),
                          Times(C2, p))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2,
                      Subtract(m, C1)))),
                  EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
      IIntegrate(3274,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_)),
                          Times(c_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2")))),
                      p_DEFAULT),
                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
              x_Symbol),
          Condition(
              Module(
                  List(Set(f,
                      FreeFactors(Tan(Plus(d, Times(e, x))), x))),
                  Dist(Times(Power(f, Plus(m, C1)), Power(e, CN1)), Subst(Integrate(
                      Times(Power(x, m),
                          Power(ExpandToSum(Plus(Times(c, Power(x, Times(C2, n))),
                              Times(b, Power(x, n), Power(Plus(C1, Sqr(x)), Times(C1D2, n))),
                              Times(a, Power(Plus(C1, Sqr(x)), n))), x), p),
                          Power(Power(Plus(C1, Times(Sqr(f), Sqr(x))), Plus(Times(n, p), C1)),
                              CN1)),
                      x), x, Times(Tan(Plus(d, Times(e, x))), Power(f, CN1))), x)),
              And(FreeQ(List(a, b, c, d, e, m), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2, Subtract(m, C1)))),
                  NeQ(Subtract(Sqr(b), Times(C4, a,
                      c)), C0),
                  IntegerQ(Times(C1D2, n)), IntegerQ(p)))),
      IIntegrate(3275,
          Integrate(
              Times(Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                  Power(Plus(a_DEFAULT,
                      Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_),
                          b_DEFAULT),
                      Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2")),
                          c_DEFAULT)),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Module(
                  List(Set(f,
                      FreeFactors(Cot(Plus(d, Times(e, x))), x))),
                  Negate(
                      Dist(Times(Power(f, Plus(m, C1)), Power(e, CN1)),
                          Subst(Integrate(Times(Power(x, m),
                              Power(ExpandToSum(Plus(Times(c, Power(x, Times(C2, n))),
                                  Times(b, Power(x, n), Power(Plus(C1, Sqr(x)), Times(C1D2, n))),
                                  Times(a, Power(Plus(C1, Sqr(x)), n))), x), p),
                              Power(Power(Plus(C1, Times(Sqr(f), Sqr(x))), Plus(Times(n, p), C1)),
                                  CN1)),
                              x), x, Times(Cot(Plus(d, Times(e, x))), Power(f, CN1))),
                          x))),
              And(FreeQ(List(a, b, c, d, e, m), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2, Subtract(m,
                      C1)))),
                  NeQ(Subtract(Sqr(b), Times(C4, a,
                      c)), C0),
                  IntegerQ(Times(C1D2, n)), IntegerQ(p)))),
      IIntegrate(3276,
          Integrate(
              Times(
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power(
                                  $($s("§sin"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                      p_DEFAULT),
                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandTrig(
                      Times(Power($($s("§sin"), Plus(d, Times(e, x))), m),
                          Power(
                              Plus(a, Times(b, Power($($s("§sin"), Plus(d, Times(e, x))), n)),
                                  Times(c, Power($($s("§sin"), Plus(d, Times(e, x))),
                                      Times(C2, n)))),
                              p),
                          Power(
                              Power(
                                  Subtract(C1, Sqr(
                                      $($s("§sin"), Plus(d, Times(e, x))))),
                                  Times(C1D2, m)),
                              CN1)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                  IntegerQ(Times(C1D2, m)), NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0),
                  IntegersQ(n, p)))),
      IIntegrate(3277,
          Integrate(
              Times(Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                  Power(
                      Plus(a_DEFAULT,
                          Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              n_DEFAULT), b_DEFAULT),
                          Times(
                              Power(
                                  $($s("§cos"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_))),
                                  $p("n2", true)),
                              c_DEFAULT)),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Integrate(
                  ExpandTrig(
                      Times(
                          Power($($s("§cos"), Plus(d, Times(e, x))), m),
                          Power(
                              Plus(a, Times(b, Power($($s("§cos"), Plus(d, Times(e, x))), n)),
                                  Times(c,
                                      Power($($s("§cos"), Plus(d, Times(e, x))), Times(C2, n)))),
                              p),
                          Power(
                              Power(Subtract(C1, Sqr($($s("§cos"), Plus(d, Times(e, x))))),
                                  Times(C1D2, m)),
                              CN1)),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                  IntegerQ(Times(C1D2, m)), NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegersQ(n,
                      p)))),
      IIntegrate(3278,
          Integrate(
              Times(
                  Power($($s("§cot"),
                      Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                  Power(
                      Plus(a_,
                          Times(c_DEFAULT,
                              Power(
                                  Times(
                                      f_DEFAULT, $($s("§sin"),
                                          Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                  $p("n2", true))),
                          Times(b_DEFAULT,
                              Power(
                                  Times(
                                      f_DEFAULT, $($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT,
                                          x_)))),
                                  n_))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Module(
                  List(Set(g,
                      FreeFactors(Sin(Plus(d, Times(e, x))), x))),
                  Dist(
                      Times(Power(g, Plus(m, C1)), Power(e,
                          CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(Subtract(C1, Times(Sqr(g), Sqr(x))),
                                      Times(C1D2, Subtract(m, C1))),
                                  Power(Plus(a, Times(b, Power(Times(f, g, x), n)),
                                      Times(c, Power(Times(f, g, x), Times(C2, n)))), p),
                                  Power(Power(x, m), CN1)),
                              x),
                          x, Times(Sin(Plus(d, Times(e, x))), Power(g, CN1))),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, n), x), IntegerQ(Times(C1D2,
                  Subtract(m, C1))), IntegerQ(
                      Times(C2, p))))),
      IIntegrate(3279,
          Integrate(
              Times(
                  Power(
                      Plus(
                          Times(c_DEFAULT,
                              Power(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  f_DEFAULT), $p("n2", true))),
                          Times(b_DEFAULT,
                              Power(Times($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  f_DEFAULT), n_)),
                          a_),
                      p_DEFAULT),
                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
              x_Symbol),
          Condition(
              Module(List(Set(g, FreeFactors(Cos(Plus(d, Times(e, x))), x))),
                  Negate(Dist(Times(Power(g, Plus(m, C1)), Power(e, CN1)), Subst(
                      Integrate(Times(
                          Power(Subtract(C1, Times(Sqr(g), Sqr(x))), Times(C1D2, Subtract(m, C1))),
                          Power(Plus(a, Times(b, Power(Times(f, g, x), n)),
                              Times(c, Power(Times(f, g, x), Times(C2, n)))), p),
                          Power(Power(x, m), CN1)), x),
                      x, Times(Cos(Plus(d, Times(e, x))), Power(g, CN1))), x))),
              And(FreeQ(List(a, b, c, d, e, f, n), x), IntegerQ(Times(C1D2,
                  Subtract(m, C1))), IntegerQ(
                      Times(C2, p))))),
      IIntegrate(3280,
          Integrate(
              Times(
                  Power($($s("§cot"),
                      Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                      p_DEFAULT)),
              x_Symbol),
          Condition(
              Dist(Power(Times(Power(C4, p), Power(c, p)), CN1),
                  Integrate(Times(Power(Cot(Plus(d, Times(e, x))), m),
                      Power(Plus(b, Times(C2, c, Power(Sin(Plus(d, Times(e, x))), n))),
                          Times(C2, p))),
                      x),
                  x),
              And(FreeQ(List(a, b, c, d, e, m, n), x), EqQ($s("n2"), Times(C2, n)),
                  Not(IntegerQ(Times(C1D2, Subtract(m, C1)))),
                  EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(p)))));
}
