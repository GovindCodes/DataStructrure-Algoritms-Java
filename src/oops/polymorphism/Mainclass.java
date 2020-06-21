package oops.polymorphism;

public class Mainclass {

	public static void main(String[] args) {
		
	Dog d = new Dog();
		
		Pet p= d;
		
		p.walk();
		d.walk();
	System.out.println(p.name);  // override nahi ho rha kyoki variable hai
    System.out.println(d.name);
		
//		greet();             //overloading (compile time polymorphism)
//		greet("hbfe");
	}
//	
//	static void greet()
//	{
//		System.out.println("hi");
//	}
//	static void greet(String s)
//	{
//		System.out.println(s);
//	}
//	static void greet(String s, int i)
//	{
//		for(int j =0; j<i; j++) {
//		System.out.println(s);}
//	}

}
