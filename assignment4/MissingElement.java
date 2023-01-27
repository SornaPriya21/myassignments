package week4.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		 
		int[] arr= {1,2,3,4,7,6,8};
		List<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++ ) {
			arr1.add(arr[i]);
		}
		System.out.println("given list: "+arr1)	;
		Collections.sort(arr1);
		System.out.println("sorted list: "+arr1);
		
		for(int i=arr1.get(0);i<arr1.size();i++) {
			if(i!=arr1.get(i-1)) {
				System.out.println("missing num is: "+i);
				break;
			}
		}

	}

}
