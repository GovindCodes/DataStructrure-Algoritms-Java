package map;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>(); 
		map.put("two", 2);
		map.put("one", 1);
		map.put("three", 3);
	
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
//		for(Entry<String, Integer> entry: map.entrySet());
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		
		for(Entry<String, Integer> entry: entries) {
			entry.setValue(entry.getValue() + 10);
		}
		
		System.out.println(map);
		System.out.println(getHash("CAT"));

	}
	
	public static int getHash(String s) {
		int sum= 0;
		for(int i=0; i<s.length(); i++) {
			int val = s.charAt(i);
			sum += val;
		}
		return sum;
	}

}
