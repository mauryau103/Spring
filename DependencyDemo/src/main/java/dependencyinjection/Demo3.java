package dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo3 {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DcardConfig.class);
		
		Smc smc=(Smc) context.getBean("smc");
		smc.setCity("Jalgoan");
		smc.setName("Lokesh Chaudhari");
		System.out.println(smc);

		DebitCard dc = (DebitCard) context.getBean("dcard");
		dc.details();
		System.out.println(dc);
		}

}
