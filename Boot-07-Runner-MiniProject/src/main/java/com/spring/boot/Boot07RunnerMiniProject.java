package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot07RunnerMiniProject {

	public static void main(String[] args) {
//	ApplicationContext ctx = 	
			SpringApplication.run(Boot07RunnerMiniProject.class, args);
	
//	EmployeeController employeeController =  ctx.getBean("employeeController",EmployeeController.class);
//	
//	try {
//		List<Employee> employees =  employeeController.showEmployeeByDesignation("Manager", "Developer", "Tester");
//		employees.forEach(employee->{System.out.println(employee);});
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}

}
