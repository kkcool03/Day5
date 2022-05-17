package com.mindgate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	private String Driver = "oracle.jdbc.driver.OracleDriver";
	private String user = "system";
	private String password = "mindgate123";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String query = "";
	private int resultCount = 0;

	public Set<Employee> getAllEmployees(){
		try {
			Class.forName(Driver);
			connection = DriverManager.getConnection(url, user, password);
			query = "select * from employe_details";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			Set<Employee> employeeset = new HashSet<Employee>();
			while(resultSet.next()) {
				int employeeId = resultSet.getInt("employee_id");
				String name =resultSet.getString("name");
				double salary = resultSet.getDouble("salary");
				Employee employee = new Employee(employeeId, name, salary);
				employeeset.add(employee);
			}
			return employeeset;
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("exception handled");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("exception handled");
				System.out.println(e.getMessage());
			}
		}
	return null;
	}
	public boolean addEmloyee(Employee employee) {
		try {
			Class.forName(Driver);
			connection = DriverManager.getConnection(url, user, password);
			query = "insert into employe_details(name,salary) values(?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setDouble(2, employee.getSalary());
			resultCount = preparedStatement.executeUpdate();
			if(resultCount > 0) {
				return true;
			}
			return false;
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("exception handled");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("exception handled");
				System.out.println(e.getMessage());
			}
		}
		return false;
	}
}
