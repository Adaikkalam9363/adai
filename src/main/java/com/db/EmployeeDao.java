package com.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


	@Repository
	public class EmployeeDao {
		@Autowired
		EmployeeRepository er;
//		public String post(Employee e) {
		
		
		public String post(@RequestBody List<Employee> e) {
			er.saveAll(e);
			return "Posted Successfully";
		}
		
		
		
		public List<Employee> getAll() {
			return er.findAll();
		}
		
		
		
		public Employee get(int id) {
			return er.findById(id).get();
		}
		
		
		
		public String put(Employee e) {
			er.save(e);
			return "Updated Successfully";
		}
		
		
		
		public String delete(int id) {
			er.deleteById(id);
			return "Updated Successfully";
		}

	}

