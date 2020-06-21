package queue;



public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> queue = new MyQueue<>();
	

		
		queue.enqueue(12);
		queue.enqueue(19);
		queue.enqueue(99);
		
		System.out.println(queue);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		queue.enqueue(19);
		queue.enqueue(99);
		
		System.out.println(queue.dequeue());
	}

}
