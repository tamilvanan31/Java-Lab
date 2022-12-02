import java.io.*;
import java.util.Scanner;
public class Persist{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Course: ");
			String course = sc.next();
			System.out.print("Fee: ");
			int fee = sc.nextInt();
			Student s1 = new Student(id, fee, course, name);
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.print("Done");
		}
		catch(Exception e){
			System.err.print(e);
		}
	}
}