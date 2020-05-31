package com.devi.web.dao;

import com.devi.web.model.Batch;
import com.devi.web.model.Courses;
import com.devi.web.model.Trainer;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class EnquireDetailsDao {

	String url="jdbc:mysql://localhost:3306/devi";
	String uname="root";
	String pwd="Test@123";
	Trainer details=new Trainer();
	Batch details1 = new Batch();
	Courses details2 = new Courses();
	
	
	
	
	
	
	public Trainer getEnquire(int Id) {
		String query="select * from Trainer where ID=" +Id;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pwd);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(rs.next()) {
				details.setID(rs.getInt("ID"));
				details.setNAME(rs.getString("NAME"));
				
				
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return details;
		
	}
}
	

