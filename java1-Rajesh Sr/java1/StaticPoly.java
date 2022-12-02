class StaticPoly
{
	void add(int n,int m)
	{
		int i=n=m;
		System.out.println("Addition is : "+i);
	}
	void add(int i,int j,int k)
	{
		int a=i+j+k;
		System.out.println("Addition is : "+i);
	}
	void add(double a,double b)
	{
		double c=a+b;
		System.out.println("Addition is : "+c);
	}
	public static void main(String[] args)
	{
		StaticPoly s=new StaticPoly();
		s.add(1,2);
		s.add(1,2,3);
		s.add(1.1,2.2);
	}
}
