package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String idregister = request.getParameter("idregister");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "registerdb";
String userid = "root";
String password = "0658.Hadise";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write('\n');

try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");
statement=connection.createStatement();
String sql ="select * from register where idregister="+idregister;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("       \n");
      out.write("    <title>SCÜ Staj Takip</title>\n");
      out.write("    <link href=\"css/updateTasarim.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("\t<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\n");
      out.write("   </head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <img src=\"images/logo1.png\" width=\"120px\" height=\"120px\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <nav class=\"nav\">\n");
      out.write("            <ul class=\"main-list\">\n");
      out.write("            \t<p class=\"Baslik\" style=\"font-size: 30px\">Sivas Cumhuriyet Üniversitesi <br> Staj Takip Sistemi</p>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\t\t<li class=\"list-item\"><a href=\"logOut.jsp\"><i class=\"fas fa-edit fa-4x\"></i></a> </li>\n");
      out.write("    </header>\n");
      out.write("  \n");
      out.write("    <!--İÇ ÇERÇEVE-->\n");
      out.write("    <div id=\"duz-cerceve\">\n");
      out.write("       \n");
      out.write("        <form method=\"post\" action=\"updateControl.jsp\">\n");
      out.write("           <label>\n");
      out.write("            <input type=\"hidden\" name=\"idregister\" value=\"");
      out.print(resultSet.getString("idregister") );
      out.write("\">\n");
      out.write("            <input type=\"text\" name=\"idregsiter\" value=\"");
      out.print(resultSet.getString("idregister") );
      out.write("\">\n");
      out.write("          </label>\n");
      out.write("          \n");
      out.write("         <label>\n");
      out.write("        <input  type=\"text\" name=\"ogrNo\" placeholder=\"OgrenciNo\" value=\"");
      out.print(resultSet.getString("ogrNo") );
      out.write("\" />\n");
      out.write("        </label>\n");
      out.write("\n");
      out.write("        <label>\n");
      out.write("        <input type=\"text\" name=\"isim\" placeholder=\"İsim\" value=\"");
      out.print(resultSet.getString("isim") );
      out.write("\"/>\n");
      out.write("        </label>\n");
      out.write("\n");
      out.write("        <label>\n");
      out.write("        <input type=\"text\" name=\"soyisim\" placeholder=\"Soyisim\" value=\"");
      out.print(resultSet.getString("soyisim") );
      out.write("\" />\n");
      out.write("        </label>\n");
      out.write("\n");
      out.write("        <label>\n");
      out.write("        <input  type=\"text\" name=\"eMail\" placeholder=\"E-Mail\" value=\"");
      out.print(resultSet.getString("eMail") );
      out.write("\" />\n");
      out.write("        </label>\n");
      out.write("\n");
      out.write("        <label>\n");
      out.write("        <input  type=\"text\" name=\"telNo\" placeholder=\"Telefon Numarası\"  value=\"");
      out.print(resultSet.getString("telNo") );
      out.write("\"/>\n");
      out.write("        </label>\n");
      out.write("        \n");
      out.write("        <label>\n");
      out.write("        <input type=\"text\" name=\"bolum\" placeholder=\"Bölüm\"  value=\"");
      out.print(resultSet.getString("bolum") );
      out.write("\"/>\n");
      out.write("        </label>\n");
      out.write("\n");
      out.write("        <label>\n");
      out.write("        <input type=\"text\" name=\"sinif\" placeholder=\"Sınıf\" value=\"");
      out.print(resultSet.getString("sinif") );
      out.write("\" />\n");
      out.write("        </label>\n");
      out.write("        \n");
      out.write("          <label>\n");
      out.write("        <input type=\"text\" name=\"danisman\" placeholder=\"Danışman\" value=\"");
      out.print(resultSet.getString("danisman") );
      out.write("\" />\n");
      out.write("        </label>\n");
      out.write("\n");
      out.write("        <div id=\"duzenle\"><input type=\"submit\" value=\"Düzenle\"></div>\n");
      out.write("        </form>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
