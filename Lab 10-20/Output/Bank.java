import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Customer implements Serializable{

    private static final long serialVersionUID = 1L;

    String name;
    int mobileNumber;
    transient int balance;

    Customer(String name, int mobile, int balance){
        this.name = name;
        this.mobileNumber = mobile;
        this.balance = balance;
    }

}

public class Bank{
    public static void main(String[] args) throws Exception{
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers: ");
        n = sc.nextInt();
        
        ArrayList<Customer> customers = new ArrayList<>();

        for(int i=0;i<n;i++){
            String name;
            int mobile, balance;
            System.out.print("\nEnter name of the customer: ");
            name = sc.next();
            System.out.print("Enter mobile number of customer: ");
            mobile = sc.nextInt();
            System.out.print("Enter balance of the customer: ");
            balance = sc.nextInt();
            Customer customer = new Customer(name, mobile, balance);
            customers.add(customer);
        }

        File file = new File("customers.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        for(int i=0;i<n;i++){
            objectOutputStream.writeObject(customers.get(i));
        }

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ArrayList<Customer> metaData = new ArrayList<>();
        System.out.println("\nCustomer details:");
        for(int i=0;i<n;i++){
            Customer customer = (Customer) objectInputStream.readObject();
            metaData.add(customer);
            System.out.print("\nCustomer name: "+customer.name);
            System.out.print("\nCustomer mobile: "+customer.mobileNumber);
            try{
                System.out.print("\nCustomer balance: "+customer.balance+"\n");
            }
            catch(Exception e){
                System.out.print(e+"\n");
            }
        }

        objectInputStream.close();
        fileInputStream.close();
        sc.close();
    }
}