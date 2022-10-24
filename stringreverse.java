import java.util.Scanner;

public class stringreverse {
    public static String reverse(String s) {
        String[] words= s.split(" ");
        String rev="";
        for(int i=words.length-1;i>=0;i--){
            rev+=words[i]+" ";
           
        }
        return rev;
    }
    public static void main(String[] args) {
        //take a string input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println("The reversed string is: "+reverse(s));

       
    }
    //write a code to input a string

}
