#Minimum coin change problem
import java.io.*; 
import java.util.Scanner;
class Coin { 
	static int minCoins(int coins[], int m, int V) { 
		int table[] = new int[V + 1];  
		table[0] = 0; 
		for (int i = 1; i <= V; i++) 
			table[i] = Integer.MAX_VALUE;
		for (int i = 1; i <= V; i++) { 
			for (int j = 0; j < m; j++) 
			if (coins[j] <= i) { 
				int sub_res = table[i - coins[j]]; 
				if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i]) 
					table[i] = sub_res + 1; 		
			} 
		} 
		return table[V]; 
	}  
	public static void main (String[] args) { 
		int coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000}; #all possible indian currency
		Scanner sc = new Scanner(System.in);
		int m = coins.length;
		System.out.print("\nEnter the amount: "); 
		int V = sc.nextInt(); 
		System.out.println ( "Minimum number of currency notes required: " +  minCoins(coins, m, V)); 
	} 
} 