package DemoDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(LogMessageConfiguration.class);
		System.out.println("------------");
		LogMessage lm=con.getBean("log", LogMessage.class);
		System.out.println(lm);
		System.out.println(lm.getMessage());
		
	}
}
