import java.util.Scanner;
import java.io.*; 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.FileOutputStream; 
import java.io.PrintStream; 
import java.io.IOException;
public class CaesarCipher { 
	public static StringBuffer encrypt(String text, int s) { 
		StringBuffer result= new StringBuffer(); 
		for (int i=0; i<text.length(); i++) { 
			if (Character.isUpperCase(text.charAt(i))) { 
				char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65); 
				result.append(ch); 
			} 
			else{ 
				char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97); 
				result.append(ch); 
			} 
		} 
		return result; 
	}  
	public static void main(String... args) throws IOException {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("Welcome!\n");
		System.out.print("Enter the file name: ");
		String text = sc.next();
		File file = new File(text);
		FileReader reader = new FileReader(file); 
		char chars[] = new char[(int) file.length()];
	    BufferedReader br = new BufferedReader(reader); 
	    int j = 0;
	    int i;
	    while((i =br.read())!= -1){
	    	chars[j] = (char)i;
	    	j++;
	    }
		String str = new String(chars);

		System.out.print("Enter the number of shift: ");
		int s = sc.nextInt();  

		StringBuffer res = encrypt(str, s);
		String ans = res.toString();
		char[] charArr = ans.toCharArray();

		System.out.print("Enter the file name: ");
		String opstr = sc.next();
		File out = new File(opstr);
        FileWriter writer = new FileWriter(out);
        BufferedWriter buffer = new BufferedWriter(writer);  
    	buffer.write(charArr);
    	buffer.close();  
    	FileOutputStream f1 = new FileOutputStream("fi.txt"); 
    	PrintStream outp = new PrintStream(f1);
    	outp.print("Success");
    	outp.println(); 
    	outp.flush();
        outp.close(); 
	} 
} 
