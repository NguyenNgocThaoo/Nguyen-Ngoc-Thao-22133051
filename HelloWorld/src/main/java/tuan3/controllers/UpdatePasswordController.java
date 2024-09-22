package tuan3.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tuan3.services.UserService;
import tuan3.services.UserServiceImp;
@WebServlet(urlPatterns = "/update-password")
public class UpdatePasswordController extends HttpServlet{
	String username ="";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		username = req.getParameter("username");
		resp.sendRedirect(req.getContextPath() + "/WEB-INF/views/update-password.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String confirmPassword = req.getParameter("confirmPassword").trim();
		String password = req.getParameter("password").trim();
		//username = req.getParameter("username");
		String alertMsg ="";
		if(confirmPassword != confirmPassword) {
			alertMsg = "Mat khau khong khop";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/WEB-INF/views/update-pasword.jsp").forward(req, resp);
			return;
		}
		UserService service = new UserServiceImp();
		service.updatePassword(username, password);
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		
	}

}
