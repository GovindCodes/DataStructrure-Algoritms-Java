package loops;

import java.util.Scanner;

public class prime {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
//		boolean isPrime= true;
//		
//		for (int i=2;i<n;i++)
//		{
//			if(n%i==0)
//			{
//				isPrime= false;
//				break;
//			}
//			
//		}
//		if(n==1)
//			isPrime= false;
//		System.out.println("isPrime= "+ isPrime);
		System.out.println(isPrime(4));
		
	}
	
	public static boolean isPrime(int num){
	    for(int i=2;  i<= Math.sqrt(num); i++){
	        if(num%i ==0){
	            return false;
	           
	        }
	    }
	    if(num == 1)
	    	return false;
	    return true;
	}
}
