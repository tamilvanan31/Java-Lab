import java.util.*;
class proj {
    String name;
    int h;
    proj(String n) {
        name = n;
    }
}
class employee {
    int id, age;
    String name;
    int proj, baseWH;
    static int[] a;//stores no of employees in each project
    static proj[] p; // no of projects
    int pH;
    employee(int id, int age, String name, int baseWH, int pH) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.baseWH = baseWH;
        this.pH = pH;
    }

    void workLoadBilling() {
        System.out.println("The workload percentage : "  + pH/(double) baseWH * 100 + "%");
    }

    static void projectTrack(int n) {
        System.out.println("No. of projects : " + n + "\n");
        int i;
        for(i = 0; i < n; i++) {
            System.out.println("Project name : " + p[i].name);
            System.out.println("No. of employee : " + a[i] + "\n");
        }
    }
}
class contract extends employee {
    int extraH;
    contract(String name, int age, int id, int t, int p, int pH) {
        super(id, age, name, t, pH);
        a[p]++;
        extraH = 0;
    }

    void addExtra(int h) {
        extraH = h;
        pH += extraH;
        this.workLoadBilling();
    }

    void workLoadBilling() {
        super.workLoadBilling();
    }

    void workCheck() {
        System.out.println("\nProject name : " + p[proj].name);
        System.out.println("No. of hours : " + p[proj].h);
    }

}
class fullTime extends employee {
    int extraH;
    fullTime(String name, int age, int id, int t, int p, int pH) {
        super(id, age, name, t, pH);
        proj = p;
        a[p]++;
        extraH = 0;
    }

    void addExtra(int h) {
        extraH = h;
        pH += extraH;
        this.workLoadBilling();
    }

    void workLoadBilling() {
        super.workLoadBilling();
    }

    void workCheck() {
        System.out.println("\nProject name : " + p[proj].name);
        System.out.println("No. of hours : " + p[proj].h);
    }
}
public class emp {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of projects : ");
        n = sc.nextInt();
        employee.a = new int[n];
        employee.p = new proj[n];
        for(i = 0; i < n; i++) {
            String name;
            int hr;
            System.out.print("Name of project : ");
            name = sc.next();
            employee.p[i] = new proj(name);
            employee.a[i] = 0;
        }

        while(true) {
            System.out.println("\n1.Add employee");
            System.out.println("2.View project Track");
            System.out.println("3.Exit\n");
            int opt = sc.nextInt();
            if(opt == 3)
                break;

            if(opt == 1) {
                System.out.println("1.Fulltime");
                System.out.println("2.Contract");
                int e = sc.nextInt();
                if(e == 1) {
                    String name;
                    int age, id, t, pno, ph;
                    System.out.println("Enter name, age, id, total hours at organization, project no, no of hours on Poject :");
                    name = sc.next();
                    age = sc.nextInt();
                    id = sc.nextInt();
                    t = sc.nextInt();
                    pno = sc.nextInt();
                    ph = sc.nextInt();
                    fullTime f = new fullTime(name, age, id, t, pno, ph);
                    System.out.println("Add extra hours?(0/1) :");
                    int opt2 = sc.nextInt();
                    if(opt2 == 1) {
                        System.out.println("Extra hours : ");
                        int ex = sc.nextInt();
                        f.addExtra(ex);
                    }
                    else {
                        f.addExtra(0);
                    }
                }
                else {
                    String name;
                    int age, id, t, pno, ph;
                    System.out.println("Enter name, age, id, total hours at organization, project no :");
                    name = sc.next();
                    age = sc.nextInt();
                    id = sc.nextInt();
                    t = sc.nextInt();
                    pno = sc.nextInt();
                    ph = sc.nextInt();
                    contract f = new contract(name, age, id, t, pno, ph);
                    System.out.println("Add extra hours?(0/1) :");
                    int opt2 = sc.nextInt();
                    if(opt2 == 1) {
                        System.out.println("Extra hours : ");
                        int ex = sc.nextInt();
                        f.addExtra(ex);
                    }
                    else {
                        f.addExtra(0);
                    }
                }
            }
            else {
                employee.projectTrack(n);
            }
        }
    }
}
