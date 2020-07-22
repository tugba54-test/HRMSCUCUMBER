package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCJOBtitle {

	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	//jdbc:driver type:hostname:port number/db name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";  
	@Test
	public void abc() throws SQLException {
	Connection conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
	System.out.println("DB connection is successful");
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select * from ohrm_job_title");
	
	List<String>allData1=new ArrayList<>();
	while(rs.next()) {
		allData1.add(rs.getString("job_title"));
		
	}
	System.out.println(allData1.toString());
	
	for(String data:allData1) {
		System.out.println(data);
	}

}
}