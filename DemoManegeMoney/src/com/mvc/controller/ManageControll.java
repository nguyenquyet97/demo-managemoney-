package com.mvc.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.mvc.bean.EditBean;
import com.mvc.bean.ManageBean;
import com.mvc.dao.ManageDao;;
@WebServlet("/ManageControll")
public class ManageControll extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        if(request.getParameter("btn_submit")!=null){ //check button click event not null from register.jsp page button
        	String date = request.getParameter("ngay_tao");
            String type_TC=request.getParameter("txt_type_TC");//lay name trong form
            String Ten_khoan_TC=request.getParameter("txt_Ten_Khoan_TC");
            String ST_TC=request.getParameter("number_sotien");  //get all textbox       
            String userName = (String)request.getSession(false).getAttribute("username");           
            String mota=request.getParameter("mo_ta");
            
            ManageBean addBean=new ManageBean(); //this class contain  seeting up all received values from register.jsp page to setter and getter method for application require effectivel
            addBean.setNguoi_tao(userName);
            addBean.setNgay_tao(date);
            addBean.setLoai_tc(type_TC);
            addBean.setTen_tc(Ten_khoan_TC);
            addBean.setSo_tien(ST_TC);           
            addBean.setMo_ta(mota);
            ManageDao manaDao=new ManageDao(); //this class contain main logic to perform function calling and database operation            
            String us;
			try {
				us = manaDao.AddNew(addBean);

	            if(us.equals("submit ok")) { //check calling authorizeRegister() function receive "SUCCESS REGISTER" string message after redirect to index.jsp page
	                request.setAttribute("submit ok", us);
	                response.sendRedirect("list.jsp"); 
	            }
	            else{
	                
	            	request.setAttribute("submit fail", us);
	            	response.sendRedirect("fail.jsp");
	            }
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			} 
            
        }   
    }



}
