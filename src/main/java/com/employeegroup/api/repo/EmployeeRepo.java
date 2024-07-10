package com.employeegroup.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeegroup.api.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
