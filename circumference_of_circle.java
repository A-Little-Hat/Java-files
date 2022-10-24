import java.util.Scanner;

class circumference_of_circle {

    public static double PI = 3.1428;

    public static double calculate_circumference_of_circle(double r) {
        return 2 * PI * r;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double r = in .nextDouble();

        System.out.println("Output: Circumference is ");
        System.out.println(calculate_circumference_of_circle(r));
    }
}
