import java.util.Scanner;
import java.util.ArrayList;

class exception1 extends Exception
{
	String str1;
	exception1(String str2) {
	 str1=str2;
	}

	public String toString(){
	 return (str1) ;
	}
}

class exception2 extends Exception{

	String str1;
	exception2(String str2) {
	 str1=str2;
	}

	public String toString(){
	 return (str1) ;
	}

 }

class books{
	String name;
	int day;

	books(String name,int day)
	{
		this.name=name;
		this.day=day;
	}
}

class student
{
	static ArrayList<Integer> s = new ArrayList<Integer>();
	String name;
	int id,fine;
	int fine_limit=10,book_limit=10;
	int numbooks=0;
	static int limit=5;
	books[] b = new books[10];

	student(int id, String name)
	{
		student.s.add(id);
		this.id=id;
		this.name=name;
		this.fine=0;
	}

	static boolean isavail(int id)
	{
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i)==id) return true;
		}
		return false;
	}

	void addbook(String book,int day)
	{
		if(numbooks<=book_limit)
		{
			b[numbooks]= new books(book,1);
			numbooks++;
		}
		else
			System.out.println("You've reached the book limit! You cannot borrow any further books! ");
	}

	void returnbook(String book,int day)
	{
		for(int i=0;i<numbooks;i++)
		{
			if(book.equalsIgnoreCase(b[i].name))
			{
				books temp=b[i];
				b[i]=b[numbooks-1];
				b[numbooks-1]=temp;
				b[numbooks-1]=null;
				System.gc();
				numbooks--;
			}
		}
	}

	void renewbook(String book,int day)
	{
		for(int i=0;i<numbooks;i++)
		{
			if(book.equalsIgnoreCase(b[i].name))
			{
				b[i].day=1;
			}
		}
	}

	void fineamount()
	{
		System.out.println("The fine amount is: " + fine);
	}

	void overdue()
	{
		int amt=0;
		for(int i=0;i<numbooks;i++)
		{
			try
			{
				b[i].day++;
				if(b[i].day>student.limit)
					throw new exception2(this.name + " - " + this.b[i].name + " is overdue!");
			}
			catch(exception2 exp)
			{
				System.out.println("Warning!");
				System.out.println(exp);
			}
		}
	}

	void updatefine()
	{
		try
		{
			int amt=0;
			for(int i=0;i<numbooks;i++)
			{
				if(b[i].day<=student.limit) continue;
				else if(b[i].day<=student.limit+5) amt+=1;
				else if(b[i].day<=student.limit+10) amt+=2;
				else amt+=5;
			}
			fine+=amt;
			if(fine > fine_limit)
				throw new exception1(this.name + " has exceeded the fine limit!");
		}
		catch(exception1 exp)
		{
			System.out.println("Waring! ");
			System.out.println(exp);
		}
	}
}

public class p3
{
	static void disp()
	{
		System.out.println("1) Create account \n2) Borrow Book \n3) Return Book \n4) Renew Book \n5) Check fine amount \n6) End day\n");
	}

	public static void main(String args[])
	{
		student[] s= new student[10];
		Scanner sc= new Scanner(System.in);
		int day,m;
		int i,j,k=0,id;
		String name;
		System.out.println("Enter the number of days of progress: ");
		m=sc.nextInt();
		for(day=1;day<=m;day++)
		{
			System.out.println("The Student - Book over due list for day " + day + " is: ");
			for(i=0;i<k;i++)
				s[i].overdue();

			System.out.println("\nThe Students who has exceeded fine on day " + day + " is: ");
			for(i=0;i<k;i++)
				s[i].updatefine();

			System.out.print("\n");
			while(true)
			{
				disp();
				j=sc.nextInt();
				if(j==1)
				{
					System.out.print("Enter the id number: ");
					id=sc.nextInt();
					if(student.isavail(id))
						System.out.println("The id number already exists!");
					else
					{
						System.out.print("Enter the name: ");
						name=sc.next();
						s[k]=new student(id,name);
						k++;
						continue;
					}
				}
				if(j==2)
				{
					System.out.print("Enter the id number: ");
					id=sc.nextInt();
					if(student.isavail(id))
					{
						System.out.println("Enter the name of the book to be borrowed: ");
						String book;
						book=sc.next();
						for(int  ind=0;ind<k;ind++)
						{
							if(s[ind].id==id)
							{
								s[ind].addbook(book,day);
								break;
							}
						}
					}
					else
						System.out.println("The id number doesn't exist! Please create a new account!");
				}
				else if(j==3)
				{
					System.out.print("Enter the id number: ");
					id=sc.nextInt();
					if(student.isavail(id))
					{
						System.out.println("Enter the name of the book to be returned: ");
						String book;
						book=sc.next();
						for(int  ind=0;ind<k;ind++)
						{
							if(s[ind].id==id)
							{
								s[ind].returnbook(book,day);
								break;
							}
						}
					}
					else
						System.out.println("The id number doesn't exist! Please create a new account!");
				}
				else if(j==4)
				{
					System.out.print("Enter the id number: ");
					id=sc.nextInt();
					if(student.isavail(id))
					{
						System.out.println("Enter the name of the book to be renewed: ");
						String book;
						book=sc.next();
						for(int  ind=0;ind<k;ind++)
						{
							if(s[ind].id==id)
							{
								s[ind].renewbook(book,day);
								break;
							}
						}
					}
					else
						System.out.println("The id number doesn't exist! Please create a new account!");
				}
				else if(j==5)
				{
					System.out.print("Enter the id number: ");
					id=sc.nextInt();
					if(student.isavail(id))
					{
						for(int  ind=0;ind<k;ind++)
						{
							if(s[ind].id==id)
							{
								s[ind].fineamount();
								break;
							}
						}
					}
				}
				else
				 break;
			}
		}
	}
}