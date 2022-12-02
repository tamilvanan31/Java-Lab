import java.util.Scanner;
public class PlacePlaceValueFace{
	public static void main(String[] args){
		int a, b, c = 1, d, rem, f;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		a = sc.nextInt();
		f = a;
		System.out.print("\nEnter the digit: ");
		b= sc.nextInt();
		while(true){
			rem = a % 10;
			a = a / 10;
			if (rem == b){
				d = c * rem;
				break;
			}
			c = c * 10;
		}
		if (c == 1){
			System.out.println("\nPlace: Ones");
		}
		else if (c == 10){
			System.out.println("Place: Tens");
		}
		else if (c == 100){
			System.out.println("Place: Hundreds");
		}
		System.out.println("Place value: " + d);
		System.out.println("Face value: " + rem);
		
		
	}
}