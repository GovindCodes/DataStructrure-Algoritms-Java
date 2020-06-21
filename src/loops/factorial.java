package loops;

import java.util.Scanner;

public class factorial {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		 int n= sc.nextInt();
		int ans=1;
		for (int i=n; i>=1; i--)
		{
			ans= ans*i;
		}
		System.out.println(ans);
	}

}
