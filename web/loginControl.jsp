<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%
    String ogrNo = request.getParameter("ogrNo");    
    String sifre = request.getParameter("sifre");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://b784792f5d9787:2e80ccd5@eu-cdbr-west-03.cleardb.net/heroku_35946b7fed5ebe2?reconnect=true", "b784792f5d9787", "2e80ccd5");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from register where ogrNo='" + ogrNo + "' and sifre='" + sifre + "'");
    if (rs.next()) {
        session.setAttribute("ogrNo", ogrNo);
        response.sendRedirect("hosgeldiniz.jsp");
    } else {
        response.sendRedirect("kullaniciGiris.jsp");
    }
%> 