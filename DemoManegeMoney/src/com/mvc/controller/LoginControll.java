package com.mvc.controller;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginControll
 */
@WebServlet("/LoginControll")
public class LoginControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginControll() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getParameter("btn_login")!=null) {//check button click event not null from login.jsp page button
			
            String userName=request.getParameter("txt_username"); //get textbox name "txt_username"
            String password=request.getParameter("txt_password"); //get textbox name "txt_password"           
            LoginBean loginBean=new LoginBean(); //this class contain seeting up all received values from index.jsp page to setter and getter method for application require effectively            
            loginBean.setUsername(userName); //set username through loginBean object
            loginBean.setPassword(password); //set password through loginBean object            
            LoginDao loginDao=new LoginDao(); //this class contain main logic to perform function calling and database operation           
            String authorize;
			try {
				authorize = loginDao.authorizeLogin(loginBean);
				
				if("SUCCESS_LOGIN".equals(authorize)) { //check calling authorizeLogin() function receive string "SUCCESS LOGIN" message after continue process
				      
	            	HttpSession session=request.getSession();  
	                session.setAttribute("username",userName);
	                response.sendRedirect("list.jsp");
	                
	               System.out.println(userName);
	            } else {
	                response.sendRedirect("fail.jsp");
	            }
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//send loginBean object values into authorizeLogin() function in LoginDao class           
        }
	}

}
