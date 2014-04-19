/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ranjit.kumar
 */
public class ServletProfil extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String username = null, password = null;

        try {
            HtmlHttpUtils.doHeader("Profil", out);
            if (HtmlHttpUtils.isAuthenticate(request)) {

                out.println("<h3>Profil</h3><br>");

                username = request.getParameter("username");
                password = request.getParameter("password");

                out.println("<form method='GET' class=\"form-horizontal\" action='ServletFaireMAJProfil'>");

                out.println("<input type='hidden' name='oldUsername' value='" + username + "'><br>");
                
                out.println("<div class=\"form-group\">");
                out.println("<label for=\"inputUsername\" class=\"col-sm-1 control-label\">Nom d'utilisateur</label>");
                out.println("<div class=\"col-sm-4\">");
                out.println("<input type=\"text\" class=\"form-control\" value='" + username + "' width=\"80%\" name=\"inputUsername\">");
                out.println("</div>");
                out.println("</div>");

                out.println("<div class=\"form-group\">");
                out.println("<label for=\"inputPassword\" class=\"col-sm-1 control-label\">Mot de passe</label>");
                out.println("<div class=\"col-sm-4\">");
                out.println("<input type=\"password\" class=\"form-control\" value='" + password + "' width=\"80%\" name=\"inputPassword\">");
                out.println("</div>");
                out.println("</div>");

                out.println("<div class=\"form-group\">");
                out.println("<div class=\"col-sm-offset-1 col-sm-3\">");
                out.println("<input type=\"button\" value=\"Annuler\" class=\"btn btn-default\" onClick=\"javascript:document.location.href='index.jsp'\" />");
                out.println("<button type=\"submit\" class=\"btn btn-primary\">Mettre à jour</button>");
                out.println("</div>");
                out.println("</div>");

                out.println("</form>");

                HtmlHttpUtils.doFooter(out);
            }
        } finally {
            out.close();
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
        processRequest(request, response);
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
