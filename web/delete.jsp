<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%@page import="java.sql.*,java.util.*"%>
<%
String idregister=request.getParameter("idregister");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://b784792f5d9787:2e80ccd5@eu-cdbr-west-03.cleardb.net/heroku_35946b7fed5ebe2?reconnect=true", "b784792f5d9787", "2e80ccd5");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM register WHERE idregister="+idregister);
response.sendRedirect("danismanIndex.jsp");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
