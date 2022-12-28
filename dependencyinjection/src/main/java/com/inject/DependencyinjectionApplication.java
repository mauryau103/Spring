package com.inject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.inject.model.Customers;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		
	//	SpringApplication.run(DependencyinjectionApplication.class, args);
		
		/*changing the run line of the application
		 * Now the application will become a configurable application*/
		
		ConfigurableApplicationContext context = SpringApplication.run(DependencyinjectionApplication.class, args);
		
		//below line will tell the compiler to return an object of the customer class.
		//for below line compiler will check whether there is customer bean is available in the container or not.
		Customers c = context.getBean(Customers.class);
		//after calling display if i have not used componenet annotation then it will the throw no qualigy bean exception
		//because the customer class whhich we have defined is not a spring bean i.e i snot a spring object
		c.display();
	}

}
