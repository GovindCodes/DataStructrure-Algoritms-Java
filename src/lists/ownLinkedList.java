package lists;

public class ownLinkedList {

	public static void main(String[] args) {
		
		myLinkedList ll = new myLinkedList();
		ll.insert(12);
		ll.insert(13);
		ll.insert(118);
		
		ll.show();

	}

}

class Node{
	
	int data;
	Node next;
}

class myLinkedList{
	
	Node head;
	
	void insert(int data) {
		
		Node n = new Node();
		n.data= data;
		n.next= null;      //nhi bhi likenge to bhi chalega readability k liy likhe bss
		
		
		if(head== null) {
			head= n;
		}
		else {
//			Node newNode= new Node();     //creating the space for temprory node is not neccesaryy
			Node newNode = head;         // reference variable can do this for us
			while(newNode.next != null) {
				newNode= newNode.next;
			}
			newNode.next = n; 
		}
	}
	
	void show(){
//		Node newNode = new Node();
		Node newNode= head;
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

