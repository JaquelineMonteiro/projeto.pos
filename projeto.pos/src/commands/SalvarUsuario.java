package commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Usuario;

public class SalvarUsuario implements Command {

	DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			boolean isNovo = true;
			Usuario usuariologado = (Usuario)request.getSession().getAttribute("usuarioLogado");
			Usuario usuario = new Usuario(request.getParameter("nome"), request.getParameter("login"), request.getParameter("senha"));

			if(!request.getParameter("isnew").equals("true")) {
				usuario.setId(Long.valueOf(request.getParameter("id")));
				isNovo = false;
			}

			if(isNovo)
				this.daoGeneric.inserir(usuario);	
			else
				this.daoGeneric.updateMerge(usuario);

			if(usuariologado == null) {
				request.getRequestDispatcher("Controller?command=LoginUsuario").forward(request,response);
			} else {
				request.getRequestDispatcher("Controller?command=ListarUsuario").forward(request,response);
			}		

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}

	}

}
