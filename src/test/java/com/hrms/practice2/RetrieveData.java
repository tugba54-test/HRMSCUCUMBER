package com.hrms.practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class RetrieveData {
	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:driver type:hostname:port number/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void retriveAndStoreDataEnhance() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from ohrm_job_title");
		
		ResultSetMetaData rsMetaData=rs.getMetaData();
		
		List<Map<String,String>>listData=new ArrayList<>();
		Map<String,String>mapData ;
		while(rs.next()) {
			mapData=new LinkedHashMap<>();
		for(int i=1;i<=rsMetaData.getColumnCount();i++) {
			
			mapData.put(rsMetaData.getColumnName(i),rs.getObject(i).toString());
		}
		listData.add(mapData);
		}
		System.out.println(listData);
}
}