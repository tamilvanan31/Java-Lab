import java.util.Scanner;
public class Str{
	public static void main(String... args){
		int c1 =0;
		int c2 = 0;
		int j = 0;
		int m = 0;
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();
		StringBuffer bf = new StringBuffer(ip);
		int[] arr = new int[ip.length()];
		for(int i = 0; i < ip.length(); i++){
			if(ip.charAt(i) == '0' && i != (ip.length())){
				c1 ++;
				c2 ++;
			}
			else if(ip.charAt(i) != '0' || i == (ip.length() - 1) ){
				if(c1 >= 3){
					arr[j] = c1;
					c1 = 0;
					j++;
					bf.replace(m ,i,"");
					m = i + 1;
				}
				else{
					c1 = 0;
					m = i + 1;
				}
			}
		}
		for(int k = 0; k < j; k++){
          System.out.println("For " + String.valueOf(k + 1) + " th occurance The number of zeros are "  + String.valueOf(arr[k]) +  " zeros");
    	}
    	System.out.println("The total number of zeros in the given string are " + String.valueOf(c2));
    	System.out.println("The string after removing zeros is " + bf);
 	}
}