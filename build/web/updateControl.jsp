<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/registerdb";%>
<%!String user = "root";%>
<%!String psw = "0658.Hadise";%>
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
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");
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
