package com.controllers.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.interfac.SignupInterface;
import com.dao.interfacimpl.SignupInterfaceImpl;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String ID =request.getParameter("id");
		String Name =request.getParameter("name");
		String Email =request.getParameter("email");
		String Password =request.getParameter("pwd");
		String MobileNumber =request.getParameter("mbl");
		
		try {
			SignupInterface Obj = new SignupInterfaceImpl();
			boolean b = Obj.addDetails(ID,Name, Email, Password, MobileNumber);
			System.out.println("Details, am from servlet "+b);
			
			if (b) {
				System.out.println("Inserted Successfully");
				/*RequestDispatcher rd=request.getRequestDispatcher("/ExistId.jsp");
				rd.forward(request, response);*/
			} else {
				System.out.println("Something went wrong");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
