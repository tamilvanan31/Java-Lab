//compare lexicographically
import java.util.Scanner;
public class Comp3{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String msg1=obj.nextLine();
        System.out.print("Enter the second string: ");
        String msg2=obj.nextLine();
        if(msg1.compareTo(msg2)==0)
         System.out.println("The strings are lexicographically equal");
        else
            System.out.println("The strings are not lexicographically equal");    
    }  
}