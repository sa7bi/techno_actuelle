<%-- 
    Document   : recherchePersonne
    Created on : 24 mars 2014, 13:27:43
    Author     : noemie.pape
--%>

<jsp:include page="header.jsp">
    <jsp:param name="title" value="Recherche des personnes" />
</jsp:include>

<h3 class="text-left">Recherche des personnes</h3>

<form method="GET" class="form-horizontal" action="ServletListePersonne">    
    <div class="form-group">
        <label for="inputNom" class="col-sm-1 control-label">Nom</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Nom"  name="nom">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPrenom" class="col-sm-1 control-label">Prénom</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Prénom" name="prenom">
        </div>
    </div>
    <div class="form-group">
        <label for="inputAdresse" class="col-sm-1 control-label">Adresse</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Adresse"  name="adresse">
        </div>
    </div>
    <div class="form-group">
        <label for="inputVille" class="col-sm-1 control-label">Ville</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" placeholder="Ville" name="ville">
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-3">
            <input type="button" value="Annuler" class="btn btn-default" onClick="javascript:document.location.href = 'index.jsp'" />
            <button type="submit" class="btn btn-primary">Rechercher</button>
        </div>
    </div>
</form>

<jsp:include page="footer.jsp" />
