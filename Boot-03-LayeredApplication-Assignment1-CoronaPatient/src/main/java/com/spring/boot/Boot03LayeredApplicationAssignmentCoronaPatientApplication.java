package com.spring.boot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.boot.controller.PatientController;
import com.spring.boot.model.Patient;

@SpringBootApplication
public class Boot03LayeredApplicationAssignmentCoronaPatientApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  SpringApplication.run(Boot03LayeredApplicationAssignmentCoronaPatientApplication.class, args);
		PatientController patientController = ctx.getBean("patientController",PatientController.class);
		try {
			List<Patient> patients = patientController.showPatientsByState("Maharashtra");
			patients.forEach(patient -> System.out.println(patient));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
