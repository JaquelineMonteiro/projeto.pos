package commands;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Aluno;
import model.Disciplina;
import model.Pessoa;

public class SalvarAluno implements Command {

	DaoGeneric daoGeneric = new DaoGeneric();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			boolean isNovo = true;	
			
			Pessoa pessoa = new Pessoa();			
			Disciplina disciplina = new Disciplina(request.getParameter("nomeDisciplina"), 
					(Double.valueOf(request.getParameter("nota"))));
			
			Aluno aluno = new Aluno(request.getParameter("nome"), (Integer.parseInt(request.getParameter("cpf"))), 
					request.getParameter("email"), disciplina);

			if(!request.getParameter("isnew").equals("true")) {
				pessoa.setId(Long.valueOf(request.getParameter("id")));
				isNovo = false;
			}

			if(isNovo == true) {
				this.daoGeneric.inserir(aluno);
				this.daoGeneric.inserir(disciplina);
			}
			else {
				this.daoGeneric.updateMerge(aluno);
				this.daoGeneric.updateMerge(disciplina);
			}
			
			RequestDispatcher d = request.getRequestDispatcher("Controller?command=ListarAluno");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}

	}
}
