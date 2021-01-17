<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%
    String ogrNo = request.getParameter("ogrNo");    
    String sifre = request.getParameter("sifre");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");
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