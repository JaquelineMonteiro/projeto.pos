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

		<div class="panel panel-default">
			<div class="panel-heading"></div>
			<form id="LoginFormulario">
				<div class="form-group">
					<label class="control-label required">Login <abbr
						title="required">*</abbr>
					</label> <input type="text" class="form-control" name="login" required />
				</div>
		
				<div class="form-group">
					<label class="control-label required">Senha <abbr
						title="required">*</abbr>
					</label> <input type="password" class="form-control" name="senha" required />
				</div>
				<button class="btn btn-primary" type="button"
					onclick="onLoginUsuario()">Login</button>
					<button class="btn btn-primary" type="button"
					onclick="onCadastrarUsuario()">Cadastrar Usu�rio</button>
			</form>
		</div>
	
		<script type="text/javascript">
			<jsp:include page="/Usuario/LoginUsuario.js" />
		</script>
		
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	</body>
</html>