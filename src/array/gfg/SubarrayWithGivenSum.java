package array.gfg;

import java.util.Arrays;
import java.util.Scanner;


public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			
			int n= sc.nextInt();
			int arr[]= new int[n];
			int s= sc.nextInt();
			boolean hasVisited = false;
			for(int i=0; i<n; i++) {
				arr[i]= sc.nextInt();
			}
			Arrays.sort(arr);
			int i=0;
			int j= n-1;
			while(i<j) {
				if(arr[i]+arr[j]<s)
					i++;
				else if(arr[i]+arr[j]>s)
					j--;
				else {
					System.out.println(i+" "+j);
					hasVisited = true;
					break;
					}

			}
			if(!hasVisited) {
				System.out.println("-1");
			}
			
		}

	}
	

}
