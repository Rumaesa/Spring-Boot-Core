package com.spring.boot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.boot.controller.EmployeeController;
import com.spring.boot.model.Employee;

@SpringBootApplication
public class Boot01LayeredApplicationEmployeeSearchApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = 	SpringApplication.run(Boot01LayeredApplicationEmployeeSearchApplication.class, args);
	
	EmployeeController employeeController =  ctx.getBean("employeeController",EmployeeController.class);
	
	try {
		List<Employee> employees =  employeeController.showEmployeeByDesignation("Manager", "Developer", "Tester");
		employees.forEach(employee->{System.out.println(employee);});
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
