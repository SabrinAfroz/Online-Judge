package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("        <script src=\"jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background:#f0f0f0;\n");
      out.write("                background: -webkit-linear-gradient(to top, #f0f0f0, #ccccff);\n");
      out.write("                background: -moz-linear-gradient(to top, #f0f0f0, #ccccff);\n");
      out.write("                background: -o-linear-gradient(to top, #f0f0f0, #ccccff);\n");
      out.write("                background: linear-gradient(to top, #f0f0f0, #ccccff);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-fluid{\n");
      out.write("                font-size: 15px;\n");
      out.write("\n");
      out.write("                background-color:darkslategray;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .content h3{\n");
      out.write("                font-style:oblique;\n");
      out.write("                font-family:cursive;\n");
      out.write("                font-size: 30px;\n");
      out.write("                text-align: center;     \n");
      out.write("            }\n");
      out.write("            .content img{\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                     <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"signUp.jsp\">Signup</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <br>  \n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <p align =\"center\">\n");
      out.write("                    <img src=\"logo_large.jpg\" class=\"img-rounded\" alt=\"Logo_large\" width=\"100\" height=\"100\">\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("\n");
      out.write("                <h3> MBSTU ONLINE JUDGE </h3>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div><br>\n");
      out.write("\n");
      out.write("        <div class=\"main-w3layouts wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <!-- Indicators -->\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("                        <div class=\"item active\">\n");
      out.write("                            <p align=\"center\"> <img src=\"programmingconcept-.jpg\" alt=\"Los Angeles\" style=\"width:40%;\"></p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <p align=\"center\"><img src=\"computerw.jpg\" alt=\"Chicago\" style=\"width:40%;\"></p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                        <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
