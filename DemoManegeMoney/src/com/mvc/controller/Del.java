package com.mvc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Del")
public class Del extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Del() {
        
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			 
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/managemomey","root","1234");
		    if(request.getParameter("id")!=null)
		    {
		    	int id=Integer.parseInt(request.getParameter("id"));
		    	 PreparedStatement pstmt=null;
		    	 pstmt=con.prepareStatement("delete from manage where id=? "); //sql delete query
		    	  pstmt.setInt(1,id);
		    	  pstmt.executeUpdate(); 
		    	
		    	  con.close(); //close connection
		    	  System.out.println(id);
		    }
		    response.sendRedirect("list.jsp");
		     
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //load driver 
	
		 
		 
		
	}

}
