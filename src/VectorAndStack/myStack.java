package VectorAndStack;

public class myStack<E> {
		
	myLinkedList<E> ll =new myLinkedList<>();
	Stack ll
		
	void push(E e) {
		ll.insert( e);
	}
	
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("popping is not allowed");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		
		return ll.getLast();
		
	}
	

}

class myLinkedList<E>{
	
	Node<E> head;
	
	void insert(E e) {
		
		Node<E> n = new Node<>();
		n.data= e;
		n.next= null;      
		
		
		if(head== null) {
			head= n;
		}
		else {
//			Node newNode= new Node();     
			Node<E> newNode = head;        
			while(newNode.next != null) {
				newNode= newNode.next;
			}
			newNode.next = n; 
		}
	}
	
	boolean isEmpty() {
		return head== null;
	}
	
	E removeLast() throws Exception{
		
		if(head == null) {
			throw new Exception("cannot remove last in empty linked list");
		}
		
		if(head.next == null) {
			Node<E> Removed = head;
			head = null;
			return Removed.data;
		}
		
		Node<E> temp =head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> Removed = temp.next;
		temp.next = null;
		return Removed.data;
	}
	
	E getLast() throws Exception {
		
		if(head == null) {
			throw new Exception("cannot peek in empty linked list");
		}
		
		Node<E> temp =head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		return temp.data;
		
	}
	
	void show(){
//		Node newNode = new Node();
		Node<E> newNode= head;
		if(head== null){
			System.out.println(newNode);
			
		}
		else {
		while(newNode.next != null) {
			System.out.print(" "+newNode.data);
			newNode = newNode.next;
		}
		System.out.print(" "+newNode.data);
		}
	}
}

//public class Node<E>{
//	
//	E data;
//	Node<E> next;
//}
