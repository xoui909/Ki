/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-03-31 07:15:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leave_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("%>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<!-- for icons -->\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- google web font -->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:400;300' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("<!-- jquery -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- jquery plugin -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- custom js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/menu_js.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- custom css -->\r\n");
      out.write("<link href=\"css/menu_css.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction msg() {\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" == \"비밀번호가 맞지 않습니다.\" ){\r\n");
      out.write("\t\t\talert(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction leave(f) {\r\n");
      out.write("\t\tif(confirm('정말 탈퇴하시겠습니까?')){\r\n");
      out.write("// \t\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_pw}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"==f.u_pw.value){\r\n");
      out.write("// \t\t\t\talert(\"탈퇴되었습니다. 이용해주셔서 감사합니다.\");\r\n");
      out.write("\t\t\t\tf.submit();\r\n");
      out.write("// \t\t\t}else{\r\n");
      out.write("// \t\t\t\talert(\"비밀번호가 맞지 않습니다.\");\r\n");
      out.write("// \t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
      out.write(".wrap{\r\n");
      out.write("\tmargin-top: 30px !important; \r\n");
      out.write("\tmargin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"msg()\">\r\n");
      out.write("<!-- 상단 메뉴  -->   \r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "search_bar.jsp", out, false);
      out.write("\r\n");
      out.write("  \t <div class=\"wrap\">\r\n");
      out.write("   <div class=\"col-md-3\">\r\n");
      out.write("   \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"col-md-6\">\r\n");
      out.write("   \t\t<header>\r\n");
      out.write("\t\t\t\t<hgroup>\r\n");
      out.write("\t\t\t\t\t<h1>회원 탈퇴하기</h1>\r\n");
      out.write("\t\t\t\t\t<p>회원탈퇴를 신청하기 전에 안내 사항을 꼭 확인해주세요.</p> <br><br>\r\n");
      out.write("\t\t\t\t\t<p><span style=\"font-weight: bold;\">사용하고 계신 아이디(<span style=\"color: green;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>)는 탈퇴할 경우 재사용 및 복구가 불가능합니다. </span></p>\r\n");
      out.write("\t\t\t\t\t<p><span style=\"color: orange;\">탈퇴한 아이디는 본인과 타인 모두 재사용 및 복구가 불가</span>하오니 신중하게 선택하시기 바랍니다.</p><br><br>\r\n");
      out.write("\t\t\t\t\t<p><span style=\"font-weight: bold;\">탈퇴 후 회원정보 및 서비스 이용기록은 모두 삭제됩니다.</span></p>\r\n");
      out.write("\t\t\t\t\t<p>회원정보 및 게시물, 덧글 등의 서비스 이용기록은 모두 삭제되며, 삭제된 데이터는 복구되지 않습니다.</p>\r\n");
      out.write("\t\t\t\t</hgroup>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t    <form name=\"edit_form\" action=\"leave.do\" method=\"post\" > \r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_idx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"u_idx\"/>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"u_id\"/>\r\n");
      out.write("\t\t       \t<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uvo.u_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  class=\"form-control form-custom\" disabled />\r\n");
      out.write("\t\t      \t<input type=\"password\" placeholder=\"비밀번호 입력\" name=\"u_pw\" class=\"form-control form-custom\"/>\r\n");
      out.write("<!-- \t\t      \t<input type=\"password\" placeholder=\"새 비밀번호\" name=\"new_pw\" class=\"form-control form-custom\"/> -->\r\n");
      out.write("<!-- \t\t      \t<input type=\"password\" placeholder=\"새 비밀번호 확인\" name=\"new_pw_chk\" class=\"form-control form-custom\"> -->\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- \t\t\t\t<label>프로필 이미지 (png, jpg, jpeg, gif만 가능)</label><input type=\"file\" class=\"form-control form-custom\" name=\"real_image\" id=\"image\" onchange=\"inputImage()\"/> -->\r\n");
      out.write("<!-- \t\t\t\t<div id=\"imagePreview\" style=\"height: 150px; width: 150px; border: 1px gray dashed; border-radius:100%;\"></div> -->\r\n");
      out.write("\t\t        <div class=\"action_btns\">\r\n");
      out.write("\t\t            <div class=\"one_half\" align=\"right\">\r\n");
      out.write("\t\t               <input type=\"button\" class=\"btn btn-default btn-lg\" value=\"탈퇴하기\" onclick=\"leave(this.form)\">\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t    </form>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"col-md-3\">\r\n");
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