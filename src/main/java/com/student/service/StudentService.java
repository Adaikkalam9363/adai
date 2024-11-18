package com.student.service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;


import com.student.dao.StudentDao;
import com.student.entity.Student;
import com.student.evenexception.EvenException;
import com.student.exception.NameException;
@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	
	public String post(Student e) {
		return sd.post(e);
	}
	
//	public String post(@RequestBody List<Student> e) {
//		return ed.post(e);
//	}







                                                                              //MS 3




public List<Student> getAll() {
	return sd.getAll();
}

public List<Student> getEvenAges() {
	List<Student> students=sd.getAll();
	List<Student> temp=new ArrayList<>();
	
	students.forEach(x-> {
		if(x.getAge()%2==0) {
			temp.add(x);
		}
	});
	return temp;
}
		
	


                                                   //task1

public Student getMaxStudent() {
	List<Student>students=sd.getAll();
	
	return students.stream().max(Comparator.comparingInt(x->x.getAge())).get();
}


                                                  //task2
public List<Student> getAge() {
	List<Student> students=sd.getAll();
	return students.stream().filter(x->x.getAge()<40 && x.getAge()>25).toList();
}


                                                  //task3
public List<Student> least() {
	return sd.getAll().stream().filter(x->x.getName().length()>5).toList();
}

                                                   //task4
public List<Student> male() {
	return sd.getAll().stream().filter(x->x.getGender().equals("male") && x.getDept().equals("cs")).toList();
}

                                                 //task5
public List<Student> highest() {
	return sd.getAll().stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).limit(3).toList();
}











                                                            // Query
public List<Student> getAllval() {
	return sd.getAllVal();
}

public List<String> getName() {
	return sd.getName();
}

public List<Integer> getAges() {
	return sd.getAges();
}


public List<String> getNameAge() {
	return sd.getNameAge();
}

public List<Integer> getGreaterAge() {
	return sd.getGreaterAge();
}


public String getName(int id) throws NameException {
	if(sd.getName(id).startsWith("A")) {
		return sd.getName(id);
	}
	else {
		throw new NameException ();
	}
}




public List<Student> getByName(String name) throws NameException {
	if(sd.getByName(name).isEmpty()) {
		throw new NameException();
	}
	else {
		return sd.getByName(name);
	}
}


                                           //task
public int ageException() throws EvenException {
	int max=sd.ageException();
	if(max %2==0) {
		throw new EvenException();
	}
	else {
		return max;
	}
}

}




















