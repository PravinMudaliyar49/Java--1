import java.util.Scanner;

public class volumeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = 0;
        if (X > Y) {
            ans = Y - X;
        } else if (Y > X) {
            ans = X - Y;
        }

        System.out.println(ans);
    }
}
