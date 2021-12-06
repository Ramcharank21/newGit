package com.controllers.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.interfac.SignupInterface;
import com.dao.interfacimpl.SignupInterfaceImpl;

/**
 * Servlet implementation class ExistIdServlet
 */
@WebServlet("/ExistIdServlet")
public class ExistIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExistIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			boolean flag = false;
			String msg = "";
			String ID = request.getParameter("id");
			System.out.println("Getting id . . "+ID);
			SignupInterface Obj = new SignupInterfaceImpl();
			boolean b = Obj.existId(ID);
			
			if (b) {
				System.out.println("Inside if condition");
				msg = ID + "ID already exists please try with another ID";
				flag = true;
			} else {
				flag = false;
			}
			response.getWriter().write(msg);
			
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
