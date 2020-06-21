package String.gfg;

import java.util.Scanner;

public class problem {
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
			
			int cnt=0;
		String s= sc.next();
		int k= sc.nextInt();
		int n= sc.nextInt();
		char c= sc.next().charAt(0);
		String s1= "";
		
		for(int i=0; i<k; i++)
		{
			s1=s1+s;
		}
//		s1= s.repeat(k);
		s= s1.substring(0, n);
		
		for(char z: s.toCharArray())
		{
			if(z==c)
				cnt++;
		
		}
		System.out.println(s1);
		
		}

		
//		Scanner sc = new Scanner(System.in);
//		int t= sc.nextInt();
//		int cnt=0;
//		while(t-- >0 ) {
//		
//		String a= sc.next();
//		String b= sc.next();
//		
//		boolean[] arr1= new boolean[256];
//		boolean[] arr2= new boolean[256];
//		
//		for(char A: a.toCharArray() )
//		{
//			int index= A;
//			arr1[index]= true;
//		}
//		
//		for(char A: b.toCharArray() )
//		{
//			int index= A;
//			arr2[index]= true;
//		}
//		for(int i=0; i<256; i++)
//		{
//			if(arr1[i]==true || arr2[i]== true) {
//				cnt++;
//				}
//		}
//		if(cnt!= a.length()+b.length())
//		{
//			for(int i=0; i<256; i++)
//			{
//				if(arr1[i]== true || arr2[i]== true) {
//					char c= (char) (i);
//				System.out.print(c);}
//			}
//			System.out.println();
//		}
//		else
//		{
//			System.out.println("-1");  //no modification
//		}
//		}
		
		
//		 Scanner scan = new Scanner(System.in);
//			int t = scan.nextInt();
//			while(t-- > 0){
//	            String s = scan.next();
//	            int c = 1;
//	            for(int i=0;i<s.length();i++){
//	                if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
//	                    c++;
//	            }
//	            System.out.println(c);
//			}
//		
		
		
	}

}
