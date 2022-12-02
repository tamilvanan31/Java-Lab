import java.lang.*;
import java.util.*;
class Searchword
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a strig");
		s=sc.nextLine();
		System.out.println("Enter the search word");
		String w=sc.nextLine();
		if(s.contains(w))
			System.out.println("Word is in the string");
		else
			System.out.println("Word is not in the string");
	}
}
