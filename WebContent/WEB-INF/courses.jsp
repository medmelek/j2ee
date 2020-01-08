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
.card{
margin:50px;
}
.row{
margin:0px;
}
.scroll{
overflow-y: scroll;
height: 650px;
}
.green{
color: green ;
}
.red{
color:red ;
}

</style>
</head>
<body class="body h-100">

<nav class="navbar navbar-dark bg-primary sticky-top">
  <span class="navbar-brand mb-0 h1">Welcom to Student space</span>
</nav>

<form class="form" method="post" action="ValidateEtudantCourses">


<div class="container-fluid h-100	 ">



<div class="row">
<div class="col-md-6 scroll ">

    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Android</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>			
			<div class="input-group mb-3">
  				<div class="input-group-prepend">
    				<div class="input-group-text">
      					<input type="checkbox" name="android" aria-label="Checkbox for following text input">
    				</div>
  				</div>
       			<a class="btn btn-primary" style="color:white">Check to Study</a>
			</div>        
      </div>
    </div>
    
    
     <div class="card">
      <div class="card-body">
        <h5 class="card-title">Angular</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>			
			<div class="input-group mb-3">
  				<div class="input-group-prepend">
    				<div class="input-group-text">
      					<input type="checkbox" name="angular" aria-label="Checkbox for following text input">
    				</div>
  				</div>
       			<a class="btn btn-primary" style="color:white">Check to Study</a>
			</div>        
      </div>
    </div>
    
    
    
     <div class="card">
      <div class="card-body">
        <h5 class="card-title">Django</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>			
			<div class="input-group mb-3">
  				<div class="input-group-prepend">
    				<div class="input-group-text">
      					<input type="checkbox" name="django" aria-label="Checkbox for following text input">
    				</div>
  				</div>
       			<a class="btn btn-primary" style="color:white">Check to Study</a>
			</div>        
      </div>
    </div>
    
    
    
     <div class="card">
      <div class="card-body">
        <h5 class="card-title">DotnetCore</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>			
			<div class="input-group mb-3">
  				<div class="input-group-prepend">
    				<div class="input-group-text">
      					<input type="checkbox" name="dotnetcore" aria-label="Checkbox for following text input">
    				</div>
  				</div>
       			<a class="btn btn-primary" style="color:white">Check to Study</a>
			</div>        
      </div>
    </div>
    
    
        

</div>

<div class="col-md-6 d-flex justify-content-center">

<div>
<c:forEach var="asd" items="${requestScope.list}">

   <div class="card d-inline-block espace" style="width: 18rem;">
   <img src="${pageContext.request.contextPath}/assets/images/student.jpg" class="card-img-top" alt="student image">
   <div class="card-body">
    <h5 class="card-title"><c:out value="${asd.nom}"/></h5>
    <p class="card-text"><c:if test="${cours !=null}"> <c:out value="${cours }"/> </c:if>
    </p>
    <p class="green"> <c:if test="${asd.moy>=10}"><c:out value="${asd.moy}"/> </c:if> </p>
    <p class="red"> <c:if test="${asd.moy<10}"><c:out value="${asd.moy}"/> </c:if> </p>
  </div>
  
</c:forEach>
</div> 


<input type="hidden" name="code" value="<c:out value="${code}"/>"/>
<input type="submit" class="btn btn-secondary btn-lg btn-block w-100" value="Validate my courses"/>


</div>

</div>


</div>

</form>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>