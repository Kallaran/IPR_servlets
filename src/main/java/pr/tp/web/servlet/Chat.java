package pr.tp.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chat")
public class Chat extends HttpServlet {
	private static final long serialVersionUID = 197811968639586823L;
	private StringBuffer chatContent;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		chatContent = new StringBuffer();

		chatContent.append("Bienvenue sur le chat").append("\n");

		chatContent.append("Soyez polis").append("\n");	

	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("chatContent", chatContent.toString());
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/chat.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String action = request.getParameter("action");
		String ligne = request.getParameter("ligne");

		if (action != null && action.equals("submit")) {
		    // Ajouter la ligne au contenu
			chatContent.append(ligne).append("\n");	

		}

		
		request.setAttribute("chatContent", chatContent.toString());
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/chat.jsp");
		dispatcher.forward(request, response);
	}
	
	
}



