class MultithreadingDemo extends Thread
	{
		String s;
		MultithreadingDemo(String st)
		{
			s=st;
		}
	public void run()
	{	
	try
	   {
	    for(int i=1;i<=10;i++)
		{
		System.out.println(s+i+"is taking the ball");
			
			 if(i==10)
			  {
			   System.out.println(s+"is winner");
			    break;
			  }
		}	
	}

	catch (Exception e)
        {
            System.out.println ("Exception is caught");
        }
       }
 }
class Aswin
       {
        public static void main(String args[]){ 
	         MultithreadingDemo t1=new MultithreadingDemo("ab");
                 MultithreadingDemo t2=new MultithreadingDemo("cv");
		 MultithreadingDemo t3=new MultithreadingDemo("er");
		 MultithreadingDemo t4=new MultithreadingDemo("lm");
			t1.start();
			t2.start();
			t3.start();
			t4.start();
		}
}

