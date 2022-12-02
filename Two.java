public class Two{
    public static void main(String... arg){
        int a = 10;
        Integer b = new Integer(11);
        int c = a + b;
        System.out.print("Result after boxing " + c);
        Integer e = new Integer(11);
        int d = e;
        c = a + d;
        System.out.print("\nResult after unboxing " + c);
    }
}