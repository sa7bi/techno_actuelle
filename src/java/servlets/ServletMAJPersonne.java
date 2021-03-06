package servlets;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import DAO.PersonneDAO;
import Model.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author termine
 */
public class ServletMAJPersonne extends HttpServlet {

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
        try {
            HtmlHttpUtils.doHeader("Edition d'une personne", out);
            if (HtmlHttpUtils.isAuthenticate(request)) {
                Long idl = null;
                String id = request.getParameter("id");

                out.println("<h3>Edition d'une personne</h3><br>");

                if (id != null) {
                    if (!id.equals("")) {

                        PersonneDAO pdao = new PersonneDAO();
                        idl = new Long(id);

                        Vector<Personne> v = pdao.research(new Personne(idl, null, null, null, null));

                        for (int i = 0; i < v.size(); i++) {//UN SEULEMENT
                            Personne p = v.elementAt(i);
                            out.println("<form method='GET' class=\"form-horizontal\" action='ServletFaireMAJPersonne'>");
                            out.println("<input type='hidden' name='id' value='" + p.getId() + "'><br>");

                            out.println("<div class=\"form-group\">");
                            out.println("<label for=\"inputId\" class=\"col-sm-1 control-label\">Id</label>");
                            out.println("<div class=\"col-sm-4\">");
                            out.println("<input type=\"text\" class=\"form-control\" value='" + p.getId() + "' DISABLED width=\"80%\" name=\"inputId\">");
                            out.println("</div>");
                            out.println("</div>");

                            out.println("<div class=\"form-group\">");
                            out.println("<label for=\"inputNom\" class=\"col-sm-1 control-label\">Nom</label>");
                            out.println("<div class=\"col-sm-4\">");
                            out.println("<input type=\"text\" class=\"form-control\" value='" + p.getNom() + "' width=\"80%\" name=\"inputNom\">");
                            out.println("</div>");
                            out.println("</div>");

                            out.println("<div class=\"form-group\">");
                            out.println("<label for=\"inputPrenom\" class=\"col-sm-1 control-label\">Prénom</label>");
                            out.println("<div class=\"col-sm-4\">");
                            out.println("<input type=\"text\" class=\"form-control\" value='" + p.getPrenom() + "' width=\"80%\" name=\"inputPrenom\">");
                            out.println("</div>");
                            out.println("</div>");

                            out.println("<div class=\"form-group\">");
                            out.println("<label for=\"inputAdresse\" class=\"col-sm-1 control-label\">Adresse</label>");
                            out.println("<div class=\"col-sm-4\">");
                            out.println("<input type=\"text\" class=\"form-control\" value='" + p.getAdresse() + "' width=\"80%\" name=\"inputAdresse\">");
                            out.println("</div>");
                            out.println("</div>");

                            out.println("<div class=\"form-group\">");
                            out.println("<label for=\"inputVille\" class=\"col-sm-1 control-label\">Ville</label>");
                            out.println("<div class=\"col-sm-4\">");
                            out.println("<input type=\"text\" class=\"form-control\" value='" + p.getVille() + "' width=\"80%\" name=\"inputVille\">");
                            out.println("</div>");
                            out.println("</div>");

                            out.println("<div class=\"form-group\">");
                            out.println("<div class=\"col-sm-offset-1 col-sm-3\">");
                            out.println("<input type=\"button\" value=\"Annuler\" class=\"btn btn-default\" onClick=\"javascript:document.location.href='index.jsp'\" />");
                            out.println("<button type=\"submit\" class=\"btn btn-primary\">MAJ personne</button>");
                            out.println("</div>");
                            out.println("</div>");

                            out.println("</form>");

                        }
                    }
                }
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
