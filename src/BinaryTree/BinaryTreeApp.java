package BinaryTree;

public class BinaryTreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		Node root= bt.createNode(2);
		root.left= bt.createNode(7);
		root.right= bt.createNode(5);
		root.left.left= bt.createNode(2);
		root.left.right= bt.createNode(6);
		root.right.right= bt.createNode(9);
		root.right.right.left= bt.createNode(4);
		root.left.right.left= bt.createNode(5);
		root.left.right.right= bt.createNode(11);
		
//		System.out.println("Inorder");
//		bt.inorder(root);
//		System.out.println();
//		
//		System.out.println("Preorder");
//		bt.preorder(root);
//		System.out.println();
//		
//		System.out.println("Postorder");
//		bt.postorder(root);
//		System.out.println();
		
//		System.out.println(bt.getSum(root));
		
//		System.out.println(bt.getDiffInEvenOddLevels(root));
		
		System.out.println(bt.getNumber(root));
		System.out.println(bt.getHeight(root));
		
	}

}

class BinaryTree{
	Node createNode(int val) {
		Node node= new Node();
		node.data= val;
		node.left= null;
		node.right= null;
		return node;
	}
	
	public void inorder(Node node) {
		if(node== null)
			return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	
	public void preorder(Node node) {
		if(node== null) {
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	
	public void postorder(Node node) {
		if(node== null)
		return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
	
	public int getSum(Node node){
		if(node==null)
			return 0;
		return node.data+ getSum(node.left)+ getSum(node.right);
		
	}
	
	public int getDiffInEvenOddLevels(Node node) {
		if(node== null)
			return 0;
		return node.data- getDiffInEvenOddLevels(node.left) -getDiffInEvenOddLevels(node.right);
	}
	
	public int getNumber(Node node) {
		if(node== null)
			return 0;
		
		return  1+ getNumber(node.left)+ getNumber(node.right);
	}
	
	public int getHeight(Node node) {
		if(node == null)
			return -1;
		return Math.max(getHeight(node.left), getHeight(node.right)) +1;
	}
}


class Node{
	int data;
	Node left;
	Node right;
}