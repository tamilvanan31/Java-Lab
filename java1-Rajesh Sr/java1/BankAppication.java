import java.lang.*;
import java.util.Scanner;
class Customer
{
	int pin;
	int acno;
	BankAccount sa;
	BankAccount ca;
	public Customer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pin and account no");
		int p=sc.nextInt();
		int a=sc.nextInt();
		pin=p;
		acno=a;
		sa=new BankAccount();
		ca=new BankAccount();
	}
	public BankAccount getsa()
	{
		return sa;
	}
	public BankAccount getca()
	{
		return ca;
	}
}
class Bank
{
	static int i=0;
	Customer c[]=new Customer[10];
	public Bank()
	{
		c[i]=new Customer();
		i++;
	}
	public void addCustomer()
	{
		c[i]=new Customer();
		i++;
	}
	public Customer findCustomer(int p,int a)
	{
		for(Customer c1:c)
		{
			if(c1.pin==p && c1.acno==a)
				return c1;
		}
		return null;
	}
}
class BankAccount
{
	private double balance;
	public void withdrawel(int Amount)
	{	
		balance-=Amount;
	}
	public void deposit(int Amount)
	{
		balance+=Amount;
	}
	public double getbalance()
	{
		return balance;
	}
}
class BankAppication
{
	public static void main(String[] args)
	{
		char type;
		BankAccount ba=new BankAccount();
		Bank b=new Bank();
		Customer c=new Customer();
		b.addCustomer();
		System.out.println("Enter the account type");
		Scanner sc=new Scanner(System.in);
		type=sc.next().charAt(0);
		if(type=='s')
			ba=c.getsa();
		ba.deposit(5000);
		ba.withdrawel(1000);
		//double bal=ba.getbalance();
		System.out.println(ba.getbalance());
	}
}
