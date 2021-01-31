package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		
//		System.out.println(sumofdigits(1231));
		System.out.println(rodcutting(23,12,9,11));

	}
	
	static int sumofdigits(int n) {
//		int len = (int) (Math.log10(n)+1);
//		if(n==0)
//			return 0;
		if(n<10)
			return n;
		else {
			return n%10 + sumofdigits(n/10);
		}
	}
	
	static int rodcutting(int n, int a, int b, int c) {
		if(n%2==1 && a%2==0 && b%2==0 && c%2==0)
			return -1;
		else if(n<a && n<b && n<c)
			return 0;
		else {
			int min= Math.min(a, b);
			min= Math.min(min, c);
			return rodcutting(n-min, a, b, c)+1;
		}
	}

}
