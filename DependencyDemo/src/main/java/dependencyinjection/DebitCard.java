package dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("dcard")
public class DebitCard {
	
	
	private Smc smc;

	public Smc getSmc() {
		return smc;
	}

	
	public void setSmc(Smc smc) {
		System.out.println("inside setter method");
		this.smc = smc;
	}

	@Autowired
	public DebitCard(Smc smc) {
		super();
		System.out.println("inside parameterised constructor");
		this.smc = smc;
	}
	
	public void details() {
		System.out.println("i love sprinnngggggg");
	}

//	public DebitCard() {
//		super();
//		// TODO Auto-generated constructor stub
//	}


	@Override
	public String toString() {
		return "DebitCard [smc=" + smc + "]";
	}
	
	
	

}
