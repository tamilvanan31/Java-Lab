class Staticb
{
	static
	{
		System.out.println("First static block");
	}
	public static String staticstring="static string";
	static
	{
		System.out.println("second static block "+ "and "+staticstring);
	}
	public static void main(String args[])
	{
		Staticb e=new Staticb();
		Staticb.staticmethod();
	}
	public static void staticmethod()
	{
		System.out.println("This static method invockd using class");
	}
	static 
	{
		staticmethod2();
		System.out.println("third static block");
	}
	public static void staticmethod2()
	{
		System.out.println("static method");
	}
}
