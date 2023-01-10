package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("My Desktop Size");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.desktopSize();
		obj.computerModel();
		
	}

}
