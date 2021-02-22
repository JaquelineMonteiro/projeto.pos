package commands;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoGeneric;
import model.Usuario;


public class LoginUsuario implements Command {
	
	DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {

			if(request.getParameter("login") == null && request.getParameter("senha") == null) {
				request.getSession().setAttribute("usuarioLogado", null);
				RequestDispatcher d = request.getRequestDispatcher("/Usuario/LoginUsuario.jsp");
				d.forward(request,response);
			} else {
				Usuario usuario = new Usuario(request.getParameter("login").toString(), request.getParameter("senha").toString());
				
				if(usuario.EValido()) {
					
					if(usuario != null) {
						this.daoGeneric.inserir(usuario);
						request.getSession().setAttribute("usuarioLogado", usuario);
						RequestDispatcher d = request.getRequestDispatcher("/LoginUsuario.jsp");
						d.forward(request,response);
					} else {
						request.getSession().setAttribute("usuarioLogado", null);
						RequestDispatcher d = request.getRequestDispatcher("/Usuario/LoginUsuario.jsp");
						d.forward(request,response);
					}
				} else {
					request.getSession().setAttribute("usuarioLogado", null);
					RequestDispatcher d = request.getRequestDispatcher("/Usuario/LoginUsuario.jsp");
					d.forward(request,response);

				}
			}
			
		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}

}
