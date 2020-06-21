package String;

public class ReverseWord {

	public static void main(String[] args) {
		
		String a= "I Love Java, the coffee hds   ";
//		String A[]= a.split(" ");
//		for(int i= A.length; i>0; i--)
//		{
//			System.out.print(A[i-1]);
//		}
////		System.out.println(A[2]);

		String A[]= a.split(" ");
		for(int i=A.length-1; i>=0; i--)
		{
			System.out.print(A[i]+" ");
		}
	}

}
