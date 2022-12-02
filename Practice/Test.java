import java.util.*;
import java.io.*;
public class Test{
	public void pupAge(){
	int age = 0;
	age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]){
	Test test = new Test();
	test.pupAge();
	Integer number=Integer.valueOf(15);
	System.out.println(number.getClass().getName());
	String a = "Hello";
	System.out.println(a.getClass().getName());
	int i=System.in.read();//returns ASCII code of 1st character  
	System.out.println((char)i);//will print the character  
	}
}