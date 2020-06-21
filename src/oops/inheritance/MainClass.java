package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name= "govind";
//		System.out.println(p1.name);
		
		
		
		Teacher t1= new Teacher();
		t1.name= "majumdar";
		t1.teach();
		t1.walk();
		t1.eat();
		
		Singer s1 = new Singer();
		s1.name= "Arjit";
		s1.walk();
		s1.eat();
		s1.sing();

	}

}
