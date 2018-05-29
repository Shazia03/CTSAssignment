package com.cts.db;

public class DBConnectionTest
{
	public static void main(String[] args) {
		
	
	if(DBConnection.getConnection()!=null)
	
		System.out.println("Connection established...");
	
	}
}
