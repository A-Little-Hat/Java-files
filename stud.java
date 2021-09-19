import java.util.*;
class stud {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter name of the student: ");
    String name = in.nextLine();
    System.out.println("Enter age of the student: ");
    int age = in.nextInt();
    System.out.println("Enter grade of the student: ");
    char grade = in.next().charAt(0);
    System.out.println("enter three numbers of subject: ");
    int[] subject = new int[3];
    for (int i = 0; i < subject.length; i++) {
      subject[i] = in.nextInt();
    }
    float avg = (float) (subject[0] + subject[1] + subject[2]) / 3;  
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Grade: " + grade);
    System.out.println("Average: " + avg);
  }
}