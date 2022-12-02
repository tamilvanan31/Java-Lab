import java.util.Scanner;
class Student{
    static String msg;
    String name;
    int regno;
    Student(String name,int regno){
       this.name=name;
       this.regno=regno; 
       System.out.println(Student.msg+", "+this.name);
    }
    static int[][] proOcc(String[] pronouns,int[] count){
        int[][] occurences = new int[7][10];
        int i,j;
        for(i=0;i<7;i++) count[i]=0;
        for(i=0;i<Student.msg.length();i++){
            for(j=0;j<7;j++){
               if(i+pronouns[j].length()<=Student.msg.length()&&Student.msg.substring(i, i+pronouns[j].length()).toLowerCase().equals(pronouns[j])){
                   occurences[j][count[j]++]=i;
                   break;
               } 
            }
            if(j<7)
              i+=pronouns[j].length()-1;
        }
        return occurences;
    }
}
public class welcome_msg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pronouns={" i ", " you ", " we ", " he ", " she ", " it ", " they "};
        System.out.print("Welcome message: ");
        Student.msg=sc.nextLine();
        int n,i,j,regno;
        String name;
        System.out.print("No.of Students: ");
        n=sc.nextInt();
        Student[] st = new Student[n];
        for(i=0;i<n;i++){
           System.out.print("Student "+(i+1)+ "\nName: ");
           name=sc.next();
           System.out.print("Regno: ");
           regno=sc.nextInt();
           st[i]=new Student(name, regno);
        }
        sc.close();
        System.out.println("\nOccurrences of subjective pronouns: ");
        int[] count=new int[7];
        int[][] occ=Student.proOcc(pronouns,count);
        for(i=0;i<7;i++){
           System.out.println("\n"+pronouns[i]+": "+count[i]);
           for(j=0;j<count[i];j++){
               System.out.println("["+occ[i][j]+","+(occ[i][j]+pronouns[i].length()-1)+"]"); 
           } 
        }
    }
}