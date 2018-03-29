package com.mvc.dao;

import com.mvc.bean.ManageBean;
import com.mvc.bean.RegisterBean;
import com.mvc.dao.ManageDao;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class RegisterDao{

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
	public String Register(RegisterBean RegBean) // create authorizeRegister()function
	{
		String userName = RegBean.getUsername();
		String password = RegBean.getPassword();		
		String url = "jdbc:mysql://localhost:3306/managemomey"; // database connection url string
		String uname = "root"; // database username
		String pass = "1234"; // database password

		try {
			Class.forName("com.mysql.jdbc.Driver"); // load driver
			Connection con = DriverManager.getConnection(url, uname, pass); // create connection
			PreparedStatement pstmt = null; // create statement
			pstmt = con.prepareStatement("insert into user(username,password) values(?,?)");
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			pstmt.executeUpdate(); // execute query
			pstmt.close(); // close statement
			con.close(); // close connection
			return "reg ok"; // if valid return string "SUCCESS ok"
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "reg fail"; // if invalid return string "FAIL not"

	}
}
