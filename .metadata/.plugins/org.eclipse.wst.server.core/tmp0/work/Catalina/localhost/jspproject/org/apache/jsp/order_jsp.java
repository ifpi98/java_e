/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-10 05:37:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <h1>인터넷 프로그래머 문고</h1>\r\n");
      out.write("  <h3>제목을 입력하세요:</h3>\r\n");
      out.write("  <form method=\"post\">\r\n");
      out.write("     책 제목:    <input type=\"text\" name=\"title\"><br>\r\n");
      out.write("    <input type=\"submit\" value=\"검색\">\r\n");
      out.write("  </form>\r\n");
      out.write(" \r\n");
      out.write("  ");

    String title = request.getParameter("title");

    if (title != null) {
  
      out.write("\r\n");
      out.write("  ");

     Class.forName("com.mysql.jdbc.Driver");

     Connection conn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/testdb?useSSL=false", "root", "1234"); 
     Statement stmt = conn.createStatement();
 
     String sqlStr = "SELECT * FROM books WHERE title LIKE ";
     /* String encodedTitle = java.net.URLEncoder.encode(title, "UTF-8"); */
	 sqlStr += "'%" + title +"%'";
     sqlStr += "ORDER BY title ASC";
     ResultSet rset = stmt.executeQuery(sqlStr);
  
      out.write("\r\n");
      out.write("      <hr>\r\n");
      out.write("      <form method=\"post\" action=\"orderproc.jsp\">\r\n");
      out.write("        <table border=2>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>주문</th>\r\n");
      out.write("            <th>저자</th>\r\n");
      out.write("            <th>제목</th>\r\n");
      out.write("            <th>가격</th>\r\n");
      out.write("            <th>수량</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("  ");

      while (rset.next()) {
        int id = rset.getInt("id");
  
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><input type=\"checkbox\" name=\"id\" value=\"");
      out.print( id );
      out.write("\"></td>\r\n");
      out.write("            <td>");
      out.print( rset.getString("author") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( rset.getString("title") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print( rset.getInt("price") );
      out.write("원</td>\r\n");
      out.write("            <td>");
      out.print( rset.getInt("qty") );
      out.write("권</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("  ");

      }
  
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" value=\"주문\">\r\n");
      out.write("        <input type=\"reset\" value=\"초기화\">\r\n");
      out.write("      </form>\r\n");
      out.write("      <a href=\"");
      out.print( request.getRequestURI() );
      out.write("\"><h3>다시 주문하기</h3></a>\r\n");
      out.write("  ");

      rset.close();
      stmt.close();
      conn.close();
    }
  
      out.write("\r\n");
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
