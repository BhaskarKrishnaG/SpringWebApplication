package com.jda.spring.core;

public class EmployeeServiceImplSp implements EmployeeService {

	public Employee generateMail(Employee emp) {
		String email = emp.fname.substring(0, 1) + emp.lname + "@jda.com";
		emp.setmailId(email);
		System.out.println("Generated a new mail id: " + email + " for " + emp.fname + " " + emp.lname);

		EmployeeDAO dao = new EmployeeDAO();

		return dao.generateId(emp);
	}

}
