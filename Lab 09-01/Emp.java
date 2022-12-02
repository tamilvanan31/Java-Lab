import java.util.Scanner;
class Employee{
	int id;
	int score;
	String name;
	Employee(int i, int s){
		id = i;
		score = s;
	}
	static void print(Object[] obj){
		System.out.println("Id: " + obj[0]);
		System.out.println("Score: " + obj[1]);
	}
	static void print(String name){ 	//overloaded method to print string 
		System.out.println("Name: " + name);
	}
}
public class Emp{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int i;
		String res = "";
		System.out.println("Enter number of employees: ");
		int n = sc.nextInt();
		for( i = 0; i < n ;i++){
			System.out.print("Name: ");
			String name = sc.next();
			 System.out.print("Emp Id: ");
			 int id = sc.nextInt();
			 System.out.print("Appraisal Score: ");
			 int score = sc.nextInt();
			 Object[] arr = {id,score}; // object array
			 Employee obj1 = new Employee(id,score);
			 Employee.print(name);
			 Employee.print(arr);
			 System.out.print("\n");
			 
			 if (score >=0 && score <= 5)
			 {
			 	res += "Performance report: " + name +  ": Need improvenemt\n";
			 }
			 else if(score >= 6 && score<= 7){
			 	res += "Performance report: " + name +  ": Better\n";
			 }
			 else{
			 	res += "Performance report: " + name +  ": Outstanding\n";
			 }
		}
			System.out.println("\n" + res);
	}
}