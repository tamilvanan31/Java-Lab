public class challenge{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int n=7;
		int i=1;
		int fact=1;
		for(i=n-1;i>=1;i--){
		    fact=fact*i;
		}
		System.out.println(fact);
		int fact2=1;
		for(i=3;i>=1;i--){
		    fact2=fact2*i;
		}
		System.out.println(fact2);
		System.out.println("The maximum number of 4 digit numbers that can be created are " + 4*(fact/fact2));	
	}
}