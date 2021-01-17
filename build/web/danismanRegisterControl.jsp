<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<%  request.setCharacterEncoding("UTF-8");
    String ogretmenIsimSoyisim = request.getParameter("ogretmenIsimSoyisim");
    String ogretmenBolum = request.getParameter("ogretmenBolum");
    String ogretmenAlan = request.getParameter("ogretmenAlan");
    String sifre = request.getParameter("sifre");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdb?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&characterEncoding=UTF-8", "root", "0658.Hadise");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into ogretmenbilgi(ogretmenIsimSoyisim, ogretmenBolum, ogretmenAlan, sifre) values ('" + ogretmenIsimSoyisim + "','" + ogretmenBolum + "','" + ogretmenAlan + "','" + sifre + "')");
    if (i > 0) {
        //session.setAttribute("ogretmenIsimSoyisim", ogretmenIsimSoyisim);
        
        response.sendRedirect("danismanLogin.jsp");
       
    } else {
        response.sendRedirect("danismanRegister.jsp");
    }
%>