package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dao;
import model.Db;
import model.JavaBeans;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/Controller", "/insert" ,"/login"})
public class Controller extends HttpServlet {

	Db db = new Db();
	JavaBeans jb = new JavaBeans();
	Dao dao = new Dao();

	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String urlPatterns = request.getServletPath();
		if(urlPatterns.equals("/insert")) {
			registrarContato(request, response);
		}
		else if(urlPatterns.equals("/login")) {
			validaLogin(request, response);
		}
		else {
			response.sendRedirect("home.html");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.process(request, response);
	}

	protected void registrarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		jb.setNOME(request.getParameter("nomecadastro"));
		jb.setUSUARIO(request.getParameter("usuariocadastro"));
		jb.setSENHA(request.getParameter("senhacadastro"));
		jb.setEMAIL(request.getParameter("emailcadastro"));
		dao.registrarUsuario(jb);
		response.sendRedirect("home.html");

	}
	
	protected void validaLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		String userLogin = request.getParameter("usuarioLogin");
		String senhaLogin = request.getParameter("senhaLogin");
		if(dao.validarLogin(userLogin, senhaLogin) == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("sucesso.html");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("erro.html");
			dispatcher.forward(request, response);
		}
		

		
		
	}
	
	

}
