package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.boot.model.Employee;
import com.spring.boot.service.EmployeeServiceImpl;

@Controller("employeeController")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;

	public List<Employee> showEmployeeByDesignation(String designation1, String designation2, String designation3)
			throws Exception {
		List<Employee> employeeList = employeeService.fetchEmployeeByDesignation(designation1, designation2,
				designation3);
		return employeeList;
	}

}
