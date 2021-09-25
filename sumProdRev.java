import java.util.*;
class sumProdRev{
    public static void main(String args[]){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("enter num : ");
        num=in.nextInt();
        int temp=num;
        int sum=0,prod=1,rev=0;
        while(temp>0){
            int a=temp%10;
            sum+=a;
            prod*=a;
            rev=rev*10+a;
            temp/=10;
        }
        System.out.println("num = " + num + " sum = "+ sum + " prod = " + prod + " rev = "+rev);
    }
}