import java.io.*;
import java.util.Scanner;
public class Bank{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		Bank[] obj = new Bank[10];
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
						obj[i] = new Bank(name, accno, balance);
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
	}
}