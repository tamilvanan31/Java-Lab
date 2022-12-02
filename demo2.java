class test{
    int a;
}
public class demo2{
    public static void main(String...  args){
        test o1 = new test();
        test o2 = new test();
        o1 = o2;
        System.out.print(o1.getClass().getName());
    }
}