package commands;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Usuario;

public class EditarUsuario implements Command {

	DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			Usuario usuario = null;
			if(request.getParameter("id") != null) {
				usuario = this.daoGeneric.pesquisar(Long.valueOf(request.getParameter("id")), Usuario.class);
			} else {
				usuario = new Usuario("", "", "");
			}
			
			request.setAttribute("usuario", usuario);

			RequestDispatcher d = request.getRequestDispatcher("/Usuario/EditarUsuario.jsp");
			d.forward(request,response);

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}

}
