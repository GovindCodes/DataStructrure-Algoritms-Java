package binarySearchTree;

import java.util.*;

import binaryTrees.Pair;

public class BSTuse {
	
	public static BinaryTreeNode<Integer> takeInput(){
		Queue<BinaryTreeNode<Integer>> pending = new ArrayDeque<>();
		Scanner sc =new Scanner(System.in);
		int rootdata = sc.nextInt();
		if(rootdata == -1) {
			return null;
		}
		BinaryTreeNode<Integer> rootNode= new BinaryTreeNode<>(rootdata);
		pending.add(rootNode);
		
		while(pending.size()!=0) {
			BinaryTreeNode<Integer> front = pending.remove();
			
			System.out.println("enter left child data of "+ front.data);
			int leftData=  sc.nextInt();
			if(leftData != -1) {
			BinaryTreeNode<Integer> leftNode= new BinaryTreeNode<>(leftData);
			pending.add(leftNode);
			front.left = leftNode;
			}
			
			System.out.println("enter right child data of "+ front.data);
			int rightData=  sc.nextInt();
			if(rightData != -1) {
			BinaryTreeNode<Integer> rightNode= new BinaryTreeNode<>(rightData);
			pending.add(rightNode);
			front.right = rightNode;
			}
		}
		
		return rootNode;
		
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		
		String toPrint = root.data+ " :";
		if(root.left!=null) {
			toPrint += "L:"+root.left.data + ", ";
		}
		if(root.right!=null) {
			toPrint += "R:"+root.right.data;
		}
		
		System.out.println(toPrint);
		print(root.left);
		print(root.right);
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
		Queue<BinaryTreeNode<Integer>> queue = new ArrayDeque<BinaryTreeNode<Integer>>();
		queue.add(root);
		
		while(queue.size()!=0) {
			BinaryTreeNode<Integer> front = queue.remove();
			System.out.print(front.data+ ": ");
			if(front.left!=null) {
				queue.add(front.left);
				System.out.print("L: "+ front.left.data+ " ,");
			}
			
			if(front.right!=null) {
				queue.add(front.right);
				System.out.print("R: "+ front.right.data);
			}
			System.out.println();
			
 		}
	}
	
	public static BinaryTreeNode<Integer> search(BinaryTreeNode<Integer> root, int data){
		if(root==null || root.data == data) {
			return root;
		}

		if(root.data> data) {
			return search(root.left, data);
		}
			return search(root.right, data);
		
	}

	public static void elementsinBetween(BinaryTreeNode<Integer> root, int L, int R) {
		
			 if(root==null){
		            return;
		        }
	        
	        if(root.data > R){
	        	elementsinBetween(root.left ,L ,R);
	            
	        }
	        else if(root.data < L){
	        	elementsinBetween(root.right, L, R);
	        }
	        else{
	        	elementsinBetween(root.left, L, R);
	            System.out.println(root.data);
	            elementsinBetween(root.right, L, R);
	        }

	}

	
//	Time complexity is o(nlogn) and o(n^2) for worst case do bar kam kar rhe(diameter wali problem me aisa hi hua tha)
//	isko optimise karne k liy isBST maximum and minimum ek call me hi karenge
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		
		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);
		
		if(root.data <= leftMax || root.data >= rightMin) {
			return false;
		}
		
		boolean left = isBST(root.left);
		boolean right = isBST(root.right);
		
		if(left && right) {
			return true;
		}else {
			return false;
		}
		
	}
	private static int minimum(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}

	private static int maximum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}

	
//	Optimized isBST problem

	
	public static Pair<Boolean, Pair<Integer ,Integer>> isBSTOpti(BinaryTreeNode<Integer> root) {
		if(root==null) {
			Pair<Boolean, Pair<Integer, Integer>> p = new Pair<>();
			p.first = true;
			p.second = new Pair<>();
			p.second.first = Integer.MAX_VALUE;
			p.second.second = Integer.MIN_VALUE;
			return p;
		}
		
		Pair<Boolean, Pair<Integer, Integer>> left = isBSTOpti(root.left);
		Pair<Boolean, Pair<Integer, Integer>> right = isBSTOpti(root.right);
		
		int min = Math.min(root.data, Math.min(left.second.first, right.second.first));
		int max = Math.max(root.data, Math.max(left.second.second, right.second.second));
		
		boolean isBST = left.first && right.first 
				&& left.second.second < root.data  
				&& right.second.first >= root.data; 
				
				
				Pair<Boolean, Pair<Integer, Integer>> p = new Pair<>();
				p.first = isBST;
				p.second = new Pair<>();
				p.second.first = min;
				p.second.second = max;
				return p;
	}

	
//	Ye bhi o(n) hi hai magar isse phle wala is more obvi solution jo dimag me aata optimize krnne k liy
	public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
		if(root==null) {
			return true;
		}
		
		
		if(root.data< min || root.data >= max) {
			return false;
		}
		
			boolean isLeftok = isBST3(root.left, min, root.data-1);
			boolean isrightok = isBST3(root.right, root.data , max);

		
		return (isLeftok && isrightok);
		
	}
	
	
	public static BinaryTreeNode<Integer> construct(int[] arr, int si, int ei){
		
		if(si>ei) {
			return null;
		}
		
		
		int mi = (si + ei)/2;
		
		BinaryTreeNode<Integer> left = construct(arr, si, mi-1);
		BinaryTreeNode<Integer> right = construct(arr, mi+1, ei);
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mi]);
		root.left = left;
		root.right = right;
		
		return root;
	}

	public static Pair<ListNode<Integer>, ListNode<Integer>> TreeToList(BinaryTreeNode<Integer> root){
		
		if(root==null) {
			Pair<ListNode<Integer>, ListNode<Integer>> p =  new Pair<>();
			p.first = null;
			p.second = null;
			return p;
		}
		
		if(root.left==null && root.right == null) {
			ListNode<Integer> node = new ListNode<>(root.data);
			Pair<ListNode<Integer>, ListNode<Integer>> p =  new Pair<>();
			p.first = node;
			p.second = node;
			return p;
		}
		
		Pair<ListNode<Integer>, ListNode<Integer>> left = TreeToList(root.left);
		Pair<ListNode<Integer>, ListNode<Integer>> right = TreeToList(root.right);
		
		
		ListNode<Integer> midNode = new ListNode<>(root.data);
//		if(left.second!=null)
		left.second.next = midNode;
		left.second = midNode;
		
//		midNode.next = right.first;
		left.second.next = right.first;
		left.second = right.first;
		
		return left;
	}
	
	
//	this is for binary tree
	public static ArrayList<Integer> rootToNode(BinaryTreeNode<Integer> root, int val){
		if(root==null) {
//			ArrayList<Integer> al = new ArrayList<>();
			return null;
		}
		
		if(root.data== val) {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(val);
			return al;
		}
		
		ArrayList<Integer> left = rootToNode(root.left, val);
		if(left!=null) {
			left.add(root.data);
			return left;
		}
		
		ArrayList<Integer> right = rootToNode(root.right, val);
		
		if(right!=null) {
			right.add(root.data);
			return right;
		}
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BinaryTreeNode<Integer> root = takeInput();

//		elementsinBetween(root , 2 , 6);
//		System.out.println(isBSTOpti(root).first);
//		int arr[] = {1, 2, 3, 4, 5, 6, 7};
//		BinaryTreeNode<Integer> fa = construct(arr, 0, arr.length-1);
//		print(fa);
//		
//		System.out.println(fa.data);
//		 Pair<ListNode<Integer>, ListNode<Integer>> temp =  TreeToList(fa);
//		while(temp.first!=null) {
//			System.out.print(temp.first.data + "   ");
//			temp.first=temp.first.next;
//		}
//		
//		System.out.println();
//		ArrayList<Integer> al = rootToNode(fa, 1);
//		for(int a: al) {
//			System.out.print(a+" ");
//		}
		
		
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("dhdh");
		bst.insertData(10);
		bst.insertData(20);
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(3);
		bst.insertData(7);
		bst.insertData(6);
		
		bst.PrintTree();
		bst.delete(10);
		bst.PrintTree();
//		printLevelWise(bst.returnRoot());
	}

}
