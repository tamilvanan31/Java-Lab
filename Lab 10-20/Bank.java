import java.io.*;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;
public class Bank{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		Customer[] obj = new Customer[10];
		while(true){
					System.out.print("1. Run\n2. Exit\nEnter choice: ");
					int n = sc.nextInt();
					if(n == 1){
						System.out.print("Customer name: ");
						String name = sc.next();
						System.out.print("Account number: ");
						int accno = sc.nextInt();
						System.out.print("Balance amount: ");
						int balance = sc.nextInt();
						obj[i] = new Customer(name, accno, balance);
						i++;
					}
					else if(n == 2){
						break;
					}
			}
		try{
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			for(int j = 0; j < i; j++){
				out.writeObject(obj[j]);
			}
			out.flush();
			out.close();
			System.out.print("Done\n");
		}
		catch(Exception e){
			System.err.print(e);	
		}
        try{
        	int k = 1;
			ArrayList<Customer> metaData = new ArrayList<>();
			FileInputStream fileInputStream = new FileInputStream("f.txt");
        	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
       		for(int j = 0; j < i;i++){
            	Customer customer = (Customer) objectInputStream.readObject();
           		metaData.add(customer);
           		System.out.println("\nCustomer " + String.valueOf(k) + " details");
            	System.out.print("\nName: "+customer.name);
            	System.out.print("\nAccount Number: "+customer.accno);
            	k++;
           		try{
                	System.out.print("\nBalance: "+customer.balance+"\n");
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