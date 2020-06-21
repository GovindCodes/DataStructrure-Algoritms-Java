package oops.abstraction;

public class wagnoR extends car {
//	String name;
	
	public void brake() {
		System.out.println("waganor is braking");
	}

	@Override
	public void accelerate() {
		System.out.println("wagnor is accelerating");
		
	}
	
	public void honking() {
		System.out.println("car is honking");
	}

}
