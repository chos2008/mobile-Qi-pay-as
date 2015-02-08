package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\r\n");
      out.write("<title>Qi支付</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\r\n");
      out.write("\r\n");
      out.write("<style> \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" leftmargin=\"0\" marginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("<div style=\"width: 100%; height: 24px; line-height: 24px; border: 0px solid green; border-bottom: 1px solid green; position: relative;\">\r\n");
      out.write("\t<div style=\"height: 24px; line-height: 24px; position: absolute; right: 0px; top: 0px;\">\r\n");
      out.write("\t\t<ul style=\"height: 24px; line-height: 24px; margin: 0px 0px; padding: 0px 0px; list-style-type: none; list-style-position: outside;\">\r\n");
      out.write("\t\t\t<li class=\"icon-user2\" onclick=\"window.location.href = 'i.jsp';\" style=\"height: 24px; line-height: 24px; width: 14px; margin-left: 2px; margin-right: 2px; float: left;\"></li>\r\n");
      out.write("\t\t\t<li style=\"height: 24px; line-height: 24px; width: 32px; margin-left: 2px; margin-right: 2px; float: left; font-size: 14px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"login.jsp\">登录</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li style=\"height: 24px; line-height: 24px; width: 32px; margin-left: 2px; margin-right: 2px; float: left; font-size: 14px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<a href=\"register.jsp\">注册</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icon-qrcode\" style=\"height: 24px; line-height: 24px; width: 14px; margin-left: 2px; margin-right: 2px; float: left;\"></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"position: absolute; left: 0px; top: 0px; display: block;\">支付中心</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"width: 270px; margin: 0 auto; display: -moz-box; display: -webkit-box; display: box;\">\r\n");
      out.write("<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\">\r\n");
      out.write("<label title=\"visa\" class=\"icon-cc-visa\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("<label style=\"width: 100%; display: block;\">个人服务</label>\r\n");
      out.write("</p>\r\n");
      out.write("<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\">\r\n");
      out.write("<label title=\"vcard\" class=\"icon-vcard\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("<label style=\"width: 100%; display: block;\">安全</label>\r\n");
      out.write("</p>\r\n");
      out.write("<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\">\r\n");
      out.write("<label title=\"master card\" class=\"icon-cc-mastercard\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("<label style=\"width: 100%; display: block;\">商家服务</label>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 100%; height: 120px; border-top-style: solid; border-top-color: green; border-top-width: 1px;\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 100%; height: auto; border: 0px solid green; text-align: center; margin-top: 300px;\">\r\n");
      out.write("\t<label>Qidea 支付接入服务器</label>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 100%; height: 120px; border-top-style: solid; border-top-color: green; border-top-width: 1px;\">\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t<label title=\"paypal\" class=\"icon-paypal\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t<label style=\"width: 100%; display: block;\">paypal</label>\r\n");
      out.write("</p>\r\n");
      out.write("<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t<label title=\"google wallet\" class=\"icon-google-wallet\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t<label style=\"width: 100%; display: block;\">google wallet</label>\r\n");
      out.write("</p>\r\n");
      out.write("<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t<label title=\"stripe\" class=\"icon-cc-stripe\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t<label style=\"width: 100%; display: block;\">stripe</label>\r\n");
      out.write("</p>\r\n");
      out.write("<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t<label title=\"amex\" class=\"icon-cc-amex\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t<label style=\"width: 100%; display: block;\">amex</label>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t<label title=\"discover\" class=\"icon-cc-discover\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t<label style=\"width: 100%; display: block;\">discover</label>\r\n");
      out.write("</p>\r\n");
      out.write("<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t<label title=\"paypal\" class=\"icon-cc-paypal\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t<label style=\"width: 100%; display: block;\">paypal</label>\r\n");
      out.write("</p>\r\n");
      out.write("<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t<label title=\"credit card\" class=\"icon-creditcard\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t<label style=\"width: 100%; display: block;\">credit card</label>\r\n");
      out.write("</p>\r\n");
      out.write("<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t<label title=\"credit card\" class=\"icon-credit-card\" style=\"width: 100%; display: block;\"></label>\r\n");
      out.write("\t<label style=\"width: 100%; display: block;\">credit card</label>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 100%;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 270px; margin: 0 auto; display: -moz-box; display: -webkit-box; display: box;\">\r\n");
      out.write("<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\"><label title=\"visa\" class=\"icon-cc-visa\"></label></p>\r\n");
      out.write("<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\"><label title=\"vcard\" class=\"icon-vcard\"></label></p>\r\n");
      out.write("<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\"><label title=\"master card\" class=\"icon-cc-mastercard\"></label></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright\" style=\"text-align: center;\">\r\n");
      out.write("\t<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t\t\t<a href=\"login.jsp\">登录</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t\t\t<a href=\"register2.jsp\">注册</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;\">\r\n");
      out.write("\t\t<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->\r\n");
      out.write("\t\t<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t\t\t<a href=\"login.jsp\">触屏版</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t\t\t<a href=\"register.jsp\">极速版</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p style=\"width: 70px; height: 36px; text-align: center;\">\r\n");
      out.write("\t\t\t<a href=\"register.jsp\">电脑版</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t正旅网络科技版权所有 2008-2014 <a href=\"#\" target=\"_blank\" seed=\"copyright-link\" smartracker=\"on\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
