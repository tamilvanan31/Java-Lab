import java.util.Scanner;
class Employee{
    private static int emps=0;
    String name,projectTitle,projectDeadline;
    int id,hoursWorked,totalHours;
    Employee(String name,String title,String deadline,int hoursWorked,int totalHours){
        this.name=name;
        this.id=++emps;
        this.projectTitle=title;
        this.projectDeadline=deadline;
        this.hoursWorked=hoursWorked;
        this.totalHours=totalHours;
    }
    void workloadBilling(){
        System.out.println("Work Load Percentage: "+(hoursWorked/totalHours));
    }
    static void projectTrack(FullTime[] f,Contract[] c){
        int i;
        if(FullTime.emps>0) System.out.println("\nFull time Employees:");
        for(i=0;i<FullTime.emps;i++){
           System.out.println("\nEmployee Name: "+f[i].name+"\nId: "+f[i].id);
           f[i].workcheck();
           f[i].workloadBilling(); 
        }
        if(Contract.emps>0) System.out.println("\nEmployees in Contract:");
        for(i=0;i<Contract.emps;i++){
           System.out.println("\nEmployee Name: "+c[i].name+"\nId: "+c[i].id);
           c[i].workcheck();
           c[i].workloadBilling();
        }
    }
}
class FullTime extends Employee{
    static int emps=0;
    int extraHours;
    FullTime(String name,String title,String deadline,int hoursWorked,int totalHours,int extraHours){
        super(name,title,deadline,hoursWorked,totalHours);
        this.extraHours=extraHours;
        emps++;
    }
    void workloadBilling(){
        System.out.println("Work Load Percentage: "+((float)(hoursWorked+extraHours)/totalHours));
    }
    void workcheck(){
        System.out.println("Project Title: "+this.projectTitle+"\nDeadline: "+this.projectDeadline+"\nNo.of working hours in the project: "+this.hoursWorked);
    }
}
class Contract extends Employee{
    static int emps=0;
    int extraHours;
    Contract(String name,String title,String deadline,int hoursWorked,int totalHours,int extraHours){
        super(name,title,deadline,hoursWorked,totalHours);
        this.extraHours=extraHours;
        emps++;
    }
    void workloadBilling(){
        System.out.println("Work Load Percentage: "+((float)(hoursWorked+extraHours)/totalHours));
    }
    void workcheck(){
        System.out.println("Project Title: "+this.projectTitle+"\nDeadline: "+this.projectDeadline+"\nNo.of working hours in the project: "+this.hoursWorked);
    }
}
public class employee_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,hrs,total,extra,f_c;
        String name,title,deadline;
        System.out.println("No.of Employees: ");
        n=sc.nextInt();
        FullTime[] f=new FullTime[n];
        Contract[] c=new Contract[n];
        for(i=0;i<n;i++){
            System.out.print("Name: ");
            name=sc.next();
            System.out.print("Project Title: ");
            title=sc.next();
            System.out.print("Project Deadline: ");
            deadline=sc.next();
            System.out.print("Hours worked on project: ");
            hrs=sc.nextInt();
            System.out.print("Extra hours worked: ");
            extra=sc.nextInt();
            System.out.print("Total hours worked: ");
            total=sc.nextInt();
            System.out.print("1 - Full Time\n2 - Contract\n");
            f_c=sc.nextInt();
            if(f_c==1)
              f[FullTime.emps]=new FullTime(name, title, deadline, hrs, total, extra);
            else
              c[Contract.emps]=new Contract(name, title, deadline, hrs, total, extra);
        }
        sc.close();
        System.out.println("Employee Details:");
        Employee.projectTrack(f, c);
    }
}
