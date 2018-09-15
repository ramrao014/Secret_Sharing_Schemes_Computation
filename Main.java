import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,x=0,y, xc, yc;
		int m,n,c;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 'a'");
		a = in.nextDouble();
		System.out.println("Enter 'b'");
		b=in.nextDouble();
		System.out.println("Enter 'c'");
		c=in.nextInt();
		System.out.println("Enter 'm'");
		m=in.nextInt();
		System.out.println("Enter 'n'");
		n=in.nextInt();
		
		int s = m+n;
		
		double[] vals = new double[100];
		for(int i=0; i<=s; i++) {
			if(i==0) {
				vals[i]=0;
				y=(a*Math.pow(vals[i], 2)) + b*vals[i] + c;
				System.out.println("X("+i+"), Y("+i+") = "+vals[i]+" , "+y);
			}else {
			vals[2*i-1] = i;
			vals[2*i] = -i;
			y=(a*Math.pow(vals[i], 2)) + b*vals[i] + c;
			System.out.println("X("+i+"), Y("+i+") = "+vals[i]+" , "+y);
			}
		}	
	}
}
