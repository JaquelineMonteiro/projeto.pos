package commands;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Usuario;

public class DeletarUsuario implements Command {

	DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			Usuario usuario = new Usuario("", "");
			usuario.setId(Long.valueOf(request.getParameter("id")));

			this.daoGeneric.deleteById(usuario);

			RequestDispatcher d = request.getRequestDispatcher("Controller?command=ListarUsuario");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
}

}
