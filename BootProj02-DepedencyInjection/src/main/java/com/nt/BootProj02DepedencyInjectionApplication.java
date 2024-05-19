package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj02DepedencyInjectionApplication {

	public static void main(String[] args) {
		//get Access to IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj02DepedencyInjectionApplication.class, args);
		//get Target Spring bean class obj ref
		Vehicle  vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke the b.method
		vehicle.journey("hyderabad", "Goa");
		
		//close the container
		((ConfigurableApplicationContext) ctx).close(); 
		}

}
