package com.mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection createConnection() throws SQLException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/managemomey"; // MySQL URL and followed by the database name
		String username = "root"; // MySQL username
		String password = "1234"; // MySQL password

		
			try {
				Class.forName("com.mysql.jdbc.Driver"); // loading mysql driver
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, username, password); // // System.out.println("Printing connection object "+con);
			System.out.println("ket noi"+con);
		
		
		return con;
	}
	
	
}