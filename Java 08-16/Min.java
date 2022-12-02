import java.util.Scanner;
public class Min{
public static void main(String[] args){
	int[] coins = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
	int[] notes = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the amount: ");
	int amount = sc.nextInt();
	while (amount > 0){
		for(i = 0; i<coins.length; i++){
	   	  if(amount - coins[i] >= 0){
			notes[i] += 1;
			amount -= coins[i];
			break;
	           }
	        }
         }
	System.out.println("Minimum number of currency for the given number is/are ");
	int s = 0;	
	for(i = 0; i < coins.length; i++){
   		s = s + notes[i];
 	}
	System.out.print(s);
    }
}