package oops;

class vehicle
{
	int wheels, headlights;
	String color;
	vehicle(int wheels)
	{
		this.wheels=wheels;
		headlights=2;
	}
	vehicle(int wheels, String color){
		this.color= color;
		this.wheels= wheels;
	}
}
public class costructor {
	public static void main(String args[])
	{
		vehicle car = new vehicle(2,"yellow");
		System.out.println("car has "+ car.wheels +" wheels and "+ car.color +" color");
		}

}
