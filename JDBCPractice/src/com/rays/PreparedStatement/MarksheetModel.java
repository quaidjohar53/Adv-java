package com.rays.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class MarksheetModel {


		public void add(Marksheetbean bean) {

		    try {

		        Connection conn = DBConnection.getConnection();

		        String sql = "INSERT INTO marksheet VALUES (?, ?, ?, ?, ?, ?)";

		        PreparedStatement ps = conn.prepareStatement(sql);

		        ps.setInt(1, bean.getId());
		        ps.setString(2, bean.getName());   // If you later rename it to getName(), change this too
		        ps.setInt(3, bean.getRollNo());
		        ps.setInt(4, bean.getPhy());
		        ps.setInt(5, bean.getChm());
		        ps.setInt(6, bean.getMaths());

		        int rows = ps.executeUpdate();

		        if (rows > 0) {
		            System.out.println("Record Inserted Successfully");
		        } else {
		            System.out.println("Record Not Inserted");
		        }

		        ps.close();
		        conn.close();

		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		
		

	}

	public void update(Marksheetbean bean) {

	}
	public void delete(Marksheetbean bean) {

	}
	public Marksheetbean findByRollNo(int rollNo) {

		return null;

	}

	
	public Marksheetbean findByPk(int id) {

		return null;

	}
	
	

}
