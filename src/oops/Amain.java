package oops;


public class Amain {


	public static void main(String[] args) {
//		A objA =new A();
//		A.B objB= objA.new B();
		
		A.C objC = new A.C();           //A ka obj nahi bananna pada c ka obj banane k liy
		System.out.println(objC.a);

	}

}
