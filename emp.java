import java.util.*;

class EMployee{
    int id,hours_on_project,hours_on_org;
    EMployee(int a,int b,int c){
        id = a;
        hours_on_project = b;
        hours_on_org = c;
    }
    void projecttrack(){
        System.out.println("id : " + id);
        System.out.println("hours_on_project : " + hours_on_project);
        System.out.println("hours_on_org : " + hours_on_org);
    }
    void WorkloadBilling(){
        System.out.println("workload Percentage ");
        System.out.println(((double)hours_on_project/hours_on_org) * 100);
    }
    void add(int val){
        hours_on_org += val;
        hours_on_project += val;
    }
}

class contract extends EMployee{
    contract(int a,int b,int c){
        super(a,b,c);
    }
    void WorkloadBilling(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the extra hours");
        int val = input.nextInt();
        super.add(val);
        input.close();
    }
    void Workcheck(){
        System.out.println("no. of hours in org : " + super.hours_on_org);
        System.out.println("no. of hours in pro : " + super.hours_on_project);
    }
    void cal(){
        super.WorkloadBilling();
    }
}

class Full_time extends EMployee{
    Full_time(int a,int b,int c){
        super(a,b,c);
    }
    void WorkloadBilling(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the extra hours");
        int val = input.nextInt();
        super.add(val);
        input.close();
    }
    void Workcheck(){
        System.out.println("no. of hours in org : " + super.hours_on_org);
        System.out.println("no. of hours in pro : " + super.hours_on_project);
    }
    void cal(){
        super.WorkloadBilling();
    }
}

public class emp {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        contract a = new contract(11,78,152);
        System.out.println("contract class is created . . . ");
        a.cal();
        a.WorkloadBilling();
        a.cal();
        a.projecttrack();
        input.close();
    }
}
