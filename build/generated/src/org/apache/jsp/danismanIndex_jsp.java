package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class danismanIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String id = request.getParameter("userid");
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   <title>SCÜ Staj Takip</title>\n");
      out.write("\t<link href=\"css/danismanİndexTasarim.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("\t<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("     \n");
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
      out.write("       \n");
      out.write("    \n");
      out.write("\t\t<li class=\"list-item\"><a href=\"logOut.jsp\"><i class=\"fas fa-sign-out-alt fa-4x\"></i></a> </li>\n");
      out.write("    </header>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <!--İÇ ÇERÇEVE-->\n");
      out.write("    <div id=\"duz-cerceve\">\n");
      out.write("        <form method=\"post\" class=\"STYLE-NAME\">\n");
      out.write("            <table class=\"ustBaslik\">\n");
      out.write("                <tr class=\"baslik\">\n");
      out.write("                <td>id</td>\n");
      out.write("                <td>ogrNo</td>\n");
      out.write("                <td>İsim</td>\n");
      out.write("                <td>soyisim</td>\n");
      out.write("                <td>mail</td>\n");
      out.write("                <td>bolum</td>\n");
      out.write("                <td>sınıf</td>\n");
      out.write("                <td>telNo</td>\n");
      out.write("                <td>Sil</td>\n");
      out.write("                <td>Düzenle</td>\n");
      out.write("                </tr>\n");
      out.write("               </table>\n");
      out.write("            <table class=\"ogrenciBilgi\">\n");
      out.write("  ");
              
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");
statement=connection.createStatement();
String sql ="select * from register";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){

      out.write("\n");
      out.write("               <!--Ogrenci Bilgi-->\n");
      out.write("                <tr class=\"ogrenci\">\n");
      out.write("                    <td>");
      out.print(resultSet.getString("idregister") );
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(resultSet.getString("ogrNo") );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                    <td>");
      out.print(resultSet.getString("isim") );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                    <td>");
      out.print(resultSet.getString("soyisim") );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                    <td>");
      out.print(resultSet.getString("eMail") );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                    <td>");
      out.print(resultSet.getString("bolum") );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                    <td>");
      out.print(resultSet.getString("sinif") );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                    <td>");
      out.print(resultSet.getString("telNo") );
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                    <td><a href=\"delete.jsp?idregister=");
      out.print(resultSet.getString("idregister") );
      out.write("\"><button class=\"btn\" name=\"sil\">Sil</button></a></td>\n");
      out.write("                    <td><a href=\"update.jsp\"><button class=\"btn\" name=\"düzenle\">Düzenle</button></a></td>\n");
      out.write("                </tr>\n");

    i++;
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("   \n");
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
