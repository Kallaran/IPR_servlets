package pr.tp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init(ServletConfig config) throws ServletException {

	    Enumeration<String> e2 = config.getInitParameterNames();
	    while (e2.hasMoreElements()) {
	        String key = (String) e2.nextElement();
	        String value = getInitParameter(key);
	        System.out.println(" " + key + " = " + value);
	    }
		
		
		super.init(config);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Hello World</title></head>");
		out.println("<body>");
		String nom = request.getParameter("nom");
		if(nom!=null) {
			out.println("Hello "+ nom);
		}else {
			out.println("Hello World");
		}
				
		ServletContext context = getServletContext();
		Enumeration<String> e = context.getInitParameterNames();
		while (e.hasMoreElements()) {
		    String key = (String) e.nextElement();
		    Object value = context.getInitParameter(key);
		    System.out.println(" " + key + " = " + value);
		}
		
		
		out.println("</body>");
		out.println("</html>");
	}

}
