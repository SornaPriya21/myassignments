package week3.week3assignment;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("The Id is: "+id);
	}
	public void getStudentInfo(int id,String name) {
		 
         System.out.println("The Id is: "+id);
		System.out.println("name is: "+name);
	}
	public void getStudentinfo(String email,long mobileNum) {
		 
       System.out.println("email is: "+email);
       System.out.println("Mobilenumber is: "+mobileNum);
	}
	
	public static void main(String[] args) {
		 
		Students s2=new Students();
		s2.getStudentInfo(001);
		s2.getStudentInfo(002,"Priya");
		s2.getStudentinfo("sor123@gmail.com",9632587410l);
		
	}

}
