package com.employeegroup.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeegroup.api.entity.Employee;
import com.employeegroup.api.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired

	private EmployeeRepo repo;

	public List<Employee> getallEmployees() {

		return repo.findAll();
	}

	public Employee saveEmployee(Employee emp) {

		return repo.save(emp);
	}

	public void updateEmployee(Employee emp) {

		repo.save(emp);

	}

}
