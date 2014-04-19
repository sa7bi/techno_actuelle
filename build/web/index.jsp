<%-- 
    Document   : index
    Created on : 4 janv. 2010, 11:23:22
    Author     : termine
--%>



<jsp:include page="header.jsp">
    <jsp:param name="title" value="Accueil" />
</jsp:include>

<div class="jumbotron">
    <div class="container">
        <h1>Gestion des personnes</h1>
        <p>Bienvenue sur l'application de gestion des personnes, cette application vous permettra de g�rer les personnes.</p>
        <p>Si vous �tes coinc�s ou vous rencontrez une difficult�, veuillez consulter <a style="color:#000" href="aide.jsp">la page d'aide.</a></p>
        <br>
        <p>N'oubliez pas, plus vous cr�ez des personnes, plus vous gagnez de points!</p>
        <p><a class="btn btn-primary btn-lg" role="button" href="creationPersonne.jsp">
                <span class="glyphicon glyphicon-user"></span>
                Cr�er une personne
            </a>
        </p>
    </div>
</div>


<jsp:include page="footer.jsp" />