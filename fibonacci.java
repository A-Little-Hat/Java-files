import java.util.Scanner;
public class fibonacci
{
    public static void main(String[] args) 
    {
        int n, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = sc.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
        sc.close();
    }
}
