public class Five{
	public static void main(String[] args){
		int i , s = 0;
		for(i = 100; i < 200 ; i++){
			if( i % 4 == 0){
				s += i;
			}
		}
		System.out.println("Sum = " + s);
	}
}