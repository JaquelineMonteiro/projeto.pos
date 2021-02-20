package commands;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Usuario;

public class ListarUsuario implements Command {

	DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<Usuario> usuarios = this.daoGeneric.getAll(Usuario.class);
			request.setAttribute("usuarios", usuarios);
			RequestDispatcher d = request.getRequestDispatcher("/Usuario/ListarUsuario.jsp");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}

	}

}
