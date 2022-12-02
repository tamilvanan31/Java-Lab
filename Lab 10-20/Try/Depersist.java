import java.io.*;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
public class Depersist{
	public static void main(String... args){ 
		Scanner scanner = new Scanner(new File("size.txt"));
		scanner.useDelimiter("\\D+");
		int a;
		while(scanner.hasNextInt()){
		   a = scanner.nextInt();
		}
		try{
			ArrayList<Customer> metaData = new ArrayList<>();
			FileInputStream fileInputStream = new FileInputStream("f.txt");
        	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
       		System.out.println("\nCustomer details:");
       		for(int i=0; i < a;i++){
            Customer customer = (Customer) objectInputStream.readObject();
            metaData.add(customer);
            System.out.print("\nCustomer name: "+customer.name);
            System.out.print("\nCustomer mobile: "+customer.accno);
            try{
                System.out.print("\nCustomer balance: "+customer.balance+"\n");
            }
            catch(Exception e){
                System.out.print(e+"\n");
            }
        }
		}
		catch(Exception e){
			System.err.print(e);
		}
	}
}