package com.spring.boot.service;

import java.util.List;

import com.spring.boot.model.Employee;

public interface IEmployeeService {

	public List<Employee> fetchEmployeeByDesignation(String designation1, String designation2, String designation3)throws Exception;
}
