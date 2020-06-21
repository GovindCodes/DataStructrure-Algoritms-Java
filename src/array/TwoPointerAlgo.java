package array;
import java.util.*;

public class TwoPointerAlgo {

	public static void main(String[] args) {
	int array[]= {1,2,5,3,-4,1};
	
	if(threeSum(array, array.length)) {
		System.out.println(true);
	}
	else
		System.out.println();
	
	
	}
	static boolean threeSum(int a[], int n){
		Arrays.sort(a);
		for(int i= 0; i<n-2; i++) {
			if(twoSum(a, -a[i], i+1))
			{
				return true;
			}	
		}
		return false;
		}
	static boolean twoSum(int arr[], int x, int i) {
//		int i=0, 
		int j= arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]> x) {
				j--;
			}
			else if(arr[i]+arr[j]< x) {
				i++;
			}
			else {
				return true;
			}
		}
		return false;
		}
}
	
//	int n= arr.length;
//	int i=0 ,j=0,k = 0;
//	boolean hasZeroTriplet= false;
//	for(i=0; i<n ; i++)
//	{
//		for(j= i+1; j<n; j++)
//		{
//			for(k=j+1; k<n ; k++)
//			{
//				if(arr[i]+arr[j]+ arr[k]==0) {
//					hasZeroTriplet= true;
//					break; 
//				}
//			
//			}
//			if(hasZeroTriplet== true)
//				break;
//			
//		}
//		if(hasZeroTriplet== true)
//			break;
//	}
//	System.out.println(hasZeroTriplet);
//	}
//
//}
