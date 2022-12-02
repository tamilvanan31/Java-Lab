import java.util.Scanner;
import java.util.Random;

public class Bank {
    static int max = 20;
    static int index = 0;
    boolean[] called;
    BankQueue[] Q ;
    
    Bank(){
        Q = new BankQueue[max]; //Object Array
        called = new boolean[max];

        for(int i=0;i<max;i++)
            called[i] = false;

    }

    boolean validate(String token){

        if(token.length() != 4)
            return false;

        for(int i=0;i<4;i++){
            char now = token.charAt(i);

            if(!(now >= '0' && now <= '9'))
                return false;
        }

        return true;
    }

    static void call(Bank b){

        System.out.println("The Tokens given so Far : \n");
        for(int i=0;i<index;i++)
            System.out.println(b.Q[i].token);
        
        while(true){
        
            System.out.println("\n1] Call token by any order");
            System.out.println("2] Call token by required order");
            System.out.println("3] End");

            System.out.print("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            String token = "";

            if(choice == 1 || choice == 2){
                System.out.println("\nEnter four-digit Token : ");
                sc.nextLine();            
                token = sc.nextLine();

                //Token Validation
                if(!b.validate(token)){
                    System.out.println("Enter a valid Token !");
                    continue;
                }
            }

            if(choice == 1){

                int matches = 0;
                boolean called = false;

                for(int i=0;i<index;i++){
                    
                    if(b.called[i])
                        continue;
                    
                    if(b.Q[i].match(token)){
                        matches++;
                        if(!called){
                            System.out.println("Token called : " + b.Q[i].token + " Customer no : " + (i + 1));
                            called = true;
                        }

                        b.called[i] = true;
                    }
                }

                float probas = 0f;
                if(matches == 0){
                    System.out.println("No Customer Available With " + token);
                    continue;
                }
                else
                    probas = 1/(float)(index + 1);

                System.out.println("Chances are  : " + probas);
            }

            else if(choice == 2){

                int matches = 0;
                boolean called = false;

                for(int i=0;i<index;i++){

                    if(b.called[i])
                        continue;

                    if(b.Q[i].match(token,true)){
                        matches++;
                        if(!called){
                            System.out.println("Token called : " + b.Q[i].token + " Customer no : " + (i + 1));
                            called = true;
                        }

                        b.called[i] = true;
                    }
                }

                float probas = 0f;
                if(matches == 0){
                    System.out.println("No Customer Available With " + token);
                    continue;
                }
                else
                    probas = 1/(float)(index + 1);

                System.out.println("Chances are  : " + probas);
            }

            else if(choice == 3){

                int total = BankQueue.customer_count; //static var

                int fullfill = 0;
                for(int i=0;i<max;i++)
                    if(b.called[i])
                        fullfill++;
                    
                System.out.println("Total Customers  : " + total);
                System.out.println("Customers Fulfilled : " + fullfill);
                System.out.println("Customers Left Without Attending : " + (total - fullfill));

                //Garbage Collection
                for(int i=0;i<index;i++){

                    if(!b.called[i])
                        b.Q[i] = null;
                    
                    Runtime.getRuntime().gc();
                }

                sc = null;
                return ;
            }
        }
    }

    static void create(Bank b){

        Random rm = new Random();
        
        //Generate Tokens
        String token = "";
        for(int i=0;i<4;i++){
            int rand = (rm.nextInt() & Integer.MAX_VALUE) % 10;
            token += String.valueOf(rand); //Random token
        }

        b.Q[index] = new BankQueue(token);
        index++;
    }

    public static void main(String[] args){

         
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        while(true){

            boolean exitLoop = false;

            System.out.println("\n\n----BANK QUEUE APPLICATION----");
            System.out.println("1] New Customer");
            System.out.println("2] Call Customers");
            System.out.println("3] Exit");
            
            System.out.println("Enter your choice : ");
            int choice;
            choice = sc.nextInt();

            switch(choice){

                case 1 :
                    create(b);
                    break;
                case 2 :
                    call(b);
                    exitLoop = true;
                    break;
                case 3 :
                    exitLoop = true;
                    break;
            }

            if(exitLoop)
                break;
        }
    }
}

class BankQueue{

    static int customer_count = 0;
    String token;

    BankQueue(){
        customer_count++;
    }

    BankQueue(String token){
        this();
        this.token = token;
    }

    //Any order
    boolean match(String token){

        int [] nums = new int[10];
        
        for(int i=0;i<4;i++){
            char now = token.charAt(i);

            nums[now-'0']++;
        }

        for(int i=0;i<4;i++){
            char now = this.token.charAt(i);

            if(nums[now-'0'] == 0)
                return false;
            
            nums[now-'0']--;
        }
        
        return true;
    }

    //Required order
    boolean match(String token,boolean required){

        for(int i=0;i<4;i++)
            if(token.charAt(i) != this.token.charAt(i))
                return false;

        return true;
    }

    protected void finalize() throws Throwable{
        System.out.println("Garbage Collector Called!");
    }
}
