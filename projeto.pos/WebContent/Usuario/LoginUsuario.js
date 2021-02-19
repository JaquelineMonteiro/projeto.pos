function onLoginUsuario(){
	var valores = $('#LoginFormulario').serialize();
	var command = "/projeto.pos/Controller?command=LoginUsuario&" + valores;
	$("body").load(command);
}

function onCadastrarUsuario(){
	executarCommand("/projeto.pos/Controller?command=EditarUsuario");
}
