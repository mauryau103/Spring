package com.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanscopedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanscopedemoApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService custbean = (CustomerService)context.getBean("mybean");
		custbean.setMessage("Umesh");
		System.out.println(custbean.getMessage());
		
		CustomerService custbean1 = (CustomerService)context.getBean("mybean");
		//custbean1.setMessage("Umesh");
		System.out.println(custbean1.getMessage());
		
	}

}
