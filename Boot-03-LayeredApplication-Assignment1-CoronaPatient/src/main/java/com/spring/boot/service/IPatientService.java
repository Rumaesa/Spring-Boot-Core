package com.spring.boot.service;

import java.util.List;

import com.spring.boot.model.Patient;

public interface IPatientService {

	public List<Patient> fetchPatientsByState(String state) throws Exception;
}
