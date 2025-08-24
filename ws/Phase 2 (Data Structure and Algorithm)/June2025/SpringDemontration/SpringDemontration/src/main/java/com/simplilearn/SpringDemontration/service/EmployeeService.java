package com.simplilearn.SpringDemontration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.SpringDemontration.model.Employee;
import com.simplilearn.SpringDemontration.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	public List<Employee> getAllEmployees() {
		return employeeRepository.getEmployees();
	}
	
	
	public void saveEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
}
