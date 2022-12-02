import java.lang.*;
import java.util.Scanner;
class Accurance
{
	public static void main(String args[])
	{
		String s;
		char[] a=new char[30];
		int[] b=new int[30];
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int i,j,k,c=0,l;
		for(i=0;i<s.length();i++)
			a[i]=s.charAt(i);
		for(i=0;i<s.length();i++)
		{
			c=0;
			for(j=0;j<s.length();j++)
			{
				if(i==j)
					continue;
				if(a[i]==a[j])
					c+=1;
			}
			b[i]=c;
		}
		c=s.length();
		for(i=0;i<c;i++)
		{
			for(l=0;l<b[i];l++)
			{
				for(j=0;j<c;j++)
				{
					if(i!=j && a[i]==a[j])
					{
						c-=1;
						for(k=j+1;k<c;k++)
						{
							a[k-1]=a[k];
							b[k-1]=b[k];
						}
					}
				}
			}
		}
		for(i=0;i<c;i++)
		{
			if(b[i]>0)
				System.out.println(a[i]+"-"+b[i]);
		}
	}
}
