package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
	

		int[] arr= {1,2,3,4,7,6,8};// 5 is missing
		int length=arr.length;
		System.out.println("length of array: "+length);
		int n=arr.length+1; //actual array size
		System.out.println("actual array length: "+n);
		int totalsum=n*(n+1)/2;
		int sum=0;
		Arrays.sort(arr);
		
		for(int i=0;i<=length-1;i++) {
			sum=sum+arr[i];		
		}
		int missNum=totalsum-sum;
		System.out.println(missNum+" is missing element");
			
		
			
		}
	}

