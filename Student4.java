//Constructor overloading :- Many object(constructor) with same name but many parameters 
// Eg:- 4 constructor
// 1 constructor = 0 parameter
// 2 constructor = 1 parameter
// 3 constructor = 2 parameter
// 4 constructor = 3 parameter
// similarly for method, one method many operation like - area of circle, triangle, reactangle


import java.util.*;

class Student4 {
	int roll_no;
	String name;
	Double mrks;
	public Student4(){
		roll_no = 93;
		name = "Prathmesh";
		Double mrks = 9.21;

		System.out.println("Name :"+name+" Roll_No :"+roll_no+" Marks :"+mrks);
	}
        public Student4(String n){
		name = n;
		
		System.out.println("Name :"+name);
	}
	public Student4(int r,String n){
		roll_no = r;
		name = n;
		System.out.println("Name :"+name+" Roll_No :"+roll_no);
	}
	public Student4(int r,String n,Double m){
		roll_no = r;
		name = n;
		mrks = m;
		System.out.println("Name :"+name+" Roll_No :"+roll_no+" Marks :"+mrks);
	}
	
	public static void main(String[] args){
		Student4 s1 = new Student4();
		Student4 s2 = new Student4("Prathmesh");
		Student4 s3 = new Student4(93,"Prathmesh");
		Student4 s4 = new Student4(93,"Prathmesh",9.21);
	}
}
