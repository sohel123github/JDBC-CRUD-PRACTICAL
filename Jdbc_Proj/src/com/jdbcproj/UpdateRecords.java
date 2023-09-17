package com.jdbcproj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecords {
	public static void 	updateRecords(String LName,int EId) {
		try {
			Connection c=CommonConnection.getConnection();
			PreparedStatement stmt=c.prepareStatement("update employee set LName=? where EId=?");
			stmt.setString(1, LName);
			stmt.setInt(2, EId);
			stmt.execute();
			System.out.println("Record updated sucessfully..");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter LName");
	String LName=sc.next();
	System.out.println("Please enter EId");
	int EId=sc.nextInt();
	updateRecords(LName,EId);
	
}
}
