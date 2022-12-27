package week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	int range=8;
	int first=0;
	int second=1;
	int sum;
	System.out.println(first);
    System.out.println(second);
	for(int i=1;i<=range;i++) {
		sum=first+second;
		first=second;
		second=sum;
		System.out.println(sum);
	}
}
}
