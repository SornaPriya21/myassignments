package week4.assignment4;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		 String text="we learn java basics as part of java sessions in java week1";
		 String[] newtext=text.split(" ");
		 
		 Set<String> rd=new LinkedHashSet<String>();
		 
		 for(int i=0;i<newtext.length;i++) {
			rd.add(newtext[i]);
		 }
		 System.out.println(rd);
		
		 

	}

}
