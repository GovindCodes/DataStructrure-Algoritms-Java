package String;

public class AnagramOpti {
	public static void main(String args[])
	{
		String a= "abc";
		String b= "bc";
		boolean isAnagram= true;
		
		int A1[]= new int[256];
		//int B1[]=new int[256];
		
		for(char A: a.toCharArray())
		{
			int index= A;
			A1[index]++;
		}
		
		for(char A: b.toCharArray())
		{
			int index= A;
			A1[index]--;
		}
		
		for(int i=0; i<256; i++)
		{
			if(A1[i]!=0)
			{
				isAnagram=false;
				break;
			}
		}
		
		if(isAnagram)
			System.out.println("anagram");
		else
			System.out.println("not anagram");

	}

}
