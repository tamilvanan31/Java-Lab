abstract class Base
{
	Base()
	{
		System.out.println("Base");
	}
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived");
	}
}
class Main
{
	public static void main(String[] str)
	{
		Derived b=new Derived();
	}
}
