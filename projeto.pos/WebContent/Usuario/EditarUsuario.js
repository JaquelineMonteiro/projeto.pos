function onVoltarUsuario(){
	executarCommand("/projeto.pos/Controller?command=ListarUsuario");
}

function onVoltarLogin(){
	executarCommand("/projeto.pos/Controller?command=LoginUsuario");
}

function onSalvarUsuario(){
	var valores = $('#UsuarioFormulario').serialize();
	var command = "/projeto.pos/Controller?command=SalvarUsuario&" + valores;
	executarCommand(command);
}

