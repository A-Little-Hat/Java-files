import java.util.*;

class Number {

  int num;

  void input() {
    System.out.println("Enter a number: ");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    System.out.println("You entered: " + num);
    input.close();
  }

  boolean checkAutomorphic(int n) {
    int sq = n * n;
    boolean flag = true;
    int temp = n;
    while (temp != 0) {
      if (sq % 10 != n % 10) {
        flag = false;
        break;
      }
      temp = temp / 10;
    }
    return flag;
  }

  void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Number obj = new Number();
    char ch;
    Scanner in = new Scanner(System.in);
    do {
      System.out.println("enter your option");
      System.out.println("1. Check Automorphic");
      System.out.println("2. Print Pattern");
      Scanner inputSwitch = new Scanner(System.in);
      int choice = in.nextInt();
      switch (choice) {
        case 1:
          {
            obj.input();
            if (obj.checkAutomorphic(obj.num)) {
              System.out.println("Number is Automorphic");
            } else {
              System.out.println("Number is not Automorphic");
            }
            break;
          }
        case 2:
          {
            obj.input();
            obj.printPattern(obj.num);
            break;
          }
        default:
          {
            System.out.println("Invalid Input");
          }
      }
      System.out.println("press any key to continue...enter 0 to exit...");
      ch = in.next().charAt(0);
    } while (ch != '0');
    in.close();
  
  }
}
