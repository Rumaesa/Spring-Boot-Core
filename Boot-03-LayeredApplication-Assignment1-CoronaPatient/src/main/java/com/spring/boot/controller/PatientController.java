package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.boot.model.Patient;
import com.spring.boot.service.PatientServiceImpl;

@Controller("patientController")
public class PatientController {

	@Autowired
	private PatientServiceImpl patientService;
	
	public List<Patient> showPatientsByState(String state) throws Exception{
		
		List<Patient> patients  =patientService.fetchPatientsByState(state);
		
		return patients;
	}
	
}
