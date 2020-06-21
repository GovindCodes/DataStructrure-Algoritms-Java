package loops;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				int n= sc.nextInt();
				int rows= 2*n+1;
		for(int i=1; i<=rows; i++)
		{
			if(i<=n)
			{
				for(int j=1; j<= n-i+1; j++)
				{
					System.out.print("* ");
				}
				for(int j=1; j<=2*i-1 ; j++)
					{
						System.out.print("  ");
					}
				for(int j=1; j<= n-i+1; j++)
				{
					System.out.print("* ");
				}
			}
			else if(i==n+1)
			{
				for(int j=1;j<=rows; j++)
				{
					System.out.print("  ");
				}
			}
			else
			{
				for(int j=1; j<=i-rows+n; j++)
				{
					System.out.print("* ");
				}
				for(int j=1; j<=2*(rows-i)+1; j++)
				{
					System.out.print("  ");
				}
				for(int j=1; j<=i-rows+n; j++)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
