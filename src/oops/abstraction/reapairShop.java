package oops.abstraction;

public class reapairShop {
	
	
	public static void repairCar(car car) {
		System.out.println("is reapaired");
	}
	
	
	public static void main(String[] args) {
		
		wagnoR waganor =new wagnoR();
		car audi = new audi();
		waganor.name ="wagon";
		car p =waganor;
		System.out.println(waganor.name);
		
		repairCar(waganor);
		repairCar(audi);

	}

}
