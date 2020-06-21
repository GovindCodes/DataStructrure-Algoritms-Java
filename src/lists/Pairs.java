package lists;

public class Pairs< X , Y > {
	
	 public X a;
	 public Y b;
	
	public Pairs(X x, Y y){
		a= x;
		b= y;
		
	}
	
	public void getDescription() {
		System.out.println(a+ " and "+ b);
	}

}

