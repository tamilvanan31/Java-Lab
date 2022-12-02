import java.util.Scanner;
interface customerTransaction{
	int arr[] = new int[100];
	int id = 0;
	int n1 = 0;
	int cost = 0;
	double a = 0.0;
	String pro[] = new String[100];
	void costCalculation(int arr[]);
	void details(int id, String pro[], int arr[], int n1, int cost);
	double rating();
	void transactionDetails(int arr[], double a);
}
class goodCustomer implements customerTransaction{
	public int cost = 0;
	public void costCalculation(int amount[]){
		for(int i = 0; i < amount.length; i++){
			cost += amount[i];
		}
	}
	public void details(int id, String pro[], int amount[], int n1, int cost){
		System.out.println("Id: " + String.valueOf(id));
		for(int i = 0; i < n1; i++){
			System.out.println("Name: " + pro[i]);
			System.out.println("Amount: " + String.valueOf(amount[i]));
			System.out.println("\n");
		}
	}
	public double rating(){
		return 0.25;
	}
	public void transactionDetails(int amount[],double a){
		int cost = 0;
		for(int i = 0; i < amount.length; i++){
			cost += amount[i];
		}
		System.out.println("Actual amount to be paid is Rs." + String.valueOf(cost));
		System.out.println("You\'re offered with a 25% Discount. So that you can pay Rs." + String.valueOf(cost - cost * a) + "\n");
	}
}
class moderateCustomer implements customerTransaction{
	int cost = 0;
	public void costCalculation(int amount[]){
		for(int i = 0; i < amount.length; i++){
			cost += amount[i];
		}
	}
	public void details(int id, String pro[], int amount[], int n1, int cost){
		System.out.println("Id: " + String.valueOf(id));
		for(int i = 0; i < n1; i++){
			System.out.println("Name: " + pro[i]);
			System.out.println("Amount: " + String.valueOf(amount[i]));
			System.out.println("\n");
		}
	}
	public double rating(){
		return 0.10;
	}
	public void transactionDetails(int amount[], double a){
		int cost = 0;
		for(int i = 0; i < amount.length; i++){
			cost += amount[i];
		}
		System.out.println("Actual amount to be paid is Rs." + String.valueOf(cost));
		System.out.println("You\'re offered with a 10% Discount. So that you can pay Rs." + String.valueOf(cost - cost * a) + "\n");
	}
}
class neglectedCustomer implements customerTransaction{
	int cost = 0;
	public void costCalculation(int amount[]){
		for(int i = 0; i < amount.length; i++){
			cost += amount[i];
		}
	}
	public void details(int id, String pro[], int amount[], int n1, int cost){
		System.out.println("Id: " + String.valueOf(id));
		for(int i = 0; i < n1; i++){
			System.out.println("Name: " + pro[i]);
			System.out.println("Amount: " + String.valueOf(amount[i]));
			System.out.println("\n");
		}
		for(int i = 0; i < amount.length; i++){
			cost += amount[i];
		}
	}
	public double rating(){
		return 1.00;
	}
	public void transactionDetails(int amount[], double a){
		int cost = 0;
		for(int i = 0; i < amount.length; i++){
			cost += amount[i];
		}
		System.out.println("Amount to be paid is Rs." + String.valueOf(cost * a) + "\n");
	}
}
public class Customer{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Customer obj = new Customer();
		while(true){
			System.out.print("\n1. Purchase\n2. Exit\nEnter your choice: ");
			int n = sc.nextInt();
			if(n == 1){
				System.out.print("Enter customerId: ");
				int id = sc.nextInt();
				System.out.print("Enter number of products purchased: ");
				int n1 = sc.nextInt();
				int arr[] = new int[n1];
				String det[] = new String[n1];
				for(int j = 0; j < n1; j++){
					System.out.print(String.valueOf(j + 1) + "\n");
					System.out.print("Name of the product: ");
					det[j] = sc.next();
					System.out.print("Price: ");
					arr[j] = sc.nextInt();
				}
				int cost = 0;
				for(int k = 0; k < n1; k++){
					cost += arr[k];
				}
				if(cost >= 0 && cost <= 80){
					neglectedCustomer obj1 = new neglectedCustomer();
					obj1.costCalculation(arr);
					System.out.println("\n\nProduct Details");
					obj1.details(id, det, arr, n1, cost);
					System.out.println("Tracnsaction Details");
					double a = obj1.rating();
					obj1.transactionDetails(arr, a);
				}
				else if(cost >= 80 && cost <= 150)		{
					moderateCustomer obj1 = new moderateCustomer();
					obj1.costCalculation(arr);
					System.out.println("\n\nProduct Details");
					obj1.details(id, det, arr, n1, cost);
					System.out.println("Tracnsaction Details");
					double a = obj1.rating();
					obj1.transactionDetails(arr, a);
				}	
				else if(cost > 150){
					goodCustomer obj1 = new goodCustomer();
					obj1.costCalculation(arr);
					System.out.println("\n\nProduct Details");
					obj1.details(id, det, arr, n1, cost);
					System.out.println("Tracnsaction Details");
					double a = obj1.rating();
					obj1.transactionDetails(arr, a);
				}
				else{
					System.out.print("Cannot be displayed\n");
				}
			}
			else if(n == 2){
				break;
			}
		}
	}
}
