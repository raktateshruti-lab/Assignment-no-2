// Copy Constructor
public class Student3
{
	int emid;
	String Name;
	int salary;
	public Student3(int id,String name,int sal)
	{
		emid=id;
		Name=name;
		salary=sal;
		System.out.println("ID "+emid+" name "+Name+" salary "+salary);
	}
	public Student3(Student3 obj)
	{
		emid=obj.emid;
		Name=obj.Name;
		salary=obj.salary;
		System.out.println("ID "+emid+" name "+Name+" salary "+salary);

	}
	public static void main(String args[])
	{
		Student3 e=new Student3(101,"Sai",15500);
		Student3 e1=new Student3(e);
	}
}