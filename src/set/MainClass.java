package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		
		s.add("apple");
		s.add("mango");
		s.add("banana");
		s.add("apple");
		
		System.out.println(s);
		
		
		Set<String> s1 = new LinkedHashSet<>();
		s1.add("qwer");
		s1.add("tyui");
		s1.add("opas");
		
		System.out.println(s1);
		
		Set<String> s2 = new TreeSet<>();
		s2.add("poodle");
		s2.add("rusky");
		s2.add("pug");
		
		System.out.println(s2);
		
		
		//	Operations of set
		
		Set<Integer> x = new HashSet<>();
		x.add(12);
		x.add(54);
		x.add(67);
		
		Set<Integer> y = new HashSet<>();
		y.add(36);
		y.add(33);
		y.add(12);
		
		x.addAll(y);
		System.out.println(x);
	}

}
