package commands;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Aluno;

public class EditarAluno implements Command {

	DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			Aluno aluno = null;
			if(request.getParameter("id") != null) {
				aluno = this.daoGeneric.pesquisar(Long.valueOf(request.getParameter("id")), Aluno.class);
				daoGeneric.updateMerge(aluno);
			} else
				daoGeneric.inserir(aluno);
			
			request.setAttribute("aluno", aluno);
			RequestDispatcher d = request.getRequestDispatcher("/Usuario/EditarAluno.jsp");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}
	
}
