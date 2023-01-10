package week3.week3assignment;

public class PalindromeString {

	public static void main(String[] args) {
		
		String name="madam";
		String rev="";
		char[] charArray = name.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			rev=rev+charArray[i]; //rev=rev+charAt(i)----> it takes one character 
		}
		System.out.println(rev);
		 
			if(rev.equals(name)) {
				System.out.println(name+" is palindrome");
			}
			else {
				System.out.println(name+" is not a palindrome");
			}
			
			
		}

	}


