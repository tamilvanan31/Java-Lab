class Parent
{
	protected int a=10;
	final String s="Parent";
	void display()
	{
		System.out.println(s);
	}
};
class Child extends Parent
{
	final String s="Child";
	void display()
	{
		System.out.println(s);
	}
};
class Final
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		Child c=new Child();
		Parent ref;
		//p.s="Not parent";
		//c.s="Not child";
		System.out.println("A Final parent "+ c.a);
		ref=p;
		ref.display();
		ref=c;
		ref.display();
	}
}
		
