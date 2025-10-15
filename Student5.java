import java.util.*;

class Student5 {
	int roll_no;
	String name;
	Double mrks;
	public void Std(int roll_no,String name,Double mrks){
		roll_no = roll_no;
		name = name;
		mrks = mrks;

		System.out.println("Name :"+name+" Roll_No :"+roll_no+" Marks :"+mrks);
	}
	public void Std1(int roll_no,String name,Double mrks){
		this.roll_no = roll_no;
		this.name = name;
		this.mrks = mrks;

		System.out.println("Name :"+name+" Roll_No :"+roll_no+" Marks :"+mrks);
	}
	
	public static void main(String[] args){
		
		Student5 s1 = new Student5();

		s1.Std(93,"Prathmesh",9.21);
		s1.Std1(93,"Prathmesh",9.21);
	}
}
