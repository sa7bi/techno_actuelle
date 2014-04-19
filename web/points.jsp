<%-- 
    Document   : points
    Created on : Apr 14, 2014, 3:11:38 PM
    Author     : santiago
--%>

<jsp:include page="header.jsp">
    <jsp:param name="title" value="Accueil" />
</jsp:include>

<div class="page-header">
  <h1>Points <small>et coupons</small></h1>
</div>

<div class="well well-lg">Vous avez actuellement: 8 points</div>

<div class="row">
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="assets/cafe.jpg" alt="cafe">
      <div class="caption">
        <h3>Un café - 5 points</h3>
        <p>Profitez d'un excellent café à la cafétéria pour seulement 5points! 
            <br>
            Pour en bénéficier, cliquez sur le bouton ci-dessous!
        </p>
        <p><a href="#" class="btn btn-primary" role="button" data-toggle="modal" data-target="#bonCafe">Utiliser le bon</a></p>
      </div>
    </div>
  </div>
    <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="assets/croissant.jpg" alt="cafe">
      <div class="caption">
        <h3>Deux croissants - 10 points</h3>
        <p>Profitez de deux excellents croissants à la cafétéria pour seulement 10points! 
            <br>
            Pour en bénéficier, cliquez sur le bouton ci-dessous!
        </p>
        <p><a href="#" class="btn btn-primary" role="button" data-toggle="modal" data-target="#bonCroissant">Utiliser le bon</a></p>
      </div>
    </div>
  </div>
    <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="assets/menu.jpg" alt="cafe">
      <div class="caption">
        <h3>Un Repas de midi - 50 points</h3>
        <p>Profitez d'un repas de midi de votre choix pour 50points! 
            <br>
            Pour en bénéficier, cliquez sur le bouton ci-dessous!
        </p>
        <p><a href="#" class="btn btn-primary" role="button" data-toggle="modal" data-target="#bonMenu">Utiliser le bon</a></p>
      </div>
    </div>
  </div>
    <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="assets/conge.jpg" alt="cafe">
      <div class="caption">
        <h3>Une journée de congé payée - 1000 points</h3>
        <p>Besoin d'un break? Avec 1000 points vous bénéficiez d'une journée de congé payée! 
            <br>
            Pour en bénéficier, cliquez sur le bouton ci-dessous!
        </p>
        <p><a href="#" class="btn btn-primary" role="button" data-toggle="modal" data-target="#bonConge">Utiliser le bon</a></p>
      </div>
    </div>
  </div>
</div>


<div class="modal fade" id="bonCafe" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">Une café</h4>
      </div>
      <div class="modal-body">
        PDF...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Imprimer</button>
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="bonCroissant" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">Deux croissants</h4>
      </div>
      <div class="modal-body">
        PDF...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Imprimer</button>
      </div>
    </div>
  </div>
</div>
<div class="modal fade" id="bonMenu" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">Un repas de midi</h4>
      </div>
      <div class="modal-body">
        PDF...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Imprimer</button>
      </div>
    </div>
  </div>
</div>
<div class="modal fade" id="bonConge" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">Une journée de congé payée</h4>
      </div>
      <div class="modal-body">
        PDF...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Imprimer</button>
      </div>
    </div>
  </div>
</div>


<jsp:include page="footer.jsp" />