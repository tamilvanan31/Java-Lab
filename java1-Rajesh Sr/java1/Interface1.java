interface Bank
{
	float rateOfIntrest();
}
class SBI implements Bank
{
	public float rateOfIntrest()
	{
		return 9.15f;
	}
}
class ICICI implements Bank
{
	public float rateOfIntrest()
	{
		return 9.5f;
	}
}
class Interface1
{
	public static void main(String[] args)
	{
		Bank b=new SBI();
		System.out.println("SBI: "+b.rateOfIntrest());
		b=new ICICI();
		System.out.println("ICICI: "+b.rateOfIntrest());
	}
}
	
