<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%@page import="java.sql.*,java.util.*"%>
<%
String idregister=request.getParameter("idregister");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");
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
