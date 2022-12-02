import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Server{
	 public static void main(String[] args) throws Exception{
		 RemoteClass obj = new RemoteClass();
		 RemoteInterface stub = (RemoteInterface) UnicastRemoteObject.exportObject(obj, 0);
		 Registry reg = LocateRegistry.getRegistry();
		 reg.bind("RemoteInterface", stub);
	 }
}
class RemoteClass implements RemoteInterface{
	 public int[] findNumbers(String input) throws Exception{
		 int[] ans = new int[20];
		 int index = 0;
		 String temp = "";
		 for(int i = 0;i < input.length(); i++){
			 char now = input.charAt(i);
			 if(isNumber(now))
			 	temp += now;
			 else if(temp.length() > 0){
				 ans[index++] = Integer.parseInt(temp);
				 temp = "";
			 }
		 }

		 ans[index++] = -1;
		 return ans;
		 }
		 boolean isNumber(char x){
		 return (x >= '0' && x <= '9');
	 }
}