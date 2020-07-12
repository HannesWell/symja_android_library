package org.matheclipse.core.mathcell;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.eval.exception.SymjaMathException;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.parser.client.SyntaxError;

public class ParametricPlotExample extends BasePlotExample {

	@Override
	public String exampleFunction() {
		return "ParametricPlot({{2*Cos(t), 2*Sin(t)}, {2*Cos(t), Sin(t)}, {Cos(t), 2*Sin(t)}, {Cos(t), Sin(t)}}, {t, 0, 2 Pi}, PlotLegends -> \"Expressions\")";
		// return "ParametricPlot({Sin(t), Cos(t^2)}, {t, 0, 2*Pi})";
	}

	public static void main(String[] args) {
		ParametricPlotExample p = new ParametricPlotExample();
		p.generateHTML();
	}

}
