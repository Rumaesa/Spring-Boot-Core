package com.nt;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Boot07RunnersApplication {
	
	
	//Runners  through   @Bean methods
	
	@Bean
	public  CommandLineRunner createRunner1() {
		CommandLineRunner runner1=args->{
			System.out.println("Special Runner1");
		};
		return runner1;
	}
	
	@Bean
	public  ApplicationRunner createRunner2() {
		ApplicationRunner runner2=args->{
			System.out.println("Special Runner2");
		};
		return runner2;
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(Boot07RunnersApplication.class, args);
	}

}
