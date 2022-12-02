import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []args){
     int q,i,j,k;
        Scanner sca=new Scanner(System.in);
        q=sca.nextInt();
        int a[];
        a=new int[q];
        int b[];
        b=new int[q];
        int n[];
        n=new int[q];
        int s[];
        s=new int[q];
        for(i=0;i<q;i++)
        {
            a[i]=sca.nextInt();
            b[i]=sca.nextInt();
            n[i]=sca.nextInt();
        }
        for(i=0;i<q;i++)
        {
            for(j=0;j<n[i];j++)
            {
                   s[j]=a[i];
                    for(k=0;k<=j;k++)
                    {
                        s[j]=s[j]+(int)Math.pow(2,k);
                    }
            }
        }
        k=0;
        for(i=0;i<q;i++)
        {
            
           for(j=0;j<n[i];j++,k++)
           {
                System.out.printf("%d ",s[k]);
           }
             System.out.printf("%n");
        }
    }
}
