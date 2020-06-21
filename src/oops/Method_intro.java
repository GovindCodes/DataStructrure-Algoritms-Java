package oops;

public class Method_intro {

	public static void main(String[] args) {
	int firstNumber=12;
	int secondNumber= 64254;
	int result= maxOf(firstNumber,secondNumber,6456);
	System.out.println("result is "+result);

	}
	static int maxOf(int a,int b)
	{
//			if(a>b)
//				return a;
//			else
//				return b;
		return a>b?a:b;
				
	}
	static int maxOf(int a, int b, int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}

}
