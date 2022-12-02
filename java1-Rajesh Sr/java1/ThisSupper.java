class SuperClass
{
	int x=20;
	void setValue(int x)
	{
		this.x=x;
	}	
}
class SubClass extends SuperClass
{
	int x;
	void setValue(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("value of x without using super "+x);
		System.out.println("value of x using super "+super.x);
	}
}
class ThisSupper
{
	public static void main(String[] args)
	{
		SuperClass su=new SuperClass();
		su.setValue(20);
		SubClass s=new SubClass();
		s.setValue(40);
		s.display();
	}
}
