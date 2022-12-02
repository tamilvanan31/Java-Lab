import java.util.Scanner;
class Student{
    static String str[]={"i","you","he","she","it","we","they","who"};
    String str1;
    String[] found=new String[100];
    int[] index1=new int[100];
    int[] index2=new int[100];
    int m=0;
    int o=0;
    int count;
    int first(String[] S,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=S[i].length()+sum+1;
        }
        return sum;
    }
       
    Student(String S){ 
    this.str1=S;
    this.count=0;
    String strArray[] = S.split(" ");
    for(int i=0;i<strArray.length;i++){
        strArray[i]=strArray[i].toLowerCase();
    }
    int j;
    for(int i=0;i<strArray.length;i++){
        for(j=0;j<str.length;j++){
        if(strArray[i].equals(str[j])){
            this.count++;
            this.found[this.o]=strArray[i];
            this.index1[this.m]=first(strArray,i);
            this.index2[this.m]=this.index1[m]+strArray[i].length();
            o++;
            m++;
           
            
        }
        }
    }
    }
}
public class program {
    public static void main(String[] args){
       
        String Str;
        System.out.println("Enter the string:");
        Scanner sc= new Scanner(System.in);
        Str=sc.nextLine();
         Student S=new Student(Str);
         System.out.println("The number of Subjective pronouns in the given String is:");
         System.out.println(S.count);
         System.out.println("The Subjective pronouns in the given String are/is:");
         for(int i=0;i<S.o;i++){
             System.out.print(S.found[i]+" ");
         }
         System.out.println();
         //System.out.println("The Start and end index of the Subjective pronouns in the given String are/is:");
          for(int i=0;i<S.m;i++){
            
             System.out.print("Start index: " + S.index1[i]+",");
             System.out.print("Ending index: " + S.index2[i]);
             System.out.print("\n");
             
         }
        
    }
}