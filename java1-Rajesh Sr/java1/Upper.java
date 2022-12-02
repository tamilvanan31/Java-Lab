import java.lang.*;
import java.util.*;
class Upper
{
	public static void main(String args[])
	{
		String s,st;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.nextLine();
		st=s;
		int i;
		char c1,c2;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				c1=st.charAt(i+1);
				c2=Character.toUpperCase(c1);
				st=st.substring(0,i+1)+c2+st.substring(i+2);
			}
		
			if(i==0)
			{
				c1=st.charAt(i);
				c2=Character.toUpperCase(c1);	
				st=st.substring(0,i)+c2+st.substring(i+1);
			}
		}
		System.out.println(st);
	}
}
