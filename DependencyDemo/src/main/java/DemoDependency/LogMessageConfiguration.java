package DemoDependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "DemoDependency")
public class LogMessageConfiguration {
	
	@Bean
	public LogMessage log() {//bean name will be log
		System.out.println("in configuration");
		LogMessage logMesssage=new LogMessage();
		return logMesssage;
	}

}
