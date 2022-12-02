class Parent
{
	void display()
	{
		System.out.println("parent class");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child class");
	}
}
class DynamicPoly
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
	}
}
