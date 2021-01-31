package recursion;

public class Factorial {
	
	public static void main(String args[]) {
		System.out.println(fact(5));
		System.out.println(fact(5, 1));  // tai recursion call
	}
	
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	
	
//	converted to tail recursion(faster)
	static int fact(int n,int val) {
		if(n==0)
			return val;
		return fact(n-1, n*val);
	}

}
