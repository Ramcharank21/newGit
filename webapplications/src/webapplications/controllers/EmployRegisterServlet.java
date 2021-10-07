package webapplications.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapplications.service.EmployRegister;
import webapplications.serviceimpl.EmployRegImpl;

/**
 * Servlet implementation class EmployRegisterServlet
 */
@WebServlet("./EmployRegisterServlet")
public class EmployRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String firstName=	request.getParameter("name");
		String lastName=	request.getParameter("name");
		String email=	request.getParameter("email");
		String password=	request.getParameter("password");
		 
		System.out.println("First name "+firstName +" lastname "+lastName+ " email "+email+ " password "+password);
		
		EmployRegister obj=new EmployRegImpl();
	obj.employReg(firstName, lastName, email, password);
	}

}
