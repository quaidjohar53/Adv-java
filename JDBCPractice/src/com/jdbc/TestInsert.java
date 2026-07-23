package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "password");
		
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("insert  into students values(4, 'Akbar', 18,'Indore', 'akbar@gmail.com')");
		
		System.out.println(i + "Row affected ...(record inserted)");
		
		conn.close()
;	}

}
