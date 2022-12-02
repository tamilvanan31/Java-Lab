import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
class customers{
	String name;
	int token,wait = 0;
	static int len = 0;
	static int overflow = 100;
	int[] count;
	float probability_crct,probability_any;
	customers(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Customer Name: ");
		this.name = sc.next();
		System.out.print("Enter the Token number: ");
		this.token = sc.nextInt();
		this.count = new int[10];
		for(int i = 0; i < 10; i++) this.count[i] = 0;
		int temp = this.token;
		while(temp > 0){
			this.count[temp % 10]++;
			temp /= 10;
		}
		this.probability_crct = (float)1/10000;
		this.wait = 0;
		len++;
	}
	customers(int temp){
		this.token = temp;
		this.count = new int[10];
		for(int i = 0;i < 10;i++) this.count[i]=0;
		while(temp>0){
			this.count[temp % 10]++;
			temp /= 10;
		}
		this.probability_crct=(float)1/10000;
		this.wait=0;
		len++;
	}
	void get_anyprob(){
		this.probability_any = 24;
		for(int i = 0;i < 10;i++){
			if(count[i] == 0) continue;
				for(int j = 1;j <= count[i]; j++) this.probability_any /= j;
			}
		this.probability_any /= 10000;
	}
	boolean match(int temp){
		int[] t=new int[10];	
		for(int i = 0; i < 10; i++) t[i]=0;
		while(temp > 0){
			t[temp % 10]++;
			temp /= 10;
		}
		for(int i = 0;i < 10;i++){
			if(t[i] != this.count[i]) return false;
		}
		return true;
	}
	boolean due(){
		this.wait++;
		if(this.wait >= customers.overflow){
			return true;
		}
		return false;
	}
}
public class BankerProb{
	public static void main(String... args){
		Scanner sc= new Scanner(System.in);
		int n,i,j;
		String name;
		System.out.print("Enter the number of the customers in the queue: ");
		n = sc.nextInt();
		customers[] arr = new customers[n];
		for(i = 0; i < n; i++)
			arr[i] = new customers();
		for(i = 0; i < n; i++){
			arr[i].get_anyprob();
			System.out.println("\nCustomer Name: " + arr[i].name + "\nCustomer Token: " + arr[i].token);
			System.out.println("Required Order Probability: " + arr[i].probability_crct + " and Any order Probability: " + arr[i].probability_any);
		}
		System.out.print("\n");
		int trial =  0;
		while(customers.len > 0){
			j = ThreadLocalRandom.current().nextInt();
			if(j < 0) j*=-1;
			j %= 10000;
			trial++;
			for(i=0; i<n; i++){
				if(arr[i]! = null && arr[i].match(j)){
					arr[i] = null;
					System.gc();
					customers.len--;
					break;
				}
			}
		}
	}
}