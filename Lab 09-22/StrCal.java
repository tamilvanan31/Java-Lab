import java.util.Scanner;
public class StrCal{
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String in;
        int c = 0;
        System.out.print("Enter the string: ");
        in = sc.nextLine();
        int count = 0, l_c = 0, t_c = 0;
        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i) == '0'){
                c ++;
            }
        }
        for(int i = 2; i < in.length(); i++) {
            if(in.charAt(i) == '0' && in.charAt(i - 1) == '0' && in.charAt(i - 2) == '0') {
                count++;
            }
        }
        for(int i = 0; i < in.length(); i++) {
            if(in.charAt(i) == '1') {
                break;
            }
            l_c++;
        }
        for(int j = in.length() - 1; j >= 0; j--) {
            if(in.charAt(j) == '1') {
                break;
            }
            t_c++;
        }
        System.out.println("The total number of zeros are " + String.valueOf(c));
        System.out.println("Count of occurrences of 3 consecutive zeros: " + count);
        System.out.println("Number of Leading zeros : " + l_c);
        System.out.println("Number of Trailing zeros: " + t_c);
        StringBuffer s = new StringBuffer(in);
        System.out.println("The input string with no leading and trailing 0s: " + s.delete(0, l_c).delete(s.length() - t_c, s.length()));
        sc.close();
    }    
}