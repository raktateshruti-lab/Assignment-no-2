public class Student1
{
	int rollno;
	String name;
	public Student1()
	{
		rollno=15;
		name="Prathmesh";
		System.out.println("Roll no:"+rollno);
		System.out.println("name:"+name);
	}
	public Student1(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println("Roll no:"+rollno);
		System.out.println("name:"+name);

	}
	public static void main(String args[])
	{
		Student1 s=new Student1();
		Student1 s1=new Student1(50,"Bhavesh");
	}
}