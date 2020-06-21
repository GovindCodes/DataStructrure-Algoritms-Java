package leetcode;

import java.util.Scanner;

public class Covid {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[]= new int[n];
			for(int i= 0; i<n; i++) {
				arr[i]= sc.nextInt();
			}
			int cnt =0;
			int cntl=n, cnth=0;
			int i=0;
//			while(i<n) {
				while(arr[i+1]-arr[i]<=2) {
					cnt++;
					if(i<n)
						i++;
					else if(i==n)
						break;
					
//				}

				System.out.println(cnt+1);
				i= i+cnt+1;
				if(cnt<cntl)
					cntl= cnt;
				else if(cnt>cntf)
					cntf= cnt;
			}
			}
		}

	}

