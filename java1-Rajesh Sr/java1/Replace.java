import java.lang.*;
import java.util.Scanner;
class Replace
{
	public static void main(String args[])
	{
		String s;
		String b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.nextLine();
		b=s;
		System.out.println("Enter a character");
		char c;
		c=sc.next().charAt(0);
		System.out.println("enter the replace character");
		char c1;
		c1=sc.next().charAt(0);
		int i;//=sc.nextInt();
		//StringBuilder b=new StringBuilder(s);System.out.println("hiiii");
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
				b=s.replace(c,c1);
		}
		System.out.println(b);
	}
}
