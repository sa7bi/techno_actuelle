/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import DAO.PersonneDAO;
import Model.Personne;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author santiago
 */
public class ServletPoints extends HttpServlet {

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
        String nom = null, prenom = null, adresse = null, ville = null;
        try {
            HtmlHttpUtils.doHeader("Points", out);

            if (HtmlHttpUtils.isAuthenticate(request)) {
                // afficher le nombre de points de l'utilisateur connecté.
                HttpSession session = request.getSession(true);
                User user = (User) session.getAttribute("user");
                out.println("<div class=\"well well-lg\">Vous avez actuellement:"+ user.getPoints() +"points</div>");
                
                

                PersonneDAO pdao = new PersonneDAO();
                Vector<Personne> v = pdao.research(new Personne(nom, prenom, adresse, ville));

                for (int i = 0; i < v.size(); i++) {
                    Personne p = v.elementAt(i);
                    out.println("<tr>");
                    out.println("<td>" + p.getId() + "</td>");
                    out.println("<td>" + p.getNom() + "</td>");
                    out.println("<td>" + p.getPrenom() + "</td>");
                    out.println("<td>" + p.getAdresse() + "</td>");
                    out.println("<td>" + p.getVille() + "</td>");
                    out.println("<td><button onClick=\"javascript:document.location.href='ServletMAJPersonne?id=" + p.getId() + "'\" type=\"button\" class=\"btn btn-default btn-lg\"><span class=\"glyphicon glyphicon-edit\"></span></button>");
                    out.println("<button onClick=\"javascript:document.location.href='ServletEffacerPersonne?id=" + p.getId() + "'\" type=\"button\" class=\"btn btn-default btn-lg\"><span class=\"glyphicon glyphicon-trash\"></span></button></td>");
                    out.println("</tr>");
                }
                out.println("</tbody>");
                out.println("</table>");
            }
            HtmlHttpUtils.doFooter(out);
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
