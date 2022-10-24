import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive numbers");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("GCD of "+m+","+n+" = "+gcd_(m,n));

		sc.close();
		
	}

	private static int gcd_(int m, int n) {
		if(n==0)
			return m;
		return gcd_(n, m%n);
	}
}
