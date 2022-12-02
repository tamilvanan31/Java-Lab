import java.util.Scanner;
public class Str{
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
				arr[0] = 1;
				arr[1] = 2;
		for(int i = 2;i < a;i++){
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.print(arr[a - 1]);
	}
}