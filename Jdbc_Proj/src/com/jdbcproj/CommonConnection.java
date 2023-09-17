package com.jdbcproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonConnection {
	public static Connection getConnection() throws SQLException{
		Connection c=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/soheldb","root","codewithsohel");
		}catch(Exception e) {
			System.out.println(e);
		}
		return c;
	}
	public static void main(String[] args) {
		
	}

}
