import java.util.Scanner;
interface customerTranscation{
	int arr[] = new int[100];
	int id = 0;
	int n1 = 0;
	int cost = 0;
	String pro[] = new String[100];
	int costCalculation(int arr[]);
	void rating();
	void details(int id, String pro[], int arr[], int n1);
	
}
public class Main{
	//@Override
	public int costCalculation(int amount[]){
		int sum = 0;
		for(int i = 0; i < amount.length; i++){
			sum += amount[i];
		}
		System.out.println("\nThe total amount is " + String.valueOf(sum));
		return sum;
	}
	//@Override
	public void rating(int cost){
		System.out.print("Rating: ");
		if(cost > 10 && cost <= 80){
			System.out.print("3 Star");
		}
		else if(cost >= 80 && cost <= 150){
			System.out.print("4 star\n" );
		}
		else if(cost > 150){
			System.out.print("5 Star\n");
		}
		else{
			System.out.print("Cannot be rated\n");
		}
	}
	//@Override
	public void details(int id, String pro[], int amount[], int n1){
		System.out.println("Id: " + String.valueOf(id));
		for(int i = 0; i < n1; i++){
			System.out.println("Name: " + pro[i]);
			System.out.println("Amount: " + String.valueOf(amount[i]));
			System.out.println("\n");
		}
	}
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Main obj = new Main();
		while(true){
			System.out.print("1. Run\n2. Exit\nEnter your choice: ");
			int n = sc.nextInt();
			if(n == 1){
				System.out.print("Enter customerId: ");
				int id = sc.nextInt();
				System.out.print("Enter number of products purchased: ");
				int n1 = sc.nextInt();
				int arr[] = new int[n1];
				String det[] = new String[n1];
				//System.out.print("Enter the product names and the amounts\n");
				for(int j = 0; j < n1; j++){
					System.out.print(String.valueOf(j + 1) + "\n");
					System.out.print("Name of the product: ");
					det[j] = sc.next();
					System.out.print("Price: ");
					arr[j] = sc.nextInt();
				}
				System.out.print("\nCost calculation\n");
				int cost = obj.costCalculation(arr);
				System.out.print("\n\nCustomer rating\n\n");
				obj.rating(cost);
				System.out.print("\n\nProduct details\n\n");
				obj.details(id, det, arr, n1);
			}
			else if(n == 2){
				break;
			}
		}
	}
}
