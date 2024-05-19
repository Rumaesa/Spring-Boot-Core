package com.spring.boot.dependency.injection;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.boot.dependency.injection.beans.SeasonFinder;

@SpringBootApplication
public class Boot01DependencyInjectionApplication {

	@Bean(name="dt")
	public LocalDate getDate() {
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Boot01DependencyInjectionApplication.class, args);
		
		ApplicationContext ctx = SpringApplication.run(Boot01DependencyInjectionApplication.class, args);
		SeasonFinder seasonFinder = ctx.getBean("seasonFinder",SeasonFinder.class);
		String season = seasonFinder.seasonFinder();
		
		System.out.println(season);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
