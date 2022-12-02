
public class P1{
	public static void main(String... args){
		int a = 12;
		int b = 0;	
		try{
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("Zero Division Error handled\n");
		}
		int arr[] = {1, 2, 3, 4, 5};
		try{
			System.out.println(arr[6]);
		}
		catch(Exception e1){
			System.out.println(e1);
			System.out.println("ArrayIndexOutOfBoundsException handled\n");
		}
		String str = "12.23";	
		try {  
             int d = Integer.parseInt(str);  
        }
        catch(Exception e2){  
        	System.out.println(e2);
            System.err.println("NumberFormatException handled\n");  
        }
        try {  
           Integer.class.getMethod("unidentified"); 
        }
        catch(Exception e3){  
        	System.out.println(e3);
            System.out.println("NoSuchMethodError handled\n");  
        }
	}
}