package String;

public class StringIntro {
	public static void main(String args[])
	{
		String name= "lamborgini ferarri hyndai audi porche";
//		String name1= new String("govind kumar");
		String[] namearr= name.split(" ");
		
//		System.out.println(namearr[3]);
		for(String car: namearr)
		{
			System.out.println(car.toUpperCase());
		}
		
//		System.out.print();
		
		
		
	}

}
