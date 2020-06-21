package oops;

public class StaticKeyword {
	
	  static class Person{                //iss class ko bahar banate to bina static k kam ho jata
		String name = "govind";
		 static String breed ="homo";
		
	}

	public static void main(String[] args) {
		//Person Person = new Person();
		System.out.println(Person.breed);
		//jadu... bina object banae call ho ja rha person class all thanka to static keyword
		
		System.out.println(Integer.MAX_VALUE);

	}

}
