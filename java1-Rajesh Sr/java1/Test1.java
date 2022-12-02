class Test1
{
	public static void main(String [] args)
	{
		String i="abc",j=new String("abc"),k=new String("abc");
		System.out.println("=="+(i==j));
		System.out.println("=="+(j==k));
		System.out.println("equals"+i.equals(j));
	}
}
