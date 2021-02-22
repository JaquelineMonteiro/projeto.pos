function onVoltar(){
	executarCommand("/projeto.pos/Controller?command=ListarAluno");
}

function onSalvarAluno(){
	var valores = $('#AlunoFormulario').serialize();
	var command = "/projeto.pos/Controller?command=SalvarAluno&" + valores;
	executarCommand(command);
}