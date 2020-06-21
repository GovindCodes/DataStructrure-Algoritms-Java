package oops.pkg.models;

public class student {
	private String name;
	private int age;
	
	public int getAge()
	{
		return age;
	}
	 public void setAge(int age)
	{
		if(age<20)
			this.age = age;
		else
			System.out.println("you are too old");
	}

}
