public class Student2
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No. :");
		int r = sc.nextInt();
		System.out.print("Enter Name :");
		String n = sc.next();
		Student1 s1=new Student1(r,n);
	}
}