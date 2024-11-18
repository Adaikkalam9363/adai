package com.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
//	@PostMapping(value="/postEmp")
//	public String post(@RequestBody Employee e) {
	
	
	@PostMapping(value="/postEmp1")
	public String post(@RequestBody List<Employee> e) {
		return es.post(e);
	}
                                                                                            //	post
	
	
	
	@GetMapping(value="/getEmp")
	public List<Employee>getAll() {
		return es.getAll();
	}
                                                                                              //	get
	
	
	
	@GetMapping(value="/getById/{id}")
	public Employee get(@PathVariable int id) {
		return es.get(id);
	}
	
	
	
	@PutMapping(value="/update")
	public String put(@RequestBody Employee e) {
		return es.put(e);
	}
	
	
	
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable int id) {
		return es.delete(id);
	}

}
