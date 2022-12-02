import java.lang.*;
class Exception1
{
	public static void main(String[] args)
	{
		try
		{
			try
			{
				int z=3/0;
			}
			catch(ArithmeticException ex)
			{
				System.out.println("hello"+ex);
			}				
		}
		catch(ArithmeticException e)
		{
			System.out.println("hii"+e);
		}
		finally
		{
			System.out.println("finally  block");
		}
		System.out.println("out of blocks");	
	}
}
