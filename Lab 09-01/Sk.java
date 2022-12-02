import java.util.*;

class stack {

    String[] s;
    int size,top;

   /* public stack(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Stack to be created: ");
        size= sc.nextInt();
        s= new String [size];
        top=0;
    }*/

    public stack(int n){
        size= n;
        s= new String [size];
        top=0;
    }

    public void push(String a){
        try{
            s[top]=a;
            top++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public int empty(){
        if(top<=0) return 1;
        else return 0;
    }

    public String top(){
        if(top<=0){
            System.out.println("The Stack is empty! ");
            String temp="-1";
            return temp;
        }
        else {
            return  s[top-1];
        }
    }

    public void pop(){
        if(top<=0){
            System.out.println("The Stack is empty! ");
        }
        else{
            top--;
        }
    }

}

public class Sk{
    public static void main(String... args)
    {
        int n,i,j;
        String s;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        n=sc.nextInt();
        stack st= new stack(n+1);

        for(i=0;i<n;i++){
            System.out.println("Name :");
            s=Integer.toString(i+1);
            s+=sc.next();
            System.out.println("Roll Number :");
            s+=sc.next();
            st.push(s);
        }

        System.out.println("\nLIFO Order: ");
        while(st.empty()==0){
            System.out.println(st.top());
            st.pop();
        }
    }
}