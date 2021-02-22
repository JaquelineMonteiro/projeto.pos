<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
		<div class="container-fluid">
			<!-- Header e Área do Professor -->
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
			  <a class="navbar-brand" href="index.jsp">JMS IT Training</a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
			  </button>
			  <div class="collapse navbar-collapse" id="navbarText">
			    <ul class="navbar-nav mr-auto">
			      <li class="nav-item active">
			        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="#">Cursos</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="#">Valores</a>
			      </li>
			    </ul>
			    <span class="navbar-text">
			      <a class="nav-link" href="/projeto.pos/Controller?command=LoginUsuario">Área do Professor</a>
			    </span>
			  </div>
			</nav>
			
			<!-- Consulta resultado das provas -->
			<div class="card text-center">
			  <div class="card-header">
			    Notícias
			  </div>
			  <div class="card-body">
			    <h5 class="card-title">Resultado de Provas</h5>
			    <p class="card-text">Consulte o resultado final das suas disciplinas aqui.</p>
			    <a href="/projeto.pos/Controller?command=ListarResultado" class="btn btn-primary">Consultar</a>
			  </div>
			  <div class="card-footer text-muted">
			    2 dias atrás
			  </div>
			</div>
			
			<!-- Espaço disponível -->
			<div class="card">
			  <div class="card-header">
			    Quote
			  </div>
			  <div class="card-body">
			    <blockquote class="blockquote mb-0">
			      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
			      <footer class="blockquote-footer">Someone famous in <cite title="Source Title">Source Title</cite></footer>
			    </blockquote>
			  </div>
			</div>
			
			<!--  Footer -->
			<nav class="navbar navbar-expand-lg navbar-light bg-light">JMS IT Training. Todos os direitos reservados Copyright <i class="fa fa-copyright" aria-hidden="true"> 2021</i>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
			  </button>
			</nav>
		</div>
		
	
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	</body>
</html>