import java.util.Scanner;
interface accessories{
	String name[] = new String[100];
	int[] cost = new int[100];	
	void discount(int cost[]);
}
class Product{
	String name[];
	int cost[];
	int len;
	protected static int totalcost = 0;
	Product(String[] name, int[] cost, int len){
		for(int i=0;i<len;i++){
         	this.name[i] = name[i];
         }
		for(int i=0;i<len;i++){
         	this.cost[i] = cost[i];
		}
	}
	void details(String name[], int cost[], int len){
		System.out.print("Customer Details\n");
		for(int i = 0; i < len; i++){
			System.out.print("Name: " + this.name[i] + "\n");
			System.out.print("Cost: " + this.cost[i] + "\n");
		}
	}
	int total(int[] cost, int len){
		for(int i=0;i<len;i++){
         	totalcost += cost[i];
		}
		return totalcost;
	}
	void discount(int amt){
		System.out.print("You are offered 10% discount. Amount to be paid is " + String.valueOf(amt - amt*0.1));
	}
}
class Food extends Product{
	String name[];
	int cost[];
	int len;
	protected static int totalcost = 0;
	Food(String[] name, int[] cost, int len){
		for(int i=0;i<len;i++){
         	this.name[i] = name[i];
         }
		for(int i=0;i<len;i++){
         	this.cost[i] = cost[i];
		}
	}
	void details(String name[], int cost[], int len){
		System.out.print("Customer Details\n");
		for(int i = 0; i < len; i++){
			System.out.print("Name: " + this.name[i] + "\n");
			System.out.print("Cost: " + this.cost[i] + "\n");
		}
	}
	int total(int[] cost, int len){
		for(int i=0;i<len;i++){
         	totalcost += cost[i];
		}
		return totalcost;
	}
	void discount(int amt){
		System.out.print("You are offered 10% discount. Amount to be paid is " + String.valueOf(amt - amt*0.1));
	}
}
class Cosmetics extends Product{
	String name[];
	int cost[];
	int len;
	protected static int totalcost = 0;
	Cosmetics(String[] name, int[] cost, int len){
		for(int i=0;i<len;i++){
         	this.name[i] = name[i];
         }
		for(int i=0;i<len;i++){
         	this.cost[i] = cost[i];
		}
	}
	void details(String name[], int cost[], int len){
		System.out.print("Customer Details\n");
		for(int i = 0; i < len; i++){
			System.out.print("Name: " + this.name[i] + "\n");
			System.out.print("Cost: " + this.cost[i] + "\n");
		}
	}
	int total(int[] cost, int len){
		for(int i=0;i<len;i++){
         	totalcost += cost[i];
		}
		return totalcost;
	}
	void discount(int amt){
		System.out.print("You are offered 10% discount. Amount to be paid is " + String.valueOf(amt - amt*0.1));
	}
}
class Toys extends Product {
	String name[];
	int cost[];
	int len;
	protected static int totalcost = 0;
	Toys(String[] name, int[] cost, int len){
		for(int i=0;i<len;i++){
         	this.name[i] = name[i];
         }
		for(int i=0;i<len;i++){
         	this.cost[i] = cost[i];
		}
	}
	void details(String name[], int cost[], int len){
		System.out.print("Customer Details\n");
		for(int i = 0; i < len; i++){
			System.out.print("Name: " + this.name[i] + "\n");
			System.out.print("Cost: " + this.cost[i] + "\n");
		}
	}
	int total(int[] cost, int len){
		for(int i=0;i<len;i++){
         	totalcost += cost[i];
		}
		return totalcost;
	}
	void discount(int amt){
		System.out.print("You are offered 10% discount. Amount to be paid is " + String.valueOf(amt - amt*0.1));
	}
}
public class Customer{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Product obj[] = new Product[10];
		Food obj1[] = new Food[10];
		Cosmetics obj2[] = new Cosmetics[10];
		Toys obj3 = new Toys[10];
		while(true){
			System.out.print("1. Purchase\n2. Exit\nEnter your choice: ");
			int n = sc.nextInt();
			if(n == 1){
				System.out.print("Enter customer name: ");
				String name = sc.next();
				System.out.print("Enter the no of products to be purchased: ");
				int n1 = sc.nextInt();
				int cost[] = new int[10];
				String proname[] = new String[10];
				int ct = 0;
				for(int k = 0; k < n1; k++){
					System.out.print("Enter product name: ");
					proname[ct] = sc.next();
					System.out.print("Enter cost ");
					cost[ct] = sc.nextInt();
				}
				obj1[ct] = new Food(proname, cost, n1);
				obj1[ct].details(proname, cost, n1);
			}
		}
	}
}