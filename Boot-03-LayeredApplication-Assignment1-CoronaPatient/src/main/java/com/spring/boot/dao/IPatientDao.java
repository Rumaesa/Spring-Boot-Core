package com.spring.boot.dao;

import java.util.List;

import com.spring.boot.model.Patient;

public interface IPatientDao {

	public List<Patient> getPatientDetailByState(String state) throws Exception;
}
