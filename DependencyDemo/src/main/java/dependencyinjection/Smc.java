package dependencyinjection;

import org.springframework.beans.factory.annotation.Value;

public class Smc {
	@Value("visa")
	private String name ;
	@Value("Bhusawal")
	private String city ;
	
	public Smc(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Smc() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Smc [name=" + name + ", city=" + city + "]";
	}
	
	
	

}
