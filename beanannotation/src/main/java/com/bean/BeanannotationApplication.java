package com.bean;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.service.UserService;

@SpringBootApplication
public class BeanannotationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BeanannotationApplication.class, args);
ApplicationContext ctx = new  AnnotationConfigApplicationContext(BeanannotationApplication.class);
//By its type
UserService uService = ctx.getBean(UserService.class);
//By its alieas name
//UserService uService = (UserService)ctx.getBean("myBean");
System.out.println("Print User Service: "+uService.getList());

	}

}
