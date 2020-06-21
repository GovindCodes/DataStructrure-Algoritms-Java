package array;

import java.io.*;
import java.util.Scanner;

public class KadanesAlgo {

	public static void main(String[] args) throws  IOException {
		
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		   // BufferedReader inp = new BufferedReader(new InputStreamReader(Sytem.in));
		    int t= Integer.parseInt(inp.readLine());
		    while(t-->0){
		        int n= Integer.parseInt(inp.readLine());
		        int arr[]= new int[n];
		        String line = inp.readLine();
		        String[] strs = line.trim().split("\\s+");
		        for(int i=0; i<n ;i++){
		            arr[i]= Integer.parseInt(strs[i]);
		        }
			int meh = 0;
			int msf = Integer.MIN_VALUE;
			int left =0;
			int right =0;
			
			for(int i=0; i<n; i++) {
				meh = meh+ arr[i];
				
				
				if(meh > msf) {
					msf = meh;
					right = i;
				}
				if(meh < arr[i]) {
					meh = arr[i];
					left = right;
				}
				
			}
			System.out.println(msf+" pos"+ left+ "--->"+ right);
			
//			for(int sizes=1; sizes<n; sizes++) {
//				
//				for(int StartIndex = 0; StartIndex< n; StartIndex++) {
//					if(StartIndex+sizes> n)
//						break;
//					int sum =0;
//					for(int i= StartIndex; i<StartIndex+sizes; i++) {
//					sum += arr[i];
//					if(sum > ans)
//						ans= sum;
//					}
//				}
//			}
			
//			for(int index=0; index< n; index++) {
//				int sum =0;
//				for(int size =1; size<n; size++) {
//					if(index + size >n)
//						break;
//					sum += arr[index + size -1];
//					ans = Math.max(sum, ans);
//				}
//			}
//			System.out.println(ans);

		}
	}

}
