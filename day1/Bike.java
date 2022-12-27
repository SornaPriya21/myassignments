package week1.day1;

public class Bike {
	public void rideSafe() {
		System.out.println("ride safely");

	}
	public static void main(String[] args) {
		Car c1=new Car();
		c1.applyBrake();
		c1.soundHorn();
		Bike b1=new Bike();
		b1.rideSafe();
		
	}

}
