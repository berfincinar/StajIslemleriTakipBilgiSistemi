
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>SCÜ Staj Takip</title>
	<link href="css/danismanİndexTasarim.css" type="text/css" rel="stylesheet"/>
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
       
    
		<li class="list-item"><a href="logOut.jsp"><i class="fas fa-sign-out-alt fa-4x"></i></a> </li>
    </header>
    <br>
    <br>
    <!--İÇ ÇERÇEVE-->
    <div id="duz-cerceve">
        <form method="post" class="STYLE-NAME">
            <table class="ustBaslik">
                <tr class="baslik">
                <td>id</td>
                <td>ogrNo</td>
                <td>İsim</td>
                <td>soyisim</td>
                <td>mail</td>
                <td>bolum</td>
                <td>sınıf</td>
                <td>telNo</td>
                <td>sirketAdi</td>
                <td>Sil</td>
                <td>Düzenle</td>
                </tr>
               </table>
            <table class="ogrenciBilgi">
  <%              
try{
connection = DriverManager.getConnection("jdbc:mysql://b784792f5d9787:2e80ccd5@eu-cdbr-west-03.cleardb.net/heroku_35946b7fed5ebe2?reconnect=true", "b784792f5d9787", "2e80ccd5");
statement=connection.createStatement();
String sql ="select * from register";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
%>
               <!--Ogrenci Bilgi-->
                <tr class="ogrenci">
                    <td><%=resultSet.getString("idregister") %></td>

                    <td><%=resultSet.getString("ogrNo") %></td>
                
                    <td><%=resultSet.getString("isim") %></td>
                
                    <td><%=resultSet.getString("soyisim") %></td>
                
                    <td><%=resultSet.getString("eMail") %></td>
                
                    <td><%=resultSet.getString("bolum") %></td>
                
                    <td><%=resultSet.getString("sinif") %></td>
                
                    <td><%=resultSet.getString("telNo") %></td>
                    
                    <td><%=resultSet.getString("danisman") %></td>
                    
                    <td><%=resultSet.getString("sirketAdi") %></td>
                    
                    <td><a href="delete.jsp?idregister=<%=resultSet.getString("idregister") %>"><button type="button"   class="btn" name="sil">Sil</button></a></td>
                    <td><a href="update.jsp?idregister=<%=resultSet.getString("idregister")%>"><button type="button"  class="btn" name="düzenle">Düzenle</button></a></td>
                </tr>
<%
    i++;
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
            </table>

        </form>
    </div>
   
</body>
</html>
