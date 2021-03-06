<%-- 
    Document   : creationPersonne
    Created on : 24 mars 2014, 13:11:37
    Author     : noemie.pape
--%>

<%@page import="Model.Personne"%>
<%@page import="DAO.PersonneDAO"%>

<jsp:include page="header.jsp">
    <jsp:param name="title" value="Cr�er une personne" />
</jsp:include>

<h3 class="text-left"> Cr�ation d'une personne </h3>

<form method="GET" class="form-horizontal" action="ServletCreationPersonne">   
    <div class="form-group">
        <label for="inputNom" class="col-sm-1 control-label">Nom</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Entrez votre nom" name="nom">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPrenom" class="col-sm-1 control-label">Pr�nom</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Entrez votre pr�nom" name="prenom">
        </div>
    </div>
    <div class="form-group">
        <label for="inputAdresse" class="col-sm-1 control-label">Adresse</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Entrez votre adresse" name="adresse">
        </div>
    </div>
    <div class="form-group">
        <label for="inputVille" class="col-sm-1 control-label">Ville</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Entrez votre ville" name="ville">
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