public class copyArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        b= (int[]) a;
        System.out.println(b);
    }
}