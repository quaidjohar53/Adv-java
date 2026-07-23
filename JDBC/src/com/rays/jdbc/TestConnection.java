package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "password");
		System.out.println("java is connected with mysql successfully....");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from students");

		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1));
			System.out.println("Name" + rs.getString(2));
			System.out.println("Age: " + rs.getInt(3));
			System.out.println("City: " + rs.getString(4));
			System.out.println("Email: " + rs.getString(5));

		}

		conn.close();

	}

}
