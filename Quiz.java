import java.util.*;

public class Quiz {
     public static void main(String args[]) 
    { 
       String[] paper = new String[100] ;
       String[] quiz = new String[100] ;
       Scanner scn = new Scanner(System.in) ;
       System.out.println("Enter the no of names for Paper");
       int lena = scn.nextInt()  ;
       System.out.println("Enter the no of names for Quiz");
       int lenb = scn.nextInt() ;
       int i ;
       System.out.println("for paper");
       for(i=0;i<lena;i++) {
    	   paper[i] = scn.next() ;
       }
      
       System.out.println("for quiz");
       for(i=0;i<lenb;i++) {
    	   quiz[i] = scn.next() ;
    	   
    	   if(Arrays.asList(paper).contains(quiz[i])) {
    		   System.out.println(quiz[i]);
    	   }
       }
       scn.close() ;   
    }
}