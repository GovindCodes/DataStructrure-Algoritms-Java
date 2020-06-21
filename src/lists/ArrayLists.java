package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		
		List<Integer> any= new LinkedList<>();
		
		any.add(33);
		any.add(43);              //give error since string generics
		any.add(12);                  //give error since String generics
		any.removeFirst();
		
		System.out.println(any);
		System.out.println(any.isEmpty());
		
		
		//object of pair class>>
		
//		Pairs<String, Integer> p1= new Pairs("apple", 23);
//		Pairs<Boolean, Integer> p2= new Pairs(true, 22);
//		
//		p1.getDescription();
//		p2.getDescription();
		
		
		
		    
	}

}
