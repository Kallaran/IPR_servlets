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
import javax.servlet.http.HttpSession;

@WebServlet("/chat")
public class Chat extends HttpServlet {
	private static final long serialVersionUID = 197811968639586823L;
	private StringBuffer chatContent;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {

		
		ServletContext context = config.getServletContext();		
		chatContent = new StringBuffer();
		
		String welcome = context.getInitParameter("welcome");
		chatContent.append(welcome).append("\n");


	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	    HttpSession session = request.getSession(false);
	    

	    
	    // if the current session is null the user is redirected to the login page
	    if(session == null || session.getAttribute("session.user") == null) {
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
	    }
	    
	    else {	    	
			request.setAttribute("chatContent", chatContent.toString());
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/chat.jsp");
			dispatcher.forward(request, response);
	    }
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String user = request.getParameter("user");
		
		//if user != null, this is a new user and we create a session for him
		if (user != null) {
		    HttpSession session = request.getSession(true);
		    session.setAttribute("session.user", user);
		}


		
	    HttpSession session = request.getSession(false);
	    
	    // if the current session is null the user is redirected to the login page
	    if(session == null || session.getAttribute("session.user") == null) {
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
	    }
	    else {
		    String user_session = (String) session.getAttribute("session.user");

			String action = request.getParameter("action");
			String ligne = request.getParameter("ligne");


			if (action != null && action.equals("submit")) {
			    //Add the new line
				chatContent.append(user_session).append(ligne).append("\n");	
			}

			
			request.setAttribute("chatContent", chatContent.toString());
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/chat.jsp");
			dispatcher.forward(request, response);
	    	
	    }
	    

	}
	
	
}



