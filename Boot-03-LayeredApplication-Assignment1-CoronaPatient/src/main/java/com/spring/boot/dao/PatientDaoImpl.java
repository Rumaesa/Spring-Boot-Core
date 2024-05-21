package com.spring.boot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.Patient;

@Repository("patientDao")
public class PatientDaoImpl implements IPatientDao {

	private static final String GET_PATIENTS_BY_STATE = "SELECT * FROM PATIENT WHERE STATE = (?)";
	
	@Autowired
	public DataSource dataSource;
	
	@Override
	public List<Patient> getPatientDetailByState(String state) throws Exception {
		
		List<Patient> patients = null;
		
		try(Connection con = dataSource.getConnection();
				PreparedStatement preparedStatement= con.prepareStatement(GET_PATIENTS_BY_STATE)){
			preparedStatement.setString(1, state);
						
			try(ResultSet resultSet = preparedStatement.executeQuery()) {
				patients = new ArrayList<Patient>();
				while(resultSet.next()) {
					Patient patient = new Patient();
					patient.setPatientId(resultSet.getInt(1));
					patient.setPatientName(resultSet.getString(2));
					patient.setContact(resultSet.getDouble(3));
					patient.setState(resultSet.getString(4));
					patients.add(patient);
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return patients;
	}

}
