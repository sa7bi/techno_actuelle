/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author termine
 */
public class HtmlHttpUtils {

    public static void doHeader(String titre, PrintWriter out) {
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/design.css\">");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/default.css\" />");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />");
        out.println("<script src=\"js/modernizr.custom.js\"></script>");
        out.println("<title>" + titre + "</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<nav class=\"navbar navbar-default\" role=\"navigation\">");
        out.println("<p class=\"navbar-text navbar-right\">Connecté en tant que <a href=\"#\" class=\"navbar-link\">[PAS ENCORE CONNECTE]</a></p>");
        out.println("</nav>");
        out.println("<nav class=\"cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left cbp-spmenu-open\" id=\"cbp-spmenu-s1\">");
        out.println("<h3>GESTION DES PERSONNES</h3>");
        out.println("<a href=\"index.jsp\">Accueil</a>");
        out.println("<a href=\"recherchePersonne.jsp\">Rechercher des personnes</a>");
        out.println("<a href=\"creationPersonne.jsp\">Créer une personne</a>");
        out.println("</nav>");
        out.println("<div id=\"content\">");
    }

    public static void doFooter(PrintWriter out) {
        out.println("</div>");
        out.println("<div><a href='index.jsp'>index</a> &nbsp;<a href='ServletLogout'>logout</a></div>");
        out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>");
        out.println("<script src=\"js/bootstrap.min.js\"></script>");
        out.println("</body>");
        out.println("</html>");
    }

    public static boolean isAuthenticate(HttpServletRequest request) {
        return request.getSession(false).getAttribute("username") != null;
    }

}
