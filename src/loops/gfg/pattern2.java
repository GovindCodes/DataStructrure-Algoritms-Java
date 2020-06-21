package loops.gfg;
import java.util.*;


import java.lang.*;
import java.io.*;
public class pattern2
 {
	public static void main (String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t-- >0){
		     int n= sc.nextInt();
		     int arr[]= new int[n];
		     for(int i=0; i<n; i++){
		         arr[i]= sc.nextInt();
		     }
		     
		     Stack<Integer> stack = new Stack<>();
		     Stack<Integer> result = new Stack<>();
		     while(n!=0){
		     for(int i= 0; i<n; i++){
		         stack.push(arr[i]);
		     }
		     
		     int cnt=1;
		     int val = stack.pop();
		     while(val>stack.peek()){
		         stack.pop();
		         cnt++;
		     }
		    
		     result.push(cnt);
		     n--;
		     }
		     for(int i=0; i<= n; i++)
		     System.out.print(result.pop()+" ");
		     System.out.println();
	 }
}}