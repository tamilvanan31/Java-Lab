import java.util.Scanner;

public class Exercise{

    static int order = 0;
    //Utility Functions
    static void menu(){
        System.out.println("Students Quiz Enrollment App");
        System.out.println("1.Enroll");
        System.out.println("2.Display Students Enrolled ");
        System.out.println("3.Exit ");

        System.out.print("Enter your choice : ");
    }

    class stack{
    
    final int max = 10;
    private int top;
    private String[] arr;
    stack(){
        arr = new String[max];
        top = -1;
    }
    stack(stack x){

        this();

        stack temp = new stack();

        while(!x.isEmpty()){
            String t = x.top();
            temp.push(t);
            x.pop();
        }

        while(!temp.isEmpty()){
            String t = temp.top();
            this.push(t);
            temp.pop();
        }
        
    }
    boolean isEmpty(){
        return (top == -1);
    }
    boolean isFull(){
        return (top == max - 1);
    }
    boolean push(String val){
        
        if(this.isFull())
            return false;
        
        top++;
        this.arr[top] = val;
        
        return true;
    }
    boolean pop(){
        
        if(this.isEmpty())
            return false;
        
        top--;
        return true;
    }
    
    String top(){
        
        if(isEmpty())
            return "-1";
        
        return arr[top];
    }
}
    

    public static void main(String[] args){
        
        Scanner sc2 = new Scanner(System.in);
        Quiz q = new Quiz();

        while(true){
            System.out.println("\n\n\n");
            menu();
            int choice  = sc2.nextInt();

            if(choice == 3)
                break;
            
            if(choice == 1)
                q.enroll();
            else
                q.print();
        }
    }
}

class Quiz{
    stack s;
    int order;

    Quiz(){
        s = new stack();
        order = 0;
    }

    public void enroll(){

        order++;
        Scanner sc = new Scanner(System.in);
        String name;
        long rollno;

        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter Regno : ");
        rollno = sc.nextLong();

        String uniqueId = name.substring(0,5);
        uniqueId += String.valueOf(rollno).substring(0,3);
        uniqueId += String.valueOf(order);

        this.s.push(uniqueId);
    }

    public void print(){

        System.out.println("Students Enrolled");
        stack temp = new stack(this.s);

        while(!temp.isEmpty()){
            String top = temp.top();
            System.out.println(top);
            temp.pop();
        }
    }
}

