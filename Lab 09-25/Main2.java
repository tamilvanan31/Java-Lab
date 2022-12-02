abstract class Student{
    Student(){}
    abstract void display();
    void dispalymarks(){
        System.out.println("Abstract method executed");
    }
}
class FullTime extends Student{
    FullTime(){}
    public void display(){
        System.out.println("Concrete Method executed");
    }  
}

public class Main2{
    public static void main(String args[]){
        Student f = new FullTime();//refer the fulltime object and access the abstruct method
        f.display();
        f.dispalymarks();
    }
}