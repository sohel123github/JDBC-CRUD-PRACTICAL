package com.jdbcproj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchRecords {
	public static void fetchRecords(int EId) {
		try {
			Connection c=CommonConnection.getConnection();
			PreparedStatement stmt=c.prepareStatement("select * from employee where EId=?");
			stmt.setInt(1, EId);
			ResultSet rs=stmt.executeQuery();
			System.out.println("Fetch Records sucessfully..");
			while(rs.next()) {
				System.out.println("id: "+rs.getInt(1));
				System.out.println("FName: "+rs.getString(2));
				System.out.println("LName: "+rs.getString(3));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter Eid:");
	int EId=sc.nextInt();
	fetchRecords(EId);
}
}
