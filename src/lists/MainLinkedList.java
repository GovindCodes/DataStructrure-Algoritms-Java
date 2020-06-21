package lists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		List<Integer> l1= new LinkedList<>();
		List<Integer> a1= new ArrayList<>();
		
//		l1.add(12);
//		l1.add(13);
//		l1.add(16);
//		l1.add(9);
//		
		System.out.println(l1);
//		
//		a1.add(12);
//		a1.add(14);
//		a1.add(18);
		
		getTimeDifference(l1);
		getTimeDifference(a1);
		

	}

	public static void getTimeDifference(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		for(int i=0; i<=100000; i++) {
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass() +" "+ (end-start));
	}
}
