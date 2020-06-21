package deque;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SlidingWindowMaximum
 {
	public static void main (String[] args) throws IOException
	 {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		   String sizes[] = br.readLine().split(" ");
		   int n = Integer.parseInt(sizes[0]);
		   int k = Integer.parseInt(sizes[1]);
		   
		   String s[] = br.readLine().split(" ");
		   int arr[] = new int[n];
		   for(int i =0;i<n;i++)
		    arr[i] = Integer.parseInt(s[i]);
		   
	        Deque<Integer> dq= new LinkedList<>();
	        int ans[]= new int[n-k+1];
	        
	        int i=0;
	        for(; i<k; i++){
	            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
	                dq.removeLast();
	            }
	            dq.addLast(i);
	        }
	        
	        for(; i<n; i++){
	            if(!dq.isEmpty())
	            ans[i-k] = arr[dq.peekFirst()];
	            
	            while(!dq.isEmpty() && dq.peekFirst()<= i-k)
	            dq.removeFirst();
	            
	            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
	                dq.removeLast();
	            }
	            dq.addLast(i);
	        }
	        
	        if(!dq.isEmpty())
	            ans[i-k] = arr[dq.peekFirst()];
	            
	        for(int a: ans){
	            System.out.print(a+" ");
	        }
	        System.out.println();
	    }
	 }
}