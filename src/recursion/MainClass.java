package recursion;

public class MainClass {
	static int steps =0;

	public static void main(String[] args) {
		
//		System.out.println(sum(5));
		System.out.println(fastpow(5,3));
//		System.out.println(steps);
//		steps=0;
//		System.out.println(fastPow(5,10));
//		System.out.println(steps);
		
//		System.out.println(path(200,2));

	}

	static int sum(int n) {
		if(n==1)
			return 1;
		
			return n + sum(n-1);
	}
	
	static int pow(int a, int b) {
		steps++;
		if(b==0)
			return 1;
		return a* pow(a, b-1);
	}
	
	static int fastpow(int a, int b) {
		if(b==0)
			return 1;
		else if(b%2==0)
			return pow(a*a, b/2);
		else
			return a*pow(a, b-1);
		
		
	}
	
	static int fastPow(int a, int b) {
//		System.out.println(b);
		steps++;
		if(b==0)
			return 1;
		else if(b%2==0)
			return fastPow(a*a, b/2);
		return a*fastPow(a, b-1);
	}
	
	static int path(int n, int m) {
		if(n==1 || m==1)
			return 1;
		return path(n-1, m) + path(n, m-1);
	}
}
