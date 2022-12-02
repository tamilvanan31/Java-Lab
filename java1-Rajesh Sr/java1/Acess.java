package acess;
class Student extends Acess
{
	void setProtectedVal(int w)
	{
		weight=w;
	}
	void printProtectedVal()
	{
		System.out.println("Weight "+weight);
	}
}
class Teacher
{
	void setDefaultVal(int s,Acess p)
	{
		p.salary=s;
	}
	void printDefaultVal(Acess p)
	{
		System.out.println("salary "+p.salary);
	}
}
public class Acess
{
	private int height;
	protected int weight;
	public String name;
	int salary;
	void privateValSet(int h)
	{
		height=h;
	}
	void privateValPrint()
	{
		System.out.println("Height "+height);
	}
	public static void main(String[] args)
	{
		Acess p=new Acess();
		p.privateValSet(170);
		p.privateValPrint();
		Student s=new Student();
		s.setProtectedVal(50);
		s.printProtectedVal();
		Teacher t=new Teacher();
		t.setDefaultVal(10000,p);
		t.printDefaultVal(p);
		acess2.Acess2 a=new acess2.Acess2();
		a.setPublicVal(p,"Rajesh");
		a.printVal(p);
	}
}
