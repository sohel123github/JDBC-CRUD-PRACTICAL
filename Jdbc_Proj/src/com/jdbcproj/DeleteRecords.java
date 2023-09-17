package com.jdbcproj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecords {
	public static void deleteRecords(int EId) {
		try {
			Connection c=CommonConnection.getConnection();
			PreparedStatement stmt=c.prepareStatement("delete from employee where EId=?");
			stmt.setInt(1, EId);
			stmt.execute();
			System.out.println("Record deleted sucessfully..");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter EId:");
		int EId=sc.nextInt();
		deleteRecords(EId);
		
	}

}
