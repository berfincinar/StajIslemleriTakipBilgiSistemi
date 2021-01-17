<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://b784792f5d9787:2e80ccd5@eu-cdbr-west-03.cleardb.net/heroku_35946b7fed5ebe2?reconnect=true";%>
<%!String user = "b784792f5d9787";%>
<%!String psw = "2e80ccd5";%>
<%
    request.setCharacterEncoding("UTF-8");
String idregister = request.getParameter("idregister");
String ogrNo=request.getParameter("ogrNo");
String isim=request.getParameter("isim");
String soyisim=request.getParameter("soyisim");
String eMail=request.getParameter("eMail");
String telNo=request.getParameter("telNo");
String bolum=request.getParameter("bolum");
String sinif=request.getParameter("sinif");
String danisman=request.getParameter("danisman");
String sirketAdi=request.getParameter("sirketAdi");
if(idregister != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(idregister);
try
{
Class.forName(driverName);
con = DriverManager.getConnection("jdbc:mysql://b784792f5d9787:2e80ccd5@eu-cdbr-west-03.cleardb.net/heroku_35946b7fed5ebe2?reconnect=true", "b784792f5d9787", "2e80ccd5");
String sql="Update register set ogrNo=?,isim=?,soyisim=?,eMail=?,telNo=?,bolum=?,sinif=?,danisman=?,sirketAdi=?where idregister="+idregister;
ps = con.prepareStatement(sql);

ps.setString(1, ogrNo);
ps.setString(2, isim);
ps.setString(3, soyisim);
ps.setString(4, eMail);
ps.setString(5, telNo);
ps.setString(6, bolum);
ps.setString(7, sinif);
ps.setString(8, danisman);
ps.setString(9, sirketAdi);
int i = ps.executeUpdate();
if(i > 0)
{
response.sendRedirect("danismanIndex.jsp");
}
else
{
response.sendRedirect("update.jsp");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>
