<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta name="autor"content="Victoria Sevilla">
    <meta charset="UTF-8">
    <title>GeGaDo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    <style>
        body{
            background-image: linear-gradient(to right, lightgreen,white) ;
            background-repeat: no-repeat;
            background-size: cover;
            height: 100vh;

        }
    </style>
</head>
<body>
<div class="container">
    <h2>GEGADO</h2>
    <c:if test="${not empty msnError}">
        <div class="alert alert-danger " role="alert">
            <c:out value="${msnError}"/>
        </div>
    </c:if>
       <form action="controlador" method="post">
        <fieldset>

            <legend>Datos Personales</legend>

            <div class="row">
                <p>
                <div class="col-3">
                    <label for="userN" class="form-label" >Nombre Usuario</label>
                    <input type="text" class="form-control" name="userN" id="userN" required maxlength="50" autocomplete autofocus placeholder="Indica tu nombre"></p>
                   </div>
            </div>
            <div class="row">
                <div class="col-3">
                    <label for="passU" class="form-label" >Contraseña</label>
                    <input type="password" class="form-control" id="passU" name="passU" required>
                </div>
            </div>
        </fieldset>
              <button type="submit" class="btn btn-primary">Enviar</button>
           <a href="registro.jsp" class="btn btn-primary" type="button"> Registrar</a>
        <input class="btn btn-primary" type="reset" value="Olvide Contraseña">
    </form>
</div>
</body>
</html>