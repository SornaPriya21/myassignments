package bank;

public class AxisBank extends BankInfo {
	
	 
	 public void deposit() {
		 System.out.println("minimum depoist amount is:Rs10,000");

} 
	 public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();
	}
}