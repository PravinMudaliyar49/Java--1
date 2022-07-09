import java.util.*;

public class loopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of inputs you want to provide:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            System.out.println("The last digit of this number is: " + num % 10);
        }
    }
}