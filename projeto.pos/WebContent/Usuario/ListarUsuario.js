function onEditarUsuario(id)
{
	if(id)
	{
		executarCommand("/projeto.pos/Controller?command=EditarUsuario&id=" + id);
	}
	else
	{
		executarCommand("/projeto.pos/Controller?command=EditarUsuario");
	}
}



function onExluirUsuario(id){
	if(confirm("Deseja deletar o usuário?"))
	{
		executarCommand("/projeto.pos/Controller?command=DeletarUsuario&id=" + id);
	}
}