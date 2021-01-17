package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kullaniciGiris_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>SCÜ Staj Takip</title>\n");
      out.write("\t<link href=\"css/tasarim.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">-->\n");
      out.write("\t<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header class=\"header\">\n");
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
      out.write("\t\t<li class=\"list-item\"><a href=\"#\"><i class=\"fas fa-user fa-4x\"></i></a></li>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!--KULLANICI GİRİŞ-->\n");
      out.write("    <div id=\"kullaniciGiris\">\n");
      out.write("    \t<center><h2>Öğrenci Giriş Paneli</h2></center>\n");
      out.write("\n");
      out.write("        <form action=\"loginControl.jsp\" method=\"post\">\n");
      out.write("    \t<li class=\"list-item\"><a href=\"#\"><i class=\"far fa-user-circle fa-4x\" style=\"color: black\"></i></a></li>\n");
      out.write("    \t<div id=\"kullaniciAdi\"> <input type=\"text\" name=\"ogrNo\" placeholder=\"Öğrenci Numarası\" style=\"text-align: center;\"></div>\n");
      out.write("    \t\n");
      out.write("    \t<li class=\"list-item\"><a href=\"#\"><i class=\"fas fa-lock fa-4x\"style=\"color: black\"></i></a></li>\n");
      out.write("    \t<div id=\"sifre\"><input type=\"password\" name=\"sifre\"  placeholder=\"Şifre\"  style=\"text-align: center;\"></div>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <!--GirişYap Butonu-->\n");
      out.write("        <div id=\"girisYap\"><input type=\"submit\" value=\"Giriş Yap\"></div>\n");
      out.write("       \n");
      out.write("        <!--KayıtOl Butonu-->\n");
      out.write("        <div id=\"kayıtOl\"><a href=\"register.jsp\"><p>Ogrenci Kayıt</p></a></div>\n");
      out.write("        <div id=\"danismanKayit\"><a href=\"danismanRegister.jsp\"><p>Danışman Kayıt</p></a></div>\n");
      out.write("    \t</form>\n");
      out.write("\n");
      out.write("        \n");
      out.write("<!--BeniHatırla Butonu-->\n");
      out.write("    \t<label class=\"container\"> Beni Hatırla\n");
      out.write("  \t\t<input type=\"checkbox\" checked=\"checked\">\n");
      out.write("  \t\t<span class=\"checkmark\"></span></label>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!--SOSYALMEDYA-->\n");
      out.write("    <div id=\"sosyalMedya\">\n");
      out.write("    \t<li class=\"sosyal\"><b><a href=\"https://www.cumhuriyet.edu.tr\" ><i class=\"fab fa-chrome fa-2x\"style=\"color:black\">\n");
      out.write("    \t</i> &nbsp;&nbsp;www.cumhuriyet.edu.tr</a></li>\n");
      out.write("\t\t\n");
      out.write("\t\t<li class=\"instagram\"><b><a href=\"https://www.instagram.com/cumunivkurumsal/\" >\n");
      out.write("    \t<i class=\"fab fa-instagram fa-2x\"style=\"color:black\"></i> &nbsp;&nbsp;cumunivkurumsal</a></li>\n");
      out.write("    \t\n");
      out.write("    \t<li class=\"twitter\"><b><a href=\"https://twitter.com/cumunivkurumsal\" >\n");
      out.write("    \t<i class=\"fab fa-twitter fa-2x\"style=\"color:black\"></i> &nbsp;&nbsp;cumunivkurumsal</a></li>\n");
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
