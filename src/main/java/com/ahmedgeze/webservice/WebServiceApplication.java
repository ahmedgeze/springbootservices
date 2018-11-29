package com.ahmedgeze.webservice;

import com.ahmedgeze.webservice.controller.StudentController;
import com.ahmedgeze.webservice.model.Student;
import com.ahmedgeze.webservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class WebServiceApplication {


	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(WebServiceApplication.class, args);
		applicationContext.getBean(StudentController.class);
	}
}
