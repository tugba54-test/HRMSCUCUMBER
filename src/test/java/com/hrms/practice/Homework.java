package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Homework {
	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:driver type:hostname:port number/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	// get the result set metadata store it in the arraylist and retrieve it from arraylist
	@Test
	public void rsMetaData1() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("select * from hs_hr_emp_basicsalary");
        
		List<String> salary = new ArrayList<>();
		while (rs.next()) {
			salary.add(rs.getString("ebsal_basic_salary"));

		}
		System.out.println(salary);

		for (String allS : salary) {
			System.out.print(allS + " ");
		}

		// get column name
		ResultSetMetaData rsMetaData = rs.getMetaData();
		int colN1 = rsMetaData.getColumnCount();
		for (int i = 1; i <= colN1; i++) {
			String Cname = rsMetaData.getColumnName(i);
			System.out.println(Cname);

		}
		
		
		rs.close();
		st.close();
		conn.close();
	}

	@Test
	public void rsMetaData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("select * from hs_hr_emp_language");
		ResultSetMetaData rsMetaData = rs.getMetaData();

		String colName = rsMetaData.getColumnTypeName(1);
		// System.out.println(colName);
		// get column type name
		int colN = rsMetaData.getColumnCount();
		System.out.println("Language column count: "+colN);
		for (int i = 1; i <= colN; i++) {

			String colName1 = rsMetaData.getColumnTypeName(i);
			System.out.println(colName1);
		}

		// get table name
		String tableName = rsMetaData.getTableName(1);
		System.out.println(tableName);
		

	}
}