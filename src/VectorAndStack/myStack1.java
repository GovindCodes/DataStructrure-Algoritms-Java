package VectorAndStack;

public class myStack1<E> {
	linkedlist1<E> ll= new linkedlist1<>(); 
	
	void push(E e) {
		ll.addAtLast(e);
	}
	
	E pop() throws Exception {
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		return ll.getLast();
	}
	
	

}

class Node<E>{
	E data;
	Node<E> next;
}

class linkedlist1<E>{
	
	Node<E> head;
	void addAtLast(E data) {
		
		Node<E> node = new Node<>();
		node.data =data;
		
		if(head == null) {
			head  = node;
		}
		else {
		Node<E> temp =head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		}
	}
	
	E removeLast() throws Exception {
		
		if(head == null) {
			throw new Exception("cant remove from empty ll");
		}
		else if(head.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		else {
		Node<E> temp= head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next =null;
		return  toRemove.data;
		}
		
		
	}
	
	E getLast() throws Exception {
		
		if(head== null) {
			throw new Exception("cannot peek empty ll");
		}
		else {
		Node<E> temp= head;
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
		}
		
	}

	
}
