package commands;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Aluno;

public class ListarResultado implements Command {

	DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<Aluno> alunos = this.daoGeneric.getAll(Aluno.class);
			request.setAttribute("alunos", alunos);
			RequestDispatcher d = request.getRequestDispatcher("/Aluno/ListarResultado.jsp");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}
	
}
