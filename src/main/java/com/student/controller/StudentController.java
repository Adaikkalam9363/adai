package com.student.controller;

import java.util.List;
//import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//import com.student;
import com.student.entity.Student;
import com.student.evenexception.EvenException;
import com.student.exception.NameException;
import com.student.service.StudentService;
//import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping(value="/postStudent")
	public String post(@RequestBody Student e) {
	return ss.post(e);
	}
	
//	@PostMapping(value="/postStudent")
//	public String post(@RequestBody List<Student> e) {
//		return es.post(e);
//	}
	
	
	
                               //	Log4j
	
	static Logger log=Logger.getLogger( StudentController.class);
	@GetMapping(value="/getAllList")
	public List<Student> getAlllist() {
		PropertyConfigurator.configure("log4j.properties");
		log.info(ss.getAll());
		return ss.getAll();
	}
	
	
	
	
	

	
	











                                                                                    //MS 3



	@GetMapping(value="/getAll")
	public List<Student>getAll() {
		return ss.getAll();
	}
	
	
	
@GetMapping(value="/getEven")
public List<Student> getEvenAges() {
	return ss.getEvenAges();
}



                            //task1           max Age Student

@GetMapping(value="/getMax")
public Student getMaxStudent() {
	return ss.getMaxStudent();
}
	

                          //task2             age below 40 & above 25
@GetMapping(value="/GetAge")
public List<Student> getAge() {
	return ss.getAge();
}


                        //task3                          least 3 length name
@GetMapping(value="/getLeast")
public List<Student> least() {
	return ss.least();
}

                         //task4                         male student cs dept
@GetMapping(value="/getMale")
public List<Student> male() {
	return ss.male();
}


                       //task5                          high 3 Age
@GetMapping(value="/getHigh")
public List<Student> highest() {
	return ss.highest();
}












                                                                 //Query
@GetMapping(value="/getAllQuery")
public List<Student> getAllVal() {
	return ss.getAllval();
}

@GetMapping(value="/getName")
public List<String> getName() {
	return ss.getName();
}


@GetMapping(value="/getAges")
public List<Integer> getAges() {
	return ss.getAges();
}

@GetMapping(value="/getNameAge")
public List<String> getNameAge() {
	return ss.getNameAge();
}


@GetMapping(value="/getGreaterAge")
public List<Integer> getGreaterAge() {
	return ss.getGreaterAge();
}


                                                                              //Exception Throw
@GetMapping(value="/getStartName/{id}")
public String getName(@PathVariable int id) throws NameException {
	try {
	return ss.getName(id);
}
	catch(Exception e) {
		return ""+e;
	}
}


@GetMapping(value="/getByNames/{name}")
public List<Student>getByName(@PathVariable String name) throws NameException {
	return ss.getByName(name);
}



                                               //task
@GetMapping(value="/getByAges")
public int ageException() throws EvenException {
	return ss.ageException();
}



}
















































