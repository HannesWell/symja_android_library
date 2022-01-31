package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.
 * </p>
 * <p>
 * See GIT repository at:
 * <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library
 * under the tools directory</a>.
 * </p>
 */
public interface KleinInvariantJRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
   * </ul>
   */
  final public static int[] SIZES = {14, 0};

  final public static IAST RULES = List(IInit(KleinInvariantJ, SIZES),
      // KleinInvariantJ(1/2*(-1+I*Sqrt(3)))=1
      ISet(KleinInvariantJ(Times(C1D2, Plus(CN1, Times(CI, CSqrt3)))), C1),
      // KleinInvariantJ(1/2*(1+I*Sqrt(3)))=0
      ISet(KleinInvariantJ(Times(C1D2, Plus(C1, Times(CI, CSqrt3)))), C0),
      // KleinInvariantJ(1/2*(1+I*Sqrt(7)))=-125/64
      ISet(KleinInvariantJ(Times(C1D2, Plus(C1, Times(CI, CSqrt7)))), QQ(-125L, 64L)),
      // KleinInvariantJ(1/2*(1+I*Sqrt(11)))=-512/27
      ISet(KleinInvariantJ(Times(C1D2, Plus(C1, Times(CI, Sqrt(ZZ(11L)))))), QQ(-512L, 27L)),
      // KleinInvariantJ(1/2*(1+I*Sqrt(19)))=-512
      ISet(KleinInvariantJ(Times(C1D2, Plus(C1, Times(CI, Sqrt(ZZ(19L)))))), ZZ(-512L)),
      // KleinInvariantJ(1/2*(1+I*3*Sqrt(3)))=-64000/9
      ISet(KleinInvariantJ(Times(C1D2, Plus(C1, Times(CC(0L, 1L, 3L, 1L), CSqrt3)))),
          QQ(-64000L, 9L)),
      // KleinInvariantJ(1/2*(1+I*Sqrt(43)))=-512000
      ISet(KleinInvariantJ(Times(C1D2, Plus(C1, Times(CI, Sqrt(ZZ(43L)))))), ZZ(-512000L)),
      // KleinInvariantJ(1/2*(1+I*Sqrt(67)))=-85184000
      ISet(KleinInvariantJ(Times(C1D2, Plus(C1, Times(CI, Sqrt(ZZ(67L)))))), ZZ(-85184000L)),
      // KleinInvariantJ(1/2*(1+I*Sqrt(163)))=-151931373056000
      ISet(KleinInvariantJ(Times(C1D2, Plus(C1, Times(CI, Sqrt(ZZ(163L)))))),
          ZZ("-151931373056000", 10)),
      // KleinInvariantJ(1/2+I*1/2*Sqrt(3))=0
      ISet(KleinInvariantJ(Plus(C1D2, Times(CC(0L, 1L, 1L, 2L), CSqrt3))), C0),
      // KleinInvariantJ(-1/2+I*1/2*Sqrt(3))=0
      ISet(KleinInvariantJ(Plus(CN1D2, Times(CC(0L, 1L, 1L, 2L), CSqrt3))), C0),
      // KleinInvariantJ(1/2+I*1/2*Sqrt(3))=0
      ISet(KleinInvariantJ(Plus(C1D2, Times(CC(0L, 1L, 1L, 2L), CSqrt3))), C0),
      // KleinInvariantJ(-1/2+I*1/2*Sqrt(3))=0
      ISet(KleinInvariantJ(Plus(CN1D2, Times(CC(0L, 1L, 1L, 2L), CSqrt3))), C0),
      // KleinInvariantJ(I*Infinity)=Infinity
      ISet(KleinInvariantJ(DirectedInfinity(CI)), oo));
}
