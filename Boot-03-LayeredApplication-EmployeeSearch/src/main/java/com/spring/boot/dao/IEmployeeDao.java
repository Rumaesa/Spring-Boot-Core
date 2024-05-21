package com.spring.boot.dao;

import java.util.List;

import com.spring.boot.model.Employee;

public interface IEmployeeDao {

	public List<Employee> getEmployeeByDesignation(String designation1,String designation2,String designation3)throws Exception;
}
