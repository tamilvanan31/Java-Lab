import java.util.Scanner;
interface accessories{
	String name[] = new String[100];
	int[] cost = new int[100];	
	void discount(int cost[]);
}
class Product{
	String name[];
	int id;
	int[] cost;
	protected static int totalcost = 0;
	Product(String[] name, int[] cost){
		for(int i=0;i<cost.length();i++){
         	this.name[i] = name[i];
		for(int i=0;i<cost.length();i++){
         	this.cost[i] = cost[i];
		}
	}
	public void details(){
		System.out.print("Customer Details\n");
		for(int i = 0; i < cost.length(); i++){
			System.out.print("Name: " + this.name[i] + "\n");
			System.out.print("Id: " + this.id[i] + "\n");
		}
	}
	int total(int[] cost){
		for(int i=0;i<cost.length();i++){
         	totalcost += cost[i];
		}
		return totalcost;
	}
	void discount(int amt){
		System.out.print("You are offered 10% discount. Amount to be paid is " + String.valueOf(amt - amt*0.1));
	}
}
class Food extends Product{
	private static int total = 0;
	Food(String name[], int[] cost){
		super(name, id, cost);
	}
	//@Override
	void details(){
		for(int i = 0; i < cost.length(); i++){
			System.out.print("Name: " + this.name[i] + "\n");
			System.out.print("Id: " + this.id[i] + "\n");
		}
	}
	static int total(int[] cost){
		for(int i=0;i<cost.length();i++){
         	total += cost[i];
		}
		return total;
	}
	void details(int amt){
		super.details();
		System.out.print("You are offered 20% discount. Amount to be paid is " + String.valueOf(amt - amt*0.2));
	}
}
class Cosmetics extends Product{
	private static int total = 0;
	Cosmetics(String name[], int[] cost){
		super(name, id, cost);
	}
	//@Override
	void details(){
		System.out.print("Customer Details\n");
		System.out.print("Name: " + this.name + "\n");
		System.out.print("Id: " + this.id + "\n");
	}
	static int total(int[] cost){
		for(int i=0;i<cost.length();i++){
         	total += cost[i];
		}
		return total;
	}
	void details(int amt){
		System.out.print("Customer Details\n");
		super.details();
		System.out.print("You are offered 15% discount. Amount to be paid is " + String.valueOf(amt - amt*0.15));
	}
}
class Toys extends Product implements accessories{
	private static int total = 0;
	Toys(String name[], int[] cost){
		super(name, id, cost);
	}
	//@Override
	void details(){
		System.out.print("Customer Details\n");
		super.details();
	}
	void discount(int cost[]){
		System.out.print("Customer Details\n");
		System.out.print("Name: " + this.name + "\n");
		System.out.print("Id: " + this.id + "\n");
		for(int i=0;i<cost.length();i++){
         	total += cost[i];
		}
		System.out.print("You are offered 15% discount. Amount to be paid is " + String.valueOf(total - total*0.15));
	}
}
public class SalesReport{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Product obj[] = new Product[10];
		Food obj1[] = new Food[10];
		Cosmetics obj2[] = new Cosmetics[10];
		Toys obj3 = new Toys[10];
		while(1){
			System.out.print("Welcome! what would you like to buy\n1. Food\n2. Cosmetics\n3. Toys\nEnter the choice: ");
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
				obj1[ct] = new Food(proname, cost);
				obj1[ct].details();
			}
		}
	}
}