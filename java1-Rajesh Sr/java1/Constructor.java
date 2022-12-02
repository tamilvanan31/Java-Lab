class Person
{
	int salary;
	Person()
	{
		salary=0;
	}
	Person(int s)
	{
		salary=s;
	}
	Person(Person p)
	{
		this.salary=p.salary;
	}
	void printSalary()
	{
		System.out.println("Salary "+salary);
	}
}
class Constructor
{
	public static void main(String[] args)
	{
		Person p=new Person();
		p.printSalary();
		Person p2=new Person(10000);
		p2.printSalary();
		Person p3=new Person(p2);
		p3.printSalary();
	}
}
