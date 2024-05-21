package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.EmployeeDaoImpl;
import com.spring.boot.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeDao;
	
	@Override
	public List<Employee> fetchEmployeeByDesignation(String designation1, String designation2, String designation3)
			throws Exception {
		
		designation1 = designation1.toUpperCase();
		designation2 = designation2.toUpperCase();
		designation3 = designation3.toUpperCase();
		
		List<Employee> employees =  employeeDao.getEmployeeByDesignation(designation1, designation2, designation3);
		return employees;
	}

}
