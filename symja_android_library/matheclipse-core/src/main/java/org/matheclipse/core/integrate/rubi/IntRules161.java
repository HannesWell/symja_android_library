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
class IntRules161 {
  public static IAST RULES =
      List(
          IIntegrate(3221,
              Integrate(
                  Times(
                      Power(Times(d_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(c_DEFAULT,
                                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(Power(Times(d, $($s("§sin"), Plus(e, Times(f, x)))), m),
                              Power(
                                  Plus(a,
                                      Times(b, Power(Times(c, $($s("§sin"), Plus(e, Times(f, x)))),
                                          n))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), IGtQ(p, C0)))),
          IIntegrate(3222,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT, $($s("§sin"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_DEFAULT),
                      Power(Plus(a_,
                          Times(b_DEFAULT,
                              Power(
                                  Times(c_DEFAULT,
                                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                  n_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(d,
                              Sin(Plus(e, Times(f, x)))), m),
                          Power(Plus(a, Times(b, Power(Times(c, Sin(Plus(e, Times(f, x)))), n))),
                              p)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(3223,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(
                                          c_DEFAULT, $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT,
                                              x_)))),
                                      n_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(List(Set($s("ff"), FreeFactors(Sin(Plus(e, Times(f, x))), x))),
                      Dist(Times($s("ff"), Power(f, CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(Subtract(C1, Times(Sqr($s("ff")), Sqr(x))),
                                          Times(C1D2, Subtract(m, C1))),
                                      Power(Plus(a, Times(b, Power(Times(c, $s("ff"), x), n))), p)),
                                  x),
                              x, Times(Sin(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, e, f, n, p), x), IntegerQ(Times(C1D2,
                      Subtract(m, C1))), Or(EqQ(n, C4), GtQ(m, C0), IGtQ(p, C0),
                          IntegersQ(m, p))))),
          IIntegrate(3224,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_),
                      Power(Plus(a_,
                          Times(
                              b_DEFAULT, Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  C4))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Tan(Plus(e, Times(f, x))), x))),
                      Dist(
                          Times($s("ff"), Power(f,
                              CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(
                                          Plus(a, Times(C2, a, Sqr($s("ff")), Sqr(x)),
                                              Times(Plus(a, b), Power($s("ff"), C4), Power(x, C4))),
                                          p),
                                      Power(
                                          Power(
                                              Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Plus(Times(C1D2, m), Times(C2, p), C1)),
                                          CN1)),
                                  x),
                              x, Times(Tan(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, e, f), x), IntegerQ(Times(C1D2, m)), IntegerQ(p)))),
          IIntegrate(3225,
              Integrate(
                  Times(
                      Power($($s("§cos"),
                          Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_),
                      Power(Plus(a_,
                          Times(
                              b_DEFAULT, Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                                  n_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Tan(Plus(e, Times(f, x))), x))),
                      Dist(
                          Times($s("ff"), Power(f,
                              CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(
                                          Plus(Times(b, Power($s("ff"), n), Power(x, n)),
                                              Times(a,
                                                  Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                                      Times(C1D2, n)))),
                                          p),
                                      Power(
                                          Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Plus(Times(C1D2, m), Times(C1D2, n, p), C1)),
                                          CN1)),
                                  x),
                              x, Times(Tan(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, e, f), x), IntegerQ(Times(C1D2, m)),
                      IntegerQ(Times(C1D2, n)), IntegerQ(p)))),
          IIntegrate(3226,
              Integrate(
                  Times(Power($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), n_))),
                          CN1)),
                  x_Symbol),
              Condition(
                  Integrate(
                      Expand(
                          Times(
                              Power(Subtract(C1, Sqr(Sin(Plus(e, Times(f, x))))), Times(C1D2,
                                  m)),
                              Power(Plus(a, Times(b, Power(Sin(Plus(e, Times(f, x))), n))), CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, e, f), x), IGtQ(Times(C1D2, m), C0),
                      IntegerQ(Times(C1D2, Subtract(n, C1)))))),
          IIntegrate(3227,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          m_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(c_DEFAULT,
                                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(Power(Times(d, $($s("§cos"), Plus(e, Times(f, x)))), m),
                              Power(
                                  Plus(a,
                                      Times(b, Power(Times(c, $($s("§sin"), Plus(e, Times(f, x)))),
                                          n))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), IGtQ(p, C0)))),
          IIntegrate(3228,
              Integrate(
                  Times(
                      Power(
                          Times($($s("§cos"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                              d_DEFAULT),
                          m_DEFAULT),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(Times(c_DEFAULT,
                                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Times(d,
                              Cos(Plus(e, Times(f, x)))), m),
                          Power(Plus(a, Times(b, Power(Times(c, Sin(Plus(e, Times(f, x)))), n))),
                              p)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(3229,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, Power($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))), n_))),
                          p_DEFAULT),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Sqr(Sin(Plus(e, Times(f, x)))), x))),
                      Dist(
                          Times(Power($s("ff"), Times(C1D2, Plus(m, C1))), Power(Times(C2, f),
                              CN1)),
                          Subst(
                              Integrate(
                                  Times(Power(x, Times(C1D2, Subtract(m, C1))),
                                      Power(Plus(a,
                                          Times(b, Power($s("ff"), Times(C1D2, n)),
                                              Power(x, Times(C1D2, n)))),
                                          p),
                                      Power(Power(Subtract(C1, Times($s("ff"), x)),
                                          Times(C1D2, Plus(m, C1))), CN1)),
                                  x),
                              x, Times(Sqr(Sin(Plus(e, Times(f, x)))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, e, f, p), x), IntegerQ(Times(C1D2, Subtract(m, C1))),
                      IntegerQ(Times(C1D2, n))))),
          IIntegrate(3230,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(c_DEFAULT,
                                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_DEFAULT),
                      Power($($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), m_DEFAULT)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Sin(Plus(e, Times(f, x))), x))),
                      Dist(Times(Power($s("ff"), Plus(m, C1)), Power(f, CN1)),
                          Subst(
                              Integrate(
                                  Times(Power(x, m),
                                      Power(Plus(a, Times(b, Power(Times(c, $s("ff"), x), n))), p),
                                      Power(
                                          Power(Subtract(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Times(C1D2, Plus(m, C1))),
                                          CN1)),
                                  x),
                              x, Times(Sin(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, c, e, f, n, p), x),
                      ILtQ(Times(C1D2, Subtract(m, C1)), C0)))),
          IIntegrate(3231,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT, Power($($s("§sin"),
                                  Plus(e_DEFAULT, Times(f_DEFAULT, x_))), C4))),
                          p_DEFAULT),
                      Power(
                          Times(d_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Tan(Plus(e, Times(f, x))), x))),
                      Dist(Times($s("ff"), Power(f, CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(Times(d, $s("ff"),
                                          x), m),
                                      Power(ExpandToSum(Plus(
                                          Times(a, Sqr(Plus(C1, Times(Sqr($s("ff")), Sqr(x))))),
                                          Times(b, Power($s("ff"), C4), Power(x, C4))), x), p),
                                      Power(
                                          Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Plus(Times(C2, p), C1)),
                                          CN1)),
                                  x),
                              x, Times(Tan(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, m), x), IntegerQ(p)))),
          IIntegrate(3232,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(
                                  b_DEFAULT, Power($($s("§sin"),
                                      Plus(e_DEFAULT, Times(f_DEFAULT, x_))), C4))),
                          p_),
                      Power(
                          Times(d_DEFAULT, $($s("§tan"),
                              Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Tan(Plus(e, Times(f, x))), x))),
                      Dist(
                          Times($s("ff"),
                              Power(Plus(a, Times(b, Power(Sin(Plus(e, Times(f, x))), C4))), p),
                              Power(Sqr(Sec(
                                  Plus(e, Times(f, x)))), Times(C2,
                                      p)),
                              Power(
                                  Times(f,
                                      Power(
                                          Apart(
                                              Plus(
                                                  Times(a, Sqr(Plus(C1,
                                                      Sqr(Tan(Plus(e, Times(f, x))))))),
                                                  Times(b, Power(Tan(Plus(e, Times(f, x))), C4)))),
                                          p)),
                                  CN1)),
                          Subst(
                              Integrate(
                                  Times(
                                      Power(Times(d, $s("ff"),
                                          x), m),
                                      Power(ExpandToSum(Plus(
                                          Times(a, Sqr(Plus(C1, Times(Sqr($s("ff")), Sqr(x))))),
                                          Times(b, Power($s("ff"), C4), Power(x, C4))), x), p),
                                      Power(
                                          Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Plus(Times(C2, p), C1)),
                                          CN1)),
                                  x),
                              x, Times(Tan(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, m), x), IntegerQ(Subtract(p, C1D2))))),
          IIntegrate(3233,
              Integrate(
                  Times(
                      Power(
                          Plus(
                              a_,
                              Times(
                                  b_DEFAULT,
                                  Power($($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))), n_))),
                          p_DEFAULT),
                      Power(Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_)),
                  x_Symbol),
              Condition(
                  With(
                      List(Set($s("ff"),
                          FreeFactors(Tan(Plus(e, Times(f, x))), x))),
                      Dist(Times(Power($s("ff"), Plus(m, C1)), Power(f, CN1)),
                          Subst(
                              Integrate(
                                  Times(Power(Times(d, x), m),
                                      Power(Plus(Times(b, Power($s("ff"), n), Power(x, n)),
                                          Times(a,
                                              Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                                  Times(C1D2, n)))),
                                          p),
                                      Power(
                                          Power(Plus(C1, Times(Sqr($s("ff")), Sqr(x))),
                                              Plus(Times(C1D2, n, p), C1)),
                                          CN1)),
                                  x),
                              x, Times(Tan(Plus(e, Times(f, x))), Power($s("ff"), CN1))),
                          x)),
                  And(FreeQ(List(a, b, d, e, f, m), x), IntegerQ(Times(C1D2, n)), IGtQ(p, C0)))),
          IIntegrate(3234,
              Integrate(
                  Times(
                      Power(Plus(a_,
                          Times(b_DEFAULT,
                              Power(
                                  Times(c_DEFAULT,
                                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                  n_))),
                          p_DEFAULT),
                      Power(
                          Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_)))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Integrate(
                      ExpandTrig(
                          Times(Power(Times(d, $($s("§tan"), Plus(e, Times(f, x)))), m),
                              Power(
                                  Plus(a,
                                      Times(b, Power(Times(c, $($s("§sin"), Plus(e, Times(f, x)))),
                                          n))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n), x), IGtQ(p, C0)))),
          IIntegrate(3235,
              Integrate(
                  Times(
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      Times(
                                          c_DEFAULT,
                                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_DEFAULT),
                      Power(
                          Times(d_DEFAULT, $($s("§tan"), Plus(e_DEFAULT,
                              Times(f_DEFAULT, x_)))),
                          m_DEFAULT)),
                  x_Symbol),
              Condition(
                  Unintegrable(
                      Times(
                          Power(Plus(a,
                              Times(b, Power(Times(c, Sin(Plus(e, Times(f, x)))), n))), p),
                          Power(Times(d, Tan(Plus(e, Times(f, x)))), m)),
                      x),
                  FreeQ(List(a, b, c, d, e, f, m, n, p), x))),
          IIntegrate(3236,
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
                                      Times(c_DEFAULT, $($s(
                                          "§sin"),
                                          Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(d, Cot(
                              Plus(e, Times(f, x)))), FracPart(
                                  m)),
                          Power(Times(Tan(Plus(e, Times(f, x))), Power(d, CN1)), FracPart(m))),
                      Integrate(
                          Times(Power(
                              Plus(a, Times(b, Power(Times(c, Sin(Plus(e, Times(f, x)))), n))), p),
                              Power(Power(Times(Tan(Plus(e, Times(f, x))), Power(d, CN1)), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(3237,
              Integrate(
                  Times(
                      Power(
                          Times(d_DEFAULT,
                              $($s("§sec"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                          m_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(Times(c_DEFAULT,
                                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(d, Sec(Plus(e, Times(f, x)))), FracPart(m)), Power(Times(
                              Cos(Plus(e, Times(f, x))), Power(d, CN1)), FracPart(m))),
                      Integrate(
                          Times(
                              Power(
                                  Plus(a, Times(b,
                                      Power(Times(c, Sin(Plus(e, Times(f, x)))), n))),
                                  p),
                              Power(Power(Times(Cos(Plus(e, Times(f, x))), Power(d, CN1)), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(3238,
              Integrate(
                  Times(
                      Power(Times($($s("§csc"), Plus(e_DEFAULT, Times(f_DEFAULT, x_))),
                          d_DEFAULT), m_),
                      Power(
                          Plus(a_,
                              Times(b_DEFAULT,
                                  Power(
                                      $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT,
                                          x_))),
                                      n_DEFAULT))),
                          p_DEFAULT)),
                  x_Symbol),
              Condition(
                  Dist(
                      Power(d, Times(n,
                          p)),
                      Integrate(
                          Times(Power(Times(d, Csc(Plus(e, Times(f, x)))), Subtract(m, Times(n,
                              p))), Power(Plus(b, Times(a, Power(Csc(Plus(e, Times(f, x))), n))),
                                  p)),
                          x),
                      x),
                  And(FreeQ(List(a, b, d, e, f, m, n, p), x), Not(IntegerQ(m)), IntegersQ(n, p)))),
          IIntegrate(3239,
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
                                      Times(
                                          c_DEFAULT,
                                          $($s("§sin"), Plus(e_DEFAULT, Times(f_DEFAULT, x_)))),
                                      n_))),
                          p_)),
                  x_Symbol),
              Condition(
                  Dist(
                      Times(
                          Power(Times(d, Csc(Plus(e, Times(f,
                              x)))), FracPart(
                                  m)),
                          Power(Times(Sin(Plus(e, Times(f, x))), Power(d, CN1)), FracPart(m))),
                      Integrate(
                          Times(Power(
                              Plus(a, Times(b, Power(Times(c, Sin(Plus(e, Times(f, x)))), n))), p),
                              Power(Power(Times(Sin(Plus(e, Times(f, x))), Power(d, CN1)), m),
                                  CN1)),
                          x),
                      x),
                  And(FreeQ(List(a, b, c, d, e, f, m, n, p), x), Not(IntegerQ(m))))),
          IIntegrate(3240,
              Integrate(Times(Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), m_),
                  Power(
                      Plus(
                          Times(
                              Power($($s("§cos"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))),
                                  p_),
                              b_DEFAULT),
                          a_,
                          Times(c_DEFAULT,
                              Power($($s("§sin"), Plus(d_DEFAULT, Times(e_DEFAULT, x_))), q_))),
                      n_)),
                  x_Symbol),
              Condition(
                  Module(List(Set(f, FreeFactors(Cot(Plus(d, Times(e, x))), x))),
                      Negate(
                          Dist(
                              Times(f, Power(e, CN1)),
                              Subst(
                                  Integrate(
                                      Times(
                                          Power(
                                              ExpandToSum(
                                                  Plus(c,
                                                      Times(b,
                                                          Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                                                              Subtract(Times(C1D2, q),
                                                                  Times(C1D2, p)))),
                                                      Times(a,
                                                          Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                                                              Times(C1D2, q)))),
                                                  x),
                                              n),
                                          Power(
                                              Power(Plus(C1, Times(Sqr(f), Sqr(x))),
                                                  Plus(Times(C1D2, m), Times(C1D2, n, q), C1)),
                                              CN1)),
                                      x),
                                  x, Times(Cot(Plus(d, Times(e, x))), Power(f, CN1))),
                              x))),
                  And(FreeQ(List(a, b, c, d, e), x), IntegerQ(Times(C1D2, m)),
                      IntegerQ(Times(C1D2, p)), IntegerQ(Times(C1D2, q)), IntegerQ(n), GtQ(p, C0),
                      LeQ(p, q)))));
}
