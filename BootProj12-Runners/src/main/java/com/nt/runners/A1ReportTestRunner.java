package com.nt.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-100)
public class A1ReportTestRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("A1ReportTestRunner.run()");
		System.out.println("------------------");

	}
	
	@Override
	public int getOrder() {
		return 0;
	}

}
