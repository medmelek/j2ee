<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.melek.beans.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Identification</title>
<style>
.body{
background-color :#F4F6F6 ;
}
.container-fluid{
padding: 0px ;
}
.container-fluid-2{
margin:50px;
}
.espace{
margin :25px;
}

.red{
color :red;
}

.green{
color :green;
}
</style>
</head>
<body class="body">

<div class="container-fluid	 ">


<nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Isamm </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">ClassRoom <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About us</a>
      </li>
      <li class="nav-item">
        <a class="nav-link"  data-toggle="modal" data-target="#exampleModal" >Insert Student</a>
      </li>
    </ul>
  </div>
   <form class="form-inline" method="post" action="SearchEtudiant">
    <input class="form-control mr-sm-2" type="search" placeholder="Search by id" aria-label="Search" min="1" name="search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Insert Student</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      <%@include  file="insertionEtudiant.html" %>  
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>

<!-- Modal -->


<div class="container-fluid-2 ">

<c:forEach var="asd" items="${requestScope.list}">

   <div class="card d-inline-block espace" style="width: 18rem;">
   <img src="${pageContext.request.contextPath}/assets/images/student.jpg" class="card-img-top" alt="student image">
   <div class="card-body">
    <h5 class="card-title"><c:out value="${asd.nom}"/></h5>
    <p class="card-text">3 ing software engineering</p>
    <p class="green"> <c:if test="${asd.moy>=10}"><c:out value="${asd.moy}"/> </c:if> </p>
    <p class="red"> <c:if test="${asd.moy<10}"><c:out value="${asd.moy}"/> </c:if> </p>
    <input type="hidden" name="id" value="<c:out value="${asd.id}"/>"/>
    <a href="/myfirstJEE/SuppressionEtudiant?id=<c:out value='${asd.id}'/>" class="btn btn-danger">Delete</a>
   </div>
  </div>
  
</c:forEach>

</div>

 
</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>