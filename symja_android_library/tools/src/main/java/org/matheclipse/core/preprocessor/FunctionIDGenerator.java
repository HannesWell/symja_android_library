package org.matheclipse.core.preprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import org.matheclipse.core.convert.AST2Expr;
import org.matheclipse.core.expression.BuiltInSymbol;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IBuiltInSymbol;
import org.matheclipse.core.interfaces.IEvaluator;
import org.matheclipse.core.interfaces.IStringX;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.io.IOInit;
import org.matheclipse.parser.client.ParserConfig;

public class FunctionIDGenerator {

  static final String HEADER = //
      "package org.matheclipse.core.expression;\n" + //
          "\n" + //
          "/**\n" //
          + " * Generated with class <code>org.matheclipse.core.preprocessor.FunctionIDGenerator</code>\n"
          + " * Don't change manually.\n"//
          + " * Contains int IDs for every instanceof {@link BuiltInSymbol}).\n"//
          + //
          " */\n" + //
          "public class ID {\n";

  public static void main(String[] args) {
    IOInit.init();
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i < AST2Expr.UPPERCASE_SYMBOL_STRINGS.length; i++) {
      list.add(AST2Expr.UPPERCASE_SYMBOL_STRINGS[i]);
    }
    for (int i = 0; i < AST2Expr.SYMBOL_STRINGS.length; i++) {
      list.add(AST2Expr.SYMBOL_STRINGS[i]);
    }
    for (int i = 0; i < AST2Expr.FUNCTION_STRINGS.length; i++) {
      list.add(AST2Expr.FUNCTION_STRINGS[i]);
    }
    for (int i = 0; i < AST2Expr.DOLLAR_STRINGS.length; i++) {
      list.add(AST2Expr.DOLLAR_STRINGS[i]);
    }
    Collections.sort(list, IStringX.US_COLLATOR);

    System.out.println(HEADER);
    System.out.println("    public final static int UNKNOWN = -1;");
    for (int i = 0; i < list.size(); i++) {
      System.out.println("    public final static int " + list.get(i) + " = " + i + ";");
    }
    System.out.println("");
    printGithubSymjaFunctionLineNumber();
    System.out.println("");
    System.out.println("}");
  }

  static final String userHome = System.getProperty("user.home");
  static final String GITHUB = "https://github.com/";
  static final String POM_PATH =
      "axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/";
  static final String SRC_PATH = "src/main/java/";
  static final String CORE_POM_PATH =
      userHome + "/git/symja_android_library/symja_android_library/matheclipse-core\\";
  static final String IO_POM_PATH =
      userHome + "/git/symja_android_library/symja_android_library/matheclipse-io\\";
  static final String BASE_SRC_PATH = "src/main/java\\";

  public static void printGithubSymjaFunctionLineNumber() {
    try {
      ParserConfig.EXPLICIT_TIMES_OPERATOR = true;
      F.initSymbols();
      ArrayList<String> list = new ArrayList<String>();
      for (int i = 0; i < AST2Expr.UPPERCASE_SYMBOL_STRINGS.length; i++) {
        list.add(AST2Expr.UPPERCASE_SYMBOL_STRINGS[i]);
      }
      for (int i = 0; i < AST2Expr.SYMBOL_STRINGS.length; i++) {
        list.add(AST2Expr.SYMBOL_STRINGS[i]);
      }
      for (int i = 0; i < AST2Expr.FUNCTION_STRINGS.length; i++) {
        list.add(AST2Expr.FUNCTION_STRINGS[i]);
      }
      for (int i = 0; i < AST2Expr.DOLLAR_STRINGS.length; i++) {
        list.add(AST2Expr.DOLLAR_STRINGS[i]);
      }
      Collections.sort(list, IStringX.US_COLLATOR);

      int counter = 0;
      System.out.println("/**\n"
          + "   * Generated by class: <code>org.matheclipse.core.preprocessor.FunctionIDGenerator\n"
          + "   * </code>\n" + "   */\n"
          + "public final static int[] LINE_NUMBER_OF_JAVA_CLASS = new int[] { //");
      for (int i = 0; i < list.size(); i++) {
        counter++;
        if (counter > 10) {
          System.out.println(" //");
          counter = 0;
        }
        ISymbol sym = F.symbol(list.get(i));
        if (sym instanceof IBuiltInSymbol) {
          IBuiltInSymbol builtin = (IBuiltInSymbol) sym;
          IEvaluator eval = builtin.getEvaluator();
          if (eval != null && eval != BuiltInSymbol.DUMMY_EVALUATOR) {
            Class<? extends IEvaluator> clazz = eval.getClass();
            if (!clazz.isAnonymousClass() && !clazz.isSynthetic() && //
                !clazz.isInterface() && !clazz.isPrimitive()) {
              String fileName = buildFileNameL(clazz);
              File sourceLocation = new File(fileName);
              int lineCounter = lineNumberOfClass(sourceLocation, list.get(i));
              System.out.print(lineCounter);
            } else {
              System.out.print("0");
            }
          } else {
            System.out.print("0");
          }
        } else {
          System.out.print("0");
        }
        if (i < list.size() - 1) {
          System.out.print(",");
        }
      }
      System.out.print("};");
    } catch (RuntimeException ex) {
      System.out.println();
      ex.printStackTrace();
    }
  }

  public static String buildURL(final Class<?> clazz) {
    StringBuilder buf = new StringBuilder(512);
    buf.append(GITHUB);
    buf.append(POM_PATH);
    buf.append(SRC_PATH);
    String canonicalName = clazz.getCanonicalName();
    String packageName = clazz.getPackage().getName();
    String parentClass = canonicalName.substring(packageName.length() + 1);
    int index = parentClass.indexOf('.');
    if (index > 0) {
      parentClass = parentClass.substring(0, index);
    }
    String packagePath = packageName.replace('.', '/');
    buf.append(packagePath);
    buf.append('/');
    buf.append(parentClass);
    buf.append(".java");
    return buf.toString();
  }

  public static int lineNumberOfClass(File file, String functionName) {
    String s1 = "class " + functionName + " extends";
    String s2 = "class " + functionName + " implements";
    try {
      final BufferedReader f = new BufferedReader(new FileReader(file));
      String line;
      int lineCounter = 0;
      while ((line = f.readLine()) != null) {
        lineCounter++;
        int index = line.indexOf(functionName, 0);
        if (index > 0) {
          index = line.indexOf(s1, 0);
          if (index > 0) {
            f.close();
            return lineCounter;
          }
          index = line.indexOf(s2, 0);
          if (index > 0) {
            f.close();
            return lineCounter;
          }
        }
      }
      f.close();
    } catch (Exception e) {
      // e.printStackTrace();
    }
    return 0;
  }

  public static String buildFileNameL(final Class<?> clazz) {
    String canonicalName = clazz.getCanonicalName();
    String packageName = clazz.getPackage().getName();
    String parentClass = canonicalName.substring(packageName.length() + 1);

    StringBuilder buf = new StringBuilder(512);
    if (packageName.startsWith("org.matheclipse.io")) {
      buf.append(IO_POM_PATH);
    } else {
      buf.append(CORE_POM_PATH);
    }

    buf.append(BASE_SRC_PATH);
    // System.out.println(clazz.getName());

    int index = parentClass.indexOf('.');
    if (index > 0) {
      parentClass = parentClass.substring(0, index);
    }
    String packagePath = packageName.replace('.', '\\');
    buf.append(packagePath);
    buf.append('\\');
    buf.append(parentClass);
    buf.append(".java");
    return buf.toString();
  }
}
