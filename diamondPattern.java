public class diamondPattern {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = n-1; i>=1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <=  2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
