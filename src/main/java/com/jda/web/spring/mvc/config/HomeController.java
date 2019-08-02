package com.jda.web.spring.mvc.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jda.spring.core.Employee;
import com.jda.spring.core.EmployeeService;
import com.jda.spring.core.EmployeeServiceImpl;

/*
 * This guy will be the conductor for all the layers, as well as
 * act as the entry point to server side
 */
@Controller
public class HomeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/home")
	String homePage() {
		System.out.println("Display home page");
		
		return "welcome";
	}
	
	@RequestMapping("/generateEmpE2E")
	String  displayDetails(HttpServletRequest request, HttpServletResponse response){
		Employee emp = new Employee(request.getParameter("fname"), request.getParameter("lname"));
//		EmployeeService service = new EmployeeServiceImpl();
		System.out.println("Employee " + request.getParameter("fname") + " " + request.getParameter("lname") + " added to the system!");

		service.generateMail(emp);
		
		request.setAttribute("Id", emp.getId());
		request.setAttribute("Mail", emp.getmailId());
		request.setAttribute("Name", emp.getFname() + " " + emp.getLname());	
		
		return "EmployeeDetailsE2E";
	}

}
