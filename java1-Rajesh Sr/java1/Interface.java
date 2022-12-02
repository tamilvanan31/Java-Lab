interface A
{
	void print();
	default int p()
	{
		return 5;
	}
	static int pr(int c)
	{
		return c*c*c;
	}
}
interface B
{
	void print();
}
class C implements A,B
{
	public void print()
	{
		System.out.println("AA");
	}
	//public void printb()
	//{
	//	System.out.println("bbb");
	//}
}
class Interface
{
	public static void main(String[] args)
	{
		C c=new C();
		c.print();
	//	c.printb();
		System.out.println(c.p());
		System.out.println(A.pr(4));
	}
}
