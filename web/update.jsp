
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String idregister = request.getParameter("idregister");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://b784792f5d9787:2e80ccd5@eu-cdbr-west-03.cleardb.net/heroku_35946b7fed5ebe2?reconnect=true";
String userid = "b784792f5d9787";
String password = "2e80ccd5";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%
try{
connection = DriverManager.getConnection("jdbc:mysql://b784792f5d9787:2e80ccd5@eu-cdbr-west-03.cleardb.net/heroku_35946b7fed5ebe2?reconnect=true", "b784792f5d9787", "2e80ccd5");
statement=connection.createStatement();
String sql ="select * from register where idregister="+idregister;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta charset="UTF-8">
       
    <title>SCÜ Staj Takip</title>
    <link href="css/updateTasarim.css" type="text/css" rel="stylesheet"/>
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
		<li class="list-item"><a href="logOut.jsp"><i class="fas fa-edit fa-4x"></i></a> </li>
    </header>
  
    <!--İÇ ÇERÇEVE-->
    <div id="duz-cerceve">
       
        <form method="post" action="updateControl.jsp">
           <label>
            <input type="hidden" name="idregister" value="<%=resultSet.getString("idregister") %>">
            <input type="text" name="idregsiter" value="<%=resultSet.getString("idregister") %>">
          </label>
          
         <label>
        <input  type="text" name="ogrNo" placeholder="OgrenciNo" value="<%=resultSet.getString("ogrNo") %>" />
        </label>

        <label>
        <input type="text" name="isim" placeholder="İsim" value="<%=resultSet.getString("isim") %>"/>
        </label>

        <label>
        <input type="text" name="soyisim" placeholder="Soyisim" value="<%=resultSet.getString("soyisim") %>" />
        </label>

        <label>
        <input  type="text" name="eMail" placeholder="E-Mail" value="<%=resultSet.getString("eMail") %>" />
        </label>

        <label>
        <input  type="text" name="telNo" placeholder="Telefon Numarası"  value="<%=resultSet.getString("telNo") %>"/>
        </label>
        
        <label>
        <input type="text" name="bolum" placeholder="Bölüm"  value="<%=resultSet.getString("bolum") %>"/>
        </label>

        <label>
        <input type="text" name="sinif" placeholder="Sınıf" value="<%=resultSet.getString("sinif") %>" />
        </label>
        
         <label>
        <input type="text" name="sirketAdi" placeholder="Şirket Adı" value="<%=resultSet.getString("sirketAdi") %>" />
        </label>
        
          <label>
        <input type="text" name="danisman" placeholder="Danışman" value="<%=resultSet.getString("danisman") %>" />
        </label>

        <div id="duzenle"><input type="submit" value="Düzenle"></div>
        </form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
    </div>
</body>
</html>
