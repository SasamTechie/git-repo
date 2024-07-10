package com.employeegroup.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeegroup.api.entity.Employee;
import com.employeegroup.api.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired

	private EmployeeService service;

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployeesList() {

		return service.getallEmployees();

	}

	@PostMapping("/saveEmployee")
	public Employee createEmployee(@RequestBody Employee emp) {

		return service.saveEmployee(emp);

	}

	public void updateEmployee(@RequestBody Employee emp) {

		service.updateEmployee(emp);

	}

}
