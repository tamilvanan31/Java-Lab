import java.lang.*;
import java.util.Scanner;
class Sort
{
	public static void main(String[] args)
	{
		String a;
		char[] s=new char[30];
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		a=sc.nextLine();
		int i,j;
		for(i=0;i<a.length();i++)
			s[i]=a.charAt(i);
		for(i=0;i<a.length()-1;i++)
		{
			for(j=i+1;j<a.length();j++)
			{
				if(s[i]>s[j])
				{
					c=s[i];
					s[i]=s[j];
					s[j]=c;
				}
			}
		}
		for(i=0;i<a.length();i++)
			System.out.printf("%c",s[i]);
	}
}
