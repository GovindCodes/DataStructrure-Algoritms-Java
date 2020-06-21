package map;
import java.util.*;

public class CountPairsOfGivenSum {

	public static void main(String[] args) {

		int arr[]= {1, 1, 1, 1};
		int sum =2;
		
		Map<Integer ,Integer> hm = new HashMap<>();
		
		for(int i= 0; i<arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		
		int cnt =0;
		for(int i= 0; i<arr.length; i++) {
			if(hm.get(sum- arr[i]) != null) {
				cnt += hm.get(sum - arr[i]);
			}
			
			if(sum-arr[i] == arr[i]) {
				cnt--;
			}
		}
		
	
		System.out.println(cnt/2);

	}

}
