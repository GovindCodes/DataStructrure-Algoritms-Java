package deque;

public class MyDeque<E> {
	
	public static class Node<E>{
		E data;
		Node<E> next;
		Node<E> prev;
		public Node(E data) {
			this.data = data;
			this.next =null;
			prev = null;
		}
	}
	
	private Node<E> head, tail;
	void addToHead(E data) {
		Node<E> toAdd = new Node(data);
		
		if(head == null) {
			head = tail = toAdd;
		}
		else {
			head.next = toAdd;   //head is in rightmost
			toAdd.prev = head;
			head = toAdd;
		}
	}
	public E removeLast() {
		
		if(head == null) {
			return null;
		}
		
		Node<E> temp = tail;
		tail =  tail.next;    // left most tail hai
		if(head.prev  == null)
			head = null;
		else
		tail.prev = null;
		
		
		return temp.data;
		
//		if(head == null){
//			   return null;
//			  }
//			  Node<E> last = tail;
//			  if(head.prev == null){
//			   head = null;
//			  }else{
//			   // next of previous node (new last) becomes null
//			   tail.next.prev = null;
//			  }
//			  tail = tail.next;
//			  return last.data;
		
	}

}
