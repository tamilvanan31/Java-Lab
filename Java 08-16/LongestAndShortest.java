import java.util.Scanner;
import java.util.Arrays;
public class LongestAndShortest{
	public static void main(String[] args){
		int i,num1, num2,n;
		int arr[] = new int[4];
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 4; i+=1){
			arr[i] = sc.nextInt();
		}
		num1 = 0;
		num2 = 0;
		Arrays.sort(arr);
		String s1 = "",s2 = "";
		for(i = 3; i  >= 0 ; i-=1) {
			 s1 = Integer.toString(arr[i]);
			 s2 = s2 + s1;
		}
		num1 = Integer.parseInt(s2);
		System.out.println("Largest number is " + num1);
		String s3 = "",s4 = "";
		for(i = 0; i < 4; i+=1) {
			 s3 = Integer.toString(arr[i]);
			 s4 = s4 + s3;
		}
		num2 = Integer.parseInt(s4);
		System.out.print("Smallest number is " +num2);
	}
}