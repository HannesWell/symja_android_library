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
class IntRules53 {
  public static IAST RULES = List(
      IIntegrate(1061,
          Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
              Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(x_))), Power(Plus(d_, Times(e_DEFAULT, x_),
                  Times(f_DEFAULT, Sqr(x_))), q_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                          Plus(
                              Times(Subtract(Times(ASymbol, c), Times(a, CSymbol)),
                                  Subtract(Times(C2, a, c, e),
                                      Times(b, Plus(Times(c, d), Times(a, f))))),
                              Times(ASymbol, b,
                                  Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                      Times(c, Plus(Times(b, e), Times(C2, a, f))))),
                              Times(c,
                                  Plus(
                                      Times(ASymbol,
                                          Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                              Times(c, Plus(Times(b, e), Times(C2, a, f))))),
                                      Times(CSymbol,
                                          Subtract(Subtract(Times(Sqr(b), d), Times(a, b, e)),
                                              Times(C2, a, Subtract(Times(c, d), Times(a, f)))))),
                                  x)),
                          Power(
                              Times(Subtract(Sqr(b), Times(C4, a, c)),
                                  Subtract(Sqr(Subtract(Times(c, d), Times(a, f))),
                                      Times(Subtract(Times(b, d), Times(a, e)),
                                          Subtract(Times(c, e), Times(b, f)))),
                                  Plus(p, C1)),
                              CN1)),
                      x),
                  Dist(
                      Power(
                          Times(
                              Subtract(Sqr(b), Times(C4, a,
                                  c)),
                              Subtract(
                                  Sqr(Subtract(Times(c, d),
                                      Times(a, f))),
                                  Times(
                                      Subtract(Times(b, d), Times(a,
                                          e)),
                                      Subtract(Times(c, e), Times(b, f)))),
                              Plus(p, C1)),
                          CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q),
                              Simp(
                                  Subtract(
                                      Subtract(
                                          Subtract(
                                              Plus(
                                                  Times(Subtract(Times(CN2, ASymbol, c), Times(
                                                      C2, a, CSymbol)), Subtract(
                                                          Sqr(Subtract(Times(c, d), Times(a, f))),
                                                          Times(Subtract(Times(b, d),
                                                              Times(a, e)),
                                                              Subtract(Times(c, e), Times(b, f)))),
                                                      Plus(p, C1)),
                                                  Times(
                                                      Plus(Times(Sqr(b), Plus(Times(CSymbol,
                                                          d), Times(ASymbol, f))), Times(CN1, b,
                                                              Plus(Times(Plus(ASymbol), c, e),
                                                                  Times(a, CSymbol, e))),
                                                          Times(C2,
                                                              Subtract(
                                                                  Times(ASymbol, c,
                                                                      Subtract(Times(c, d),
                                                                          Times(a, f))),
                                                                  Times(
                                                                      a,
                                                                      Subtract(Times(c, CSymbol, d),
                                                                          Times(a, CSymbol, f)))))),
                                                      Subtract(Times(a, f,
                                                          Plus(p, C1)),
                                                          Times(c, d, Plus(p, C2))))),
                                              Times(e, Plus(Times(
                                                  Subtract(Times(ASymbol, c), Times(a, CSymbol)),
                                                  Subtract(Times(C2, a, c, e), Times(b, Plus(Times(
                                                      c, d), Times(a, f))))),
                                                  Times(ASymbol, b,
                                                      Subtract(Plus(Times(C2, Sqr(
                                                          c), d), Times(Sqr(b),
                                                              f)),
                                                          Times(c,
                                                              Plus(Times(b, e),
                                                                  Times(C2, a, f)))))),
                                                  Plus(p, q, C2))),
                                          Times(
                                              Subtract(
                                                  Times(C2, f, Plus(
                                                      Times(
                                                          Subtract(Times(ASymbol, c),
                                                              Times(a, CSymbol)),
                                                          Subtract(Times(C2, a, c, e),
                                                              Times(b,
                                                                  Plus(Times(c, d), Times(a, f))))),
                                                      Times(ASymbol, b, Subtract(
                                                          Plus(Times(C2, Sqr(c), d),
                                                              Times(Sqr(b), f)),
                                                          Times(c,
                                                              Plus(Times(b, e),
                                                                  Times(C2, a, f)))))),
                                                      Plus(p, q, C2)),
                                                  Times(
                                                      Plus(
                                                          Times(Sqr(b),
                                                              Plus(Times(CSymbol, d),
                                                                  Times(ASymbol, f))),
                                                          Times(CN1, b,
                                                              Plus(Times(ASymbol, c, e),
                                                                  Times(a, CSymbol, e))),
                                                          Times(C2,
                                                              Subtract(
                                                                  Times(ASymbol, c,
                                                                      Subtract(Times(c, d),
                                                                          Times(a, f))),
                                                                  Times(a,
                                                                      Subtract(Times(c, CSymbol, d),
                                                                          Times(a, CSymbol, f)))))),
                                                      Subtract(Times(b, f, Plus(p, C1)),
                                                          Times(c, e, Plus(Times(C2, p), q, C4))))),
                                              x)),
                                      Times(c, f, Plus(
                                          Times(Sqr(b), Plus(Times(CSymbol, d), Times(ASymbol, f))),
                                          Times(CN1, b,
                                              Plus(Times(ASymbol, c, e), Times(a, CSymbol, e))),
                                          Times(C2, Subtract(
                                              Times(ASymbol, c, Subtract(Times(c, d), Times(a, f))),
                                              Times(a,
                                                  Subtract(Times(c, CSymbol, d),
                                                      Times(a, CSymbol, f)))))),
                                          Plus(Times(C2, p), Times(C2, q), C5), Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0), LtQ(p, CN1),
                  NeQ(Subtract(Sqr(Subtract(Times(c, d), Times(a, f))),
                      Times(Subtract(Times(b, d), Times(a, e)),
                          Subtract(Times(c, e), Times(b, f)))),
                      C0),
                  Not(And(Not(IntegerQ(p)), ILtQ(q, CN1))), Not(IGtQ(q, C0))))),
      IIntegrate(1062,
          Integrate(
              Times(Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_),
                  Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))), Power(Plus(d_,
                      Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
              x_Symbol),
          Condition(
              Plus(
                  Simp(
                      Times(Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                          Plus(Times(Subtract(Times(ASymbol, c), Times(a, CSymbol)), C2, a, c, e),
                              Times(
                                  CN1, a, BSymbol, Subtract(Times(C2, Sqr(c), d),
                                      Times(c, C2, a, f))),
                              Times(c,
                                  Plus(
                                      Times(ASymbol,
                                          Subtract(Times(C2, Sqr(c), d), Times(c, C2, a, f))),
                                      Times(CN1, BSymbol, CN2, a, c, e),
                                      Times(CSymbol, CN2, a, Subtract(Times(c, d), Times(a, f)))),
                                  x)),
                          Power(
                              Times(CN4, a, c,
                                  Plus(Times(a, c, Sqr(e)),
                                      Sqr(Subtract(Times(c, d), Times(a, f)))),
                                  Plus(p, C1)),
                              CN1)),
                      x),
                  Dist(
                      Power(
                          Times(CN4, a, c,
                              Plus(Times(a, c, Sqr(
                                  e)), Sqr(
                                      Subtract(Times(c, d), Times(a, f)))),
                              Plus(p, C1)),
                          CN1),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(c,
                                  Sqr(x))), Plus(p,
                                      C1)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q),
                              Simp(
                                  Subtract(
                                      Subtract(
                                          Subtract(Plus(
                                              Times(
                                                  Subtract(
                                                      Times(CN2, ASymbol, c),
                                                      Times(C2, a, CSymbol)),
                                                  Subtract(
                                                      Sqr(Subtract(Times(c, d), Times(a, f))),
                                                      Times(CN1, a, e, c, e)),
                                                  Plus(p, C1)),
                                              Times(C2,
                                                  Subtract(
                                                      Times(ASymbol, c,
                                                          Subtract(Times(c, d), Times(a, f))),
                                                      Times(a,
                                                          Subtract(
                                                              Subtract(Times(c, CSymbol, d),
                                                                  Times(BSymbol, c, e)),
                                                              Times(a, CSymbol, f)))),
                                                  Subtract(Times(a, f, Plus(p, C1)),
                                                      Times(c, d, Plus(p, C2))))),
                                              Times(e,
                                                  Plus(Times(Subtract(Times(ASymbol, c),
                                                      Times(a, CSymbol)), C2, a, c, e), Times(CN1,
                                                          a, BSymbol,
                                                          Subtract(Times(C2, Sqr(c),
                                                              d), Times(c, Plus(C2), a, f)))),
                                                  Plus(p, q, C2))),
                                          Times(Subtract(
                                              Times(C2, f, Plus(
                                                  Times(Subtract(Times(ASymbol, c),
                                                      Times(a, CSymbol)), C2, a, c, e),
                                                  Times(
                                                      CN1, a, BSymbol,
                                                      Subtract(Times(C2, Sqr(c), d),
                                                          Times(c, Plus(C2), a, f)))),
                                                  Plus(p, q, C2)),
                                              Times(C2,
                                                  Subtract(
                                                      Times(ASymbol, c,
                                                          Subtract(Times(c, d), Times(a, f))),
                                                      Times(a,
                                                          Subtract(
                                                              Subtract(Times(c, CSymbol, d),
                                                                  Times(BSymbol, c, e)),
                                                              Times(a, CSymbol, f)))),
                                                  CN1, c, e, Plus(Times(C2, p), q, C4))),
                                              x)),
                                      Times(c, f, C2, Subtract(
                                          Times(ASymbol, c, Subtract(Times(c, d), Times(a, f))),
                                          Times(a, Subtract(
                                              Subtract(Times(c, CSymbol, d), Times(BSymbol, c, e)),
                                              Times(a, CSymbol, f)))),
                                          Plus(Times(C2, p), Times(C2, q), C5), Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e, f, ASymbol, BSymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0), LtQ(p, CN1),
                  NeQ(Plus(Times(a, c,
                      Sqr(e)), Sqr(Subtract(Times(c, d), Times(a, f)))), C0),
                  Not(And(Not(IntegerQ(p)), ILtQ(q, CN1))), Not(IGtQ(q, C0))))),
      IIntegrate(1063,
          Integrate(Times(Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_),
              Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(x_))),
              Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)), x_Symbol),
          Condition(
              Plus(Simp(Times(Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                  Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                  Plus(Times(Subtract(Times(ASymbol, c), Times(a, CSymbol)), C2, a, c, e), Times(c,
                      Plus(Times(ASymbol, Subtract(Times(C2, Sqr(c), d), Times(c, C2, a, f))),
                          Times(CSymbol, CN2, a, Subtract(Times(c, d), Times(a, f)))),
                      x)),
                  Power(
                      Times(
                          CN4, a, c,
                          Plus(Times(a, c, Sqr(e)), Sqr(Subtract(Times(c, d), Times(a, f)))), Plus(
                              p, C1)),
                      CN1)),
                  x),
                  Dist(
                      Power(Times(CN4, a, c,
                          Plus(Times(a, c, Sqr(e)), Sqr(Subtract(Times(c, d), Times(a, f)))), Plus(
                              p, C1)),
                          CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(c, Sqr(x))), Plus(p, C1)),
                              Power(Plus(d, Times(e, x),
                                  Times(f, Sqr(x))), q),
                              Simp(
                                  Subtract(
                                      Subtract(
                                          Subtract(
                                              Plus(Times(
                                                  Subtract(Times(CN2, ASymbol, c),
                                                      Times(C2, a, CSymbol)),
                                                  Subtract(Sqr(Subtract(Times(c, d), Times(a, f))),
                                                      Times(CN1, a, e, c, e)),
                                                  Plus(p, C1)),
                                                  Times(C2,
                                                      Subtract(
                                                          Times(ASymbol, c,
                                                              Subtract(Times(c, d), Times(a, f))),
                                                          Times(a,
                                                              Subtract(Times(c, CSymbol, d),
                                                                  Times(a, CSymbol, f)))),
                                                      Subtract(Times(a, f, Plus(p, C1)),
                                                          Times(c, d, Plus(p, C2))))),
                                              Times(e,
                                                  Subtract(Times(ASymbol, c), Times(a, CSymbol)),
                                                  C2, a, c, e, Plus(p, q, C2))),
                                          Times(
                                              Subtract(
                                                  Times(C2, f, Subtract(Times(ASymbol, c),
                                                      Times(a, CSymbol)), C2, a, c, e,
                                                      Plus(p, q, C2)),
                                                  Times(C2,
                                                      Subtract(
                                                          Times(ASymbol, c,
                                                              Subtract(Times(c, d), Times(a, f))),
                                                          Times(a,
                                                              Subtract(Times(c, CSymbol, d),
                                                                  Times(a, CSymbol, f)))),
                                                      CN1, c, e, Plus(Times(C2, p), q, C4))),
                                              x)),
                                      Times(c, f, C2,
                                          Subtract(
                                              Times(ASymbol, c, Subtract(Times(c, d), Times(a, f))),
                                              Times(a,
                                                  Subtract(Times(c, CSymbol, d),
                                                      Times(a, CSymbol, f)))),
                                          Plus(Times(C2, p), Times(C2, q), C5), Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e, f, ASymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0), LtQ(p, CN1),
                  NeQ(Plus(Times(a, c,
                      Sqr(e)), Sqr(Subtract(Times(c, d), Times(a, f)))), C0),
                  Not(And(Not(IntegerQ(p)), ILtQ(q, CN1))), Not(IGtQ(q, C0))))),
      IIntegrate(1064,
          Integrate(
              Times(
                  Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT,
                      Sqr(x_))), p_),
                  Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT,
                      Sqr(x_))),
                  Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), q_)),
              x_Symbol),
          Condition(Plus(Simp(Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
              Power(Plus(d, Times(f, Sqr(x))), Plus(q, C1)),
              Plus(
                  Times(Subtract(Times(ASymbol, c), Times(a, CSymbol)), CN1, b,
                      Plus(Times(c, d), Times(a, f))),
                  Times(Subtract(Times(ASymbol, b), Times(a, BSymbol)),
                      Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)), Times(c, C2, a, f))),
                  Times(c,
                      Plus(
                          Times(ASymbol,
                              Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                  Times(c, C2, a, f))),
                          Times(CN1, BSymbol, Plus(Times(b, c, d), Times(a, b, f))),
                          Times(CSymbol,
                              Subtract(Times(Sqr(b), d),
                                  Times(C2, a, Subtract(Times(c, d), Times(a, f)))))),
                      x)),
              Power(
                  Times(Subtract(Sqr(b), Times(C4, a, c)),
                      Plus(Times(Sqr(b), d, f), Sqr(Subtract(Times(c, d), Times(a, f)))), Plus(p,
                          C1)),
                  CN1)),
              x),
              Dist(
                  Power(
                      Times(Subtract(Sqr(b), Times(C4, a, c)),
                          Plus(Times(Sqr(
                              b), d, f), Sqr(
                                  Subtract(Times(c, d), Times(a, f)))),
                          Plus(p, C1)),
                      CN1),
                  Integrate(Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                      Power(Plus(d, Times(f, Sqr(x))), q),
                      Simp(
                          Subtract(
                              Subtract(Plus(
                                  Times(
                                      Subtract(Subtract(Times(b, BSymbol), Times(C2, ASymbol, c)),
                                          Times(C2, a, CSymbol)),
                                      Subtract(
                                          Sqr(Subtract(Times(c, d), Times(a, f))),
                                          Times(b, d, CN1, b, f)),
                                      Plus(p, C1)),
                                  Times(Plus(
                                      Times(Sqr(b), Plus(Times(CSymbol, d), Times(ASymbol, f))),
                                      Times(CN1, b,
                                          Plus(Times(BSymbol, c, d), Times(a, BSymbol, f))),
                                      Times(C2,
                                          Subtract(
                                              Times(ASymbol, c, Subtract(Times(c, d), Times(a, f))),
                                              Times(a,
                                                  Subtract(Times(c, CSymbol, d),
                                                      Times(a, CSymbol, f)))))),
                                      Subtract(
                                          Times(a, f, Plus(p, C1)), Times(c, d, Plus(p, C2))))),
                                  Times(Subtract(
                                      Times(C2, f, Plus(
                                          Times(
                                              Subtract(Times(ASymbol, c), Times(a, CSymbol)), CN1,
                                              b, Plus(Times(c, d), Times(a, f))),
                                          Times(Subtract(Times(ASymbol, b), Times(a, BSymbol)),
                                              Subtract(Plus(Times(C2, Sqr(c), d), Times(
                                                  Sqr(b), f)), Times(c, C2, a, f)))),
                                          Plus(p, q, C2)),
                                      Times(
                                          Plus(
                                              Times(
                                                  Sqr(b),
                                                  Plus(Times(CSymbol, d), Times(ASymbol, f))),
                                              Times(
                                                  CN1, b, Plus(Times(BSymbol, c, d),
                                                      Times(a, BSymbol, f))),
                                              Times(C2,
                                                  Subtract(
                                                      Times(ASymbol, c,
                                                          Subtract(Times(c, d), Times(a, f))),
                                                      Times(a,
                                                          Subtract(Times(c, CSymbol, d),
                                                              Times(a, CSymbol, f)))))),
                                          b, f, Plus(p, C1))),
                                      x)),
                              Times(c, f, Plus(
                                  Times(Sqr(b), Plus(Times(CSymbol, d), Times(ASymbol, f))),
                                  Times(CN1, b, Plus(Times(BSymbol, c, d), Times(a, BSymbol, f))),
                                  Times(C2, Subtract(
                                      Times(ASymbol, c, Subtract(Times(c, d), Times(a, f))),
                                      Times(a,
                                          Subtract(Times(c, CSymbol, d), Times(a, CSymbol, f)))))),
                                  Plus(Times(C2, p), Times(C2, q), C5), Sqr(x))),
                          x)),
                      x),
                  x)),
              And(FreeQ(List(a, b, c, d, f, ASymbol, BSymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), LtQ(p, CN1),
                  NeQ(Plus(Times(Sqr(b), d, f), Sqr(Subtract(Times(c, d), Times(a, f)))), C0), Not(
                      And(Not(IntegerQ(p)), ILtQ(q, CN1))),
                  Not(IGtQ(q, C0))))),
      IIntegrate(1065,
          Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
              Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(x_))),
              Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), q_)), x_Symbol),
          Condition(
              Plus(Simp(Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Plus(p, C1)),
                  Power(Plus(d, Times(f, Sqr(x))), Plus(q, C1)),
                  Plus(
                      Times(Subtract(Times(ASymbol, c), Times(a, CSymbol)), CN1, b,
                          Plus(Times(c, d), Times(a, f))),
                      Times(ASymbol, b,
                          Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                              Times(c, C2, a, f))),
                      Times(c,
                          Plus(
                              Times(ASymbol,
                                  Subtract(Plus(Times(C2, Sqr(c), d), Times(Sqr(b), f)),
                                      Times(c, C2, a, f))),
                              Times(CSymbol,
                                  Subtract(Times(Sqr(b), d),
                                      Times(C2, a, Subtract(Times(c, d), Times(a, f)))))),
                          x)),
                  Power(
                      Times(Subtract(Sqr(b), Times(C4, a, c)),
                          Plus(Times(Sqr(b), d, f), Sqr(Subtract(Times(c, d), Times(a, f)))), Plus(
                              p, C1)),
                      CN1)),
                  x),
                  Dist(
                      Power(
                          Times(Subtract(Sqr(b), Times(C4, a, c)),
                              Plus(Times(Sqr(
                                  b), d, f), Sqr(
                                      Subtract(Times(c, d), Times(a, f)))),
                              Plus(p, C1)),
                          CN1),
                      Integrate(
                          Times(
                              Power(Plus(a, Times(b, x), Times(c,
                                  Sqr(x))), Plus(p,
                                      C1)),
                              Power(Plus(d, Times(f, Sqr(x))), q),
                              Simp(
                                  Subtract(
                                      Subtract(
                                          Plus(
                                              Times(
                                                  Subtract(Times(CN2, ASymbol,
                                                      c), Times(C2, a, CSymbol)),
                                                  Subtract(
                                                      Sqr(Subtract(Times(c, d), Times(a, f))),
                                                      Times(b, d, CN1, b, f)),
                                                  Plus(p, C1)),
                                              Times(
                                                  Plus(
                                                      Times(Sqr(b),
                                                          Plus(Times(CSymbol, d), Times(
                                                              ASymbol, f))),
                                                      Times(C2,
                                                          Subtract(
                                                              Times(ASymbol, c,
                                                                  Subtract(Times(c, d),
                                                                      Times(a, f))),
                                                              Times(a,
                                                                  Subtract(Times(c, CSymbol, d),
                                                                      Times(a, CSymbol, f)))))),
                                                  Subtract(
                                                      Times(a, f, Plus(p,
                                                          C1)),
                                                      Times(c, d, Plus(p, C2))))),
                                          Times(
                                              Subtract(
                                                  Times(C2, f,
                                                      Plus(
                                                          Times(Subtract(Times(ASymbol, c),
                                                              Times(a, CSymbol)), CN1, b,
                                                              Plus(Times(c, d), Times(a, f))),
                                                          Times(ASymbol, b,
                                                              Subtract(
                                                                  Plus(Times(C2, Sqr(c), d),
                                                                      Times(Sqr(b), f)),
                                                                  Times(c, C2, a, f)))),
                                                      Plus(p, q, C2)),
                                                  Times(
                                                      Plus(
                                                          Times(Sqr(b),
                                                              Plus(Times(CSymbol, d),
                                                                  Times(ASymbol, f))),
                                                          Times(C2,
                                                              Subtract(
                                                                  Times(ASymbol, c,
                                                                      Subtract(Times(c, d),
                                                                          Times(a, f))),
                                                                  Times(a,
                                                                      Subtract(Times(c, CSymbol, d),
                                                                          Times(a, CSymbol, f)))))),
                                                      b, f, Plus(p, C1))),
                                              x)),
                                      Times(c, f, Plus(
                                          Times(Sqr(b), Plus(Times(CSymbol, d), Times(ASymbol, f))),
                                          Times(C2, Subtract(
                                              Times(ASymbol, c, Subtract(Times(c, d), Times(a, f))),
                                              Times(a,
                                                  Subtract(Times(c, CSymbol, d),
                                                      Times(a, CSymbol, f)))))),
                                          Plus(Times(C2, p), Times(C2, q), C5), Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, f, ASymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), LtQ(p, CN1),
                  NeQ(Plus(Times(Sqr(b), d, f), Sqr(Subtract(Times(c, d), Times(a, f)))), C0),
                  Not(And(Not(IntegerQ(p)), ILtQ(q, CN1))), Not(IGtQ(q, C0))))),
      IIntegrate(1066,
          Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
              Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))),
              Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)), x_Symbol),
          Condition(Subtract(
              Simp(Times(
                  Plus(Times(BSymbol, c, f, Plus(Times(C2, p), Times(C2, q), C3)),
                      Times(CSymbol,
                          Subtract(Times(b, f, p), Times(c, e, Plus(Times(C2, p), q, C2)))),
                      Times(C2, c, CSymbol, f, Plus(p, q, C1), x)),
                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                  Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                  Power(Times(C2, c, Sqr(f), Plus(p, q, C1), Plus(Times(C2, p), Times(C2, q), C3)),
                      CN1)),
                  x),
              Dist(
                  Power(Times(C2, c, Sqr(f), Plus(p, q, C1), Plus(Times(C2, p), Times(C2, q), C3)),
                      CN1),
                  Integrate(
                      Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q),
                          Simp(Plus(
                              Times(p, Subtract(Times(b, d), Times(a, e)),
                                  Subtract(Times(CSymbol, Subtract(Times(c, e), Times(b, f)), Plus(
                                      q, C1)), Times(c,
                                          Subtract(Times(CSymbol, e), Times(BSymbol, f)), Plus(
                                              Times(C2, p), Times(C2, q), C3)))),
                              Times(Plus(p, q, C1), Plus(Times(Sqr(b), CSymbol, d, f, p), Times(a,
                                  c, Plus(Times(CSymbol,
                                      Subtract(Times(C2, d, f),
                                          Times(Sqr(e), Plus(Times(C2, p), q, C2)))),
                                      Times(f, Subtract(Times(BSymbol, e), Times(C2, ASymbol, f)),
                                          Plus(Times(C2, p), Times(C2, q), C3)))))),
                              Times(
                                  Plus(Times(C2, p, Subtract(Times(c, d), Times(a, f)),
                                      Subtract(Times(CSymbol, Subtract(Times(c, e), Times(b, f)),
                                          Plus(q, C1)),
                                          Times(c, Subtract(Times(CSymbol, e), Times(BSymbol, f)),
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(Plus(p, q, C1), Subtract(
                                          Times(CSymbol, e, f, p,
                                              Subtract(Sqr(b), Times(C4, a, c))),
                                          Times(b, c, Plus(
                                              Times(CSymbol, Subtract(Sqr(e), Times(C4, d, f)),
                                                  Plus(Times(C2, p), q, C2)),
                                              Times(f,
                                                  Plus(Times(C2, CSymbol, d), Times(CN1, BSymbol,
                                                      e), Times(C2, ASymbol, f)),
                                                  Plus(Times(C2, p), Times(C2, q), C3))))))),
                                  x),
                              Times(
                                  Plus(Times(p, Subtract(Times(c, e), Times(b, f)),
                                      Subtract(Times(CSymbol, Subtract(Times(c, e), Times(b, f)),
                                          Plus(q, C1)),
                                          Times(c, Subtract(Times(CSymbol, e), Times(BSymbol, f)),
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(Plus(p, q, C1), Subtract(
                                          Times(CSymbol, Sqr(f), p,
                                              Subtract(Sqr(b), Times(C4, a, c))),
                                          Times(Sqr(c), Plus(
                                              Times(CSymbol, Subtract(Sqr(e), Times(C4, d, f)),
                                                  Plus(Times(C2, p), q, C2)),
                                              Times(f, Plus(Times(C2, CSymbol, d),
                                                  Times(CN1, BSymbol, e), Times(C2, ASymbol, f)),
                                                  Plus(Times(C2, p), Times(C2, q), C3))))))),
                                  Sqr(x))),
                              x)),
                      x),
                  x)),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0), GtQ(p, C0), NeQ(Plus(p, q, C1), C0),
                  NeQ(Plus(Times(C2, p), Times(C2, q), C3), C0), Not(IGtQ(p,
                      C0)),
                  Not(IGtQ(q, C0))))),
      IIntegrate(1067,
          Integrate(
              Times(
                  Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(
                      x_))), p_),
                  Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(x_))), Power(Plus(d_, Times(e_DEFAULT, x_),
                      Times(f_DEFAULT, Sqr(x_))), q_)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(Times(
                      Plus(
                          Times(CSymbol,
                              Subtract(Times(b, f, p), Times(c, e, Plus(Times(C2, p), q, C2)))),
                          Times(C2, c, CSymbol, f, Plus(p, q, C1), x)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                      Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                      Power(
                          Times(C2, c, Sqr(f), Plus(p, q, C1),
                              Plus(Times(C2, p), Times(C2, q), C3)),
                          CN1)),
                      x),
                  Dist(
                      Power(Times(C2, c, Sqr(f), Plus(p, q, C1),
                          Plus(Times(C2, p), Times(C2, q), C3)), CN1),
                      Integrate(Times(
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q),
                          Simp(
                              Plus(Times(
                                  p, Subtract(Times(b, d), Times(a, e)), Subtract(
                                      Times(
                                          CSymbol, Subtract(Times(c, e), Times(b, f)), Plus(q, C1)),
                                      Times(c, CSymbol, e, Plus(Times(C2, p), Times(C2, q), C3)))),
                                  Times(Plus(p, q, C1), Plus(Times(Sqr(b), CSymbol, d, f, p), Times(
                                      a, c,
                                      Plus(
                                          Times(CSymbol,
                                              Subtract(Times(C2, d, f),
                                                  Times(Sqr(e), Plus(Times(C2, p), q, C2)))),
                                          Times(f, CN2, ASymbol, f,
                                              Plus(Times(C2, p), Times(C2, q), C3)))))),
                                  Times(Plus(
                                      Times(C2, p, Subtract(Times(c, d), Times(a, f)), Subtract(
                                          Times(CSymbol, Subtract(Times(c, e), Times(b, f)),
                                              Plus(q, C1)),
                                          Times(c, CSymbol, e,
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(Plus(p, q, C1), Subtract(
                                          Times(CSymbol, e, f, p,
                                              Subtract(Sqr(b), Times(C4, a, c))),
                                          Times(b, c, Plus(
                                              Times(CSymbol, Subtract(Sqr(e), Times(C4, d, f)),
                                                  Plus(Times(C2, p), q, C2)),
                                              Times(
                                                  f,
                                                  Plus(Times(C2, CSymbol, d),
                                                      Times(C2, ASymbol, f)),
                                                  Plus(Times(C2, p), Times(C2, q), C3))))))),
                                      x),
                                  Times(
                                      Plus(Times(p, Subtract(Times(c, e), Times(b, f)), Subtract(
                                          Times(CSymbol, Subtract(Times(c, e), Times(b, f)),
                                              Plus(q, C1)),
                                          Times(
                                              c, CSymbol, e,
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                          Times(Plus(p, q, C1), Subtract(
                                              Times(CSymbol, Sqr(f), p,
                                                  Subtract(Sqr(b), Times(C4, a, c))),
                                              Times(Sqr(c), Plus(
                                                  Times(CSymbol, Subtract(Sqr(e), Times(C4, d, f)),
                                                      Plus(Times(C2, p), q, C2)),
                                                  Times(f,
                                                      Plus(Times(C2, CSymbol, d),
                                                          Times(C2, ASymbol, f)),
                                                      Plus(Times(C2, p), Times(C2, q), C3))))))),
                                      Sqr(x))),
                              x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0), GtQ(p, C0), NeQ(Plus(p, q, C1), C0),
                  NeQ(Plus(Times(C2, p), Times(C2, q), C3), C0), Not(IGtQ(p,
                      C0)),
                  Not(IGtQ(q, C0))))),
      IIntegrate(1068,
          Integrate(
              Times(Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_),
                  Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))), Power(Plus(d_,
                      Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), q_)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(
                          Plus(Times(BSymbol, c, f, Plus(Times(C2, p), Times(C2, q), C3)),
                              Times(CSymbol, CN1, c, e, Plus(Times(C2, p), q, C2)),
                              Times(C2, c, CSymbol, f, Plus(p, q, C1), x)),
                          Power(Plus(a, Times(c, Sqr(x))), p),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                          Power(Times(C2, c, Sqr(f), Plus(p, q, C1),
                              Plus(Times(C2, p), Times(C2, q), C3)), CN1)),
                      x),
                  Dist(
                      Power(Times(C2, c, Sqr(f), Plus(p, q, C1),
                          Plus(Times(C2, p), Times(C2, q), C3)), CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C1)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q),
                              Simp(
                                  Plus(Times(p, CN1, a, e,
                                      Subtract(Times(CSymbol, c, e, Plus(q, C1)),
                                          Times(c, Subtract(Times(CSymbol, e), Times(BSymbol, f)),
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(Plus(p, q, C1), a, c,
                                          Plus(Times(CSymbol, Subtract(Times(C2, d, f), Times(
                                              Sqr(e), Plus(Times(C2, p), q, C2)))), Times(f,
                                                  Subtract(Times(BSymbol, e),
                                                      Times(C2, ASymbol, f)),
                                                  Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(
                                          Plus(
                                              Times(C2, p, Subtract(Times(c, d), Times(a, f)),
                                                  Subtract(Times(CSymbol, c, e, Plus(q, C1)),
                                                      Times(c,
                                                          Subtract(Times(CSymbol, e), Times(BSymbol,
                                                              f)),
                                                          Plus(Times(C2, p), Times(C2, q), C3)))),
                                              Times(Plus(p, q, C1), CSymbol, e, f, p, CN4, a, c)),
                                          x),
                                      Times(
                                          Plus(
                                              Times(p, c, e, Subtract(
                                                  Times(CSymbol, c, e, Plus(q, C1)),
                                                  Times(
                                                      c,
                                                      Subtract(Times(CSymbol, e),
                                                          Times(BSymbol, f)),
                                                      Plus(Times(C2, p), Times(C2, q), C3)))),
                                              Times(Plus(p, q, C1),
                                                  Subtract(
                                                      Times(CSymbol, Sqr(
                                                          f), p, CN4, a, c),
                                                      Times(Sqr(c),
                                                          Plus(
                                                              Times(CSymbol,
                                                                  Subtract(Sqr(e), Times(C4, d, f)),
                                                                  Plus(Times(C2, p), q, C2)),
                                                              Times(f,
                                                                  Plus(Times(C2, CSymbol, d),
                                                                      Times(CN1, BSymbol, e),
                                                                      Times(C2, ASymbol, f)),
                                                                  Plus(Times(C2, p), Times(C2, q),
                                                                      C3))))))),
                                          Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e, f, ASymbol, BSymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0), GtQ(p, C0), NeQ(Plus(p, q, C1), C0),
                  NeQ(Plus(Times(C2, p), Times(C2,
                      q), C3), C0),
                  Not(IGtQ(p, C0)), Not(IGtQ(q, C0))))),
      IIntegrate(1069,
          Integrate(Times(Power(Plus(a_, Times(c_DEFAULT, Sqr(x_))), p_),
              Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(x_))), Power(Plus(d_, Times(e_DEFAULT, x_),
                  Times(f_DEFAULT, Sqr(x_))), q_)),
              x_Symbol),
          Condition(
              Subtract(
                  Simp(
                      Times(Plus(Times(CSymbol, CN1, c, e, Plus(Times(C2, p), q, C2)), Times(C2, c,
                          CSymbol, f, Plus(p, q, C1), x)), Power(
                              Plus(a, Times(c, Sqr(x))), p),
                          Power(
                              Plus(d, Times(e, x), Times(f, Sqr(x))), Plus(q, C1)),
                          Power(Times(C2, c, Sqr(f), Plus(p, q, C1), Plus(Times(C2, p),
                              Times(C2, q), C3)), CN1)),
                      x),
                  Dist(
                      Power(
                          Times(C2, c, Sqr(f), Plus(p, q, C1),
                              Plus(Times(C2, p), Times(C2, q), C3)),
                          CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(c, Sqr(x))), Subtract(p, C1)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), q),
                              Simp(
                                  Plus(
                                      Times(p, CN1, a, e, Subtract(Times(CSymbol, c, e, Plus(q,
                                          C1)), Times(c, CSymbol, e,
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(Plus(p, q, C1), a, c, Plus(Times(CSymbol, Subtract(
                                          Times(C2, d, f), Times(Sqr(e), Plus(Times(C2, p), q,
                                              C2)))),
                                          Times(f, CN2, ASymbol, f,
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(
                                          Plus(
                                              Times(
                                                  C2, p, Subtract(Times(c, d), Times(a, f)),
                                                  Subtract(Times(CSymbol, c, e, Plus(q, C1)),
                                                      Times(c, CSymbol, e,
                                                          Plus(Times(C2, p), Times(C2, q), C3)))),
                                              Times(Plus(p, q, C1), CSymbol, e, f, p, CN4, a, c)),
                                          x),
                                      Times(
                                          Plus(
                                              Times(p, c, e,
                                                  Subtract(Times(CSymbol, c, e, Plus(q, C1)), Times(
                                                      c, CSymbol, e,
                                                      Plus(Times(C2, p), Times(C2, q), C3)))),
                                              Times(Plus(p, q, C1),
                                                  Subtract(
                                                      Times(CSymbol, Sqr(
                                                          f), p, CN4, a, c),
                                                      Times(Sqr(c),
                                                          Plus(
                                                              Times(CSymbol,
                                                                  Subtract(Sqr(e), Times(C4, d, f)),
                                                                  Plus(Times(C2, p), q, C2)),
                                                              Times(f,
                                                                  Plus(Times(C2, CSymbol, d),
                                                                      Times(C2, ASymbol, f)),
                                                                  Plus(Times(C2, p), Times(C2, q),
                                                                      C3))))))),
                                          Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e, f, ASymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0), GtQ(p, C0), NeQ(Plus(p, q, C1), C0),
                  NeQ(Plus(Times(C2, p), Times(C2, q), C3),
                      C0),
                  Not(IGtQ(p, C0)), Not(IGtQ(q, C0))))),
      IIntegrate(1070,
          Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
              Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))),
              Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), q_)), x_Symbol),
          Condition(
              Subtract(
                  Simp(Times(Plus(Times(BSymbol, c, f,
                      Plus(Times(C2, p), Times(C2, q), C3)), Times(CSymbol, b, f, p),
                      Times(C2, c, CSymbol, f, Plus(p, q, C1), x)),
                      Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p),
                      Power(Plus(d, Times(f, Sqr(x))), Plus(q, C1)), Power(Times(
                          C2, c, Sqr(f), Plus(p, q, C1), Plus(Times(C2, p), Times(C2, q), C3)),
                          CN1)),
                      x),
                  Dist(
                      Power(Times(C2, c, Sqr(f), Plus(p, q, C1),
                          Plus(Times(C2, p), Times(C2, q), C3)), CN1),
                      Integrate(
                          Times(Power(Plus(a, Times(b, x), Times(c, Sqr(x))), Subtract(p, C1)),
                              Power(Plus(d, Times(f, Sqr(x))), q),
                              Simp(Plus(
                                  Times(p, b, d,
                                      Subtract(Times(CSymbol, CN1, b, f, Plus(q, C1)),
                                          Times(c, CN1, BSymbol, f,
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                  Times(Plus(p, q, C1),
                                      Plus(Times(Sqr(b), CSymbol, d, f, p),
                                          Times(a, c, Plus(
                                              Times(CSymbol, C2, d, f), Times(f, CN2, ASymbol, f,
                                                  Plus(Times(C2, p), Times(C2, q), C3)))))),
                                  Times(Plus(
                                      Times(C2, p, Subtract(Times(c, d), Times(a, f)), Subtract(
                                          Times(CSymbol, CN1, b, f, Plus(q, C1)),
                                          Times(c, CN1, BSymbol, f,
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(Plus(p, q, C1), CN1, b, c,
                                          Plus(Times(CSymbol, CN4, d, f, Plus(Times(C2, p), q, C2)),
                                              Times(f,
                                                  Plus(Times(C2, CSymbol, d),
                                                      Times(C2, ASymbol, f)),
                                                  Plus(Times(C2, p), Times(C2, q), C3))))),
                                      x),
                                  Times(Plus(Times(
                                      p, CN1, b, f,
                                      Subtract(Times(CSymbol, CN1, b, f, Plus(
                                          q, C1)), Times(c, CN1, BSymbol, f,
                                              Plus(Times(C2, p), Times(C2, q), C3)))),
                                      Times(Plus(p, q, C1), Subtract(
                                          Times(CSymbol, Sqr(f), p,
                                              Subtract(Sqr(b), Times(C4, a, c))),
                                          Times(Sqr(c), Plus(
                                              Times(CSymbol, CN4, d, f, Plus(Times(C2, p), q, C2)),
                                              Times(f,
                                                  Plus(Times(C2, CSymbol, d),
                                                      Times(C2, ASymbol, f)),
                                                  Plus(Times(C2, p), Times(C2, q), C3))))))),
                                      Sqr(x))),
                                  x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, f, ASymbol, BSymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), GtQ(p, C0), NeQ(Plus(p, q, C1), C0),
                  NeQ(Plus(Times(C2, p), Times(C2, q), C3), C0), Not(IGtQ(p, C0)),
                  Not(IGtQ(q, C0))))),
      IIntegrate(1071,
          Integrate(Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), p_),
              Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(x_))),
              Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), q_)), x_Symbol),
          Condition(
              Subtract(Simp(Times(Plus(Times(CSymbol, b, f, p), Times(C2, c, CSymbol, f, Plus(p, q,
                  C1), x)), Power(Plus(a, Times(b, x), Times(c, Sqr(x))), p), Power(Plus(d,
                      Times(f, Sqr(x))), Plus(q, C1)),
                  Power(
                      Times(C2, c, Sqr(f), Plus(p, q, C1), Plus(Times(C2, p), Times(C2, q), C3)),
                      CN1)),
                  x),
                  Dist(
                      Power(Times(C2, c, Sqr(f), Plus(p, q, C1),
                          Plus(Times(C2, p), Times(C2, q), C3)), CN1),
                      Integrate(Times(Power(Plus(a, Times(b, x), Times(c, Sqr(
                          x))), Subtract(p, C1)), Power(Plus(d, Times(f, Sqr(x))), q), Simp(Plus(
                              Times(p, b, d, CSymbol, CN1, b, f, Plus(q, C1)),
                              Times(Plus(p, q, C1), Plus(Times(Sqr(b), CSymbol, d, f, p),
                                  Times(a, c, Plus(Times(CSymbol, C2, d, f),
                                      Times(f, CN2, ASymbol, f,
                                          Plus(Times(C2, p), Times(C2, q), C3)))))),
                              Times(Plus(Times(C2, p, Subtract(Times(c, d), Times(a, f)), CSymbol,
                                  CN1, b, f, Plus(q, C1)),
                                  Times(Plus(p, q, C1), CN1, b, c,
                                      Plus(Times(CSymbol, CN4, d, f, Plus(Times(C2, p), q, C2)),
                                          Times(f,
                                              Plus(Times(C2, CSymbol, d), Times(C2, ASymbol, f)),
                                              Plus(Times(C2, p), Times(C2, q), C3))))),
                                  x),
                              Times(
                                  Plus(Times(p, CN1, b, f, CSymbol, CN1, b, f, Plus(q, C1)),
                                      Times(Plus(p, q, C1), Subtract(
                                          Times(CSymbol, Sqr(f), p,
                                              Subtract(Sqr(b), Times(C4, a, c))),
                                          Times(Sqr(c), Plus(
                                              Times(CSymbol, CN4, d, f, Plus(Times(C2, p), q, C2)),
                                              Times(f,
                                                  Plus(Times(C2, CSymbol, d),
                                                      Times(C2, ASymbol, f)),
                                                  Plus(Times(C2, p), Times(C2, q), C3))))))),
                                  Sqr(x))),
                              x)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, f, ASymbol, CSymbol, q), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0), GtQ(p, C0), NeQ(Plus(p, q, C1), C0),
                  NeQ(Plus(Times(C2, p), Times(C2, q), C3), C0), Not(IGtQ(p, C0)),
                  Not(IGtQ(q, C0))))),
      IIntegrate(1072,
          Integrate(
              Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT,
                      Sqr(x_))),
                  Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1)),
              x_Symbol),
          Condition(
              With(
                  List(Set(q,
                      Plus(Times(Sqr(c), Sqr(d)), Times(CN1, b, c, d,
                          e), Times(a, c, Sqr(e)), Times(Sqr(b), d, f), Times(CN1, C2, a, c, d, f),
                          Times(CN1, a, b, e, f), Times(Sqr(a), Sqr(f))))),
                  Condition(
                      Plus(
                          Dist(Power(q, CN1), Integrate(Times(
                              Plus(Times(ASymbol, Sqr(c), d), Times(CN1, a, c, CSymbol, d),
                                  Times(CN1, ASymbol, b, c, e), Times(a, BSymbol, c, e),
                                  Times(ASymbol, Sqr(b), f), Times(CN1, a, b, BSymbol, f),
                                  Times(CN1, a, ASymbol, c, f), Times(Sqr(a), CSymbol, f),
                                  Times(c,
                                      Subtract(Plus(Times(BSymbol, c, d), Times(CN1, b, CSymbol, d),
                                          Times(CN1, ASymbol, c, e), Times(a, CSymbol, e),
                                          Times(ASymbol, b, f)), Times(a, BSymbol, f)),
                                      x)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)), x), x),
                          Dist(Power(q, CN1), Integrate(Times(
                              Subtract(
                                  Plus(Times(c, CSymbol, Sqr(d)), Times(CN1, BSymbol, c, d, e),
                                      Times(ASymbol, c, Sqr(e)), Times(b, BSymbol, d, f), Times(CN1,
                                          ASymbol, c, d, f),
                                      Times(CN1, a, CSymbol, d, f), Times(CN1, ASymbol, b, e, f),
                                      Times(a, ASymbol, Sqr(f))),
                                  Times(f,
                                      Subtract(Plus(Times(BSymbol, c, d), Times(CN1, b, CSymbol, d),
                                          Times(CN1, ASymbol, c, e), Times(a, CSymbol, e),
                                          Times(ASymbol, b, f)), Times(a, BSymbol, f)),
                                      x)),
                              Power(Plus(d, Times(e, x), Times(f, Sqr(x))), CN1)), x), x)),
                      NeQ(q, C0))),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0)))),
      IIntegrate(1073,
          Integrate(
              Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(C_DEFAULT,
                      Sqr(x_))),
                  Power(Plus(d_, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1)),
              x_Symbol),
          Condition(With(
              List(Set(
                  q,
                  Plus(
                      Times(Sqr(c), Sqr(d)), Times(CN1, b, c, d, e), Times(a, c, Sqr(e)),
                      Times(Sqr(
                          b), d, f),
                      Times(CN1, C2, a, c, d, f), Times(CN1, a, b, e, f), Times(Sqr(a), Sqr(f))))),
              Condition(Plus(
                  Dist(Power(q, CN1),
                      Integrate(Times(
                          Plus(Times(ASymbol, Sqr(c), d), Times(CN1, a, c, CSymbol, d),
                              Times(CN1, ASymbol, b, c, e), Times(ASymbol, Sqr(b), f),
                              Times(CN1, a, ASymbol, c, f), Times(Sqr(a), CSymbol, f),
                              Times(c,
                                  Plus(Times(CN1, b, CSymbol, d), Times(CN1, ASymbol, c, e),
                                      Times(a, CSymbol, e), Times(ASymbol, b, f)),
                                  x)),
                          Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)), x),
                      x),
                  Dist(Power(q, CN1),
                      Integrate(Times(
                          Subtract(
                              Plus(Times(c, CSymbol, Sqr(d)), Times(ASymbol, c, Sqr(e)),
                                  Times(CN1, ASymbol, c, d, f), Times(CN1, a, CSymbol, d, f),
                                  Times(CN1, ASymbol, b, e, f), Times(a, ASymbol, Sqr(f))),
                              Times(f,
                                  Plus(Times(CN1, b, CSymbol, d), Times(CN1, ASymbol, c, e),
                                      Times(a, CSymbol, e), Times(ASymbol, b, f)),
                                  x)),
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), CN1)), x),
                      x)),
                  NeQ(q, C0))),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0)))),
      IIntegrate(1074,
          Integrate(
              Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(x_))), Power(
                      Plus(d_, Times(f_DEFAULT, Sqr(x_))), CN1)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(q,
                          Plus(Times(Sqr(c), Sqr(d)), Times(Sqr(b), d, f),
                              Times(CN1, C2, a, c, d, f), Times(Sqr(a), Sqr(f))))),
                  Condition(
                      Plus(
                          Dist(Power(q, CN1),
                              Integrate(Times(Plus(Times(ASymbol, Sqr(c), d),
                                  Times(CN1, a, c, CSymbol, d), Times(ASymbol, Sqr(b), f),
                                  Times(CN1, a, b, BSymbol, f), Times(CN1, a, ASymbol, c, f),
                                  Times(Sqr(a), CSymbol, f),
                                  Times(c, Subtract(
                                      Plus(Times(BSymbol, c, d), Times(CN1, b, CSymbol, d),
                                          Times(ASymbol, b, f)),
                                      Times(a, BSymbol, f)), x)),
                                  Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)), x),
                              x),
                          Dist(Power(q, CN1), Integrate(Times(
                              Subtract(Plus(Times(c, CSymbol, Sqr(d)), Times(b, BSymbol, d, f),
                                  Times(CN1, ASymbol, c, d, f), Times(CN1, a, CSymbol, d, f),
                                  Times(a, ASymbol, Sqr(f))),
                                  Times(f,
                                      Subtract(Plus(Times(BSymbol, c, d), Times(CN1, b, CSymbol, d),
                                          Times(ASymbol, b, f)), Times(a, BSymbol, f)),
                                      x)),
                              Power(Plus(d, Times(f, Sqr(x))), CN1)), x), x)),
                      NeQ(q, C0))),
              And(FreeQ(List(a, b, c, d, f, ASymbol, BSymbol,
                  CSymbol), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                      C0)))),
      IIntegrate(1075,
          Integrate(
              Times(
                  Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT,
                      Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(x_))),
                  Power(Plus(d_, Times(f_DEFAULT, Sqr(x_))), CN1)),
              x_Symbol),
          Condition(
              With(
                  List(
                      Set(q,
                          Plus(
                              Times(Sqr(c), Sqr(d)), Times(Sqr(b), d, f), Times(CN1, C2, a, c, d,
                                  f),
                              Times(Sqr(a), Sqr(f))))),
                  Condition(
                      Plus(
                          Dist(Power(q, CN1), Integrate(Times(Plus(Times(ASymbol, Sqr(c), d),
                              Times(CN1, a, c, CSymbol, d), Times(ASymbol, Sqr(b), f),
                              Times(CN1, a, ASymbol, c, f), Times(Sqr(a), CSymbol,
                                  f),
                              Times(c, Plus(Times(CN1, b, CSymbol, d), Times(ASymbol, b, f)), x)),
                              Power(Plus(a, Times(b, x), Times(c, Sqr(x))), CN1)), x), x),
                          Dist(Power(q, CN1), Integrate(Times(Subtract(
                              Plus(Times(c, CSymbol, Sqr(d)), Times(CN1, ASymbol, c, d, f),
                                  Times(CN1, a, CSymbol, d, f), Times(a, ASymbol, Sqr(f))),
                              Times(f, Plus(Times(CN1, b, CSymbol, d), Times(ASymbol, b, f)), x)),
                              Power(Plus(d, Times(f, Sqr(x))), CN1)), x), x)),
                      NeQ(q, C0))),
              And(FreeQ(List(a, b, c, d, f, ASymbol,
                  CSymbol), x), NeQ(Subtract(Sqr(b), Times(C4, a, c)),
                      C0)))),
      IIntegrate(1076,
          Integrate(
              Times(
                  Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT,
                      Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(
                      x_))),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Plus(
                  Dist(
                      Times(CSymbol, Power(c,
                          CN1)),
                      Integrate(Power(Plus(d, Times(e, x), Times(f, Sqr(x))), CN1D2), x), x),
                  Dist(Power(c, CN1),
                      Integrate(Times(
                          Plus(Times(ASymbol, c), Times(CN1, a, CSymbol),
                              Times(Subtract(Times(BSymbol, c), Times(b, CSymbol)), x)),
                          Power(Times(Plus(a, Times(b, x), Times(c, Sqr(x))),
                              Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, BSymbol, CSymbol), x),
                  NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0)))),
      IIntegrate(1077,
          Integrate(
              Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(
                      x_))),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(Plus(
              Dist(Times(CSymbol, Power(c, CN1)),
                  Integrate(Power(Plus(d, Times(e, x), Times(f, Sqr(x))), CN1D2), x), x),
              Dist(Power(c, CN1), Integrate(Times(
                  Subtract(Subtract(Times(ASymbol, c), Times(a, CSymbol)), Times(b, CSymbol, x)),
                  Power(Times(Plus(a, Times(b, x), Times(c, Sqr(x))),
                      Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))), CN1)),
                  x), x)),
              And(FreeQ(List(a, b, c, d, e, f, ASymbol, CSymbol), x),
                  NeQ(Subtract(Sqr(b),
                      Times(C4, a, c)), C0),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0)))),
      IIntegrate(1078,
          Integrate(
              Times(
                  Power(Plus(a_, Times(c_DEFAULT,
                      Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT, Sqr(
                      x_))),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Plus(
                  Dist(
                      Times(CSymbol, Power(c, CN1)), Integrate(
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), CN1D2), x),
                      x),
                  Dist(Power(c, CN1),
                      Integrate(
                          Times(
                              Plus(Times(ASymbol, c), Times(CN1, a, CSymbol), Times(BSymbol, c, x)),
                              Power(
                                  Times(Plus(a, Times(c, Sqr(x))),
                                      Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))),
                                  CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e, f, ASymbol, BSymbol, CSymbol), x),
                  NeQ(Subtract(Sqr(e), Times(C4, d, f)), C0)))),
      IIntegrate(1079,
          Integrate(
              Times(
                  Power(Plus(a_, Times(c_DEFAULT,
                      Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(C_DEFAULT, Sqr(
                      x_))),
                  Power(Plus(d_DEFAULT, Times(e_DEFAULT, x_), Times(f_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Plus(
                  Dist(
                      Times(CSymbol, Power(c, CN1)), Integrate(
                          Power(Plus(d, Times(e, x), Times(f, Sqr(x))), CN1D2), x),
                      x),
                  Dist(Times(Subtract(Times(ASymbol, c), Times(a, CSymbol)), Power(c, CN1)),
                      Integrate(
                          Power(
                              Times(Plus(a, Times(c, Sqr(x))),
                                  Sqrt(Plus(d, Times(e, x), Times(f, Sqr(x))))),
                              CN1),
                          x),
                      x)),
              And(FreeQ(List(a, c, d, e, f, ASymbol,
                  CSymbol), x), NeQ(Subtract(Sqr(e), Times(C4, d, f)),
                      C0)))),
      IIntegrate(1080,
          Integrate(
              Times(Power(Plus(a_, Times(b_DEFAULT, x_), Times(c_DEFAULT, Sqr(x_))), CN1),
                  Plus(A_DEFAULT, Times(B_DEFAULT, x_), Times(C_DEFAULT,
                      Sqr(x_))),
                  Power(Plus(d_DEFAULT, Times(f_DEFAULT, Sqr(x_))), CN1D2)),
              x_Symbol),
          Condition(
              Plus(Dist(Times(CSymbol, Power(c, CN1)),
                  Integrate(Power(Plus(d, Times(f, Sqr(x))), CN1D2), x), x),
                  Dist(Power(c, CN1),
                      Integrate(Times(
                          Plus(Times(ASymbol, c), Times(CN1, a, CSymbol),
                              Times(Subtract(Times(BSymbol, c), Times(b, CSymbol)), x)),
                          Power(Times(Plus(a, Times(b, x), Times(c, Sqr(x))),
                              Sqrt(Plus(d, Times(f, Sqr(x))))), CN1)),
                          x),
                      x)),
              And(FreeQ(List(a, b, c, d, f, ASymbol, BSymbol, CSymbol), x),
                  NeQ(Subtract(Sqr(b), Times(C4, a, c)), C0)))));
}
