package comparatorsAndComparables;

import java.util.*;

public class MainClass{

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10 , "vishal"));
		students.add(new Student(12 , "tyagi"));
		students.add(new Student(12 , "hathiram"));
		students.add(new Student(155 , "masterjee"));
		students.add(new Student(15 , "masterjee"));
//		Collections.sort( students, new SortByNameThenMarks());
		
		
		/*******way 2**************/
//		Collections.sort( students, new Comparator<Student>() {
//			public int compare(Student o1, Student o2) {
//				if(o1.name.equals(o2.name)) {
//					return o1.marks- o2.marks;
////					if(o1.marks> o2.marks) return -1;
////					else if(o1.marks< o2.marks) return 1;
////					else return 0;
//				}
//				else
//					return o1.name.compareTo(o2.name);
//				
//			}
//
//			
//		});
		/***********************************************/
		
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
		
		
		
		for(Student s: students)
		System.out.println(s);
//		students.forEach(System.out::println);
		

	}

}

//class SortByNameThenMarks implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.name.equals(o2.name)) {
//			return o1.marks- o2.marks;
////			if(o1.marks> o2.marks) return -1;
////			else if(o1.marks< o2.marks) return 1;
////			else return 0;
//		}
//		else
//			return o1.name.compareTo(o2.name);
//		
//	}
//	
//}
