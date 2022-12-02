import java.util.Scanner;
interface Renewal_date{
	void getDate(int date);
	
}
interface Fine_amount{
	void calculate_fine(int d1);
}
class students implements Renewal_date{
	String name;
	int date;
	int temp;
	public void get(String name, int i_date){
		name = name;
		date = i_date;
		//System.out.println("\nStudent class\n");
	}
	public void getDate(int date){
		date = date + 15;
		if(date + 15 > 30){
			temp = date - 30;
			System.out.println("The renerwal date is " + String.valueOf(temp));
		}
		else{
			temp = date;
			System.out.println("The renerwal date is " + String.valueOf(temp));
		}
	}
	public void display(String name1){
		System.out.println("Name: " + name1);
		System.out.println("Date: " + String.valueOf(date));
		System.out.print("\n");
	}
	public int date(int i_date){
		return temp;
	}
}
class faculty implements Fine_amount{
	int d1;
	public void cal(int i_date){
		this.d1 = i_date;
		//System.out.println("\nFaculty class\n");
	}
	public void calculate_fine(int d1){
		if(d1 > 20){
			System.out.println("Fine applied is Rs." + String.valueOf((d1 - 20)*2));
		}
		else{
			System.out.println("Fine not applied");
		}
	}
	//System.out.print();
}
public class Main1{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		System.out.print("\n");
		int[] arr = new int[n];
		String[] arr1 = new String[n];
		students[] obj1 = new students[n];
		faculty[] obj2 = new faculty[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Enter name: ");
			String name;
			name = sc.next();
			arr1[i] = name;
			System.out.print("Enter issued date: ");
			int i_date;
			i_date = sc.nextInt();
			arr[i] = i_date;
			obj1[i] = new students();
			obj1[i].get(name,i_date);
			obj2[i] = new faculty();
			obj2[i].cal(i_date);
			System.out.print("\n");
		}
		for(int i = 0; i < n; i++){
			obj1[i].display(arr1[i]);
		}
		for(int i = 0; i < n; i++){
			obj2[i].calculate_fine(arr[i]);
		}
	}
}