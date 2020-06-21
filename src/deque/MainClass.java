package deque;

import java.util.ArrayDeque;

public class MainClass {
	
	public static void main(String args[]) {
	
//	ArrayDeque<Integer> ad = new ArrayDeque<>();
//	ad.addFirst(12);
//	ad.addFirst(13);
//	ad.pop();
//	System.out.println(ad.peek());
//	ad.push(14);
//	ad.push(129);
//	System.out.println(ad.pop());
//	System.out.println(ad.pop());
		
		MyDeque<Integer> dq = new MyDeque<>();
		dq.addToHead(12);
		dq.addToHead(44);
		dq.addToHead(43434);
		dq.addToHead(4773344);
		dq.addToHead(44444);
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		dq.addToHead(43434);
		dq.addToHead(4773344);
		dq.addToHead(44444);
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		
	
	}

}
