import java.util.*;
class countNum{
    public static void main(String args[]){
        int[] arr = new int[10];
        int[] count = {0,0};
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        n = in.nextInt();
        System.out.println("enter 10 numbers: ");
        for(int i=0;i<10;i++){
            System.out.println("enter the value of a["+i+"]: ");
            arr[i] = in.nextInt();
            if(arr[i]>n){
                count[0]++;
            }else if(arr[i]<n){
                count[1]++;
            }
        }
        System.out.println("greater = "+count[0]+" less = "+count[1]+" equal = "+ (10-(count[1]+count[0])));
    }
}