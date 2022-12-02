class Parent
{
	int t;
}
class Child extends Parent
{
	int y;
}
class Loop
{
	public static void main(String[] args)
	{
		Child c=new Child();
		if(c instanceof Child)
			System.out.println("c in Child");
		else
			System.out.println("c not in child");
		if(c instanceof Parent)
			System.out.println("c in parent");
		else
			System.out.println("c not in parent");
		Parent c1=new Child();
		if(c1 instanceof Child)
			System.out.println("c in Child");
		else
			System.out.println("c not in child");
		if(c1 instanceof Parent)
			System.out.println("c in parent");
		else
			System.out.println("c not in parent");
		int i,j=10;
		double d,a=20.5;
		d=j;
		i=(int) a;
		System.out.println(d );
		System.out.println(i);
	}
}
