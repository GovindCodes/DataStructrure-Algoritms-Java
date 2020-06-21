package oops.finalKeyword;

public final class Student {
	
	
	
	final String NAME= "Govind";
	int marks = 50;
	
	final int ROLL_NO;   //blank final variable
//	{
//		ROLL_NO = 3;     //Initializer Block
//	}
	
	Student(){
		ROLL_NO = 3;    	//constructor
	}
	
	
	final void getdescription() {
		System.out.println("in student class");
	}

}
