package springioc;


public class Airtel implements Sim {
	

	public Airtel() {
		super();
		System.out.println("Airtel constructor is called...");
	}

	public void Calling() {
		
		System.out.println("Calling using Airtel sim");
	}

	public void data() {
		
		System.out.println("browsing using Airtel sim");
	}
	


}
