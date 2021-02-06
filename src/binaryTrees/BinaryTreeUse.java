package binaryTrees;

import java.util.*;



public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput(Scanner sc){
//		System.out.println("enter root");
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		root.left = takeInput(sc);
		root.right = takeInput(sc);
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return;
		}
		
		String toPrint = root.data+ ": ";
		if(root.left!=null) {
			toPrint += "L:" +root.left.data + ", ";
		}
		if(root.right!=null) {
			toPrint +="R:" +root.right.data;
		}
		System.out.println(toPrint);
		print(root.left);
		print(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInput(){
		Queue<BinaryTreeNode<Integer>> pendingNode = new ArrayDeque<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter root data");
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		pendingNode.add(root);
		
		
		while(pendingNode.size()!=0) {
			BinaryTreeNode<Integer> frontNode = pendingNode.remove();
			System.out.println("Enter Leftchild data of " + frontNode.data);
			int leftData = sc.nextInt(); 
			if(leftData!=-1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftData);
				pendingNode.add(leftNode);
				frontNode.left = leftNode;				
			}

			System.out.println("Enter right childData of "+ frontNode.data);
			int rightData = sc.nextInt(); 
			if(rightData!=-1) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightData);
				pendingNode.add(rightNode);
				frontNode.right = rightNode;				
			}

		}
		return root;
	}
	
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return;
		}
		
		Queue<BinaryTreeNode<Integer>> pending = new ArrayDeque<>();
		pending.add(root);
		
		while(!pending.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pending.remove();
			System.out.print(frontNode.data+ " : ");
			if(frontNode.left!=null) {
				pending.add(frontNode.left);
				System.out.print("L:"+ frontNode.left.data+" ,");
			}
			if(frontNode.right!=null) {
				pending.add(frontNode.right);
				System.out.print(" R:"+ frontNode.right.data);
			}
			System.out.println();
		}
	}


	public static int numNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int sum = 1 + numNode(root.left)+ numNode(root.right);
		return sum;
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int ans = Math.max(height(root.left), height(root.right));
		
		return 1+ans;
		
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		
		int ans = Math.max(Math.max(diameter(root.left), diameter(root.right)), height(root.right) + height(root.left));
		
		return ans;
		
	}
	
//	upar wale way se agar diameter nikale to worst case complexity o(n^2) chli ja rhi aur average O(n*h) hai
//	isko optimize karne ka sidha tarika ye hai ki hm height aur diameter ek hi call me mangwa le isse complexity o(n) ho jaegi
	public static Pair<Integer, Integer> HeightDiameter(BinaryTreeNode<Integer> root){
	
		if(root==null) {
			Pair<Integer, Integer> p = new Pair<>();
			p.first = 0;
			p.second = 0;
			return p;
		}
		
		Pair<Integer, Integer> lp = HeightDiameter(root.left);
		Pair<Integer, Integer> rp = HeightDiameter(root.right);
		
		int height= 1+Math.max(lp.first, rp.first);
		
		int option1 = lp.second;
		int option2 = rp.second;
		int option3 = lp.first+rp.first;
		
		int diameter = Math.max(option2, Math.max(option1, option3));
		
		Pair<Integer, Integer> ans = new Pair<>();
		ans.first = height;
		ans.second = diameter;
		
		return ans;
	}
	
	public static void inorder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}
	
	public static void preorder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static BinaryTreeNode<Integer> BuildTree(int[] preOrder, int[] inOrder) {
		
		return BuildTreeHelper(preOrder , inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
		
	}
	private static BinaryTreeNode<Integer> BuildTreeHelper(int[] preOrder, int[] inOrder, int PreS, int PreE, int InS,
			int InE) {
		
		if(InS>InE) {
			return null;
		}
		
		int rootData = preOrder[PreS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		int rootIndex = -1;
		for(int i=InS; i<=InE; i++) {
			if(inOrder[i] == rootData) {
				rootIndex = i;
				break;
			}
		}
		
		if(rootIndex == -1) {
			return null;
		}
		
		int leftInS = InS;
		int leftInE = rootIndex-1;
		int leftPreS = PreS+1;
		int leftPreE = leftInE - leftInS + leftPreS;
		
		int rightInS = rootIndex + 1;
		int rightInE = InE;
		int rightPreS = leftPreE + 1;
		int rightPreE=  PreE;
		
		
		root.left = BuildTreeHelper(preOrder, inOrder, leftPreS, leftPreE, leftInS, leftInE);
		root.right = BuildTreeHelper(preOrder, inOrder, rightPreS, rightPreE, rightInS, rightInE);
		
		return root;
	}

	public static int findSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        if(root==null){
            return 0;
        }
        
        int ls = 0;
        
        if(root.left!=null)
        ls = root.left.data;
        
        ls += findSum(root.left);
        
        return ls;
	}
	
	
	
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
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//		root.left = node1;
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//		root.right = node2;
//		
		Scanner sc =new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput();
		printLevelWise(root);
		System.out.println("Number of nodes: "+ numNode(root));
		System.out.println("height: " + HeightDiameter(root).first);
		System.out.println("Diameter: "+ HeightDiameter(root).second);
		
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		
		int inO[] = {4, 2, 5, 1, 3, 7};
		int preO[] = {1, 2, 4, 5, 3, 7};
		
		BinaryTreeNode<Integer> root1 = BuildTree(preO, inO);
		printLevelWise(root1);
		

	}

}
