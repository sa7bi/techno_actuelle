/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import MemoryUser.Utilisateurs;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author termine
 */
public class ServletLogin extends HttpServlet {

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
        String action = null;
        try {
            boolean errorInscription = false;
            boolean errorlogin = false;
            //HtmlHttpUtils.doHeader("Login Page - Gestion de personnes (CRUD)", out);
            action = request.getParameter("action");

            if (action.equals("inscription")) {
                String inscPassword = request.getParameter("passowrd");
                String inscPassword2 = request.getParameter("passowrd2");
                if (!inscPassword.equals(inscPassword2)) {
                    errorInscription = true;
                } else {
                    String nvUser = request.getParameter("nvusername");
                    String nvPassword = request.getParameter("nvpassword");

                    if (Utilisateurs.addUser(nvUser, nvPassword, 0, 0)) {
                        out.println("<p>Bravo..! Votre compte a été crée avec succès");
                        out.println("<a href='login.jsp'>reessayer</a>");
                        out.println("</body></html>");
                    } else {
                        errorInscription = true;
                    }
                }
            } else {
                if (action.equals("connexion")) {
                    username = request.getParameter("username");
                    password = request.getParameter("password");

                    if (Utilisateurs.verifyUser(username, password)) {
                        //CREATION HTTP SESSION
                        //request.getRequestDispatcher("/index.jsp").forward(request, response);
                        HttpSession s = request.getSession(true);
                        User user = Utilisateurs.getUser(username, password);
                        s.setAttribute("user", user);
                        response.sendRedirect("index.jsp");
                    } else {
                        errorlogin = true;
                    }

                }
            }

            if (errorlogin) {
                out.println("<div class=\"alert alert-danger\">Erreur d'authentification, veuillez préciser votre nom d'utilisateur et mot de passe");
                out.println("<a href='login.jsp'>reessayer</a> </div>");
                out.println("</body></html>");
            }
            if (errorInscription) {
                out.println("<p>Erreur d'authentification, veuillez préciser username , password");
                out.println("<a href='login.jsp'>reessayer</a>");
                out.println("</body></html>");
            }

        } catch (IOException e) {
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
