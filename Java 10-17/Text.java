import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class Text{
   public static void main(String... args) throws IOException{
      Scanner sc1 = new Scanner(new File("D://Semester 5/Java Programming/Java 10-17/f1.txt"));
      Scanner sc2 = new Scanner(new File("D://Semester 5/Java Programming/Java 10-17/f2.txt"));
      FileWriter writer = new FileWriter("D://Semester 5/Java Programming/Java 10-17/f3.txt");
      String str[] = new String[3];
      while (sc1.hasNextLine()||sc2.hasNextLine()){
         str[0] = sc1.nextLine();
         str[1] = sc2.nextLine();	
      }
      writer.append(str[0]+"\n");
      writer.append(str[1]+"\n");
      writer.append(str[2]+"\n");
      writer.flush();
      System.out.println("Contents added ");
   }
} 	 	