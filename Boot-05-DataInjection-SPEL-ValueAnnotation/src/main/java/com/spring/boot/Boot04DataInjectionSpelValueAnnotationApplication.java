package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.boot.beans.HotelInformation;
import com.spring.boot.beans.HotelMenu;

@SpringBootApplication
public class Boot04DataInjectionSpelValueAnnotationApplication {

	public static void main(String[] args) {
	
		ApplicationContext ctx = SpringApplication.run(Boot04DataInjectionSpelValueAnnotationApplication.class, args);
		HotelMenu hotelMenu = ctx.getBean("hotelMenu",HotelMenu.class);
		System.out.println(hotelMenu.toString());
		HotelInformation hotelInformation = ctx.getBean("hotelInfo",HotelInformation.class);
		
		System.out.println(hotelInformation.toString());
	}

}
