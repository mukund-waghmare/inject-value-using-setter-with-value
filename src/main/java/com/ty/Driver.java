package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("conf.xml");
		
		Student student=(Student)context.getBean("student");
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
	}

}
