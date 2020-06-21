package map;
import java.util.*;

public class HashCodeAndEquals {

	public static void main(String[] args) {

		pen pen1 = new pen(10, "green");
		pen pen2 = new pen(10, "green");
		
		System.out.println(pen1 == pen2);
		System.out.println(pen1.equals(pen2));
		
		System.out.println(pen1);
		System.out.println(pen2);
		
		Set<pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		
		System.out.println(pens);

	}

}

class pen{
	String color;
	int price;
	
	pen(int price, String color){
		this.color = color;
		this.price = price;
	}

	

	
	
/******ye hhmne implement kra magar edge cases bache hue hai handle krne k liy*********/
	
//	@Override                                  //override object class se kr rhe
//	public boolean equals(Object o) {
//		pen that = (pen) o;
//		boolean isEqual = this.color.equals(that.color) &&
//				this.price == that.price;
//		
//		return isEqual;	
//	}
//	
//	@Override
//	public int hashCode() {
//		return price+color.hashCode();
//	}
	
/*********************************************************************************/
	
	
/*****eclipse source me jake generate kiye******/
/****isme sare edge cases handle hai*******/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pen other = (pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	
	
}