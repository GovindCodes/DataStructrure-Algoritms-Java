package binarySearchTree;


//Agar yaha phle aa gye ho BSTuse wali phle padho
//Accha padh k aae ho...... to ye kya hai waha pe bhi search waiagarah feature implement kiye hi the
//Ye class hai jiska hm object bna k use karenge iske features (Nhi samajh aaya kya?)
//Abey dekho hm kya chahte ki hm value dete hae aur wo apne aap bst me bnte jae aur isi ka implementation hai idhar....

//Kursi ki peti banndh lo aur "chaliye suru karte hai"
public class BinarySearchTree {
	
	private BinaryTreeNode<Integer> root;
	
	private BinaryTreeNode<Integer> insertDataHelper(int data, BinaryTreeNode<Integer> root) {
		if(root==null) {
			BinaryTreeNode<Integer> btn = new BinaryTreeNode<Integer>(data);
			return btn;
		}
		
		if(root.data > data) {
			root.left =  insertDataHelper(data, root.left);
		}
		if(root.data< data) {
			root.right =  insertDataHelper(data, root.right);
		}
		
		return root;
	}

	public void insertData(int Data) {
		root = insertDataHelper(Data, root);
	}
	
	public BinaryTreeNode<Integer> deleteDataHelper(int data, BinaryTreeNode<Integer> root) {
		if(root==null) {
			return null;
		}
		
		if(root.data> data) {
			root.left = deleteDataHelper(data, root.left);
			return root;
		}else if(root.data<data) {
			root.right =  deleteDataHelper(data, root.right);
			return root;
		}else {
			if(root.left==null && root.right==null) {
				return null;
			}
			else if(root.left!=null && root.right==null) {
				return root.left;
			}
			else if(root.left==null && root.right!=null) {
				return root.right;
			}else {
				BinaryTreeNode<Integer> minNode = root.right;
				while(minNode.left!=null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteDataHelper(minNode.data, root.right);
				root.left = root.left;
				return root;
			}
			
		}
	}
	
	public void delete(int data) {
		root = deleteDataHelper(data, root);
	}

	private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return false;
		}
		
		if(root.data==data) {
			return true;
		}
		else if(data>root.data) {
			//call right
			return hasDataHelper(data, root.right);
			
		}else {
			//call left
			return hasDataHelper(data, root.left);
			
		}

	}
	
	public boolean hasData(int data) {
		
		//iss funtion me hum recursively calling nhi kar paenge kyoki root parameter me hai hi 
		//nhi to root.left ya right nhi likh skte
		//iske liy hmne ek helper function bna li hai jo recursive calling enable kar dega hmatre liye 
		//aur usko private kr diye kyoki hm nhi chahte ki koi aur isko use kar pae
		//ek aur rasta hota ki isko iteratively krte
		return hasDataHelper(data, root);

	}
	
	public void PrintTree() {
		printTree(root);
	}
	
	private void printTree(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
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
		printTree(root.left);
		printTree(root.right);
	}

	public BinaryTreeNode<Integer> returnRoot(){
		return root;
	}
}

