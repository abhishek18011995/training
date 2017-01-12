package org.apache.jsp.jsps;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sharekahn.vo.LoginDetails;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

System.out.print(session.getAttribute("login"));
LoginDetails d=(LoginDetails)session.getAttribute("login");
System.out.print(d.getUsername());
//if(d==null){
	
	//request.getRequestDispatcher("/html/twitter.html").forward(request,response);
///}


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.navbar{\r\n");
      out.write("\t\tmargin-top: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<title>Example of Bootstrap 3 Carousel</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".carousel{\r\n");
      out.write("    background: #2f4357;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write(".carousel .item img{\r\n");
      out.write("    margin: 0 auto; /* Align slide image horizontally center */\r\n");
      out.write("}\r\n");
      out.write(".bs-example{\r\n");
      out.write("\tmargin: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"bs-example\">\r\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("        <!-- Carousel indicators -->\r\n");
      out.write("        <ol class=\"carousel-indicators\">\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("        </ol>   \r\n");
      out.write("        <!-- Wrapper for carousel items -->\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("            <div class=\"item active\">\r\n");
      out.write("                <img src=\"/sharekhan/images/image1.jpg\" alt=\"First Slide\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"/sharekhan/images/image2.jpg\" alt=\"Second Slide\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <img src=\"/sharekhan/images/image3.jpg\" alt=\"Third Slide\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Carousel controls -->\r\n");
      out.write("        <a class=\"carousel-control left\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a class=\"carousel-control right\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <nav role=\"navigation\" class=\"navbar navbar-inverse\">\r\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" data-target=\"#navbarCollapse\" data-toggle=\"collapse\" class=\"navbar-toggle\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\">Brand</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Collection of nav links, forms, and other content for toggling -->\r\n");
      out.write("        <div id=\"navbarCollapse\" class=\"collapse navbar-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                <li><a href=\"#\">Profile</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">Messages <b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul role=\"menu\" class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"#\">Inbox</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Drafts</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Sent Items</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">Trash</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form role=\"search\" class=\"navbar-form navbar-left\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\" class=\"form-control\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li><a href=\"#\">Login</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                               \t\t                              \t\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
