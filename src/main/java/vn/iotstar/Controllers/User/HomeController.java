package vn.iotstar.Controllers.User;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.iotstar.Models.Category;
import vn.iotstar.Services.Category.*;


@WebServlet(urlPatterns = {"/home","/category/add","/category/update","/category/delete","/category/view"})
public class HomeController extends HttpServlet{
	
	ICategoryService cateService = new CategoryServiceImpl();
	private static final long serialVersionUID = 1L;
	//Servlet kiểm tra URL được yêu cầu thông qua req.getRequestURL().toString().
	//Nếu URL chứa chuỗi "findAll", nó sẽ gọi phương thức findAll().
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURL().toString();
		if(url.contains("home")) {
			findAll(req,resp);
		}
	}
	private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Category> list = cateService.findAll();
		req.setAttribute("listcate", list);
		RequestDispatcher rd = req.getRequestDispatcher("/views/category/listcategory.jsp");
		rd.forward(req, resp);
	}
	
	
}
