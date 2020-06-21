package Euler;

import java.util.Scanner;

public class euler3 {
	public static void main(String args[])
	{
		long num;
		Scanner sc = new Scanner(System.in);
		num= sc.nextLong();
		
		for(int i=2;i<num; i++)
		{
			while(num%i == 0)
			{
				//System.out.println(i);
				num=num/i;
			}
		}
		if(num>2)
			System.out.println(num);
		
	}

}
