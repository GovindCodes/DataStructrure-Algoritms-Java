package VectorAndStack;


public class MainClass {

	public static void main(String[] args) throws Exception {
		
		
//		Vector<Integer> v = new Vector<>();
		
		myStack<Integer> stack = new myStack<>();
		
//		stack.push(90);
//		stack.push(9);
		stack.push(88);
		
		int popped= stack.pop();
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);

	}

}

