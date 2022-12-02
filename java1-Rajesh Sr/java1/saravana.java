import java.lang.*;
import java.io.*;

class sum{
		public static void main(String args[])throws IOException{
		int i,n,sum=0;
		DataInputStream ds=newDataInputStream(System.in);
		System.out.println("enter n");
		n=Integer.parseInt(ds.readLine());
		for(i=1;i<=n;i++)
		sum=sum+i;
		System.out.println(sum);
	}
}
