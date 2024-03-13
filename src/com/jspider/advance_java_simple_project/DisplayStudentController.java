package com.jspider.advance_java_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DisplayStudentController {
	public static void main(String[] args) {
		Connection connection=null;
		
		
		try {
			//Step-1 Load/Register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step-2 Create Connection
			String url="jdbc:mysql://localhost:3306/jdbc";
			String user="root";
			String pass="root";
			
			connection=DriverManager.getConnection(url, user, pass);
			
			
			//CreateStatement
			Statement statement=connection.createStatement();
			
			
			//ExecuteQuery
			String displayQuery="SELECT* FROM Student";
			ResultSet resultSet=statement.executeQuery(displayQuery);
			while(resultSet.next()) {
				int id =resultSet.getInt("id");
				String name=resultSet.getString("name");
				String email=resultSet.getString("email");
				long phone=resultSet.getLong("phone");
				
				System.out.println("Id= "+id);
				System.out.println("name= "+name);
				System.out.println("email= "+email);
				System.out.println("phone= "+phone);
				
				System.out.println("------------------------------");
				
			}
			connection.close();
			
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
