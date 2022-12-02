import java.util.Scanner;
public class Coins{
	public static void main(String... args){
		int amount;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the amount: ");
		amount = sc.nextInt();
		int coins[] = {2000,500,200,100,50,20,10,5,2,1};
		int i,notes = 0;
		for(i = 0 ; i < 10; i ++){
		    notes += amount / coins[i];
     		    amount %= coins[i];
	    }
		System.out.println("Minimum number of currency notes required: "+ notes);
	}
}