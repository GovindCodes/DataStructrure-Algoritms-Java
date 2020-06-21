package deque;

import java.util.*;

public class SlidingWindowFirstNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i= 0; i<n; i++){
	            arr[i] = sc.nextInt();
	        }
	        int k = sc.nextInt();
		
		Deque<Integer> dq =new LinkedList<>();
		int i;
		for(i=0 ;i<k; i++) {
			if(arr[i]<0)
				dq.addLast(i);
		}

		for(; i<n; i++) {
			
			if(!dq.isEmpty())
				System.out.print(arr[dq.peekFirst()]+" ");
			else
				System.out.print("0 ");
			
			while(!dq.isEmpty() && dq.peekFirst()<=i-k) {
				dq.removeFirst();
			}
			if(arr[i]<0) {
				dq.addLast(i);
			}
		}
		
		if(!dq.isEmpty())
			System.out.print(arr[dq.peekFirst()]+" ");
		else
			System.out.print(0+" ");
			
	}

}
}
