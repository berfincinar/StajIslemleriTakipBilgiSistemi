<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%  request.setCharacterEncoding("UTF-8");
    String ogretmenIsimSoyisim = request.getParameter("ogretmenIsimSoyisim");    
    String sifre = request.getParameter("sifre");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from ogretmenbilgi where ogretmenIsimSoyisim='" + ogretmenIsimSoyisim + "' and sifre='" + sifre + "'");
    if (rs.next()) {
        //session.setAttribute("ogretmenIsimSoyisim", ogretmenIsimSoyisim);
        response.sendRedirect("danismanIndex.jsp");
    } else {
        response.sendRedirect("danismanLogin.jsp");
    }
%>