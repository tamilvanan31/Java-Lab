import java.lang.*;
class Person
{
	int height,weight;
	String name;
	void getval(int h,int w,String s)
	{
		height=h;
		weight=w;
		name=s;
	}
	void displayDetails()
	{
		System.out.println("name "+name);
		System.out.println("height "+height);
		System.out.println("weight "+weight);
	}
}
class Student extends Person
{
	String collegeName;
	int idNo;
	void getval(int h,int w,String s,String cn,int id)
	{
		height=h;
		weight=w;
		name=s;
		collegeName=cn;
		idNo=id;
	}
	void displayDetails()
	{
		System.out.println("name "+name);
		System.out.println("height "+height);
		System.out.println("weight "+weight);
		System.out.println("college name "+collegeName);
		System.out.println("college idNo "+idNo);
	}
}
class Inherit2
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.getval(180,60,"Ragul","MIT",12345);
		s.displayDetails();
	}
}
