import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("enter ");
        int n=a.nextInt();
        // System.out.println("")
        int i,sum=0,temp;
        temp=n;
        while(n>0){
            i=n%10;
            sum=sum*10+i;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
    }
}