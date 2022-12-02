import java.lang.*;
import java.util.Scanner;
class Polyndrome
{
	public static void main(String args[])
	{
		String s;
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char[] c=new char[30];
		char[] c1=new char[30];
		int i,j,f=0;
		for(i=0,j=s.length()-1;i<s.length();i++,j--)
		{
			c1[i]=s.charAt(i);
			c[i]=s.charAt(j);
		}
		//String s1=String.valueOf(c);
		//System.out.println(s1+s);
		for(i=0;i<s.length();i++)
		{
			if(c[i]!=c1[i])
				f=1;
		}
		if(f==0)
			System.out.println("polynomial");
		else
			System.out.println("not polynomial");
	}
}
