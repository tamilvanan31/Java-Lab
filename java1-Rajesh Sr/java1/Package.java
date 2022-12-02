package calculator;
class Add
{
	int a=10,b=20;
	void answer()
	{
		int c=a+b;
		System.out.println("Answer of addition: "+c);
	}
}
class Sub
{
	int a=20,b=10;
	void answer()
	{
		int c=a-b;
		System.out.println("Answer of subraction: "+c);
	}
}
class Multi
{
	int a=2,b=5;
	void answer()
	{
		int c=a*b;
		System.out.println("Answer of multiplication: "+c);
	}
}
class Division
{
	int a=20,b=10;
	void answer()
	{
		int c=a/b;
		System.out.println("Answer of division: "+c);
	}
}
class Package
{
	public static void main(String[] args)
	{
		Add a=new Add();
		a.answer();
		Sub s=new Sub();
		s.answer();
		Multi m=new Multi();
		m.answer();
		Division d=new Division();
		d.answer();
	}
}
