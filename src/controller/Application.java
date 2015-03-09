package controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Application
 */
@WebServlet(
	name = "ApplicationController", 
	description = "Application Controller", 
	urlPatterns = {"/do/*"}
)
public class Application extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Application() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod().toLowerCase();
		String action  = request.getPathInfo().toLowerCase();

		if (action == null) {
			doWelcome(request, response);
		}
		
		System.out.println("action : " + action);
		
		try {
			switch (action) {
				case "/default":
					doDefault(request, response);
				break;
				case "/service1":
					doService1(request, response);
				break;
				case "/service2":
					doService2(request, response);
				break;
				case "/service3":
					doService3(request, response);
				break;
				default :
					doWelcome(request, response);
				break;
			}
			if (true) {return;}
		} catch (Exception e) {
			doError(request, response, e);
		}
		
	}

	private void doWelcome(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("==> doWelcome()");
		response.sendRedirect(request.getContextPath() + "/view/index.jsp");
	}
	
	private void doDefault(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("==> doDefault()");
		response.sendRedirect(request.getContextPath() + "/view/index.jsp");
	}
	
	private void doError(HttpServletRequest request, HttpServletResponse response, Exception exception) throws IOException {
		System.out.println("==> doError()");
		response.sendRedirect(request.getContextPath() + "/view/index.jsp");
	}
	
	private void doService1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("==> doService1()");
		response.sendRedirect(request.getContextPath() + "/view/index.jsp");
	}
	
	private void doService2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("==> doService2()");
		response.sendRedirect(request.getContextPath() + "/view/index.jsp");
	}
	
	private void doService3(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("==> doService3()");
		response.sendRedirect(request.getContextPath() + "/view/index.jsp");
	}
	
	
	
}
