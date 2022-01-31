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
public interface ArcCoshRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
   * </ul>
   */
  final public static int[] SIZES = {15, 0};

  final public static IAST RULES = List(IInit(ArcCosh, SIZES),
      // ArcCosh(Undefined)=Undefined
      ISet(ArcCosh(Undefined), Undefined),
      // ArcCosh(0)=I*Pi/2
      ISet(ArcCosh(C0), Times(CC(0L, 1L, 1L, 2L), Pi)),
      // ArcCosh(1/2)=I*Pi/3
      ISet(ArcCosh(C1D2), Times(CC(0L, 1L, 1L, 3L), Pi)),
      // ArcCosh(-1/2)=2/3*I*Pi
      ISet(ArcCosh(CN1D2), Times(CC(0L, 1L, 2L, 3L), Pi)),
      // ArcCosh(1/Sqrt(2))=1/4*I*Pi
      ISet(ArcCosh(C1DSqrt2), Times(CC(0L, 1L, 1L, 4L), Pi)),
      // ArcCosh(-1/Sqrt(2))=3/4*I*Pi
      ISet(ArcCosh(Negate(C1DSqrt2)), Times(CC(0L, 1L, 3L, 4L), Pi)),
      // ArcCosh(Sqrt(3)/2)=1/6*I*Pi
      ISet(ArcCosh(Times(C1D2, CSqrt3)), Times(CC(0L, 1L, 1L, 6L), Pi)),
      // ArcCosh(-Sqrt(3)/2)=5/6*I*Pi
      ISet(ArcCosh(Times(CN1D2, CSqrt3)), Times(CC(0L, 1L, 5L, 6L), Pi)),
      // ArcCosh(1)=0
      ISet(ArcCosh(C1), C0),
      // ArcCosh(-1)=Pi*I
      ISet(ArcCosh(CN1), Times(CI, Pi)),
      // ArcCosh(Infinity)=Infinity
      ISet(ArcCosh(oo), oo),
      // ArcCosh(-Infinity)=Infinity
      ISet(ArcCosh(Noo), oo),
      // ArcCosh(I*Infinity)=Infinity
      ISet(ArcCosh(DirectedInfinity(CI)), oo),
      // ArcCosh(-I*Infinity)=Infinity
      ISet(ArcCosh(DirectedInfinity(CNI)), oo),
      // ArcCosh(ComplexInfinity)=Infinity
      ISet(ArcCosh(CComplexInfinity), oo));
}
