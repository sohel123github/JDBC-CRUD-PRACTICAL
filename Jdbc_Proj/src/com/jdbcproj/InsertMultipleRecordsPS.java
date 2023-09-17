package com.jdbcproj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultipleRecordsPS {
	public static void insertRecords(int EId,String FName,String LName  ) {
		try {
			Connection c=CommonConnection.getConnection();
			PreparedStatement stmt=c.prepareStatement("Insert into employee(EId,FName,LName)values(?,?,?)");
			stmt.setInt(1, EId);
			stmt.setString(2, FName);
			stmt.setString(3, LName);
			stmt.execute();
			System.out.println("Record inserted sucessfully..");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1; i<=3; i++) {
		System.out.println("Please enter EId:");
		int EId=sc.nextInt();
		System.out.println("Please enter FName:");
		String FName=sc.next();
		System.out.println("Please enter LName:");
		String LName=sc.next();
		insertRecords(EId,FName,LName);
	}


	
}
}
