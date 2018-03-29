package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.bean.LoginBean;
import com.mvc.bean.RegisterBean;
import com.mvc.dao.LoginDao;
import com.mvc.dao.RegisterDao;

/**
 * Servlet implementation class RegisterControll
 */
@WebServlet("/RegisterControll")
public class RegisterControll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterControll() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("username"); // get textbox name "txt_username"
		String password = request.getParameter("password"); // get textbox name "txt_password"
		RegisterBean regBean = new RegisterBean(); // this class contain seeting up all received values from index.jsp
													// page to setter and getter method for application require
													// effectively
		regBean.setUsername(userName); // set username through loginBean object
		regBean.setPassword(password); // set password through loginBean object

		RegisterDao regDao = new RegisterDao(); // this class contain main logic to perform function calling and
												// database operation
		String reg = regDao.Register(regBean); // send loginBean object values into authorizeLogin() function in LoginDao
												// class
		if (reg.equals("reg ok")) // check calling authorizeLogin() function receive string "SUCCESS LOGIN"
												// message after continue process
		{
			
			response.sendRedirect("index.jsp");

		}

		else {
			

			response.sendRedirect("welcome.jsp");

			
		}
	}

}
