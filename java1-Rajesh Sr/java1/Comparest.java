import java.lang.*;
import java.util.*;
class Comparest
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		s1=sc.nextLine();
		s2=sc.nextLine();
		if(s1.compareTo(s2)==0)
			System.out.println("Strigs are same");
		else
			System.out.println("Strings are not same");
		if(s1.equals(s2))
			System.out.println("Strings are same using equals method");
		else
			System.out.println("Strings are not same using equals method");
	}
}

