package DemoDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Config {
	public static void main(String[] args) {
		
		
		ApplicationContext con= new ClassPathXmlApplicationContext("config.xml");
		Student st=con.getBean("student",Student.class);
		Course c=con.getBean("course",Course.class);
		//Course c=new Course();
		c.setName("Python");
		st.setCourse(c);
		System.out.println(st.getCourse());
		System.out.println(st);
	}

}
