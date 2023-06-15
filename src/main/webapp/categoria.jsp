
<%--
  Created by IntelliJ IDEA.
  User: irina
  Date: 14/6/23
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Categorias</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
   <style>
    body{
    background-image: linear-gradient(to right, lightslategray,white) ;
    background-repeat: no-repeat;
    background-size: cover;
    height: 100vh;
   </style>
    }
</head>
<body>
<div class="container m-auto text-center my-4">
<form action="ControllerCateg" method="get">
    <div class="row" >
    <div class="col-md-2" >
        <input type="checkbox" class="btn-check" id="btn-check" autocomplete="off" name="idT" value="1">
        <label class="btn btn-success" for="btn-check">Ingreso</label>
    </div>
    <div class="col-md-2">
        <input type="checkbox" class="btn-check" id="btn-check2" autocomplete="off" name="idT" value="2">
        <label class="btn btn-danger" for="btn-check2">Gasto</label>

        <div class="invalid-feedback">
            El nombre de la Categoria es requerido
        </div>
    </div>
    </div>
        <div class="col-md-4 my-4">
            <label for="nombreC" class="form-label">Nombre de la Categoria</label>
            <input type="text" class="form-control" id="nombreC"  required>
            <div class="invalid-feedback">
                El nombre de la Categoria es requerido
            </div>
        </div>

<div class="row my-4" >
    <div class="col-4" col-md-4>
        <c:forEach items="${icon}" var="icon">
            <input type="checkbox" class="btn-check" name="icon"  autocomplete="off" id="icon" value="<c:out value="${icon}"/>" >
            <img src="<c:url value="${icon}"></c:url>" class="btn" alt="icono" width="70">
        </c:forEach>
    </div>
</div>
    <div class="col-md-4">
        <button class="btn btn-warning" type="submit">Crear Categoría</button>
    </div>
</form>
</div>
</body>
</html>
