import java.util.Scanner;

public class SecondOne {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of employees : ");
        n = sc.nextInt();

        
        Employee[] emps = new Employee[n];

        for(int i=0;i<n;i++){

            sc.nextLine();

            emps[i] = new Employee();
            System.out.println("Enter Details for Employee " + (i+1) + " : ");

            System.out.println("\nEnter name : ");
            emps[i].name = sc.nextLine();
            
            System.out.println("Enter empid : ");
            emps[i].empid = sc.nextInt();

            System.out.println("Enter appraisal score : ");
            emps[i].appraisal = sc.nextInt();

            emps[i].generateReport();
        }

        int choice;
        while(true){
            System.out.println("\n-----Performance Report-----");
            System.out.println("1] Print just Name ");
            System.out.println("2] Print Name and id ");
            System.out.println("3] Print Name , id and appraisal");
            System.out.println("4-n] Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            boolean exit = false;
            for(int i=0;i<n;i++){

                switch(choice){
                    case 1 :
                        print(emps[i].name,emps[i].report);
                        break;
                    case 2 :
                        print(emps[i].name,emps[i].empid,emps[i].report);
                        break;
                    case 3 : 
                        print(emps[i].name,emps[i].empid,emps[i].appraisal);
                        break;
                    
                    default :
                        exit = true;
                }
            }

            if(exit)
                break;
        }
    }

    //Overloaded Print
    static void print(String name,String report){

        System.out.println("Employee Name : " + name);
        System.out.println("Performance Remarks : " + report);
        System.out.println("\n");
    }

    static void print(String name,int empid,String report){

        System.out.println("Employee ID : " + empid);
        print(name,report); //Recursion!!?

    }

    static void print(String name,int empid,int appraisal){
        // Cant do Recursion here -_-
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Name : " + name);
        System.out.println("Appraisal Score : " + appraisal);

        //Can we ?
        Employee temp = new Employee(name,empid,appraisal);
        temp.generateReport();
        System.out.println("Performance Remarks : " + temp.report);
        System.out.println("\n");
    }

}

class Employee{
    int empid;
    String name;
    int appraisal;
    String report;


    //Overloaded Constructors

    Employee(){

    }

    Employee(String name,int empid){
        this.name = name;
        this.empid = empid;
    }

    Employee(String name,int empid,int appScore){
        this(name,empid);
        this.appraisal = appScore;
    }

    void generateReport(){

        if(appraisal > 8)
            report = "Outstanding Performance!";
        else if(appraisal > 5)
            report = "Excellent Performance!";
        else if(appraisal >= 3)
            report = "Good Performance!";
        else 
            report = "Look out for other jobs!";
    }
}