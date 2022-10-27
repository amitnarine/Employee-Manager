package com.amitnarine.employeemanager.repo;

import com.amitnarine.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {



}
