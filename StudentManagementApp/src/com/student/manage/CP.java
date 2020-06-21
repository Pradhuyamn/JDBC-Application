package com.student.manage;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class CP {
	
 static Connection con;
	
 public static Connection createC() {
	 
	 
	try {
		
	// Step-1 Load the Driver
	 Class.forName("com.mysql.jdbc.Driver");
	 
	// Step-2 Create the Connection
	 
	 String user = "root";
	 String password = "12345";
	 String url = "jdbc:mysql://localhost:3306/student_manage";
	 
	 con = (Connection) DriverManager.getConnection(url,user,password);
	 
	}catch( Exception e ) {
		e.printStackTrace();
	} 
	return con;
	
	 
 }
}
