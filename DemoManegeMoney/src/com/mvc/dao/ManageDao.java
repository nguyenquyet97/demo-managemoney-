package com.mvc.dao;

import com.mvc.bean.ManageBean;
import com.mvc.dao.ManageDao;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.Date;
import java.sql.SQLException;



public class ManageDao {

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

	public String AddNew(ManageBean manaBean) throws ClassNotFoundException // create authorizeRegister()function
, SQLException
	{
		java.util.Date utilDate = new java.util.Date();
	   java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		
	   	String nguoi_tao = manaBean.getNguoi_tao();
		String loai_tc = manaBean.getLoai_tc();
		String ten_tc = manaBean.getTen_tc();
		String so_tien = manaBean.getSo_tien();
		String date = manaBean.getNgay_tao();
		String mota = manaBean.getMo_ta();
		String url = "jdbc:mysql://localhost:3306/managemomey"; 
		String uname = "root"; 
		String pass = "1234"; 
		
		
		System.out.println("ten khọan thu chi" +ten_tc);
		Class.forName("com.mysql.jdbc.Driver"); // load driver
		Connection con = DriverManager.getConnection(url, uname, pass); // create connection
		PreparedStatement pstmt = null; // create statement

		try {
			
			pstmt = con.prepareStatement("insert into manage(loai_tc, ten_tc, st_tc, ngay_tao, nguoi_tao,mo_ta) values(?, ?, ?, ?, ?,?)");
			pstmt.setString(1, loai_tc);
			pstmt.setString(2, ten_tc);
			pstmt.setString(3, so_tien);
			pstmt.setString(4, date);
			pstmt.setString(5, nguoi_tao);
			pstmt.setString(6, mota);

			pstmt.executeUpdate(); // execute query

			return "submit ok"; // if valid return string "SUCCESS ok"
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pstmt.close(); // close statement
			con.close(); // close connection
		}
		
		 
		return "submit fail"; // if invalid return string "FAIL not"

	}
}
