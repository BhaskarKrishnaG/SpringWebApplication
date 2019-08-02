package com.jda.spring.core;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public Employee generateMail(Employee emp) {
		String email = emp.fname + "." + emp.lname + "@jda.com";
		emp.setmailId(email);
		System.out.println("Generated a new mail id: " + email + " for " + emp.fname + " " + emp.lname);

		EmployeeDAO dao = new EmployeeDAO();

		return dao.generateId(emp);
	}
}
