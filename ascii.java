public class ascii {
    public static void main(String[] args) {
        int i = 0;
        while (i < 128) {
            System.out.println(i + " " + (char) i);
            i++;
        }
    }
}
