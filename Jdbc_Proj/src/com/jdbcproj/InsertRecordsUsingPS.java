package com.jdbcproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecordsUsingPS {
	public static void main(String[] args)throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/soheldb","root","codewithsohel");
			PreparedStatement stmt=c.prepareStatement("Insert into employee(EId,FName,LName)values(?,?,?)");
			stmt.setInt(1, 1);
			stmt.setString(2, "Sohel");
			stmt.setString(3, "Patil");
			stmt.execute();
			System.out.println("Record inserted sucessfully..");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
