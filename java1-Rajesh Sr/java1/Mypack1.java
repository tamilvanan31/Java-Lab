package mypack1;
import mypack2.*;
public class Mypack1
{
	public void display()
	{
		System.out.println("My package 1");
	}
	public static void main(String[] args)
	{
		Mypack1 m=new Mypack1();
		m.display();
		Mypack2 m2=new Mypack2();
		m2.display();
	}
}
