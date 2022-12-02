import java.util.*;
public class Library {
    public static void main(String arg[])
    {
        System.out.println("Faculty or Student ?(F/S)");
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0); 
        if(x == 'F')
        {
            Faculty f = new Faculty();
            int day;
            System.out.println("Enter the current day(time lapsed)");
            day = sc.nextInt();
            int n = f.calculateRenewalTime(day);
            if(n > 0)
            {
                System.out.println("There are " +n+ " days for the renewal");
            }
            else
            {
                System.out.println("You're " +(n * -1)+ " days late for the renewal");
            }
            n = f.amountCalculation(day);
            System.out.println("The Total cost to be paid is " +n);
        }
        else 
        {
            Student f = new Student();
            int day;
            System.out.println("Enter the current day(time lapsed)");
            day = sc.nextInt();
            int n = f.calculateRenewalTime(day);
            if(n > 0)
            {
                System.out.println("There are " +n +" days for the renewal");
            }
            else
            {
                System.out.println("You're " +(n * -1)+ " days late for the renewal");
            }
            n = f.amountCalculation(day);
            System.out.println("The total cost to be paid is " +n);
        }
    }
}

interface  LibraryMangement {
    public int calculateRenewalTime(int currentDay);
    public int amountCalculation(int currentDay);
}
class Student implements LibraryMangement{
    public int calculateRenewalTime(int currentDay)
    {
        return 14 - currentDay;
    }
    public int amountCalculation(int currentDay)
    {
        if(currentDay > 14)
        {
            return (currentDay - 14) * 15;
        }
        return 0;
    }
}
class Faculty implements LibraryMangement {
    public int calculateRenewalTime(int currentDay)
    {
        return 21 - currentDay;
    }
    public int amountCalculation(int currentDay)
    {
        if(currentDay > 21)
        {
            return (currentDay - 21) * 5;
        }
        return 0;
    }
}
