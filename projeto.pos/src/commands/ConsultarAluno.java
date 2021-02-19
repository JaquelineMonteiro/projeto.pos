package commands;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Aluno;

public class ConsultarAluno implements Command {
	
	private String id;
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			if(request.getParameter("matricula") != null) {
				DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
				Aluno aluno = daoGeneric.pesquisar(Long.valueOf(id), Aluno.class);
				request.setAttribute("aluno", aluno);
				RequestDispatcher d = request.getRequestDispatcher("Alunos/ConsultarAluno.jsp");
				d.forward(request, response);
				
			} else {
				RequestDispatcher d = request.getRequestDispatcher("Alunos/ConsultarAluno.jsp");
				d.forward(request, response);
			}
			
		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}
	
}
