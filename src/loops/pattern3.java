package loops;

import java.util.Scanner;

public class pattern3 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print("  ");
			}
			int C=1;
			for(int j=1;j<= i ; j++)
			{
//		 		if(j==1||j==i)
//					System.out.print("1   ");
//			else
			{
				System.out.print(C+"   "); 
		        C = C * (i - j) / j;  
			}
		       
					
			}
			System.out.println();
		}
		
	}

}
