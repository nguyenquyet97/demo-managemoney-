package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DelDao {

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

}
