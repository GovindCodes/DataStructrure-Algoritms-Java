package loops;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st no");
		int n1= sc.nextInt();
		System.out.println("enter 2st no");
		int n2= sc.nextInt();
		System.out.println("enter no of values");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			System.out.println(n1);
			int sum =n1+n2;
			n1=n2;
			n2=sum;
			
		}
	}

}
