import java.util.Scanner;
class Student{
    String name;
    int regno;
    int[] marks;
    protected int grade;
    private static int students=0;
    Student(String name,int regno){
        this.name=name;
        this.regno=regno;
        students++;
    }
    void details(int subs){
       System.out.println("Name: "+this.name+"\nReg.No: "+this.regno+"\nMarks: "); 
       for(int i=0;i<subs;i++)
         System.out.println("Subject "+(i+1)+": "+marks[i]);
       System.out.println("Marks: "+grade);
       if(grades >= 50 && grades <= 60){
        System.out.println("B");
       }
       else if(grades >= 70 && grades <= 80){
        System.out.println("A");
       }
       else if(grades >= 80 && grades <= 90){
        System.out.println("A+");
       }
       else if(grades >90){
        System.out.println("O");
       }  
       else{
        System.ou.println("Avg");
       }
    }
    static int count(){
       return students; 
    }
}
class PartTime extends Student{
    private static int students=0;
    PartTime(String name,int regno){
       super(name,regno);
       students++; 
    }
    void setGrade(){
       System.out.println("Setting Grade..."); 
    }
    static int count(){
       return students; 
    }
}
class FullTime extends Student{
    private static int students=0;
    FullTime(String name,int regno){
       super(name,regno);
       students++; 
    }
    void setGrade(){
       System.out.println("Setting Grade..."); 
    }
    static int count(){
       return students; 
    }
}
class UG_PartTime extends PartTime{
    static int students=0;
    private static int subjects=5;
    UG_PartTime(String name,int regno,int[] marks){
       super(name,regno);
       this.marks=new int[5];
       for(int i=0;i<5;i++)
         this.marks[i]=marks[i]; 
       students++;
    }
    void setGrade(){
       int i,total=0; 
       for(i=0;i<5;i++)
         total+=marks[i];
       grade=total/5;   
    }
    void details(){
       super.details(subjects); 
    }
}
class PG_PartTime extends PartTime{
    static int students=0;
    private static int subjects=3;
    PG_PartTime(String name,int regno,int[] marks){
       super(name,regno);
       this.marks=new int[3];
       for(int i=0;i<3;i++)
         this.marks[i]=marks[i];
       students++;
    }
    void setGrade(){
       int i,total=0; 
       for(i=0;i<3;i++)
         total+=marks[i];
       grade=total/3;
    }
    void details(){
       super.details(subjects); 
    }
}
class UG_FullTime extends FullTime{
    static int students=0;
    private static int subjects=5;
    UG_FullTime(String name,int regno,int[] marks){
       super(name,regno);
       this.marks=new int[5];
       for(int i=0;i<5;i++)
         this.marks[i]=marks[i];
       students++;
    }
    void setGrade(){
       int i,total=0; 
       for(i=0;i<5;i++)
         total+=marks[i];
       grade=total/5;
    }
    void details(){
       super.details(subjects); 
    }
}
class PG_FullTime extends FullTime{
    static int students=0;
    private static int subjects=3;
    PG_FullTime(String name,int regno,int[] marks){
       super(name,regno);
       this.marks=new int[3];
       for(int i=0;i<3;i++)
         this.marks[i]=marks[i];
       students++;
    }
    void setGrade(){
       int i,total=0; 
       for(i=0;i<3;i++)
         total+=marks[i];
       grade=total/5;
    }
    void details(){
       super.details(subjects); 
    }
}
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,op=1,regno,mode,programme;
        String name;
        int[] marks=new int[5];
        UG_PartTime[] ugp=new UG_PartTime[20];
        PG_PartTime[] pgp=new PG_PartTime[20];
        UG_FullTime[] ugf=new UG_FullTime[20];
        PG_FullTime[] pgf=new PG_FullTime[20];
        while(op!=0){
           System.out.print("Student Name: ");
           name=sc.next();
           System.out.print("Reg.no: ");
           regno=sc.nextInt();
           System.out.println("Mode of study:\n1 - Part Time\n2 - Full Time");
           mode=sc.nextInt();
           System.out.println("Programme:\n1 - UG\n2 - PG");
           programme=sc.nextInt();
           System.out.println("Enter marks of each subject: ");
           if(programme==1) j=5;
           else j=3;  
           for(i=0;i<j;i++){
             System.out.print("Subject "+(i+1)+": ");
             marks[i]=sc.nextInt();
           }
           if(programme==1&&mode==1){
              ugp[UG_PartTime.students]=new UG_PartTime(name, regno, marks);
              ugp[UG_PartTime.students-1].setGrade(); 
           }
           else if(programme==2&&mode==1){
              pgp[PG_PartTime.students]=new PG_PartTime(name, regno, marks);
              pgp[PG_PartTime.students-1].setGrade(); 
           }
           else if(programme==1&&mode==2){
              ugf[UG_FullTime.students]=new UG_FullTime(name, regno, marks);
              ugf[UG_FullTime.students-1].setGrade(); 
           }
           else if(programme==2&&mode==2){
              pgf[PG_FullTime.students]=new PG_FullTime(name, regno, marks);
              pgf[PG_FullTime.students-1].setGrade(); 
           }
           System.out.println("0 Exit\nELSE Proceed");
           op=sc.nextInt(); 
        }
        sc.close();
        System.out.println("\nTotal no.of students: "+Student.count());
        System.out.println("No.of Students in Part time: "+PartTime.count());
        System.out.println("No.of Students in Full time: "+FullTime.count());
        System.out.println("Students in UG Part time: "+UG_PartTime.students);
        for(i=0;i<UG_PartTime.students;i++){
          System.out.println("\nStudent "+(i+1)+": ");
          ugp[i].details();
        }
        System.out.println("\nStudents in PG Part time: "+PG_PartTime.students);
        for(i=0;i<PG_PartTime.students;i++){
          System.out.println("\nStudent "+(i+1)+": ");
          pgp[i].details();
        }
        System.out.println("\nStudents in UG Full time: "+UG_FullTime.students);
        for(i=0;i<UG_FullTime.students;i++){
          System.out.println("\nStudent "+(i+1)+": ");
          ugf[i].details();
        }
        System.out.println("\nStudents in PG Full time: "+PG_FullTime.students);
        for(i=0;i<PG_FullTime.students;i++){
          System.out.println("\nStudent "+(i+1)+": ");  
          pgf[i].details();  
        }
        System.out.println();
    }
}