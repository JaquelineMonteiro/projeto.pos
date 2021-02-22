package commands;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Aluno;
import model.Pessoa;

public class SalvarAluno implements Command {

	DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			boolean isNovo = true;	
			Pessoa pessoa = new Pessoa();
			Aluno aluno = new Aluno();

			if(!request.getParameter("isnew").equals("true")) {
				pessoa.setId(Long.valueOf(request.getParameter("id")));
				isNovo = false;
			}

			if(isNovo == true) 
				this.daoGeneric.inserir(aluno);
			else
				this.daoGeneric.updateMerge(aluno);
			
			RequestDispatcher d = request.getRequestDispatcher("Controller?command=ListarAluno");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}

	}
}
