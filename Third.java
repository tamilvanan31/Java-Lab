import java.util.Scanner;
public class Third{
	public static int[] remove(int arr[], int len){
		int i, k;
		int res[] = new int[len];
		for(i = 0, k = 0; i < len ;i ++){
			if(arr[i] % 2 != 0){
				continue;
			}
			res[k ++] = arr[i];
		}
		return res;
	}
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int i, c = 0, k;
		System.out.print("Enter the length of 1st array: ");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		System.out.print("Enter elements: ");
		for(i = 0;i < n1 ;i++){
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the length of 2nd array: ");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		System.out.print("Enter elements: ");
		for(i = 0;i < n2 ;i++){
			arr2[i] = sc.nextInt();
		}
		int[] arr3 = new int[n1 + n2];
		arr1 = remove(arr1, arr1.length);
		for(i = 0; i < arr1.length; i++){
			if(arr1[i] != 0){
				arr3[i] = arr1[i];
				c ++;
			}
		}
		arr2 = remove(arr2, arr2.length);
		for(i = 0, k = c; i < arr2.length; i++){
			if(arr2[i] != 0){
				arr3[k ++] = arr2[i];	
			}
		}
		 
		for(i = 0; i < arr3.length; i++){
			if(arr3[i] != 0){
				System.out.print(arr3[i] + " ");	
			}
		}
		
	}
}