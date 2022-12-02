import java.util.Scanner;

public class FullTime extends Student {
    public void enroll(String name, int rollno, int year){
        this.rollno = rollno;
        this.name = name;
        this.year = year;
    }
    
    public void display(){
        System.out.println("\n Student name : " + this.name);
        System.out.println("Student rollno: " + this.rollno);
        System.out.println("Student year: " + this.year);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        FullTime[] studs = new FullTime[10];
        System.out.println("Enter no of students");
        int no = sc.nextInt();
        for(int i=0;i<no;i++){
            System.out.println("\nEnter the name of the student " + (i+1));
            String name = sc.next();
            System.out.println("Enter the rollno of the  student " + (i+1));
            int rollno = sc.nextInt();
            System.out.println("Enter the year of the student " + (i+1));
            int year = sc.nextInt();
            studs[i] = new FullTime();
            studs[i].enroll(name, rollno, year);
        }
        System.out.println("\nThe student details are as follows");
        for(int i=0;i<no;i++){
            studs[i].display();
        }
    }

}
abstract class Student{
    String name;
    int rollno;
    int year;
    Student(){
        name = "xxxx";
        rollno = 0;
        year = 0;
    }
    public String getname(){
        return this.name;
    }
    public int getyear(){
        return this.year;
    }
    public abstract void enroll(String name, int rollno, int year);
    public abstract void display();
}
