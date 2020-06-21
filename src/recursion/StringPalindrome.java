package recursion;

public class StringPalindrome {

	public static void main(String[] args) {
		
//		System.out.println(palindrome("mahlam", 0, 5));
		reverse("pouytriuy");

	}
	
	static boolean palindrome(String str, int s, int l) {
		if(s==l)
			return true;
		else if(str.charAt(s)!= str.charAt(l))
			return false;
		else
			return palindrome(str, s+1, l-1);
	}
	
	static void reverse(String str) {
		int l= str.length()-1;
		if(l==1)
			System.out.println(str);
		else {
			System.out.print(str.charAt(l));
			 reverse(str.substring(0, l));
		}
		
	}

}
