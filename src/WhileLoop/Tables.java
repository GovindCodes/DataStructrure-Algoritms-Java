package WhileLoop;

public class Tables {
	public static void main(String args[])
	{
		int res=1;
		//Scanner sc= new Scanner(System.in)
		for(int i=1;i<=20;i++)
		{
			for(int j=1; j<=10;j++ )
			{
				res= j*i;
				System.out.print(res+ " ");
			}
			System.out.println();
		}
	}

}
