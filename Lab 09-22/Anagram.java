import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
    static boolean check(Character[] c1, Character[] c2, int n){
        for(int i = 0; i < n; i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }   
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: ");
        String s1 = sc.next();
        System.out.print("Anagram: ");
        String s2 = sc.next();
        if(s1.length() != s2.length()){
            System.out.println("Cannot be compared...");
            System.exit(0);
        }
        Character temp1[] = new Character[s1.length()]; 
        for (int i = 0; i < s1.length(); i++) { 
            temp1[i] = s1.charAt(i); 
        }
        Character temp2[] = new Character[s2.length()]; 
        for (int i = 0; i < s2.length(); i++) { 
            temp2[i] = s2.charAt(i); 
        }
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if(check(temp1,temp2,s1.length())){
            System.out.println("It matches");
        }
        else{
            System.out.println("It doesn't matches");
        }
    }
}