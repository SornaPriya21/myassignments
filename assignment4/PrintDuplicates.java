package week4.assignment4;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			arr1.add(arr[i]);
		}
		System.out.println("given list: "+arr1);
		System.out.println("The duplicates are: ");
		
		for(int j=0;j<arr1.size();j++) {
			for(int k=j+1;k<arr1.size();k++) {
				if(arr1.get(j)==arr1.get(k)) {
					System.out.println(arr1.get(j));
				}
			}
		}

	}

}
