package week1.day1;
public class Calculator {
	public void addtwoNum() {
		int a=25;
		int b=30;
		System.out.println("the sum of 2 num is: "+(a+b));
	}
	public int addthreeNum(int a,int b,int c) {
		return a+b+c;
	}
	public void multiplyNum() {
		int c=52;
		int d=30;
		System.out.println("multiplication of two number is: "+(c*d));
	}
	public double multiplytwoNum(int f,double g) {
		return f*g;
	}
	public void sub() {
		int h=70;
		int i=50;
		System.out.println("the sub of 2 number is: "+(h-i));

	}
	public double subtwoNum(double c, double d) {
		return c-d;
	
	}
	public void divide() {
	 int j=100;
	 int k=25;
	 System.out.println("division of two number: "+(j/k));
	}
	public double divideNum(int x,double y) {
		return x/y;
	}
	public static void main(String[] args) {
		Calculator cr=new Calculator();
		cr.addtwoNum();
		System.out.println("add: "+cr.addthreeNum(10, 20, 30));
		cr.multiplyNum();
		System.out.println("multiply: "+cr.multiplytwoNum(5,2.56d));
		cr.sub();
		System.out.println("sub: "+cr.subtwoNum(126.75, 95.25d));
		cr.divide();
		System.out.println("divide: "+cr.divideNum(100, 2.5d));
		System.out.println("All aritmetic operations are performed.");
	}
	}
	

