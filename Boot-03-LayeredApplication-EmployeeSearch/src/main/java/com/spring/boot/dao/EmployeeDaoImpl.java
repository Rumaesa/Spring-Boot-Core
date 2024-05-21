package com.spring.boot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String GET_EMPLOYEE_BY_DESIGNATION = "SELECT * FROM EMPLOYEE WHERE DESIGNATION IN(?,?,?) ORDER BY DESIGNATION";

	@Autowired
	private DataSource dataSource;

	@Override
	public List<Employee> getEmployeeByDesignation(String designation1, String designation2, String designation3)
			throws Exception {
		System.out.println("EmployeeDaoImpl.getEmployeeByDesignation()");
		List<Employee> employees = null;

		try (Connection con = dataSource.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(GET_EMPLOYEE_BY_DESIGNATION)) {

			preparedStatement.setString(1, designation1);
			preparedStatement.setString(2, designation2);
			preparedStatement.setString(3, designation3);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				employees = new ArrayList<Employee>();
				while(resultSet.next()) {
					Employee employee = new Employee();
					employee.setEmployeeId(resultSet.getInt(1));
					employee.setEmployeeName(resultSet.getString(2));
					employee.setDesignation(resultSet.getString(3));
					employee.setSalary(resultSet.getDouble(4));
					employee.setDepartment(resultSet.getString(5));
					employees.add(employee);
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return employees;
	}

}
