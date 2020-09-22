package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTestAutomation {
	
	//selenium WebDriver -->Automating Browser -->GUI(Graphical User Interface Testing

	
	public static void main(String[] args) throws SQLException {
		
		String dbURL="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
		String userName="syntax_hrm";
		String password="syntaxhrm123";
		
		System.out.println("Creating connection");
		Connection connection=DriverManager.getConnection(dbURL,userName,password);
		System.out.println("Connection established");
		
		//2.create Statement
		 System.out.println("Creating Statement");
		Statement statement=connection.createStatement();
		System.out.println("Statement Created");
		
		DatabaseMetaData dbmetaData=connection.getMetaData();
		
		String jdbcDrivername=dbmetaData.getDriverName();
		System.out.println("JDBC Driver Name: "+jdbcDrivername);
		
		//.getusername
		
		
		//3. Execute Query
		System.out.println("Executing Query");
		ResultSet rs=statement.executeQuery("select *from ohrm_employment_status");
		System.out.println("resultset object is created");
		
		ResultSetMetaData rsMetaData=rs.getMetaData();
		int columnCount=rsMetaData.getColumnCount();
		System.out.println("number of column in resultSet : "+columnCount);
		
		//getColumn name
		String colName=rsMetaData.getColumnName(1);
		System.out.println("Name of first column : "+colName);
		
		//getColumnType(int index)--> Returns type of column at given index
		System.out.println("Column type : "+rsMetaData.getColumnTypeName(1));
		
		//4.Process result
		//lets print informatio we get fromthe query
		//next()--> moves the curser to the one more row next from the current position
//		 rs.next();
//		 String id=rs.getString(1);
//		 
//		 
//		 String empStatus=rs.getString("name");
//		 System.out.println(id+"  "+empStatus);
//		 
//		 rs.next();
//		 String id1=rs.getString(1);
//		 System.out.println(id1);
//		 
		 
		 while(rs.next()) {
			 String id=rs.getString(1);
			 String empStatus=rs.getString("name");
			 System.out.println(id+"  "+empStatus); 
			 
		 }
		 
		 rs.close();
		 statement.close();
		 connection.close();
	}
}
