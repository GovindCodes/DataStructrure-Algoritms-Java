package comparatorsAndComparables;

public class Student implements Comparable<Student> {

	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}


	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Student o) {
		if(this.marks>o.marks) return -1;
		else if(this.marks<o.marks) return 1;
		
//		agar marks barabar phir name k hisab se ordering
		return this.name.compareTo(o.name);   //comparable already string ne implement kri hui hai isliye compare to likh sakte hai
		
	}
	
	
}
