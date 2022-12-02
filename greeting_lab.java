import java.util.Scanner;
public class greeting{
		static int n;
		static String[] stud = new String[100];
		static int[] arr = new int[100];
	public static int find(String str,String main){
		String[] strgs = {"i","I","we","you","he","she","it","they"};
		for(int i =0;i<strgs.length;i++){
			if(strgs[i].equals(str)){
				int startingPosition = main.indexOf(str);
    			int endingPosition = startingPosition + str.length() -1;
    			System.out.println("\n" + str + ": Start position=" + startingPosition + " End position=" + endingPosition + "\n");
				return 1;
			}	
		}
		return 0;
	}

	public static void main(String... string){
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of students:");
		n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("Enter the Name: ");
			stud[i] = sc.next();
			System.out.print("Enter the Roll number: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("\n");
		for(int i=0;i<n;i++){
			System.out.println("\n");
			System.out.println("Name: " + stud[i]);
			System.out.println("Roll Number: " + arr[i]);
		}
		String str = "I welcome you all to Java Lab Session";
		System.out.println("The greeting message is " + "\"" + str + "\"\n");
		String[] strs = str.split(" ");
		for(int i=0;i<strs.length;i++){
			if(find(strs[i],str) != 0){
				count++;
			}
		}
		System.out.println("\nThe number of subjective pronouns present is/are "+count);

	}
	
}