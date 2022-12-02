import java.util.Scanner;
class MyException extends Exception{
	String s1;
	MyException(String s){
		s1 = s;
	}
	public String toString(){
		return s1;
	}
}
public class Customer{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int acc[] = new int[100];
		String name[] = new String[100];
		int bal[] = new int[100];
		int i = 0;
		while(true){
			System.out.print("1. Register\n2. Balance\n3. Credit amount\n4. Debit amount\n5.Exit\nEnter choice: ");
			int n = sc.nextInt();
			if(n == 1){
				System.out.print("Enter name: ");
				name[i] = sc.next();
				System.out.print("Enter Account number: ");
				acc[i] = sc.nextInt();
				System.out.print("Enter initial amount: ");
				bal[i] = sc.nextInt();
				i++;
			}
			else if(n == 2){
				System.out.print("Enter Account Number: ");
				int num = sc.nextInt();
				int j = 0;
				while(true){
					if(acc[j] == num){
						if(bal[j] < 3000){
							try{
								MyException obj = new MyException("Low Balance");
								throw obj;
							}
							catch(Exception e){
								System.out.print(e);
							}
							break ;
						}
						else{
							System.out.print("Balance: " + bal[j]);
							break ;
						}
					}
					else{
						j++;
					}
				}
				System.out.print("\n");
			}
			else if(n == 3){
				System.out.print("Enter Account Number: ");
				int num = sc.nextInt();
				int j = 0;
				while(true){
					if(acc[j] == num){
						System.out.print("Enter amount: ");
						int amt = sc.nextInt();
						if(amt > 5000){
							try{
								MyException obj = new MyException("Credit amount exceeded");
								throw obj;
							}
							catch(Exception e){
								System.out.print(e);
							}
							break ;
						}
						else{
							bal[j] += amt;
							break ;
						}
					}
					else{
						j++;
					}
				}
				System.out.print("\n");
			}
			else if(n == 4){
				System.out.print("Enter Account Number: ");
				int num = sc.nextInt();
				int j = 0;
				while(true){
					if(acc[j] == num){
						System.out.print("Enter amount: ");
						int amt = sc.nextInt();
						if(amt > 1000){
							try{
								MyException obj = new MyException("Debit amount exceeded");
								throw obj;
							}
							catch(Exception e){
								System.out.print(e);
							}
							break ;
						}
						else{
							bal[j] -= amt;
							break;
						}
					}
					else{
						j++;
					}
				}
				System.out.print("\n");
			}
			else if(n == 5){
				break;
			}
		}
	}
}