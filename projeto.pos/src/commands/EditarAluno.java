package commands;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Aluno;
import model.Disciplina;

public class EditarAluno implements Command {

	DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {					
			Disciplina disciplina = new Disciplina(request.getParameter("nomeDisciplina"), 
					(Double.valueOf(request.getParameter("nota"))));
			
			Aluno aluno = null;
			
			if(request.getParameter("id") != null) {
				aluno = this.daoGeneric.pesquisar(Long.valueOf(request.getParameter("id")), Aluno.class);
				aluno.setNome(request.getParameter("nome"));
				aluno.setCpf(Integer.parseInt(request.getParameter("cpf")));
				aluno.setEmail(request.getParameter("email"));
				aluno.setDisciplina(disciplina);				
				daoGeneric.updateMerge(aluno);
			} else {
				aluno = new Aluno(request.getParameter("nome"), (Integer.parseInt(request.getParameter("cpf"))), 
						request.getParameter("email"), disciplina);
				daoGeneric.inserir(aluno);				
			}				
			
			request.setAttribute("aluno", aluno);
			RequestDispatcher d = request.getRequestDispatcher("/Usuario/EditarAluno.jsp");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}
	
}
