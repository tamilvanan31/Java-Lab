import java.util.Scanner;
class students{
    protected String name;
    protected int roll;
    int[] marks = new int[5];
    int choice;
    int ugorpg;
    public void ch(int c1, int chc, String name, int rollno, int[] mark){
        choice = c1;
        ugorpg = chc;
        name = name;
        roll = rollno;
        marks = mark;
    }
        /*public int m1(){
            System.out.print("The part time student ");
            return ugorpg;
        }
        public int m2(){
            System.out.print("The full time time student ");
            return ugorpg;
        }*/
        public void compute(){
            for(int i = 0; i < 5; i++){
                if (marks[i] >= 40 && marks[i] < 60 ){
                    System.out.print("B ");
                }
                else if(marks[i] >= 60 && marks[i] < 70){
                    System.out.print("B+ ");
                }
                else if(marks[i] >= 70 && marks[i] < 80){
                    System.out.print("A ");
                }
                else if(marks[i] >= 80 && marks[i] < 90){
                    System.out.print("A+ ");
                }
                else if (marks[i] >= 90){
                    System.out.print("O ");
                }
                else{
                    System.out.print("U ");
                }
            }
        }
    
}

public class grade{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of students to compute the grades: ");
        int n = sc.nextInt();
        students[] list = new students[10];
        for(int i = 0; i < n; i++){
            System.out.print("\nEnter the mode of pursing (for part time press 1 and for full time press 2): ");
            int choice = sc.nextInt();
            System.out.print("Enter 1 for PG or 2 for UG: ");
            int choice1 = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            System.out.print("Enter the marks obtained in all five subjects: ");
            int[] marks = new int[5];
            System.out.print("\n");
            for(int j = 0; j < 5; j++){ 
                int k = j + 1;
                System.out.print("Subject " + k + ": ");
                marks[j] = sc.nextInt();
            }
            list[i].ch(choice, choice1,  name, roll, marks);

        }
    }
}