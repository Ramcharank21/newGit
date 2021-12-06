package com.controllers.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.interfac.SignupInterface;
import com.dao.interfacimpl.SignupInterfaceImpl;

/**
 * Servlet implementation class SigninServlet
 */
@WebServlet("/SigninServlet")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigninServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String Name =request.getParameter("name");
		String Password =request.getParameter("pwd");
	
		try {
			SignupInterface Obj = new SignupInterfaceImpl();
			boolean b = Obj.viewDetails(Name,Password);
			out.println("Details, am from servlet "+b);
			
			if (b) {
				out.println("Inserted Successfully");
			
			} else {
				out.println("Something went wrong");
				System.out.println("please try again");
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
