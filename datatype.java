import java.util.*;
class datatype {
  public static void main(String args[]) {
    int n; 
    double d;
    char ch;
    String name;
    String fullName;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number, a decimal number, and a character: ");
    n = input.nextInt();
    d = input.nextDouble();
    ch = input.next().charAt(0);
    name = input.next();
    input.close();
    fullName = input.nextLine();
    System.out.println("The number " + n);
    System.out.println("The decimal number " + d);
    System.out.println("The character " + ch);
    System.out.println("The name " + name);
    System.out.println("The full name " + fullName);
    input.close();
  }
}