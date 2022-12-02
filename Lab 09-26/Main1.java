import java.util.Scanner;
interface customerTranscation{
	int arr[] = new int[100];
	int id = 0;
	int n1 = 0;
	int cost = 0;
	String pro[] = new String[100];
	void display();
	int costCalculation(int arr[]);
	void rating();
	void details(int id, String pro[], int arr[], int n1);
	
}
abstract class C1 implements customerTranscation{
	//nan
}
 	class Main1 extends C1{
	public int costCalculation(int amount[]){
		int sum = 0;
		for(int i = 0; i < amount.length; i++){
			sum += amount[i];
		}
		System.out.print("The total amount is " + String.valueOf(sum));
		return sum;
	}
	public void rating(int cost){
		if(cost > 10 && cost <= 80){
			System.out.print("3 Star");
		}
		else if(cost >= 80 && cost <= 150){
			System.out.print("4 star" );
		}
		else if(cost > 150){
			System.out.print("5 Star");
		}
		else{
			System.out.print("Cannot be rated");
		}
	}
	public void details(int id, String pro[], int amount[], int n1){
		System.out.println("Id: " + String.valueOf(id));
		for(int i = 0; i < n1; i++){
			System.out.print("Name: " + pro[i]);
			System.out.print("Amount: " + String.valueOf(amount[i]));
		}
	}
}
public class Main{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Main1 obj = new Main1();
		while(true){
			System.out.print("1. Details\n 2. Exit\nEnter your choice: ");
			int n = sc.nextInt();
			if(n == 1){
				System.out.print("Enter customerId: ");
				int id = sc.nextInt();
				System.out.print("Enter number of products purchased");
				int n1 = sc.nextInt();
				int arr[] = new int[n1];
				String det[] = new String[n1];
				System.out.print("Enter the product names and the amounts: ");
				for(int j = 0; j < n1; j++){
					System.out.print("j + 1");
					det[j] = sc.next();
					arr[j] = sc.nextInt();
				}
				System.out.print("Cost calculation");
				int cost = obj.costCalculation(arr);
				System.out.print("Customer rating");
				obj.rating(cost);
				System.out.print("Product details");
				obj.details(id, det, arr, n1);
			}
			else if(n == 2){
				break;
			}
		}
	}
}
