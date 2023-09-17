package com.jdbcproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {
	public static void main(String[] args)throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/soheldb","root","codewithsohel");
			Statement stmt=c.createStatement();
			String sql="Insert into employee(EId,FName,LName)values(1,'Sohel','Patvekar')";
			stmt.execute(sql);
			System.out.println("Record inserted sucessfully..");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
