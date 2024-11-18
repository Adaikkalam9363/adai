package com.student.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.entity.Student;

//public class StudentRepository {
public interface StudentRepository extends JpaRepository <Student,Integer> {
	
	
                                                                   //	Query
	@Query(value="Select * from student_table",nativeQuery=true)
		public List<Student> getAllVal();
	
	
	@Query(value="Select name from student_table",nativeQuery=true)
	public List<String> getName();
	
	
	@Query(value="Select age from student_table",nativeQuery=true)
	public List<Integer> getAges();
	
	
	@Query(value="Select name,age from student_table",nativeQuery=true)
	public List<String> getNameAge();
	
	@Query(value="Select age from student_table where age>?",nativeQuery=true)
	public List<Integer> getGreaterAge();
	
	
                                                                                      //	Exception throw
	@Query(value="Select * from student_table where name like ?",nativeQuery=true)
	public List<Student>getByNames(String name);
	
	
                                                    //	task
	@Query(value="Select max(age) from student_table",nativeQuery=true)
	public int ageException();
	
	}


