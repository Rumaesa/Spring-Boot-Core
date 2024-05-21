package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.sbeans.CompanyInfo;

@SpringBootApplication
@PropertySource("myfile.properties")
public class BootProj06BulkDataInjectionConfigruationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj06BulkDataInjectionConfigruationPropertiesAnnotationApplication.class, args);
	    //get spring bean class obj ref
		CompanyInfo info=ctx.getBean("company",CompanyInfo.class);
		System.out.println(info);
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
	 
	}

}
