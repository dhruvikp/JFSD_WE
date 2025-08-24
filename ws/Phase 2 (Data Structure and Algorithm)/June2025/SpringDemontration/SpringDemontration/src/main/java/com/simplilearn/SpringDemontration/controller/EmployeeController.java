package com.simplilearn.SpringDemontration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.simplilearn.SpringDemontration.model.Employee;
import com.simplilearn.SpringDemontration.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employeelist";
		
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
		
	}
	
	@GetMapping("employees/new")
	public String createEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeForm";
	}
	
}
