import java.util.*;

public class Bowl{

    public static void sortfunc(int arr[][])
    {
        Arrays.sort(arr,new Comparator<int[]>() {
            public int compare(final int[] a,final int[] b){
                if(a[0]==b[0]){
                    if(a[1]>b[1]) return 1;
                    else return -1;
                }
                else if(a[0]>b[0]) return 1;
                else return -1;
            }
        });
    }

    public static void main(String... args){
        int n,i,j,mx=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of bowls in the bakery: ");
        n=sc.nextInt();
        if(n>0) mx=1;
        int [][] bowls=new int[n][2];
        System.out.println("Enter the shape of the bowls in the bakery: ");
        for(i=0;i<n;i++)
        {
            bowls[i][0]=sc.nextInt(); 
            bowls[i][1]=sc.nextInt();
        }
        sortfunc(bowls);
        for(i=0;i<n;i++)
            System.out.println("[" + bowls[i][0] + "," + bowls[i][1] + ")");
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(bowls[i][0]<bowls[j][0] && bowls[i][1]<bowls[j][1])
                    dp[j]=Math.max(dp[j],dp[i]+1);
            }
            mx=Math.max(dp[i],mx);
        }
        System.out.println("The maximum number of bowls that could be placed inside another bowl is: " + mx);
    }
}