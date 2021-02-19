<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="model.Aluno"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>

<%
	Aluno aluno = (Aluno) request.getAttribute("aluno");
%>

<!DOCTYPE html>
<html lang="en">

	<head>
		<title>Projeto PIOO</title>
		
   		<meta charset="utf-8">
   		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		
		<!-- Bootstrap 4.0.0 -->
		<link rel="stylesheet" 
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
		crossorigin="anonymous">	
		
		<!-- Font Awesome 4.7.0 -->
		<link rel="stylesheet" 
		href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">		
	</head>
	
	<body>
		
		<!-- Consulta por Matrícula -->
		<nav class="navbar navbar-light bg-light">
		  <form class="form-inline">
		    <input class="form-control mr-sm-2" type="text" placeholder="Matrícula" aria-label="Search" name="matricula" id="matricula"> 
		    <button class="btn btn-outline-success my-2 my-sm-0" type="button" onclick="onBuscarAluno()">Buscar</button>
		  </form>
		  <form class="form-inline"><a href="index.jsp"><i class="fa fa-home" aria-hidden="true"></i>Home</a></form> 
		</nav>
		
		<!-- Tabela -->
		<table class="table table-sm table-hover">
		  <thead>
		    <tr>
		      <th scope="col">Nome</th>
		      <th scope="col">Disciplina</th>
		      <th scope="col">Média</th>
		      <th scope="col">Situação</th>
		    </tr>
		  </thead>

		  <tbody>
		    <tr>
		      <td></td>
		      <td></td>
		      <td></td>
		      <td></td>
		    </tr>
		  </tbody>
		</table>

		<script type="text/javascript">
			<jsp:include page="/Alunos/ConsultarAluno.js" />
		</script>
		
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	</body>
</html>