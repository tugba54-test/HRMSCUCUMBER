package com.hrms.practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Task {
	
	// display the information from nationality table, 
		//but display id “nationality id”, name = “nationality”
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:driver type:hostname:port number/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void getAndStoreData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from ohrm_nationality");
		
		List<Map<String,String>>listOfData=new ArrayList<>();
		Map<String,String>mapData;
		
		while(rs.next()) {
			mapData=new LinkedHashMap<>();
			mapData.put("Nationality id", rs.getObject("id").toString());
			mapData.put("natioanlity", rs.getObject("name").toString());
			
			listOfData.add(mapData);
			
		}
	
		System.out.println(listOfData);
		
	}
}


