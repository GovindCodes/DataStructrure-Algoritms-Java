package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("apple");
		pq.add("banana");
		pq.add("pomogrenate");
		pq.add("watermelon");
		pq.add("mango");
		pq.add("oranges");
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());	
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		pq1.add(12);
		pq1.add(22);
		pq1.add(2777);
		pq1.add(36);
		
		System.out.println(pq1);
		
		System.out.println(pq1.peek());
		System.out.println(pq1.remove());	
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		
		
		

	}

}
