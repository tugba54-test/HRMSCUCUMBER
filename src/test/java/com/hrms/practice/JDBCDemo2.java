package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo2 {
	String dbUsername="syntax_hrm";
	String dbPasswod="syntaxhrm123";
	
	// jdbc:driver type:hostname:port//db name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	//jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql
	
	@Test
	public void cde() throws SQLException {
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPasswod);
		System.out.println("DB connection is successful");
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from hs_hr_emp_basicsalary");
		//System.out.println(rs);
		
		rs.next();
		String salary=rs.getString("ebsal_basic_salary");
		System.out.println(salary);
		
		rs.next();
		String salary2=rs.getString("ebsal_basic_salary");//we can use getObject().toString()
		System.out.println(salary2);
		
		String allData;
		while(rs.next()) {
			allData=rs.getObject("ebsal_basic_salary").toString();
			System.out.println(allData);
		}
		
		rs.close();
		st.close();
		conn.close();
	}
	
	
	@Test
	public void getNumber() throws SQLException {
		
		Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPasswod);
		System.out.println("DB connection is successful");
		
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from hs_hr_emp_basicsalary");
		//System.out.println(rs);
		
		//comments
				System.out.println("-----All Employee Number -----");
				List<String> num=new ArrayList<>();
				while(rs.next()) {
					num.add(rs.getString("emp_number"));
					}
				
				for(String numbers:num) {
					System.out.println(numbers);
					
				}
				
		rs.close();
		st.close();
		conn.close();
		
		
		
	}
	

}
