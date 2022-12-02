class Parent1
{
	void fun()
	{
		System.out.println("Parent 1");
	}
}
class Parent2
{
	void fun()
	{
		System.out.println("Parent2");
	}
}
class Multi extends Parent1Parent2
{
	/*void fun()
	{
		System.out.println("child");
	}*/
	public static void main(String[] args)
	{
		Multi m=new Multi();
		m.fun();
	}
}
