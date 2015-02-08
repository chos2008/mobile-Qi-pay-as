package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/c.tld");
  }

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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<title>支付中心</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" leftmargin=\"0\" marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<div style=\"width: 100%; height: 35px; line-height: 35px; text-align: center; border: 0px solid silver; border-bottom: 1px solid silver;\">\r\n");
      out.write("    <label>登录</label>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\t<form action=\"\">\r\n");
      out.write("\t\t<div style=\"width: 100%;\">\r\n");
      out.write("\t\t\t<div style=\"width: 320px; height: 44px; margin: 0px auto; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;\">\r\n");
      out.write("\t\t\t\t<label for=\"\" class=\"icon-user2\" style=\"display: block; width: 42px; height: 44px; line-height: 44px; text-align: center; font-size: 1.6rem; color: #666;\"></label>\r\n");
      out.write("\t\t\t\t<div style=\"height: 43px; border-bottom: 1px solid #e5e5e5; -webkit-box-flex: 1; -webkit-flex: 1; -ms-flex: 1; flex: 1;\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" style=\"width: 100%; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;\" placeholder=\"手机号码/邮箱/用户名\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width: 320px; height: 44px; margin: 0px auto; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;\">\r\n");
      out.write("\t\t\t\t<label for=\"\" class=\"icon-unlock-alt\" style=\"display: block; width: 42px; height: 44px; line-height: 44px; text-align: center; font-size: 1.6rem; color: #666;\"></label>\r\n");
      out.write("\t\t\t\t<div style=\"height: 43px; border-bottom: 1px solid #e5e5e5; -webkit-box-flex: 1; -webkit-flex: 1; -ms-flex: 1; flex: 1;\">\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" style=\"width: 100%; border: 0px solid #e5e5e5; padding: 12px 30px 11px 0; outline: none;\" placeholder=\"请输入密码\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width: 320px; height: 44px; margin: 0px auto; display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript: void(0);\" style=\"width: 100%; height: 44px; line-height: 44px; display: block; color: #fff; background-color: #ff3c3c; border-radius: 5px; -webkit-border-radius: 5px;text-align: center; font-size: 1.4rem;\">登录</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
