import java.lang.*;
import java.util.*;
class Email
{
	public static void main(String args[])
	{
		String s;
		System.out.println("Enter a email id");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int i,f=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)==32)
				f=1;
		}
//		System.out.println(f);
		if(!(s.endsWith("@gmail.com") || s.endsWith("@yahoo.com")))
			f=1;
		if(f==0)
			System.out.println("valid email id");
		else
			System.out.println("invalid email id");
	}
}
