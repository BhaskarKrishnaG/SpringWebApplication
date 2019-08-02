package com.jda.web.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = { "com.jda.spring.core", "com.jda.web.spring.mvc.config" })
public class ControlConfig {

	/*
	 * This guy will add prefix and suffix to the page names that we specify so that
	 * we don't have to give full path each time
	 * 
	 * This has alread been define for xml in https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/view.html
	 * ------------------------------------------- 
	 * <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	 *     <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/> 
	 *     <property name="prefix" value="/WEB-INF/jsp/"/> <property name="suffix" value=".jsp"/>
	 * </bean>
	 *
	 */
	@Bean
	InternalResourceViewResolver viewRes() {
		
		InternalResourceViewResolver invr = new InternalResourceViewResolver();
		invr.setPrefix("/WEB-INF/pages/");
		invr.setSuffix(".jsp");
		
		return invr;
	}

}
