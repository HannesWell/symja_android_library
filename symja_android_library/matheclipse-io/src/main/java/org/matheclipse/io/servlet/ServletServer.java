package org.matheclipse.io.servlet;

import static io.undertow.Handlers.resource;
import static io.undertow.servlet.Servlets.defaultContainer;
import static io.undertow.servlet.Servlets.deployment;
import static io.undertow.servlet.Servlets.servlet;

import java.awt.Desktop;
import java.net.URI;

import javax.servlet.Servlet;
import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.exception.ReturnException;
import io.undertow.Handlers;
import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.server.handlers.resource.ClassPathResourceManager;
import io.undertow.servlet.api.DeploymentInfo;
import io.undertow.servlet.api.DeploymentManager;

public class ServletServer {
  /** The port for running JSON API. Default is 8080 */
  public static int PORT = 8080;

  public static final String MYAPP = "/";

  public static void main(final String[] args) {
    try {
      if (setArgs("ServletServer", args) < 0) {
        return;
      }
    } catch (RuntimeException rex) {
      return;
    }
    Class<ServletServer> serverClass = ServletServer.class;
    String deploymentName = "symja.war";
    Class<AJAXQueryServlet> ajaxServlet = AJAXQueryServlet.class;
    ClassLoader classLoader = serverClass.getClassLoader();
    String host = "localhost";

    ServletServer.runServer(deploymentName, classLoader, ajaxServlet, host, PORT, "index.html");
  }

  /**
   * @param deploymentName the <code>*.war</code> deployment name.
   * @param classLoader the current class loader
   * @param ajaxServlet the name of the AJAX servlet class
   * @param host typical <code>localhost</code>
   * @param port typical port <code>8080</code>
   * @param welcomeFile TODO
   */
  protected static void runServer(
      String deploymentName,
      ClassLoader classLoader,
      Class<? extends Servlet> ajaxServlet,
      String host,
      int port,
      String welcomeFile) {
    try {

      DeploymentInfo servletBuilder =
          deployment()
              .setClassLoader(classLoader)
              .setContextPath(MMAServletServer.MYAPP)
              .setDeploymentName(deploymentName)
              .addServlets(
                  servlet("query", ajaxServlet).setLoadOnStartup(1).addMapping("/query/"),
                  servlet("doc", AJAXDocServlet.class).addMapping("/doc/*"),
                  servlet("search", AJAXSearchServlet.class).addMapping("/doc/search/"));

      DeploymentManager manager = defaultContainer().addDeployment(servletBuilder);
      manager.deploy();

      HttpHandler servletHandler = manager.start();

      PathHandler path =
          Handlers.path() // Handlers.redirect(MYAPP)
              .addPrefixPath("/ajax", servletHandler)
              .addPrefixPath(
                  "/",
                  resource(new ClassPathResourceManager(classLoader, "public/"))
                      .addWelcomeFiles(welcomeFile));

      Undertow server = Undertow.builder().addHttpListener(port, host).setHandler(path).build();
      server.start();

      URI uri = new URI("http://" + host + ":" + port + "/" + welcomeFile);
      if (Desktop.isDesktopSupported()) {
        Desktop.getDesktop().browse(uri);
      }
      System.out.println("Open browser URL: " + uri.toString());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  protected static int setArgs(final String serverClass, final String args[]) {
    for (int i = 0; i < args.length; i++) {
      final String arg = args[i];

      if (arg.equals("-port") || arg.equals("-p")) {
        if (i + 1 >= args.length) {
          System.out.println("You must specify a port number when using the -port argument");
          throw ReturnException.RETURN_FALSE;
        }

        String portStr = args[i + 1];
        i++;
        PORT = Integer.valueOf(portStr);
      } else if (arg.equals("-help") || arg.equals("-h")) {
        printUsage(serverClass);
        return -1;

      } else if (arg.charAt(0) == '-') {
        // we don't have any more args to recognize!
        final String msg = "Unknown arg: " + arg;
        System.out.println(msg);
        printUsage(serverClass);
        return -4;
      }
    }
    printUsage(serverClass);
    return 1;
  }

  /** Prints the usage of how to use this class to stdout */
  private static void printUsage(final String serverClass) {
    final String lineSeparator = System.getProperty("line.separator");
    final StringBuilder msg = new StringBuilder();
    msg.append(Config.SYMJA);
    msg.append(Config.COPYRIGHT);
    msg.append(
        "Symja Browser Wiki: "
            + "https://github.com/axkr/symja_android_library/wiki/Browser-apps"
            + lineSeparator);
    msg.append(lineSeparator);
    msg.append("org.matheclipse.io.servlet." + serverClass + " [options]" + lineSeparator);
    msg.append(lineSeparator);
    msg.append("Program arguments: " + lineSeparator);
    msg.append("  -h or -help print usage messages" + lineSeparator);
    msg.append("  -p or -port set the port (default port is 8080)" + lineSeparator);
    msg.append("****+****+****+****+****+****+****+****+****+****+****+****+");

    System.out.println(msg.toString());
    System.out.flush();
  }
}
