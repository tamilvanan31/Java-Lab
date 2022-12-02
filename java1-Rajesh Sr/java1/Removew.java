import java.lang.*;
import java.util.Scanner;
class Removew
{
	public static void main(String args[])
	{
		String s;
		char[] a=new char[30];
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println(s);
		int i,j=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				a[j]=s.charAt(i);
				j+=1;
			}
		}
		System.out.println(a);
	}
}
