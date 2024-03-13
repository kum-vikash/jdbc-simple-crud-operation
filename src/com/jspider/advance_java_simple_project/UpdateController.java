package com.jspider.advance_java_simple_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateController {
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
			
			//Step-3 Create Statement
			Statement statement=connection.createStatement();
			
			//Step-4 Execute Query
			String updateQuery="update student set  name='Vimal' where id =123";
			int a=statement.executeUpdate(updateQuery);
			if(a!=0) {
				System.out.println("Data-------------Updated");
			}
			else {
				System.out.println("Given id is not found");
			}
			
			//Close Connection
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
