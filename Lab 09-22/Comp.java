//compare cases
import java.util.Scanner;
public class Comp{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.next();
        System.out.print("Enter the second string: ");
        String s2 = sc.next();
        String s3 = "";
        s3 = s3 + s1.substring(0,3) + s2.substring(s2.length() - 2, s2.length());
        System.out.println(s3);
        System.out.println("\nComparison with string 2\n");
        System.out.println("String 3 equals  String 2: " + s3.equals(s2));
        System.out.println("String 3 equalsIgnoreCase  String 2: " + s3.equalsIgnoreCase(s2));
        System.out.println("String 3 compareTo  String 2: " + String.valueOf(s3.compareTo(s2)));
        System.out.println("String 3 compareToIgnoreCase  String 2: " + String.valueOf(s3.compareToIgnoreCase(s2)));
        System.out.println("\nComparison with string 1\n");
        System.out.println("String 3 equals  String 1: " + s3.equals(s1));
        System.out.println("String 3 equalsIgnoreCase  String 1: " + s3.equalsIgnoreCase(s1));
        System.out.println("String 3 compareTo  String 1: " + String.valueOf(s3.compareTo(s1)));
        System.out.println("String 3 compareToIgnoreCase  String 1: " + String.valueOf(s3.compareToIgnoreCase(s1)));
    }
}