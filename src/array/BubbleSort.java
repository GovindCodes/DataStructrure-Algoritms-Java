package array;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args)
	{
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int a[]= new int[n];
		
		int a[]= {2, 1, 8, -3, 6, 4, 12};
		int n= a.length;
		boolean sorted = true;
		for(int i= 0; i<n-1; i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				if(a[j+1]<a[j])
				{
					int temp= a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
					sorted= false;
				}
					
			}
			if(sorted) break;                //optimizing code if sorted phle hi
		}
//		for(int i=0; i<n ;i++)
//		System.out.print(a[i]+"  ");
		
		for(int item: a)                         // enhanced for loop
			System.out.print(item+ " ");
	}

}
