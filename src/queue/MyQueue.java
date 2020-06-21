package queue;

public class MyQueue<E> {
	
	
	class Node<E>{
		E data;
		Node<E> next;
		public Node(E e){
			this.data= e;
			this.next= null;
		}
	}
	
	private Node<E> head, rear;
	
	public void enqueue(E e) {
		
		Node<E> toAdd = new Node<>(e);
		if(rear== null) {
			rear= head= toAdd;
		}
		else {
		rear.next = toAdd;
		rear= rear.next;
		}
	}
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		Node<E> temp= head;
		head=  head.next;
		
		if(head == null) {
			rear= null;
		}
		return temp.data;
		
	}
}
