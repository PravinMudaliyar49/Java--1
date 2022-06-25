public class breakStick {
    public static void main(String[] args) {
        int N = 12;
        int X = 9;
        if (N < X) {
            System.out.println("NO");
        } else if (N == X) {
            System.out.println("YES");
        } else if (N % 2 == 0) {
            System.out.println("YES");
        } else if (N % 2 == 1 && X % 2 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
