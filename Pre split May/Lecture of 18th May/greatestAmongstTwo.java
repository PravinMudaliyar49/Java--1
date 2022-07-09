import java.util.*;

public class greatestAmongstTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = 0;

        if (num1 > num2) {
            ans = num1;
        } else {
            ans = num2;
        }

        System.out.println(ans);
    }
}
