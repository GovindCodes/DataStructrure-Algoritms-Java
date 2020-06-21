package leetcode;

import java.util.Scanner;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		
		String ans= "";
		
		for(int i= 0; i< s.length(); i++)
		{
			for(int j= s.length() ; j>=i; j--)
			{
				String subString= s.substring(i,j);
				
				char A[] =subString.toCharArray();
				String s1="";
				for(int k=A.length-1; k>=0; k-- )
				{
					s1= s1+A[k];
				}
				if(s1.equals(subString)) {
					if(ans.length()<s1.length())
						ans=s1;
				}
			}
		}
		System.out.println(ans);
		

	}
}
