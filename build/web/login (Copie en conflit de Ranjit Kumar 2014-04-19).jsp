<%-- 
    Document   : login
    Created on : 6 janv. 2010, 14:19:14
    Author     : termine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/design.css">
        <link rel="stylesheet" href="css/signin.css">
        <title>Gestion des personnes (CRUD) - Authentification </title>

    </head>
    <body>
    <div class="container">
        <div class="page-header">
            <h1> Authentification</h1>
        </div>

        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">Se connecter</div>
                    <div class="panel-body">
                        <form method="POST" action="ServletLogin" class="form-signin left-form">
                            <input type="text" name="username" class="form-control" placeholder="Nom d'utilisateur"><br>
                            <input type="password" name="password" class="form-control" placeholder="Mot de passe"><br>
                            <br><br><br>
                            <input type="submit" value="Connexion" class="btn btn-lg btn-primary btn-block">
                            <div></div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-info">
                    <div class="panel-heading">S'inscrire</div>
                    <div class="panel-body">
                        <form method="POST" action="ServletLogin" class="form-signin">
                            <input type="text" name="username" class="form-control" placeholder="Nom d'utilisateur"><br>
                            <input type="password" name="password" class="form-control" placeholder="Mot de passe"><br>
                            <input type="password" name="password" class="form-control" id="UserPassword2" placeholder="Confirmer mot de passe"><br>
                            <input type="submit" value="S'enregistrer" class="btn btn-lg btn-info btn-block">
                        </form>
                    </div>
                </div>


            </div>
            <div class="col-md-2"></div>
        </div>
    </div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>
