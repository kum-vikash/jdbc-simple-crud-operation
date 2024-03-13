package com.jspider.advance_java_simple_project;

import java.sql.*;


public class DeleteController {
	public static void main(String[] args) {
		Connection connection=null;
		
		try {
			//step-1 Load/Register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//step-2 Create Connection
			String url="jdbc:mysql://localhost:3306/jdbc";
			
			String user="root";
			String pass="root";
			connection=DriverManager.getConnection(url, user, pass);
			
			//Step-3 CreateStatement
			Statement statement=connection.createStatement();
			
			
			//Step-4 ExecuteQuery
			String deleteQuery="delete from student where id=123";
		
			int a=statement.executeUpdate(deleteQuery);
			if(a==1) {
				System.out.println("Data-------Deleted");
			}
			else {
				System.out.println("Id Not Found");
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
