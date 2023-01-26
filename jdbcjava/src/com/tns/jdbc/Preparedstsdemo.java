package com.tns.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparedstsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		try {
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root", null);
		String str="insert into employee{id,firstname,lastname}";
		ps.setInt(2,22);
		ps.setString(0, "java");
		ps.setString(1, "mysql");
		//count will give you how many records got updated
		 int count = ps.executeUpdate();
		 
		 //run the same query with different values
		 ps.setInt(3, 66);
		 ps.setString(2,"oracle");
		 ps.setString(1,"dbms");
		 System.out.println("no of records updated"+count);
		}catch (SQLException e) {
			e.printStackTrace();
			
		
		
		}
		

	}

}
