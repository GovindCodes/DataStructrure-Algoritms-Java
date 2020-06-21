package set;

import java.util.*;

public class PairsWithGivenSum {

	public static void main(String[] args) {
		Integer array[]= {1, 5, 7 ,1};
		int sum =6;
		
		 Set<Integer> set = new HashSet<>(Arrays.asList(array));

		    // this set will keep track of the unique pairs.
		    Set<String> uniquePairs = new HashSet<String>();

		    for (int i : array) {
		        int x = sum - i;
		        if (set.contains(x)) {
		            int[] y = new int[] { x, i };
		            Arrays.sort(y);
		            uniquePairs.add(Arrays.toString(y));
		        }
		    }

		    System.out.println(uniquePairs.size());
//		    return uniquePairs.size();
	}

}
