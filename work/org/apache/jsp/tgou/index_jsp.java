package org.apache.jsp.tgou;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>天天购-随意购，随处购</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 100%;\">\r\n");
      out.write("\t<div style=\"width: 270px; margin: 0 auto; display: -moz-box; display: -webkit-box; display: box;\">\r\n");
      out.write("\t\t<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\"><label title=\"天猫\" class=\"icon-cc-visa\">天猫</label></p>\r\n");
      out.write("\t\t<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\"><label title=\"1号店\" class=\"icon-vcard\">1号店</label></p>\r\n");
      out.write("\t\t<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\"><label title=\"京东\" class=\"icon-cc-mastercard\">京东</label></p>\r\n");
      out.write("\t\t<p style=\"height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;\"><label title=\"淘宝\" class=\"icon-cc-mastercard\">淘宝</label></p>\r\n");
      out.write("\t</div>\r\n");
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
