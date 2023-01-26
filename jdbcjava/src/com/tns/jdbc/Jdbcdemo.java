package com.tns.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo {

		public static void main(String[] args) {
			
				//Establishing the Connection
		try {			
		
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/books_id","name","qty");
						//Creating the Statement
		Statement st=con.createStatement();
							
							//write  the query
		
        String str="select id,name,Quality from books";
        System.out.println("The sql statement is "+str+"\n");
							//execute the query
        
	    ResultSet rs=st.executeQuery(str);
		System.out.println("The records are:");
		//process the result
		int rowCount=0;
	    while(rs.next()) {
	    int id=rs.getInt("Name");
		String name=rs.getString("Price");
	    int qty=rs.getInt("Quality");
		System.out.println("id"+" "+"name"+" "+"qty");
		++rowCount;
		
			}
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
			}
}
							
							
						
					

				

	

	



