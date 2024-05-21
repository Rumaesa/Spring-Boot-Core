package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.PatientDaoImpl;
import com.spring.boot.model.Patient;

@Service("patientService")
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private PatientDaoImpl patientDao;
	
	@Override
	public List<Patient> fetchPatientsByState(String state) throws Exception {
		List<Patient> patients = patientDao.getPatientDetailByState(state);
		return patients;
	}

}
