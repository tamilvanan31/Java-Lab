interface Bank
{
	static void printinterface()
	{
		System.out.println("Bank interface");
	}
	double rateOfIntrest();
}
interface ABC
{
	static void printABC()
	{
		System.out.println("ABC interface");
	}
	void printNonstatic();
}
class SBI implements Bank,ABC
{
	public void printNonstatic()
	{
		System.out.println("Non static ABC");
	}
	public double rateOfIntrest()
	{
		return 9.5;
	}	
}
public class MultiInherit
{
	public static void main(String[] args)
	{
		SBI obj=new SBI();
		//Bank.printinterface();
		//ABC.printABC();
		obj.printNonstatic();
		System.out.println("SBI rate of intrest is : "+obj.rateOfIntrest());
	}
}
