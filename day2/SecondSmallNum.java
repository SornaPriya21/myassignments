package week1.day2;

import java.util.Arrays;

public class SecondSmallNum {
	
public static void main(String[] args) {
	
	int[] num= {23,45,67,32,89,22};
	
	int length=num.length;
	System.out.println("the length of array is: "+length);
	
	Arrays.sort(num);
	
	for(int i=0;i<=length-1;i++) {
		System.out.println(num[i]);
		//System.out.println("they are sorted array.");
	}

	System.out.println("The second smallest number is: "+num[1]);
	
}
}
