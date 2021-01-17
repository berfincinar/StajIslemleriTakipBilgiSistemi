<%-- 
    Document   : isletmeBilgi
    Created on : 29.Ara.2020, 20:43:19
    Author     : Hadise
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
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
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>SCÜ Staj Takip</title>
	<link href="css/isletmeTasarim.css" type="text/css" rel="stylesheet"/>
	<link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
</head>
<body>
   <header class="header">

        <div class="logo">
            <img src="images/logo1.png" width="120px" height="120px">
        </div>

        <nav class="nav">
            <ul class="main-list">
            	<p class="Baslik" style="font-size: 30px">Sivas Cumhuriyet Üniversitesi <br> Staj Takip Sistemi</p>
            </ul>
        </nav>
       
        <!--AÇILIR MENÜ -->
		<li class="list-item"><a href="logOut.jsp"><i class="fas fa-sign-out-alt fa-4x"></i></a>
                    
                </li>
    </header>
    <br>
    <br>
    <!--İÇ ÇERÇEVE-->
    <div id="duz-cerceve">
        <!--SOL MENU-->
        <ul class="saolMenu">
            <li><a href="#">&nbsp;&nbsp;<center><i class="fas fa-user fa-4x"></i></center></a></li>

            <li><a href="hosgeldiniz.jsp">&nbsp;&nbsp;<center><i class="fas fa-home"></i> &nbsp;&nbsp;Ana sayfa</center></a></li>

            <li><a href="ogrenciBilgi.jsp"><center><i class="fas fa-user"></i> &nbsp;&nbsp;Öğrenci Bilgi</center></a></li>

            <li><a href="isletmeBilgi.jsp"><center><i class="fas fa-building"></i> &nbsp;&nbsp;İşletme Bilgi</center></a></li>

            <li><a href="ogretmenBilgi.jsp"><center>&nbsp;<i class="fas fa-user-tie"></i>
             &nbsp;&nbsp;Öğretmen Bilgi</center></a></li>

            <li><a href="stajDefteri.jsp"><center><i class="fas fa-book-open"></i> &nbsp;&nbsp;Staj Defteri</center></a></li>
        </ul>
  <!--ARAMA ÇUBUĞU-->
        <div id="aramaButonu">
         <form>
            <div id="box">
            <input type="text" id="search" placeholder="Ara..">
            <i class="fa fa-search"></i>
            </div>
        </form>
    </div>
    <!--Bılgı Menusu-->
    <div id="bilgiBoard">
        
        <!-- UstBanner-->
        <ul class="ustBanner">

            <li><a href="#"><center> İşletme Bilgi</center></a></li>   
        </ul>

         <ul class="isletmeBilgileri">
          
            <li><a href="#"><center>Şirket Adı:</center></a></li>

        </ul>
        
        <form action="" method="post" class="STYLE-NAME">
        
        <table >
            <%
try{
String ogrNo =(String) session.getAttribute("ogrNo");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");
statement=connection.createStatement();
ResultSet rs;
Statement st =connection.createStatement();
    rs = st.executeQuery("select * from register where ogrNo='" + ogrNo + "'");
    if (rs.next()) {
%>

                <tr>
                    <td><%=rs.getString("sirketAdi") %></td>
                </tr>
               
            </table>
<%
}
connection.close();
} catch (Exception e) {
System.out.println(e.getMessage());
}
%> 
        </form>
    </div>
</div>
</body>
</html>
