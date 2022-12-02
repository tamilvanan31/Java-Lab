import java.util.Scanner;
interface fullTime{
	String name = "";
	int reg = 0;
	int[] arr = new int[10];
	int marks = 0;
	int computefulltime(int arr[]);
}
interface partTime{
	String name = "";
	int reg = 0;
	int[] arr = new int[10];
	int computeparttime(int arr[]);	
}
class Student implements fullTime,partTime {
	@Override
	public int computefulltime(int arr[]){
		int marks = 0;
		for(int i = 0; i < arr.length; i++){
			marks += arr[i];
		}
		return marks/5;
	}
	@Override
	public int computeparttime(int arr[]){
		int marks = 0;
		for(int i = 0; i < arr.length; i++){
			marks += arr[i];
		}
		return marks/3;
	}
}
class Ug extends Student{
	public int computefulltime(int[] arr){
		int marks = 0;
		for(int i = 0; i < arr.length; i++){
			marks += arr[i];
		}
		return marks/5;
	}
	public int computeparttime(int[] arr){
		int marks = 0;
		for(int i = 0; i < arr.length; i++){
			marks += arr[i];
		}
		return marks/5;
	}
	void result(int res){
		int marks = res;
		if(marks >= 50 && marks <= 60){
			System.out.print("B");
		}
		else if(marks >= 61 && marks <= 70){
			System.out.print("B+");
		}
		else if(marks >= 71 && marks <= 80){
			System.out.print("A");
		}
		else if(marks >= 81 && marks <= 90){
			System.out.print("A+");
		}
		else if(marks >= 91){
			System.out.print("O");
		}
		else{
			System.out.print("Below average");	
		}
	}
	
}
class Pg extends Student{
	public int computefulltime(int arr[]){
		int marks = 0;
		for(int i = 0; i < arr.length; i++){
			marks += arr[i];
		}
		return marks/3;
	}
	public int computeparttime(int arr[]){
		int marks = 0;
		for(int i = 0; i < arr.length; i++){
			marks += arr[i];
		}
		return marks/3;
	}
	void result(int res){
		int marks = res;
		if(marks >= 50 && marks <= 60){
			System.out.print("B");
		}
		else if(marks >= 61 && marks <= 70){
			System.out.print("B+");
		}
		else if(marks >= 71 && marks <= 80){
			System.out.print("A");
		}
		else if(marks >= 81 && marks <= 90){
			System.out.print("A+");
		}
		else if(marks >= 91){
			System.out.print("O");
		}
		else{
			System.out.print("Below average");	
		}
	}
}
public class Compute{
	public static void main(String... arrgs){
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true){
			System.out.print("1. Compute\n2. Exit\nEnter choice: ");
			choice = sc.nextInt();
			if(choice == 1){
				System.out.print("Enter name: ");
				String name = sc.next();
				System.out.print("Enter roll number: ");
				int reg = sc.nextInt();
				System.out.print("Full Time (0) or Part Time (1): ");
				int c = sc.nextInt();
				if(c == 0){
					System.out.print("Ug (0) or Pg (1): ");
					int n = sc.nextInt();
					if(n == 0){
						int[] arr = new int[5];
						for(int i = 0; i < 5; i++){
						System.out.print("Subject " + String.valueOf(i + 1) + ": ");
							arr[i] = sc.nextInt();
						}
						Ug obj = new Ug();
						int res = obj.computefulltime(arr);
						System.out.print("Grade obtained: ");
						obj.result(res);
					}
					else if(n == 1){
						int[] arr = new int[3];
						for(int i = 0; i < 3; i++){
						System.out.print("Subject " + String.valueOf(i + 1) + ": ");
							arr[i] = sc.nextInt();
						}
						Pg obj = new Pg();
						int res = obj.computefulltime(arr);
						System.out.print("Grade obtained: ");
						obj.result(res);
					}
				}
				else if (c == 1){
					System.out.print("Ug (0) or Pg (1): ");
					int n = sc.nextInt();
					if(n == 0){
						int[] arr = new int[5];
						for(int i = 0; i < 5; i++){
						System.out.print("Subject " + String.valueOf(i + 1) + ": ");
							arr[i] = sc.nextInt();
						}
						Ug obj = new Ug();
						int res = obj.computeparttime(arr);
						System.out.print("Grade obtained: ");
						obj.result(res);
					}
					else if(n == 1){
						int[] arr = new int[3];
						for(int i = 0; i < 5; i++){
						System.out.print("Subject " + String.valueOf(i + 1) + ": ");
							arr[i] = sc.nextInt();
						}
						Pg obj = new Pg();
						int res = obj.computeparttime(arr);
						System.out.print("Grade obtained: ");
						obj.result(res);
					}
				}
			}
			else if(choice == 2){
				break;
			}
		}
	}
}