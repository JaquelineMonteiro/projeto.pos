function onEditarAluno(id)
{
	if(id)
	{
		executarCommand("/projeto.pos/Controller?command=EditarAluno&id=" + id);
	}
	else
	{
		executarCommand("/projeto.pos/Controller?command=EditarAuno");
	}
}


function onDeletarAluno(id){
	if(confirm("Deseja deletar o aluno?"))
	{
		executarCommand("/projeto.pos/Controller?command=DeletarAluno&id=" + id);
	}
}