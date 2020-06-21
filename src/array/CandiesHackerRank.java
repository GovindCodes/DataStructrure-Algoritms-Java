package array;

import java.util.Arrays;
import java.util.Scanner;

public class CandiesHackerRank {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		int i=0;
		while(n>i) {
			arr[i]= sc.nextInt();
			i++;
			}
		
	int choc[]= new int[n];
//	for(int k=0; k<n; k++)
//	choc[k]=1;
	
	Arrays.fill(choc, 1);
	for(int k=1; k<n; k++) {
		if(arr[k]>arr[k-1]) {
			choc[k]= choc[k-1]+1;
			
		}
//		System.out.print(choc[k]+" ");
	}
	System.out.println();
	for(int k=n-2; k>=0; k--) {
		if(arr[k]>arr[k+1]) {
			choc[k]= Math.max(choc[k+1]+1 , choc[k]);
			
		}
//		System.out.print(choc[k]+" ");
	}
	int sum=0;
	for(int k=0; k<n; k++) {
		sum += choc[k];
	System.out.print(sum);
	}
		}


}
