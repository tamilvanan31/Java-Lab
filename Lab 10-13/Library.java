import java.util.Scanner;
class Exc extends Exception{
	String s1;
	Exc (String s){
		s1 = s;
	}
	public String toString(){
		return s1;
	}
}
public class Library{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("1. Renewal\n2. Fine Amount\n3. Exit\nEnter choice: ");
			int n = sc.nextInt();
			if(n == 1){
				System.out.print("Enter the current date: ");
				int date = sc.nextInt();
				if((14 - date) < 0){
						try{
							Exc obj = new Exc("Renewal date Exceeded");
							throw obj;
						}
						catch(Exception e){
							System.out.print(e);
						}
						System.out.print("\n");
					}
				else{
					System.out.print("You\'ve " + String.valueOf(14 - date) + " days left.");
					System.out.print("\n");
				}
			}
			else if(n == 2){
				System.out.print("Enter the current date: ");
				int date = sc.nextInt();
				if((14 - date) < 0){
					int fine = (date - 14) * 4;
					if (fine > 20){
						try{
							Exc obj = new Exc("Fine amount Exceeded");
							throw obj;
						}
						catch(Exception e){
							System.out.print(e);
						}
						System.out.print("\n");
					}
				}
				else{
					System.out.print("You\'ve Rs." + String.valueOf(Math.abs((date - 14)*4)) + " fine amount to be paid.");
					System.out.print("\n");
				}
			}
			else if(n == 3){
				break;
			}
		}
	}
}