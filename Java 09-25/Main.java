import java.util.Scanner;
import java.io.*;
class BankTransaction{
	public int customerId;
	public int transactionId;
	public int transcationAmount;
	BankTransaction(int a, int b, int c){
		this.customerId = a;
		this.transactionId = b;
		this.transcationAmount = c;
	}
	@Override
	public boolean equals(Object obj){
		System.out.println("Inside the overridden equals() method, Class name is " + obj.getClass() + " and hashCode is " + obj.hashCode() + "\n");
		if(this == obj){
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()){
			return false;
		}
		BankTransaction bank_obj = (BankTransaction) obj;
		return (bank_obj.customerId == this.customerId && bank_obj.transactionId == this.transactionId && bank_obj.transcationAmount == this.transcationAmount);
	}

}
public class Main{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		BankTransaction obj1 = new BankTransaction(1,32,1000);
		BankTransaction obj2 = new BankTransaction(3,34,2000);
		BankTransaction obj3 = obj2;
		System.out.println("\nComparing object 1 and 2\n");
		if(obj1.equals(obj2)) {
				System.out.println("All the objects are equal");//Both objects pointing same address
		}
		else{
			System.out.println("All the objects are not equal");	
		}
		System.out.println("\nComparing object 2 and 3\n");
		if(obj2.equals(obj3)) {
				System.out.println("All the objects are equal");//Both objects pointing different address
		}
		else{
			System.out.println("All the objects are not equal");	
		}
		System.out.println("\nThe HashCodes for Obj1 is " + obj1.hashCode() + ", Obj2 is " + obj2.hashCode() + " and Obj3: " + obj3.hashCode());
	}
}