<%-- 
    Document   : aide
    Created on : Apr 14, 2014, 2:36:45 PM
    Author     : santiago
--%>
<jsp:include page="header.jsp">
    <jsp:param name="title" value="Accueil" />
</jsp:include>

<div class="page-header">
  <h1>Aide <small>FAQ</small></h1>
</div>
<div class="panel-group" id="accordion">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
          Comment ajouter une personne?
        </a>
      </h4>
    </div>
    <div id="collapseOne" class="panel-collapse collapse in">
      <div class="panel-body">
        C'est très simple!
        <br>Commencez par cliquer sur le menu de gauche sur "créer une personne". Vous aurez accès à une page qui vous permet d'entrer directement le nom, le prénom, l'adresse et la ville d'une personne. Pour enregistrer, appuyez sur: "enregistrer". Si vous souhaitez annuler, cliquez sur "annuler".
      </div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
          Comment afficher toutes les personnes?
        </a>
      </h4>
    </div>
    <div id="collapseTwo" class="panel-collapse collapse">
      <div class="panel-body">
        Excellente question! 
        <br>Pour afficher la liste de toutes les personnes il y a deux possibilités. La première et accessoirement la plus simple, c'est de cliquer sur le menu qui se trouve à gauche sur "Liste des personnes".
        <br>Si vous vous trouvez dans la page "Rechercher des personnes" vous pouvez faire une recherche sans donner de paramètres dans les champs de recherche. Vous aurez donc la liste de toutes les personnes.
      </div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
          C'est quoi cette histoire de points ?
        </a>
      </h4>
    </div>
    <div id="collapseThree" class="panel-collapse collapse">
      <div class="panel-body">
          Tu dois être nouveau par ici si tu n'as jamais entendu parler de points... Laisse moi t'expliquer! 
          <br>A chaque fois que tu te connectes a l'application ou que tu rajoutes une personne a la base de données tu ganes des points, respectivement 1 pour les logins et 5 pour les ajouts.
          <br>La bonne nouvelle dans l'histoire c'est que ces points te seront utiles, tu pourras aller a la cafétéria et profiter de tes points pour avoir des rabais et même des menus offerts! A toi de jouer! 
      </div>
    </div>
  </div>
    <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
          Collapsible Group Item #4
        </a>
      </h4>
    </div>
    <div id="collapseFour" class="panel-collapse collapse">
      <div class="panel-body">
        Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
      </div>
    </div>
  </div>
</div>

<p class="bg-info">Vous avez des idées d'amlioration pour notre application ? N'hésitez pas à nous envoyer un mail à l'adresse <bold>contact@crudpersonnes.ch</bold></p>

<jsp:include page="footer.jsp" />