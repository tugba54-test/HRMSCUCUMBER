package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Recap1 {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:driver type:hostname:port number/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void getConnected() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	DatabaseMetaData dbMetaData=conn.getMetaData();
	String dbName=dbMetaData.getDatabaseProductName();
	System.out.println(dbName);
	
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select * from ohrm_skill");
	ResultSetMetaData rsMetaData=rs.getMetaData();
	int col=rsMetaData.getColumnCount();
	System.out.println(col);
	
	for(int i=1;i<=col;i++) {
		String colName=rsMetaData.getColumnName(i);
		System.out.println(colName);
	}
	
	String id;
	String name;
	while(rs.next()) {
		id=rs.getObject("id").toString();
		name=getObject("name").toString();
		
		System.out.println(id);
		System.out.println(name);
		
	}
	
	

}

	

	
}