package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.DBConnection;

public class EmployeeDao {

	Connection conn = null;

	public boolean addEmployee(String name) {

		boolean flag = false;
		conn = DBConnection.getConnection();
		if (conn != null) {

			try {
				String insertSQL = "insert into employee(name)values(?)";
				PreparedStatement pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, name);
				int res = pstmt.executeUpdate();
				if (res > 0) {

					System.out.println("employee is intsered..");
					flag = true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return flag;
	}

	// DDL DML
	// DDL -> select
	// executeQuery();
	// DML insert,update,datele. 0 1,0 1,0 1
	public List<String> employeeList() {

		// we neddd database connection
		Connection conn = DBConnection.getConnection();
		List<String> employees = new ArrayList<String>();
		if (conn != null) {

			String selectSQL = "select * from employee";
			try {
				PreparedStatement pstmt = conn.prepareStatement(selectSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					String name = rs.getString("name");
					employees.add(name);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return employees;
	}

	public boolean deleteEmployee(String name) {

		boolean flag = false;
		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String DELETURL = "delete from employee where name =?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(DELETURL);
				pstmt.setString(1, name);
				int res = pstmt.executeUpdate();
				if (res > 0) {

					flag = true;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return flag;

	}

}
