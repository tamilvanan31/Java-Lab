import java.util.*;
class Customer{
    static int attendees=0;
    int token;
    String name;
    boolean attended;
    Customer(String s,int t){
        name=s;
        token=t;
        attended=false;
    }
    boolean callOrdered(int t){
        if(!this.attended&&this.token==t){
            this.attended=true;
            attendees++;
            return true; 
        } 
        return false;
    }
    boolean callUnordered(int t){
        if(this.attended) 
          return false;
        int x=t,k;
        int[] a1=new int[4];
        for(k=0;k<4;k++){
           a1[k]=x%10;
           x/=10; 
        }
        int[] a2=new int[4];
        x=this.token;
        for(k=0;k<4;k++){
           a2[k]=x%10;
           x/=10; 
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2)){
           this.attended=true;
           attendees++; 
           return true;
        } 
        return false;
    }
    protected void finalize() throws Throwable{
        System.out.println("Customer not attended: "+this);
    }
}
public class bank_tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,t,ch,a,m;
        String s;
        System.out.print("No.of customers: ");
        n=sc.nextInt();
        Customer[] c = new Customer[n];
        System.out.println("Names & Tokens of "+n+" customers:");
        for(i=0;i<n;i++){
            s=sc.next();
            t=sc.nextInt();
            c[i]=new Customer(s,t);
        }
        System.out.print("No.of tokens to be called: ");
        m=sc.nextInt();
        for(i=0;i<m;i++){
            System.out.print("Choice: ");
            ch=sc.nextInt();
            System.out.print("Token: ");
            t=sc.nextInt();
            if(ch==2){
               for(j=0;j<c.length;j++)
                  if(c[j].callOrdered(t))
                    break;
               if(j==c.length)
                 System.out.println("Chances: 0%");
               else{
                 System.out.println("Chances: "+(100.0/n)+"%");
                 n--; 
               }  
            }
            else{
               a=0;
               for(j=0;j<c.length;j++)
                 a+=c[j].callUnordered(t)?1:0;
               if(a>0)
                 System.out.println("Chances: "+((a*100.0)/n)+"%");
               else
                 System.out.println("Chances: 0%");   
               n-=a;  
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
