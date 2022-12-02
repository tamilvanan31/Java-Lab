import java.util.Scanner; public class Challenge {
public static void main(String[] args) { double mean, variance;
 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter number of observations:");
int n = sc.nextInt(); 
System.out.print("Enter the Mean: "); 
mean = sc.nextDouble(); 
System.out.print("Enter the Variance: "); 
variance = sc.nextDouble();
double[] observations = new double[n - 2];
System.out.println("Enter the observations:");
for(int i = 0; i < n - 2; i++)
	observations[i] = sc.nextDouble();
double x, y, z; x = n * mean;
for(int i = 0; i < n - 2; i++) 
	x -= observations[i];
y = n * variance;
for(int i = 0; i < n - 2; i++)
	y -= (double)Math.pow(observations[i] - mean, 2);
z = y - (2 * mean * mean) + (2 * mean * x); 
	double a, b, c;
	a = 2;
	b = -2 * x;
	c = (x * x) - z;
double d = (b * b) - (4 * a * c); double r1;
 
if(d >= 0) {
	r1 = (-b - Math.sqrt(d)) / (2 * a); if(r1 >= 0) {
		double r2 = x - r1;
		System.out.println("The two missing observations are " + String.format("%.5f", r1) + " and " +String.format("%.5f", r2));
	}
else {
	System.out.println("The missing observations cannot be found");
	}
	}
sc.close();
}
}
