import java.util.*;
public class student {
    String name;
    int number;
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name: ");
        this.name = in.nextLine();
        System.out.println("Enter your number: ");
        this.number = in.nextInt();
        in.close();        
    }
    public void output() {
        System.out.println("Name: " + this.name);
        System.out.println("Number: " + this.number);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        student s = new student();
        s.input();
        s.output();
    }
}
