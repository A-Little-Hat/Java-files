import java.util.*;
class prime{
    public static void main(String args[]){
        int num;
        boolean isPrime=true;
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        num=in.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime");
        }else{
            System.out.println("non prime");
        }
    }
}