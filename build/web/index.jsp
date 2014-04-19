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
        <p>Bienvenue sur l'application de gestion des personnes, cette application vous permettra de gérer les personnes.</p>
        <p>Si vous êtes coincés ou vous rencontrez une difficulté, veuillez consulter <a style="color:#000" href="aide.jsp">la page d'aide.</a></p>
        <br>
        <p>N'oubliez pas, plus vous créez des personnes, plus vous gagnez de points!</p>
        <p><a class="btn btn-primary btn-lg" role="button" href="creationPersonne.jsp">
                <span class="glyphicon glyphicon-user"></span>
                Créer une personne
            </a>
        </p>
    </div>
</div>


<jsp:include page="footer.jsp" />