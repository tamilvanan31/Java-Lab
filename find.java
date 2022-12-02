/* 
	v1 = x + y;
	v2 = (x - m)^2 + (y - m)^2;
	v3 = x^2 + y^2;
	replacing y = v1 - x;
	2x^2 - 2v1x + (v1^2 - v3) = 0;
	therefore
	a = 2
	b = -2v1
	c = v1^2 - v3
	using the above in solving the quadratic equation by formula:
	root = - b +/- sqrt(b^2 - 4 * a * c) / (2 * a)
*/
import java.util.Scanner;
public class find{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the mean: ");
		double mean = sc.nextDouble();
		System.out.print("\nEnter the variance: ");
		double variance = sc.nextDouble();
		System.out.print("\nEnter the number of observations: ");
		int n = sc.nextInt();
		double[] arr = new double[n - 2];
		for(int i = 0;i < n-2;i++){
			arr[i] = sc.nextDouble();
		}
		double x = n * mean;
		for(int i = 0;i<n-2;i++){
			x -= arr[i];
		}
		double y = n * variance;
		for(int i = 0;i < n-2;i++){
			y -= (double)Math.pow(arr[i] - mean,2);
		}
		double z = y - (2 * mean * mean) + (2 * mean * x);
		double a,b,c;
		a = 2;
		b = -2 * x;
		c = (x * x) - z;
		double d = (b * b) - (4 * a * c);
		double e ;
		if(d >= 0){
			e = (-b - Math.sqrt(d))/ (2 * a);
			if(e >= 0){
				double f = x - e;
				System.out.print("The missing values are " + e + " and " + f);
			}
			else{
				System.out.print("The missing values cannot be found");
			}
		}
	}
}