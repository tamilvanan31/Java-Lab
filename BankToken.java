import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Bank {
    static Map<Integer, String> list = new HashMap<Integer, String>();
    private Integer token;
    private String name;

    Bank(String name) {
        this.name = name;
        Integer tk = new Random().nextInt(10000);
        while (!isValid(tk) && !list.keySet().contains(tk)) {
            tk = new Random().nextInt(10000);
        }
        this.token = tk;
        list.put(this.token, name);
    }

    private boolean isValid(Integer tk) {
        String t = Integer.toString(tk);
        int[] count = new int[10];
        for (char ch : t.toCharArray()) {
            count[ch - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] > 1)
                return false;
        }
        return true;
    }

    public String getToken() {
        if(this.token < 1000){
            int val = this.token;
            char[] ret = new char[4];
            for(int i=3;i>=0;i--){
                ret[i] = (char)(val%10);
                val/=10;
            }
            for(int i=0;i<4-Integer.toString(val).length();i++){
                ret[i]= '0';
            }
            return ret.toString();
        }
        return Integer.toString(this.token);
    }

    public String getName() {
        return this.name;
    }

    public void destroy(Integer tk) {
        list.remove(tk);
    }

    public int getCount() {
        return list.size();
    }

    public double getProbability(){
        return 1/(double)list.size();
    }

    public boolean attend(String name){
        for(Integer obj: list.keySet()){
            if(list.get(obj).equals(name)){
                list.remove(obj);
                return true;
            }
        }
        return false;
    }

    public String callAttend() {

        int size = list.size();
        int item = new Random().nextInt(size); 
        int i = 0;
        for (Object obj : list.keySet()) {
            if (i == item)
                return list.get(obj);
            i++;
        }
        return "NO ATTENDEES";
    }

    protected void finalize(){
        System.out.println("Garbage collected");
    }

}

public class BankToken {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of customers: ");
        n = sc.nextInt();

        Bank[] customers = new Bank[n];

        for(int i=0;i<n;i++){
            String name;
            System.out.print("\nEnter the customer name: ");
            name = sc.next();
            customers[i] = new Bank(name);
        }

        for(int i=0;i<n;i++){
            System.out.print(customers[i].getName());
            System.out.print(" with token of "+customers[i].getToken()+" has a chance of "+customers[i].getProbability()+" of being called\n");
            customers[i].attend(customers[i].getName());
        }
        customers[0] = null;
        Runtime.getRuntime().gc();
        sc.close();
    }
}