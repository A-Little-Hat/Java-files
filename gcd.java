import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive numbers");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("GCD of "+m+","+n+" = "+gcd(m,n));
		
	}

	private static int gcd(int m, int n) {
		if(n==0)
			return m;
		return gcd(n, m%n);
	}
}
