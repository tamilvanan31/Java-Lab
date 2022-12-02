import java.lang.String;
import java.util.Scanner;
class Concat
{
	public static void main(String ars[])
	{
		String s1=new String("welcome to ");
		String s2=new String("MIT");
		//String s3=s1.concat(s2);
		String s3=s1+s2;
		System.out.println(s3);
	}
}
