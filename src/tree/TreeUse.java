package tree;

import java.util.*;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput(Scanner sc){
		
		System.out.println("Enter next node data");
		int val = sc.nextInt();
		TreeNode<Integer> root =new TreeNode<>(val);
		System.out.println("Enter no of child for "+val);
		int ChildCount = sc.nextInt();
		for(int i=0; i<ChildCount; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		System.out.print(root.data+" : ");
		for(int i=0; i<root.children.size(); i++) {
			System.out.print(root.children.get(i).data+", ");
		}
		System.out.println();
		for(int i=0; i<root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static TreeNode<Integer> takeInput() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter root data");
		int n =sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);
		Queue<TreeNode<Integer>> queue = new ArrayDeque<>();
		queue.add(root);
		while(queue.size()!=0) {
			TreeNode<Integer> frontNode = queue.remove();
			System.out.println("Number of children of "+ frontNode.data);
			int size = sc.nextInt();
			for(int i=0;i<size; i++) {
				System.out.println("enter "+ (i+1) + "th child");
				int childData = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(childData);
				queue.add(childNode);
				frontNode.children.add(childNode);
			}
		}
		return root;
	}

	public static void printLevelWise(TreeNode<Integer> root) {
		
		Queue<TreeNode<Integer>> pendingNodes = new ArrayDeque<>();
		pendingNodes.add(root);
		while(pendingNodes.size()!=0) {
			TreeNode<Integer> frontNode= pendingNodes.remove();
			System.out.print(frontNode.data+ ": ");
			for(int i=0; i<frontNode.children.size(); i++) {
				System.out.print(frontNode.children.get(i).data+ ", ");
				pendingNodes.add(frontNode.children.get(i));
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		TreeNode<Integer> root = takeInput();
		printLevelWise(root);
		
		
//		TreeNode<Integer> root = new TreeNode<>(0);
//		TreeNode<Integer> node1 = new TreeNode<>(1);
//		TreeNode<Integer> node2 = new TreeNode<>(2);
//		TreeNode<Integer> node3 = new TreeNode<>(3);
//		TreeNode<Integer> node4 = new TreeNode<>(4);
//		TreeNode<Integer> node5 = new TreeNode<>(5);
//		
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		node2.children.add(node5);
//		
//		System.out.println(root);

	}
	

}
