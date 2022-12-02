import java.util.Scanner;
class Arm
{
	public static void main(String args[])
	{
		int n,a,b,c;
		for(int i=100;i<1000;i++)
		{
			a=i%10;
			b=i%100/10;
			c=i/100;
			n=a*a*a+b*b*b+c*c*c;
			if(n==i)
			System.out.println(i);
		}
	}
}
