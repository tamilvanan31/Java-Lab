import java.util.Scanner;
class FineAmountException extends Exception{
    String s;
    FineAmountException(String s) {
        this.s = s;
    }
    public String toString() {
        return s;
    }
}
class RenewalDateException extends Exception{
    String s;
    RenewalDateException(String s) {
        this.s = s;
    }
    public String toString() {
        return s;
    }
}
public class LibraryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the borrow date(1-30): ");
        int borrowDate = sc.nextInt();
        System.out.print("Enter renewal date(1-30): ");
        int renewalDate = sc.nextInt();
        System.out.print("Enter the date you renewed(1-30): ");
        int myRenewalDate = sc.nextInt();
        boolean okay1 = true, okay2 = true;
        if(myRenewalDate - borrowDate > renewalDate - borrowDate) {
            okay1 = false;
            try {
                throw new RenewalDateException("Renewal Date exceeded\n");
            }
            catch(RenewalDateException re) {
                System.out.println(re);
            }
        }
        if(myRenewalDate - renewalDate > 7) {
            okay2 = false;
            try {
                throw new FineAmountException("Fine amount exceeded\n");
            }
            catch(FineAmountException fa) {
                System.out.println(fa);
            }
        }
        if(okay1 && okay2) {
            System.out.println("You have successfully renewed your book!");
        }
        sc.close();
    }
}