package dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dependenyinjection")
public class DcardConfig {
	@Bean
	public Smc smc() {
		Smc smc=new Smc();
		return smc;
	}
	
	@Bean
	public DebitCard dcard() {
		DebitCard dc =new DebitCard(smc());
		return dc;
		
	}

}
