package week1.day2;

public class CheckPalindrome {
	public static void main(String[] args) {
		int num=34343;
		int revNum=0;
		int temp;
temp=num;
		for(;num>0;num=num/10) {
			revNum=revNum*10+(num%10);
		}
		if(revNum==temp) {
			System.out.println(temp+" is a palindrome number");
		}
		else {
			System.out.println(temp+" is not a palindrome number");
		}
		
	}
	}

