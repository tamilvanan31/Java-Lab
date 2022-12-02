class A
{
	
	

	A(int a)
	{
		System.out.println("A a");
	}
}
class B extends A
{
	 B()
	{
		super(5);
		System.out.println("B");
		
	}
}
class Add
{
	public static void main(String[] args)
	{
		int[][] a=new int[2][];
		a[0]=new int[3];
		a[1]=new int[8];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf(a[i][j]+" ");
			}
			System.out.printf("%n");
		}
		//B b=new B();
	//	b.Ball();
	}
}
