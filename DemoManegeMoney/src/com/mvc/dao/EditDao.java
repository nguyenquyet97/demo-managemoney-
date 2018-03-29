package com.mvc.dao;


import com.mvc.bean.EditBean;
import com.mvc.bean.ManageBean;
import com.mvc.dao.ManageDao;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;
//import java.util.Date;



public class EditDao {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/managemomey", "root", "1234");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	
	
	public String editForm(EditBean editBean) // create authorizeRegister()function
	{
		java.util.Date utDate = new java.util.Date();
		java.sql.Date sqlDate1 = new java.sql.Date(utDate.getTime());
		
		
		String loai_tc = editBean.getLoai_tc();
		String ten_tc = editBean.getTen_tc();
		String so_tien = editBean.getSo_tien(); 
		String id_tc = editBean.getId();
	    String ngay_tao = editBean.getNgay_tao();
		System.out.println(ngay_tao);
		 
		String url = "jdbc:mysql://localhost:3306/managemomey"; // database connection url string
		String uname = "root"; // database username
		String pass = "1234"; // database password

		try {
			Class.forName("com.mysql.jdbc.Driver"); // load driver
			Connection con = DriverManager.getConnection(url, uname, pass); // create connection
			PreparedStatement pstmt = null; // create statement
			pstmt = con.prepareStatement("update manage set loai_tc=?,ten_tc=?,st_tc=?,ngay_tao=?" + "where id=?");
			
			pstmt.setString(1, loai_tc);
			pstmt.setString(2, ten_tc);
			pstmt.setString(3, so_tien);
			pstmt.setString(4,ngay_tao);		
			pstmt.setString(5, id_tc);
			
			
			pstmt.executeUpdate(); // execute query
			pstmt.close(); // close statement
			con.close(); // close connection

			return "edit ok"; // if valid return string "edit ok"
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "edit fail"; // if invalid return string "FAIL not"

	
	
	
	
	
	
	}

}
