<%-- 
    Document   : logOut
    Created on : 16.Oca.2021, 04:11:57
    Author     : Hadise
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
session.invalidate();
response.sendRedirect("kullaniciGiris.jsp");
%>
