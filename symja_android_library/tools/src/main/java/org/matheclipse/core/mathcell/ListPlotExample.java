package org.matheclipse.core.mathcell;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.eval.exception.SymjaMathException;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.parser.client.SyntaxError;

public class ListPlotExample extends BasePlotExample {

	@Override
	public String exampleFunction() {
		// return "ListPlot({{3.0,1.0},{67.0,1.0},{163.0,1.0}})";
		// return "ListPlot(Table({Sin(t*0.33), Cos(t*1.1)}, {t, 100}))";
		// return "ListPlot({3,Sin(1),Pi,3/4,42,1.2})";
		  return "ListPlot(Prime(Range(25)))";
		// return "ListPlot(Table({Sin(t), Cos(t)}, {t, 100}))";
		// return "Manipulate(ListPlot(Table({Sin(t*b), Cos(t*a)}, {t, 100})), {a,1,4,1}, {b,1,12})";
		// return "ListPlot(<|2 -> 1, 3 -> 2, 5 -> 3, 7 -> 4, 11 -> 5, 13 -> 6|>)";
/*
		return "ListPlot(FindClusters({{ 83.08303244924173, 58.83387754182331 },\n" + //
				"{ 45.05445510940626, 23.469642649637535 },\n" + //
				"{ 14.96417921432294, 69.0264096390456 },\n" + //
				"{ 73.53189604333602, 34.896145021310076 },\n" + //
				"{ 73.28498173551634, 33.96860806993209 },\n" + //
				"{ 73.45828098873608, 33.92584423092194 },\n" + //
				"{ 73.9657889183145, 35.73191006924026 },\n" + //
				"{ 74.0074097183533, 36.81735596177168 },\n" + //
				"{ 73.41247541410848, 34.27314856695011 },\n" + //
				"{ 73.9156256353017, 36.83206791547127 },\n" + //
				"{ 74.81499205809087, 37.15682749846019 },\n" + //
				"{ 74.03144880081527, 37.57399178552441 },\n" + //
				"{ 74.51870941207744, 38.674258946906775 },\n" + //
				"{ 74.50754595105536, 35.58903978415765 },\n" + //
				"{ 74.51322752749547, 36.030572259100154 },\n" + //
				"{ 59.27900996617973, 46.41091720294207 },\n" + //
				"{ 59.73744793841615, 46.20015558367595 },\n" + //
				"{ 58.81134076672606, 45.71150126331486 },\n" + //
				"{ 58.52225539437495, 47.416083617601544 },\n" + //
				"{ 58.218626647023484, 47.36228902172297 },\n" + //
				"{ 60.27139669447206, 46.606106348801404 },\n" + //
				"{ 60.894962462363765, 46.976924697402865 },\n" + //
				"{ 62.29048673878424, 47.66970563563518 },\n" + //
				"{ 61.03857608977705, 46.212924720020965 },\n" + //
				"{ 60.16916214139201, 45.18193661351688 },\n" + //
				"{ 59.90036905976012, 47.555364347063005 },\n" + //
				"{ 62.33003634144552, 47.83941489877179 },\n" + //
				"{ 57.86035536718555, 47.31117930193432 },\n" + //
				"{ 58.13715479685925, 48.985960494028404 },\n" + //
				"{ 56.131923963548616, 46.8508904252667 },\n" + //
				"{ 55.976329887053, 47.46384037658572 },\n" + //
				"{ 56.23245975235477, 47.940035191131756 },\n" + //
				"{ 58.51687048212625, 46.622885352699086 },\n" + //
				"{ 57.85411081905477, 45.95394361577928 },\n" + //
				"{ 56.445776311447844, 45.162093662656844 },\n" + //
				"{ 57.36691949656233, 47.50097194337286 },\n" + //
				"{ 58.243626387557015, 46.114052729681134 },\n" + //
				"{ 56.27224595635198, 44.799080066150054 },\n" + //
				"{ 57.606924816500396, 46.94291057763621 },\n" + //
				"{ 30.18714230041951, 13.877149710431695 },\n" + //
				"{ 30.449448810657486, 13.490778346545994 },\n" + //
				"{ 30.295018390286714, 13.264889000216499 },\n" + //
				"{ 30.160201832884923, 11.89278262341395 },\n" + //
				"{ 31.341509791789576, 15.282655921997502 },\n" + //
				"{ 31.68601630325429, 14.756873246748 },\n" + //
				"{ 29.325963742565364, 12.097849250072613 },\n" + //
				"{ 29.54820742388256, 13.613295356975868 },\n" + //
				"{ 28.79359608888626, 10.36352064087987 },\n" + //
				"{ 31.01284597092308, 12.788479208014905 },\n" + //
				"{ 27.58509216737002, 11.47570110601373 },\n" + //
				"{ 28.593799561727792, 10.780998203903437 },\n" + //
				"{ 31.356105766724795, 15.080316198524088 },\n" + //
				"{ 31.25948503636755, 13.674329151166603 },\n" + //
				"{ 32.31590076372959, 14.95261758659035 },\n" + //
				"{ 30.460413702763617, 15.88402809202671 },\n" + //
				"{ 32.56178203062154, 14.586076852632686 },\n" + //
				"{ 32.76138648530468, 16.239837325178087 },\n" + //
				"{ 30.1829453331884, 14.709592407103628 },\n" + //
				"{ 29.55088173528202, 15.0651247180067 },\n" + //
				"{ 29.004155302187428, 14.089665298582986 },\n" + //
				"{ 29.339624439831823, 13.29096065578051 },\n" + //
				"{ 30.997460327576846, 14.551914158277214 },\n" + //
				"{ 30.66784126125276, 16.269703107886016 }},2.0,5,Method->\"DBSCAN\"))";
*/
	}

	public static void main(String[] args) {
		ListPlotExample p = new ListPlotExample();
		p.generateHTML();
	}

}
