package oops.inheritance;

public class Teacher extends Person {
	
	void teach()
	{
		System.out.println(name +" is teaching");
	}
	@Override void eat()
	{
		System.out.println("teacher "+ name+ " is eating");
	}

}
