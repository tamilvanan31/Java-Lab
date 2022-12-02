import java.util.*;
class Customer{
    static int attendees=0;
    int token;
    boolean attended;
    Customer(int t){
        token=t;
        attended=false;
    }
    protected void finalize() throws Throwable{
        System.out.println("Customer not attended: "+this);
    }
}
public class bank_tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,k,t,ch,a,x;
        int[] a1=new int[4];
        int[] a2=new int[4];
        System.out.print("No.of customers: ");
        n=sc.nextInt();
        Customer[] c = new Customer[n];
        System.out.println("Tokens of "+n+" customers:");
        for(i=0;i<n;i++){
            t=sc.nextInt();
            c[i]=new Customer(t);
        }
        System.out.print("No.of customers to be called: ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print("Choice: ");
            ch=sc.nextInt();
            System.out.print("Token: ");
            t=sc.nextInt();
            if(ch==2){
               for(j=0;j<c.length;j++){
                  if(c[j].token==t&&c[j].attended==false){
                      c[j].attended=true;
                      Customer.attendees++;
                      break;
                  } 
               }
               if(j==c.length)
                 System.out.println("Chances: 0%");
               else
                 System.out.println("Chances: 100%");  
            }
            else{
               a=0; 
               x=t;
               for(k=0;k<4;k++){
                  a1[k]=x%10;
                  x/=10; 
               }
               for(j=0;j<c.length;j++){
                  if(c[j].attended==false){
                      x=c[j].token;
                      for(k=0;k<4;k++){
                         a2[k]=x%10;
                         x/=10; 
                      }
                      Arrays.sort(a1);
                      Arrays.sort(a2);
                      if(Arrays.equals(a1, a2)){
                         a++;
                         c[j].attended=true;
                         Customer.attendees++; 
                      } 
                  }
               }
               if(a>0)
                 System.out.println("Chances: "+(100.0/a)+"%");
               else
                 System.out.println("Chances: 0%");   
            }
        }
        sc.close();
        for(i=0;i<c.length;i++){
           if(!c[i].attended)
             c[i]=null; 
        }
        System.out.println("Customers attended: "+Customer.attendees);
        System.gc();
        System.runFinalization();
    }
}

