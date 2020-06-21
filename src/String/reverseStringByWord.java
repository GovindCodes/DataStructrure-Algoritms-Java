package String;

import java.util.Scanner;

public class reverseStringByWord {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 String s= sc.nextLine();
		 
		 //algo
		 int i = s.length()-1;
		 String ans= "";
		 
		 
		 while(i>=0)
		 {
			 //checking extra spaces 
			 while( i>=0 && s.charAt(i)==' ') i--;
			 if(i<0) break;  
			 int j = i;
			 
			 //if spaces are in starting we should break the loop so it should not print extra space in last
			 if(i<0) break;
			 
			 while( s.charAt(i)!= ' ') i--;
			 
			 if(ans.isEmpty())
			 {
				 ans= ans.concat(s.substring(i+1, j+1));
			 }
			 else
			 {
				 ans= ans.concat(" " +s.substring(i+1, j+1));
			 }
		 }
		 System.out.println(ans);
	}

}
