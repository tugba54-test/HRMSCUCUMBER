package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo1{
	
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	//jdbc:driver type:hostname:port number/db name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";  
	@Test
	public void abc() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		System.out.println("DB connection is successful");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select *from hs_hr_employees");
		
		System.out.println(rs.next());
		
		String firstname=rs.getString("emp_firstname");
		System.out.println(firstname);
		rs.next();
		String firstname2=rs.getString("emp_firstname");
		System.out.println(firstname2);
		rs.next();
		int emp=rs.getInt("emp_number");
		System.out.println(emp);
		
		String allData;
		while(rs.next()) {
			allData=rs.getObject("Emp_firstname").toString();
			System.out.println(allData);
			
		}
		
		
		rs.close();
		st.close();
		conn.close();
		//retrieve all the job titles and store them in arraylist  and show it in
		//console it from arraylist
		
	}
//	Just in case if you get asked during the interview how you connected your to db from your eclipse/intelliJ  etc....  
	//it may help ; 
//		1-we called getConnection() method by passing dataBaseUrl(jdbc, type, host, port, database name),
//		dataBase userNamae, dataBasePassword and we created object of Connection interface
//		2- with object of Connection interface we created statement object.
//		3-with statement object we executed queries from our DataBase
		


			
}
