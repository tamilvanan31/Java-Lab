import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;
public class Client {
	 static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) throws Exception{
	 System.out.print("\n\nEnter the string to search for numbers : ");
	 String s = sc.nextLine();
	 Registry reg = LocateRegistry.getRegistry(null);
	 RemoteInterface stub = (RemoteInterface) reg.lookup("RemoteInterface");
	 int[] ans = stub.findNumbers(s);
	 int i = 0;
	 while(ans[i] != -1){
		 System.out.println("" + (i + 1) + " Number : " + ans[i]);
		 i++;
	 }
	 if(i == 0)
	 System.out.println("No Numbers Found!");
	 System.out.print("\n\n");
	 }
}