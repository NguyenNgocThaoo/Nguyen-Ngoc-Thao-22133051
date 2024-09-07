package webPage1.controllers;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/home","/trangchu"}) //root
public class HomeController  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3470227057427224862L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printW = resp.getWriter();
		printW.println("<h1>HelloWorld</h1>");
		printW.close();
	}
}

