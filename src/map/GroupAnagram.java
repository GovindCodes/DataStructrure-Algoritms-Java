package map;
import java.util.*;

public class GroupAnagram {

	public static void main(String[] args) {
		
		String arr[]= {"eat", "tea", "tan", "ate", "nat", "bat"};
		
//		Map<String, List<String>> map = new HashMap<>();
//		
//		for(String s : str) {
//			char a[]= s.toCharArray();
//			Arrays.sort(a);
//			String sorted = new String(a);
//			
//			if(!map.containsKey(sorted)) {
//				map.put(sorted, new LinkedList<String>());
//			}
//			map.get(sorted).add(s);
//		}
//		System.out.println(map.values());
		
		
		 Map<String, Integer> map = new HashMap<>();
	        for(String s: arr){
	            char[] ch = s.toCharArray();
	            Arrays.sort(ch);
	            String str = new String(ch);
	            if(!map.containsKey(str)){
	                map.put(str, 1);
	            }
	            else{
	                map.put(str, map.get(str)+1);
	            }
	        }
//	        Collections.sort(map.values());
	        System.out.println(map.values());
	}

}
