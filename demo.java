class Y
{
   
   void X(int i)
    {
        System.out.println("X");
    }
}
 
class  X extends Y
{
   int i=10; 
   int j=5;
    void Y()
    {
        System.out.println("Y");
    }
}
public class demo
{
    public static void main(String[] args)
    {
        Y obj = new Y(5);
        System.out.println(obj.i);
        System.out.println(obj.j); 
             
     }
}
