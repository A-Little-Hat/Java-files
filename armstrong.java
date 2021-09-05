public class armstrong {
    static void arm(int num){
        int backup = num;
        int sum=0;
        while (num > 0) {
            int digit = num % 10;
            num/=10;
            sum+= (int) Math.pow(digit, 3);
        }
        if(sum==backup){
            System.out.println("armstrong");
        }else{
            System.out.println("not");
        }
    }
    public static void main(String[] args) {
        int num = 153;
        arm(num);
    }
}

