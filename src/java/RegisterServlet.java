/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
        private registerDao rDao = new registerDao();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.getWriter().append("Served at:").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
        dispatcher.forward(request, response);
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
                request.setCharacterEncoding("UTF-8");
                
                String ogrNo = request.getParameter("ogrNo");
                String sifre = request.getParameter("sifre");
                String isim = request.getParameter("isim");
                String soyisim = request.getParameter("soyisim");
                String eMail = request.getParameter("eMail");
                String telNo = request.getParameter("telNo");
                String dogumTarihi = request.getParameter("dogumTarihi");
                String bolum = request.getParameter("bolum");
                String sinif = request.getParameter("sinif");
                String sirketAdi = request.getParameter("sirketAdi");
                
                RegisterBean rb = new RegisterBean();
                
                rb.setBolum(bolum);
                rb.setDogumTarihi(dogumTarihi);
                rb.setIsim(isim);
                rb.setOgrNo(ogrNo);
                rb.setSifre(sifre);
                rb.setSoyisim(soyisim);
                rb.setTelNo(telNo);
                rb.seteMail(eMail);
                rb.setSinif(sinif);
                rb.setSirketAdi(sirketAdi);
                
            try {
                rDao.registerStudent(rb);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
              RequestDispatcher dispatcher = request.getRequestDispatcher("kullaniciGiris.jsp");
                dispatcher.forward(request, response);
                
           
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

