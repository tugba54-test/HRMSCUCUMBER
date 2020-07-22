package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class dataBaseMetadata2 {
	
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	//jdbc:driver type:hostname:port number/db name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";  
	
	@Test
	public void dbMetaData() throws SQLException{
		Connection conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		DatabaseMetaData dbMetaData=conn.getMetaData();
		
		String driverName=dbMetaData.getDriverName();
		String dbVersion=dbMetaData.getDatabaseProductVersion();
		System.out.println(driverName+"\n"+dbVersion);
	}
	
	@Test
	public void rsMetaData() throws SQLException{
		Connection conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		Statement st=conn.createStatement();
		
		ResultSet rs=st.executeQuery("select * from hs_hr_employees where emp_number=14688" );
		
		ResultSetMetaData rsMetaData=rs.getMetaData();
		int colNumbers=rsMetaData.getColumnCount();
		System.out.println(colNumbers);
		
		String colName1=rsMetaData.getColumnName(1);//first column name
		System.out.println(colName1);
		
		for(int i=1;i<=colNumbers;i++) {
			String names=rsMetaData.getColumnName(i);
			System.out.println(names);
			
		}
	}
	}		
		
		
		
		
		


