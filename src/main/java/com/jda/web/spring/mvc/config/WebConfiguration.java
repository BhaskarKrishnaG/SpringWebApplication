package com.jda.web.spring.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// This guy is the entry point for the spring
public class WebConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Entry");
		Class conclass = ControlConfig.class;
		Class[] allConfigClasses = new Class[1];
		allConfigClasses[0] = conclass;
		
		return allConfigClasses;
		// return new Class[] {ControlConfig.class}
	}

	/*
	 * We are telling spring here that you take care of everything that starts with /
	 * 
	 * If we were to handle only few sorts of URLs by spring and we want to manually handle few others
	 * then were we will specify only those that spring needs to handle.
	 */
	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
