package vn.iotstar.Controllers.Admin;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.iotstar.Models.Users;
import vn.iotstar.Services.Users.IUsersService;
import vn.iotstar.Services.Users.UsersServiceImpl;
@WebServlet(urlPatterns = {"/admin-users/findAll"})
public class UsersController extends HttpServlet{
	IUsersService users = new UsersServiceImpl();
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURL().toString();
		if(url.contains("findAll")) {
			findAll(req,resp);
		}
	}
	private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Users> list = users.findAll();
		req.setAttribute("listusers", list);
		RequestDispatcher rd = req.getRequestDispatcher("/views/users/listusers.jsp");
		rd.forward(req, resp);
	}
}
