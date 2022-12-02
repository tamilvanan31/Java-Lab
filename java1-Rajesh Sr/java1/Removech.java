import java.lang.*;
import java.util.Scanner;
class Removech
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		s=sc.nextLine();
		char c;
		System.out.println("Enter the delete charater");
		c=sc.next().charAt(0);
		StringBuilder st=new StringBuilder(s);
		int i;
		for(i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				st.deleteCharAt(i);
				break;
			}
		}
		System.out.println(st);
	}
}
		
