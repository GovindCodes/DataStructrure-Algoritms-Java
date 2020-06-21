package array;

import java.util.Scanner;

public class BinaryArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		while(t-->0) {
			int cnt=0;
			int N = sc.nextInt();
			int arr[]= new int[N];
			for(int i=0; i<N; i++) {
				arr[i]= sc.nextInt();
			}
			
			for(int i=0; i<N; i++) {
				if(arr[i]==1)
					cnt++;
			}
			
			for(int i=0; i<N; i++) {
				if(i> cnt) {
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
		}

	}

}
