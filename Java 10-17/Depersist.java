import java.io.*;
public class Depersist{
	public static void main(String... args){
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			Student s2 = (Student)in.readObject();
			System.out.print("Name: " + s2.name + " " + "\nId: " +s2.id);
			in.close();
		}
		catch(Exception e){
			System.err.print(e);
		}
	}
}