import java.util.*;

public class optimizedSumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        int count = 0;

        for (int i = 1; i <= n; i = i + 2) {
            count++;
            sum = sum + i;
        }

        System.out.println(sum);
        System.out.println("The loop ran for " + count + " times.");
    }
}
