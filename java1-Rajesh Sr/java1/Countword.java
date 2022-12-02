import java.lang.*;
import java.util.*;
class Countword
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.nextLine();
		int c=1,i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				c+=1;
		}
		if(s.length()==0)
			c=0;
		System.out.println("Number of worlds in the string = "+c);
	}
}
