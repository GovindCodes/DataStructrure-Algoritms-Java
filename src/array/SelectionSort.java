package array;

public class SelectionSort {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int n= a.length;
		boolean sorted = true;
		for(int i=0; i<n-1; i++)
		{
			int minInd= i;
			for(int j= i; j<n; j++)
			{
				if(a[minInd]>a[j]) {
					minInd= j;
					sorted = false;
				}
			}
			if(sorted)  break;
			int temp= a[i];
			a[i]= a[minInd];
			a[minInd]= temp;
		}
		for(int e:a)
			System.out.print(e+" ");
	}

}
