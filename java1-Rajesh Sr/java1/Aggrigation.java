//inheritance
class Parent
{
	protected int x;
	void display()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child class");
	}
}
//Associaion
class Manager
{
	int salary;
	//Project p=new Project();
	Worker[] w=new Worker[10];
	public void Logon(SwipeCard obj)
	{
		System.out.println(obj.getVal());
	}
	public String GetManagerName()
	{
		return "Anil";
	}
	void Sucess(boolean good,Project p)
	{
		if(good)
		{
			p.IsSucess=true;
			System.out.println("Project success");
		}		
		else
		{
			System.out.println("Poject fails");
			p.IsSucess=false;
		}
	}
}
class SwipeCard
{
	int val;
	SwipeCard()
	{
		val=123;
	}
	public void Swipe(Manager obj)
	{
		System.out.println(obj.GetManagerName());
	}
	public String MakeOfSwipecard()
	{
		return "c001";
	}
	public int getVal()
	{
		return val;
	}
}
//Aggrigation
class Worker
{
	String name;
	Worker(String n)
	{
		name=n;
	}
}
//composition
class Project
{
	boolean IsSucess;
	void Salary(Manager m)
	{
		System.out.println(IsSucess);
		if(IsSucess==true)
		{
			
			m.salary=100000;
		}
		else
			m.salary=0;
		System.out.println("Salary of the Manager :"+m.salary);
	}
}
public class Aggrigation
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		Child c=new Child();
		p.display();
		c.display();
		Manager m=new Manager();
		SwipeCard s=new SwipeCard();
		m.Logon(s);
		s.Swipe(m);
		System.out.println("manager name using manager object "+m.GetManagerName());
		System.out.println("swipe card company "+s.MakeOfSwipecard());
		Project pr=new Project();
		m.Sucess(true,pr);
		pr.Salary(m);
	}
}
