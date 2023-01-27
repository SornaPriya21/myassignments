package week4.assignment4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		 
		int[] a= {3,2,11,4,6,7};
		List<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			a1.add(a[i]);
		}
		System.out.println("1st set of numbers: "+a1);
		int[] b= {1,2,8,4,9,7};
		List<Integer> b1=new ArrayList<Integer>();
		for(int i=0;i<b.length;i++) {
			b1.add(b[i]);
		}
		System.out.println("2nd set of numbers: "+b1);
		
		for(int j=0;j<a1.size();j++) {
			for(int k=0;k<b1.size();k++) {
				if(a1.get(j)==b1.get(k)) {
					System.out.println(a1.get(k));
					
				}
			}
		}
		System.out.println("These are intersection values");
		
		
		
	}

}
