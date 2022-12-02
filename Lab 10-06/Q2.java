import java.io.*;
public class Q2{
 public static void main(String[] args){
    try{
     String str = "msh";
      System.out.println(str.charAt(5));
    }
    catch(StringIndexOutOfBoundsException e){
      System.out.println(e);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println(e);
    }
    catch(Exception e){
      System.out.println(e);
    }
    // for array
    try{
     int arr[] = {1, 2, 3}; 
      System.out.println(arr[5]);
    }
    catch(StringIndexOutOfBoundsException e){
      System.out.println(e);
    }
    catch(IndexOutOfBoundsException e1){
      System.out.println(e1);
    }
  }
}