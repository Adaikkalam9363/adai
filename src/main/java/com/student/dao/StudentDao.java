package com.student.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.RequestBody;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
@Repository
public class StudentDao {
	@Autowired
	StudentRepository er;
	
	public String post(Student e) {
		er.save(e);
		return "Posted Successfully";
	}
	
//	public String post(@RequestBody List<Student> e) {
//		er.saveAll(e);
//		return "Posted Successfully";
//	}

//}
	
	
	
	
                                                                              //	MS 3

public List<Student> getAll() {
	return er.findAll();
}







                                                   //Query
public List<Student> getAllVal() {
	return er.getAllVal();
}


public List<String> getName() {
	return er.getName();
}


public List<Integer> getAges() {
	return er.getAges();
}


public List<String> getNameAge() {
	return er.getNameAge();
}

public List<Integer> getGreaterAge() {
	return er.getGreaterAge();
}


                                                                              //Exception throw
public String getName(int id) {
	return er.findById(id).get().getName();
}

public List<Student> getByName(String name){
	return er.getByNames(name);
}


                                                                //task1
public int ageException() {
	return er.ageException();
}

}
















