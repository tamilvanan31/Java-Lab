import java.util.Scanner;
class Encryp{
	int len;
	String string;
	Encryp(){
		this("HAI",3);			// for chaining purpose.
	}
	Encryp(String str, int length){
		string = str;
		len = length;
	}
	Encryp(Encryp str){			// copy constructor
		System.out.println(" ");	
		for(int i=0;i<str.len;i++){
			char chr = str.string.charAt(i);
			int z = (int) chr; z %= 10;
			switch (z){
				case 1					System.out.print('A');
					break;
				case 2:
					System.out.print('B');
					break;
				case 3:
					System.out.print('C');
					break;
				case 4:
					System.out.print('D');
					break;
				case 5:
					System.out.print('E');
					break;
				case 6:
					System.out.print('F');
					break;
				case 7:
					System.out.print('G');
					break;
				case 8:
					System.out.print('H');
					break;
				case 9:
					System.out.print('I');
					break;
				case 0:
					System.out.print('Z');
					break;
			}
		}
		System.out.println(" ");

	}
}
public class Encryption{
	private static boolean isUp(String ip){
		for(int i=0;i<ip.length();i++){
			if(!Character.isUpperCase(ip.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		String ip;
		while(true){
			System.out.print("\nEnter the text: ");
			ip = sc.next();
			if (isUp(ip)){
				Encryp obj1 = new Encryp(ip,ip.length());
				Encryp obj2 = new Encryp(obj1);
				break;	
			}
		else{
				System.out.println("\nEnter uppercase string...");
			}
		}
		
	}
}