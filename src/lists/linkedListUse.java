package lists;

import java.util.*;
public class linkedListUse {
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null;
		Node<Integer> tail = null;
		Scanner sc =new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head ==null) {
				head = tail = newNode;
			}else {
//				Node<Integer> temp = head;
//				while(temp.next!= null) {
//					temp =  temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = tail.next;
			}
			data = sc.nextInt();
		}
		return head;
		
	}
	
	public static void print(Node<Integer> head) {
		while(head!= null) {
			System.out.print(head.data+ " ");
			head = head.next;
		}
		System.out.println();
	}

	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos ) {
		
		Node<Integer> newNode = new Node<>(data);
		if(pos==0) {
			newNode.next = head;
			return newNode;
		}
		
		Node<Integer> temp = head;
		int cnt = 0;
		while(cnt!= pos-1) {
			cnt++;
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
		
	}
	
	public static void delete(Node<Integer> head, int pos) {
		
		Node<Integer> temp  = head;
		int cnt =0;
		while(cnt!= pos-1) {
			cnt++;
			temp = temp.next;
		}
		if(temp.next.next!= null)
			temp.next = temp.next.next;
		else
			temp.next= null;
	}
	
	public static void main(String[] args) {
		
		
		Node<Integer> head = takeInput();
		print(head);
		System.out.println();
		head = insert(head, 4, 0);
		print(head);
		delete(head, 5);
		print(head); 
//		Node<Integer> node1 = new Node<>(10);
////		System.out.println(node1.data);
//		Node<Integer> node2 = new Node<>(2334);
//		node1.next = node2;
////		System.out.println(node1.next.data);
//		
//		Node<Integer> node3 = new Node<>(90);
		
//		node2.next =node3;
//		
//		Node<Integer> head = node1;
//		
//		print(head);
//		print(head);
//		
		
		
		
		
		

	}

}
