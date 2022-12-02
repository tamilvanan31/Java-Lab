import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Two{
	public static void main(String[] args){
		int i,num1, num2,n;
		int arr[];
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < 4; i+=1){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		num1 = arr[0];
		for(i = 3; i >= 0; i -= 1 ){
			num1 = num1 * 10 + arr[i];
		}
		System.out.print(num1);
	}
}