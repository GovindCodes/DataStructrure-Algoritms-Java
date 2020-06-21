package oops;

class cat
{
	int legs,eyes;
	boolean hasfur;
	String color, breed;
	 void walk()
	{
		System.out.println("cat is walking");
	}
	void eat()
	{
		System.out.println("cat is eating");
	}
	void description()
	{
		System.out.println("my cat has "+ legs +" legs and"+ eyes +"eyes");
	}
	
}

public class MainClass {

	public static void main(String[] args) {

		cat cat1= new cat();
		cat1.hasfur=true;
		cat1.color= "yellow";
		cat1.legs= 4;
		cat1.eyes= 2;
		cat1.description();
		cat1.walk();
	}

}
