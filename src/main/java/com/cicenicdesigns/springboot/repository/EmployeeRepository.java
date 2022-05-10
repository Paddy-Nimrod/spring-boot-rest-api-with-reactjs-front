package com.cicenicdesigns.springboot.repository;

import com.cicenicdesigns.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
