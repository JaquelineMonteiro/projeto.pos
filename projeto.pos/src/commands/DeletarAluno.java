package commands;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Aluno;

public class DeletarAluno implements Command {

	DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			Aluno aluno = new Aluno();
			aluno.setId(Long.valueOf(request.getParameter("id")));
			this.daoGeneric.deleteById(aluno);
			RequestDispatcher d = request.getRequestDispatcher("Controller?command=ListarAluno");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}
	
}
