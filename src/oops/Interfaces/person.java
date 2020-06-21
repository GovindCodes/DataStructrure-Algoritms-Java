package oops.Interfaces;

public class person implements student, youtuber {

	public static void main(String[] args) {
		
		person p1 = new person();
		p1.study();
		p1.makeVideos();
		p1.eat();
		
		p1.uploadVideos();

	}
	
	//naya bana skte jo implemented class me na bhi ho
	public void eat() {
		System.out.println("eating");
	}
	@Override
	public void study() {
		System.out.println("person is studying");
	}

	@Override
	public void makeVideos() {
		System.out.println("person is making videos");
		
	}

	@Override
	public void editVidoes() {
		// TODO Auto-generated method stub
		
	}
	
//	public void uploadVideos() {
//		System.out.println("uploading");
//	}

}
