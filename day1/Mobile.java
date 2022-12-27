package week1.day1;

public class Mobile {
public void makeCall() {
String mobileModel="samsungA";
float mobileWeight=166.66f;
System.out.println("my mobile model is "+mobileModel);
System.out.println("Weight: "+mobileWeight);
}
public void sendMsg() {
int mobileCost=15000;
boolean fullyCharged=true;
System.out.println("cost: "+mobileCost);
System.out.println("fullycharged: "+fullyCharged);
}
public static void main(String[] args) {
	Mobile m1=new Mobile();
	m1.makeCall();
	m1.sendMsg();
	System.out.println("This is my mobile.");
	
}
}
