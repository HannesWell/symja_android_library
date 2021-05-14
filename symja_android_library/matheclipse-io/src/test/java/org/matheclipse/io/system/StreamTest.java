package org.matheclipse.io.system;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.basic.ToggleFeature;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.expression.F;
import org.matheclipse.script.engine.MathScriptEngine;

public class StreamTest extends AbstractTestCase {

  public StreamTest(String name) {
    super(name);
  }

  public void testRead001() {
    call("str = StringToStream(\"4711 dummy 0815\")");
    check(
        "Read(str, Number)", //
        "4711");
    check(
        "Read(str, {Word, Number})", //
        "{dummy,0815}");
    check(
        "Close(str)", //
        "String");
  }

  public void testRead002() {
    call("str = StringToStream(\"4711 dummy 0815\")");
    check(
        "Read(str, Number)", //
        "4711");
    check(
        "Read(str, Word)", //
        "dummy");
    check(
        "Read(str, Number)", //
        "0815");
    check(
        "Close(str)", //
        "String");
  }

  public void testRead003() {
    check(
        "str = \"foo::usage = \\\"foo is ...\\\";\n" + "bar::usage = \\\"bar is ...\\\";\"", //
        "foo::usage = \"foo is ...\";\n" + "bar::usage = \"bar is ...\";");
    check(
        "strm = StringToStream(str);", //
        "");
    check(
        "Read(strm, Hold(Expression)) // InputForm", //
        "Hold(foo::usage=\"foo is ...\";Null)");
    check(
        "Read(strm, Hold(Expression)) // InputForm", //
        "Hold(bar::usage=\"bar is ...\";Null)");
    check(
        "Close(strm)", //
        "String");
  }

  public void testRead004() {
    // newline after ::usage
    check(
        "str = \"foo::usage = \n \\\"foo is ...\\\";\n" + "bar::usage = \\\"bar is ...\\\";\"", //
        "foo::usage = \n" + " \"foo is ...\";\n" + "bar::usage = \"bar is ...\";");
    check(
        "strm = StringToStream(str);", //
        "");
    check(
        "Read(strm, Hold(Expression)) // InputForm", //
        "Hold(foo::usage=\"foo is ...\";Null)");
    check(
        "Read(strm, Hold(Expression)) // InputForm", //
        "Hold(bar::usage=\"bar is ...\";Null)");
    check(
        "Close(strm)", //
        "String");
  }

  public void testFile001() {
    call("f = File(\"test.txt\")");
    check(
        "Write(f, a + b)", //
        "");
    check(
        "Read(f, {Word,Word,Word})", //
        "{a,+,b}");
  }

  public void testStringToStream() {
    call("str = StringToStream(\"234,32412,4234\")");
    check(
        "Read(str, Number)", //
        "234");
    check(
        "Read(str, Character)", //
        ",");
    check(
        "Close(str)", //
        "String");
  }

  public void testOpenAppend001() {
    call("f = FileNameJoin({$TemporaryDirectory, \"test_open.txt\"});Print(f)");
    check(
        "str = OpenWrite(f);", //
        "");
    check(
        "Write(str, x^2 - y^2)", //
        "");
    check(
        "Close(str);", //
        "");
    check(
        "FilePrint(f)", //
        "");

    check(
        "str = OpenAppend(f);", //
        "");
    check(
        "Write(str, x^2 + y^2)", //
        "");
    check(
        "Close(str);", //
        "");
    check(
        "FilePrint(f)", //
        "");
  }

  public void testOpenAppend002() {
	  // create temporary file and open output stream
    check(
        "str = OpenWrite();Print(str);", //
        "");
    check(
        "Write(str, x^2 - y^2)", //
        "");
    check(
        "Close(str);", //
        "");
     
  }

  /** The JUnit setup method */
  @Override
  protected void setUp() {
    super.setUp();
    Config.FILESYSTEM_ENABLED = true;
    Config.MAX_AST_SIZE = 10000;
    EvalEngine.get().setIterationLimit(500);
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }
}