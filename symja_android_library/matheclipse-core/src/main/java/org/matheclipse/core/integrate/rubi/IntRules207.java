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
class IntRules207 {
  public static IAST RULES =
      List(
          IIntegrate(4141,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, Power($($s("§sec"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))), n_))),
                          p_DEFAULT),
                      Power(
                          Times(d_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_)),
                  x_Symbol),
              Condition(
                  With(List(Set($s("ff"), FreeFactors(Tan(Plus(e, Times(f, x))), x))),
                      Dist(Times($s("ff"), Power(f, CN1)),
                          Subst(
                              Integrate(Times(Power(Times(d, $s("ff"), x), m),
                                  Power(Plus(a,
                                      Times(b,
                                          Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Times(C1D2, n)))),
                                      p),
                                  Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))), CN1)), x),
                              x, Times(Tan(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, m, p), x), IntegerQ(Times(C1D2, n)),
                      Or(IntegerQ(Times(C1D2, m)), EqQ(n, C2))))),
          IIntegrate(4142,
              Integrate(
                  Times(
                      Power(
                          Times(b_DEFAULT,
                              Power(
                                  Times(
                                      c_DEFAULT,
                                      $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                  n_)),
                          p_DEFAULT),
                      Power(
                          Times(d_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              d, Power(Times(d,
                                  Tan(Plus(e, Times(f, x)))), Subtract(m, C1)),
                              Power(Times(b,
                                  Power(Times(c, Sec(Plus(e, Times(f, x)))), n)), p),
                              Power(Times(f, Subtract(Plus(Times(p, n), m), C1)), CN1)),
                          x),
                      Dist(
                          Times(Sqr(d), Subtract(m, C1),
                              Power(Subtract(Plus(Times(p, n), m), C1), CN1)),
                          Integrate(
                              Times(Power(Times(d, Tan(Plus(e, Times(f, x)))), Subtract(m, C2)),
                                  Power(Times(b, Power(Times(c, Sec(Plus(e, Times(f, x)))), n)),
                                      p)),
                              x),
                          x)),
                  And(FreeQ(List(b, c, d, e, f, p, n), x), GtQ(m, C1),
                      NeQ(Subtract(Plus(Times(p, n), m), C1), C0),
                      IntegersQ(Times(C2, p, n), Times(C2, m))))),
          IIntegrate(4143,
              Integrate(
                  Times(
                      Power(
                          Times(b_DEFAULT,
                              Power(
                                  Times(c_DEFAULT,
                                      $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                  n_)),
                          p_DEFAULT),
                      Power(
                          Times(d_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_)),
                  x_Symbol),
              Condition(
                  Subtract(
                      Simp(
                          Times(
                              Power(Times(d, Tan(Plus(e, Times(f, x)))), Plus(m, C1)), Power(Times(
                                  b, Power(Times(c, Sec(Plus(e, Times(f, x)))), n)), p),
                              Power(Times(d, f, Plus(m, C1)), CN1)),
                          x),
                      Dist(
                          Times(Plus(Times(p, n), m, C1), Power(Times(Sqr(d), Plus(m, C1)),
                              CN1)),
                          Integrate(
                              Times(
                                  Power(Times(d, Tan(Plus(e, Times(f, x)))), Plus(m,
                                      C2)),
                                  Power(Times(b, Power(Times(c, Sec(Plus(e, Times(f, x)))), n)),
                                      p)),
                              x),
                          x)),
                  And(FreeQ(List(b, c, d, e, f, p, n), x), LtQ(m, CN1),
                      NeQ(Plus(Times(p, n), m,
                          C1), C0),
                      IntegersQ(Times(C2, p, n), Times(C2, m))))),
          IIntegrate(4144,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(c_DEFAULT, $($s("§sec"), Plus(e_DEFAULT,
                                          Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_DEFAULT),
                      Power(Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(a,
                              Times(b, Power(Times(c, Sec(Plus(e, Times(f, x)))), n))), p),
                          Power(Times(d, Tan(Plus(e, Times(f, x)))), m)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(4145,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cot"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          m_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(c_DEFAULT,
                                          $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(d, Cot(Plus(e, Times(f,
                              x)))), FracPart(
                                  m)),
                          Power(Times(Tan(Plus(e, Times(f, x))), Power(d, CN1)), FracPart(m))),
                      Integrate(
                          Times(
                              Power(
                                  Plus(a, Times(b,
                                      Power(Times(c, Sec(Plus(e, Times(f, x)))), n))),
                                  p),
                              Power(Power(Times(Tan(Plus(e, Times(f, x))), Power(d, CN1)), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(4146,
              Integrate(
                  Times(
                      Power($($s("§sec"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_),
                      Power(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, Power($($s("§sec"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                      n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Tan(Plus(e, Times(f, x))), x))),
                      Dist(Times($s("ff"), Power(f, CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(
                                          Plus(C1, Times(Sqr($s("ff")),
                                              Sqr(x))),
                                          Subtract(Times(C1D2, m), C1)),
                                      Power(ExpandToSum(Plus(a,
                                          Times(b,
                                              Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                                  Times(C1D2, n)))),
                                          x), p)),
                                  x),
                              x, Times(Tan(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, e, f, p), x), IntegerQ(Times(C1D2,
                      m)), IntegerQ(
                          Times(C1D2, n))))),
          IIntegrate(4147,
              Integrate(
                  Times(
                      Power($($s("§sec"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, Power($($s("§sec"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                      n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Sin(Plus(e, Times(f, x))), x))),
                      Dist(Times($s("ff"), Power(f, CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(ExpandToSum(Plus(b,
                                          Times(a,
                                              Power(Subtract(C1, Times(Sqr($s("ff")), Sqr(x))),
                                                  Times(C1D2, n)))),
                                          x), p),
                                      Power(
                                          Power(Subtract(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Times(C1D2, Plus(m, Times(n, p), C1))),
                                          CN1)),
                                  x),
                              x, Times(Sin(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, e, f), x), IntegerQ(Times(C1D2, Subtract(m,
                      C1))), IntegerQ(Times(C1D2,
                          n)),
                      IntegerQ(p)))),
          IIntegrate(4148,
              Integrate(
                  Times(
                      Power($($s("§sec"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, Power($($s("§sec"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                      n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Sin(Plus(e, Times(f, x))), x))),
                      Dist(Times($s("ff"), Power(f, CN1)),
                          Subst(
                              Integrate(Times(
                                  Power(Plus(a,
                                      Times(b,
                                          Power(Power(Subtract(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Times(C1D2, n)), CN1))),
                                      p),
                                  Power(Power(Subtract(C1, Times(Sqr($s("ff")), Sqr(x))),
                                      Times(C1D2, Plus(m, C1))), CN1)),
                                  x),
                              x, Times(Sin(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, e, f, p), x), IntegerQ(Times(C1D2, Subtract(m,
                      C1))), IntegerQ(Times(C1D2,
                          n)),
                      Not(IntegerQ(p))))),
          IIntegrate(4149,
              Integrate(
                  Times(
                      Power($($s("§sec"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_DEFAULT),
                      Power(Plus(a_,
                          Times(
                              b_DEFAULT, Power($($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(Times(Power($($s("§sec"), Plus(e, Times(f, x))), m),
                          Power(Plus(a, Times(b, Power($($s("§sec"), Plus(e, Times(f, x))), n))),
                              p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f), x), IntegersQ(m, n, p)))),
          IIntegrate(4150,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT, $($s("§sec"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(c_DEFAULT,
                                          $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(Power(Times(d, Sec(Plus(e, Times(f, x)))), m),
                          Power(Plus(a, Times(b, Power(Times(c, Sec(Plus(e, Times(f, x)))), n))),
                              p)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(4151,
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
                                          $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
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
                                  Power(Times(c, Sec(Plus(e, Times(f, x)))), n))), p),
                              Power(Power(Times(Sin(Plus(e, Times(f, x))), Power(d, CN1)), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(4152,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
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
                                  Power(Sec(Plus(d, Times(e, x))), n))),
                              Times(C2, p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IntegerQ(p)))),
          IIntegrate(4153,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(
                              Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT),
                              b_DEFAULT),
                          Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              $p("n2", true)), c_DEFAULT)),
                      p_DEFAULT),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(Times(Power(C4, p),
                          Power(c, p)), CN1),
                      Integrate(
                          Power(
                              Plus(b, Times(C2, c, Power(Csc(Plus(d, Times(e, x))), n))), Times(C2,
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      IntegerQ(p)))),
          IIntegrate(4154,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power(
                                  $($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2",
                                      true)))),
                      p_),
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
                          Times(u,
                              Power(
                                  Plus(b, Times(C2, c,
                                      Power(Sec(Plus(d, Times(e, x))), n))),
                                  Times(C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n, p), x), EqQ($s("n2"), Times(C2,
                      n)), EqQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0),
                      Not(IntegerQ(p))))),
          IIntegrate(4155,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                              n_DEFAULT), b_DEFAULT),
                          Times(
                              Power(
                                  $($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p("n2",
                                      true)),
                              c_DEFAULT)),
                      p_),
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
                          Times(u,
                              Power(
                                  Plus(b, Times(C2, c, Power(Csc(Plus(d, Times(e, x))), n))), Times(
                                      C2, p))),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, n, p), x), EqQ($s("n2"), Times(C2, n)),
                      EqQ(Subtract(Sqr(b), Times(C4, a, c)), C0), Not(IntegerQ(p))))),
          IIntegrate(4156,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(b_DEFAULT,
                              Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT)),
                          Times(c_DEFAULT,
                              Power(
                                  $($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  $p("n2", true)))),
                      CN1),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(q,
                          Rt(Subtract(Sqr(b), Times(C4, a, c)), C2))),
                      Subtract(Dist(Times(C2, c, Power(q, CN1)),
                          Integrate(
                              Power(Plus(b, Negate(q),
                                  Times(C2, c, Power(Sec(Plus(d, Times(e, x))), n))), CN1),
                              x),
                          x),
                          Dist(Times(C2, c, Power(q, CN1)),
                              Integrate(
                                  Power(
                                      Plus(b, q, Times(C2, c, Power(Sec(Plus(d, Times(e, x))), n))),
                                      CN1),
                                  x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2,
                      n)), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                          C0)))),
          IIntegrate(4157,
              Integrate(
                  Power(
                      Plus(a_DEFAULT,
                          Times(
                              Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT),
                              b_DEFAULT),
                          Times(
                              Power(
                                  $($s("§csc"), Plus(d_DEFAULT,
                                      Times(e_DEFAULT, x_))),
                                  $p("n2", true)),
                              c_DEFAULT)),
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
                                          Times(C2, c, Power(Csc(Plus(d, Times(e, x))), n))),
                                      CN1),
                                  x),
                              x),
                          Dist(
                              Times(C2, c, Power(q,
                                  CN1)),
                              Integrate(Power(
                                  Plus(b, q, Times(C2, c, Power(Csc(Plus(d, Times(e, x))), n))),
                                  CN1), x),
                              x))),
                  And(FreeQ(List(a, b, c, d, e, n), x), EqQ($s("n2"), Times(C2, n)),
                      NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))),
          IIntegrate(4158,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(b_DEFAULT,
                                  Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      n_DEFAULT)),
                              Times(c_DEFAULT,
                                  Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2")))),
                          p_DEFAULT),
                      Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(f,
                          FreeFactors(Cos(Plus(d, Times(e, x))), x))),
                      Negate(
                          Dist(Times(f, Power(e, CN1)),
                              Subst(
                                  Integrate(
                                      Times(
                                          Power(Subtract(C1, Times(Sqr(f), Sqr(x))),
                                              Times(C1D2, Subtract(m, C1))),
                                          Power(Plus(b, Times(a, Power(Times(f, x), n))), p),
                                          Power(Power(Times(f, x), Times(n, p)), CN1)),
                                      x),
                                  x, Times(Cos(Plus(d, Times(e, x))), Power(f, CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2,
                      n)), IntegerQ(
                          Times(C1D2, Subtract(m, C1))),
                      IntegersQ(n, p)))),
          IIntegrate(4159,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_DEFAULT,
                              Times(Power($($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  n_DEFAULT), b_DEFAULT),
                              Times(
                                  Power(
                                      $($s("§csc"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), $p(
                                          "n2")),
                                  c_DEFAULT)),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(Module(List(Set(f, FreeFactors(Sin(Plus(d, Times(e, x))), x))),
                  Dist(Times(f, Power(e, CN1)),
                      Subst(
                          Integrate(Times(
                              Power(Subtract(C1, Times(Sqr(f), Sqr(x))),
                                  Times(C1D2, Subtract(m, C1))),
                              Power(Plus(b, Times(a, Power(Times(f, x), n))), p),
                              Power(Power(Times(f, x), Times(n, p)), CN1)), x),
                          x, Times(Sin(Plus(d, Times(e, x))), Power(f, CN1))),
                      x)),
                  And(FreeQ(List(a, b, c, d, e), x), EqQ($s("n2"), Times(C2,
                      n)), IntegerQ(
                          Times(C1D2, Subtract(m, C1))),
                      IntegersQ(n, p)))),
          IIntegrate(4160,
              Integrate(
                  Times(
                      Power(
                          Plus(a_DEFAULT,
                              Times(
                                  b_DEFAULT, Power($($s("§sec"),
                                      Plus(d_DEFAULT, Times(e_DEFAULT, x_))), n_)),
                              Times(c_DEFAULT,
                                  Power($($s("§sec"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                      $p("n2")))),
                          p_DEFAULT),
                      Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_)),
                  x_Symbol),
              Condition(
                  Module(
                      List(Set(f,
                          FreeFactors(Tan(Plus(d, Times(e, x))), x))),
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
                                      Power(Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                                          Plus(Times(C1D2, m), C1)), CN1)),
                                  x),
                              x, Times(Tan(Plus(d, Times(e, x))), Power(f, CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, d, e, p), x), EqQ($s("n2"), Times(C2, n)),
                      IntegerQ(Times(C1D2, m)), IntegerQ(Times(C1D2, n))))));
}
