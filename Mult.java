import java.util.*;

public class Mult{
    public static void main(String args[]){
        int a,b,c,ans;
        int[] prices={2000,100,1000};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the quantity of Bat , Ball and Sports Uniform to be purchased for the Women's team: ");
        a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
        ans=(prices[0]*a)+(prices[1]*b)+(prices[2]*c);
        System.out.println("The total cost of equipments for the women's team is: "+ ans);

        System.out.println("Enter the quantity of Bat , Ball and Sports Uniform to be purchased for the Men's team: ");
        a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
        ans=(prices[0]*a)+(prices[1]*b)+(prices[2]*c);
        System.out.println("The total cost of equipments for the men's team is: "+ ans);
    }
}