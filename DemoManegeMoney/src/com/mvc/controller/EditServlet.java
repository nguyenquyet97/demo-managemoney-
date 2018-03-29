package com.mvc.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mvc.bean.EditBean;

import com.mvc.dao.EditDao;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("edit_submit")!=null) {//check button click event not null from register.jsp page button
 
        	String id_tc = request.getParameter("id_tc");
            String loai_tc = request.getParameter("loai_tc");//lay name trong form
            String ten_tc = request.getParameter("ten_tc");
            String so_tien=request.getParameter("so_tien");  
            String ngay_tao=request.getParameter("ngay_tao");
            
            EditBean edit=new EditBean(); //this class contain  seeting up all received values from register.jsp page to setter and getter method for application require effectively
            
            edit.setId(id_tc);
            edit.setLoai_tc(loai_tc);
            edit.setTen_tc(ten_tc);
            edit.setSo_tien(so_tien);
            edit.setNgay_tao(ngay_tao);
    
            EditDao edDao = new EditDao(); //this class contain main logic to perform function calling and database operation            
            String ed = edDao.editForm(edit);
            
			System.out.println(id_tc);
			System.out.println(ngay_tao);
            
            if(ed.equals("edit ok")){ //check calling authorizeRegister() function receive "SUCCESS REGISTER" string message after redirect to index.jsp page
            
                request.setAttribute("edit_ok", ed);
                response.sendRedirect("list.jsp");
                
            } else {
            	request.setAttribute("edit_fail", ed);
            	response.sendRedirect("notok.jsp");
            }
        }
    }

}
