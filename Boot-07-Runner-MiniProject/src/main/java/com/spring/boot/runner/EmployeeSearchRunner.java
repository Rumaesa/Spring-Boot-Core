package com.spring.boot.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.boot.controller.EmployeeController;
import com.spring.boot.model.Employee;

@Component
public class EmployeeSearchRunner implements CommandLineRunner {

	@Autowired
	private EmployeeController employeeController;

	@Override
	public void run(String... args) throws Exception {
		List<Employee> employees = employeeController.showEmployeeByDesignation("Manager", "Developer", "Tester");

		employees.forEach(employee -> {
			System.out.println(employees);
		});
	}

}
