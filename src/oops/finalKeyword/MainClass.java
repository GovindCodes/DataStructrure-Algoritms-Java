package oops.finalKeyword;

public class MainClass //extends Student
{
	
	void getdescription() {
		System.out.println("in main");
	}
	
	public static void main(String args[]) {
		
		final Student obj =new Student();
		Student obj1 = new Student();
		
//		obj = obj1;         // notfossible since obj is final
		
		obj.marks =55; // this is possible
		
		obj.getdescription();
	}

}
