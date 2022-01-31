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
class IntRules184 {
  public static IAST RULES =
      List(
          IIntegrate(3681,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          m_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(c_DEFAULT,
                                          $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(d, Csc(
                              Plus(e, Times(f, x)))), FracPart(
                                  m)),
                          Power(Times(Sin(Plus(e, Times(f, x))), Power(d, CN1)), FracPart(m))),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b,
                                  Power(Times(c, Tan(Plus(e, Times(f, x)))), n))), p),
                              Power(Power(Times(Sin(Plus(e, Times(f, x))), Power(d, CN1)), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(3682,
              Integrate(
                  Power(
                      Plus(a_,
                          Times(b_DEFAULT,
                              Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                      p_DEFAULT),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(C4, p),
                          Power(c, p)), CN1),
                      Integrate(
                          Power(
                              Plus(b, Times(C2, c,
                                  Power(Tan(Plus(d, Times(e, x))), n))),
                              Times(C2, p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(p)))),
          IIntegrate(3683,
              Integrate(
                  Power(
                      Plus(
                          Times(
                              Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT),
                              b_DEFAULT),
                          Times(Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              $p("n2", true)), c_DEFAULT),
                          a_),
                      p_DEFAULT),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(C4, p),
                          Power(c, p)), CN1),
                      Integrate(
                          Power(
                              Plus(b, Times(C2, c,
                                  Power(Cot(Plus(d, Times(e, x))), n))),
                              Times(C2, p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IntegerQ(p)))),
          IIntegrate(3684,
              Integrate(
                  Power(Plus(a_,
                      Times(
                          b_DEFAULT, Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              n_DEFAULT)),
                      Times(c_DEFAULT,
                          Power(
                              $($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2",
                                  true)))),
                      p_),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(
                                  a, Times(b, Power(Tan(
                                      Plus(d, Times(e, x))), n)),
                                  Times(c, Power(Tan(Plus(d, Times(e, x))), Times(C2, n)))),
                              p),
                          Power(
                              Power(
                                  Plus(b, Times(C2, c, Power(Tan(Plus(d, Times(e, x))), n))), Times(
                                      C2, p)),
                              CN1)),
                      Integrate(
                          Power(Plus(b, Times(C2, c, Power(Tan(Plus(d, Times(e, x))), n))),
                              Times(C2, p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      Not(IntegerQ(p))))),
          IIntegrate(3685,
              Integrate(
                  Power(
                      Plus(
                          Times(
                              Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT),
                              b_DEFAULT),
                          Times(
                              Power(
                                  $($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2",
                                      true)),
                              c_DEFAULT),
                          a_),
                      p_),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(
                                  a, Times(b, Power(Cot(
                                      Plus(d, Times(e, x))), n)),
                                  Times(c, Power(Cot(Plus(d, Times(e, x))), Times(C2, n)))),
                              p),
                          Power(Power(Plus(b, Times(C2, c, Power(Cot(Plus(d, Times(e, x))), n))),
                              Times(C2, p)), CN1)),
                      Integrate(
                          Power(
                              Plus(b, Times(C2, c, Power(Cot(Plus(d, Times(e, x))), n))), Times(C2,
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      Not(IntegerQ(p))))),
          IIntegrate(3686,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power(
                                  $($s("§tan"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                      CN1),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Subtract(
                          Dist(Times(C2, c, Power(q, CN1)),
                              Integrate(
                                  Power(
                                      Plus(b, Negate(q),
                                          Times(C2, c, Power(Tan(Plus(d, Times(e, x))), n))),
                                      CN1),
                                  x),
                              x),
                          Dist(
                              Times(C2, c, Power(q,
                                  CN1)),
                              Integrate(
                                  Power(
                                      Plus(b, q, Times(C2, c, Power(Tan(Plus(d, Times(e, x))),
                                          n))),
                                      CN1),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0)))),
          IIntegrate(3687,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(
                              Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT),
                              b_DEFAULT),
                          Times(
                              Power(
                                  $($s("§cot"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_))),
                                  $p("n2", true)),
                              c_DEFAULT)),
                      CN1),
                  x_Symbol),
              Condition(Module(List(Set(q, Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                  Subtract(
                      Dist(Times(C2, c, Power(q, CN1)),
                          Integrate(
                              Power(Plus(
                                  b, Negate(q), Times(C2, c, Power(Cot(Plus(d, Times(e, x))), n))),
                                  CN1),
                              x),
                          x),
                      Dist(Times(C2, c, Power(q, CN1)),
                          Integrate(
                              Power(Plus(b, q, Times(C2, c, Power(Cot(Plus(d, Times(e, x))), n))),
                                  CN1),
                              x),
                          x))),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(3688,
              Integrate(
                  Times(
                      Power($($s("§sin"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power(Times(f_DEFAULT,
                                      $($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power(
                                      Times(
                                          f_DEFAULT, $($s("§tan"),
                                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                      $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(f, Power(e,
                          CN1)),
                      Subst(
                          Integrate(
                              Times(Power(x, m), Power(Plus(a, Times(b, Power(x, n)),
                                  Times(c, Power(x, Times(C2, n)))), p),
                                  Power(Power(Plus(Sqr(f), Sqr(x)), Plus(Times(C1D2, m), C1)),
                                      CN1)),
                              x),
                          x, Times(f, Tan(Plus(d, Times(e, x))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, n, p), x), EqQ($s("n2"), Times(C2,
                      n)), IntegerQ(
                          Times(C1D2, m))))),
          IIntegrate(3689,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power(
                                      Times($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                          f_DEFAULT),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power(
                                      Times(
                                          $($s("§cot"), Plus(d_DEFAULT,
                                              Times(e_DEFAULT, x_))),
                                          f_DEFAULT),
                                      $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(
                          Times(f, Power(e,
                              CN1)),
                          Subst(
                              Integrate(
                                  Times(Power(x, m),
                                      Power(Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))), p),
                                      Power(Power(Plus(Sqr(f), Sqr(x)), Plus(Times(C1D2, m), C1)),
                                          CN1)),
                                  x),
                              x, Times(f, Cot(Plus(d, Times(e, x))))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n,
                      p), x), EqQ($s("n2"),
                          Times(C2, n)),
                      IntegerQ(Times(C1D2, m))))),
          IIntegrate(3690,
              Integrate(
                  Times(Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(g,
                          FreeFactors(Cos(Plus(d, Times(e, x))), x))),
                      Negate(Dist(Times(g, Power(e, CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(
                                          Subtract(C1, Times(Sqr(g),
                                              Sqr(x))),
                                          Times(C1D2, Subtract(m, C1))),
                                      Power(ExpandToSum(
                                          Plus(Times(a, Power(Times(g, x), Times(C2, n))),
                                              Times(b, Power(Times(g, x), n),
                                                  Power(Subtract(C1, Times(Sqr(g), Sqr(x))),
                                                      Times(C1D2, n))),
                                              Times(c,
                                                  Power(Subtract(C1, Times(Sqr(g), Sqr(x))), n))),
                                          x), p),
                                      Power(Power(Times(g, x), Times(C2, n, p)), CN1)),
                                  x),
                              x, Times(Cos(Plus(d, Times(e, x))), Power(g, CN1))),
                          x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                      IntegerQ(Times(C1D2, Subtract(m, C1))), IntegerQ(Times(C1D2, n)),
                      IntegerQ(p)))),
          IIntegrate(3691,
              Integrate(Times(
                  Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                  Power(Plus(a_DEFAULT,
                      Times(Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_DEFAULT),
                          b_DEFAULT),
                      Times(c_DEFAULT,
                          Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              $p("n2", true)))),
                      p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(g,
                          FreeFactors(Sin(Plus(d, Times(e, x))), x))),
                      Dist(
                          Times(g, Power(e,
                              CN1)),
                          Subst(Integrate(
                              Times(
                                  Power(Subtract(C1, Times(Sqr(g), Sqr(x))),
                                      Times(C1D2, Subtract(m, C1))),
                                  Power(ExpandToSum(
                                      Plus(Times(a, Power(Times(g, x), Times(C2, n))),
                                          Times(b, Power(Times(g, x), n),
                                              Power(Subtract(C1, Times(Sqr(g), Sqr(x))),
                                                  Times(C1D2, n))),
                                          Times(c, Power(Subtract(C1, Times(Sqr(g), Sqr(x))), n))),
                                      x), p),
                                  Power(Power(Times(g, x), Times(C2, n, p)), CN1)),
                              x), x, Times(Sin(Plus(d, Times(e, x))), Power(g, CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                      IntegerQ(Times(C1D2, Subtract(m,
                          C1))),
                      IntegerQ(Times(C1D2, n)), IntegerQ(p)))),
          IIntegrate(3692,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(f_DEFAULT,
                                          $($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power(
                                      Times(
                                          f_DEFAULT, $($s("§tan"),
                                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                      $p("n2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(Power(f, Plus(m, C1)), Power(e,
                          CN1)),
                      Subst(
                          Integrate(
                              Times(
                                  Power(
                                      Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))),
                                      p),
                                  Power(Power(Plus(Sqr(f), Sqr(x)), Plus(Times(C1D2, m), C1)),
                                      CN1)),
                              x),
                          x, Times(f, Tan(Plus(d, Times(e, x))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, n,
                      p), x), EqQ($s("n2"),
                          Times(C2, n)),
                      IntegerQ(Times(C1D2, m))))),
          IIntegrate(3693,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power(
                                      Times($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                          f_DEFAULT),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power(
                                      Times($($s("§cot"),
                                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), f_DEFAULT),
                                      $p("n2", true)))),
                          p_DEFAULT),
                      Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_)),
                  x_Symbol),
              Condition(
                  Negate(
                      Dist(Times(Power(f, Plus(m, C1)), Power(e, CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(Plus(a, Times(b, Power(x, n)),
                                          Times(c, Power(x, Times(C2, n)))), p),
                                      Power(Power(Plus(Sqr(f), Sqr(x)), Plus(Times(C1D2, m), C1)),
                                          CN1)),
                                  x),
                              x, Times(f, Cot(Plus(d, Times(e, x))))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, f, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      IntegerQ(Times(C1D2, m))))),
          IIntegrate(3694,
              Integrate(
                  Times(Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2", true)))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(List(Set(g, FreeFactors(Sin(Plus(d, Times(e, x))), x))),
                      Dist(Times(g, Power(e, CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(
                                          Subtract(C1, Times(Sqr(g), Sqr(x))), Times(C1D2,
                                              Subtract(Subtract(m, Times(C2, n, p)), C1))),
                                      Power(ExpandToSum(Plus(Times(c, Power(x, Times(C2, n))),
                                          Times(b, Power(x, n),
                                              Power(Subtract(C1, Sqr(x)), Times(C1D2, n))),
                                          Times(a, Power(Subtract(C1, Sqr(x)), n))), x), p)),
                                  x),
                              x, Times(Sin(Plus(d, Times(e, x))), Power(g, CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                      IntegerQ(Times(C1D2, Subtract(m,
                          C1))),
                      IntegerQ(Times(C1D2, n)), IntegerQ(p)))),
          IIntegrate(3695,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Power(
                                      $($s("§cot"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_))),
                                      n_DEFAULT),
                                  b_DEFAULT),
                              Times(
                                  Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2", true)),
                                  c_DEFAULT)),
                          p_DEFAULT),
                      Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(g,
                          FreeFactors(Cos(Plus(d, Times(e, x))), x))),
                      Negate(
                          Dist(Times(g, Power(e, CN1)),
                              Subst(
                                  Integrate(
                                      Times(
                                          Power(Subtract(C1, Times(Sqr(g), Sqr(x))), Times(C1D2,
                                              Subtract(Subtract(m, Times(C2, n, p)), C1))),
                                          Power(
                                              ExpandToSum(Plus(Times(c, Power(x, Times(C2, n))),
                                                  Times(b, Power(x, n),
                                                      Power(Subtract(C1, Sqr(x)), Times(C1D2, n))),
                                                  Times(a, Power(Subtract(C1, Sqr(x)), n))), x),
                                              p)),
                                      x),
                                  x, Times(Cos(Plus(d, Times(e, x))), Power(g, CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2, n)),
                      IntegerQ(Times(C1D2, Subtract(m,
                          C1))),
                      IntegerQ(Times(C1D2, n)), IntegerQ(p)))),
          IIntegrate(3696,
              Integrate(
                  Times(Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power($($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power(
                                      $($s("§tan"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_))),
                                      $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(C4, p),
                          Power(c, p)), CN1),
                      Integrate(
                          Times(Power(Tan(Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(b, Times(C2, c,
                                      Power(Tan(Plus(d, Times(e, x))), n))),
                                  Times(C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IntegerQ(p)))),
          IIntegrate(3697,
              Integrate(
                  Times(
                      Power($($s("§cot"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      n_DEFAULT),
                                  b_DEFAULT),
                              Times(
                                  Power(
                                      $($s("§cot"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_))),
                                      $p("n2", true)),
                                  c_DEFAULT)),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(C4, p),
                          Power(c, p)), CN1),
                      Integrate(
                          Times(Power(Cot(Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(b, Times(C2, c,
                                      Power(Cot(Plus(d, Times(e, x))), n))),
                                  Times(C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), IntegerQ(p)))),
          IIntegrate(3698,
              Integrate(
                  Times(
                      Power($($s("§tan"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power(
                                      $($s("§tan"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT, Power(
                                  $($s("§tan"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(
                                  a, Times(b, Power(Tan(
                                      Plus(d, Times(e, x))), n)),
                                  Times(c, Power(Tan(Plus(d, Times(e, x))), Times(C2, n)))),
                              p),
                          Power(
                              Power(
                                  Plus(b, Times(C2, c, Power(Tan(Plus(d, Times(e, x))), n))), Times(
                                      C2, p)),
                              CN1)),
                      Integrate(
                          Times(Power(Tan(Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(b, Times(C2, c, Power(Tan(Plus(d, Times(e, x))), n))), Times(
                                      C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      Not(IntegerQ(p))))),
          IIntegrate(3699,
              Integrate(
                  Times(Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT), b_DEFAULT),
                              Times(
                                  Power($($s("§cot"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2", true)),
                                  c_DEFAULT)),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(
                              Plus(
                                  a, Times(b, Power(Cot(
                                      Plus(d, Times(e, x))), n)),
                                  Times(c, Power(Cot(Plus(d, Times(e, x))), Times(C2, n)))),
                              p),
                          Power(
                              Power(Plus(b, Times(C2, c, Power(Cot(Plus(d, Times(e, x))), n))),
                                  Times(C2, p)),
                              CN1)),
                      Integrate(
                          Times(Power(Cot(Plus(d, Times(e, x))), m),
                              Power(
                                  Plus(b, Times(C2, c, Power(Cot(Plus(d, Times(e, x))), n))), Times(
                                      C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
          IIntegrate(3700,
              Integrate(
                  Times(
                      Power($($s("§tan"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(f_DEFAULT, $($s("§tan"), Plus(d_DEFAULT,
                                          Times(e_DEFAULT, x_)))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power(
                                      Times(
                                          f_DEFAULT, $($s("§tan"),
                                              Plus(d_DEFAULT, Times(e_DEFAULT, x_)))),
                                      $p("n2", true)))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(Times(f, Power(e, CN1)),
                      Subst(
                          Integrate(
                              Times(Power(Times(x, Power(f, CN1)), m),
                                  Power(Plus(a, Times(b, Power(x, n)),
                                      Times(c, Power(x, Times(C2, n)))), p),
                                  Power(Plus(Sqr(f), Sqr(x)), CN1)),
                              x),
                          x, Times(f, Tan(Plus(d, Times(e, x))))),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))));
}
