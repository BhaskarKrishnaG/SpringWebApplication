package com.jda.spring.core;

public class EmployeeDAO {
	Employee generateId (Employee emp) {
		int id = (int)(Math.random() * 2000);
		emp.setId(id);
		System.out.println("Generated a new employee id: " + id + " for " + emp.fname +" "+ emp.lname);
		
		return emp;
	}
}
