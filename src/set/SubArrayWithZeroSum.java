package set;

import java.util.*;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int n= sc.nextInt();
		int k= sc.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++) {
			a[i]= sc.nextInt();
		}
		boolean found = false;
		
//		for(int i=0; i<a.length; i++) {
//			int sum= 0;
//			for(int j= i; j<a.length; j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//					
//			}
//			if(found)
//				break;
//			
//		}
//		System.out.println("found "+ found);
		
		Set<Integer> set = new HashSet<>();
	
		int sum=0;
		for(int element : a) {
			set.add(sum);
			sum= sum+ element;
			if(set.contains(sum-k)) {
				found = true;
				break;
			}
		}
		System.out.println("found "+ found );
	}

}
