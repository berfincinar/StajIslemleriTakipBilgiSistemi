package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class danismanİndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   <title>SCÜ Staj Takip</title>\n");
      out.write("\t<link href=\"css/anaSayfaTasarim.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
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
      out.write("        <!--SOL MENU-->\n");
      out.write("        <ul class=\"saolMenu\">\n");
      out.write("            <li><a href=\"#\">&nbsp;&nbsp;<center><i class=\"fas fa-user fa-4x\"></i></center></a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"hosgeldiniz.jsp\">&nbsp;&nbsp;<center><i class=\"fas fa-home\"></i> &nbsp;&nbsp;Ana sayfa</center></a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"ogrenciBilgi.jsp\"><center><i class=\"fas fa-user\"></i> &nbsp;&nbsp;Öğrenci Bilgi</center></a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"isletmeBilgi.jsp\"><center><i class=\"fas fa-building\"></i> &nbsp;&nbsp;İşletme Bilgi</center></a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"ogretmenBilgi.jsp\"><center>&nbsp;<i class=\"fas fa-user-tie\"></i>\n");
      out.write("             &nbsp;&nbsp;Öğretmen Bilgi</center></a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"stajDefteri.jsp\"><center><i class=\"fas fa-book-open\"></i> &nbsp;&nbsp;Staj Defteri</center></a></li>\n");
      out.write("        </ul>\n");
      out.write("  <!--ARAMA ÇUBUĞU-->\n");
      out.write("        <div id=\"aramaButonu\">\n");
      out.write("         <form>\n");
      out.write("            <div id=\"box\">\n");
      out.write("            <input type=\"text\" id=\"search\" placeholder=\"Ara..\">\n");
      out.write("            <i class=\"fa fa-search\"></i>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Cumhuriyet Üniversitesi Logo-->\n");
      out.write("    <div id=\"HGCumhuriyet\">\n");
      out.write("        <img src=\"images/logo1.png\">\n");
      out.write("         <p class=\"SCÜ\">Sivas<br>Cumhuriyet Üniversitesi</p>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("    <!--SOSYALMEDYA-->\n");
      out.write("    <div id=\"sosyalMedya\">\n");
      out.write("        <li class=\"sosyal\"><b><a href=\"https://www.cumhuriyet.edu.tr\" ><i class=\"fab fa-chrome fa-2x\"style=\"color:black\">\n");
      out.write("        </i> &nbsp;&nbsp;www.cumhuriyet.edu.tr</a></li>\n");
      out.write("        \n");
      out.write("        <li class=\"instagram\"><b><a href=\"https://www.instagram.com/cumunivkurumsal/\" >\n");
      out.write("        <i class=\"fab fa-instagram fa-2x\"style=\"color:black\"></i> &nbsp;&nbsp;cumunivkurumsal</a></li>\n");
      out.write("        \n");
      out.write("        <li class=\"twitter\"><b><a href=\"https://twitter.com/cumunivkurumsal\" >\n");
      out.write("        <i class=\"fab fa-twitter fa-2x\"style=\"color:black\"></i> &nbsp;&nbsp;cumunivkurumsal</a></li>\n");
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
