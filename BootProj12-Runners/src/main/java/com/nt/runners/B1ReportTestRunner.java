package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(20)
public class B1ReportTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("B1ReportTestRunner.run()");
	
		System.out.println("------------------");

	}

}
