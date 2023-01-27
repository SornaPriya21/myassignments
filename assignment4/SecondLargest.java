package week4.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] data= {3,2,11,4,6,7};
		
		List<Integer> data1=new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
				data1.add(data[i]);
		}
System.out.println("given data: "+data1);
Collections.sort(data1);
System.out.println("sorted data: "+data1);
int size=data1.size();
System.out.println("size of list is: "+size);
System.out.println("Second largest number is: "+data1.get(size-2));
	}

}
 