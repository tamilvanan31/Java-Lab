class Test
{
	Test()
	{
		System.out.println("Parent class");
	}
}
class Child extends Test
{

	Child()
	{
		super();
	
		System.out.println("Child class");
	}
}
class Parent
{
	public static void main(String[] args)
	{
		Child c=new Child();
	}
}
