function onBuscarAluno(){
	var matricula = document.getElementById("matricula");
	var command = "/projeto.pos/Controller?command=ConsultarAluno&id=" + matricula.value;
	executarCommand(command);
}

function executarCommand(url){
	$("#link").load(url);
}

$(document).ready(function(){
	$('#link').click();
});