package oops.Interfaces;

public abstract interface youtuber extends editVideos  {
	
	int x=4;   // by default public static aur final hai
	
	public abstract void makeVideos();
	
	default void uploadVideos() {
		System.out.println("upload videos");
	}

}
