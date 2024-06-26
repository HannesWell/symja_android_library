package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public class StandardDeviationRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 1, 1 };

  final public static IAST RULES = List(
    IInit(StandardDeviation, SIZES),
    // StandardDeviation(NormalDistribution())=1
    ISet(StandardDeviation(NormalDistribution()),
      C1, true),
    // StandardDeviation(NormalDistribution(m_,s_)):=s
    ISetDelayed(StandardDeviation(NormalDistribution(m_,s_)),
      s)
  );
}
