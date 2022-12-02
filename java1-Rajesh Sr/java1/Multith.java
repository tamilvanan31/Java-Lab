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
            for(int i=0;i<5;i++){
            System.out.println (s+" is running");
		if(i==4)
		{	
			System.out.println("The winner is "+s);
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
class Multith {  
    
    public static void main(String[] args) { 
        
        MultithreadingDemo object1 = new MultithreadingDemo("Aswin");
        MultithreadingDemo object2 = new MultithreadingDemo("rajesh");
        MultithreadingDemo object3 = new MultithreadingDemo("mani");
        MultithreadingDemo object4 = new MultithreadingDemo("saravanan");
        MultithreadingDemo object5 = new MultithreadingDemo("yuvaraj");
        MultithreadingDemo object6 = new MultithreadingDemo("muthu");
            object1.start();
            object2.start();
            object3.start();
            object4.start();
            object5.start();
            object6.start();
            }
    
}