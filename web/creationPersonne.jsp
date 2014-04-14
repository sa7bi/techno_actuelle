<%-- 
    Document   : creationPersonne
    Created on : 24 mars 2014, 13:11:37
    Author     : noemie.pape
--%>

<%@page import="Model.Personne"%>
<%@page import="DAO.PersonneDAO"%>

<jsp:include page="header.jsp">
    <jsp:param name="title" value="Créer une personne" />
</jsp:include>

<form method="GET" class="form-horizontal" action="ServletCreationPersonne">
    <h1 class="text-left"> Création d'une personne </h1>
    <div class="form-group">
        <label for="inputNom" class="col-sm-1 control-label">Nom</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Entrez votre nom" width="80%" name="nom">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPrenom" class="col-sm-1 control-label">Prénom</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Entrez votre prénom" width="80%" name="prenom">
        </div>
    </div>
    <div class="form-group">
        <label for="inputAdresse" class="col-sm-1 control-label">Adresse</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Entrez votre adresse" width="80%" name="adresse">
        </div>
    </div>
    <div class="form-group">
        <label for="inputVille" class="col-sm-1 control-label">Ville</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Entrez votre ville" width="80%" name="ville">
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-3">
            <input type="button" value="Annuler" class="btn btn-default" onClick="javascript:document.location.href = 'index.jsp'" />
            <button type="submit" class="btn btn-primary">Enregistrer</button>
        </div>
    </div>
</form>

<jsp:include page="footer.jsp" />