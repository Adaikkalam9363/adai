package com.db;

import org.springframework.data.jpa.repository.JpaRepository;

//public class EmployeeRepository {
	public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	}
