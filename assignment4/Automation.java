package week4.assignment4;

public class Automation extends MultipleLanguage implements Language,TestTool {

	
		
public void java() {
	System.out.println("method java from language interface");
}
	 
@Override
public void ruby() {
	System.out.println("method ruby from abstract class multiole language");
}
	public void selenium() {
		 System.out.println("method selenium from testtool interface");
	}

	 
	public static void main(String[] args) {
		Automation ob=new Automation();
		ob.java();
		ob.selenium();
		ob.python();
		ob.ruby();
	}
}

