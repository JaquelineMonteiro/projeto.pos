package commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutUsuario implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getSession().setAttribute("usuarioLogado", null);
			request.getRequestDispatcher("/index.jsp").forward(request,response);
			
		} catch (IOException | ServletException  e) {
			e.printStackTrace();
		}
	}
}
