import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
  
        int a,i;
        double d;
      //  String[] s;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        d=sc.nextDouble();
        String[] s=sc.nextLine().split(" ");
        for(i=0;i<s.length;i++)
        System.out.println(s[i]);
        System.out.println(d);
        System.out.println(a);
    }
}
