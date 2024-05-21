package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.EmployeeInfo;
import com.nt.sbeans.StudentInfo;

@SpringBootApplication
public class Boot06YmlProcessing {

	public static void main(String[] args) {
		   //get IOC container
		ApplicationContext ctx=SpringApplication.run(Boot06YmlProcessing.class, args);
		 //get Spring bean class obj ref
		EmployeeInfo info=ctx.getBean("empInfo",EmployeeInfo.class);
		System.out.println(info);
		System.out.println("========================");
		StudentInfo stud=ctx.getBean("studInfo",StudentInfo.class);
		System.out.println(stud);
		
		//close the container
		 ((ConfigurableApplicationContext) ctx).close();
	}

}
