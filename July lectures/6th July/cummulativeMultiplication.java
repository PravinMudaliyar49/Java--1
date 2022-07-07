import java.util.*;

public class cummulativeMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int multiplication = 1;

        for (int i = num1; i <= num2; i++) {
            multiplication = multiplication * i;
        }

        System.out.println(multiplication);

        sc.close();
    }
}
