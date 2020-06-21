package array.gfg;

import java.util.Scanner;

public class missing {

	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int t= sc.nextInt();
		 while(t-->0){
		     int n = sc.nextInt();
		     int arr[] = new int[n];
		     for(int i=0 ; i<n-1 ;i++){
		         arr[i] = sc.nextInt();
		     }
		     int sum =0;
		     int max =n;
		     int esum =0;
		     
		     for(int i=0; i<n; i++){
		         if(arr[i]>0)
		         sum= sum+ arr[i];
//		         if(max< arr[i])
//		         max = arr[i];
		         
		     }
		     
		     esum= max*(max+1)/2;
		    if(esum-sum!=0){
		        System.out.println(esum-sum);
		    }
		    else{
		        System.out.println(max+1);
		    }
		 }
		 }

}
