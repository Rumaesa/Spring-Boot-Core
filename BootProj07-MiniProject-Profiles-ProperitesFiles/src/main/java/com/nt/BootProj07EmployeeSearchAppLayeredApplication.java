package com.nt;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controller.EmployeeOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj07EmployeeSearchAppLayeredApplication {

	public static void main(String[] args) {
		  //get the ApplicationContext container
		ApplicationContext ctx=SpringApplication.run(BootProj07EmployeeSearchAppLayeredApplication.class, args);
		
	/*	//create SpringApplication class object
		 SpringApplication application=new SpringApplication(BootProj07EmployeeSearchAppLayeredApplication.class);
		 application.setAdditionalProfiles("test");
	  ApplicationContext ctx=	application.run(args);  */
		 
		//get the Controller class objecvt
		EmployeeOperationsController controller=ctx.getBean("empController",EmployeeOperationsController.class);
		
		//invoke the b.method
		try {
			List<Employee> list=controller.showEmployeesByDesgs("clerk", "MANAGER", "SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("=================================");
		//get Environment object
		Environment env=ctx.getEnvironment();
		System.out.println("current Profile name::"+Arrays.toString(env.getActiveProfiles()));
	}//main

}//class
