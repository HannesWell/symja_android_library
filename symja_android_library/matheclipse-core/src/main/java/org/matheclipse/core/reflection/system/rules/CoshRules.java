package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface CoshRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 27, 9 };

  final public static IAST RULES = List(
    IInit(Cosh, SIZES),
    // Cosh(Undefined)=Undefined
    ISet(Cosh(Undefined),
      Undefined),
    // Cosh(0)=1
    ISet(Cosh(C0),
      C1),
    // Cosh(I*1/6*Pi)=Sqrt(3)/2
    ISet(Cosh(Times(CC(0L,1L,1L,6L),Pi)),
      Times(C1D2,CSqrt3)),
    // Cosh(I*1/5*Pi)=1/4*(Sqrt(5)+1)
    ISet(Cosh(Times(CC(0L,1L,1L,5L),Pi)),
      Times(C1D4,Plus(C1,CSqrt5))),
    // Cosh(I*1/4*Pi)=1/Sqrt(2)
    ISet(Cosh(Times(CC(0L,1L,1L,4L),Pi)),
      C1DSqrt2),
    // Cosh(I*1/3*Pi)=1/2
    ISet(Cosh(Times(CC(0L,1L,1L,3L),Pi)),
      C1D2),
    // Cosh(I*2/5*Pi)=1/4*(-1+Sqrt(5))
    ISet(Cosh(Times(CC(0L,1L,2L,5L),Pi)),
      Times(C1D4,Plus(CN1,CSqrt5))),
    // Cosh(I*1/2*Pi)=0
    ISet(Cosh(Times(CC(0L,1L,1L,2L),Pi)),
      C0),
    // Cosh(I*3/5*Pi)=-(-1+Sqrt(5))/4
    ISet(Cosh(Times(CC(0L,1L,3L,5L),Pi)),
      Times(C1D4,Subtract(C1,CSqrt5))),
    // Cosh(I*2/3*Pi)=-1/2
    ISet(Cosh(Times(CC(0L,1L,2L,3L),Pi)),
      CN1D2),
    // Cosh(I*3/4*Pi)=-1/Sqrt(2)
    ISet(Cosh(Times(CC(0L,1L,3L,4L),Pi)),
      Negate(C1DSqrt2)),
    // Cosh(I*4/5*Pi)=-(Sqrt(5)+1)/4
    ISet(Cosh(Times(CC(0L,1L,4L,5L),Pi)),
      Times(C1D4,Subtract(CN1,CSqrt5))),
    // Cosh(I*5/6*Pi)=-Sqrt(3)/2
    ISet(Cosh(Times(CC(0L,1L,5L,6L),Pi)),
      Times(CN1D2,CSqrt3)),
    // Cosh(I*Pi)=-1
    ISet(Cosh(Times(CI,Pi)),
      CN1),
    // Cosh(I*7/6*Pi)=-Sqrt(3)/2
    ISet(Cosh(Times(CC(0L,1L,7L,6L),Pi)),
      Times(CN1D2,CSqrt3)),
    // Cosh(I*6/5*Pi)=-(Sqrt(5)+1)/4
    ISet(Cosh(Times(CC(0L,1L,6L,5L),Pi)),
      Times(C1D4,Subtract(CN1,CSqrt5))),
    // Cosh(I*5/4*Pi)=-1/Sqrt(2)
    ISet(Cosh(Times(CC(0L,1L,5L,4L),Pi)),
      Negate(C1DSqrt2)),
    // Cosh(I*4/3*Pi)=-1/2
    ISet(Cosh(Times(CC(0L,1L,4L,3L),Pi)),
      CN1D2),
    // Cosh(I*7/5*Pi)=-(-1+Sqrt(5))/4
    ISet(Cosh(Times(CC(0L,1L,7L,5L),Pi)),
      Times(C1D4,Subtract(C1,CSqrt5))),
    // Cosh(I*8/5*Pi)=1/4*(-1+Sqrt(5))
    ISet(Cosh(Times(CC(0L,1L,8L,5L),Pi)),
      Times(C1D4,Plus(CN1,CSqrt5))),
    // Cosh(I*5/3*Pi)=1/2
    ISet(Cosh(Times(CC(0L,1L,5L,3L),Pi)),
      C1D2),
    // Cosh(I*7/4*Pi)=1/Sqrt(2)
    ISet(Cosh(Times(CC(0L,1L,7L,4L),Pi)),
      C1DSqrt2),
    // Cosh(I*9/5*Pi)=1/4*(Sqrt(5)+1)
    ISet(Cosh(Times(CC(0L,1L,9L,5L),Pi)),
      Times(C1D4,Plus(C1,CSqrt5))),
    // Cosh(I*11/6*Pi)=Sqrt(3)/2
    ISet(Cosh(Times(CC(0L,1L,11L,6L),Pi)),
      Times(C1D2,CSqrt3)),
    // Cosh(I*2*Pi)=1
    ISet(Cosh(Times(CC(0L,1L,2L,1L),Pi)),
      C1),
    // Cosh(I*1/2*Pi+x_):=I*Sinh(x)
    ISetDelayed(Cosh(Plus(Times(CC(0L,1L,1L,2L),Pi),x_)),
      Times(CI,Sinh(x))),
    // Cosh(Pi*Complex(0,n_Integer)+x_):=(-1)^n*Cosh(x)
    ISetDelayed(Cosh(Plus(Times(Pi,Complex(C0,$p(n, Integer))),x_)),
      Times(Power(CN1,n),Cosh(x))),
    // Cosh(ArcSinh(x_)):=Sqrt(1+x^2)
    ISetDelayed(Cosh(ArcSinh(x_)),
      Sqrt(Plus(C1,Sqr(x)))),
    // Cosh(ArcCosh(x_)):=x
    ISetDelayed(Cosh(ArcCosh(x_)),
      x),
    // Cosh(ArcTanh(x_)):=1/Sqrt(1-x^2)
    ISetDelayed(Cosh(ArcTanh(x_)),
      Power(Subtract(C1,Sqr(x)),CN1D2)),
    // Cosh(ArcCoth(x_)):=1/Sqrt(1-1/x^2)
    ISetDelayed(Cosh(ArcCoth(x_)),
      Power(Subtract(C1,Power(x,CN2)),CN1D2)),
    // Cosh(ArcSech(x_)):=1/x
    ISetDelayed(Cosh(ArcSech(x_)),
      Power(x,CN1)),
    // Cosh(ArcCsch(x_)):=Sqrt(1+1/x^2)
    ISetDelayed(Cosh(ArcCsch(x_)),
      Sqrt(Plus(C1,Power(x,CN2)))),
    // Cosh(Log(x_)):=x/2+1/(2*x)
    ISetDelayed(Cosh(Log(x_)),
      Plus(Times(C1D2,x),Times(C1D2,Power(x,CN1)))),
    // Cosh(Infinity)=Infinity
    ISet(Cosh(oo),
      oo),
    // Cosh(ComplexInfinity)=Indeterminate
    ISet(Cosh(CComplexInfinity),
      Indeterminate)
  );
}
