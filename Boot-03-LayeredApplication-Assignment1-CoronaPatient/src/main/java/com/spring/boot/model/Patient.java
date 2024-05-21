package com.spring.boot.model;

import lombok.Data;

@Data
public class Patient {

	public Integer patientId;
	public String patientName;
	public double contact;
	public String state;
}
