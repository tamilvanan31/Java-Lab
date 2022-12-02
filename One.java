public class One{
    static void  convert(int a){
        Integer c = new Integer(a);
        System.out.print("\nWrapper class Integer " + c);
        
    }
    public static void main(String... args) {
        int a = 10;
        System.out.print("\nPrimitive data type Integer " + a);
        convert(a);
    }
}