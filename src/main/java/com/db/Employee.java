package com.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee-table")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	
	
	public void setId(int a) {
		id=a;
	}
	public int getId() {
		return id;
	}
	public void setName(String b) {
		name=b;
	}
	public String getName() {
		return name;
	}
	public void setAge(int c) {
		age=c;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String d) {
		gender=d;
	}
	public String getGender() {
		return gender;
	}
	public void setSalary(int e) {
		salary=e;
	}
	public int getSalary() {
		return salary;
	}
}
