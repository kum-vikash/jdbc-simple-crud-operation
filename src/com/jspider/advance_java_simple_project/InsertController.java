package com.jspider.advance_java_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertController {
	
	public static void main(String[] args) {
		Connection connection=null;
		try {
			//Step-1 Load & Register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step-2 Create Connection
		    String url="jdbc:mysql://localhost:3306/jdbc";
			String user="root";
			String pass="root";
			connection=DriverManager.getConnection(url, user, pass);
			
			
			//Step-3 CreateStatement
			Statement statement=connection.createStatement();
			
			
			//Step-4 Execute Query
			String insertQString ="insert into student value(124,'Godvin', 'godvin@gmail.com',7696504)";
			
			statement.execute(insertQString);
			
			System.out.println("Data-----inserted");
			
			//Step-5 Close Connection
			connection.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
