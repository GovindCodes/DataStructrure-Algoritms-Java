package array;
import java.io.*; 
import java.util.*;

public class CountAnagramsSlidingWindow {
	final static int MAX_CHAR = 256;
			
		    
		    static int countAnagrams(String text, String word) 
		    { 
		    	int hash[]= new int[26];
				int phash[]= new int[26];
				
		        int n = text.length(); 
		        int k = word.length(); 
		        
		        
		       for(int i=0; i<k; i++) {
		    	   hash[word.charAt(i)-'a']++;
		    	   phash[text.charAt(i)- 'a']++;
		       }
		       
		       int cnt=0;
		       for(int i=k; i<n; i++) {
		    	   if(phash.equals(hash))
		    		   cnt++;
		    	   
		    	   phash[text.charAt(i)-'a']++;
		    	   phash[text.charAt(i-k)-'a']--;
		       }
		       if(phash.equals(hash))
	    		   cnt++;
		       return cnt;
		    }
		  
//		        // Check for first window. The idea is to 
//		        // use single count array to match counts 
//		        int[] count = new int[MAX_CHAR]; 
//		        for (int i = 0; i < n; i++) 
//		            count[word.charAt(i)]++; 
//		        for (int i = 0; i < n; i++) 
//		            count[text.charAt(i)]--; 
//		  
//		        // If first window itself is anagram 
//		        int res = 0; 
//		        if (isCountZero(count)) 
//		            res++; 
//		  
//		        for (int i = n; i < N; i++) { 
//		  
//		            // Add last character of current 
//		            // window 
//		            count[text.charAt(i)]--; 
//		  
//		            // Remove first character of previous 
//		            // window. 
//		            count[text.charAt(i - n)]++; 
//		  
//		            // If count array is 0, we found an 
//		            // anagram. 
//		            if (isCountZero(count)) 
//		                res++; 
//		        } 
//		        return res; 
//		    } 
//		  
		    // Driver code 
		    public static void main(String args[]) 
		    { 
		        String text = "forxxorfxdofr"; 
		        String word = "for"; 
		        
		        int hash[]= new int[26];
				int phash[]= new int[26];
				
		        int n = text.length(); 
		        int k = word.length(); 
		        
		        
		       for(int i=0; i<k; i++) {
		    	   hash[word.charAt(i)-'a']++;
		    	   phash[text.charAt(i)- 'a']++;
		       }
		      
		       int cnt=0;
		       for(int i=k; i<n; i++) {
		    	   if(Arrays.equals(hash, phash))
		    		   cnt++;
		    	   
		    	   phash[text.charAt(i)-'a']++;
		    	   phash[text.charAt(i-k)-'a']--;
		       }
		       if(Arrays.equals(hash, phash))
	    		   cnt++;
		       
		       System.out.println(cnt);
		    } 
		    
		    public static boolean isEqual(int[] arr1, int[] arr2 ) {
		    	boolean isEqual = true;
		    	for(int i=0; i<26; i++) {
		    		if(arr1[i]!= arr2[i]) {
		    			isEqual= false;
		    			break;
		    		}
		    	}
		    			
		    	return isEqual;
		    }
		} 