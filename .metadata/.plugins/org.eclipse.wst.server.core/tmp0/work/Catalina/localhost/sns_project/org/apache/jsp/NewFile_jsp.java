/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-04-02 00:07:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewFile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"rotate3Di/jquery-css-transform/jquery-css-transform.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"rotate3Di/rotate3Di.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("\tbackground-color: transparent;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("h2 a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    padding: 48px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    padding: 36px 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav-list-example {\r\n");
      out.write("    \r\n");
      out.write("    width : 1500px;\r\n");
      out.write("    height :600px;\r\n");
      out.write("    margin: 48px 0;\r\n");
      out.write("    list-style:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav-list-example li {\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    height: 600px;\r\n");
      out.write("    float: left;\r\n");
      out.write("    margin-right: 100px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav-list-example li div {\r\n");
      out.write("    \r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    background: white;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav-list-example li div.back {\r\n");
      out.write("    left: -999em;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("\t$(\".filter\").fadeIn(\"400\");\r\n");
      out.write("    $('#nav-list-example li div.back').hide().css('left', 0);\r\n");
      out.write("    \r\n");
      out.write("    function mySideChange(front) {\r\n");
      out.write("        if (front) {\r\n");
      out.write("    \t\t$(this).parent().find('div.front').show();\r\n");
      out.write("            $(this).parent().find('div.back').hide();\r\n");
      out.write("       \t}else{\r\n");
      out.write("       \t \t$(this).parent().find('div.front').hide();\r\n");
      out.write("         \t$(this).parent().find('div.back').show();\r\n");
      out.write("       \t} \r\n");
      out.write("    }\r\n");
      out.write("    function myComplete() {\r\n");
      out.write("         $(this).find('div.back').show();\r\n");
      out.write("         \r\n");
      out.write("         l\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    $('.gift').on(\"click\",\r\n");
      out.write("    \tfunction () {\r\n");
      out.write("           $(this).find('div').rotate3Di('flip', 250, {direction: 'clockwise', sideChange: mySideChange, complete: myComplete});\r\n");
      out.write("        }/* ,\r\n");
      out.write("        function () {\r\n");
      out.write("           $(this).find('div').stop().rotate3Di('unflip', 500, {sideChange: mySideChange});\r\n");
      out.write("        }  */\r\n");
      out.write("    );\r\n");
      out.write("}); \r\n");
      out.write("\r\n");
      out.write("/*$(document).ready(function () {\r\n");
      out.write("function mySideChange(front) {\r\n");
      out.write("    if (front) {\r\n");
      out.write("        $(this).css('background', '#f0f');\r\n");
      out.write("    } else {\r\n");
      out.write("        $(this).css('background', '#0f0');\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function myComplete() {\r\n");
      out.write("    $('#ex7').css('backgroundColor', '#f00');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$('#ex7').click(function () {\r\n");
      out.write("    $(this).rotate3Di(\r\n");
      out.write("        '360',\r\n");
      out.write("        3000,\r\n");
      out.write("        {\r\n");
      out.write("            sideChange: mySideChange,\r\n");
      out.write("            complete: myComplete\r\n");
      out.write("        }\r\n");
      out.write("    );\r\n");
      out.write("}); \r\n");
      out.write("\r\n");
      out.write("});*/\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu = \"return false\">\r\n");
      out.write("\t<ul id=\"nav-list-example\"> \r\n");
      out.write("    <li>\r\n");
      out.write("    <a class=\"gift\">\r\n");
      out.write("        <div class=\"front\"><img src=\"images/wish_back.png\"/></div>\r\n");
      out.write("        <div class=\"back\"><img src=\"images/wish01.png\"/></div>\r\n");
      out.write("    </a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <a class=\"gift\" >\r\n");
      out.write("        <div class=\"front\"><img src=\"images/wish_back.png\"/></div>\r\n");
      out.write("        <div class=\"back\"><img src=\"images/wish01.png\"/></div>\r\n");
      out.write("    </a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("    <a class=\"gift\">\r\n");
      out.write("        <div class=\"front\"><img src=\"images/wish_back.png\"/></div>\r\n");
      out.write("        <div class=\"back\"><img src=\"images/wish01.png\"/></div>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write(" </ul>\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
