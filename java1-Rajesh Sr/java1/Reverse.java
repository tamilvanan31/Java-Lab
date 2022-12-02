import java.lang.String;
import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		st=sc.nextLine();
		char[] c=new char[30];
		int i,j;
		//System.out.println(st.length());
		for(i=0,j=st.length()-1;i<st.length();i++,j--)
		{
			c[i]=st.charAt(j);
		}
		for(i=0;i<st.length();i++)
			System.out.printf("%c",c[i]);
		System.out.println(" ");
	}
}
