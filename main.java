import java.util.Scanner;
class Student{
    int stuId;
    protected int pf;
    String name;
    private static int sCount=0;
    float marks;
    Student(String name,float marks){
        this.name=name;
        stuId= sCount+1;
        sCount++;
		this.marks=marks;
    }
    void marks(float marks){
        System.out.println("Name:"+name);
        System.out.println("Student id:"+stuId);
        System.out.println("GPA:"+((marks/50.0)*10.0));
        System.out.println("Part time");
		System.out.println();
    }
    void marks(float marks,int flag){
        System.out.println("Name:"+name);
        System.out.println("Student id:"+stuId);
        if(flag==1)
		{
            pf=flag;
            System.out.println("Full time");
            System.out.println("GPA:"+((marks/100.0)*10.0));
			System.out.println();
        }
        else{
            pf=flag;
            System.out.println("Part time");
            System.out.println("GPA:"+((marks/50.0)*10.0));
			System.out.println();
        }
    }
}
class PartTime extends Student{
	PartTime(String name,float marks){
        super(name,marks);
        marks(marks);
    }
	void marks(float marks){
        super.marks(marks);
    }
}
class FullTime extends Student{
	FullTime(String name,float marks){
        super(name,marks);
        marks(marks);
    }
	void marks(float marks){
        super.marks(marks,1);
    }
}  
class PUgrad extends PartTime{
    PUgrad(String name,float marks){
        super(name,marks);
    }
}
class PPgrad extends PartTime{
    PPgrad(String name,float marks){
        super(name,marks);
    }

}
class FUgrad extends FullTime{
    FUgrad(String name,float marks){
        super(name,marks);
    }
}
class FPgrad extends FullTime{
    FPgrad(String name,float marks){
        super(name,marks);
    }
}
public class main {
    public static void main(String[] args) {
        float marks;
        char time,type;
        String name;
        Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int n = sc.nextInt();
		while(n>0){
			System.out.print("Enter name : ");
			name=sc.next();
			System.out.print("Postgraduate or Undergraduate?(P/U) : ");
			type=sc.next().charAt(0);
			System.out.print("Partime or Fulltime?(P/F) : ");
			time=sc.next().charAt(0);
			if(time=='P' && type=='P'){
				System.out.print("Enter marks /50 : ");
				marks=sc.nextFloat();
				PPgrad s=new PPgrad(name,marks);

			}
			else if(time=='P' && type=='U'){
				System.out.print("Enter marks /50 : ");
				marks=sc.nextFloat();
				PUgrad s=new PUgrad(name,marks);
			}
			else if(time=='F' && type=='U'){
				System.out.print("Enter marks /100 : ");
				marks=sc.nextFloat();
				FUgrad s=new FUgrad(name,marks);
			}
			else if(time=='F' && type=='P'){
				System.out.print("Enter marks /100 : ");
				marks=sc.nextFloat();
				FPgrad s=new FPgrad(name,marks);
			}
			n--;
		}
		sc.close();
    }
}