/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-04-01 10:42:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<!-- for icons -->\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- jquery -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- custom js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/menu_js.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/about.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- custom css -->\r\n");
      out.write("<link href=\"css/menu_css.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/about.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function chk() {\r\n");
      out.write("\t\r\n");
      out.write("\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chk}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"==\"success\"){\r\n");
      out.write("\t\talert(\"회원가입을 축하드립니다.\");\r\n");
      out.write("\t}else if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chk}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"==\"fail\"){\r\n");
      out.write("\t\tdocument.join_form.u_name.value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tdocument.join_form.u_email.value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tdocument.join_form.u_tel.value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar birth = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_birth}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tvar r = birth.split(\"-\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.join_form.birth_year.value = r[0];\r\n");
      out.write("\t\tdocument.join_form.birth_month.value = r[1];\r\n");
      out.write("\t\tdocument.join_form.birth_day.value = r[2];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.join_form.u_id.focus();\r\n");
      out.write("\t\talert(\"이미 사용 중인 아이디입니다.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function join(f) {\r\n");
      out.write("\tfor (var i = 0; i < f.elements.length; i++) {\r\n");
      out.write("\t\tif (f.elements[i].value == \"\") {\r\n");
      out.write("\t\t\talert(f.elements[i].placeholder + \"를 입력하세요.\");\r\n");
      out.write("\t\t\tf.elements[i].focus();\r\n");
      out.write("\t\t\treturn;//수행 중단\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tif(f.birth_year.value==\"0\" || f.birth_month.value==\"0\" || f.birth_day.value==\"0\"){\r\n");
      out.write("\t\talert(\"생년월일을 입력하세요.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(f.u_pw.value!=f.pw_chk.value){\r\n");
      out.write("\t\talert(\"비밀번호가 다릅니다.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(f.u_gender.value==\"\"){\r\n");
      out.write("\t\talert(\"성별을 입력하세요.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tf.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".form-custom{\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".sel-custom{\r\n");
      out.write("\theight: 34px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<title>W I S H</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"chk()\">\r\n");
      out.write("<!-- 상단 메뉴  -->   \r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav_bar.jsp", out, false);
      out.write("\r\n");
      out.write("   <div class=\"wrap\">\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"col-md-5\">\r\n");
      out.write("   \t   <!-- about -->\t\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"slider\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"slide active-slide\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"slide-copy col-xs-5\">\r\n");
      out.write("\t\t\t\t \t\t<h1 style=\"font-family: 'Raleway', sans-serif;\">W I S H</h1>\r\n");
      out.write("\t\t\t\t \t\t<p>위시에서 전세계 친구들과 기분 좋은 행운을 나눠보세요</p>\r\n");
      out.write("\t\t\t\t \t\t<img src=\"images/dis1.png\" height=\"250px\" width=\"100%\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"slide-copy col-xs-5\">\r\n");
      out.write("\t\t\t\t\t\t<h1 style=\"font-family: 'Raleway', sans-serif;\">W I S H</h1>\r\n");
      out.write("\t\t\t\t\t\t<p>위시는 어떻게 이용해야 하나요?</p>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"35%\"><img src=\"images/profile_female.png\" class=\"circle-img\"/><br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<span style=\"font-size: 12px;\">좋은 일이 생기면<br/>친구들과 좋은 기를 나누는 <br/>글을 작성합니다</span>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td><td width=\"35%\"><img src=\"images/arrow-right.png\" width=\"50%\"/><br/><img src=\"images/arrow-left.png\" width=\"50%\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td><td><img src=\"images/profile_male.png\" class=\"circle-img\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/><span style=\"font-size: 12px;\">'기 받기' 버튼을 클릭하여<br/> 친구들의 좋은 기를 <br/>나눠받습니다</span>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"slide-copy col-xs-5\">\r\n");
      out.write("\t\t\t\t\t\t<h1 style=\"font-family: 'Raleway', sans-serif;\">W I S H</h1>\r\n");
      out.write("\t\t\t\t\t\t<p>친구들에게 받은 기를 모아 소원을 이루세요</p>\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<td><img src=\"images/profile_male.png\" class=\"circle-img\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><span style=\"font-size: 15px;\">다이어트 성공 기원!</span>\r\n");
      out.write("\t\t\t\t\t\t\t<br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"\" src=\"images/progressbar.png\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t <div class=\"slide\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t <div class=\"slide-copy col-xs-5\">\r\n");
      out.write("\t\t\t\t\t\t<h1 style=\"font-family: 'Raleway', sans-serif;\">W I S H</h1>\r\n");
      out.write("\t\t\t\t\t\t<p>기를 모두 모으면 어디에서도 볼 수 없는 특별한 선물이 당신을 찾아갑니다 :D</p>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/gift.png\" width=\"100px\"/>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/gift2.png\" width=\"100px\"/>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/gift4.png\" width=\"100px\"/>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/gift3.png\" width=\"100px\"/> \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("<div class=\"slider-nav\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"arrow-prev\"><img\r\n");
      out.write("\t\t\tsrc=\"images/arrow-prev.png\"></a>\r\n");
      out.write("\t\t<ul class=\"slider-dots\">\r\n");
      out.write("\t\t\t<li class=\"dot active-dot\">&bull;</li>\r\n");
      out.write("\t\t\t<li class=\"dot\">&bull;</li>\r\n");
      out.write("\t\t\t<li class=\"dot\">&bull;</li>\r\n");
      out.write("\t\t\t<li class=\"dot\">&bull;</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<a href=\"#\" class=\"arrow-next\"><img\r\n");
      out.write("\t\t\tsrc=\"images/arrow-next.png\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("   \t\r\n");
      out.write("   \t\r\n");
      out.write("   \t\r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"col-md-6\">\r\n");
      out.write("   \t\t<header>\r\n");
      out.write("\t\t\t\t<hgroup>\r\n");
      out.write("\t\t\t\t\t<h1> 가입하기</h1>\r\n");
      out.write("\t\t\t\t\t<h3> 아직도 회원이 아닌가요? <br/>\r\n");
      out.write("\t\t\t\t\t가입하고 좋은 기를 모으세요.</h3>\r\n");
      out.write("\t\t\t\t</hgroup>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t    <form name=\"join_form\" action=\"join.do\" method=\"post\" id=\"join_for\">\r\n");
      out.write("\t\t\t<br/>\t\t\t\t\r\n");
      out.write("\t\t       \t<input type=\"text\" placeholder=\"아이디\" name=\"u_id\" class=\"form-control form-custom\"/>\r\n");
      out.write("\t\t       \t<input type=\"password\" placeholder=\"비밀번호\" name=\"u_pw\" class=\"form-control form-custom\"/>\r\n");
      out.write("\t\t      \t<input type=\"password\" placeholder=\"비밀번호 확인\" name=\"pw_chk\" class=\"form-control form-custom\">\r\n");
      out.write("\t\t      \t<input type=\"text\" placeholder=\"이름\" name=\"u_name\" class=\"form-control form-custom\">\r\n");
      out.write("\t\t      \t\r\n");
      out.write("\t\t      \t<label>생일</label> &nbsp;&nbsp;\r\n");
      out.write("\t\t      \t<select name=\"birth_year\" class=\"sel-custom\">\r\n");
      out.write("\t\t      \t\t<option\tvalue=\"0\" selected=\"1\">연도</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2015\">2015</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2014\">2014</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2013\">2013</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2012\">2012</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2011\">2011</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2010\">2010</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2009\">2009</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2008\">2008</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2007\">2007</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2006\">2006</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2005\">2005</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2004\">2004</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2003\">2003</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2002\">2002</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2001\">2001</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2000\">2000</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1999\">1999</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1998\">1998</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1997\">1997</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1996\">1996</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1995\">1995</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1994\">1994</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1993\">1993</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1992\">1992</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1991\">1991</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1990\">1990</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1989\">1989</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1988\">1988</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1987\">1987</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1986\">1986</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1985\">1985</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1984\">1984</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1983\">1983</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1982\">1982</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1981\">1981</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1980\">1980</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1979\">1979</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1978\">1978</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1977\">1977</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1976\">1976</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1975\">1975</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1974\">1974</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1973\">1973</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1972\">1972</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1971\">1971</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1970\">1970</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1969\">1969</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1968\">1968</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1967\">1967</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1966\">1966</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1965\">1965</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1964\">1964</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1963\">1963</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1962\">1962</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1961\">1961</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1960\">1960</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1959\">1959</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1958\">1958</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1957\">1957</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1956\">1956</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1955\">1955</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1954\">1954</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1953\">1953</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1952\">1952</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1951\">1951</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1950\">1950</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1949\">1949</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1948\">1948</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1947\">1947</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1946\">1946</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1945\">1945</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1944\">1944</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1943\">1943</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1942\">1942</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1941\">1941</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1940\">1940</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1939\">1939</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1938\">1938</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1937\">1937</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1936\">1936</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1935\">1935</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1934\">1934</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1933\">1933</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1932\">1932</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1931\">1931</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1930\">1930</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1929\">1929</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1928\">1928</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1927\">1927</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1926\">1926</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1925\">1925</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1924\">1924</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1923\">1923</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1922\">1922</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1921\">1921</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1920\">1920</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1919\">1919</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1918\">1918</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1917\">1917</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1916\">1916</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1915\">1915</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1914\">1914</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1913\">1913</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1912\">1912</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1911\">1911</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1910\">1910</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1909\">1909</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1908\">1908</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1907\">1907</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1906\">1906</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1905\">1905</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<select name=\"birth_month\" class=\"sel-custom\">\r\n");
      out.write("\t\t\t\t\t<option\tvalue=\"0\" selected=\"1\">월</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"7\">7</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"8\">8</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"9\">9</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"11\">11</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"12\">12</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<select name=\"birth_day\" class=\"sel-custom\">\r\n");
      out.write("\t\t\t\t\t<option value=\"0\" selected=\"1\">일</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"7\">7</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"8\">8</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"9\">9</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"11\">11</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"12\">12</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"13\">13</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"14\">14</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"15\">15</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"16\">16</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"17\">17</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"18\">18</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"19\">19</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"20\">20</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"21\">21</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"22\">22</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"23\">23</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"24\">24</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"25\">25</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"26\">26</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"27\">27</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"28\">28</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"29\">29</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"30\">30</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"31\">31</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t      \t<p/>\r\n");
      out.write("\t\t      \r\n");
      out.write("\t\t      \t<label>성별</label> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"u_gender\" value=\"male\"> 남\t\t      \t\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"u_gender\" value=\"female\"> 여 <p/> \r\n");
      out.write("\t\t      \t<input type=\"text\" placeholder=\"휴대전화 번호\" name=\"u_tel\" class=\"form-control form-custom\">\r\n");
      out.write("\t\t      \t<input type=\"text\" placeholder=\"이메일\" name=\"u_email\" class=\"form-control form-custom\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t        <div class=\"action_btns\">\r\n");
      out.write("\t\t            <div class=\"one_half\" align=\"right\">\r\n");
      out.write("\t\t               <input type=\"button\" class=\"btn btn-default btn-lg\" value=\"가입하기\" onclick=\"join(this.form)\">\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t    </form>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"col-md-1\">\r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("    \r\n");
      out.write("<!-- footer -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
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
